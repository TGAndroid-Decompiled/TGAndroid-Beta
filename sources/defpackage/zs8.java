package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.RadialProgress2;
public final class zs8 extends de0 implements tma {
    public final int H;
    public RadialProgress2 I;
    public ValueAnimator J;
    public float K;
    public long L;
    public boolean M;
    public final int N;
    public final Paint O;
    public Runnable P;
    public final et8 Q;

    public zs8(et8 et8Var, Context context, int i, Paint paint) {
        super(context);
        this.Q = et8Var;
        this.H = hl.L(64.0f);
        this.L = -1L;
        this.N = i;
        this.O = paint;
        setLayerNum(et8Var.m1);
    }

    @Override
    public final void d(Runnable runnable) {
        this.P = runnable;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        et8 et8Var = this.Q;
        if (et8Var.h1) {
            et8Var.invalidate();
        }
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        yl6 yl6Var;
        long j;
        et8 et8Var = this.Q;
        float[] fArr = et8Var.P0;
        Path path = et8Var.N0;
        ArrayList arrayList = et8Var.c1;
        RectF rectF = et8Var.O0;
        de8 de8Var = et8Var.i1;
        if (de8Var == null || !de8Var.n) {
            if (this.I != null) {
                int k = et8Var.E0.k(this.N);
                if (et8Var.j1) {
                    k--;
                }
                Drawable t = getImageReceiver().t();
                long j2 = 0;
                if (k >= arrayList.size() || arrayList.get(k) == null ? !(t == null || (this.M && (!(t instanceof lm) || ((lm) t).d[4] <= 0))) : ((Float) arrayList.get(k)).floatValue() >= 1.0f) {
                    if (this.J == null) {
                        RadialProgress2 radialProgress2 = this.I;
                        if (radialProgress2.c) {
                            yl6Var = radialProgress2.j;
                        } else {
                            yl6Var = radialProgress2.i;
                        }
                        if (yl6Var.w < 1.0f) {
                            radialProgress2.o(true, 1.0f);
                            j2 = 100;
                        }
                        this.K = this.I.E;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.J = ofFloat;
                        ofFloat.setStartDelay(j2);
                        this.J.setDuration(this.K * 250.0f);
                        this.J.setInterpolator(k43.f);
                        this.J.addUpdateListener(new pv7(this, (byte) 20));
                        this.J.addListener(new dn(this, k, (byte) 8));
                        this.J.start();
                    }
                } else {
                    if (this.L < 0) {
                        this.L = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.L;
                        if (this.M) {
                            j = 250;
                        } else {
                            j = 750;
                        }
                        if (currentTimeMillis <= 250 + j && currentTimeMillis > j) {
                            this.I.E = k43.f.getInterpolation(((float) (currentTimeMillis - j)) / 250.0f);
                        }
                    }
                    if (et8Var.h1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                }
                int i = et8Var.n1;
                Paint paint = this.O;
                if (i == 0 && et8Var.o1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    if (i == et8Var.o1) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f = et8Var.n1;
                        canvas2.drawRoundRect(rectF, f, f, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i2 = 0; i2 < 4; i2++) {
                            fArr[i2] = et8Var.n1;
                            fArr[i2 + 4] = et8Var.o1;
                        }
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas2.drawPath(path, paint);
                    }
                }
            } else {
                canvas2 = canvas;
            }
            super.onDraw(canvas);
            RadialProgress2 radialProgress22 = this.I;
            if (radialProgress22 != null && radialProgress22.E > 0.0f) {
                radialProgress22.draw(canvas2);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        if (this.I != null) {
            if (this.Q.A0.getOccupyStatusBar()) {
                i5 = hl.m;
            } else {
                i5 = 0;
            }
            int currentActionBarHeight = a.getCurrentActionBarHeight() + i5;
            int M = hl.M(80.0f);
            RadialProgress2 radialProgress2 = this.I;
            int i6 = this.H;
            int i7 = (i2 - currentActionBarHeight) - M;
            radialProgress2.p((i - i6) / 2, ik8.g(i7, i6, 2, currentActionBarHeight), (i + i6) / 2, ((i7 + i6) / 2) + currentActionBarHeight);
        }
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }
}
