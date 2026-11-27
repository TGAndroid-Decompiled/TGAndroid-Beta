package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.SessionsActivity;
public final class waa implements ka1 {
    public TLObject a = null;
    public TLRPC.TL_error b = null;
    public final SessionsActivity c;

    public waa(SessionsActivity sessionsActivity) {
        this.c = sessionsActivity;
    }

    @Override
    public final boolean B(String str, da1 da1Var) {
        this.a = null;
        this.b = null;
        hl.d3(new jr9(this, str, da1Var, (byte) 12), 750L);
        return true;
    }

    @Override
    public final String I() {
        return null;
    }

    @Override
    public final void q(String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.c;
            if (z) {
                sessionsActivity.e.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.o0(false);
            } else {
                sessionsActivity.d.add(0, tL_authorization);
            }
            sessionsActivity.q0();
            sessionsActivity.a.f();
            sessionsActivity.r.m(0L, this.a, 11);
        } else if (this.b != null) {
            hl.c3(new vaa(this, (byte) 0));
        }
    }

    @Override
    public final void onDismiss() {
    }

    @Override
    public final void p0(fi7 fi7Var) {
    }
}
