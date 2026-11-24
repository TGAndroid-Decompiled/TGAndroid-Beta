package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class wg3 implements RequestDelegate {
    public final byte a = 0;
    public final long b;
    public final gk7 c;
    public final Object d;
    public final Object e;
    public final TLObject f;
    public final Object g;

    public wg3(cj3 cj3Var, hd hdVar, TLRPC.User user, TLRPC.Chat chat, long j, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.c = cj3Var;
        this.d = hdVar;
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
        gk7 gk7Var = this.c;
        switch (b) {
            case 0:
                gl.c3(new kg3((cj3) gk7Var, (hd) obj2, tLObject, (TLRPC.User) obj3, (TLRPC.Chat) tLObject2, this.b, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) obj));
                return;
            case 1:
                na7 na7Var = (na7) gk7Var;
                Runnable runnable = (Runnable) obj2;
                d dVar = (d) obj3;
                TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = (TLRPC.TL_messages_editChatAdmin) tLObject2;
                z97 z97Var = (z97) obj;
                if (tL_error == null) {
                    gl.d3(new a87(na7Var, this.b, runnable, (byte) 1), 1000L);
                    return;
                }
                gl.c3(new s67(na7Var, tL_error, dVar, tL_messages_editChatAdmin, (byte) 3));
                if (z97Var != null) {
                    gl.c3(new e87(z97Var, tL_error, (byte) 1));
                    return;
                }
                return;
            default:
                vqa vqaVar = (vqa) gk7Var;
                vqaVar.getClass();
                gl.c3(new kg3(vqaVar, (c01) obj3, (hd) obj2, tLObject, (TL_stars.TL_starGiftUnique) tLObject2, tL_error, this.b, (CharSequence) obj));
                return;
        }
    }

    public wg3(na7 na7Var, long j, Runnable runnable, d dVar, TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, z97 z97Var) {
        this.c = na7Var;
        this.b = j;
        this.d = runnable;
        this.e = dVar;
        this.f = tL_messages_editChatAdmin;
        this.g = z97Var;
    }

    public wg3(vqa vqaVar, c01 c01Var, hd hdVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, CharSequence charSequence) {
        this.c = vqaVar;
        this.e = c01Var;
        this.d = hdVar;
        this.f = tL_starGiftUnique;
        this.b = j;
        this.g = charSequence;
    }
}
