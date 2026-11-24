package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class cw4 implements uz1 {
    public final TL_stars.TL_starGiftUnique a;
    public final fw4 b;

    public cw4(fw4 fw4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = fw4Var;
        this.a = tL_starGiftUnique;
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
        b(charSequence);
    }

    @Override
    public final nv1 J() {
        return null;
    }

    @Override
    public final boolean K0() {
        return false;
    }

    public final void b(CharSequence charSequence) {
        int i;
        boolean z;
        fw4 fw4Var = this.b;
        io ioVar = fw4Var.v1;
        fw4Var.l1.a(this.a, z8c.h(fw4Var.a).e(), fw4Var.r1.getTextWithEntities(), jb6.M0(2131749677, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        fw4Var.z1 = codePointCount;
        int i2 = fw4Var.y1;
        if (i2 > 0 && (i = i2 - codePointCount) <= 15) {
            if (i < -9999) {
                i = -9999;
            }
            String E = jb6.E(i, ',');
            if (ioVar.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            ioVar.c(E, z, true);
            if (ioVar.getVisibility() != 0) {
                ioVar.setVisibility(0);
                ioVar.setAlpha(0.0f);
                ioVar.setScaleX(0.5f);
                ioVar.setScaleY(0.5f);
            }
            ioVar.animate().setListener(null).cancel();
            ioVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i < 0) {
                anb.U(ioVar, cmb.o7, fw4Var.J0);
                return;
            } else {
                anb.U(ioVar, cmb.x6, fw4Var.J0);
                return;
            }
        }
        ioVar.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new kh2(this, (byte) 28));
    }

    @Override
    public final boolean b0() {
        return true;
    }

    @Override
    public final void c1(CharSequence charSequence) {
        b(charSequence);
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
    public final void w(CharSequence charSequence, boolean z, int i, int i2, long j) {
    }

    @Override
    public final void F1(int i, int i2, int i3, long j, long j2, boolean z) {
    }
}
