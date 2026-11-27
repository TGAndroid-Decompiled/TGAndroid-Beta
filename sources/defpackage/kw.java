package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class kw implements uu0 {
    public final m a;

    public kw(m mVar) {
        this.a = mVar;
    }

    @Override
    public final wr0 A() {
        return null;
    }

    @Override
    public final void b() {
        tw twVar = this.a.M.L;
        if (twVar != null) {
            twVar.a(true);
        }
    }

    @Override
    public final String g(boolean z, boolean z2) {
        return "UNSUPPORTED";
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final void j() {
        m mVar = this.a;
        o oVar = mVar.M;
        tw twVar = oVar.L;
        if (twVar != null) {
            if (!twVar.h) {
                twVar.h = true;
                twVar.release();
                twVar.L.p();
            }
        } else if (oVar.v0[0] == mVar) {
            oVar.D();
        }
    }

    @Override
    public final void o(int i, boolean z) {
        this.a.g(i, z);
    }

    @Override
    public final void z() {
        m mVar = this.a;
        o oVar = mVar.M;
        if (oVar.v0[0] == mVar) {
            oVar.D();
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(String str) {
    }

    @Override
    public final void f(ArrayList arrayList) {
    }

    @Override
    public final void i(boolean z) {
    }

    @Override
    public final void k(boolean z) {
    }

    @Override
    public final void m(int i) {
    }

    @Override
    public final void p(boolean z) {
    }

    @Override
    public final void r(int i) {
    }

    @Override
    public final void t(boolean z) {
    }

    @Override
    public final void w(boolean z) {
    }

    @Override
    public final void x(int i) {
    }

    @Override
    public final void y(boolean z) {
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
    }

    @Override
    public final void u(int i, int i2, boolean z) {
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
    }

    @Override
    public final void l(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4, String str2) {
    }

    @Override
    public final void q(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4) {
    }
}
