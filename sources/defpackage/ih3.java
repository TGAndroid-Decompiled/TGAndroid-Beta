package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ih3 implements hy1, k7b {
    public final cj3 a;

    public ih3(cj3 cj3Var) {
        this.a = cj3Var;
    }

    @Override
    public final void C0(CharSequence charSequence, boolean z, boolean z2) {
        cj3 cj3Var = this.a;
        gl.e3(new sg3(cj3Var, (byte) 17), 100L);
        bba bbaVar = cj3Var.I2;
        if (bbaVar != null) {
            if (z) {
                if (bbaVar.h) {
                    bbaVar.e(charSequence, true);
                    return;
                }
                return;
            }
            wc3 wc3Var = cj3Var.J2;
            if (wc3Var != null) {
                gl.r(wc3Var);
            }
            wc3 wc3Var2 = new wc3(this, charSequence, (byte) 5);
            cj3Var.J2 = wc3Var2;
            gl.e3(wc3Var2, 1000L);
        }
    }

    @Override
    public final bu1 G() {
        return null;
    }

    @Override
    public final boolean H0() {
        return false;
    }

    @Override
    public final boolean Q0() {
        return false;
    }

    @Override
    public final boolean R() {
        return true;
    }

    @Override
    public final o7b b(long j) {
        uf3 uf3Var;
        oh3 oh3Var = this.a.F0;
        if (oh3Var != null) {
            uf3Var = oh3Var.e(j);
        } else {
            uf3Var = null;
        }
        return o7b.c(uf3Var);
    }

    @Override
    public final void c(long j, sma smaVar) {
        cj3 cj3Var = this.a;
        if (cj3Var.F0 != null) {
            cj3Var.N4(false, true);
            cj3Var.R = true;
            cj3Var.fragmentView.invalidate();
            if (j != 0 && j != cj3Var.getUserConfig().e()) {
                cj3Var.F0.k(j);
            } else {
                cj3Var.F0.T.g1(0, 0);
            }
            cj3Var.f0[0].a.getViewTreeObserver().addOnPreDrawListener(new ni3(this, smaVar, (byte) 0));
            return;
        }
        smaVar.run();
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final int h() {
        return 0;
    }

    @Override
    public final TLRPC.Peer i() {
        return null;
    }

    @Override
    public final int o0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem t0() {
        return null;
    }

    @Override
    public final void u(CharSequence charSequence, boolean z, int i, int i2, long j) {
        cj3 cj3Var = this.a;
        ArrayList arrayList = cj3Var.K2;
        if (cj3Var.E2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList2.add(zc7.a(((Long) cj3Var.K2.get(i3)).longValue(), 0L));
            }
            cj3Var.E2.r(cj3Var, arrayList2, charSequence, false, z, i, i2, null);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers v() {
        return null;
    }

    @Override
    public final boolean x0(long j) {
        return false;
    }

    @Override
    public final boolean y0() {
        return false;
    }

    @Override
    public final void B() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void R0() {
    }

    @Override
    public final void T() {
    }

    @Override
    public final void W0() {
    }

    @Override
    public final void Z() {
    }

    @Override
    public final void a() {
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
    public final void g1() {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void o1() {
    }

    @Override
    public final void p1() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void y() {
    }

    @Override
    public final void A(boolean z) {
    }

    @Override
    public final void P0(CharSequence charSequence) {
    }

    @Override
    public final void f1(int i) {
    }

    @Override
    public final void j1(boolean z) {
    }

    @Override
    public final void k(float f) {
    }

    @Override
    public final void m(boolean z) {
    }

    @Override
    public final void n0(int i) {
    }

    @Override
    public final void w(float f, int i) {
    }

    @Override
    public final void O0(View view, CharSequence charSequence, boolean z) {
    }

    @Override
    public final void k1(int i, int i2, int i3, long j, long j2, boolean z) {
    }
}
