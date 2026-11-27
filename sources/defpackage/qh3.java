package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
public final class qh3 implements RequestDelegate {
    public final byte a = 1;
    public final long b;
    public final fn7 c;
    public final Object d;
    public final Object e;
    public final TLObject f;
    public final Object g;

    public qh3(uj3 uj3Var, id idVar, TLRPC.User user, TLRPC.Chat chat, long j, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.c = uj3Var;
        this.d = idVar;
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
        fn7 fn7Var = this.c;
        switch (b) {
            case 0:
                hl.c3(new eh3((uj3) fn7Var, (id) obj2, tLObject, (TLRPC.User) obj3, (TLRPC.Chat) tLObject2, this.b, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) obj));
                return;
            case 1:
                uc7 uc7Var = (uc7) fn7Var;
                Runnable runnable = (Runnable) obj2;
                e eVar = (e) obj3;
                TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = (TLRPC.TL_messages_editChatAdmin) tLObject2;
                gc7 gc7Var = (gc7) obj;
                if (tL_error == null) {
                    hl.d3(new ka7(uc7Var, this.b, runnable, (byte) 1), 1000L);
                    return;
                }
                hl.c3(new o97(uc7Var, tL_error, eVar, tL_messages_editChatAdmin, (byte) 3));
                if (gc7Var != null) {
                    hl.c3(new na7(gc7Var, tL_error, (byte) 1));
                    return;
                }
                return;
            default:
                wua wuaVar = (wua) fn7Var;
                wuaVar.getClass();
                hl.c3(new eh3(wuaVar, (l01) obj3, (id) obj2, tLObject, (TL_stars.TL_starGiftUnique) tLObject2, tL_error, this.b, (CharSequence) obj));
                return;
        }
    }

    public qh3(uc7 uc7Var, long j, Runnable runnable, e eVar, TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, gc7 gc7Var) {
        this.c = uc7Var;
        this.b = j;
        this.d = runnable;
        this.e = eVar;
        this.f = tL_messages_editChatAdmin;
        this.g = gc7Var;
    }

    public qh3(wua wuaVar, l01 l01Var, id idVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, CharSequence charSequence) {
        this.c = wuaVar;
        this.e = l01Var;
        this.d = idVar;
        this.f = tL_starGiftUnique;
        this.b = j;
        this.g = charSequence;
    }
}
