package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.SessionsActivity;
public final class g9a implements kb1 {
    public TLObject a = null;
    public TLRPC.TL_error b = null;
    public final SessionsActivity c;

    public g9a(SessionsActivity sessionsActivity) {
        this.c = sessionsActivity;
    }

    @Override
    public final String B0() {
        return null;
    }

    @Override
    public final boolean X(String str, db1 db1Var) {
        this.a = null;
        this.b = null;
        gm.d3(new hw9(this, str, db1Var, (byte) 6), 750L);
        return true;
    }

    @Override
    public final void v(String str) {
        TLObject tLObject = this.a;
        if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = this.c;
            if (z) {
                sessionsActivity.e.add(0, tL_authorization);
                sessionsActivity.V = 4;
                sessionsActivity.p0(false);
            } else {
                sessionsActivity.d.add(0, tL_authorization);
            }
            sessionsActivity.r0();
            sessionsActivity.a.f();
            sessionsActivity.r.m(this.a, 11, 0L);
        } else if (this.b != null) {
            gm.c3(new f9a(this, (byte) 0));
        }
    }

    @Override
    public final void I0(yh7 yh7Var) {
    }

    @Override
    public final void onDismiss() {
    }
}
