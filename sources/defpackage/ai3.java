package defpackage;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
public final class ai3 implements vi5 {
    public final byte a;
    public final d b;
    public final FrameLayout c;
    public final Object d;

    public ai3(d dVar, FrameLayout frameLayout, Object obj, byte b) {
        this.a = b;
        this.b = dVar;
        this.c = frameLayout;
        this.d = obj;
    }

    @Override
    public final void a(ucb ucbVar, RectF rectF) {
        byte b = this.a;
        ucbVar.b = true;
    }

    @Override
    public final void g(Canvas canvas, RectF rectF) {
        int i;
        Canvas canvas2;
        RectF rectF2;
        byte b = this.a;
        Object obj = this.d;
        FrameLayout frameLayout = this.c;
        d dVar = this.b;
        switch (b) {
            case 0:
                nk3 nk3Var = (nk3) dVar;
                gk3 gk3Var = (gk3) frameLayout;
                PointF pointF = (PointF) obj;
                sj3 sj3Var = nk3Var.D0;
                int i2 = 0;
                if (sj3Var != null) {
                    i = (int) (sj3Var.getAlpha() * 255.0f);
                } else {
                    i = 0;
                }
                mk3[] mk3VarArr = nk3Var.f0;
                int length = mk3VarArr.length;
                while (i2 < length) {
                    mk3 mk3Var = mk3VarArr[i2];
                    if (mk3Var != null && mk3Var.getVisibility() == 0 && mk3Var.getAlpha() > 0.0f) {
                        float t3 = nk3Var.t3();
                        if (mk3Var.G != null && t3 > 0.0f) {
                            if (zgc.b(mk3Var.a, gk3Var, pointF)) {
                                canvas.save();
                                canvas.clipRect(rectF);
                                canvas.translate(pointF.x, pointF.y);
                                mk3Var.a.dispatchDraw(canvas);
                                canvas.restore();
                            } else {
                                return;
                            }
                        } else {
                            jk3 jk3Var = mk3Var.a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            tl0.b(jk3Var, canvas2, rectF2, jk3Var, gk3Var, 255 - i);
                            i2++;
                            canvas = canvas2;
                            rectF = rectF2;
                        }
                    }
                    canvas2 = canvas;
                    rectF2 = rectF;
                    i2++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                Canvas canvas3 = canvas;
                RectF rectF3 = rectF;
                sj3 sj3Var2 = nk3Var.D0;
                if (sj3Var2 != null && sj3Var2.getVisibility() == 0 && nk3Var.D0.getAlpha() > 0.0f) {
                    sj3 sj3Var3 = nk3Var.D0;
                    tl0.b(sj3Var3, canvas3, rectF3, sj3Var3, gk3Var, i);
                    return;
                }
                return;
            default:
                xza xzaVar = (xza) dVar;
                je jeVar = (je) obj;
                wya wyaVar = xzaVar.T;
                if (wyaVar != null) {
                    tl0.a(wyaVar, canvas, rectF, wyaVar, frameLayout);
                }
                sh1 sh1Var = xzaVar.j0;
                if (sh1Var != null) {
                    r59 r59Var = sh1Var.G;
                    tl0.a(r59Var, canvas, rectF, r59Var, frameLayout);
                }
                ik1 ik1Var = xzaVar.k0;
                if (ik1Var != null && ik1Var.getParent() == xzaVar.i0 && xzaVar.k0.getVisibility() == 0) {
                    xzaVar.k0.d(canvas, rectF, jeVar);
                    return;
                }
                return;
        }
    }
}
