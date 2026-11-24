package defpackage;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public final class h10 implements yr3 {
    public final byte a;
    public final Object b;

    public h10(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(yla ylaVar, float f, float f2) {
        int i;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((i20) obj).M1.setBufferedProgress(f / 1000.0f);
                return;
            case 1:
                m21 m21Var = (m21) obj;
                m21Var.o = (int) f;
                m21Var.l();
                return;
            case 2:
                if (Math.abs(f) > ((q11) obj).getWidth()) {
                    ylaVar.d();
                    return;
                }
                return;
            case 3:
                x02 x02Var = (x02) ((f02) obj).d;
                p02 p02Var = x02Var.w2;
                if (p02Var == x02Var.g2 || p02Var == x02Var.h2 || (x02Var.z1 && x02Var.q3 != null)) {
                    x02Var.K1(1);
                }
                x02Var.w2.m(x02Var.i4);
                x02Var.X0.g();
                x02Var.b.invalidate();
                return;
            case 4:
                r32 r32Var = (r32) obj;
                r32Var.n0 = f;
                r32Var.m0();
                return;
            case 5:
                hj4 hj4Var = (hj4) obj;
                float f3 = f / 1000.0f;
                st stVar = hj4Var.a;
                stVar.setPivotX(gl.L(28.0f));
                stVar.setPivotY(gl.L(28.0f));
                stVar.setScaleX(f3);
                stVar.setScaleY(f3);
                stVar.setAlpha(moe.a(f3, 0.0f, 1.0f));
                hj4Var.invalidate();
                return;
            case 6:
                rw5 rw5Var = (rw5) obj;
                float f4 = f / 1000.0f;
                rw5Var.t1 = f4;
                ss7 ss7Var = rw5Var.l1;
                ss7Var.setAlpha(f4);
                ss7Var.invalidate();
                rw5Var.T0.invalidate();
                rw5Var.k1.getTypefaceCell().setAlpha(1.0f - rw5Var.t1);
                return;
            case 7:
                af6 af6Var = ((mf6) obj).c0;
                if (af6Var != null) {
                    int i2 = af6.G;
                    View view = af6Var.c;
                    ViewGroup viewGroup = af6Var.b;
                    PointF pointF = af6Var.E;
                    zec.b(view, viewGroup, pointF);
                    un4 un4Var = af6Var.h;
                    un4Var.setTranslationX(pointF.x);
                    un4Var.setTranslationY(pointF.y);
                    af6Var.requestLayout();
                    return;
                }
                return;
            case 8:
                wt7 wt7Var = (wt7) obj;
                float f5 = f / 1000.0f;
                wt7Var.j1 = f5;
                ss7 ss7Var2 = wt7Var.c1;
                ss7Var2.setAlpha(f5);
                ss7Var2.invalidate();
                wt7Var.K0.invalidate();
                wt7Var.b1.getTypefaceCell().setAlpha(1.0f - wt7Var.j1);
                return;
            case 9:
                ((ye7) obj).x();
                return;
            case 10:
                qz7 qz7Var = (qz7) obj;
                float f6 = f / 100.0f;
                qz7Var.b = f6;
                TextView textView = qz7Var.d.V;
                if (textView != null) {
                    textView.setAlpha((f6 * 0.2f) + 0.8f);
                }
                qz7Var.invalidate();
                return;
            case 11:
                d98 d98Var = (d98) obj;
                d98Var.c0 = f;
                d98Var.e0 = f2;
                d98Var.G();
                return;
            case 12:
                u98 u98Var = (u98) obj;
                if (u98Var.e > u98Var.f) {
                    i = gl.L(48.0f);
                } else {
                    i = 0;
                }
                tbc tbcVar = u98Var.s.q3;
                int measuredHeight = u98Var.getMeasuredHeight();
                tbcVar.h = (int) (((u98Var.getMeasuredWidth() - gl.L(16.0f)) - f) - i);
                tbcVar.i = measuredHeight;
                View view2 = tbcVar.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 13:
                rh3 rh3Var = (rh3) obj;
                rh3Var.E = f / 1000.0f;
                rh3Var.invalidate();
                return;
            case 14:
                ((nn9) obj).k(f);
                return;
            case 15:
                ju9 ju9Var = (ju9) obj;
                tbc tbcVar2 = ju9Var.r.P;
                int measuredHeight2 = ju9Var.getMeasuredHeight();
                tbcVar2.h = (int) (((ju9Var.getMeasuredWidth() - gl.L(16.0f)) - f) - 0.0f);
                tbcVar2.i = measuredHeight2;
                View view3 = tbcVar2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            case 16:
                waa waaVar = (waa) obj;
                float f7 = f / 1000.0f;
                jia jiaVar = waaVar.c;
                jiaVar.setAlpha(f7);
                px8 px8Var = waaVar.b;
                float f8 = 1.0f - f7;
                px8Var.setAlpha(f8);
                jiaVar.setTranslationX(f8 * (-gl.L(10.0f)));
                px8Var.setTranslationX(f7 * gl.L(10.0f));
                return;
            case 17:
                k3b k3bVar = (k3b) obj;
                k3bVar.d0 = f;
                k3bVar.f0 = f2;
                return;
            case 18:
                lyb lybVar = (lyb) obj;
                lybVar.H = f;
                lybVar.c();
                return;
            case 19:
                voc vocVar = (voc) obj;
                vocVar.e = f;
                vocVar.setScaleX(f);
                vocVar.setScaleY(f);
                return;
            case 20:
                qpc qpcVar = (qpc) obj;
                qpcVar.c0 = f;
                qpcVar.F0();
                return;
            default:
                ((ppc) obj).d.setConversionWobble(f);
                return;
        }
    }
}
