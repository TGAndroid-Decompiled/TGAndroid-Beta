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
import org.telegram.ui.w61;
public final class ok implements Utilities.Callback {
    public final int f19605a = 0;
    public final boolean f19606b;
    public final NotificationCenter.NotificationCenterDelegate f19607c;
    public final Object d;
    public final Object f19608e;
    public final Object f19609f;
    public final Object f19610g;

    public ok(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4) {
        this.f19607c = sendMessagesHelper;
        this.d = arrayList;
        this.f19608e = arrayList2;
        this.f19609f = arrayList3;
        this.f19610g = delayedMessage;
        this.f19606b = z4;
    }

    @Override
    public final void run(Object obj) {
        boolean z4;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.f19605a) {
            case 0:
                ((SendMessagesHelper) this.f19607c).lambda$performSendMessageRequestMulti$64((ArrayList) this.d, (ArrayList) this.f19608e, (ArrayList) this.f19609f, (SendMessagesHelper.DelayedMessage) this.f19610g, this.f19606b, (TLObject) obj);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f19607c;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.d;
                TLRPC.User user = (TLRPC.User) this.f19608e;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f19609f;
                String str = (String) this.f19610g;
                Integer num = (Integer) obj;
                profileActivity.getClass();
                boolean z10 = this.f19606b;
                if (channelParticipant != null) {
                    profileActivity.A4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z10);
                    return;
                } else {
                    profileActivity.A4(num.intValue(), user, chatParticipant, null, null, str, z10);
                    return;
                }
            default:
                w61 w61Var = (w61) this.f19607c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f19608e;
                String str2 = (String) this.f19609f;
                HashMap hashMap = (HashMap) this.f19610g;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) obj;
                int i10 = w61Var.S;
                if (this.f19606b) {
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(5);
                    for (int i11 = 0; i11 < stickerSets.size(); i11++) {
                        if (stickerSets.get(i11).documents != null && (arrayList2 = stickerSets.get(i11).documents) != null) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i12), null);
                                long j10 = arrayList2.get(i12).f20851id;
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
                                long j11 = arrayList.get(i14).f20851id;
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
                String[] strArr = w61.X1;
                f1.a aVar = new f1.a(w61Var, linkedHashSet, hashMap, arrayList3, runnable);
                if (w61Var.T == 3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, aVar, null, true, z4, false, 30);
                return;
        }
    }

    public ok(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z4, String str) {
        this.f19607c = profileActivity;
        this.d = channelParticipant;
        this.f19608e = user;
        this.f19609f = chatParticipant;
        this.f19606b = z4;
        this.f19610g = str;
    }

    public ok(w61 w61Var, boolean z4, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.f19607c = w61Var;
        this.f19606b = z4;
        this.f19608e = linkedHashSet;
        this.f19609f = str;
        this.f19610g = hashMap;
        this.d = arrayList;
    }
}
