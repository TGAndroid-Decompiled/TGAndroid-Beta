package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class au4 implements hy1 {
    public final TL_stars.TL_starGiftUnique a;
    public final du4 b;

    public au4(du4 du4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = du4Var;
        this.a = tL_starGiftUnique;
    }

    @Override
    public final void C0(CharSequence charSequence, boolean z, boolean z2) {
        b(charSequence);
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
    public final void P0(CharSequence charSequence) {
        b(charSequence);
    }

    @Override
    public final boolean Q0() {
        return false;
    }

    @Override
    public final boolean R() {
        return true;
    }

    public final void b(CharSequence charSequence) {
        int i;
        boolean z;
        du4 du4Var = this.b;
        hn hnVar = du4Var.v1;
        du4Var.l1.a(this.a, y6c.h(du4Var.a).e(), du4Var.r1.getTextWithEntities(), k96.M0(2131749728, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        du4Var.z1 = codePointCount;
        int i2 = du4Var.y1;
        if (i2 > 0 && (i = i2 - codePointCount) <= 15) {
            if (i < -9999) {
                i = -9999;
            }
            String E = k96.E(i, ',');
            if (hnVar.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            hnVar.c(E, z, true);
            if (hnVar.getVisibility() != 0) {
                hnVar.setVisibility(0);
                hnVar.setAlpha(0.0f);
                hnVar.setScaleX(0.5f);
                hnVar.setScaleY(0.5f);
            }
            hnVar.animate().setListener(null).cancel();
            hnVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i < 0) {
                zkb.U(hnVar, bkb.o7, du4Var.J0);
                return;
            } else {
                zkb.U(hnVar, bkb.x6, du4Var.J0);
                return;
            }
        }
        hnVar.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new im2(this, (byte) 26));
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
    public final void u(CharSequence charSequence, boolean z, int i, int i2, long j) {
    }

    @Override
    public final void k1(int i, int i2, int i3, long j, long j2, boolean z) {
    }
}
