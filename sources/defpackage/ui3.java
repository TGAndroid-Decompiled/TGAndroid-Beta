package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ui3 implements uz1, m9b {
    public final nk3 a;

    public ui3(nk3 nk3Var) {
        this.a = nk3Var;
    }

    @Override
    public final int B0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem C0() {
        return null;
    }

    @Override
    public final boolean E0(long j) {
        return false;
    }

    @Override
    public final boolean G0() {
        return false;
    }

    @Override
    public final void H0(CharSequence charSequence, boolean z, boolean z2) {
        nk3 nk3Var = this.a;
        gm.d3(new di3(nk3Var, (byte) 18), 100L);
        bda bdaVar = nk3Var.I2;
        if (bdaVar != null) {
            if (z) {
                if (bdaVar.h) {
                    bdaVar.e(charSequence, true);
                    return;
                }
                return;
            }
            rd3 rd3Var = nk3Var.J2;
            if (rd3Var != null) {
                gm.r(rd3Var);
            }
            rd3 rd3Var2 = new rd3(this, charSequence, (byte) 6);
            nk3Var.J2 = rd3Var2;
            gm.d3(rd3Var2, 1000L);
        }
    }

    @Override
    public final nv1 J() {
        return null;
    }

    @Override
    public final boolean K0() {
        return false;
    }

    @Override
    public final q9b b(long j) {
        hh3 hh3Var;
        aj3 aj3Var = this.a.F0;
        if (aj3Var != null) {
            hh3Var = aj3Var.e(j);
        } else {
            hh3Var = null;
        }
        return q9b.c(hh3Var);
    }

    @Override
    public final boolean b0() {
        return true;
    }

    @Override
    public final void c(long j, toa toaVar) {
        nk3 nk3Var = this.a;
        if (nk3Var.F0 != null) {
            nk3Var.R4(false, true);
            nk3Var.R = true;
            nk3Var.fragmentView.invalidate();
            if (j != 0 && j != nk3Var.getUserConfig().e()) {
                nk3Var.F0.k(j);
            } else {
                nk3Var.F0.T.g1(0, 0);
            }
            nk3Var.f0[0].a.getViewTreeObserver().addOnPreDrawListener(new xj3(this, toaVar, (byte) 0));
            return;
        }
        toaVar.run();
    }

    @Override
    public final boolean d1() {
        return false;
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final TLRPC.Peer l() {
        return null;
    }

    @Override
    public final void w(CharSequence charSequence, boolean z, int i, int i2, long j) {
        nk3 nk3Var = this.a;
        ArrayList arrayList = nk3Var.K2;
        if (nk3Var.E2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList2.add(bf7.a(((Long) nk3Var.K2.get(i3)).longValue(), 0L));
            }
            nk3Var.E2.q(nk3Var, arrayList2, charSequence, false, z, i, i2, null);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers x() {
        return null;
    }

    @Override
    public final void A1() {
    }

    @Override
    public final void B() {
    }

    @Override
    public final void C(boolean z) {
    }

    @Override
    public final void E1(boolean z) {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void H1() {
    }

    @Override
    public final void I() {
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void O0() {
    }

    @Override
    public final void R1() {
    }

    @Override
    public final void W0() {
    }

    @Override
    public final void Y0() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c0() {
    }

    @Override
    public final void c1(CharSequence charSequence) {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void e1() {
    }

    @Override
    public final void f0() {
    }

    @Override
    public final void j1() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void n0() {
    }

    @Override
    public final void o(float f) {
    }

    @Override
    public final void p(boolean z) {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void v1(int i) {
    }

    @Override
    public final void z0(int i) {
    }

    @Override
    public final void y(float f, int i) {
    }

    @Override
    public final void a1(View view, CharSequence charSequence, boolean z) {
    }

    @Override
    public final void F1(int i, int i2, int i3, long j, long j2, boolean z) {
    }
}
