package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
public final class bd2 {
    public final yv1 a;
    public final ArrayList b = new ArrayList(10);
    public final ArrayList c = new ArrayList(10);
    public final ArrayList d = new ArrayList(10);
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public bd2(yv1 yv1Var) {
        this.a = yv1Var;
    }

    public final void a(hu1 hu1Var, int i, int i2, long j) {
        TL_stories.StoryItem storyItem;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia;
        final bd2 bd2Var = this;
        ArrayList G = hu1Var.G();
        yv1 yv1Var = bd2Var.a;
        if (!yv1Var.X7() && i >= 0 && i2 >= 0) {
            int i3 = hu1Var.K;
            int i4 = (i2 - i3) - 10;
            int i5 = (i - i3) + 10;
            if (i4 < 0) {
                i4 = 0;
            }
            if (i5 > G.size()) {
                i5 = G.size();
            }
            ArrayList arrayList = bd2Var.b;
            arrayList.clear();
            ArrayList arrayList2 = bd2Var.c;
            arrayList2.clear();
            ArrayList arrayList3 = bd2Var.d;
            arrayList3.clear();
            while (i4 < i5) {
                k47 k47Var = (k47) G.get(i4);
                if (yv1Var.m4 != k47Var && k47Var.e1() > 0 && ((k47Var.k.action == null || k47Var.z()) && j - k47Var.E > 15000)) {
                    k47Var.E = j;
                    arrayList.add(k47Var);
                }
                if (yv1Var.m4 != k47Var && k47Var.e1() > 0 && ((k47Var.q2() || ((messageMedia = k47Var.k.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty() && (k47Var.k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview))) && j - k47Var.F > 30000)) {
                    k47Var.F = j;
                    arrayList2.add(k47Var);
                }
                int i6 = k47Var.D;
                if (i6 == 23 || i6 == 24 || k47Var.k.replyStory != null) {
                    if (i6 != 23 && i6 != 24) {
                        storyItem2 = k47Var.k.replyStory;
                    } else {
                        storyItem2 = k47Var.k.media.storyItem;
                    }
                    if (storyItem2 != null && !(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && j - storyItem2.lastUpdateTime > 300000) {
                        storyItem2.lastUpdateTime = j;
                        arrayList3.add(k47Var);
                    }
                }
                i4++;
            }
            long a = yv1Var.a();
            if (!arrayList.isEmpty()) {
                TLRPC.TL_messages_getMessagesReactions tL_messages_getMessagesReactions = new TLRPC.TL_messages_getMessagesReactions();
                tL_messages_getMessagesReactions.peer = yv1Var.getMessagesController().i1(a);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    tL_messages_getMessagesReactions.id.add(Integer.valueOf(((k47) arrayList.get(i7)).e1()));
                }
                Integer valueOf = Integer.valueOf(yv1Var.getConnectionsManager().sendRequest(tL_messages_getMessagesReactions, new RequestDelegate(bd2Var) {
                    public final bd2 b;

                    {
                        this.b = bd2Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        byte b = r2;
                        bd2 bd2Var2 = this.b;
                        switch (b) {
                            case 0:
                                if (tL_error == null) {
                                    bd2Var2.a.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                                    return;
                                }
                                return;
                            default:
                                if (tL_error == null) {
                                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                    for (int i8 = 0; i8 < updates.updates.size(); i8++) {
                                        if (updates.updates.get(i8) instanceof TL_update.TL_updateMessageReactions) {
                                            ((TL_update.TL_updateMessageReactions) updates.updates.get(i8)).updateUnreadState = false;
                                        }
                                    }
                                    bd2Var2.a.getMessagesController().T3(updates, false);
                                    return;
                                }
                                return;
                        }
                    }
                }));
                ArrayList arrayList4 = bd2Var.e;
                arrayList4.add(valueOf);
                if (arrayList4.size() > 5) {
                    yv1Var.getConnectionsManager().cancelRequest(((Integer) arrayList4.remove(0)).intValue(), true);
                }
            }
            long a2 = yv1Var.a();
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList5 = bd2Var.f;
            if (!isEmpty) {
                TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                tL_messages_getExtendedMedia.peer = yv1Var.getMessagesController().i1(a2);
                for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                    tL_messages_getExtendedMedia.id.add(Integer.valueOf(((k47) arrayList2.get(i8)).e1()));
                }
                arrayList5.add(Integer.valueOf(yv1Var.getConnectionsManager().sendRequest(tL_messages_getExtendedMedia, new RequestDelegate(bd2Var) {
                    public final bd2 b;

                    {
                        this.b = bd2Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        byte b = r2;
                        bd2 bd2Var2 = this.b;
                        switch (b) {
                            case 0:
                                if (tL_error == null) {
                                    bd2Var2.a.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                                    return;
                                }
                                return;
                            default:
                                if (tL_error == null) {
                                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                                    for (int i82 = 0; i82 < updates.updates.size(); i82++) {
                                        if (updates.updates.get(i82) instanceof TL_update.TL_updateMessageReactions) {
                                            ((TL_update.TL_updateMessageReactions) updates.updates.get(i82)).updateUnreadState = false;
                                        }
                                    }
                                    bd2Var2.a.getMessagesController().T3(updates, false);
                                    return;
                                }
                                return;
                        }
                    }
                })));
                if (arrayList5.size() > 10) {
                    yv1Var.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
                }
            }
            if (!arrayList3.isEmpty()) {
                int i9 = 0;
                while (i9 < arrayList3.size()) {
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    k47 k47Var2 = (k47) arrayList3.get(i9);
                    new TL_stories.TL_storyItem();
                    int i10 = k47Var2.D;
                    if (i10 != 23 && i10 != 24) {
                        TLRPC.Message message = k47Var2.k;
                        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                        if (messageReplyHeader != null) {
                            storyItem = message.replyStory;
                            storyItem.dialogId = pg3.n(messageReplyHeader.peer);
                        } else {
                            i9++;
                            bd2Var = this;
                        }
                    } else {
                        TLRPC.MessageMedia messageMedia2 = k47Var2.k.media;
                        TL_stories.StoryItem storyItem3 = messageMedia2.storyItem;
                        storyItem3.dialogId = messageMedia2.user_id;
                        storyItem = storyItem3;
                    }
                    long j2 = storyItem.dialogId;
                    tL_stories_getStoriesByID.peer = yv1Var.getMessagesController().i1(j2);
                    tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
                    arrayList5.add(Integer.valueOf(yv1Var.getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new mh(bd2Var, storyItem.id, k47Var2, j2, (byte) 2))));
                    i9++;
                    bd2Var = this;
                }
                if (arrayList5.size() > 10) {
                    yv1Var.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
                }
            }
        }
    }
}
