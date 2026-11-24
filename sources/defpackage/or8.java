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
public final class or8 extends bf0 implements bla {
    public final int H;
    public RadialProgress2 I;
    public ValueAnimator J;
    public float K;
    public long L;
    public boolean M;
    public final int N;
    public final Paint O;
    public Runnable P;
    public final tr8 Q;

    public or8(tr8 tr8Var, Context context, int i, Paint paint) {
        super(context);
        this.Q = tr8Var;
        this.H = gm.L(64.0f);
        this.L = -1L;
        this.N = i;
        this.O = paint;
        setLayerNum(tr8Var.m1);
    }

    @Override
    public final void d(Runnable runnable) {
        this.P = runnable;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        tr8 tr8Var = this.Q;
        if (tr8Var.h1) {
            tr8Var.invalidate();
        }
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        wl6 wl6Var;
        long j;
        tr8 tr8Var = this.Q;
        float[] fArr = tr8Var.P0;
        Path path = tr8Var.N0;
        ArrayList arrayList = tr8Var.c1;
        RectF rectF = tr8Var.O0;
        pc8 pc8Var = tr8Var.i1;
        if (pc8Var == null || !pc8Var.n) {
            if (this.I != null) {
                int k = tr8Var.E0.k(this.N);
                if (tr8Var.j1) {
                    k--;
                }
                Drawable t = getImageReceiver().t();
                long j2 = 0;
                if (k >= arrayList.size() || arrayList.get(k) == null ? !(t == null || (this.M && (!(t instanceof kn) || ((kn) t).d[4] <= 0))) : ((Float) arrayList.get(k)).floatValue() >= 1.0f) {
                    if (this.J == null) {
                        RadialProgress2 radialProgress2 = this.I;
                        if (radialProgress2.c) {
                            wl6Var = radialProgress2.j;
                        } else {
                            wl6Var = radialProgress2.i;
                        }
                        if (wl6Var.w < 1.0f) {
                            radialProgress2.o(true, 1.0f);
                            j2 = 100;
                        }
                        this.K = this.I.E;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.J = ofFloat;
                        ofFloat.setStartDelay(j2);
                        this.J.setDuration(this.K * 250.0f);
                        this.J.setInterpolator(d53.f);
                        this.J.addUpdateListener(new fx7(this, (byte) 19));
                        this.J.addListener(new co(this, k, (byte) 8));
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
                            this.I.E = d53.f.getInterpolation(((float) (currentTimeMillis - j)) / 250.0f);
                        }
                    }
                    if (tr8Var.h1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                }
                int i = tr8Var.n1;
                Paint paint = this.O;
                if (i == 0 && tr8Var.o1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    if (i == tr8Var.o1) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f = tr8Var.n1;
                        canvas2.drawRoundRect(rectF, f, f, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i2 = 0; i2 < 4; i2++) {
                            fArr[i2] = tr8Var.n1;
                            fArr[i2 + 4] = tr8Var.o1;
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
                i5 = gm.m;
            } else {
                i5 = 0;
            }
            int currentActionBarHeight = a.getCurrentActionBarHeight() + i5;
            int M = gm.M(80.0f);
            RadialProgress2 radialProgress2 = this.I;
            int i6 = this.H;
            int i7 = (i2 - currentActionBarHeight) - M;
            radialProgress2.p((i - i6) / 2, wi8.g(i7, i6, 2, currentActionBarHeight), (i + i6) / 2, ((i7 + i6) / 2) + currentActionBarHeight);
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
