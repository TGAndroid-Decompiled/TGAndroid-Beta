package di;

import org.telegram.messenger.an;
import org.telegram.messenger.gs;
import org.telegram.messenger.np;
import org.telegram.messenger.sm;
import org.telegram.messenger.ul;
import org.telegram.messenger.yo;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.cx;
public final class k3 implements RequestDelegate {
    public final int f9134a = 0;
    public final long f9135b;
    public final gs f9136c;
    public final Object d;
    public final Object f9137e;
    public final TLObject f9138f;
    public final Object f9139g;

    public k3(f6 f6Var, vf.b bVar, org.telegram.ui.ActionBar.t1 t1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.f9136c = f6Var;
        this.d = bVar;
        this.f9137e = t1Var;
        this.f9138f = tL_starGiftUnique;
        this.f9135b = j3;
        this.f9139g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9134a) {
            case 0:
                org.telegram.messenger.g0.g3(new m3((f6) this.f9136c, (vf.b) this.d, (org.telegram.ui.ActionBar.t1) this.f9137e, tLObject, (TL_stars.TL_starGiftUnique) this.f9138f, tL_error, this.f9135b, (CharSequence) this.f9139g));
                return;
            case 1:
                np npVar = (np) this.f9136c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f9137e;
                TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = (TLRPC.TL_messages_editChatAdmin) this.f9138f;
                yo yoVar = (yo) this.f9139g;
                if (tL_error == null) {
                    org.telegram.messenger.g0.h3(new sm(npVar, this.f9135b, runnable, 1), 1000L);
                    return;
                }
                org.telegram.messenger.g0.g3(new ul(npVar, tL_error, g2Var, tL_messages_editChatAdmin, 3));
                if (yoVar != null) {
                    org.telegram.messenger.g0.g3(new an(yoVar, tL_error, 0));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new m3((cx) this.f9136c, (org.telegram.ui.ActionBar.t1) this.f9137e, tLObject, (TLRPC.User) this.d, (TLRPC.Chat) this.f9138f, this.f9135b, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f9139g));
                return;
        }
    }

    public k3(np npVar, long j3, Runnable runnable, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, yo yoVar) {
        this.f9136c = npVar;
        this.f9135b = j3;
        this.d = runnable;
        this.f9137e = g2Var;
        this.f9138f = tL_messages_editChatAdmin;
        this.f9139g = yoVar;
    }

    public k3(cx cxVar, org.telegram.ui.ActionBar.t1 t1Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f9136c = cxVar;
        this.f9137e = t1Var;
        this.d = user;
        this.f9138f = chat;
        this.f9135b = j3;
        this.f9139g = tL_messages_checkHistoryImportPeer;
    }
}
