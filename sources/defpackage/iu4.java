package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Intro;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.web.HttpGetFileTask;
public final class iu4 implements Runnable {
    public final byte a;
    public final Object b;

    public iu4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        q05 q05Var = (q05) this.b;
        synchronized (q05Var) {
            if (q05Var.a) {
                return;
            }
            q05Var.a = true;
            Runnable runnable = q05Var.b;
            if (runnable != null) {
                runnable.run();
                q05Var.b = null;
            }
        }
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ((lu4) this.b).r1;
                editTextBoldCursor.requestFocus();
                gl.F3(editTextBoldCursor);
                return;
            case 1:
                l5c l5cVar = ((tv4) this.b).T1;
                if (l5cVar != null) {
                    l5cVar.O(false);
                    return;
                }
                return;
            case 2:
                ((kv4) this.b).c();
                return;
            case 3:
                ((qv4) this.b).invalidateSelf();
                return;
            case 4:
                sv4 sv4Var = (sv4) this.b;
                vva vvaVar = sv4Var.e;
                if (vvaVar != null) {
                    vvaVar.d();
                    sv4Var.invalidateSelf();
                    return;
                }
                return;
            case 5:
                ((ux4) this.b).k();
                return;
            case 6:
                o05 o05Var = (o05) this.b;
                synchronized (o05Var) {
                    if (!o05Var.a) {
                        o05Var.a = true;
                        Runnable runnable = o05Var.b;
                        if (runnable != null) {
                            runnable.run();
                            o05Var.b = null;
                        }
                        return;
                    }
                    return;
                }
            case 7:
                ((y05) this.b).close();
                return;
            case 8:
                a();
                return;
            case 9:
                l15 l15Var = (l15) this.b;
                l15Var.c("AUTH_CANCELED");
                l15Var.e();
                if (bje.b == l15Var) {
                    bje.b = null;
                    return;
                }
                return;
            case 10:
                ((ki7) this.b).dismiss();
                return;
            case 11:
                o35 o35Var = (o35) this.b;
                o35Var.b.g3.O(true);
                o35Var.Y(true);
                return;
            case 12:
                t65 t65Var = (t65) this.b;
                h75 h75Var = t65Var.f;
                g55 g55Var = h75Var.l1;
                gl5 gl5Var = t65Var.d;
                if (gl5Var != null) {
                    g55Var.L0 = gl5Var;
                    g55Var.r1 = null;
                    g55Var.s1 = null;
                    t65Var.d = null;
                }
                TLRPC.Chat K0 = na7.q1(h75Var.n1.a).K0(Long.valueOf(-t65Var.e));
                gl5 a = gl5.a(0, K0);
                gl5 a2 = gl5.a(1, K0);
                if (gl5.e(t65Var.b) == null) {
                    a2 = gl5.e(t65Var.c);
                }
                g55Var.setCreateThumbFromParent(false);
                g55Var.H(null, a, a2, true);
                t65Var.c = null;
                t65Var.b = null;
                gl.W3(h75Var.J1);
                t65Var.a(1.0f);
                return;
            case 13:
                sb sbVar = (sb) ((pc) this.b).i;
                if (sbVar != null) {
                    sbVar.invalidate();
                    return;
                }
                return;
            case 14:
                ((j75) this.b).invalidate();
                return;
            case 15:
                t75 t75Var = (t75) this.b;
                GroupCallMessage groupCallMessage = t75Var.I;
                if (groupCallMessage != null) {
                    t75Var.a.a(groupCallMessage.isSendDelayed(), true);
                    t75Var.b.a(t75Var.I.isSendError(), true);
                    return;
                }
                return;
            case 16:
                ((h85) this.b).requestLayout();
                return;
            case 17:
                ((o85) this.b).h(true);
                return;
            case 18:
                l95 l95Var = (l95) this.b;
                l95Var.Q0 = null;
                l95Var.setVisibleParticipant(true);
                return;
            case 19:
                wa5 wa5Var = (wa5) this.b;
                wa5Var.E = null;
                wa5Var.F = null;
                wa5Var.G = null;
                wa5Var.H = null;
                wa5Var.J = null;
                wa5Var.I = null;
                wa5Var.K = 0.0d;
                wa5Var.d0(false, true);
                wa5Var.d.m(null, null, wa5Var.r, null);
                wa5Var.f.setAnimation(wa5Var.S);
                wa5Var.S.H(0);
                return;
            case 20:
                ir2.v(null, 2131749186, u21.b0(((gb5) this.b).c), 2131624000, 36);
                return;
            case 21:
                hi3 hi3Var = ((kt9) ((dd5) this.b)).f0;
                if (!hi3Var.x0.canScrollVertically(-1)) {
                    hi3Var.w0.g1(0, 0);
                    return;
                }
                return;
            case 22:
                ((he5) this.b).b.a();
                return;
            case 23:
                cm0 cm0Var = (cm0) this.b;
                Utilities.g.c(new jf4(cm0Var, new ArrayList(((me5) cm0Var.c).f), ((me5) cm0Var.c).r, (byte) 20));
                return;
            case 24:
                ((gi3) this.b).x();
                return;
            case 25:
                HttpGetFileTask.a((HttpGetFileTask) this.b);
                return;
            case 26:
                ((fl5) ((zj) this.b).b).e(null);
                return;
            case 27:
                ((ImageReceiver) this.b).invalidate();
                return;
            case 28:
                bn5 bn5Var = (bn5) this.b;
                ry8 ry8Var = bn5Var.p1;
                if (bn5Var.r1) {
                    ry8Var.getAnimatedDrawable().F(0);
                    ry8Var.setAnimation(bn5Var.s1);
                    ry8Var.d();
                    return;
                }
                return;
            default:
                wp5 wp5Var = (wp5) this.b;
                vp5 vp5Var = wp5Var.J;
                int i = bkb.c6;
                int w0 = bkb.w0(null, i, false);
                int i2 = vp5.E;
                vp5Var.a(2131231539, 17, w0, true);
                wp5Var.J.c();
                vp5 vp5Var2 = wp5Var.J;
                vp5Var2.b(vp5Var2.w, 23, true);
                wp5Var.J.d();
                Intro.a(bkb.w0(null, i, false));
                return;
        }
    }
}
