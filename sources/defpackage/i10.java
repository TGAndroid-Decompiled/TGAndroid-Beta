package defpackage;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public final class i10 implements qs3 {
    public final byte a;
    public final Object b;

    public i10(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(vpa vpaVar, float f, float f2) {
        int i;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((j20) obj).M1.setBufferedProgress(f / 1000.0f);
                return;
            case 1:
                v21 v21Var = (v21) obj;
                v21Var.p = (int) f;
                v21Var.l();
                return;
            case 2:
                if (Math.abs(f) > ((z11) obj).getWidth()) {
                    vpaVar.d();
                    return;
                }
                return;
            case 3:
                n12 n12Var = (n12) ((v02) obj).d;
                f12 f12Var = n12Var.w2;
                if (f12Var == n12Var.g2 || f12Var == n12Var.h2 || (n12Var.z1 && n12Var.q3 != null)) {
                    n12Var.L1(1);
                }
                n12Var.w2.m(n12Var.i4);
                n12Var.X0.g();
                n12Var.b.invalidate();
                return;
            case 4:
                h42 h42Var = (h42) obj;
                h42Var.n0 = f;
                h42Var.l0();
                return;
            case 5:
                ll4 ll4Var = (ll4) obj;
                float f3 = f / 1000.0f;
                tt ttVar = ll4Var.a;
                ttVar.setPivotX(hl.L(28.0f));
                ttVar.setPivotY(hl.L(28.0f));
                ttVar.setScaleX(f3);
                ttVar.setScaleY(f3);
                ttVar.setAlpha(ete.a(f3, 0.0f, 1.0f));
                ll4Var.invalidate();
                return;
            case 6:
                wy5 wy5Var = (wy5) obj;
                float f4 = f / 1000.0f;
                wy5Var.n1 = f4;
                zv7 zv7Var = wy5Var.f1;
                zv7Var.setAlpha(f4);
                zv7Var.invalidate();
                wy5Var.N0.invalidate();
                wy5Var.e1.getTypefaceCell().setAlpha(1.0f - wy5Var.n1);
                return;
            case 7:
                eh6 eh6Var = ((qh6) obj).c0;
                if (eh6Var != null) {
                    int i2 = eh6.G;
                    View view = eh6Var.c;
                    ViewGroup viewGroup = eh6Var.b;
                    PointF pointF = eh6Var.E;
                    yic.b(view, viewGroup, pointF);
                    zp4 zp4Var = eh6Var.h;
                    zp4Var.setTranslationX(pointF.x);
                    zp4Var.setTranslationY(pointF.y);
                    eh6Var.requestLayout();
                    return;
                }
                return;
            case 8:
                km7 km7Var = (km7) obj;
                km7Var.a = f;
                km7Var.d.y0();
                return;
            case 9:
                dx7 dx7Var = (dx7) obj;
                float f5 = f / 1000.0f;
                dx7Var.d1 = f5;
                zv7 zv7Var2 = dx7Var.W0;
                zv7Var2.setAlpha(f5);
                zv7Var2.invalidate();
                dx7Var.E0.invalidate();
                dx7Var.V0.getTypefaceCell().setAlpha(1.0f - dx7Var.d1);
                return;
            case 10:
                ((ih7) obj).x();
                return;
            case 11:
                w28 w28Var = (w28) obj;
                float f6 = f / 100.0f;
                w28Var.b = f6;
                TextView textView = w28Var.d.V;
                if (textView != null) {
                    textView.setAlpha((f6 * 0.2f) + 0.8f);
                }
                w28Var.invalidate();
                return;
            case 12:
                tc8 tc8Var = (tc8) obj;
                tc8Var.c0 = f;
                tc8Var.e0 = f2;
                tc8Var.G();
                return;
            case 13:
                kd8 kd8Var = (kd8) obj;
                if (kd8Var.e > kd8Var.f) {
                    i = hl.L(48.0f);
                } else {
                    i = 0;
                }
                sfc sfcVar = kd8Var.s.q3;
                int measuredHeight = kd8Var.getMeasuredHeight();
                sfcVar.h = (int) (((kd8Var.getMeasuredWidth() - hl.L(16.0f)) - f) - i);
                sfcVar.i = measuredHeight;
                View view2 = sfcVar.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 14:
                li3 li3Var = (li3) obj;
                li3Var.E = f / 1000.0f;
                li3Var.invalidate();
                return;
            case 15:
                ((dr9) obj).k(f);
                return;
            case 16:
                ey9 ey9Var = (ey9) obj;
                sfc sfcVar2 = ey9Var.r.P;
                int measuredHeight2 = ey9Var.getMeasuredHeight();
                sfcVar2.h = (int) (((ey9Var.getMeasuredWidth() - hl.L(16.0f)) - f) - 0.0f);
                sfcVar2.i = measuredHeight2;
                View view3 = sfcVar2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            case 17:
                nea neaVar = (nea) obj;
                float f7 = f / 1000.0f;
                ema emaVar = neaVar.c;
                emaVar.setAlpha(f7);
                c19 c19Var = neaVar.b;
                float f8 = 1.0f - f7;
                c19Var.setAlpha(f8);
                emaVar.setTranslationX(f8 * (-hl.L(10.0f)));
                c19Var.setTranslationX(f7 * hl.L(10.0f));
                return;
            case 18:
                g7b g7bVar = (g7b) obj;
                g7bVar.d0 = f;
                g7bVar.f0 = f2;
                return;
            case 19:
                l2c l2cVar = (l2c) obj;
                l2cVar.H = f;
                l2cVar.c();
                return;
            case 20:
                itc itcVar = (itc) obj;
                itcVar.e = f;
                itcVar.setScaleX(f);
                itcVar.setScaleY(f);
                return;
            case 21:
                euc eucVar = (euc) obj;
                eucVar.c0 = f;
                eucVar.G0();
                return;
            default:
                ((duc) obj).d.setConversionWobble(f);
                return;
        }
    }
}
