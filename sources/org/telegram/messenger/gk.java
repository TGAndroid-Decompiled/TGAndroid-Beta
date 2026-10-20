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
import org.telegram.ui.x51;
public final class gk implements Utilities.Callback {
    public final int f18488a = 0;
    public final boolean f18489b;
    public final NotificationCenter.NotificationCenterDelegate f18490c;
    public final Object d;
    public final Object e;
    public final Object f18491f;
    public final Object f18492g;

    public gk(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10) {
        this.f18490c = sendMessagesHelper;
        this.d = arrayList;
        this.e = arrayList2;
        this.f18491f = arrayList3;
        this.f18492g = delayedMessage;
        this.f18489b = z10;
    }

    @Override
    public final void run(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.f18488a) {
            case 0:
                ((SendMessagesHelper) this.f18490c).lambda$performSendMessageRequestMulti$67((ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f18491f, (SendMessagesHelper.DelayedMessage) this.f18492g, this.f18489b, (TLObject) obj);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f18490c;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f18491f;
                String str = (String) this.f18492g;
                Integer num = (Integer) obj;
                profileActivity.getClass();
                boolean z10 = this.f18489b;
                if (channelParticipant != null) {
                    profileActivity.A4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z10);
                    return;
                } else {
                    profileActivity.A4(num.intValue(), user, chatParticipant, null, null, str, z10);
                    return;
                }
            default:
                x51 x51Var = (x51) this.f18490c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.e;
                String str2 = (String) this.f18491f;
                HashMap hashMap = (HashMap) this.f18492g;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) obj;
                int i10 = x51Var.V;
                boolean z11 = false;
                if (this.f18489b) {
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(5);
                    for (int i11 = 0; i11 < stickerSets.size(); i11++) {
                        if (stickerSets.get(i11).documents != null && (arrayList2 = stickerSets.get(i11).documents) != null) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i12), null);
                                long j10 = arrayList2.get(i12).f20282id;
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
                                long j11 = arrayList.get(i14).f20282id;
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
                String[] strArr = x51.a2;
                ai.t7 t7Var = new ai.t7(x51Var, linkedHashSet, hashMap, arrayList3, runnable);
                if (x51Var.W == 3) {
                    z11 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, t7Var, null, true, z11, false, 30);
                return;
        }
    }

    public gk(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.f18490c = profileActivity;
        this.d = channelParticipant;
        this.e = user;
        this.f18491f = chatParticipant;
        this.f18489b = z10;
        this.f18492g = str;
    }

    public gk(x51 x51Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.f18490c = x51Var;
        this.f18489b = z10;
        this.e = linkedHashSet;
        this.f18491f = str;
        this.f18492g = hashMap;
        this.d = arrayList;
    }
}
