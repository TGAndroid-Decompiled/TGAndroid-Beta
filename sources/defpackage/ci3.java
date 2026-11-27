package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ci3 implements xy1, jbb {
    public final uj3 a;

    public ci3(uj3 uj3Var) {
        this.a = uj3Var;
    }

    @Override
    public final int E0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem F0() {
        return null;
    }

    @Override
    public final boolean H0(long j) {
        return false;
    }

    @Override
    public final boolean L0() {
        return false;
    }

    @Override
    public final ou1 R() {
        return null;
    }

    @Override
    public final void R0(CharSequence charSequence, boolean z, boolean z2) {
        uj3 uj3Var = this.a;
        hl.d3(new ch3(uj3Var, (byte) 18), 100L);
        sea seaVar = uj3Var.I2;
        if (seaVar != null) {
            if (z) {
                if (seaVar.h) {
                    seaVar.e(charSequence, true);
                    return;
                }
                return;
            }
            wd3 wd3Var = uj3Var.J2;
            if (wd3Var != null) {
                hl.r(wd3Var);
            }
            wd3 wd3Var2 = new wd3(this, charSequence, (byte) 4);
            uj3Var.J2 = wd3Var2;
            hl.d3(wd3Var2, 1000L);
        }
    }

    @Override
    public final boolean T0() {
        return false;
    }

    @Override
    public final nbb b(long j) {
        og3 og3Var;
        ii3 ii3Var = this.a.F0;
        if (ii3Var != null) {
            og3Var = ii3Var.e(j);
        } else {
            og3Var = null;
        }
        return nbb.c(og3Var);
    }

    @Override
    public final void c(long j, pqa pqaVar) {
        uj3 uj3Var = this.a;
        if (uj3Var.F0 != null) {
            uj3Var.R4(false, true);
            uj3Var.R = true;
            uj3Var.fragmentView.invalidate();
            if (j != 0 && j != uj3Var.getUserConfig().e()) {
                uj3Var.F0.k(j);
            } else {
                uj3Var.F0.T.g1(0, 0);
            }
            uj3Var.f0[0].a.getViewTreeObserver().addOnPreDrawListener(new z(this, pqaVar, (byte) 2));
            return;
        }
        pqaVar.run();
    }

    @Override
    public final boolean e0() {
        return true;
    }

    @Override
    public final boolean e1() {
        return false;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final TLRPC.Peer k() {
        return null;
    }

    @Override
    public final void x(CharSequence charSequence, boolean z, int i, int i2, long j) {
        uj3 uj3Var = this.a;
        ArrayList arrayList = uj3Var.K2;
        if (uj3Var.E2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList2.add(jf7.a(((Long) uj3Var.K2.get(i3)).longValue(), 0L));
            }
            uj3Var.E2.q(uj3Var, arrayList2, charSequence, false, z, i, i2, null);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers y() {
        return null;
    }

    @Override
    public final void B1() {
    }

    @Override
    public final void C() {
    }

    @Override
    public final void D1() {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void O1() {
    }

    @Override
    public final void P1() {
    }

    @Override
    public final void S0() {
    }

    @Override
    public final void S1() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void W0() {
    }

    @Override
    public final void X0() {
    }

    @Override
    public final void Z0() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void f0() {
    }

    @Override
    public final void g1() {
    }

    @Override
    public final void i0() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void p1() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void C1(int i) {
    }

    @Override
    public final void D(boolean z) {
    }

    @Override
    public final void E1(boolean z) {
    }

    @Override
    public final void d1(CharSequence charSequence) {
    }

    @Override
    public final void o(float f) {
    }

    @Override
    public final void p(boolean z) {
    }

    @Override
    public final void z0(int i) {
    }

    @Override
    public final void B(float f, int i) {
    }

    @Override
    public final void b1(View view, CharSequence charSequence, boolean z) {
    }

    @Override
    public final void H1(int i, int i2, int i3, long j, long j2, boolean z) {
    }
}
