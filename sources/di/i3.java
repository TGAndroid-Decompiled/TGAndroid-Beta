package di;

import org.telegram.messenger.bm;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.um;
import org.telegram.messenger.xm;
import org.telegram.messenger.yo;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.yw;
public final class i3 implements RequestDelegate {
    public final int f8791a = 0;
    public final long f8792b;
    public final is f8793c;
    public final Object d;
    public final Object f8794e;
    public final TLObject f8795f;
    public final Object f8796g;

    public i3(c6 c6Var, vf.b bVar, org.telegram.ui.ActionBar.t1 t1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.f8793c = c6Var;
        this.d = bVar;
        this.f8794e = t1Var;
        this.f8795f = tL_starGiftUnique;
        this.f8792b = j3;
        this.f8796g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8791a) {
            case 0:
                org.telegram.messenger.g0.h3(new n3((c6) this.f8793c, (vf.b) this.d, (org.telegram.ui.ActionBar.t1) this.f8794e, tLObject, (TL_stars.TL_starGiftUnique) this.f8795f, tL_error, this.f8792b, (CharSequence) this.f8796g));
                return;
            case 1:
                np npVar = (np) this.f8793c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f8794e;
                TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = (TLRPC.TL_messages_editChatAdmin) this.f8795f;
                yo yoVar = (yo) this.f8796g;
                if (tL_error == null) {
                    org.telegram.messenger.g0.i3(new um(npVar, this.f8792b, runnable, 1), 1000L);
                    return;
                }
                org.telegram.messenger.g0.h3(new bm(npVar, tL_error, e2Var, tL_messages_editChatAdmin, 3));
                if (yoVar != null) {
                    org.telegram.messenger.g0.h3(new xm(yoVar, tL_error, 0));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new n3((yw) this.f8793c, (org.telegram.ui.ActionBar.t1) this.f8794e, tLObject, (TLRPC.User) this.d, (TLRPC.Chat) this.f8795f, this.f8792b, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f8796g));
                return;
        }
    }

    public i3(np npVar, long j3, Runnable runnable, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, yo yoVar) {
        this.f8793c = npVar;
        this.f8792b = j3;
        this.d = runnable;
        this.f8794e = e2Var;
        this.f8795f = tL_messages_editChatAdmin;
        this.f8796g = yoVar;
    }

    public i3(yw ywVar, org.telegram.ui.ActionBar.t1 t1Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f8793c = ywVar;
        this.f8794e = t1Var;
        this.d = user;
        this.f8795f = chat;
        this.f8792b = j3;
        this.f8796g = tL_messages_checkHistoryImportPeer;
    }
}
