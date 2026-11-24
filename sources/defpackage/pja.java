package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class pja extends View implements g94 {
    public final byte a = 1;
    public Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public pja(Context context, ylb ylbVar) {
        super(context);
        this.h = ylbVar;
        this.b = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.c = new Matrix();
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new uib(jb6.M0(2131744725, null), 14.16f, gm.o());
    }

    public static void a(Canvas canvas, Drawable drawable, float f, float f2, float f3, float f4) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            intrinsicWidth = gm.L(24.0f);
            intrinsicHeight = intrinsicWidth;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.setAlpha((int) (255.0f * f3));
        canvas.save();
        canvas.rotate(f4, f, f2);
        float R1 = gm.R1(0.6f, 1.0f, f3);
        canvas.scale(R1, R1, f, f2);
        hg9.m(intrinsicHeight, 2.0f, f2, f - (intrinsicWidth / 2.0f), canvas);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        invalidate();
    }

    @Override
    public final void V(float f, int i) {
        if (i == 1 && f == 1.0f) {
            this.c = null;
        }
    }

    public final void b(boolean z, boolean z2) {
        float f;
        fn0 fn0Var = (fn0) this.e;
        Drawable drawable = (Drawable) this.b;
        if (drawable == null) {
            if (z) {
                fn0Var.a(true, false);
            }
        } else if (drawable instanceof ee0) {
            ee0 ee0Var = (ee0) drawable;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ee0Var.c(z2, f);
        } else {
            fn0Var.a(z, z2);
        }
    }

    public final void c(Drawable drawable) {
        h94 h94Var = (h94) this.f;
        h94Var.b();
        h94Var.c(1.0f);
        this.c = null;
        Drawable drawable2 = (Drawable) this.b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (!((rja) this.h).H) {
                ((fn0) this.e).a(false, false);
            }
        }
        d();
        invalidate();
    }

    public final void d() {
        rja rjaVar = (rja) this.h;
        setBackground(cmb.f0(rjaVar.i0, 1, -1));
        Drawable drawable = (Drawable) this.b;
        if (drawable instanceof ee0) {
            ((ee0) drawable).a(rjaVar.g0);
            ((ee0) ((Drawable) this.b)).b(rjaVar.h0);
        } else if (drawable instanceof a27) {
            ((a27) drawable).j = rjaVar.g0;
        } else if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(rjaVar.g0, PorterDuff.Mode.SRC_IN));
        }
        ((Drawable) this.d).setColorFilter(new PorterDuffColorFilter(rjaVar.h0, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                Matrix matrix = (Matrix) this.c;
                matrix.reset();
                matrix.postTranslate(gm.L(14.0f), 0.0f);
                matrix.postScale((getWidth() - gm.L(28.0f)) / 255.0f, 1.0f);
                LinearGradient linearGradient = (LinearGradient) this.b;
                linearGradient.setLocalMatrix(matrix);
                Paint paint = (Paint) this.d;
                paint.setShader(linearGradient);
                Object obj = this.f;
                uib uibVar = (uib) obj;
                float L = uibVar.c + gm.L(30.0f);
                Paint paint2 = (Paint) this.e;
                paint2.setColor(cmb.v0(cmb.c7, (ylb) this.h));
                canvas.drawRect(gm.L(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - L) / 2.0f) - gm.L(8.0f), getHeight() / 2.0f, paint2);
                canvas.drawRect(gm.L(8.0f) + ((getWidth() + L) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - gm.L(24.0f), getHeight() / 2.0f, paint2);
                RectF rectF = gm.P;
                rectF.set((getWidth() - L) / 2.0f, 0.0f, (getWidth() + L) / 2.0f, getHeight());
                canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
                ((uib) obj).c((getWidth() - uibVar.c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        switch (this.a) {
            case 0:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f2 = ((fn0) this.e).e;
                float f3 = ((h94) this.f).f;
                Drawable drawable = (Drawable) this.c;
                if (drawable != null && f3 < 0.5f) {
                    float B = mlb.B(f3, 2.0f, 1.0f, 1.0f - f2);
                    canvas2 = canvas;
                    a(canvas2, drawable, width, height, B, 0.0f);
                } else {
                    Drawable drawable2 = (Drawable) this.b;
                    if (drawable2 != null && f2 < 1.0f) {
                        float f4 = 1.0f - f2;
                        float f5 = (f3 - 0.5f) * 2.0f;
                        if (drawable == null) {
                            f = 1.0f;
                        } else {
                            f = 0.0f;
                        }
                        canvas2 = canvas;
                        a(canvas2, drawable2, width, height, Math.min(1.0f, f5 + f) * f4, (-90.0f) * f2);
                    } else {
                        canvas2 = canvas;
                    }
                }
                if (f2 > 0.0f) {
                    a(canvas2, (Drawable) this.d, width, height, f2, (1.0f - f2) * 90.0f);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void setAlpha(float f) {
        switch (this.a) {
            case 0:
                super.setAlpha(f);
                ((rja) this.h).invalidate();
                return;
            default:
                super.setAlpha(f);
                return;
        }
    }

    @Override
    public final void setTranslationX(float f) {
        switch (this.a) {
            case 0:
                super.setTranslationX(f);
                ((rja) this.h).invalidate();
                return;
            default:
                super.setTranslationX(f);
                return;
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                if (drawable != ((Drawable) this.b) && drawable != ((Drawable) this.c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public pja(rja rjaVar, Context context) {
        super(context);
        this.h = rjaVar;
        d53 d53Var = d53.h;
        this.e = new fn0(0, this, d53Var, 380L, false);
        this.f = new h94(1, this, d53Var, 380L, 1.0f);
        this.d = context.getDrawable(2131231245).mutate();
        d();
    }
}
