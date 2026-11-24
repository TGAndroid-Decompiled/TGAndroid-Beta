package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class tg implements RequestDelegate {
    public final byte a;
    public final int b;
    public final long c;
    public final Object d;
    public final Object e;

    public tg(int i, u41 u41Var, fx0 fx0Var, long j) {
        this.a = (byte) 0;
        this.b = i;
        this.d = u41Var;
        this.e = fx0Var;
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
                gl.d3(new qe(tLObject, this.b, (u41) obj2, (fx0) obj, this.c, tL_error));
                return;
            case 1:
                gl.d3(new wy((ct0) obj2, (bt0) obj, this.b, tLObject, this.c, (byte) 2));
                return;
            case 2:
                qb2 qb2Var = (qb2) obj2;
                k27 k27Var = (k27) obj;
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
                    gl.d3(new m77(qb2Var, k27Var, this.c, storyItem2, (byte) 6));
                    return;
                }
                return;
            case 3:
                gl.d3(new wy((hq6) obj2, tLObject, this.b, (p8c) obj, this.c, (byte) 5));
                return;
            case 4:
                gl.d3(new qe((t37) obj2, tL_error, tLObject, this.c, this.b, (TLRPC.Chat) obj));
                return;
            case 5:
                na7 na7Var = (na7) obj2;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) obj;
                if (i == na7Var.p2) {
                    na7Var.o2 = 0;
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (tL_messages_peerDialogs != null && !tL_messages_peerDialogs.dialogs.isEmpty()) {
                        na7Var.getMessagesStorage().j1(tL_help_promoData.users, tL_help_promoData.chats, true, true);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.chats = tL_messages_peerDialogs.chats;
                        tL_messages_dialogs.users = tL_messages_peerDialogs.users;
                        tL_messages_dialogs.dialogs = tL_messages_peerDialogs.dialogs;
                        tL_messages_dialogs.messages = tL_messages_peerDialogs.messages;
                        na7Var.getMessagesStorage().a1(tL_messages_dialogs, 2);
                        gl.d3(new m77(na7Var, tL_help_promoData, tL_messages_peerDialogs, this.c, (byte) 1));
                    } else {
                        gl.d3(new c87(na7Var, (byte) 1));
                    }
                    na7Var.n2 = false;
                    return;
                }
                return;
            case 6:
                gl.d3(new o57((u41) obj2, (fx0[]) obj, this.b, this.c, (byte) 18));
                return;
            default:
                gl.d3(new wy((g2b) obj2, tLObject, this.b, (String) obj, this.c, (byte) 13));
                return;
        }
    }

    public tg(t37 t37Var, long j, int i, TLRPC.Chat chat) {
        this.a = (byte) 4;
        this.d = t37Var;
        this.c = j;
        this.b = i;
        this.e = chat;
    }

    public tg(Object obj, int i, Object obj2, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.c = j;
    }

    public tg(Object obj, Object obj2, int i, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = j;
    }
}
