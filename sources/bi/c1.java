package bi;

import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.kg;
import org.telegram.ui.rm;
public final class c1 implements kg {
    public final TL_stars.TL_starGiftUnique f3451a;
    public final g1 f3452b;

    public c1(g1 g1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f3452b = g1Var;
        this.f3451a = tL_starGiftUnique;
    }

    @Override
    public final boolean E0() {
        return true;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    public final void a(CharSequence charSequence) {
        int i7;
        boolean z10;
        g1 g1Var = this.f3452b;
        org.telegram.ui.Components.n6 n6Var = g1Var.f3599w1;
        g1Var.f3590m1.a(this.f3451a, j10.i(g1Var.f30187a).e(), g1Var.f3595s1.getTextWithEntities(), gd.M0(2131749728, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        g1Var.A1 = codePointCount;
        int i10 = g1Var.f3602z1;
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
                org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.f29615p7, g1Var.J0);
                return;
            } else {
                org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.f29786y6, g1Var.J0);
                return;
            }
        }
        n6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ai.j0(this, 1));
    }

    @Override
    public final int b1() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem c1() {
        return null;
    }

    @Override
    public final boolean e1(long j3) {
        return false;
    }

    @Override
    public final boolean g1() {
        return false;
    }

    @Override
    public final void j1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final rm m0() {
        return null;
    }

    @Override
    public final boolean m1() {
        return false;
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final TLRPC.Peer t() {
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
    public final void A(boolean z10) {
    }

    @Override
    public final void a0(boolean z10) {
    }

    @Override
    public final void a1(int i7) {
    }

    @Override
    public final void k2(int i7) {
    }

    @Override
    public final void n2(boolean z10) {
    }

    @Override
    public final void x(float f10) {
    }

    @Override
    public final void B2() {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void G() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void J0() {
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void b0() {
    }

    @Override
    public final void d() {
    }

    @Override
    public final void g() {
    }

    @Override
    public final void i2() {
    }

    @Override
    public final void l1() {
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
    public final void r2() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void w2() {
    }

    @Override
    public final void Q(float f10, int i7) {
    }

    @Override
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void H(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
    }

    @Override
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }
}
