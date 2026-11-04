package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
public final class i3 {
    public final org.telegram.ui.wm f23429a;
    public final ArrayList f23430b = new ArrayList(10);
    public final ArrayList f23431c = new ArrayList(10);
    public final ArrayList d = new ArrayList(10);
    public final ArrayList f23432e = new ArrayList();
    public final ArrayList f23433f = new ArrayList();

    public i3(org.telegram.ui.wm wmVar) {
        this.f23429a = wmVar;
    }

    public final void a(org.telegram.ui.fl flVar, int i3, int i10, long j10) {
        TL_stories.StoryItem storyItem;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia;
        final i3 i3Var = this;
        ArrayList L = flVar.L();
        org.telegram.ui.wm wmVar = i3Var.f23429a;
        if (!wmVar.c() && i3 >= 0 && i10 >= 0) {
            int i11 = flVar.K;
            int i12 = (i10 - i11) - 10;
            int i13 = (i3 - i11) + 10;
            if (i12 < 0) {
                i12 = 0;
            }
            if (i13 > L.size()) {
                i13 = L.size();
            }
            ArrayList arrayList = i3Var.f23430b;
            arrayList.clear();
            ArrayList arrayList2 = i3Var.f23431c;
            arrayList2.clear();
            ArrayList arrayList3 = i3Var.d;
            arrayList3.clear();
            while (i12 < i13) {
                zi ziVar = (zi) L.get(i12);
                if (wmVar.f51397m4 != ziVar && ziVar.f1() > 0 && ((ziVar.f26868k.action == null || ziVar.z()) && j10 - ziVar.E > 15000)) {
                    ziVar.E = j10;
                    arrayList.add(ziVar);
                }
                if (wmVar.f51397m4 != ziVar && ziVar.f1() > 0 && ((ziVar.r2() || ((messageMedia = ziVar.f26868k.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty() && (ziVar.f26868k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview))) && j10 - ziVar.F > 30000)) {
                    ziVar.F = j10;
                    arrayList2.add(ziVar);
                }
                int i14 = ziVar.D;
                if (i14 == 23 || i14 == 24 || ziVar.f26868k.replyStory != null) {
                    if (i14 != 23 && i14 != 24) {
                        storyItem2 = ziVar.f26868k.replyStory;
                    } else {
                        storyItem2 = ziVar.f26868k.media.storyItem;
                    }
                    if (storyItem2 != null && !(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && j10 - storyItem2.lastUpdateTime > 300000) {
                        storyItem2.lastUpdateTime = j10;
                        arrayList3.add(ziVar);
                    }
                }
                i12++;
            }
            long a10 = wmVar.a();
            if (!arrayList.isEmpty()) {
                TLRPC.TL_messages_getMessagesReactions tL_messages_getMessagesReactions = new TLRPC.TL_messages_getMessagesReactions();
                tL_messages_getMessagesReactions.peer = wmVar.getMessagesController().j1(a10);
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    tL_messages_getMessagesReactions.f27098id.add(Integer.valueOf(((zi) arrayList.get(i15)).f1()));
                }
                Integer valueOf = Integer.valueOf(wmVar.getConnectionsManager().sendRequest(tL_messages_getMessagesReactions, new RequestDelegate(i3Var) {
                    public final i3 f22632b;

                    {
                        this.f22632b = i3Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                i3 i3Var2 = this.f22632b;
                                if (tL_error == null) {
                                    i3Var2.f23429a.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    i3Var2.getClass();
                                    return;
                                }
                            default:
                                i3 i3Var3 = this.f22632b;
                                i3Var3.getClass();
                                if (tL_error == null) {
                                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                    for (int i16 = 0; i16 < updates.updates.size(); i16++) {
                                        if (updates.updates.get(i16) instanceof TL_update.TL_updateMessageReactions) {
                                            ((TL_update.TL_updateMessageReactions) updates.updates.get(i16)).updateUnreadState = false;
                                        }
                                    }
                                    i3Var3.f23429a.getMessagesController().O3(updates, false);
                                    return;
                                }
                                return;
                        }
                    }
                }));
                ArrayList arrayList4 = i3Var.f23432e;
                arrayList4.add(valueOf);
                if (arrayList4.size() > 5) {
                    wmVar.getConnectionsManager().cancelRequest(((Integer) arrayList4.remove(0)).intValue(), true);
                }
            }
            long a11 = wmVar.a();
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList5 = i3Var.f23433f;
            if (!isEmpty) {
                TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                tL_messages_getExtendedMedia.peer = wmVar.getMessagesController().j1(a11);
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    tL_messages_getExtendedMedia.f27092id.add(Integer.valueOf(((zi) arrayList2.get(i16)).f1()));
                }
                arrayList5.add(Integer.valueOf(wmVar.getConnectionsManager().sendRequest(tL_messages_getExtendedMedia, new RequestDelegate(i3Var) {
                    public final i3 f22632b;

                    {
                        this.f22632b = i3Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                i3 i3Var2 = this.f22632b;
                                if (tL_error == null) {
                                    i3Var2.f23429a.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    i3Var2.getClass();
                                    return;
                                }
                            default:
                                i3 i3Var3 = this.f22632b;
                                i3Var3.getClass();
                                if (tL_error == null) {
                                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                    for (int i162 = 0; i162 < updates.updates.size(); i162++) {
                                        if (updates.updates.get(i162) instanceof TL_update.TL_updateMessageReactions) {
                                            ((TL_update.TL_updateMessageReactions) updates.updates.get(i162)).updateUnreadState = false;
                                        }
                                    }
                                    i3Var3.f23429a.getMessagesController().O3(updates, false);
                                    return;
                                }
                                return;
                        }
                    }
                })));
                if (arrayList5.size() > 10) {
                    wmVar.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
                }
            }
            if (!arrayList3.isEmpty()) {
                int i17 = 0;
                while (i17 < arrayList3.size()) {
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    zi ziVar2 = (zi) arrayList3.get(i17);
                    new TL_stories.TL_storyItem();
                    int i18 = ziVar2.D;
                    if (i18 != 23 && i18 != 24) {
                        TLRPC.Message message = ziVar2.f26868k;
                        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                        if (messageReplyHeader != null) {
                            storyItem = message.replyStory;
                            storyItem.dialogId = m5.o(messageReplyHeader.peer);
                        } else {
                            i17++;
                            i3Var = this;
                        }
                    } else {
                        TLRPC.MessageMedia messageMedia2 = ziVar2.f26868k.media;
                        TL_stories.StoryItem storyItem3 = messageMedia2.storyItem;
                        storyItem3.dialogId = messageMedia2.user_id;
                        storyItem = storyItem3;
                    }
                    long j11 = storyItem.dialogId;
                    tL_stories_getStoriesByID.peer = wmVar.getMessagesController().j1(j11);
                    tL_stories_getStoriesByID.f27247id.add(Integer.valueOf(storyItem.f27240id));
                    arrayList5.add(Integer.valueOf(wmVar.getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new h3(storyItem.f27240id, 0, j11, i3Var, ziVar2))));
                    i17++;
                    i3Var = this;
                }
                if (arrayList5.size() > 10) {
                    wmVar.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
                }
            }
        }
    }
}
