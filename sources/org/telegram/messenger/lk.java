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
import org.telegram.ui.c71;
public final class lk implements Utilities.Callback {
    public final int f18514a = 0;
    public final boolean f18515b;
    public final NotificationCenter.NotificationCenterDelegate f18516c;
    public final Object d;
    public final Object f18517e;
    public final Object f18518f;
    public final Object f18519g;

    public lk(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10) {
        this.f18516c = sendMessagesHelper;
        this.d = arrayList;
        this.f18517e = arrayList2;
        this.f18518f = arrayList3;
        this.f18519g = delayedMessage;
        this.f18515b = z10;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.f18514a) {
            case 0:
                ((SendMessagesHelper) this.f18516c).lambda$performSendMessageRequestMulti$64((ArrayList) this.d, (ArrayList) this.f18517e, (ArrayList) this.f18518f, (SendMessagesHelper.DelayedMessage) this.f18519g, this.f18515b, (TLObject) obj);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f18516c;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.d;
                TLRPC.User user = (TLRPC.User) this.f18517e;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f18518f;
                String str = (String) this.f18519g;
                Integer num = (Integer) obj;
                profileActivity.getClass();
                boolean z11 = this.f18515b;
                if (channelParticipant != null) {
                    profileActivity.A4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z11);
                    return;
                } else {
                    profileActivity.A4(num.intValue(), user, chatParticipant, null, null, str, z11);
                    return;
                }
            default:
                c71 c71Var = (c71) this.f18516c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f18517e;
                String str2 = (String) this.f18518f;
                HashMap hashMap = (HashMap) this.f18519g;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) obj;
                int i10 = c71Var.V;
                if (this.f18515b) {
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(5);
                    for (int i11 = 0; i11 < stickerSets.size(); i11++) {
                        if (stickerSets.get(i11).documents != null && (arrayList2 = stickerSets.get(i11).documents) != null) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i12), null);
                                long j3 = arrayList2.get(i12).f20043id;
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
                                long j10 = arrayList.get(i14).f20043id;
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
                String[] strArr = c71.a2;
                ai.g6 g6Var = new ai.g6(c71Var, linkedHashSet, hashMap, arrayList3, runnable);
                if (c71Var.W == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, g6Var, null, true, z10, false, 30);
                return;
        }
    }

    public lk(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.f18516c = profileActivity;
        this.d = channelParticipant;
        this.f18517e = user;
        this.f18518f = chatParticipant;
        this.f18515b = z10;
        this.f18519g = str;
    }

    public lk(c71 c71Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.f18516c = c71Var;
        this.f18515b = z10;
        this.f18517e = linkedHashSet;
        this.f18518f = str;
        this.f18519g = hashMap;
        this.d = arrayList;
    }
}
