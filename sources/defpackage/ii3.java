package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class ii3 implements RequestDelegate {
    public final byte a = 0;
    public final long b;
    public final jm7 c;
    public final Object d;
    public final Object e;
    public final TLObject f;
    public final Object g;

    public ii3(nk3 nk3Var, he heVar, TLRPC.User user, TLRPC.Chat chat, long j, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.c = nk3Var;
        this.d = heVar;
        this.e = user;
        this.f = chat;
        this.b = j;
        this.g = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.g;
        TLObject tLObject2 = this.f;
        Object obj2 = this.d;
        Object obj3 = this.e;
        jm7 jm7Var = this.c;
        switch (b) {
            case 0:
                gm.c3(new xh3((nk3) jm7Var, (he) obj2, tLObject, (TLRPC.User) obj3, (TLRPC.Chat) tLObject2, this.b, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) obj));
                return;
            case 1:
                oc7 oc7Var = (oc7) jm7Var;
                Runnable runnable = (Runnable) obj2;
                d dVar = (d) obj3;
                TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = (TLRPC.TL_messages_editChatAdmin) tLObject2;
                ac7 ac7Var = (ac7) obj;
                if (tL_error == null) {
                    gm.d3(new ca7(oc7Var, this.b, runnable, (byte) 1), 1000L);
                    return;
                }
                gm.c3(new l97(oc7Var, tL_error, dVar, tL_messages_editChatAdmin, (byte) 3));
                if (ac7Var != null) {
                    gm.c3(new fa7(ac7Var, tL_error, (byte) 1));
                    return;
                }
                return;
            default:
                wsa wsaVar = (wsa) jm7Var;
                wsaVar.getClass();
                gm.c3(new xh3(wsaVar, (k11) obj3, (he) obj2, tLObject, (TL_stars.TL_starGiftUnique) tLObject2, tL_error, this.b, (CharSequence) obj));
                return;
        }
    }

    public ii3(oc7 oc7Var, long j, Runnable runnable, d dVar, TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, ac7 ac7Var) {
        this.c = oc7Var;
        this.b = j;
        this.d = runnable;
        this.e = dVar;
        this.f = tL_messages_editChatAdmin;
        this.g = ac7Var;
    }

    public ii3(wsa wsaVar, k11 k11Var, he heVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, CharSequence charSequence) {
        this.c = wsaVar;
        this.e = k11Var;
        this.d = heVar;
        this.f = tL_starGiftUnique;
        this.b = j;
        this.g = charSequence;
    }
}
