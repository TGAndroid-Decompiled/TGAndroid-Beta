package defpackage;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
public final class pg3 implements wg5 {
    public final byte a;
    public final d b;
    public final FrameLayout c;
    public final Object d;

    public pg3(d dVar, FrameLayout frameLayout, Object obj, byte b) {
        this.a = b;
        this.b = dVar;
        this.c = frameLayout;
        this.d = obj;
    }

    @Override
    public final void a(tab tabVar, RectF rectF) {
        byte b = this.a;
        tabVar.b = true;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        int i;
        Canvas canvas2;
        RectF rectF2;
        byte b = this.a;
        Object obj = this.d;
        FrameLayout frameLayout = this.c;
        d dVar = this.b;
        switch (b) {
            case 0:
                cj3 cj3Var = (cj3) dVar;
                vi3 vi3Var = (vi3) frameLayout;
                PointF pointF = (PointF) obj;
                hi3 hi3Var = cj3Var.D0;
                int i2 = 0;
                if (hi3Var != null) {
                    i = (int) (hi3Var.getAlpha() * 255.0f);
                } else {
                    i = 0;
                }
                bj3[] bj3VarArr = cj3Var.f0;
                int length = bj3VarArr.length;
                while (i2 < length) {
                    bj3 bj3Var = bj3VarArr[i2];
                    if (bj3Var != null && bj3Var.getVisibility() == 0 && bj3Var.getAlpha() > 0.0f) {
                        float r3 = cj3Var.r3();
                        if (bj3Var.G != null && r3 > 0.0f) {
                            if (zec.b(bj3Var.a, vi3Var, pointF)) {
                                canvas.save();
                                canvas.clipRect(rectF);
                                canvas.translate(pointF.x, pointF.y);
                                bj3Var.a.dispatchDraw(canvas);
                                canvas.restore();
                            } else {
                                return;
                            }
                        } else {
                            yi3 yi3Var = bj3Var.a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            tk0.b(yi3Var, canvas2, rectF2, yi3Var, vi3Var, 255 - i);
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
                hi3 hi3Var2 = cj3Var.D0;
                if (hi3Var2 != null && hi3Var2.getVisibility() == 0 && cj3Var.D0.getAlpha() > 0.0f) {
                    hi3 hi3Var3 = cj3Var.D0;
                    tk0.b(hi3Var3, canvas3, rectF3, hi3Var3, vi3Var, i);
                    return;
                }
                return;
            default:
                uxa uxaVar = (uxa) dVar;
                jd jdVar = (jd) obj;
                twa twaVar = uxaVar.T;
                if (twaVar != null) {
                    tk0.a(twaVar, canvas, rectF, twaVar, frameLayout);
                }
                kg1 kg1Var = uxaVar.j0;
                if (kg1Var != null) {
                    o39 o39Var = kg1Var.G;
                    tk0.a(o39Var, canvas, rectF, o39Var, frameLayout);
                }
                zi1 zi1Var = uxaVar.k0;
                if (zi1Var != null && zi1Var.getParent() == uxaVar.i0 && uxaVar.k0.getVisibility() == 0) {
                    uxaVar.k0.d(canvas, rectF, jdVar);
                    return;
                }
                return;
        }
    }
}
