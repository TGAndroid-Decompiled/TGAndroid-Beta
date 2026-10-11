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
import org.telegram.ui.j71;
public final class jk implements Utilities.Callback {
    public final int f18295a = 0;
    public final boolean f18296b;
    public final NotificationCenter.NotificationCenterDelegate f18297c;
    public final Object d;
    public final Object f18298e;
    public final Object f18299f;
    public final Object f18300g;

    public jk(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10) {
        this.f18297c = sendMessagesHelper;
        this.d = arrayList;
        this.f18298e = arrayList2;
        this.f18299f = arrayList3;
        this.f18300g = delayedMessage;
        this.f18296b = z10;
    }

    @Override
    public final void run(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.f18295a) {
            case 0:
                ((SendMessagesHelper) this.f18297c).lambda$performSendMessageRequestMulti$67((ArrayList) this.d, (ArrayList) this.f18298e, (ArrayList) this.f18299f, (SendMessagesHelper.DelayedMessage) this.f18300g, this.f18296b, (TLObject) obj);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f18297c;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.d;
                TLRPC.User user = (TLRPC.User) this.f18298e;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f18299f;
                String str = (String) this.f18300g;
                Integer num = (Integer) obj;
                profileActivity.getClass();
                boolean z10 = this.f18296b;
                if (channelParticipant != null) {
                    profileActivity.A4(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z10);
                    return;
                } else {
                    profileActivity.A4(num.intValue(), user, chatParticipant, null, null, str, z10);
                    return;
                }
            default:
                j71 j71Var = (j71) this.f18297c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f18298e;
                String str2 = (String) this.f18299f;
                HashMap hashMap = (HashMap) this.f18300g;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) obj;
                int i10 = j71Var.V;
                boolean z11 = false;
                if (this.f18296b) {
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(5);
                    for (int i11 = 0; i11 < stickerSets.size(); i11++) {
                        if (stickerSets.get(i11).documents != null && (arrayList2 = stickerSets.get(i11).documents) != null) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i12), null);
                                long j3 = arrayList2.get(i12).f20038id;
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
                                long j10 = arrayList.get(i14).f20038id;
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
                String[] strArr = j71.a2;
                ai.h6 h6Var = new ai.h6(j71Var, linkedHashSet, hashMap, arrayList3, runnable);
                if (j71Var.W == 3) {
                    z11 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, h6Var, null, true, z11, false, 30);
                return;
        }
    }

    public jk(ProfileActivity profileActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z10, String str) {
        this.f18297c = profileActivity;
        this.d = channelParticipant;
        this.f18298e = user;
        this.f18299f = chatParticipant;
        this.f18296b = z10;
        this.f18300g = str;
    }

    public jk(j71 j71Var, boolean z10, LinkedHashSet linkedHashSet, String str, HashMap hashMap, ArrayList arrayList) {
        this.f18297c = j71Var;
        this.f18296b = z10;
        this.f18298e = linkedHashSet;
        this.f18299f = str;
        this.f18300g = hashMap;
        this.d = arrayList;
    }
}
