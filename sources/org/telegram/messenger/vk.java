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
import org.telegram.ui.l71;
public final class vk implements Utilities.Callback {
    public final int f16673a = 0;
    public final boolean f16674b;
    public final NotificationCenter.NotificationCenterDelegate f16675c;
    public final Object d;
    public final Object e;
    public final Object f16676f;
    public final Object f16677g;

    public vk(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10) {
        this.f16675c = sendMessagesHelper;
        this.d = arrayList;
        this.e = arrayList2;
        this.f16676f = arrayList3;
        this.f16677g = delayedMessage;
        this.f16674b = z10;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.f16673a) {
            case 0:
                ((SendMessagesHelper) this.f16675c).lambda$performSendMessageRequestMulti$64((ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f16676f, (SendMessagesHelper.DelayedMessage) this.f16677g, this.f16674b, (TLObject) obj);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f16675c;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f16676f;
                String str = (String) this.f16677g;
                Integer num = (Integer) obj;
                profileActivity.getClass();
                boolean z11 = this.f16674b;
                if (channelParticipant != null) {
                    profileActivity.A4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z11);
                    return;
                } else {
                    profileActivity.A4(num.intValue(), user, chatParticipant, null, null, str, z11);
                    return;
                }
            default:
                l71 l71Var = (l71) this.f16675c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.e;
                String str2 = (String) this.f16676f;
                HashMap hashMap = (HashMap) this.f16677g;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) obj;
                int i10 = l71Var.V;
                if (this.f16674b) {
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(5);
                    for (int i11 = 0; i11 < stickerSets.size(); i11++) {
                        if (stickerSets.get(i11).documents != null && (arrayList2 = stickerSets.get(i11).documents) != null) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i12), null);
                                long j3 = arrayList2.get(i12).f17201id;
                                if (findAnimatedEmojiEmoticon != null && !linkedHashSet.contains(Long.valueOf(j3)) && str2.contains(findAnimatedEmojiEmoticon.toLowerCase())) {
                                    linkedHashSet.add(Long.valueOf(j3));
                                }
                            }
                        }
                    }
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i10).getFeaturedEmojiSets();
                    for (int i13 = 0; i13 < featuredEmojiSets.size(); i13++) {
                        if ((featuredEmojiSets.get(i13) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) featuredEmojiSets.get(i13)).keywords != null && (arrayList = ((TLRPC.TL_stickerSetFullCovered) featuredEmojiSets.get(i13)).documents) != null) {
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                String findAnimatedEmojiEmoticon2 = MessageObject.findAnimatedEmojiEmoticon(arrayList.get(i14), null);
                                long j10 = arrayList.get(i14).f17201id;
                                if (findAnimatedEmojiEmoticon2 != null && !linkedHashSet.contains(Long.valueOf(j10)) && str2.contains(findAnimatedEmojiEmoticon2)) {
                                    linkedHashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                    runnable.run();
                    return;
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                String[] strArr = l71.a2;
                f1.a aVar = new f1.a(l71Var, linkedHashSet, hashMap, arrayList3, runnable);
                if (l71Var.W == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, aVar, null, true, z10, false, 30);
                return;
        }
    }

    public vk(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.f16675c = profileActivity;
        this.d = channelParticipant;
        this.e = user;
        this.f16676f = chatParticipant;
        this.f16674b = z10;
        this.f16677g = str;
    }

    public vk(l71 l71Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.f16675c = l71Var;
        this.f16674b = z10;
        this.e = linkedHashSet;
        this.f16676f = str;
        this.f16677g = hashMap;
        this.d = arrayList;
    }
}
