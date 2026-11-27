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
public class qf5 implements lx2, s99, s68, y2c, bl0, q30, qhc, rb2, j30, d23, oa6 {
    public static qf5 F;
    public final byte a;
    public static final qf5 b = new qf5((byte) 1);
    public static final qf5 c = new qf5((byte) 2);
    public static final qf5 d = new qf5((byte) 3);
    public static final qf5 e = new qf5((byte) 4);
    public static final qf5 f = new qf5((byte) 5);
    public static final qf5 h = new qf5((byte) 6);
    public static final qf5 n = new qf5((byte) 7);
    public static final qf5 r = new qf5((byte) 8);
    public static final qf5 s = new qf5((byte) 9);
    public static final qf5 w = new qf5((byte) 10);
    public static final qf5 x = new qf5((byte) 11);
    public static final qf5 y = new qf5((byte) 12);
    public static final qf5 E = new qf5((byte) 13);

    public qf5(byte b2) {
        this.a = b2;
    }

    @Override
    public final boolean A1(hm hmVar) {
        return false;
    }

    @Override
    public final float B0() {
        return -1.0f;
    }

    @Override
    public final float D0() {
        return -1.0f;
    }

    @Override
    public final boolean E(wb2 wb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean G0(wb2 wb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final Object J(ie9 ie9Var) {
        return Integer.valueOf(((c7e) ie9Var).b);
    }

    @Override
    public final de8 J1() {
        return null;
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final boolean L1(long j) {
        return false;
    }

    @Override
    public final boolean M() {
        return false;
    }

    @Override
    public final String M0(wb2 wb2Var) {
        return null;
    }

    @Override
    public final int N() {
        return 0;
    }

    @Override
    public final int P(wb2 wb2Var) {
        return 0;
    }

    @Override
    public final boolean P0(wb2 wb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final int Q1() {
        return 0;
    }

    @Override
    public final boolean R1(r47 r47Var) {
        return true;
    }

    @Override
    public final iv1 S() {
        return null;
    }

    @Override
    public final boolean V1(wb2 wb2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean W1(wb2 wb2Var) {
        return false;
    }

    @Override
    public final int X() {
        return 0;
    }

    @Override
    public final boolean Z() {
        return false;
    }

    @Override
    public final void a() {
        synchronized (rhd.a) {
            Object obj = rhd.b;
            synchronized (obj) {
                if (rhd.c) {
                    return;
                }
                long b2 = rhd.b();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    rhd.d = b2;
                    rhd.c = true;
                }
            }
        }
    }

    @Override
    public final CharacterStyle a0(wb2 wb2Var) {
        return null;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        he6 he6Var = rjd.H;
        ((qbd) ((bmf) obj).k()).Z();
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
    public final boolean c0() {
        return false;
    }

    public final void e(m34 m34Var) {
        m34Var.a(gye.class, uce.a);
        m34Var.a(u5f.class, zne.a);
        m34Var.a(jye.class, zce.a);
        m34Var.a(wye.class, jde.a);
        m34Var.a(nye.class, fde.a);
        m34Var.a(sye.class, ode.a);
        m34Var.a(ote.class, n8e.a);
        m34Var.a(ite.class, h8e.a);
        m34Var.a(cwe.class, ibe.a);
        m34Var.a(i5f.class, cme.a);
        m34Var.a(fte.class, b8e.a);
        m34Var.a(zse.class, v7e.a);
        m34Var.a(i0f.class, dge.a);
        m34Var.a(t7f.class, u9e.a);
        m34Var.a(kve.class, hae.a);
        m34Var.a(tue.class, o9e.a);
        m34Var.a(n0f.class, ige.a);
        m34Var.a(y4f.class, ole.a);
        m34Var.a(ffd.class, ule.a);
        m34Var.a(m4f.class, ile.a);
        m34Var.a(nze.class, xee.a);
        m34Var.a(r7f.class, w2e.a);
        m34Var.a(lib.class, dfe.a);
        m34Var.a(s0f.class, oge.a);
        m34Var.a(b2f.class, the.a);
        m34Var.a(s1f.class, nhe.a);
        m34Var.a(h1f.class, ghe.a);
        m34Var.a(s2f.class, rie.a);
        m34Var.a(v2f.class, xie.a);
        m34Var.a(c3f.class, jje.a);
        m34Var.a(y2f.class, dje.a);
        m34Var.a(jze.class, see.a);
        m34Var.a(f3f.class, oje.a);
        m34Var.a(i3f.class, sje.a);
        m34Var.a(l3f.class, wje.a);
        m34Var.a(q3f.class, cke.a);
        m34Var.a(i4f.class, ale.a);
        m34Var.a(f4f.class, fle.a);
        m34Var.a(o2f.class, xhe.a);
        m34Var.a(dxe.class, mce.a);
        m34Var.a(h2f.class, fie.a);
        m34Var.a(e2f.class, bie.a);
        m34Var.a(l2f.class, kie.a);
        m34Var.a(d5f.class, yle.a);
        m34Var.a(e6f.class, soe.a);
        m34Var.a(mqe.class, n4e.a);
        m34Var.a(eqe.class, y3e.a);
        m34Var.a(aqe.class, r3e.a);
        m34Var.a(iqe.class, e4e.a);
        m34Var.a(tqe.class, y4e.a);
        m34Var.a(rqe.class, s4e.a);
        m34Var.a(xqe.class, e5e.a);
        m34Var.a(are.class, j5e.a);
        m34Var.a(ure.class, q6e.a);
        m34Var.a(cse.class, v6e.a);
        m34Var.a(fse.class, z6e.a);
        m34Var.a(qwd.class, b2e.a);
        m34Var.a(xwd.class, m2e.a);
        m34Var.a(twd.class, g2e.a);
        m34Var.a(mwe.class, ace.a);
        m34Var.a(ute.class, u8e.a);
        m34Var.a(rr5.class, hxd.a);
        m34Var.a(mqd.class, oxd.a);
        m34Var.a(kue.class, e9e.a);
        m34Var.a(crd.class, gyd.a);
        m34Var.a(xqd.class, myd.a);
        m34Var.a(ctd.class, nzd.a);
        m34Var.a(usd.class, tzd.a);
        m34Var.a(nrd.class, syd.a);
        m34Var.a(ird.class, zyd.a);
        m34Var.a(eud.class, yzd.a);
        m34Var.a(std.class, c0e.a);
        m34Var.a(rud.class, h0e.a);
        m34Var.a(lud.class, l0e.a);
        m34Var.a(lwd.class, u1e.a);
        m34Var.a(gwd.class, y1e.a);
        m34Var.a(bvd.class, q0e.a);
        m34Var.a(xud.class, v0e.a);
        m34Var.a(mvd.class, a1e.a);
        m34Var.a(ivd.class, e1e.a);
        m34Var.a(w6f.class, bne.a);
        m34Var.a(g6f.class, z8e.a);
        m34Var.a(o6f.class, kee.a);
        m34Var.a(m5e.class, fee.a);
        m34Var.a(i6f.class, cae.a);
        m34Var.a(t6f.class, ume.a);
        m34Var.a(r6f.class, rme.a);
        m34Var.a(a7f.class, hne.a);
        m34Var.a(l6f.class, obe.a);
        m34Var.a(i7f.class, bpe.a);
        m34Var.a(f7f.class, gpe.a);
        m34Var.a(c7f.class, yoe.a);
        m34Var.a(j5f.class, lne.a);
        m34Var.a(gwe.class, ube.a);
        m34Var.a(ixe.class, qce.a);
        m34Var.a(upe.class, c3e.a);
        m34Var.a(ove.class, bbe.a);
        m34Var.a(zwe.class, fce.a);
        m34Var.a(oue.class, j9e.a);
        m34Var.a(edb.class, zde.a);
        m34Var.a(aze.class, ude.a);
        m34Var.a(t9.class, dxd.a);
        m34Var.a(x5f.class, foe.a);
        m34Var.a(c6f.class, ooe.a);
        m34Var.a(z5f.class, koe.a);
        m34Var.a(ppe.class, p2e.a);
        m34Var.a(use.class, o7e.a);
        m34Var.a(qse.class, k7e.a);
        m34Var.a(kse.class, g7e.a);
        m34Var.a(vze.class, jfe.a);
        m34Var.a(e0f.class, zfe.a);
        m34Var.a(zze.class, pfe.a);
        m34Var.a(qsd.class, ezd.a);
        m34Var.a(ksd.class, izd.a);
        m34Var.a(t3f.class, hke.a);
        m34Var.a(e4f.class, wke.a);
        m34Var.a(x3f.class, mke.a);
        m34Var.a(b4f.class, rke.a);
        m34Var.a(zvd.class, j1e.a);
        m34Var.a(tvd.class, n1e.a);
        m34Var.a(o5f.class, une.a);
        m34Var.a(l5f.class, pne.a);
    }

    public nhc f(Class cls) {
        switch (this.a) {
            case 21:
                return new ta6();
            default:
                return mqe.a(cls);
        }
    }

    public nhc g(Class cls, e23 e23Var) {
        switch (this.a) {
            case 21:
                e23Var.getClass();
                return f(cls);
            default:
                e23Var.getClass();
                return f(cls);
        }
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean i1() {
        return false;
    }

    @Override
    public final boolean i2(int i) {
        return false;
    }

    @Override
    public final nhc j(ki2 ki2Var, e23 e23Var) {
        switch (this.a) {
            case 21:
                return xnb.a(this, ki2Var, e23Var);
            default:
                e23Var.getClass();
                Class a = ki2Var.a();
                a.getClass();
                return g(a, e23Var);
        }
    }

    @Override
    public final boolean j1(r47 r47Var) {
        return bp1.a(r47Var);
    }

    @Override
    public final boolean j2(wb2 wb2Var, r47 r47Var) {
        return false;
    }

    @Override
    public final boolean k0(wb2 wb2Var, boolean z) {
        return false;
    }

    @Override
    public final boolean k1(wb2 wb2Var, int i) {
        return false;
    }

    @Override
    public final bmb l2() {
        return null;
    }

    @Override
    public final int m0() {
        return 0;
    }

    @Override
    public final float m1() {
        return 0.0f;
    }

    @Override
    public final boolean o0(wb2 wb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final int o1() {
        return 0;
    }

    @Override
    public final void p0(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public final void s(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i < i2) {
            q30.o.s(shortBuffer, i, shortBuffer2, i2, i3);
        } else if (i > i2) {
            q30.m.s(shortBuffer, i, shortBuffer2, i2, i3);
        } else if (i == i2) {
            shortBuffer2.put(shortBuffer);
        } else {
            lq5.j("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public final boolean s0(wb2 wb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final String u(long j) {
        return null;
    }

    @Override
    public final void u1(wb2 wb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        m01.u(wb2Var.getContext(), str);
    }

    @Override
    public final boolean w0(wb2 wb2Var) {
        return false;
    }

    @Override
    public final boolean w1() {
        return false;
    }

    @Override
    public final int x0() {
        return 0;
    }

    @Override
    public final int x1() {
        return 0;
    }

    @Override
    public final boolean y0(long j) {
        return false;
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d() {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void k2() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void r0() {
    }

    @Override
    public final void z1() {
    }

    @Override
    public final void A(wb2 wb2Var) {
    }

    @Override
    public final void C0(wb2 wb2Var) {
    }

    @Override
    public final void G(wb2 wb2Var) {
    }

    @Override
    public final void G1(wb2 wb2Var) {
    }

    @Override
    public final void I1(wb2 wb2Var) {
    }

    @Override
    public final void J0(wb2 wb2Var) {
    }

    @Override
    public final void N0(wb2 wb2Var) {
    }

    @Override
    public final void N1(wb2 wb2Var) {
    }

    @Override
    public final void O(wb2 wb2Var) {
    }

    @Override
    public final void Q(wb2 wb2Var) {
    }

    @Override
    public final void T(r47 r47Var) {
    }

    @Override
    public final void U0(wb2 wb2Var) {
    }

    @Override
    public final void Y(int i) {
    }

    @Override
    public final void Y0(wb2 wb2Var) {
    }

    @Override
    public final void a1(wb2 wb2Var) {
    }

    @Override
    public final void d0(r47 r47Var) {
    }

    @Override
    public final void e2(wb2 wb2Var) {
    }

    @Override
    public final void g0(String str) {
    }

    @Override
    public final void h1(wb2 wb2Var) {
    }

    @Override
    public final void j0(wb2 wb2Var) {
    }

    @Override
    public final void l(wb2 wb2Var) {
    }

    @Override
    public final void m2(wb2 wb2Var) {
    }

    @Override
    public final void n1(o47 o47Var) {
    }

    @Override
    public final void v1(wb2 wb2Var) {
    }

    @Override
    public final void A0(wb2 wb2Var, boolean z) {
    }

    @Override
    public final void I0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void K1(String str, String str2) {
    }

    @Override
    public final void M1(wb2 wb2Var, q38 q38Var) {
    }

    @Override
    public final void U(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void U1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void h0(wb2 wb2Var, int i) {
    }

    @Override
    public final void l0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void l1(wb2 wb2Var, boolean z) {
    }

    @Override
    public final void q1(wb2 wb2Var, int i) {
    }

    @Override
    public final void u0(wb2 wb2Var, long j) {
    }

    @Override
    public final void y1(wb2 wb2Var, iq0 iq0Var) {
    }

    @Override
    public final void F(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void F1(wb2 wb2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void K0(wb2 wb2Var, float f2, float f3) {
    }

    @Override
    public final void L(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void a2(wb2 wb2Var, float f2, float f3) {
    }

    @Override
    public final void f1(wb2 wb2Var, float f2, float f3) {
    }

    @Override
    public final void h2(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void n0(wb2 wb2Var, int i, int i2) {
    }

    @Override
    public final void r1(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override
    public final int s1(int i, int i2, int i3) {
        return i;
    }

    @Override
    public final void v(wb2 wb2Var, float f2, float f3) {
    }

    @Override
    public final void W(wb2 wb2Var, TLRPC.User user, float f2, float f3) {
    }

    @Override
    public final void m(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void q0(wb2 wb2Var, float f2, float f3, boolean z) {
    }

    @Override
    public final void z(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void H(wb2 wb2Var, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void V0(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override
    public final void c1(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void T1(wb2 wb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void t1(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
