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
import org.telegram.ui.b61;
public final class dk implements Utilities.Callback {
    public final int f20125a = 0;
    public final boolean f20126b;
    public final NotificationCenter.NotificationCenterDelegate f20127c;
    public final Object d;
    public final Object f20128e;
    public final Object f20129f;
    public final Object f20130g;

    public dk(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10) {
        this.f20127c = sendMessagesHelper;
        this.d = arrayList;
        this.f20128e = arrayList2;
        this.f20129f = arrayList3;
        this.f20130g = delayedMessage;
        this.f20126b = z10;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.f20125a) {
            case 0:
                ((SendMessagesHelper) this.f20127c).lambda$performSendMessageRequestMulti$64((ArrayList) this.d, (ArrayList) this.f20128e, (ArrayList) this.f20129f, (SendMessagesHelper.DelayedMessage) this.f20130g, this.f20126b, (TLObject) obj);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f20127c;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.d;
                TLRPC.User user = (TLRPC.User) this.f20128e;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f20129f;
                String str = (String) this.f20130g;
                Integer num = (Integer) obj;
                profileActivity.getClass();
                boolean z11 = this.f20126b;
                if (channelParticipant != null) {
                    profileActivity.A4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z11);
                    return;
                } else {
                    profileActivity.A4(num.intValue(), user, chatParticipant, null, null, str, z11);
                    return;
                }
            default:
                b61 b61Var = (b61) this.f20127c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f20128e;
                String str2 = (String) this.f20129f;
                HashMap hashMap = (HashMap) this.f20130g;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) obj;
                int i9 = b61Var.R;
                if (this.f20126b) {
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i9).getStickerSets(5);
                    for (int i10 = 0; i10 < stickerSets.size(); i10++) {
                        if (stickerSets.get(i10).documents != null && (arrayList2 = stickerSets.get(i10).documents) != null) {
                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i11), null);
                                long j10 = arrayList2.get(i11).f22386id;
                                if (findAnimatedEmojiEmoticon != null && !linkedHashSet.contains(Long.valueOf(j10)) && str2.contains(findAnimatedEmojiEmoticon.toLowerCase())) {
                                    linkedHashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i9).getFeaturedEmojiSets();
                    for (int i12 = 0; i12 < featuredEmojiSets.size(); i12++) {
                        if ((featuredEmojiSets.get(i12) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) featuredEmojiSets.get(i12)).keywords != null && (arrayList = ((TLRPC.TL_stickerSetFullCovered) featuredEmojiSets.get(i12)).documents) != null) {
                            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                String findAnimatedEmojiEmoticon2 = MessageObject.findAnimatedEmojiEmoticon(arrayList.get(i13), null);
                                long j11 = arrayList.get(i13).f22386id;
                                if (findAnimatedEmojiEmoticon2 != null && !linkedHashSet.contains(Long.valueOf(j11)) && str2.contains(findAnimatedEmojiEmoticon2)) {
                                    linkedHashSet.add(Long.valueOf(j11));
                                }
                            }
                        }
                    }
                    runnable.run();
                    return;
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(i9);
                String[] strArr = b61.W1;
                f1.a aVar = new f1.a(b61Var, linkedHashSet, hashMap, arrayList3, runnable);
                if (b61Var.S == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, aVar, null, true, z10, false, 30);
                return;
        }
    }

    public dk(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.f20127c = profileActivity;
        this.d = channelParticipant;
        this.f20128e = user;
        this.f20129f = chatParticipant;
        this.f20126b = z10;
        this.f20130g = str;
    }

    public dk(b61 b61Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.f20127c = b61Var;
        this.f20126b = z10;
        this.f20128e = linkedHashSet;
        this.f20129f = str;
        this.f20130g = hashMap;
        this.d = arrayList;
    }
}
