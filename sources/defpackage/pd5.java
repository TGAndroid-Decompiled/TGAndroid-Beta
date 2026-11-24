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
public class pd5 implements rw2, f69, c38, yyb, al0, p30, rdc, bb2, i30, k13, k86 {
    public static pd5 F;
    public final byte a;
    public static final pd5 b = new pd5((byte) 1);
    public static final pd5 c = new pd5((byte) 2);
    public static final pd5 d = new pd5((byte) 3);
    public static final pd5 e = new pd5((byte) 4);
    public static final pd5 f = new pd5((byte) 5);
    public static final pd5 h = new pd5((byte) 6);
    public static final pd5 n = new pd5((byte) 7);
    public static final pd5 r = new pd5((byte) 8);
    public static final pd5 s = new pd5((byte) 9);
    public static final pd5 w = new pd5((byte) 10);
    public static final pd5 x = new pd5((byte) 11);
    public static final pd5 y = new pd5((byte) 12);
    public static final pd5 E = new pd5((byte) 13);

    public pd5(byte b2) {
        this.a = b2;
    }

    @Override
    public final boolean A1(gb2 gb2Var, int i) {
        return false;
    }

    @Override
    public final boolean B2(gb2 gb2Var, k27 k27Var) {
        return false;
    }

    @Override
    public final boolean D0(gb2 gb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final gib E2() {
        return null;
    }

    @Override
    public final boolean F0(gb2 gb2Var) {
        return false;
    }

    @Override
    public final boolean G(gb2 gb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean J0(long j) {
        return false;
    }

    @Override
    public final int K() {
        return 0;
    }

    @Override
    public final void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        d01.t(gb2Var.getContext(), str);
    }

    @Override
    public final boolean N1() {
        return false;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final int R() {
        return 0;
    }

    @Override
    public final boolean T0(gb2 gb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final boolean T1(gm gmVar) {
        return false;
    }

    @Override
    public final float U0() {
        return 0.0f;
    }

    @Override
    public final int V(gb2 gb2Var) {
        return 0;
    }

    @Override
    public final vu1 X() {
        return null;
    }

    @Override
    public final ma8 Z1() {
        return null;
    }

    @Override
    public final void a() {
        synchronized (ycd.a) {
            Object obj = ycd.b;
            synchronized (obj) {
                if (ycd.c) {
                    return;
                }
                long b2 = ycd.b();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    ycd.d = b2;
                    ycd.c = true;
                }
            }
        }
    }

    @Override
    public final void a0(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public final int a1() {
        return 0;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        dc6 dc6Var = afd.H;
        ((x6d) ((lhf) obj).k()).Z();
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
    public final int b0() {
        return 0;
    }

    @Override
    public final String b1(gb2 gb2Var) {
        return null;
    }

    @Override
    public final boolean c2(long j) {
        return false;
    }

    @Override
    public final int d1() {
        return 0;
    }

    @Override
    public odc e(Class cls, l13 l13Var) {
        switch (this.a) {
            case 21:
                l13Var.getClass();
                return h(cls);
            default:
                l13Var.getClass();
                return h(cls);
        }
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final odc f(oh2 oh2Var, l13 l13Var) {
        switch (this.a) {
            case 21:
                return yjb.a(this, oh2Var, l13Var);
            default:
                l13Var.getClass();
                Class a = oh2Var.a();
                a.getClass();
                return e(a, l13Var);
        }
    }

    @Override
    public final CharacterStyle f0(gb2 gb2Var) {
        return null;
    }

    public final void g(r24 r24Var) {
        r24Var.a(pte.class, e8e.a);
        r24Var.a(d1f.class, ije.a);
        r24Var.a(ste.class, j8e.a);
        r24Var.a(fue.class, t8e.a);
        r24Var.a(wte.class, p8e.a);
        r24Var.a(bue.class, y8e.a);
        r24Var.a(xoe.class, x3e.a);
        r24Var.a(roe.class, r3e.a);
        r24Var.a(lre.class, s6e.a);
        r24Var.a(r0f.class, lhe.a);
        r24Var.a(ooe.class, l3e.a);
        r24Var.a(ioe.class, f3e.a);
        r24Var.a(rve.class, nbe.a);
        r24Var.a(c3f.class, e5e.a);
        r24Var.a(tqe.class, r5e.a);
        r24Var.a(cqe.class, y4e.a);
        r24Var.a(wve.class, sbe.a);
        r24Var.a(h0f.class, xge.a);
        r24Var.a(k0f.class, dhe.a);
        r24Var.a(vze.class, rge.a);
        r24Var.a(wue.class, hae.a);
        r24Var.a(a3f.class, gyd.a);
        r24Var.a(bve.class, nae.a);
        r24Var.a(bwe.class, ybe.a);
        r24Var.a(kxe.class, cde.a);
        r24Var.a(bxe.class, wce.a);
        r24Var.a(qwe.class, pce.a);
        r24Var.a(bye.class, aee.a);
        r24Var.a(eye.class, gee.a);
        r24Var.a(lye.class, see.a);
        r24Var.a(hye.class, mee.a);
        r24Var.a(sue.class, cae.a);
        r24Var.a(oye.class, xee.a);
        r24Var.a(rye.class, bfe.a);
        r24Var.a(uye.class, ffe.a);
        r24Var.a(zye.class, lfe.a);
        r24Var.a(rze.class, jge.a);
        r24Var.a(oze.class, oge.a);
        r24Var.a(xxe.class, gde.a);
        r24Var.a(mse.class, w7e.a);
        r24Var.a(qxe.class, ode.a);
        r24Var.a(d8c.class, kde.a);
        r24Var.a(uxe.class, tde.a);
        r24Var.a(m0f.class, hhe.a);
        r24Var.a(n1f.class, bke.a);
        r24Var.a(vle.class, xzd.a);
        r24Var.a(nle.class, izd.a);
        r24Var.a(jle.class, bzd.a);
        r24Var.a(rle.class, ozd.a);
        r24Var.a(cme.class, i0e.a);
        r24Var.a(ame.class, c0e.a);
        r24Var.a(gme.class, o0e.a);
        r24Var.a(jme.class, t0e.a);
        r24Var.a(dne.class, a2e.a);
        r24Var.a(lne.class, f2e.a);
        r24Var.a(one.class, j2e.a);
        r24Var.a(asd.class, lxd.a);
        r24Var.a(hsd.class, wxd.a);
        r24Var.a(dsd.class, qxd.a);
        r24Var.a(vre.class, k7e.a);
        r24Var.a(dpe.class, e4e.a);
        r24Var.a(op5.class, rsd.a);
        r24Var.a(wld.class, ysd.a);
        r24Var.a(tpe.class, o4e.a);
        r24Var.a(lmd.class, qtd.a);
        r24Var.a(gmd.class, wtd.a);
        r24Var.a(mod.class, xud.a);
        r24Var.a(eod.class, dvd.a);
        r24Var.a(wmd.class, cud.a);
        r24Var.a(rmd.class, jud.a);
        r24Var.a(opd.class, ivd.a);
        r24Var.a(cpd.class, mvd.a);
        r24Var.a(bqd.class, rvd.a);
        r24Var.a(vpd.class, vvd.a);
        r24Var.a(vrd.class, exd.a);
        r24Var.a(qrd.class, ixd.a);
        r24Var.a(lqd.class, awd.a);
        r24Var.a(hqd.class, fwd.a);
        r24Var.a(wqd.class, kwd.a);
        r24Var.a(sqd.class, owd.a);
        r24Var.a(f2f.class, kie.a);
        r24Var.a(p1f.class, j4e.a);
        r24Var.a(x1f.class, u9e.a);
        r24Var.a(v1f.class, p9e.a);
        r24Var.a(r1f.class, m5e.a);
        r24Var.a(c2f.class, die.a);
        r24Var.a(a2f.class, aie.a);
        r24Var.a(j2f.class, qie.a);
        r24Var.a(u1f.class, y6e.a);
        r24Var.a(r2f.class, kke.a);
        r24Var.a(o2f.class, pke.a);
        r24Var.a(l2f.class, hke.a);
        r24Var.a(s0f.class, uie.a);
        r24Var.a(pre.class, e7e.a);
        r24Var.a(rse.class, a8e.a);
        r24Var.a(dle.class, myd.a);
        r24Var.a(xqe.class, l6e.a);
        r24Var.a(ise.class, p7e.a);
        r24Var.a(xpe.class, t4e.a);
        r24Var.a(oue.class, j9e.a);
        r24Var.a(jue.class, e9e.a);
        r24Var.a(s9.class, nsd.a);
        r24Var.a(g1f.class, oje.a);
        r24Var.a(l1f.class, xje.a);
        r24Var.a(i1f.class, tje.a);
        r24Var.a(yke.class, zxd.a);
        r24Var.a(qi6.class, y2e.a);
        r24Var.a(zne.class, u2e.a);
        r24Var.a(tne.class, q2e.a);
        r24Var.a(eve.class, tae.a);
        r24Var.a(nve.class, jbe.a);
        r24Var.a(ive.class, zae.a);
        r24Var.a(znd.class, oud.a);
        r24Var.a(tnd.class, sud.a);
        r24Var.a(cze.class, qfe.a);
        r24Var.a(nze.class, fge.a);
        r24Var.a(gze.class, vfe.a);
        r24Var.a(kze.class, age.a);
        r24Var.a(jrd.class, twd.a);
        r24Var.a(drd.class, xwd.a);
        r24Var.a(x0f.class, dje.a);
        r24Var.a(u0f.class, yie.a);
    }

    @Override
    public final boolean g2(k27 k27Var) {
        return true;
    }

    public odc h(Class cls) {
        switch (this.a) {
            case 21:
                return new p86();
            default:
                return rle.a(cls);
        }
    }

    @Override
    public final boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final void i(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i < i2) {
            p30.o.i(shortBuffer, i, shortBuffer2, i2, i3);
        } else if (i > i2) {
            p30.m.i(shortBuffer, i, shortBuffer2, i2, i3);
        } else if (i == i2) {
            shortBuffer2.put(shortBuffer);
        } else {
            w26.j("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public final boolean i0() {
        return false;
    }

    @Override
    public final int k0() {
        return 0;
    }

    @Override
    public final boolean k2(gb2 gb2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final boolean l2(gb2 gb2Var) {
        return false;
    }

    @Override
    public final Object n0(ua9 ua9Var) {
        return Integer.valueOf(((m2e) ua9Var).b);
    }

    @Override
    public final float p0() {
        return -1.0f;
    }

    @Override
    public final float q0() {
        return -1.0f;
    }

    @Override
    public final boolean s0(gb2 gb2Var, boolean z) {
        return false;
    }

    @Override
    public final int t1() {
        return 0;
    }

    @Override
    public final String x(long j) {
        return null;
    }

    @Override
    public final boolean x0(gb2 gb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean y1() {
        return false;
    }

    @Override
    public final boolean y2(int i) {
        return false;
    }

    @Override
    public final boolean z1(k27 k27Var) {
        return oo1.a(k27Var);
    }

    @Override
    public final void B0() {
    }

    @Override
    public final void C2() {
    }

    @Override
    public final void R1() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void D1(h27 h27Var) {
    }

    @Override
    public final void F(gb2 gb2Var) {
    }

    @Override
    public final void H2(gb2 gb2Var) {
    }

    @Override
    public final void J(gb2 gb2Var) {
    }

    @Override
    public final void M1(gb2 gb2Var) {
    }

    @Override
    public final void N0(gb2 gb2Var) {
    }

    @Override
    public final void T(gb2 gb2Var) {
    }

    @Override
    public final void W(gb2 gb2Var) {
    }

    @Override
    public final void X0(gb2 gb2Var) {
    }

    @Override
    public final void X1(gb2 gb2Var) {
    }

    @Override
    public final void Y(k27 k27Var) {
    }

    @Override
    public final void Y1(gb2 gb2Var) {
    }

    @Override
    public final void c1(gb2 gb2Var) {
    }

    @Override
    public final void d0(int i) {
    }

    @Override
    public final void e2(gb2 gb2Var) {
    }

    @Override
    public final void j0(k27 k27Var) {
    }

    @Override
    public final void l0(String str) {
    }

    @Override
    public final void l1(gb2 gb2Var) {
    }

    @Override
    public final void n1(gb2 gb2Var) {
    }

    @Override
    public final void q(gb2 gb2Var) {
    }

    @Override
    public final void q1(gb2 gb2Var) {
    }

    @Override
    public final void r0(gb2 gb2Var) {
    }

    @Override
    public final void v2(gb2 gb2Var) {
    }

    @Override
    public final void x1(gb2 gb2Var) {
    }

    @Override
    public final void C1(gb2 gb2Var, boolean z) {
    }

    @Override
    public final void E0(gb2 gb2Var, long j) {
    }

    @Override
    public final void F1(gb2 gb2Var, int i) {
    }

    @Override
    public final void M0(gb2 gb2Var, boolean z) {
    }

    @Override
    public final void O1(gb2 gb2Var, iq0 iq0Var) {
    }

    @Override
    public final void V0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void Z(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void b2(String str, String str2) {
    }

    @Override
    public final void d2(gb2 gb2Var, k08 k08Var) {
    }

    @Override
    public final void j2(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void m0(gb2 gb2Var, int i) {
    }

    @Override
    public final void v0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void A(gb2 gb2Var, float f2, float f3) {
    }

    @Override
    public final void G1(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void I(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void P(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void W1(gb2 gb2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void Y0(gb2 gb2Var, float f2, float f3) {
    }

    @Override
    public final int Z0(int i, int i2, int i3) {
        return i;
    }

    @Override
    public final void s2(gb2 gb2Var, float f2, float f3) {
    }

    @Override
    public final void v1(gb2 gb2Var, float f2, float f3) {
    }

    @Override
    public final void w0(gb2 gb2Var, int i, int i2) {
    }

    @Override
    public final void x2(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void A0(gb2 gb2Var, float f2, float f3, boolean z) {
    }

    @Override
    public final void E(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void c0(gb2 gb2Var, TLRPC.User user, float f2, float f3) {
    }

    @Override
    public final void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void N(gb2 gb2Var, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override
    public final void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
