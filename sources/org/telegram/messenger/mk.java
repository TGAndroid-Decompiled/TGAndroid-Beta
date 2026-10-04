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
public final class mk implements Utilities.Callback {
    public final int f18604a = 0;
    public final boolean f18605b;
    public final NotificationCenter.NotificationCenterDelegate f18606c;
    public final Object d;
    public final Object f18607e;
    public final Object f18608f;
    public final Object f18609g;

    public mk(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10) {
        this.f18606c = sendMessagesHelper;
        this.d = arrayList;
        this.f18607e = arrayList2;
        this.f18608f = arrayList3;
        this.f18609g = delayedMessage;
        this.f18605b = z10;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.f18604a) {
            case 0:
                ((SendMessagesHelper) this.f18606c).lambda$performSendMessageRequestMulti$64((ArrayList) this.d, (ArrayList) this.f18607e, (ArrayList) this.f18608f, (SendMessagesHelper.DelayedMessage) this.f18609g, this.f18605b, (TLObject) obj);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f18606c;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.d;
                TLRPC.User user = (TLRPC.User) this.f18607e;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f18608f;
                String str = (String) this.f18609g;
                Integer num = (Integer) obj;
                profileActivity.getClass();
                boolean z11 = this.f18605b;
                if (channelParticipant != null) {
                    profileActivity.A4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z11);
                    return;
                } else {
                    profileActivity.A4(num.intValue(), user, chatParticipant, null, null, str, z11);
                    return;
                }
            default:
                c71 c71Var = (c71) this.f18606c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f18607e;
                String str2 = (String) this.f18608f;
                HashMap hashMap = (HashMap) this.f18609g;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) obj;
                int i10 = c71Var.V;
                if (this.f18605b) {
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(5);
                    for (int i11 = 0; i11 < stickerSets.size(); i11++) {
                        if (stickerSets.get(i11).documents != null && (arrayList2 = stickerSets.get(i11).documents) != null) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i12), null);
                                long j3 = arrayList2.get(i12).f20048id;
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
                                long j10 = arrayList.get(i14).f20048id;
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

    public mk(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.f18606c = profileActivity;
        this.d = channelParticipant;
        this.f18607e = user;
        this.f18608f = chatParticipant;
        this.f18605b = z10;
        this.f18609g = str;
    }

    public mk(c71 c71Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.f18606c = c71Var;
        this.f18605b = z10;
        this.f18607e = linkedHashSet;
        this.f18608f = str;
        this.f18609g = hashMap;
        this.d = arrayList;
    }
}
