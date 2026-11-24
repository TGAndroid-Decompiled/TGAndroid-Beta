package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class mh implements RequestDelegate {
    public final byte a;
    public final int b;
    public final long c;
    public final Object d;
    public final Object e;

    public mh(int i, b61 b61Var, my0 my0Var, long j) {
        this.a = (byte) 0;
        this.b = i;
        this.d = b61Var;
        this.e = my0Var;
        this.c = j;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TL_stories.StoryItem storyItem;
        byte b = this.a;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                gm.c3(new vf(tLObject, this.b, (b61) obj2, (my0) obj, this.c, tL_error));
                return;
            case 1:
                gm.c3(new wz((ku0) obj2, (ju0) obj, this.b, tLObject, this.c, (byte) 2));
                return;
            case 2:
                bd2 bd2Var = (bd2) obj2;
                k47 k47Var = (k47) obj;
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    if (tL_stories_stories.stories.size() > 0) {
                        storyItem = tL_stories_stories.stories.get(0);
                    } else {
                        storyItem = null;
                    }
                    if (storyItem == null) {
                        storyItem = new TL_stories.TL_storyItemDeleted();
                    }
                    TL_stories.StoryItem storyItem2 = storyItem;
                    storyItem2.lastUpdateTime = System.currentTimeMillis();
                    storyItem2.id = i;
                    gm.c3(new p97(bd2Var, k47Var, this.c, storyItem2, (byte) 6));
                    return;
                }
                return;
            case 3:
                gm.c3(new wz((hs6) obj2, tLObject, this.b, (qac) obj, this.c, (byte) 5));
                return;
            case 4:
                gm.c3(new vf((t57) obj2, tL_error, tLObject, this.c, this.b, (TLRPC.Chat) obj));
                return;
            case 5:
                oc7 oc7Var = (oc7) obj2;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) obj;
                if (i == oc7Var.p2) {
                    oc7Var.o2 = 0;
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (tL_messages_peerDialogs != null && !tL_messages_peerDialogs.dialogs.isEmpty()) {
                        oc7Var.getMessagesStorage().j1(tL_help_promoData.users, tL_help_promoData.chats, true, true);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.chats = tL_messages_peerDialogs.chats;
                        tL_messages_dialogs.users = tL_messages_peerDialogs.users;
                        tL_messages_dialogs.dialogs = tL_messages_peerDialogs.dialogs;
                        tL_messages_dialogs.messages = tL_messages_peerDialogs.messages;
                        oc7Var.getMessagesStorage().a1(tL_messages_dialogs, 2);
                        gm.c3(new p97(oc7Var, tL_help_promoData, tL_messages_peerDialogs, this.c, (byte) 1));
                    } else {
                        gm.c3(new ba7(oc7Var, (byte) 2));
                    }
                    oc7Var.n2 = false;
                    return;
                }
                return;
            case 6:
                gm.c3(new o77((b61) obj2, (my0[]) obj, this.b, this.c, (byte) 18));
                return;
            default:
                gm.c3(new wz((h4b) obj2, tLObject, this.b, (String) obj, this.c, (byte) 13));
                return;
        }
    }

    public mh(t57 t57Var, long j, int i, TLRPC.Chat chat) {
        this.a = (byte) 4;
        this.d = t57Var;
        this.c = j;
        this.b = i;
        this.e = chat;
    }

    public mh(Object obj, int i, Object obj2, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.c = j;
    }

    public mh(Object obj, Object obj2, int i, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = j;
    }
}
