package di;

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
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.wy0;
public final class yb extends View implements te.b {
    public final int f10079a = 0;
    public Object f10080b;
    public Object f10081c;
    public final Object d;
    public final Object f10082e;
    public final Object f10083f;
    public final Object h;

    public yb(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.h = i6Var;
        this.f10080b = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f10081c = new Matrix();
        this.d = new Paint(1);
        this.f10082e = new Paint(1);
        this.f10083f = new wy0(gd.N0(2131744795, null), 14.16f, org.telegram.messenger.g0.o());
    }

    public static void a(Canvas canvas, Drawable drawable, float f10, float f11, float f12, float f13) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            intrinsicWidth = org.telegram.messenger.g0.L(24.0f);
            intrinsicHeight = intrinsicWidth;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.setAlpha((int) (255.0f * f12));
        canvas.save();
        canvas.rotate(f13, f10, f11);
        float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f12);
        canvas.scale(T1, T1, f10, f11);
        m10.k(intrinsicHeight, 2.0f, f11, f10 - (intrinsicWidth / 2.0f), canvas);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override
    public void G(float f10, int i7) {
        if (i7 == 1 && f10 == 1.0f) {
            this.f10081c = null;
        }
    }

    @Override
    public void K(int i7, float f10, float f11, te.c cVar) {
        invalidate();
    }

    public void b(boolean z10, boolean z11) {
        float f10;
        te.a aVar = (te.a) this.f10082e;
        Drawable drawable = (Drawable) this.f10080b;
        if (drawable == null) {
            if (z10) {
                aVar.a(true, false);
            }
        } else if (drawable instanceof org.telegram.ui.ActionBar.x1) {
            org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) drawable;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            x1Var.c(z11, f10);
        } else {
            aVar.a(z10, z11);
        }
    }

    public void c(Drawable drawable) {
        te.c cVar = (te.c) this.f10083f;
        cVar.b();
        cVar.c(1.0f);
        this.f10081c = null;
        Drawable drawable2 = (Drawable) this.f10080b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f10080b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (!((org.telegram.ui.ActionBar.z4) this.h).H) {
                ((te.a) this.f10082e).a(false, false);
            }
        }
        d();
        invalidate();
    }

    public void d() {
        org.telegram.ui.ActionBar.z4 z4Var = (org.telegram.ui.ActionBar.z4) this.h;
        setBackground(org.telegram.ui.ActionBar.n6.h0(z4Var.f30392i0, 1, -1));
        Drawable drawable = (Drawable) this.f10080b;
        if (drawable instanceof org.telegram.ui.ActionBar.x1) {
            ((org.telegram.ui.ActionBar.x1) drawable).a(z4Var.f30390g0);
            ((org.telegram.ui.ActionBar.x1) ((Drawable) this.f10080b)).b(z4Var.f30391h0);
        } else if (drawable instanceof org.telegram.ui.ActionBar.s4) {
            ((org.telegram.ui.ActionBar.s4) drawable).f30058j = z4Var.f30390g0;
        } else if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(z4Var.f30390g0, PorterDuff.Mode.SRC_IN));
        }
        ((Drawable) this.d).setColorFilter(new PorterDuffColorFilter(z4Var.f30391h0, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f10079a) {
            case 0:
                Matrix matrix = (Matrix) this.f10081c;
                matrix.reset();
                matrix.postTranslate(org.telegram.messenger.g0.L(14.0f), 0.0f);
                matrix.postScale((getWidth() - org.telegram.messenger.g0.L(28.0f)) / 255.0f, 1.0f);
                LinearGradient linearGradient = (LinearGradient) this.f10080b;
                linearGradient.setLocalMatrix(matrix);
                Paint paint = (Paint) this.d;
                paint.setShader(linearGradient);
                wy0 wy0Var = (wy0) this.f10083f;
                float L = wy0Var.f41763c + org.telegram.messenger.g0.L(30.0f);
                Paint paint2 = (Paint) this.f10082e;
                paint2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29452d7, (org.telegram.ui.ActionBar.i6) this.h));
                canvas.drawRect(org.telegram.messenger.g0.L(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - L) / 2.0f) - org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, paint2);
                canvas.drawRect(org.telegram.messenger.g0.L(8.0f) + ((getWidth() + L) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - org.telegram.messenger.g0.L(24.0f), getHeight() / 2.0f, paint2);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set((getWidth() - L) / 2.0f, 0.0f, (getWidth() + L) / 2.0f, getHeight());
                canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
                ((wy0) this.f10083f).c((getWidth() - wy0Var.f41763c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        switch (this.f10079a) {
            case 1:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f11 = ((te.a) this.f10082e).f57779e;
                float f12 = ((te.c) this.f10083f).f57785f;
                Drawable drawable = (Drawable) this.f10081c;
                if (drawable != null && f12 < 0.5f) {
                    float C = com.google.android.gms.internal.vision.e2.C(f12, 2.0f, 1.0f, 1.0f - f11);
                    canvas2 = canvas;
                    a(canvas2, drawable, width, height, C, 0.0f);
                } else {
                    Drawable drawable2 = (Drawable) this.f10080b;
                    if (drawable2 != null && f11 < 1.0f) {
                        float f13 = 1.0f - f11;
                        float f14 = (f12 - 0.5f) * 2.0f;
                        if (drawable == null) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        canvas2 = canvas;
                        a(canvas2, drawable2, width, height, Math.min(1.0f, f14 + f10) * f13, (-90.0f) * f11);
                    } else {
                        canvas2 = canvas;
                    }
                }
                if (f11 > 0.0f) {
                    a(canvas2, (Drawable) this.d, width, height, f11, (1.0f - f11) * 90.0f);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f10079a) {
            case 1:
                super.setAlpha(f10);
                ((org.telegram.ui.ActionBar.z4) this.h).invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationX(float f10) {
        switch (this.f10079a) {
            case 1:
                super.setTranslationX(f10);
                ((org.telegram.ui.ActionBar.z4) this.h).invalidate();
                return;
            default:
                super.setTranslationX(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f10079a) {
            case 1:
                if (drawable != ((Drawable) this.f10080b) && drawable != ((Drawable) this.f10081c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public yb(org.telegram.ui.ActionBar.z4 z4Var, Context context) {
        super(context);
        this.h = z4Var;
        kr krVar = kr.h;
        this.f10082e = new te.a(0, this, krVar, 380L, false);
        this.f10083f = new te.c(1, this, krVar, 380L, 1.0f);
        this.d = context.getDrawable(2131231244).mutate();
        d();
    }
}
