package defpackage;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e;
public final class kh3 implements yi5 {
    public final byte a;
    public final e b;
    public final FrameLayout c;
    public final Object d;

    public kh3(e eVar, FrameLayout frameLayout, Object obj, byte b) {
        this.a = b;
        this.b = eVar;
        this.c = frameLayout;
        this.d = obj;
    }

    @Override
    public final void a(qeb qebVar, RectF rectF) {
        byte b = this.a;
        qebVar.b = true;
    }

    @Override
    public final void g(Canvas canvas, RectF rectF) {
        int i;
        Canvas canvas2;
        RectF rectF2;
        byte b = this.a;
        Object obj = this.d;
        FrameLayout frameLayout = this.c;
        e eVar = this.b;
        switch (b) {
            case 0:
                uj3 uj3Var = (uj3) eVar;
                nj3 nj3Var = (nj3) frameLayout;
                PointF pointF = (PointF) obj;
                bj3 bj3Var = uj3Var.D0;
                int i2 = 0;
                if (bj3Var != null) {
                    i = (int) (bj3Var.getAlpha() * 255.0f);
                } else {
                    i = 0;
                }
                tj3[] tj3VarArr = uj3Var.f0;
                int length = tj3VarArr.length;
                while (i2 < length) {
                    tj3 tj3Var = tj3VarArr[i2];
                    if (tj3Var != null && tj3Var.getVisibility() == 0 && tj3Var.getAlpha() > 0.0f) {
                        float t3 = uj3Var.t3();
                        if (tj3Var.G != null && t3 > 0.0f) {
                            if (yic.b(tj3Var.a, nj3Var, pointF)) {
                                canvas.save();
                                canvas.clipRect(rectF);
                                canvas.translate(pointF.x, pointF.y);
                                tj3Var.a.dispatchDraw(canvas);
                                canvas.restore();
                            } else {
                                return;
                            }
                        } else {
                            qj3 qj3Var = tj3Var.a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            uk0.b(qj3Var, canvas2, rectF2, qj3Var, nj3Var, 255 - i);
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
                bj3 bj3Var2 = uj3Var.D0;
                if (bj3Var2 != null && bj3Var2.getVisibility() == 0 && uj3Var.D0.getAlpha() > 0.0f) {
                    bj3 bj3Var3 = uj3Var.D0;
                    uk0.b(bj3Var3, canvas3, rectF3, bj3Var3, nj3Var, i);
                    return;
                }
                return;
            default:
                w1b w1bVar = (w1b) eVar;
                kd kdVar = (kd) obj;
                w0b w0bVar = w1bVar.T;
                if (w0bVar != null) {
                    uk0.a(w0bVar, canvas, rectF, w0bVar, frameLayout);
                }
                tg1 tg1Var = w1bVar.j0;
                if (tg1Var != null) {
                    d79 d79Var = tg1Var.G;
                    uk0.a(d79Var, canvas, rectF, d79Var, frameLayout);
                }
                ij1 ij1Var = w1bVar.k0;
                if (ij1Var != null && ij1Var.getParent() == w1bVar.i0 && w1bVar.k0.getVisibility() == 0) {
                    w1bVar.k0.d(canvas, rectF, kdVar);
                    return;
                }
                return;
        }
    }
}
