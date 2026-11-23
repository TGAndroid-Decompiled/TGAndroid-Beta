package bi;

import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.mg;
import org.telegram.ui.rm;
public final class g1 implements mg {
    public final TL_stars.TL_starGiftUnique f3600a;
    public final k1 f3601b;

    public g1(k1 k1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f3601b = k1Var;
        this.f3600a = tL_starGiftUnique;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override
    public final int X0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem Y0() {
        return null;
    }

    public final void a(CharSequence charSequence) {
        int i7;
        boolean z10;
        k1 k1Var = this.f3601b;
        org.telegram.ui.Components.n6 n6Var = k1Var.f3744w1;
        k1Var.f3735m1.a(this.f3600a, i10.i(k1Var.f30223a).e(), k1Var.f3740s1.getTextWithEntities(), gd.N0(2131749727, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        k1Var.A1 = codePointCount;
        int i10 = k1Var.f3747z1;
        if (i10 > 0 && (i7 = i10 - codePointCount) <= 15) {
            if (i7 < -9999) {
                i7 = -9999;
            }
            String E = gd.E(i7, ',');
            if (n6Var.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6Var.c(E, z10, true);
            if (n6Var.getVisibility() != 0) {
                n6Var.setVisibility(0);
                n6Var.setAlpha(0.0f);
                n6Var.setScaleX(0.5f);
                n6Var.setScaleY(0.5f);
            }
            n6Var.animate().setListener(null).cancel();
            n6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i7 < 0) {
                org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.f29672p7, k1Var.J0);
                return;
            } else {
                org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.f29843y6, k1Var.J0);
                return;
            }
        }
        n6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ai.g0(this, 1));
    }

    @Override
    public final rm a0() {
        return null;
    }

    @Override
    public final boolean b1(long j3) {
        return false;
    }

    @Override
    public final boolean d1() {
        return false;
    }

    @Override
    public final void i1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean l1() {
        return false;
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final TLRPC.Peer o() {
        return null;
    }

    @Override
    public final void u1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override
    public final boolean v1() {
        return false;
    }

    @Override
    public final boolean w0() {
        return true;
    }

    @Override
    public final void Q(boolean z10) {
    }

    @Override
    public final void U0(int i7) {
    }

    @Override
    public final void i2(int i7) {
    }

    @Override
    public final void n2(boolean z10) {
    }

    @Override
    public final void u(float f10) {
    }

    @Override
    public final void w(boolean z10) {
    }

    @Override
    public final void E() {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void N() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void g0() {
    }

    @Override
    public final void h2() {
    }

    @Override
    public final void j1() {
    }

    @Override
    public final void m2() {
    }

    @Override
    public final void n1() {
    }

    @Override
    public final void o1() {
    }

    @Override
    public final void q1() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void r2() {
    }

    @Override
    public final void t2() {
    }

    @Override
    public final void v2() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void K(float f10, int i7) {
    }

    @Override
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void G(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
    }

    @Override
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }
}
