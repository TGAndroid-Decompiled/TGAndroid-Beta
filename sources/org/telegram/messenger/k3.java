package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
public final class k3 {
    public final org.telegram.ui.bn f25001a;
    public final ArrayList f25002b = new ArrayList(10);
    public final ArrayList f25003c = new ArrayList(10);
    public final ArrayList d = new ArrayList(10);
    public final ArrayList f25004e = new ArrayList();
    public final ArrayList f25005f = new ArrayList();

    public k3(org.telegram.ui.bn bnVar) {
        this.f25001a = bnVar;
    }

    public final void a(org.telegram.ui.kl klVar, int i7, int i10, long j3) {
        TL_stories.StoryItem storyItem;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia;
        final k3 k3Var = this;
        ArrayList L = klVar.L();
        org.telegram.ui.bn bnVar = k3Var.f25001a;
        if (!bnVar.c() && i7 >= 0 && i10 >= 0) {
            int i11 = klVar.K;
            int i12 = (i10 - i11) - 10;
            int i13 = (i7 - i11) + 10;
            if (i12 < 0) {
                i12 = 0;
            }
            if (i13 > L.size()) {
                i13 = L.size();
            }
            ArrayList arrayList = k3Var.f25002b;
            arrayList.clear();
            ArrayList arrayList2 = k3Var.f25003c;
            arrayList2.clear();
            ArrayList arrayList3 = k3Var.d;
            arrayList3.clear();
            while (i12 < i13) {
                gj gjVar = (gj) L.get(i12);
                if (bnVar.f46114m4 != gjVar && gjVar.e1() > 0 && ((gjVar.f24213k.action == null || gjVar.z()) && j3 - gjVar.E > 15000)) {
                    gjVar.E = j3;
                    arrayList.add(gjVar);
                }
                if (bnVar.f46114m4 != gjVar && gjVar.e1() > 0 && ((gjVar.q2() || ((messageMedia = gjVar.f24213k.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty() && (gjVar.f24213k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview))) && j3 - gjVar.F > 30000)) {
                    gjVar.F = j3;
                    arrayList2.add(gjVar);
                }
                int i14 = gjVar.D;
                if (i14 == 23 || i14 == 24 || gjVar.f24213k.replyStory != null) {
                    if (i14 != 23 && i14 != 24) {
                        storyItem2 = gjVar.f24213k.replyStory;
                    } else {
                        storyItem2 = gjVar.f24213k.media.storyItem;
                    }
                    if (storyItem2 != null && !(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && j3 - storyItem2.lastUpdateTime > 300000) {
                        storyItem2.lastUpdateTime = j3;
                        arrayList3.add(gjVar);
                    }
                }
                i12++;
            }
            long a10 = bnVar.a();
            if (!arrayList.isEmpty()) {
                TLRPC.TL_messages_getMessagesReactions tL_messages_getMessagesReactions = new TLRPC.TL_messages_getMessagesReactions();
                tL_messages_getMessagesReactions.peer = bnVar.getMessagesController().l1(a10);
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    tL_messages_getMessagesReactions.f28531id.add(Integer.valueOf(((gj) arrayList.get(i15)).e1()));
                }
                Integer valueOf = Integer.valueOf(bnVar.getConnectionsManager().sendRequest(tL_messages_getMessagesReactions, new RequestDelegate(k3Var) {
                    public final k3 f24584b;

                    {
                        this.f24584b = k3Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                k3 k3Var2 = this.f24584b;
                                if (tL_error == null) {
                                    k3Var2.f25001a.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    k3Var2.getClass();
                                    return;
                                }
                            default:
                                k3 k3Var3 = this.f24584b;
                                k3Var3.getClass();
                                if (tL_error == null) {
                                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                    for (int i16 = 0; i16 < updates.updates.size(); i16++) {
                                        if (updates.updates.get(i16) instanceof TL_update.TL_updateMessageReactions) {
                                            ((TL_update.TL_updateMessageReactions) updates.updates.get(i16)).updateUnreadState = false;
                                        }
                                    }
                                    k3Var3.f25001a.getMessagesController().V3(updates, false);
                                    return;
                                }
                                return;
                        }
                    }
                }));
                ArrayList arrayList4 = k3Var.f25004e;
                arrayList4.add(valueOf);
                if (arrayList4.size() > 5) {
                    bnVar.getConnectionsManager().cancelRequest(((Integer) arrayList4.remove(0)).intValue(), true);
                }
            }
            long a11 = bnVar.a();
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList5 = k3Var.f25005f;
            if (!isEmpty) {
                TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                tL_messages_getExtendedMedia.peer = bnVar.getMessagesController().l1(a11);
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    tL_messages_getExtendedMedia.f28525id.add(Integer.valueOf(((gj) arrayList2.get(i16)).e1()));
                }
                arrayList5.add(Integer.valueOf(bnVar.getConnectionsManager().sendRequest(tL_messages_getExtendedMedia, new RequestDelegate(k3Var) {
                    public final k3 f24584b;

                    {
                        this.f24584b = k3Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                k3 k3Var2 = this.f24584b;
                                if (tL_error == null) {
                                    k3Var2.f25001a.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    k3Var2.getClass();
                                    return;
                                }
                            default:
                                k3 k3Var3 = this.f24584b;
                                k3Var3.getClass();
                                if (tL_error == null) {
                                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                    for (int i162 = 0; i162 < updates.updates.size(); i162++) {
                                        if (updates.updates.get(i162) instanceof TL_update.TL_updateMessageReactions) {
                                            ((TL_update.TL_updateMessageReactions) updates.updates.get(i162)).updateUnreadState = false;
                                        }
                                    }
                                    k3Var3.f25001a.getMessagesController().V3(updates, false);
                                    return;
                                }
                                return;
                        }
                    }
                })));
                if (arrayList5.size() > 10) {
                    bnVar.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
                }
            }
            if (!arrayList3.isEmpty()) {
                int i17 = 0;
                while (i17 < arrayList3.size()) {
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    gj gjVar2 = (gj) arrayList3.get(i17);
                    new TL_stories.TL_storyItem();
                    int i18 = gjVar2.D;
                    if (i18 != 23 && i18 != 24) {
                        TLRPC.Message message = gjVar2.f24213k;
                        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                        if (messageReplyHeader != null) {
                            storyItem = message.replyStory;
                            storyItem.dialogId = n5.o(messageReplyHeader.peer);
                        } else {
                            i17++;
                            k3Var = this;
                        }
                    } else {
                        TLRPC.MessageMedia messageMedia2 = gjVar2.f24213k.media;
                        TL_stories.StoryItem storyItem3 = messageMedia2.storyItem;
                        storyItem3.dialogId = messageMedia2.user_id;
                        storyItem = storyItem3;
                    }
                    long j10 = storyItem.dialogId;
                    tL_stories_getStoriesByID.peer = bnVar.getMessagesController().l1(j10);
                    tL_stories_getStoriesByID.f28680id.add(Integer.valueOf(storyItem.f28673id));
                    arrayList5.add(Integer.valueOf(bnVar.getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new j3(storyItem.f28673id, 0, j10, k3Var, gjVar2))));
                    i17++;
                    k3Var = this;
                }
                if (arrayList5.size() > 10) {
                    bnVar.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
                }
            }
        }
    }
}
