package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
public final class i19 extends Drawable implements Animator.AnimatorListener {
    public static final RectF c0 = new RectF();
    public static final Rect d0 = new Rect();
    public static final int[] e0 = new int[2];
    public static final qm f0 = new qm("openFactor", (byte) 11);
    public static final qm g0 = new qm("openFactor", (byte) 12);
    public final wb2 E;
    public final r47 F;
    public float G;
    public Bitmap J;
    public BitmapShader K;
    public Paint M;
    public al0 Q;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public c21 X;
    public float Y;
    public float Z;
    public final j19 a;
    public final yz8 b;
    public final LinearGradient f;
    public final f19[] x;
    public final Drawable y;
    public final Paint c = new Paint(1);
    public final Matrix d = new Matrix();
    public final Path e = new Path();
    public final RectF h = new RectF();
    public final RectF n = new RectF();
    public final RectF r = new RectF();
    public final RectF s = new RectF();
    public final RectF w = new RectF();
    public float H = 0.0f;
    public float I = 0.0f;
    public final Matrix L = new Matrix();
    public boolean N = false;
    public boolean O = false;
    public boolean P = false;
    public boolean R = true;
    public int S = -1;
    public final ObjectAnimator a0 = ObjectAnimator.ofFloat(this, f0, 1.0f).setDuration(560L);
    public final ObjectAnimator b0 = ObjectAnimator.ofFloat(this, g0, 1.0f).setDuration(240L);

    public i19(j19 j19Var, wb2 wb2Var, ArrayList arrayList, yz8 yz8Var) {
        this.b = yz8Var;
        this.a = j19Var;
        this.E = wb2Var;
        this.F = wb2Var.getMessageObject();
        this.x = new f19[Math.min(5, arrayList.size())];
        int i = 0;
        while (true) {
            f19[] f19VarArr = this.x;
            if (i < f19VarArr.length) {
                f19VarArr[i] = new f19(this, ((Long) arrayList.get(i)).longValue());
                i++;
            } else {
                this.c.setStyle(Paint.Style.FILL);
                Drawable mutate = j19Var.getContext().getDrawable(2131232689).mutate();
                this.y = mutate;
                wb2Var.setHideSideButtonByQuickShare(true);
                j19Var.performHapticFeedback(3, 1);
                int v0 = aob.v0(aob.G8, this.E.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.Ke, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(100.0f), new int[]{v0, 16777215 & v0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f = linearGradient;
                this.c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.a0;
                LinearInterpolator linearInterpolator = h19.b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.a0.addListener(this);
                this.b0.setInterpolator(linearInterpolator);
                this.b0.addListener(this);
                hl.j2(new ji7(this, (byte) 26), 15.0f);
                return;
            }
        }
    }

    public static float b(float f, float f2, float f3, float f4) {
        return (float) Math.toDegrees((float) Math.atan2(f4 - f2, f3 - f));
    }

    public static PointF f(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        float f7 = f4 - f;
        float f8 = f5 - f2;
        float sqrt = (float) Math.sqrt(Math.pow(f8, 2.0d) + Math.pow(f7, 2.0d));
        if (sqrt <= f3 + f6 && sqrt >= Math.abs(f3 - f6)) {
            float f9 = f3 * f3;
            float f10 = ((sqrt * sqrt) + (f9 - (f6 * f6))) / (2.0f * sqrt);
            float sqrt2 = (float) Math.sqrt(f9 - (f10 * f10));
            float d = qu6.d(f10, f7, sqrt, f);
            float d2 = qu6.d(f10, f8, sqrt, f2);
            float f11 = (f8 * sqrt2) / sqrt;
            float f12 = d + f11;
            float f13 = (sqrt2 * f7) / sqrt;
            float f14 = d2 - f13;
            float f15 = d - f11;
            float f16 = d2 + f13;
            if (f12 != f15 && f12 < f15) {
                if (z) {
                    return new PointF(f12, f14);
                }
                return new PointF(f15, f16);
            } else if (f14 > f16) {
                return new PointF(f12, f14);
            } else {
                return new PointF(f15, f16);
            }
        }
        return null;
    }

    public static float g(float f, float f2, float f3) {
        return qd4.A(f2, f, f3, f);
    }

    public static g19 i(Interpolator interpolator, int i, int i2, int i3, boolean z) {
        float f = i3;
        return new g19(z, i / f, i2 / f, interpolator);
    }

    public static float j(float f) {
        if (f <= 0.0f) {
            return f + 180.0f;
        }
        return f - 180.0f;
    }

    public final void a(Path path, RectF rectF, float f, float f2, boolean z, boolean z2) {
        float f3 = f2 - f;
        if (z) {
            if (f3 > 0.0f) {
                f3 -= 360.0f;
            }
        } else if (f3 < 0.0f) {
            f3 += 360.0f;
        }
        if (Math.abs(f3) > 270.0f && z2) {
            this.R = false;
        }
        path.arcTo(rectF, f, f3);
    }

    public final void c() {
        this.b0.start();
        this.P = true;
        if (this.N && !this.U) {
            al0 al0Var = new al0(new jz7(this, (byte) 24));
            this.Q = al0Var;
            RectF rectF = this.r;
            al0Var.b((int) rectF.width(), (int) (rectF.height() + hl.L(30.0f)), 4.0f, hl.L(10.0f));
        }
        invalidateSelf();
    }

    public final void d() {
        f19[] f19VarArr;
        this.E.setHideSideButtonByQuickShare(false);
        if (!this.U) {
            this.U = true;
            Bitmap bitmap = this.J;
            if (bitmap != null) {
                bitmap.recycle();
            }
            al0 al0Var = this.Q;
            if (al0Var != null) {
                al0Var.a();
            }
            for (f19 f19Var : this.x) {
                al0 al0Var2 = f19Var.f;
                if (al0Var2 != null) {
                    al0Var2.a();
                }
                al0 al0Var3 = f19Var.e;
                if (al0Var3 != null) {
                    al0Var3.a();
                }
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        e(canvas, false, 255);
    }

    public final void e(android.graphics.Canvas r32, boolean r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i19.e(android.graphics.Canvas, boolean, int):void");
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final int h() {
        return hl.L((53 * this.x.length) + 7);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.a0;
        yz8 yz8Var = this.b;
        if (animator == objectAnimator) {
            this.E.setHideSideButtonByQuickShare(false);
            this.N = true;
            invalidateSelf();
            if (this.O) {
                yz8Var.run();
            }
        } else if (animator == this.b0) {
            this.O = true;
            invalidateSelf();
            c21 c21Var = this.X;
            if (c21Var != null) {
                c21Var.a.setVisibility(0);
            }
            if (this.N) {
                yz8Var.run();
            }
        }
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
    }

    @Override
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
