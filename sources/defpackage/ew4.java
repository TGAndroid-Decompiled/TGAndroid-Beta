package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class ew4 implements xy1 {
    public final TL_stars.TL_starGiftUnique a;
    public final hw4 b;

    public ew4(hw4 hw4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = hw4Var;
        this.a = tL_starGiftUnique;
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
        b(charSequence);
    }

    @Override
    public final boolean T0() {
        return false;
    }

    public final void b(CharSequence charSequence) {
        int i;
        boolean z;
        hw4 hw4Var = this.b;
        in inVar = hw4Var.v1;
        hw4Var.l1.a(this.a, yac.h(hw4Var.a).e(), hw4Var.r1.getTextWithEntities(), ob6.M0(2131749690, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        hw4Var.z1 = codePointCount;
        int i2 = hw4Var.y1;
        if (i2 > 0 && (i = i2 - codePointCount) <= 15) {
            if (i < -9999) {
                i = -9999;
            }
            String E = ob6.E(i, ',');
            if (inVar.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            inVar.c(E, z, true);
            if (inVar.getVisibility() != 0) {
                inVar.setVisibility(0);
                inVar.setAlpha(0.0f);
                inVar.setScaleX(0.5f);
                inVar.setScaleY(0.5f);
            }
            inVar.animate().setListener(null).cancel();
            inVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i < 0) {
                yob.U(inVar, aob.p7, hw4Var.J0);
                return;
            } else {
                yob.U(inVar, aob.y6, hw4Var.J0);
                return;
            }
        }
        inVar.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new cn2(this, (byte) 25));
    }

    @Override
    public final void d1(CharSequence charSequence) {
        b(charSequence);
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
    public final void x(CharSequence charSequence, boolean z, int i, int i2, long j) {
    }

    @Override
    public final void H1(int i, int i2, int i3, long j, long j2, boolean z) {
    }
}
