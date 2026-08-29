package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d61;
public final class kk implements Utilities.Callback {
    public final int f20793a = 0;
    public final boolean f20794b;
    public final NotificationCenter.NotificationCenterDelegate f20795c;
    public final Object d;
    public final Object f20796e;
    public final Object f20797f;
    public final Object f20798g;

    public kk(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10) {
        this.f20795c = sendMessagesHelper;
        this.d = arrayList;
        this.f20796e = arrayList2;
        this.f20797f = arrayList3;
        this.f20798g = delayedMessage;
        this.f20794b = z10;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.f20793a) {
            case 0:
                ((SendMessagesHelper) this.f20795c).lambda$performSendMessageRequestMulti$64((ArrayList) this.d, (ArrayList) this.f20796e, (ArrayList) this.f20797f, (SendMessagesHelper.DelayedMessage) this.f20798g, this.f20794b, (TLObject) obj);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f20795c;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.d;
                TLRPC.User user = (TLRPC.User) this.f20796e;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f20797f;
                String str = (String) this.f20798g;
                Integer num = (Integer) obj;
                profileActivity.getClass();
                boolean z11 = this.f20794b;
                if (channelParticipant != null) {
                    profileActivity.A4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z11);
                    return;
                } else {
                    profileActivity.A4(num.intValue(), user, chatParticipant, null, null, str, z11);
                    return;
                }
            default:
                d61 d61Var = (d61) this.f20795c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f20796e;
                String str2 = (String) this.f20797f;
                HashMap hashMap = (HashMap) this.f20798g;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) obj;
                int i10 = d61Var.R;
                if (this.f20794b) {
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(5);
                    for (int i11 = 0; i11 < stickerSets.size(); i11++) {
                        if (stickerSets.get(i11).documents != null && (arrayList2 = stickerSets.get(i11).documents) != null) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i12), null);
                                long j10 = arrayList2.get(i12).f22398id;
                                if (findAnimatedEmojiEmoticon != null && !linkedHashSet.contains(Long.valueOf(j10)) && str2.contains(findAnimatedEmojiEmoticon.toLowerCase())) {
                                    linkedHashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i10).getFeaturedEmojiSets();
                    for (int i13 = 0; i13 < featuredEmojiSets.size(); i13++) {
                        if ((featuredEmojiSets.get(i13) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) featuredEmojiSets.get(i13)).keywords != null && (arrayList = ((TLRPC.TL_stickerSetFullCovered) featuredEmojiSets.get(i13)).documents) != null) {
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                String findAnimatedEmojiEmoticon2 = MessageObject.findAnimatedEmojiEmoticon(arrayList.get(i14), null);
                                long j11 = arrayList.get(i14).f22398id;
                                if (findAnimatedEmojiEmoticon2 != null && !linkedHashSet.contains(Long.valueOf(j11)) && str2.contains(findAnimatedEmojiEmoticon2)) {
                                    linkedHashSet.add(Long.valueOf(j11));
                                }
                            }
                        }
                    }
                    runnable.run();
                    return;
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                String[] strArr = d61.W1;
                f1.a aVar = new f1.a(d61Var, linkedHashSet, hashMap, arrayList3, runnable);
                if (d61Var.S == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, aVar, null, true, z10, false, 30);
                return;
        }
    }

    public kk(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.f20795c = profileActivity;
        this.d = channelParticipant;
        this.f20796e = user;
        this.f20797f = chatParticipant;
        this.f20794b = z10;
        this.f20798g = str;
    }

    public kk(d61 d61Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.f20795c = d61Var;
        this.f20794b = z10;
        this.f20796e = linkedHashSet;
        this.f20797f = str;
        this.f20798g = hashMap;
        this.d = arrayList;
    }
}
