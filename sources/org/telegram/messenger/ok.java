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
import org.telegram.ui.q61;
public final class ok implements Utilities.Callback {
    public final int f18056a = 0;
    public final boolean f18057b;
    public final NotificationCenter.NotificationCenterDelegate f18058c;
    public final Object d;
    public final Object e;
    public final Object f18059f;
    public final Object f18060g;

    public ok(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4) {
        this.f18058c = sendMessagesHelper;
        this.d = arrayList;
        this.e = arrayList2;
        this.f18059f = arrayList3;
        this.f18060g = delayedMessage;
        this.f18057b = z4;
    }

    @Override
    public final void run(Object obj) {
        boolean z4;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.f18056a) {
            case 0:
                ((SendMessagesHelper) this.f18058c).lambda$performSendMessageRequestMulti$64((ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f18059f, (SendMessagesHelper.DelayedMessage) this.f18060g, this.f18057b, (TLObject) obj);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f18058c;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f18059f;
                String str = (String) this.f18060g;
                Integer num = (Integer) obj;
                profileActivity.getClass();
                boolean z10 = this.f18057b;
                if (channelParticipant != null) {
                    profileActivity.A4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z10);
                    return;
                } else {
                    profileActivity.A4(num.intValue(), user, chatParticipant, null, null, str, z10);
                    return;
                }
            default:
                q61 q61Var = (q61) this.f18058c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.e;
                String str2 = (String) this.f18059f;
                HashMap hashMap = (HashMap) this.f18060g;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) obj;
                int i10 = q61Var.S;
                if (this.f18057b) {
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(5);
                    for (int i11 = 0; i11 < stickerSets.size(); i11++) {
                        if (stickerSets.get(i11).documents != null && (arrayList2 = stickerSets.get(i11).documents) != null) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i12), null);
                                long j10 = arrayList2.get(i12).f19190id;
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
                                long j11 = arrayList.get(i14).f19190id;
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
                String[] strArr = q61.X1;
                f1.a aVar = new f1.a(q61Var, linkedHashSet, hashMap, arrayList3, runnable);
                if (q61Var.T == 3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, aVar, null, true, z4, false, 30);
                return;
        }
    }

    public ok(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z4, String str) {
        this.f18058c = profileActivity;
        this.d = channelParticipant;
        this.e = user;
        this.f18059f = chatParticipant;
        this.f18057b = z4;
        this.f18060g = str;
    }

    public ok(q61 q61Var, boolean z4, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.f18058c = q61Var;
        this.f18057b = z4;
        this.e = linkedHashSet;
        this.f18059f = str;
        this.f18060g = hashMap;
        this.d = arrayList;
    }
}
