package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
public final class i3 {
    public final org.telegram.ui.an f23038a;
    public final ArrayList f23039b = new ArrayList(10);
    public final ArrayList f23040c = new ArrayList(10);
    public final ArrayList d = new ArrayList(10);
    public final ArrayList f23041e = new ArrayList();
    public final ArrayList f23042f = new ArrayList();

    public i3(org.telegram.ui.an anVar) {
        this.f23038a = anVar;
    }

    public final void a(org.telegram.ui.jl jlVar, int i7, int i10, long j3) {
        TL_stories.StoryItem storyItem;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia;
        final i3 i3Var = this;
        ArrayList L = jlVar.L();
        org.telegram.ui.an anVar = i3Var.f23038a;
        if (!anVar.c() && i7 >= 0 && i10 >= 0) {
            int i11 = jlVar.J;
            int i12 = (i10 - i11) - 10;
            int i13 = (i7 - i11) + 10;
            if (i12 < 0) {
                i12 = 0;
            }
            if (i13 > L.size()) {
                i13 = L.size();
            }
            ArrayList arrayList = i3Var.f23039b;
            arrayList.clear();
            ArrayList arrayList2 = i3Var.f23040c;
            arrayList2.clear();
            ArrayList arrayList3 = i3Var.d;
            arrayList3.clear();
            while (i12 < i13) {
                ij ijVar = (ij) L.get(i12);
                if (anVar.f43865l4 != ijVar && ijVar.f1() > 0 && ((ijVar.f23237k.action == null || ijVar.z()) && j3 - ijVar.E > 15000)) {
                    ijVar.E = j3;
                    arrayList.add(ijVar);
                }
                if (anVar.f43865l4 != ijVar && ijVar.f1() > 0 && ((ijVar.r2() || ((messageMedia = ijVar.f23237k.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty() && (ijVar.f23237k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview))) && j3 - ijVar.F > 30000)) {
                    ijVar.F = j3;
                    arrayList2.add(ijVar);
                }
                int i14 = ijVar.D;
                if (i14 == 23 || i14 == 24 || ijVar.f23237k.replyStory != null) {
                    if (i14 != 23 && i14 != 24) {
                        storyItem2 = ijVar.f23237k.replyStory;
                    } else {
                        storyItem2 = ijVar.f23237k.media.storyItem;
                    }
                    if (storyItem2 != null && !(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && j3 - storyItem2.lastUpdateTime > 300000) {
                        storyItem2.lastUpdateTime = j3;
                        arrayList3.add(ijVar);
                    }
                }
                i12++;
            }
            long a10 = anVar.a();
            if (!arrayList.isEmpty()) {
                TLRPC.TL_messages_getMessagesReactions tL_messages_getMessagesReactions = new TLRPC.TL_messages_getMessagesReactions();
                tL_messages_getMessagesReactions.peer = anVar.getMessagesController().j1(a10);
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    tL_messages_getMessagesReactions.f27049id.add(Integer.valueOf(((ij) arrayList.get(i15)).f1()));
                }
                Integer valueOf = Integer.valueOf(anVar.getConnectionsManager().sendRequest(tL_messages_getMessagesReactions, new RequestDelegate(i3Var) {
                    public final i3 f22563b;

                    {
                        this.f22563b = i3Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                i3 i3Var2 = this.f22563b;
                                if (tL_error == null) {
                                    i3Var2.f23038a.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    i3Var2.getClass();
                                    return;
                                }
                            default:
                                i3 i3Var3 = this.f22563b;
                                i3Var3.getClass();
                                if (tL_error == null) {
                                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                    for (int i16 = 0; i16 < updates.updates.size(); i16++) {
                                        if (updates.updates.get(i16) instanceof TL_update.TL_updateMessageReactions) {
                                            ((TL_update.TL_updateMessageReactions) updates.updates.get(i16)).updateUnreadState = false;
                                        }
                                    }
                                    i3Var3.f23038a.getMessagesController().O3(updates, false);
                                    return;
                                }
                                return;
                        }
                    }
                }));
                ArrayList arrayList4 = i3Var.f23041e;
                arrayList4.add(valueOf);
                if (arrayList4.size() > 5) {
                    anVar.getConnectionsManager().cancelRequest(((Integer) arrayList4.remove(0)).intValue(), true);
                }
            }
            long a11 = anVar.a();
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList5 = i3Var.f23042f;
            if (!isEmpty) {
                TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                tL_messages_getExtendedMedia.peer = anVar.getMessagesController().j1(a11);
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    tL_messages_getExtendedMedia.f27043id.add(Integer.valueOf(((ij) arrayList2.get(i16)).f1()));
                }
                arrayList5.add(Integer.valueOf(anVar.getConnectionsManager().sendRequest(tL_messages_getExtendedMedia, new RequestDelegate(i3Var) {
                    public final i3 f22563b;

                    {
                        this.f22563b = i3Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                i3 i3Var2 = this.f22563b;
                                if (tL_error == null) {
                                    i3Var2.f23038a.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    i3Var2.getClass();
                                    return;
                                }
                            default:
                                i3 i3Var3 = this.f22563b;
                                i3Var3.getClass();
                                if (tL_error == null) {
                                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                    for (int i162 = 0; i162 < updates.updates.size(); i162++) {
                                        if (updates.updates.get(i162) instanceof TL_update.TL_updateMessageReactions) {
                                            ((TL_update.TL_updateMessageReactions) updates.updates.get(i162)).updateUnreadState = false;
                                        }
                                    }
                                    i3Var3.f23038a.getMessagesController().O3(updates, false);
                                    return;
                                }
                                return;
                        }
                    }
                })));
                if (arrayList5.size() > 10) {
                    anVar.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
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
                        TLRPC.Message message = ijVar2.f23237k;
                        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                        if (messageReplyHeader != null) {
                            storyItem = message.replyStory;
                            storyItem.dialogId = m5.o(messageReplyHeader.peer);
                        } else {
                            i17++;
                            i3Var = this;
                        }
                    } else {
                        TLRPC.MessageMedia messageMedia2 = ijVar2.f23237k.media;
                        TL_stories.StoryItem storyItem3 = messageMedia2.storyItem;
                        storyItem3.dialogId = messageMedia2.user_id;
                        storyItem = storyItem3;
                    }
                    long j10 = storyItem.dialogId;
                    tL_stories_getStoriesByID.peer = anVar.getMessagesController().j1(j10);
                    tL_stories_getStoriesByID.f27198id.add(Integer.valueOf(storyItem.f27191id));
                    arrayList5.add(Integer.valueOf(anVar.getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new h3(storyItem.f27191id, 0, j10, i3Var, ijVar2))));
                    i17++;
                    i3Var = this;
                }
                if (arrayList5.size() > 10) {
                    anVar.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
                }
            }
        }
    }
}
