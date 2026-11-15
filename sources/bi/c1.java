package bi;

import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cg;
import org.telegram.ui.qm;
public final class c1 implements cg {
    public final TL_stars.TL_starGiftUnique f3407a;
    public final f1 f3408b;

    public c1(f1 f1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f3408b = f1Var;
        this.f3407a = tL_starGiftUnique;
    }

    @Override
    public final boolean E0() {
        return true;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers O() {
        return null;
    }

    public final void a(CharSequence charSequence) {
        int i7;
        boolean z10;
        f1 f1Var = this.f3408b;
        org.telegram.ui.Components.h6 h6Var = f1Var.f3508w1;
        f1Var.f3499m1.a(this.f3407a, m10.i(f1Var.f29679a).e(), f1Var.f3504s1.getTextWithEntities(), hd.M0(2131749745, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        f1Var.A1 = codePointCount;
        int i10 = f1Var.f3511z1;
        if (i10 > 0 && (i7 = i10 - codePointCount) <= 15) {
            if (i7 < -9999) {
                i7 = -9999;
            }
            String E = hd.E(i7, ',');
            if (h6Var.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h6Var.c(E, z10, true);
            if (h6Var.getVisibility() != 0) {
                h6Var.setVisibility(0);
                h6Var.setAlpha(0.0f);
                h6Var.setScaleX(0.5f);
                h6Var.setScaleY(0.5f);
            }
            h6Var.animate().setListener(null).cancel();
            h6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i7 < 0) {
                org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.f29070p7, f1Var.J0);
                return;
            } else {
                org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.f29241y6, f1Var.J0);
                return;
            }
        }
        h6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ai.j0(this, 1));
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
    public final boolean l() {
        return false;
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
    public final qm p0() {
        return null;
    }

    @Override
    public final TLRPC.Peer s() {
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
    public final void C(boolean z10) {
    }

    @Override
    public final void a1(int i7) {
    }

    @Override
    public final void b0(boolean z10) {
    }

    @Override
    public final void k2(int i7) {
    }

    @Override
    public final void n2(boolean z10) {
    }

    @Override
    public final void y(float f10) {
    }

    @Override
    public final void B2() {
    }

    @Override
    public final void E() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void I() {
    }

    @Override
    public final void J0() {
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void Y() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void d() {
    }

    @Override
    public final void i2() {
    }

    @Override
    public final void l1() {
    }

    @Override
    public final void m0() {
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
    public final void v() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void w2() {
    }

    @Override
    public final void W(float f10, int i7) {
    }

    @Override
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void M(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
    }

    @Override
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }
}
