package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
public final class qb2 {
    public final mu1 a;
    public final ArrayList b = new ArrayList(10);
    public final ArrayList c = new ArrayList(10);
    public final ArrayList d = new ArrayList(10);
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public qb2(mu1 mu1Var) {
        this.a = mu1Var;
    }

    public final void a(vs1 vs1Var, int i, int i2, long j) {
        TL_stories.StoryItem storyItem;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia;
        final qb2 qb2Var = this;
        ArrayList G = vs1Var.G();
        mu1 mu1Var = qb2Var.a;
        if (!mu1Var.P7() && i >= 0 && i2 >= 0) {
            int i3 = vs1Var.K;
            int i4 = (i2 - i3) - 10;
            int i5 = (i - i3) + 10;
            if (i4 < 0) {
                i4 = 0;
            }
            if (i5 > G.size()) {
                i5 = G.size();
            }
            ArrayList arrayList = qb2Var.b;
            arrayList.clear();
            ArrayList arrayList2 = qb2Var.c;
            arrayList2.clear();
            ArrayList arrayList3 = qb2Var.d;
            arrayList3.clear();
            while (i4 < i5) {
                k27 k27Var = (k27) G.get(i4);
                if (mu1Var.m4 != k27Var && k27Var.e1() > 0 && ((k27Var.k.action == null || k27Var.z()) && j - k27Var.E > 15000)) {
                    k27Var.E = j;
                    arrayList.add(k27Var);
                }
                if (mu1Var.m4 != k27Var && k27Var.e1() > 0 && ((k27Var.q2() || ((messageMedia = k27Var.k.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) && !messageMedia.extended_media.isEmpty() && (k27Var.k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview))) && j - k27Var.F > 30000)) {
                    k27Var.F = j;
                    arrayList2.add(k27Var);
                }
                int i6 = k27Var.D;
                if (i6 == 23 || i6 == 24 || k27Var.k.replyStory != null) {
                    if (i6 != 23 && i6 != 24) {
                        storyItem2 = k27Var.k.replyStory;
                    } else {
                        storyItem2 = k27Var.k.media.storyItem;
                    }
                    if (storyItem2 != null && !(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && j - storyItem2.lastUpdateTime > 300000) {
                        storyItem2.lastUpdateTime = j;
                        arrayList3.add(k27Var);
                    }
                }
                i4++;
            }
            long a = mu1Var.a();
            if (!arrayList.isEmpty()) {
                TLRPC.TL_messages_getMessagesReactions tL_messages_getMessagesReactions = new TLRPC.TL_messages_getMessagesReactions();
                tL_messages_getMessagesReactions.peer = mu1Var.getMessagesController().h1(a);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    tL_messages_getMessagesReactions.id.add(Integer.valueOf(((k27) arrayList.get(i7)).e1()));
                }
                Integer valueOf = Integer.valueOf(mu1Var.getConnectionsManager().sendRequest(tL_messages_getMessagesReactions, new RequestDelegate(qb2Var) {
                    public final qb2 b;

                    {
                        this.b = qb2Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        byte b = r2;
                        qb2 qb2Var2 = this.b;
                        switch (b) {
                            case 0:
                                if (tL_error == null) {
                                    qb2Var2.a.getMessagesController().R3((TLRPC.Updates) tLObject, false);
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
                                    qb2Var2.a.getMessagesController().R3(updates, false);
                                    return;
                                }
                                return;
                        }
                    }
                }));
                ArrayList arrayList4 = qb2Var.e;
                arrayList4.add(valueOf);
                if (arrayList4.size() > 5) {
                    mu1Var.getConnectionsManager().cancelRequest(((Integer) arrayList4.remove(0)).intValue(), true);
                }
            }
            long a2 = mu1Var.a();
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList5 = qb2Var.f;
            if (!isEmpty) {
                TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                tL_messages_getExtendedMedia.peer = mu1Var.getMessagesController().h1(a2);
                for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                    tL_messages_getExtendedMedia.id.add(Integer.valueOf(((k27) arrayList2.get(i8)).e1()));
                }
                arrayList5.add(Integer.valueOf(mu1Var.getConnectionsManager().sendRequest(tL_messages_getExtendedMedia, new RequestDelegate(qb2Var) {
                    public final qb2 b;

                    {
                        this.b = qb2Var;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        byte b = r2;
                        qb2 qb2Var2 = this.b;
                        switch (b) {
                            case 0:
                                if (tL_error == null) {
                                    qb2Var2.a.getMessagesController().R3((TLRPC.Updates) tLObject, false);
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
                                    qb2Var2.a.getMessagesController().R3(updates, false);
                                    return;
                                }
                                return;
                        }
                    }
                })));
                if (arrayList5.size() > 10) {
                    mu1Var.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
                }
            }
            if (!arrayList3.isEmpty()) {
                int i9 = 0;
                while (i9 < arrayList3.size()) {
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    k27 k27Var2 = (k27) arrayList3.get(i9);
                    new TL_stories.TL_storyItem();
                    int i10 = k27Var2.D;
                    if (i10 != 23 && i10 != 24) {
                        TLRPC.Message message = k27Var2.k;
                        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                        if (messageReplyHeader != null) {
                            storyItem = message.replyStory;
                            storyItem.dialogId = cf3.n(messageReplyHeader.peer);
                        } else {
                            i9++;
                            qb2Var = this;
                        }
                    } else {
                        TLRPC.MessageMedia messageMedia2 = k27Var2.k.media;
                        TL_stories.StoryItem storyItem3 = messageMedia2.storyItem;
                        storyItem3.dialogId = messageMedia2.user_id;
                        storyItem = storyItem3;
                    }
                    long j2 = storyItem.dialogId;
                    tL_stories_getStoriesByID.peer = mu1Var.getMessagesController().h1(j2);
                    tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
                    arrayList5.add(Integer.valueOf(mu1Var.getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new mg(qb2Var, storyItem.id, k27Var2, j2, (byte) 2))));
                    i9++;
                    qb2Var = this;
                }
                if (arrayList5.size() > 10) {
                    mu1Var.getConnectionsManager().cancelRequest(((Integer) arrayList5.remove(0)).intValue(), false);
                }
            }
        }
    }
}
