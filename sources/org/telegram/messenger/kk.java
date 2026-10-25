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
import org.telegram.ui.c61;
public final class kk implements Utilities.Callback {
    public final int f20539a = 0;
    public final boolean f20540b;
    public final NotificationCenter.NotificationCenterDelegate f20541c;
    public final Object d;
    public final Object e;
    public final Object f20542f;
    public final Object f20543g;

    public kk(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10) {
        this.f20541c = sendMessagesHelper;
        this.d = arrayList;
        this.e = arrayList2;
        this.f20542f = arrayList3;
        this.f20543g = delayedMessage;
        this.f20540b = z10;
    }

    @Override
    public final void run(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        int i10 = this.f20539a;
        Object obj2 = this.d;
        Object obj3 = this.f20543g;
        Object obj4 = this.f20542f;
        Object obj5 = this.e;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f20541c;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) notificationCenterDelegate).lambda$performSendMessageRequestMulti$67((ArrayList) obj2, (ArrayList) obj5, (ArrayList) obj4, (SendMessagesHelper.DelayedMessage) obj3, this.f20540b, (TLObject) obj);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) notificationCenterDelegate;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj2;
                TLRPC.User user = (TLRPC.User) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj4;
                String str = (String) obj3;
                Integer num = (Integer) obj;
                int i11 = ProfileActivity.R6;
                profileActivity.getClass();
                boolean z10 = this.f20540b;
                if (channelParticipant != null) {
                    profileActivity.I4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z10);
                    return;
                } else {
                    profileActivity.I4(num.intValue(), user, chatParticipant, null, null, str, z10);
                    return;
                }
            default:
                c61 c61Var = (c61) notificationCenterDelegate;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj5;
                String str2 = (String) obj4;
                HashMap hashMap = (HashMap) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                int i12 = c61Var.V;
                boolean z11 = false;
                if (this.f20540b) {
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                    for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                        if (stickerSets.get(i13).documents != null && (arrayList2 = stickerSets.get(i13).documents) != null) {
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i14), null);
                                long j10 = arrayList2.get(i14).f22033id;
                                if (findAnimatedEmojiEmoticon != null && !linkedHashSet.contains(Long.valueOf(j10)) && str2.contains(findAnimatedEmojiEmoticon.toLowerCase())) {
                                    linkedHashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                    for (int i15 = 0; i15 < featuredEmojiSets.size(); i15++) {
                        if ((featuredEmojiSets.get(i15) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) featuredEmojiSets.get(i15)).keywords != null && (arrayList = ((TLRPC.TL_stickerSetFullCovered) featuredEmojiSets.get(i15)).documents) != null) {
                            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                String findAnimatedEmojiEmoticon2 = MessageObject.findAnimatedEmojiEmoticon(arrayList.get(i16), null);
                                long j11 = arrayList.get(i16).f22033id;
                                if (findAnimatedEmojiEmoticon2 != null && !linkedHashSet.contains(Long.valueOf(j11)) && str2.contains(findAnimatedEmojiEmoticon2)) {
                                    linkedHashSet.add(Long.valueOf(j11));
                                }
                            }
                        }
                    }
                    runnable.run();
                    return;
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                String[] strArr = c61.f38275b2;
                bi.p7 p7Var = new bi.p7(c61Var, linkedHashSet, hashMap, arrayList3, runnable);
                if (c61Var.W == 3) {
                    z11 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, p7Var, null, true, z11, false, 30);
                return;
        }
    }

    public kk(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.f20541c = profileActivity;
        this.d = channelParticipant;
        this.e = user;
        this.f20542f = chatParticipant;
        this.f20540b = z10;
        this.f20543g = str;
    }

    public kk(c61 c61Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.f20541c = c61Var;
        this.f20540b = z10;
        this.e = linkedHashSet;
        this.f20542f = str;
        this.f20543g = hashMap;
        this.d = arrayList;
    }
}
