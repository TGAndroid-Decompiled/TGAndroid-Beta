package bi;

import org.telegram.messenger.an;
import org.telegram.messenger.bp;
import org.telegram.messenger.em;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.xm;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.zw;
public final class g4 implements RequestDelegate {
    public final int f3930a = 0;
    public final long f3931b;
    public final ls f3932c;
    public final Object d;
    public final Object f3933e;
    public final TLObject f3934f;
    public final Object f3935g;

    public g4(k7 k7Var, vf.b bVar, org.telegram.ui.ActionBar.u1 u1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.f3932c = k7Var;
        this.d = bVar;
        this.f3933e = u1Var;
        this.f3934f = tL_starGiftUnique;
        this.f3931b = j3;
        this.f3935g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3930a) {
            case 0:
                org.telegram.messenger.g0.h3(new m4((k7) this.f3932c, (vf.b) this.d, (org.telegram.ui.ActionBar.u1) this.f3933e, tLObject, (TL_stars.TL_starGiftUnique) this.f3934f, tL_error, this.f3931b, (CharSequence) this.f3935g));
                return;
            case 1:
                qp qpVar = (qp) this.f3932c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f3933e;
                TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = (TLRPC.TL_messages_editChatAdmin) this.f3934f;
                bp bpVar = (bp) this.f3935g;
                if (tL_error == null) {
                    org.telegram.messenger.g0.i3(new xm(qpVar, this.f3931b, runnable, 1), 1000L);
                    return;
                }
                org.telegram.messenger.g0.h3(new em(qpVar, tL_error, f2Var, tL_messages_editChatAdmin, 3));
                if (bpVar != null) {
                    org.telegram.messenger.g0.h3(new an(bpVar, tL_error, 0));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new m4((zw) this.f3932c, (org.telegram.ui.ActionBar.u1) this.f3933e, tLObject, (TLRPC.User) this.d, (TLRPC.Chat) this.f3934f, this.f3931b, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f3935g));
                return;
        }
    }

    public g4(qp qpVar, long j3, Runnable runnable, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, bp bpVar) {
        this.f3932c = qpVar;
        this.f3931b = j3;
        this.d = runnable;
        this.f3933e = f2Var;
        this.f3934f = tL_messages_editChatAdmin;
        this.f3935g = bpVar;
    }

    public g4(zw zwVar, org.telegram.ui.ActionBar.u1 u1Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f3932c = zwVar;
        this.f3933e = u1Var;
        this.d = user;
        this.f3934f = chat;
        this.f3931b = j3;
        this.f3935g = tL_messages_checkHistoryImportPeer;
    }
}
