package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class gg implements RequestDelegate {
    public final byte a;
    public final int b;
    public final long c;
    public final Object d;
    public final Object e;

    public gg(int i, c51 c51Var, nx0 nx0Var, long j) {
        this.a = (byte) 0;
        this.b = i;
        this.d = c51Var;
        this.e = nx0Var;
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
                hl.c3(new he(tLObject, this.b, (c51) obj2, (nx0) obj, this.c, tL_error));
                return;
            case 1:
                hl.c3(new wy((kt0) obj2, (jt0) obj, this.b, tLObject, this.c, (byte) 2));
                return;
            case 2:
                gc2 gc2Var = (gc2) obj2;
                r47 r47Var = (r47) obj;
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
                    hl.c3(new ba7(gc2Var, r47Var, this.c, storyItem2, (byte) 6));
                    return;
                }
                return;
            case 3:
                hl.c3(new wy((ls6) obj2, tLObject, this.b, (pcc) obj, this.c, (byte) 5));
                return;
            case 4:
                hl.c3(new he((a67) obj2, tL_error, tLObject, this.c, this.b, (TLRPC.Chat) obj));
                return;
            case 5:
                uc7 uc7Var = (uc7) obj2;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) obj;
                if (i == uc7Var.p2) {
                    uc7Var.o2 = 0;
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (tL_messages_peerDialogs != null && !tL_messages_peerDialogs.dialogs.isEmpty()) {
                        uc7Var.getMessagesStorage().j1(tL_help_promoData.users, tL_help_promoData.chats, true, true);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.chats = tL_messages_peerDialogs.chats;
                        tL_messages_dialogs.users = tL_messages_peerDialogs.users;
                        tL_messages_dialogs.dialogs = tL_messages_peerDialogs.dialogs;
                        tL_messages_dialogs.messages = tL_messages_peerDialogs.messages;
                        uc7Var.getMessagesStorage().a1(tL_messages_dialogs, 2);
                        hl.c3(new ba7(uc7Var, tL_help_promoData, tL_messages_peerDialogs, this.c, (byte) 1));
                    } else {
                        hl.c3(new l87(uc7Var, (byte) 29));
                    }
                    uc7Var.n2 = false;
                    return;
                }
                return;
            case 6:
                hl.c3(new r77((c51) obj2, (nx0[]) obj, this.b, this.c, (byte) 18));
                return;
            default:
                hl.c3(new wy((c6b) obj2, tLObject, this.b, (String) obj, this.c, (byte) 13));
                return;
        }
    }

    public gg(a67 a67Var, long j, int i, TLRPC.Chat chat) {
        this.a = (byte) 4;
        this.d = a67Var;
        this.c = j;
        this.b = i;
        this.e = chat;
    }

    public gg(Object obj, int i, Object obj2, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.c = j;
    }

    public gg(Object obj, Object obj2, int i, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = j;
    }
}
