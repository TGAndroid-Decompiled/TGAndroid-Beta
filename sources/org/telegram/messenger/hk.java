package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a61;

public final class hk implements Utilities.Callback {

    public final int f20522a = 0;

    public final boolean f20523b;

    public final NotificationCenter.NotificationCenterDelegate f20524c;
    public final Object d;

    public final Object f20525e;

    public final Object f20526f;

    public final Object f20527g;

    public hk(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10) {
        this.f20524c = sendMessagesHelper;
        this.d = arrayList;
        this.f20525e = arrayList2;
        this.f20526f = arrayList3;
        this.f20527g = delayedMessage;
        this.f20523b = z10;
    }

    @Override
    public final void run(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.f20522a) {
            case 0:
                ((SendMessagesHelper) this.f20524c).lambda$performSendMessageRequestMulti$64((ArrayList) this.d, (ArrayList) this.f20525e, (ArrayList) this.f20526f, (SendMessagesHelper.DelayedMessage) this.f20527g, this.f20523b, (TLObject) obj);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f20524c;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.d;
                TLRPC.User user = (TLRPC.User) this.f20525e;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f20526f;
                String str = (String) this.f20527g;
                Integer num = (Integer) obj;
                profileActivity.getClass();
                boolean z10 = this.f20523b;
                if (channelParticipant != null) {
                    profileActivity.A4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z10);
                } else {
                    profileActivity.A4(num.intValue(), user, chatParticipant, null, null, str, z10);
                }
                break;
            default:
                a61 a61Var = (a61) this.f20524c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f20525e;
                String str2 = (String) this.f20526f;
                HashMap map = (HashMap) this.f20527g;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) obj;
                int i10 = a61Var.R;
                if (this.f20523b) {
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(5);
                    for (int i11 = 0; i11 < stickerSets.size(); i11++) {
                        if (stickerSets.get(i11).documents != null && (arrayList2 = stickerSets.get(i11).documents) != null) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i12), null);
                                long j10 = arrayList2.get(i12).f22386id;
                                if (strFindAnimatedEmojiEmoticon != null && !linkedHashSet.contains(Long.valueOf(j10)) && str2.contains(strFindAnimatedEmojiEmoticon.toLowerCase())) {
                                    linkedHashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i10).getFeaturedEmojiSets();
                    for (int i13 = 0; i13 < featuredEmojiSets.size(); i13++) {
                        if ((featuredEmojiSets.get(i13) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) featuredEmojiSets.get(i13)).keywords != null && (arrayList = ((TLRPC.TL_stickerSetFullCovered) featuredEmojiSets.get(i13)).documents) != null) {
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                String strFindAnimatedEmojiEmoticon2 = MessageObject.findAnimatedEmojiEmoticon(arrayList.get(i14), null);
                                long j11 = arrayList.get(i14).f22386id;
                                if (strFindAnimatedEmojiEmoticon2 != null && !linkedHashSet.contains(Long.valueOf(j11)) && str2.contains(strFindAnimatedEmojiEmoticon2)) {
                                    linkedHashSet.add(Long.valueOf(j11));
                                }
                            }
                        }
                    }
                    runnable.run();
                } else {
                    MediaDataController.getInstance(i10).getEmojiSuggestions(a61.W1, str2, false, new f1.a(a61Var, linkedHashSet, map, arrayList3, runnable), null, true, a61Var.S == 3, false, 30);
                }
                break;
        }
    }

    public hk(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.f20524c = profileActivity;
        this.d = channelParticipant;
        this.f20525e = user;
        this.f20526f = chatParticipant;
        this.f20523b = z10;
        this.f20527g = str;
    }

    public hk(a61 a61Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap map, ArrayList arrayList) {
        this.f20524c = a61Var;
        this.f20523b = z10;
        this.f20525e = linkedHashSet;
        this.f20526f = str;
        this.f20527g = map;
        this.d = arrayList;
    }
}
