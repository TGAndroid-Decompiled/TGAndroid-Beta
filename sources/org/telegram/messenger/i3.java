package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
public final class i3 {
    public final org.telegram.ui.cn f23036a;
    public final ArrayList f23037b = new ArrayList(10);
    public final ArrayList f23038c = new ArrayList(10);
    public final ArrayList d = new ArrayList(10);
    public final ArrayList f23039e = new ArrayList();
    public final ArrayList f23040f = new ArrayList();

    public i3(org.telegram.ui.cn cnVar) {
        this.f23036a = cnVar;
    }

    public final void a(org.telegram.ui.ll llVar, int i7, int i10, long j3) {
        TL_stories.StoryItem storyItem;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia;
        final i3 i3Var = this;
        ArrayList L = llVar.L();
        org.telegram.ui.cn cnVar = i3Var.f23036a;
        if (!cnVar.c() && i7 >= 0 && i10 >= 0) {
            int i11 = llVar.J;
            int i12 = (i10 - i11) - 10;
            int i13 = (i7 - i11) + 10;
            if (i12 < 0) {
                i12 = 0;
            }
            if (i13 > L.size()) {
                i13 = L.size();
            }
            ArrayList arrayList = i3Var.f23037b;
            arrayList.clear();
            ArrayList arrayList2 = i3Var.f23038c;
            arrayList2.clear();
            ArrayList arrayList3 = i3Var.d;
            arrayList3.clear();
            while (i12 < i13) {
                ij ijVar = (ij) L.get(i12);
                if (cnVar.f44527l4 != ijVar && ijVar.e1() > 0 && ((ijVar.f23262k.action == null || ijVar.z()) && j3 - ijVar.E > 15000)) {
                    ijVar.E = j3;
                    arrayList.add(ijVar);
                }
                if (cnVar.f44527l4 != ijVar && ijVar.e1() > 0 && ((ijVar.q2() || ((messageMedia = ijVar.f23262k.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty() && (ijVar.f23262k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview))) && j3 - ijVar.F > 30000)) {
                    ijVar.F = j3;
                    arrayList2.add(ijVar);
                }
                int i14 = ijVar.D;
                if (i14 == 23 || i14 == 24 || ijVar.f23262k.replyStory != null) {
                    if (i14 != 23 && i14 != 24) {
                        storyItem2 = ijVar.f23262k.replyStory;
                    } else {
                        storyItem2 = ijVar.f23262k.media.storyItem;
                    }
                    if (storyItem2 != null && !(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && j3 - storyItem2.lastUpdateTime > 300000) {
                        storyItem2.lastUpdateTime = j3;
                        arrayList3.add(ijVar);
                    }
                }
                i12++;
            }
            long a10 = cnVar.a();
            if (!arrayList.isEmpty()) {
                TLRPC.TL_messages_getMessagesReactions tL_messages_getMessagesReactions = new TLRPC.TL_messages_getMessagesReactions();
                tL_messages_getMessagesReactions.peer = cnVar.getMessagesController().j1(a10);
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    tL_messages_getMessagesReactions.f27053id.add(Integer.valueOf(((ij) arrayList.get(i15)).e1()));
                }
                Integer valueOf = Integer.valueOf(cnVar.getConnectionsManager().sendRequest(tL_messages_getMessagesReactions, new RequestDelegate(i3Var) {
                    public final i3 f22589b;

                    {
                        this.f22589b = i3Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                i3 i3Var2 = this.f22589b;
                                if (tL_error == null) {
                                    i3Var2.f23036a.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    i3Var2.getClass();
                                    return;
                                }
                            default:
                                i3 i3Var3 = this.f22589b;
                                i3Var3.getClass();
                                if (tL_error == null) {
                                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                    for (int i16 = 0; i16 < updates.updates.size(); i16++) {
                                        if (updates.updates.get(i16) instanceof TL_update.TL_updateMessageReactions) {
                                            ((TL_update.TL_updateMessageReactions) updates.updates.get(i16)).updateUnreadState = false;
                                        }
                                    }
                                    i3Var3.f23036a.getMessagesController().O3(updates, false);
                                    return;
                                }
                                return;
                        }
                    }
                }));
                ArrayList arrayList4 = i3Var.f23039e;
                arrayList4.add(valueOf);
                if (arrayList4.size() > 5) {
                    cnVar.getConnectionsManager().cancelRequest(((Integer) arrayList4.remove(0)).intValue(), true);
                }
            }
            long a11 = cnVar.a();
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList5 = i3Var.f23040f;
            if (!isEmpty) {
                TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                tL_messages_getExtendedMedia.peer = cnVar.getMessagesController().j1(a11);
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    tL_messages_getExtendedMedia.f27047id.add(Integer.valueOf(((ij) arrayList2.get(i16)).e1()));
                }
                arrayList5.add(Integer.valueOf(cnVar.getConnectionsManager().sendRequest(tL_messages_getExtendedMedia, new RequestDelegate(i3Var) {
                    public final i3 f22589b;

                    {
                        this.f22589b = i3Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                i3 i3Var2 = this.f22589b;
                                if (tL_error == null) {
                                    i3Var2.f23036a.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    i3Var2.getClass();
                                    return;
                                }
                            default:
                                i3 i3Var3 = this.f22589b;
                                i3Var3.getClass();
                                if (tL_error == null) {
                                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                    for (int i162 = 0; i162 < updates.updates.size(); i162++) {
                                        if (updates.updates.get(i162) instanceof TL_update.TL_updateMessageReactions) {
                                            ((TL_update.TL_updateMessageReactions) updates.updates.get(i162)).updateUnreadState = false;
                                        }
                                    }
                                    i3Var3.f23036a.getMessagesController().O3(updates, false);
                                    return;
                                }
                                return;
                        }
                    }
                })));
                if (arrayList5.size() > 10) {
                    cnVar.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
                }
            }
            if (!arrayList3.isEmpty()) {
                int i17 = 0;
                while (i17 < arrayList3.size()) {
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    ij ijVar2 = (ij) arrayList3.get(i17);
                    new TL_stories.TL_storyItem();
                    int i18 = ijVar2.D;
                    if (i18 != 23 && i18 != 24) {
                        TLRPC.Message message = ijVar2.f23262k;
                        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                        if (messageReplyHeader != null) {
                            storyItem = message.replyStory;
                            storyItem.dialogId = m5.o(messageReplyHeader.peer);
                        } else {
                            i17++;
                            i3Var = this;
                        }
                    } else {
                        TLRPC.MessageMedia messageMedia2 = ijVar2.f23262k.media;
                        TL_stories.StoryItem storyItem3 = messageMedia2.storyItem;
                        storyItem3.dialogId = messageMedia2.user_id;
                        storyItem = storyItem3;
                    }
                    long j10 = storyItem.dialogId;
                    tL_stories_getStoriesByID.peer = cnVar.getMessagesController().j1(j10);
                    tL_stories_getStoriesByID.f27202id.add(Integer.valueOf(storyItem.f27195id));
                    arrayList5.add(Integer.valueOf(cnVar.getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new h3(storyItem.f27195id, 0, j10, i3Var, ijVar2))));
                    i17++;
                    i3Var = this;
                }
                if (arrayList5.size() > 10) {
                    cnVar.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
                }
            }
        }
    }
}
