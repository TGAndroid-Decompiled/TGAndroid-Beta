package defpackage;

import android.graphics.RectF;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public class nf5 implements by2, h89, e58, z0c, am0, p40, sfc, mc2, i40, w23, ja6 {
    public static nf5 F;
    public final byte a;
    public static final nf5 b = new nf5((byte) 1);
    public static final nf5 c = new nf5((byte) 2);
    public static final nf5 d = new nf5((byte) 3);
    public static final nf5 e = new nf5((byte) 4);
    public static final nf5 f = new nf5((byte) 5);
    public static final nf5 h = new nf5((byte) 6);
    public static final nf5 n = new nf5((byte) 7);
    public static final nf5 r = new nf5((byte) 8);
    public static final nf5 s = new nf5((byte) 9);
    public static final nf5 w = new nf5((byte) 10);
    public static final nf5 x = new nf5((byte) 11);
    public static final nf5 y = new nf5((byte) 12);
    public static final nf5 E = new nf5((byte) 13);

    public nf5(byte b2) {
        this.a = b2;
    }

    @Override
    public final boolean A0(long j) {
        return false;
    }

    @Override
    public final boolean D1(gn gnVar) {
        return false;
    }

    @Override
    public final boolean E(rc2 rc2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean J0(rc2 rc2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final int K1() {
        return 0;
    }

    @Override
    public final pc8 M1() {
        return null;
    }

    @Override
    public final boolean N() {
        return false;
    }

    @Override
    public final int O() {
        return 0;
    }

    @Override
    public final boolean O1(long j) {
        return false;
    }

    @Override
    public final String P0(rc2 rc2Var) {
        return null;
    }

    @Override
    public final int Q(rc2 rc2Var) {
        return 0;
    }

    @Override
    public final hw1 S() {
        return null;
    }

    @Override
    public final boolean S0(rc2 rc2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean U1(k47 k47Var) {
        return true;
    }

    @Override
    public final int V() {
        return 0;
    }

    @Override
    public final boolean Y1(rc2 rc2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean Z() {
        return false;
    }

    @Override
    public final boolean Z1(rc2 rc2Var) {
        return false;
    }

    @Override
    public final void a() {
        synchronized (afd.a) {
            Object obj = afd.b;
            synchronized (obj) {
                if (afd.c) {
                    return;
                }
                long b2 = afd.b();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    afd.d = b2;
                    afd.c = true;
                }
            }
        }
    }

    @Override
    public final CharacterStyle a0(rc2 rc2Var) {
        return null;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        ce6 ce6Var = bhd.H;
        ((z8d) ((mjf) obj).k()).Z();
        ((TaskCompletionSource) obj2).setResult(null);
    }

    @Override
    public final Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public pfc d(Class cls, x23 x23Var) {
        switch (this.a) {
            case 21:
                x23Var.getClass();
                return j(cls);
            default:
                x23Var.getClass();
                return j(cls);
        }
    }

    @Override
    public final boolean d0() {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final pfc g(cj2 cj2Var, x23 x23Var) {
        switch (this.a) {
            case 21:
                return mlb.a(this, cj2Var, x23Var);
            default:
                x23Var.getClass();
                Class a = cj2Var.a();
                a.getClass();
                return d(a, x23Var);
        }
    }

    @Override
    public final int g0() {
        return 0;
    }

    @Override
    public final float g1() {
        return 0.0f;
    }

    public final void h(c44 c44Var) {
        c44Var.a(sve.class, fae.a);
        c44Var.a(f3f.class, jle.a);
        c44Var.a(vve.class, kae.a);
        c44Var.a(iwe.class, uae.a);
        c44Var.a(zve.class, qae.a);
        c44Var.a(ewe.class, zae.a);
        c44Var.a(are.class, a6e.a);
        c44Var.a(uqe.class, u5e.a);
        c44Var.a(ote.class, t8e.a);
        c44Var.a(t2f.class, mje.a);
        c44Var.a(rqe.class, o5e.a);
        c44Var.a(lqe.class, i5e.a);
        c44Var.a(txe.class, ode.a);
        c44Var.a(e5f.class, h7e.a);
        c44Var.a(wse.class, u7e.a);
        c44Var.a(fse.class, b7e.a);
        c44Var.a(yxe.class, tde.a);
        c44Var.a(j2f.class, yie.a);
        c44Var.a(m2f.class, eje.a);
        c44Var.a(x1f.class, sie.a);
        c44Var.a(ywe.class, ice.a);
        c44Var.a(c5f.class, j0e.a);
        c44Var.a(dxe.class, oce.a);
        c44Var.a(dye.class, zde.a);
        c44Var.a(mze.class, dfe.a);
        c44Var.a(dze.class, xee.a);
        c44Var.a(sye.class, qee.a);
        c44Var.a(d0f.class, bge.a);
        c44Var.a(g0f.class, hge.a);
        c44Var.a(n0f.class, tge.a);
        c44Var.a(j0f.class, nge.a);
        c44Var.a(uwe.class, dce.a);
        c44Var.a(q0f.class, yge.a);
        c44Var.a(t0f.class, che.a);
        c44Var.a(w0f.class, ghe.a);
        c44Var.a(b1f.class, mhe.a);
        c44Var.a(t1f.class, kie.a);
        c44Var.a(q1f.class, pie.a);
        c44Var.a(zze.class, hfe.a);
        c44Var.a(pue.class, x9e.a);
        c44Var.a(sze.class, pfe.a);
        c44Var.a(eac.class, lfe.a);
        c44Var.a(wze.class, ufe.a);
        c44Var.a(o2f.class, ije.a);
        c44Var.a(p3f.class, dme.a);
        c44Var.a(xne.class, a2e.a);
        c44Var.a(pne.class, l1e.a);
        c44Var.a(lne.class, e1e.a);
        c44Var.a(tne.class, r1e.a);
        c44Var.a(eoe.class, l2e.a);
        c44Var.a(coe.class, f2e.a);
        c44Var.a(joe.class, r2e.a);
        c44Var.a(moe.class, w2e.a);
        c44Var.a(gpe.class, d4e.a);
        c44Var.a(ope.class, i4e.a);
        c44Var.a(rpe.class, m4e.a);
        c44Var.a(dud.class, ozd.a);
        c44Var.a(kud.class, zzd.a);
        c44Var.a(gud.class, tzd.a);
        c44Var.a(yte.class, l9e.a);
        c44Var.a(gre.class, h6e.a);
        c44Var.a(or5.class, uud.a);
        c44Var.a(ynd.class, bvd.a);
        c44Var.a(wre.class, r6e.a);
        c44Var.a(ood.class, tvd.a);
        c44Var.a(jod.class, zvd.a);
        c44Var.a(pqd.class, axd.a);
        c44Var.a(hqd.class, gxd.a);
        c44Var.a(zod.class, fwd.a);
        c44Var.a(uod.class, mwd.a);
        c44Var.a(rrd.class, lxd.a);
        c44Var.a(frd.class, pxd.a);
        c44Var.a(esd.class, uxd.a);
        c44Var.a(yrd.class, yxd.a);
        c44Var.a(ytd.class, hzd.a);
        c44Var.a(ttd.class, lzd.a);
        c44Var.a(osd.class, dyd.a);
        c44Var.a(ksd.class, iyd.a);
        c44Var.a(zsd.class, nyd.a);
        c44Var.a(vsd.class, ryd.a);
        c44Var.a(h4f.class, lke.a);
        c44Var.a(r3f.class, m6e.a);
        c44Var.a(z3f.class, vbe.a);
        c44Var.a(x3f.class, qbe.a);
        c44Var.a(t3f.class, p7e.a);
        c44Var.a(e4f.class, eke.a);
        c44Var.a(c4f.class, bke.a);
        c44Var.a(l4f.class, rke.a);
        c44Var.a(w3f.class, z8e.a);
        c44Var.a(t4f.class, mme.a);
        c44Var.a(q4f.class, rme.a);
        c44Var.a(n4f.class, jme.a);
        c44Var.a(u2f.class, vke.a);
        c44Var.a(ste.class, f9e.a);
        c44Var.a(uue.class, bae.a);
        c44Var.a(fne.class, p0e.a);
        c44Var.a(ate.class, m8e.a);
        c44Var.a(lue.class, q9e.a);
        c44Var.a(ase.class, w6e.a);
        c44Var.a(qwe.class, kbe.a);
        c44Var.a(mwe.class, fbe.a);
        c44Var.a(s9.class, qud.a);
        c44Var.a(i3f.class, qle.a);
        c44Var.a(n3f.class, zle.a);
        c44Var.a(k3f.class, vle.a);
        c44Var.a(ane.class, c0e.a);
        c44Var.a(sk6.class, b5e.a);
        c44Var.a(cqe.class, x4e.a);
        c44Var.a(wpe.class, t4e.a);
        c44Var.a(gxe.class, uce.a);
        c44Var.a(pxe.class, kde.a);
        c44Var.a(kxe.class, ade.a);
        c44Var.a(cqd.class, rwd.a);
        c44Var.a(wpd.class, vwd.a);
        c44Var.a(e1f.class, rhe.a);
        c44Var.a(p1f.class, gie.a);
        c44Var.a(i1f.class, whe.a);
        c44Var.a(m1f.class, bie.a);
        c44Var.a(mtd.class, wyd.a);
        c44Var.a(gtd.class, azd.a);
        c44Var.a(z2f.class, ele.a);
        c44Var.a(w2f.class, zke.a);
    }

    @Override
    public final int h1() {
        return 0;
    }

    public pfc j(Class cls) {
        switch (this.a) {
            case 21:
                return new oa6();
            default:
                return tne.a(cls);
        }
    }

    @Override
    public final void j0(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public final boolean l0(rc2 rc2Var, boolean z) {
        return false;
    }

    @Override
    public final boolean l1() {
        return false;
    }

    @Override
    public final boolean m1(k47 k47Var) {
        return aq1.a(k47Var);
    }

    @Override
    public final boolean m2(int i) {
        return false;
    }

    @Override
    public final Object n0(uc9 uc9Var) {
        return Integer.valueOf(((p4e) uc9Var).b);
    }

    @Override
    public final boolean n1(rc2 rc2Var, int i) {
        return false;
    }

    @Override
    public final boolean n2(rc2 rc2Var, k47 k47Var) {
        return false;
    }

    @Override
    public final boolean p0(rc2 rc2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final hkb p2() {
        return null;
    }

    @Override
    public final int r1() {
        return 0;
    }

    @Override
    public final void s(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i < i2) {
            p40.o.s(shortBuffer, i, shortBuffer2, i2, i3);
        } else if (i > i2) {
            p40.m.s(shortBuffer, i, shortBuffer2, i2, i3);
        } else if (i == i2) {
            shortBuffer2.put(shortBuffer);
        } else {
            u36.j("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public final String t(long j) {
        return null;
    }

    @Override
    public final boolean t0(rc2 rc2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final int u0() {
        return 0;
    }

    @Override
    public final float w0() {
        return -1.0f;
    }

    @Override
    public final boolean x0(rc2 rc2Var) {
        return false;
    }

    @Override
    public final void x1(rc2 rc2Var, TLRPC.WebPage webPage, String str, boolean z) {
        l11.u(rc2Var.getContext(), str);
    }

    @Override
    public final float y0() {
        return -1.0f;
    }

    @Override
    public final boolean z1() {
        return false;
    }

    @Override
    public final void C1() {
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void A(rc2 rc2Var) {
    }

    @Override
    public final void F0(rc2 rc2Var) {
    }

    @Override
    public final void G(rc2 rc2Var) {
    }

    @Override
    public final void J1(rc2 rc2Var) {
    }

    @Override
    public final void L1(rc2 rc2Var) {
    }

    @Override
    public final void M0(rc2 rc2Var) {
    }

    @Override
    public final void P(rc2 rc2Var) {
    }

    @Override
    public final void Q0(rc2 rc2Var) {
    }

    @Override
    public final void Q1(rc2 rc2Var) {
    }

    @Override
    public final void R(rc2 rc2Var) {
    }

    @Override
    public final void T(k47 k47Var) {
    }

    @Override
    public final void U0(rc2 rc2Var) {
    }

    @Override
    public final void X0(rc2 rc2Var) {
    }

    @Override
    public final void Y(int i) {
    }

    @Override
    public final void Z0(rc2 rc2Var) {
    }

    @Override
    public final void e0(k47 k47Var) {
    }

    @Override
    public final void h0(String str) {
    }

    @Override
    public final void i2(rc2 rc2Var) {
    }

    @Override
    public final void k(rc2 rc2Var) {
    }

    @Override
    public final void k0(rc2 rc2Var) {
    }

    @Override
    public final void k1(rc2 rc2Var) {
    }

    @Override
    public final void q1(h47 h47Var) {
    }

    @Override
    public final void q2(rc2 rc2Var) {
    }

    @Override
    public final void y1(rc2 rc2Var) {
    }

    @Override
    public final void B1(rc2 rc2Var, ir0 ir0Var) {
    }

    @Override
    public final void D0(rc2 rc2Var, boolean z) {
    }

    @Override
    public final void L0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void N1(String str, String str2) {
    }

    @Override
    public final void P1(rc2 rc2Var, n28 n28Var) {
    }

    @Override
    public final void U(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void X1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void i0(rc2 rc2Var, int i) {
    }

    @Override
    public final void m0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void o1(rc2 rc2Var, boolean z) {
    }

    @Override
    public final void t1(rc2 rc2Var, int i) {
    }

    @Override
    public final void v0(rc2 rc2Var, long j) {
    }

    @Override
    public final void F(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void I1(rc2 rc2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void M(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void N0(rc2 rc2Var, float f2, float f3) {
    }

    @Override
    public final void d2(rc2 rc2Var, float f2, float f3) {
    }

    @Override
    public final void i1(rc2 rc2Var, float f2, float f3) {
    }

    @Override
    public final void l2(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override
    public final void o0(rc2 rc2Var, int i, int i2) {
    }

    @Override
    public final int p1(int i, int i2, int i3) {
        return i;
    }

    @Override
    public final void u(rc2 rc2Var, float f2, float f3) {
    }

    @Override
    public final void u1(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override
    public final void W(rc2 rc2Var, TLRPC.User user, float f2, float f3) {
    }

    @Override
    public final void m(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void r0(rc2 rc2Var, float f2, float f3, boolean z) {
    }

    @Override
    public final void z(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void H(rc2 rc2Var, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void V0(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override
    public final void b1(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void W1(rc2 rc2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void w1(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
