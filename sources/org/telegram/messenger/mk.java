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
import org.telegram.ui.r71;
public final class mk implements Utilities.Callback {
    public final int f17896a = 0;
    public final boolean f17897b;
    public final NotificationCenter.NotificationCenterDelegate f17898c;
    public final Object d;
    public final Object e;
    public final Object f17899f;
    public final Object f17900g;

    public mk(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10) {
        this.f17898c = sendMessagesHelper;
        this.d = arrayList;
        this.e = arrayList2;
        this.f17899f = arrayList3;
        this.f17900g = delayedMessage;
        this.f17897b = z10;
    }

    @Override
    public final void run(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.f17896a) {
            case 0:
                ((SendMessagesHelper) this.f17898c).lambda$performSendMessageRequestMulti$67((ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f17899f, (SendMessagesHelper.DelayedMessage) this.f17900g, this.f17897b, (TLObject) obj);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f17898c;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f17899f;
                String str = (String) this.f17900g;
                Integer num = (Integer) obj;
                profileActivity.getClass();
                boolean z10 = this.f17897b;
                if (channelParticipant != null) {
                    profileActivity.A4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z10);
                    return;
                } else {
                    profileActivity.A4(num.intValue(), user, chatParticipant, null, null, str, z10);
                    return;
                }
            default:
                r71 r71Var = (r71) this.f17898c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.e;
                String str2 = (String) this.f17899f;
                HashMap hashMap = (HashMap) this.f17900g;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) obj;
                int i10 = r71Var.V;
                boolean z11 = false;
                if (this.f17897b) {
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(5);
                    for (int i11 = 0; i11 < stickerSets.size(); i11++) {
                        if (stickerSets.get(i11).documents != null && (arrayList2 = stickerSets.get(i11).documents) != null) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i12), null);
                                long j10 = arrayList2.get(i12).f19222id;
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
                                long j11 = arrayList.get(i14).f19222id;
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
                String[] strArr = r71.a2;
                bi.s5 s5Var = new bi.s5(r71Var, linkedHashSet, hashMap, arrayList3, runnable);
                if (r71Var.W == 3) {
                    z11 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, s5Var, null, true, z11, false, 30);
                return;
        }
    }

    public mk(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.f17898c = profileActivity;
        this.d = channelParticipant;
        this.e = user;
        this.f17899f = chatParticipant;
        this.f17897b = z10;
        this.f17900g = str;
    }

    public mk(r71 r71Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.f17898c = r71Var;
        this.f17897b = z10;
        this.e = linkedHashSet;
        this.f17899f = str;
        this.f17900g = hashMap;
        this.d = arrayList;
    }
}
