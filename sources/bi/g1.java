package bi;

import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
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
        k1 k1Var = this.f3601b;
        org.telegram.ui.Components.o6 o6Var = k1Var.f3744w1;
        k1Var.f3735m1.a(this.f3600a, k10.i(k1Var.f30139a).e(), k1Var.f3740s1.getTextWithEntities(), hd.N0(2131749727, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        k1Var.A1 = codePointCount;
        int i10 = k1Var.f3747z1;
        if (i10 > 0 && (i7 = i10 - codePointCount) <= 15) {
            if (i7 < -9999) {
                i7 = -9999;
            }
            String E = hd.E(i7, ',');
            if (o6Var.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            o6Var.c(E, z10, true);
            if (o6Var.getVisibility() != 0) {
                o6Var.setVisibility(0);
                o6Var.setAlpha(0.0f);
                o6Var.setScaleX(0.5f);
                o6Var.setScaleY(0.5f);
            }
            o6Var.animate().setListener(null).cancel();
            o6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i7 < 0) {
                org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.f29568p7, k1Var.J0);
                return;
            } else {
                org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.f29739y6, k1Var.J0);
                return;
            }
        }
        o6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ai.f0(this, 1));
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
