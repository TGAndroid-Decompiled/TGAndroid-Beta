package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.SessionsActivity;
public final class f7a implements ca1 {
    public TLObject a = null;
    public TLRPC.TL_error b = null;
    public final SessionsActivity c;

    public f7a(SessionsActivity sessionsActivity) {
        this.c = sessionsActivity;
    }

    @Override
    public final void G(String str) {
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
            sessionsActivity.r.m(this.a, 11, 0L);
        } else if (this.b != null) {
            gl.d3(new e7a(this, (byte) 0));
        }
    }

    @Override
    public final boolean W0(String str, u91 u91Var) {
        this.a = null;
        this.b = null;
        gl.e3(new q3a(this, str, u91Var, (byte) 3), 750L);
        return true;
    }

    @Override
    public final String Z0() {
        return null;
    }

    @Override
    public final void onDismiss() {
    }

    @Override
    public final void Q1(vf7 vf7Var) {
    }
}
