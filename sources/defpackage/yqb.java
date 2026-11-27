package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
public final class yqb {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final zqb f;

    public yqb(zqb zqbVar) {
        this.f = zqbVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(2.0f));
    }

    public final void a(Canvas canvas, float f) {
        float f2;
        int i;
        float f3;
        float f4;
        StaticLayout noThemeStaticLayout;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        byte b;
        float f10;
        zqb zqbVar = this.f;
        ImageReceiver imageReceiver = zqbVar.Q;
        float f11 = zqbVar.e;
        t37 t37Var = zqbVar.T;
        t37 t37Var2 = zqbVar.S;
        float f12 = zqbVar.d;
        float f13 = zqbVar.c;
        byte b2 = zqbVar.L;
        RectF rectF = zqbVar.w;
        if (!zqbVar.a0 && zqbVar.E == null) {
            f4 = 0.5f;
            f2 = 255.0f;
            f3 = 4.0f;
        } else {
            ne2 ne2Var = zqbVar.H;
            f2 = 255.0f;
            dz3 dz3Var = (dz3) ne2Var.a.f.get(ne2Var.c);
            if (zqbVar.H.a.l()) {
                i = aob.v0(aob.Fi, zqbVar.y);
            } else {
                i = dz3Var.j;
            }
            Paint paint = this.a;
            paint.setColor(i);
            paint.setAlpha((int) (zqbVar.N * f * 255.0f));
            f3 = 4.0f;
            f4 = 0.5f;
            float A = qd4.A(1.0f, zqbVar.N, hl.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(A, A, zqbVar.getWidth() - A, zqbVar.getHeight() - A);
            float f14 = zqbVar.a;
            canvas.drawRoundRect(rectF, f14, f14, paint);
        }
        int i2 = (int) (f * f2);
        Paint paint2 = this.b;
        paint2.setAlpha(i2);
        Paint paint3 = this.c;
        paint3.setAlpha(i2);
        rectF.set(f13, f13, zqbVar.getWidth() - f13, zqbVar.getHeight() - f13);
        ez3 ez3Var = zqbVar.H.a;
        if (ez3Var != null) {
            if (ez3Var.l()) {
                zqbVar.H.a.getClass();
            } else if (b2 != 4) {
                if (b2 == 2) {
                    zqbVar.H.getClass();
                    return;
                }
                float L = hl.L(8.0f) + f13;
                if (b2 == 3) {
                    f5 = 5.0f;
                } else {
                    f5 = 22.0f;
                }
                float L2 = hl.L(f5) + f13;
                if (b2 != 0 && b2 != 3) {
                    L = 0.12f * zqbVar.getMeasuredHeight();
                    f6 = f11;
                    rectF.set(zqbVar.getMeasuredWidth() - (zqbVar.getMeasuredWidth() * 0.65f), L, zqbVar.getMeasuredWidth() - (zqbVar.getMeasuredWidth() * 0.1f), zqbVar.getMeasuredHeight() * 0.32f);
                } else {
                    f6 = f11;
                    if (b2 == 3) {
                        f7 = 1.2f;
                    } else {
                        f7 = 1.0f;
                    }
                    rectF.set(L2, L, (f7 * f6) + L2, L + f12);
                }
                if (b2 == 3) {
                    paint2 = paint3;
                }
                if (b2 != 0 && b2 != 3) {
                    f9 = 2.0f;
                    f8 = f12;
                    t37Var2.setBounds((int) rectF.left, ((int) rectF.top) - hl.L(2.0f), hl.L(f3) + ((int) rectF.right), hl.L(2.0f) + ((int) rectF.bottom));
                    t37Var2.Q = (int) (rectF.height() * f4);
                    t37Var2.c(canvas, paint2);
                } else {
                    f8 = f12;
                    f9 = 2.0f;
                    canvas.drawRoundRect(rectF, rectF.height() * f4, rectF.height() * f4, paint2);
                }
                if (b2 != 0 && b2 != 3) {
                    rectF.set(zqbVar.getMeasuredWidth() * 0.1f, zqbVar.getMeasuredHeight() * 0.35f, zqbVar.getMeasuredWidth() * 0.65f, zqbVar.getMeasuredHeight() * 0.55f);
                    b = 3;
                } else {
                    float L3 = f13 + hl.L(5.0f);
                    float L4 = f8 + hl.L(f3) + L;
                    b = 3;
                    if (b2 == 3) {
                        f10 = 0.8f;
                    } else {
                        f10 = 1.0f;
                    }
                    rectF.set(L3, L4, (f6 * f10) + L3, L4 + f8);
                }
                if (b2 != 0 && b2 != b) {
                    t37Var.setBounds(((int) rectF.left) - hl.L(f3), ((int) rectF.top) - hl.L(f9), (int) rectF.right, hl.L(f9) + ((int) rectF.bottom));
                    t37Var.Q = (int) (rectF.height() * f4);
                    t37Var.c(canvas, paint3);
                    return;
                }
                canvas.drawRoundRect(rectF, rectF.height() * f4, rectF.height() * f4, paint3);
                if (zqbVar.V != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f9) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f9);
                    rectF.set(height - hl.L(8.0f), centerY - hl.L(8.0f), height + hl.L(8.0f), hl.L(8.0f) + centerY);
                    imageReceiver.k0(rectF);
                    imageReceiver.h(canvas, null);
                    Drawable drawable = this.e;
                    if (drawable == null) {
                        drawable = zqbVar.getContext().getDrawable(2131231972).mutate();
                        this.e = drawable;
                    }
                    int i3 = (int) height2;
                    int i4 = (int) centerY;
                    drawable.setBounds(i3 - hl.L(8.0f), i4 - hl.L(8.0f), hl.L(8.0f) + i3, hl.L(8.0f) + i4);
                    this.e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (zqbVar.U == null) {
            float f15 = zqbVar.b;
            canvas.drawRoundRect(rectF, f15, f15, zqbVar.s);
            canvas.save();
            noThemeStaticLayout = zqbVar.getNoThemeStaticLayout();
            canvas.translate((zqbVar.getWidth() - noThemeStaticLayout.getWidth()) * f4, hl.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f) {
        ez3 ez3Var;
        int[] iArr;
        int i;
        zqb zqbVar = this.f;
        float f2 = zqbVar.b;
        Paint paint = zqbVar.r;
        if (this.d != null) {
            canvas.save();
            canvas.clipPath(zqbVar.x);
            Drawable drawable = this.d;
            if (drawable instanceof BitmapDrawable) {
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > zqbVar.getWidth() / zqbVar.getHeight()) {
                    int width = (int) ((zqbVar.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - zqbVar.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, zqbVar.getHeight());
                } else {
                    int height = (int) ((zqbVar.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (zqbVar.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, zqbVar.getWidth(), height + height2);
                }
            } else {
                drawable.setBounds(0, 0, zqbVar.getWidth(), zqbVar.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f));
            this.d.draw(canvas);
            Drawable drawable2 = this.d;
            if ((drawable2 instanceof ColorDrawable) || ((drawable2 instanceof hh7) && (i = (iArr = ((hh7) drawable2).a)[0]) == iArr[1] && i == iArr[2] && i == iArr[3])) {
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (alpha * f));
                float f3 = zqbVar.c;
                RectF rectF = hl.P;
                rectF.set(f3, f3, zqbVar.getWidth() - f3, zqbVar.getHeight() - f3);
                canvas.drawRoundRect(rectF, f2, f2, paint);
                paint.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        ne2 ne2Var = zqbVar.H;
        if (ne2Var != null && (ez3Var = ne2Var.a) != null && ez3Var.l() && zqbVar.O != null) {
            return;
        }
        canvas.drawRoundRect(zqbVar.w, f2, f2, zqbVar.s);
    }
}
