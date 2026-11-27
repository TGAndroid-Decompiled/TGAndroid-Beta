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
public final class gla extends View implements s84 {
    public final byte a = 1;
    public Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public gla(Context context, vnb vnbVar) {
        super(context);
        this.h = vnbVar;
        this.b = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.c = new Matrix();
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new pkb(ob6.M0(2131744693, null), 14.16f, hl.o());
    }

    public static void a(Canvas canvas, Drawable drawable, float f, float f2, float f3, float f4) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            intrinsicWidth = hl.L(24.0f);
            intrinsicHeight = intrinsicWidth;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.setAlpha((int) (255.0f * f3));
        canvas.save();
        canvas.rotate(f4, f, f2);
        float R1 = hl.R1(0.6f, 1.0f, f3);
        canvas.scale(R1, R1, f, f2);
        uh9.n(intrinsicHeight, 2.0f, f2, f - (intrinsicWidth / 2.0f), canvas);
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void b(boolean z, boolean z2) {
        float f;
        fm0 fm0Var = (fm0) this.e;
        Drawable drawable = (Drawable) this.b;
        if (drawable == null) {
            if (z) {
                fm0Var.a(true, false);
            }
        } else if (drawable instanceof gd0) {
            gd0 gd0Var = (gd0) drawable;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            gd0Var.c(z2, f);
        } else {
            fm0Var.a(z, z2);
        }
    }

    public final void c(Drawable drawable) {
        t84 t84Var = (t84) this.f;
        t84Var.b();
        t84Var.c(1.0f);
        this.c = null;
        Drawable drawable2 = (Drawable) this.b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (!((jla) this.h).M) {
                ((fm0) this.e).a(false, false);
            }
        }
        d();
        invalidate();
    }

    public final void d() {
        jla jlaVar = (jla) this.h;
        setBackground(aob.f0(jlaVar.o0, 1, -1));
        Drawable drawable = (Drawable) this.b;
        if (drawable instanceof gd0) {
            ((gd0) drawable).a(jlaVar.m0);
            ((gd0) ((Drawable) this.b)).b(jlaVar.n0);
        } else if (drawable instanceof h27) {
            ((h27) drawable).j = jlaVar.m0;
        } else if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(jlaVar.m0, PorterDuff.Mode.SRC_IN));
        }
        ((Drawable) this.d).setColorFilter(new PorterDuffColorFilter(jlaVar.n0, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                Matrix matrix = (Matrix) this.c;
                matrix.reset();
                matrix.postTranslate(hl.L(14.0f), 0.0f);
                matrix.postScale((getWidth() - hl.L(28.0f)) / 255.0f, 1.0f);
                LinearGradient linearGradient = (LinearGradient) this.b;
                linearGradient.setLocalMatrix(matrix);
                Paint paint = (Paint) this.d;
                paint.setShader(linearGradient);
                Object obj = this.f;
                pkb pkbVar = (pkb) obj;
                float L = pkbVar.c + hl.L(30.0f);
                Paint paint2 = (Paint) this.e;
                paint2.setColor(aob.v0(aob.d7, (vnb) this.h));
                canvas.drawRect(hl.L(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - L) / 2.0f) - hl.L(8.0f), getHeight() / 2.0f, paint2);
                canvas.drawRect(hl.L(8.0f) + ((getWidth() + L) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - hl.L(24.0f), getHeight() / 2.0f, paint2);
                RectF rectF = hl.P;
                rectF.set((getWidth() - L) / 2.0f, 0.0f, (getWidth() + L) / 2.0f, getHeight());
                canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
                ((pkb) obj).c((getWidth() - pkbVar.c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
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
                float f2 = ((fm0) this.e).e;
                float f3 = ((t84) this.f).f;
                Drawable drawable = (Drawable) this.c;
                if (drawable != null && f3 < 0.5f) {
                    float B = xnb.B(f3, 2.0f, 1.0f, 1.0f - f2);
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
                ((jla) this.h).invalidate();
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
                ((jla) this.h).invalidate();
                return;
            default:
                super.setTranslationX(f);
                return;
        }
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        invalidate();
    }

    @Override
    public final void v0(float f, int i) {
        if (i == 1 && f == 1.0f) {
            this.c = null;
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

    public gla(jla jlaVar, Context context) {
        super(context);
        this.h = jlaVar;
        k43 k43Var = k43.h;
        this.e = new fm0(0, this, k43Var, 380L, false);
        this.f = new t84(1, this, k43Var, 380L, 1.0f);
        this.d = context.getDrawable(2131231244).mutate();
        d();
    }
}
