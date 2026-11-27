package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public class hr8 extends de0 implements tma {
    public static final qm h0 = new qm("crossfadeProgress", (byte) 10);
    public boolean H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final Path O;
    public final RectF P;
    public final Paint Q;
    public boolean R;
    public float S;
    public float T;
    public ImageReceiver U;
    public final ImageReceiver V;
    public float W;
    public mn5 a0;
    public boolean b0;
    public float c0;
    public et8 d0;
    public boolean e0;
    public float f0;
    public Runnable g0;

    public hr8(Context context) {
        super(context);
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.O = new Path();
        this.P = new RectF();
        this.R = true;
        this.S = 1.0f;
        this.b0 = true;
        this.f0 = 1.0f;
        this.g0 = null;
        setLayerType(2, null);
        this.V = new ImageReceiver(this);
        Paint paint = new Paint(1);
        this.Q = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void d(Runnable runnable) {
        this.g0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.W;
    }

    public kz1 getPrevFragment() {
        return null;
    }

    public int getRoundRadiusForExpand() {
        if (!this.N) {
            return getRoundRadius()[0];
        }
        return this.L;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        et8 et8Var = this.d0;
        if (et8Var != null) {
            et8Var.invalidate();
        }
        Runnable runnable = this.g0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V.K();
        mn5 mn5Var = this.a0;
        if (mn5Var != null) {
            mn5Var.a();
            this.a0 = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z;
        ws8 ws8Var;
        float f;
        ImageReceiver imageReceiver;
        float f2;
        boolean z2;
        float f3;
        int i;
        float f4;
        float f5;
        float f6;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        et8 et8Var = this.d0;
        boolean z3 = true;
        if (et8Var != null && et8Var.getVisibility() == 0 && this.N && this.I > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ws8 blurDrawer = this.d0.getBlurDrawer();
            if (blurDrawer == null) {
                z3 = false;
            }
            boolean z4 = z3;
            ws8Var = blurDrawer;
            z = z4;
        } else {
            ws8Var = null;
        }
        if (this.e0) {
            f = (int) hl.N(3.5f);
        } else {
            f = 0.0f;
        }
        float z5 = qd4.z(1.0f, this.W, this.f0, (1.0f - this.c0) * f);
        wl wlVar = this.e;
        if (wlVar != null) {
            imageReceiver = wlVar.k;
        } else {
            imageReceiver = this.a;
        }
        int i2 = this.L;
        if (i2 > 0) {
            Path path = this.O;
            path.rewind();
            RectF rectF = hl.P;
            f2 = 1.0f;
            rectF.set(z5, z5, measuredWidth - z5, measuredHeight - z5);
            float f7 = i2;
            path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
            canvas.clipPath(path);
        } else {
            f2 = 1.0f;
        }
        canvas.save();
        float f8 = this.S;
        float f9 = measuredWidth;
        float f10 = measuredHeight;
        canvas.scale(f8, f8, f9 / 2.0f, f10 / 2.0f);
        if (z) {
            if (this.H) {
                measuredHeight = Math.min(measuredHeight, measuredWidth);
            } else {
                measuredHeight = (int) (f10 - hl.R1(0.0f, this.M / this.J, this.I));
            }
        }
        ImageReceiver imageReceiver2 = this.U;
        if (imageReceiver2 != null) {
            float f11 = this.T;
            float f12 = (f2 - f11) * f2;
            if (f11 > 0.0f) {
                float f13 = imageReceiver2.L0;
                float f14 = imageReceiver2.M0;
                f3 = 0.0f;
                float f15 = imageReceiver2.N0;
                i = 0;
                float f16 = imageReceiver2.O0;
                float alpha = imageReceiver2.getAlpha();
                float f17 = z5 * 2.0f;
                z2 = z;
                f6 = f12;
                this.U.i0(z5, z5, f9 - f17, measuredHeight - f17);
                this.U.setAlpha(f11);
                this.U.h(canvas, null);
                this.U.i0(f13, f14, f15, f16);
                this.U.setAlpha(alpha);
            } else {
                z2 = z;
                f3 = 0.0f;
                f6 = f12;
                i = 0;
            }
            f4 = f6;
        } else {
            z2 = z;
            f3 = 0.0f;
            i = 0;
            f4 = f2;
        }
        if (imageReceiver != null && f4 > f3 && (this.W < f2 || !this.b0)) {
            float f18 = z5 * 2.0f;
            imageReceiver.i0(z5, z5, f9 - f18, measuredHeight - f18);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f4);
            if (this.R) {
                int i3 = imageReceiver.X0[i];
                if (z2) {
                    imageReceiver.q0(i);
                }
                imageReceiver.h(canvas, null);
                if (z2) {
                    imageReceiver.q0(i3);
                }
            }
            imageReceiver.setAlpha(alpha2);
        }
        if (this.W > f3 && this.b0 && f4 > f3) {
            ImageReceiver imageReceiver3 = this.V;
            if (imageReceiver3.t() != null) {
                float f19 = z5 * 2.0f;
                imageReceiver3.i0(z5, z5, f9 - f19, measuredHeight - f19);
                imageReceiver3.setAlpha(this.W * f4);
                imageReceiver3.h(canvas, null);
            } else {
                RectF rectF2 = this.P;
                float f20 = f3;
                rectF2.set(f20, f20, f9, measuredHeight);
                Paint paint = this.Q;
                paint.setAlpha((int) (this.W * f4 * 255.0f));
                float f21 = imageReceiver3.X0[0];
                canvas.drawRoundRect(rectF2, f21, f21, paint);
            }
        }
        if (z2) {
            float f22 = measuredHeight;
            canvas.translate(z5, z5 + f22);
            if (!this.H && !ws8Var.a && this.d0.getRealPosition() != 0) {
                f5 = f2;
            } else {
                f5 = f2 - this.I;
            }
            float f23 = z5 * 2.0f;
            ws8Var.d(canvas, this, f9 - f23, f22 - f23, true, f5, f4);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.U = imageReceiver;
    }

    public void setAvatarsViewPager(et8 et8Var) {
        this.d0 = et8Var;
    }

    public void setCrossfadeProgress(float f) {
        this.T = f;
        invalidate();
    }

    public void setForegroundAlpha(float f) {
        this.W = f;
        invalidate();
    }

    public void setForegroundImageDrawable(mn5 mn5Var) {
        if (mn5Var != null) {
            this.V.g0(mn5Var.d);
        }
        mn5 mn5Var2 = this.a0;
        if (mn5Var2 != null) {
            mn5Var2.a();
            this.a0 = null;
        }
        this.a0 = mn5Var;
    }

    public void setHasStories(boolean z) {
        if (this.e0 == z) {
            return;
        }
        this.e0 = z;
        invalidate();
    }

    public void setProgressToExpand(float f) {
        if (this.c0 == f) {
            return;
        }
        this.c0 = f;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f) {
        if (f == this.f0) {
            return;
        }
        this.f0 = f;
        invalidate();
    }

    @Override
    public void setRoundRadius(int i) {
        super.setRoundRadius(i);
        this.V.q0(i);
    }

    public void setRoundRadiusCollapse(int i) {
        int i2 = this.K;
        this.K = i;
        if (i2 != i) {
            super.invalidate();
        }
    }

    public void setRoundRadiusForExpand(int i) {
        if (!this.N) {
            setRoundRadius(i);
            return;
        }
        this.L = i;
        setRoundRadius(i);
    }

    public final void u(int i) {
        this.M = i;
        this.N = true;
    }

    public final void v(jn5 jn5Var, String str, Drawable drawable) {
        this.V.c0(jn5Var, str, drawable, 0L, null, null, 0);
        mn5 mn5Var = this.a0;
        if (mn5Var != null) {
            mn5Var.a();
            this.a0 = null;
        }
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.g0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        Runnable runnable = this.g0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
