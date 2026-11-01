package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
public final class l3 {
    public final org.telegram.ui.un f16882a;
    public final ArrayList f16883b = new ArrayList(10);
    public final ArrayList f16884c = new ArrayList(10);
    public final ArrayList d = new ArrayList(10);
    public final ArrayList e = new ArrayList();
    public final ArrayList f16885f = new ArrayList();

    public l3(org.telegram.ui.un unVar) {
        this.f16882a = unVar;
    }

    public final void a(org.telegram.ui.fm fmVar, int i10, int i11, long j10) {
        TL_stories.StoryItem storyItem;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia;
        final l3 l3Var = this;
        ArrayList L = fmVar.L();
        org.telegram.ui.un unVar = l3Var.f16882a;
        if (!unVar.c() && i10 >= 0 && i11 >= 0) {
            int i12 = fmVar.J;
            int i13 = (i11 - i12) - 10;
            int i14 = (i10 - i12) + 10;
            if (i13 < 0) {
                i13 = 0;
            }
            if (i14 > L.size()) {
                i14 = L.size();
            }
            ArrayList arrayList = l3Var.f16883b;
            arrayList.clear();
            ArrayList arrayList2 = l3Var.f16884c;
            arrayList2.clear();
            ArrayList arrayList3 = l3Var.d;
            arrayList3.clear();
            while (i13 < i14) {
                kj kjVar = (kj) L.get(i13);
                if (unVar.l4 != kjVar && kjVar.f1() > 0 && ((kjVar.f16690k.action == null || kjVar.z()) && j10 - kjVar.E > 15000)) {
                    kjVar.E = j10;
                    arrayList.add(kjVar);
                }
                if (unVar.l4 != kjVar && kjVar.f1() > 0 && ((kjVar.r2() || ((messageMedia = kjVar.f16690k.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty() && (kjVar.f16690k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview))) && j10 - kjVar.F > 30000)) {
                    kjVar.F = j10;
                    arrayList2.add(kjVar);
                }
                int i15 = kjVar.D;
                if (i15 == 23 || i15 == 24 || kjVar.f16690k.replyStory != null) {
                    if (i15 != 23 && i15 != 24) {
                        storyItem2 = kjVar.f16690k.replyStory;
                    } else {
                        storyItem2 = kjVar.f16690k.media.storyItem;
                    }
                    if (storyItem2 != null && !(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && j10 - storyItem2.lastUpdateTime > 300000) {
                        storyItem2.lastUpdateTime = j10;
                        arrayList3.add(kjVar);
                    }
                }
                i13++;
            }
            long a2 = unVar.a();
            if (!arrayList.isEmpty()) {
                TLRPC.TL_messages_getMessagesReactions tL_messages_getMessagesReactions = new TLRPC.TL_messages_getMessagesReactions();
                tL_messages_getMessagesReactions.peer = unVar.getMessagesController().i1(a2);
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    tL_messages_getMessagesReactions.f19891id.add(Integer.valueOf(((kj) arrayList.get(i16)).f1()));
                }
                Integer valueOf = Integer.valueOf(unVar.getConnectionsManager().sendRequest(tL_messages_getMessagesReactions, new RequestDelegate(l3Var) {
                    public final l3 f16411b;

                    {
                        this.f16411b = l3Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                l3 l3Var2 = this.f16411b;
                                if (tL_error == null) {
                                    l3Var2.f16882a.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    l3Var2.getClass();
                                    return;
                                }
                            default:
                                l3 l3Var3 = this.f16411b;
                                l3Var3.getClass();
                                if (tL_error == null) {
                                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                    for (int i17 = 0; i17 < updates.updates.size(); i17++) {
                                        if (updates.updates.get(i17) instanceof TL_update.TL_updateMessageReactions) {
                                            ((TL_update.TL_updateMessageReactions) updates.updates.get(i17)).updateUnreadState = false;
                                        }
                                    }
                                    l3Var3.f16882a.getMessagesController().L3(updates, false);
                                    return;
                                }
                                return;
                        }
                    }
                }));
                ArrayList arrayList4 = l3Var.e;
                arrayList4.add(valueOf);
                if (arrayList4.size() > 5) {
                    unVar.getConnectionsManager().cancelRequest(((Integer) arrayList4.remove(0)).intValue(), true);
                }
            }
            long a10 = unVar.a();
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList5 = l3Var.f16885f;
            if (!isEmpty) {
                TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                tL_messages_getExtendedMedia.peer = unVar.getMessagesController().i1(a10);
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    tL_messages_getExtendedMedia.f19885id.add(Integer.valueOf(((kj) arrayList2.get(i17)).f1()));
                }
                arrayList5.add(Integer.valueOf(unVar.getConnectionsManager().sendRequest(tL_messages_getExtendedMedia, new RequestDelegate(l3Var) {
                    public final l3 f16411b;

                    {
                        this.f16411b = l3Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                l3 l3Var2 = this.f16411b;
                                if (tL_error == null) {
                                    l3Var2.f16882a.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    l3Var2.getClass();
                                    return;
                                }
                            default:
                                l3 l3Var3 = this.f16411b;
                                l3Var3.getClass();
                                if (tL_error == null) {
                                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                    for (int i172 = 0; i172 < updates.updates.size(); i172++) {
                                        if (updates.updates.get(i172) instanceof TL_update.TL_updateMessageReactions) {
                                            ((TL_update.TL_updateMessageReactions) updates.updates.get(i172)).updateUnreadState = false;
                                        }
                                    }
                                    l3Var3.f16882a.getMessagesController().L3(updates, false);
                                    return;
                                }
                                return;
                        }
                    }
                })));
                if (arrayList5.size() > 10) {
                    unVar.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
                }
            }
            if (!arrayList3.isEmpty()) {
                int i18 = 0;
                while (i18 < arrayList3.size()) {
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    kj kjVar2 = (kj) arrayList3.get(i18);
                    new TL_stories.TL_storyItem();
                    int i19 = kjVar2.D;
                    if (i19 != 23 && i19 != 24) {
                        TLRPC.Message message = kjVar2.f16690k;
                        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                        if (messageReplyHeader != null) {
                            storyItem = message.replyStory;
                            storyItem.dialogId = o5.o(messageReplyHeader.peer);
                        } else {
                            i18++;
                            l3Var = this;
                        }
                    } else {
                        TLRPC.MessageMedia messageMedia2 = kjVar2.f16690k.media;
                        TL_stories.StoryItem storyItem3 = messageMedia2.storyItem;
                        storyItem3.dialogId = messageMedia2.user_id;
                        storyItem = storyItem3;
                    }
                    long j11 = storyItem.dialogId;
                    tL_stories_getStoriesByID.peer = unVar.getMessagesController().i1(j11);
                    tL_stories_getStoriesByID.f20039id.add(Integer.valueOf(storyItem.f20032id));
                    arrayList5.add(Integer.valueOf(unVar.getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new k3(storyItem.f20032id, 0, j11, l3Var, kjVar2))));
                    i18++;
                    l3Var = this;
                }
                if (arrayList5.size() > 10) {
                    unVar.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
                }
            }
        }
    }
}
