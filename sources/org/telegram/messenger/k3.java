package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
public final class k3 {
    public final org.telegram.ui.bn f24971a;
    public final ArrayList f24972b = new ArrayList(10);
    public final ArrayList f24973c = new ArrayList(10);
    public final ArrayList d = new ArrayList(10);
    public final ArrayList f24974e = new ArrayList();
    public final ArrayList f24975f = new ArrayList();

    public k3(org.telegram.ui.bn bnVar) {
        this.f24971a = bnVar;
    }

    public final void a(org.telegram.ui.kl klVar, int i7, int i10, long j3) {
        TL_stories.StoryItem storyItem;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia;
        final k3 k3Var = this;
        ArrayList L = klVar.L();
        org.telegram.ui.bn bnVar = k3Var.f24971a;
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
            ArrayList arrayList = k3Var.f24972b;
            arrayList.clear();
            ArrayList arrayList2 = k3Var.f24973c;
            arrayList2.clear();
            ArrayList arrayList3 = k3Var.d;
            arrayList3.clear();
            while (i12 < i13) {
                fj fjVar = (fj) L.get(i12);
                if (bnVar.f46087m4 != fjVar && fjVar.e1() > 0 && ((fjVar.f23965k.action == null || fjVar.z()) && j3 - fjVar.E > 15000)) {
                    fjVar.E = j3;
                    arrayList.add(fjVar);
                }
                if (bnVar.f46087m4 != fjVar && fjVar.e1() > 0 && ((fjVar.q2() || ((messageMedia = fjVar.f23965k.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty() && (fjVar.f23965k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview))) && j3 - fjVar.F > 30000)) {
                    fjVar.F = j3;
                    arrayList2.add(fjVar);
                }
                int i14 = fjVar.D;
                if (i14 == 23 || i14 == 24 || fjVar.f23965k.replyStory != null) {
                    if (i14 != 23 && i14 != 24) {
                        storyItem2 = fjVar.f23965k.replyStory;
                    } else {
                        storyItem2 = fjVar.f23965k.media.storyItem;
                    }
                    if (storyItem2 != null && !(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && j3 - storyItem2.lastUpdateTime > 300000) {
                        storyItem2.lastUpdateTime = j3;
                        arrayList3.add(fjVar);
                    }
                }
                i12++;
            }
            long a10 = bnVar.a();
            if (!arrayList.isEmpty()) {
                TLRPC.TL_messages_getMessagesReactions tL_messages_getMessagesReactions = new TLRPC.TL_messages_getMessagesReactions();
                tL_messages_getMessagesReactions.peer = bnVar.getMessagesController().l1(a10);
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    tL_messages_getMessagesReactions.f28500id.add(Integer.valueOf(((fj) arrayList.get(i15)).e1()));
                }
                Integer valueOf = Integer.valueOf(bnVar.getConnectionsManager().sendRequest(tL_messages_getMessagesReactions, new RequestDelegate(k3Var) {
                    public final k3 f24546b;

                    {
                        this.f24546b = k3Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                k3 k3Var2 = this.f24546b;
                                if (tL_error == null) {
                                    k3Var2.f24971a.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    k3Var2.getClass();
                                    return;
                                }
                            default:
                                k3 k3Var3 = this.f24546b;
                                k3Var3.getClass();
                                if (tL_error == null) {
                                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                    for (int i16 = 0; i16 < updates.updates.size(); i16++) {
                                        if (updates.updates.get(i16) instanceof TL_update.TL_updateMessageReactions) {
                                            ((TL_update.TL_updateMessageReactions) updates.updates.get(i16)).updateUnreadState = false;
                                        }
                                    }
                                    k3Var3.f24971a.getMessagesController().V3(updates, false);
                                    return;
                                }
                                return;
                        }
                    }
                }));
                ArrayList arrayList4 = k3Var.f24974e;
                arrayList4.add(valueOf);
                if (arrayList4.size() > 5) {
                    bnVar.getConnectionsManager().cancelRequest(((Integer) arrayList4.remove(0)).intValue(), true);
                }
            }
            long a11 = bnVar.a();
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList5 = k3Var.f24975f;
            if (!isEmpty) {
                TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                tL_messages_getExtendedMedia.peer = bnVar.getMessagesController().l1(a11);
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    tL_messages_getExtendedMedia.f28494id.add(Integer.valueOf(((fj) arrayList2.get(i16)).e1()));
                }
                arrayList5.add(Integer.valueOf(bnVar.getConnectionsManager().sendRequest(tL_messages_getExtendedMedia, new RequestDelegate(k3Var) {
                    public final k3 f24546b;

                    {
                        this.f24546b = k3Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                k3 k3Var2 = this.f24546b;
                                if (tL_error == null) {
                                    k3Var2.f24971a.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    k3Var2.getClass();
                                    return;
                                }
                            default:
                                k3 k3Var3 = this.f24546b;
                                k3Var3.getClass();
                                if (tL_error == null) {
                                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                    for (int i162 = 0; i162 < updates.updates.size(); i162++) {
                                        if (updates.updates.get(i162) instanceof TL_update.TL_updateMessageReactions) {
                                            ((TL_update.TL_updateMessageReactions) updates.updates.get(i162)).updateUnreadState = false;
                                        }
                                    }
                                    k3Var3.f24971a.getMessagesController().V3(updates, false);
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
                    fj fjVar2 = (fj) arrayList3.get(i17);
                    new TL_stories.TL_storyItem();
                    int i18 = fjVar2.D;
                    if (i18 != 23 && i18 != 24) {
                        TLRPC.Message message = fjVar2.f23965k;
                        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                        if (messageReplyHeader != null) {
                            storyItem = message.replyStory;
                            storyItem.dialogId = n5.o(messageReplyHeader.peer);
                        } else {
                            i17++;
                            k3Var = this;
                        }
                    } else {
                        TLRPC.MessageMedia messageMedia2 = fjVar2.f23965k.media;
                        TL_stories.StoryItem storyItem3 = messageMedia2.storyItem;
                        storyItem3.dialogId = messageMedia2.user_id;
                        storyItem = storyItem3;
                    }
                    long j10 = storyItem.dialogId;
                    tL_stories_getStoriesByID.peer = bnVar.getMessagesController().l1(j10);
                    tL_stories_getStoriesByID.f28649id.add(Integer.valueOf(storyItem.f28642id));
                    arrayList5.add(Integer.valueOf(bnVar.getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new j3(storyItem.f28642id, 0, j10, k3Var, fjVar2))));
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
