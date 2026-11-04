package ai;

import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.uf;
import org.telegram.ui.mm;
public final class f1 implements uf {
    public final TL_stars.TL_starGiftUnique f640a;
    public final i1 f641b;

    public f1(i1 i1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f641b = i1Var;
        this.f640a = tL_starGiftUnique;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers M() {
        return null;
    }

    @Override
    public final int O0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem R0() {
        return null;
    }

    @Override
    public final boolean T0(long j10) {
        return false;
    }

    @Override
    public final boolean V0() {
        return false;
    }

    @Override
    public final void Y0(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    public final void a(CharSequence charSequence) {
        int i3;
        boolean z10;
        i1 i1Var = this.f641b;
        org.telegram.ui.Components.h6 h6Var = i1Var.f701t1;
        i1Var.f693j1.a(this.f640a, h10.i(i1Var.f28583a).e(), i1Var.f697p1.getTextWithEntities(), bd.M0(2131749753, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        i1Var.f705x1 = codePointCount;
        int i10 = i1Var.f704w1;
        if (i10 > 0 && (i3 = i10 - codePointCount) <= 15) {
            if (i3 < -9999) {
                i3 = -9999;
            }
            String E = bd.E(i3, ',');
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
            if (i3 < 0) {
                org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.f28102p7, i1Var.J0);
                return;
            } else {
                org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.f28273y6, i1Var.J0);
                return;
            }
        }
        h6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new e1(this, 0));
    }

    @Override
    public final boolean a1() {
        return false;
    }

    @Override
    public final mm i0() {
        return null;
    }

    @Override
    public final void j1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean k1() {
        return false;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final TLRPC.Peer t() {
        return null;
    }

    @Override
    public final boolean u0() {
        return true;
    }

    @Override
    public final void A(boolean z10) {
    }

    @Override
    public final void M0(int i3) {
    }

    @Override
    public final void T1(int i3) {
    }

    @Override
    public final void c0(boolean z10) {
    }

    @Override
    public final void c2(boolean z10) {
    }

    @Override
    public final void x(float f10) {
    }

    @Override
    public final void E() {
    }

    @Override
    public final void F() {
    }

    @Override
    public final void F0() {
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void O1() {
    }

    @Override
    public final void Z0() {
    }

    @Override
    public final void a0() {
    }

    @Override
    public final void b1() {
    }

    @Override
    public final void b2() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void e1() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void g0() {
    }

    @Override
    public final void g1() {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void m1() {
    }

    @Override
    public final void n2() {
    }

    @Override
    public final void q0() {
    }

    @Override
    public final void r2() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void O(float f10, int i3) {
    }

    @Override
    public final void h1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void G(CharSequence charSequence, boolean z10, int i3, int i10, long j10) {
    }

    @Override
    public final void d2(int i3, int i10, int i11, long j10, long j11, boolean z10) {
    }
}
