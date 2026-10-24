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
import org.telegram.ui.a61;
public final class ik implements Utilities.Callback {
    public final int f18697a = 0;
    public final boolean f18698b;
    public final NotificationCenter.NotificationCenterDelegate f18699c;
    public final Object d;
    public final Object e;
    public final Object f18700f;
    public final Object f18701g;

    public ik(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10) {
        this.f18699c = sendMessagesHelper;
        this.d = arrayList;
        this.e = arrayList2;
        this.f18700f = arrayList3;
        this.f18701g = delayedMessage;
        this.f18698b = z10;
    }

    @Override
    public final void run(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.f18697a) {
            case 0:
                ((SendMessagesHelper) this.f18699c).lambda$performSendMessageRequestMulti$67((ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f18700f, (SendMessagesHelper.DelayedMessage) this.f18701g, this.f18698b, (TLObject) obj);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f18699c;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f18700f;
                String str = (String) this.f18701g;
                Integer num = (Integer) obj;
                profileActivity.getClass();
                boolean z10 = this.f18698b;
                if (channelParticipant != null) {
                    profileActivity.C4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z10);
                    return;
                } else {
                    profileActivity.C4(num.intValue(), user, chatParticipant, null, null, str, z10);
                    return;
                }
            default:
                a61 a61Var = (a61) this.f18699c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.e;
                String str2 = (String) this.f18700f;
                HashMap hashMap = (HashMap) this.f18701g;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) obj;
                int i10 = a61Var.V;
                boolean z11 = false;
                if (this.f18698b) {
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(5);
                    for (int i11 = 0; i11 < stickerSets.size(); i11++) {
                        if (stickerSets.get(i11).documents != null && (arrayList2 = stickerSets.get(i11).documents) != null) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i12), null);
                                long j10 = arrayList2.get(i12).f20350id;
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
                                long j11 = arrayList.get(i14).f20350id;
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
                String[] strArr = a61.f35601b2;
                ai.t7 t7Var = new ai.t7(a61Var, linkedHashSet, hashMap, arrayList3, runnable);
                if (a61Var.W == 3) {
                    z11 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, t7Var, null, true, z11, false, 30);
                return;
        }
    }

    public ik(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.f18699c = profileActivity;
        this.d = channelParticipant;
        this.e = user;
        this.f18700f = chatParticipant;
        this.f18698b = z10;
        this.f18701g = str;
    }

    public ik(a61 a61Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.f18699c = a61Var;
        this.f18698b = z10;
        this.e = linkedHashSet;
        this.f18700f = str;
        this.f18701g = hashMap;
        this.d = arrayList;
    }
}
