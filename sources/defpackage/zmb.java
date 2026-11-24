package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
public final class zmb {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final anb f;

    public zmb(anb anbVar) {
        this.f = anbVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(2.0f));
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
        anb anbVar = this.f;
        ImageReceiver imageReceiver = anbVar.Q;
        float f11 = anbVar.e;
        m17 m17Var = anbVar.T;
        m17 m17Var2 = anbVar.S;
        float f12 = anbVar.d;
        float f13 = anbVar.c;
        byte b2 = anbVar.L;
        RectF rectF = anbVar.w;
        if (!anbVar.a0 && anbVar.E == null) {
            f4 = 0.5f;
            f2 = 255.0f;
            f3 = 4.0f;
        } else {
            wd2 wd2Var = anbVar.H;
            f2 = 255.0f;
            iy3 iy3Var = (iy3) wd2Var.a.f.get(wd2Var.c);
            if (anbVar.H.a.l()) {
                i = bkb.v0(bkb.Ei, anbVar.y);
            } else {
                i = iy3Var.j;
            }
            Paint paint = this.a;
            paint.setColor(i);
            paint.setAlpha((int) (anbVar.N * f * 255.0f));
            f3 = 4.0f;
            f4 = 0.5f;
            float A = tb4.A(1.0f, anbVar.N, gl.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(A, A, anbVar.getWidth() - A, anbVar.getHeight() - A);
            float f14 = anbVar.a;
            canvas.drawRoundRect(rectF, f14, f14, paint);
        }
        int i2 = (int) (f * f2);
        Paint paint2 = this.b;
        paint2.setAlpha(i2);
        Paint paint3 = this.c;
        paint3.setAlpha(i2);
        rectF.set(f13, f13, anbVar.getWidth() - f13, anbVar.getHeight() - f13);
        jy3 jy3Var = anbVar.H.a;
        if (jy3Var != null) {
            if (jy3Var.l()) {
                anbVar.H.a.getClass();
            } else if (b2 != 4) {
                if (b2 == 2) {
                    anbVar.H.getClass();
                    return;
                }
                float L = gl.L(8.0f) + f13;
                if (b2 == 3) {
                    f5 = 5.0f;
                } else {
                    f5 = 22.0f;
                }
                float L2 = gl.L(f5) + f13;
                if (b2 != 0 && b2 != 3) {
                    L = 0.12f * anbVar.getMeasuredHeight();
                    f6 = f11;
                    rectF.set(anbVar.getMeasuredWidth() - (anbVar.getMeasuredWidth() * 0.65f), L, anbVar.getMeasuredWidth() - (anbVar.getMeasuredWidth() * 0.1f), anbVar.getMeasuredHeight() * 0.32f);
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
                    m17Var2.setBounds((int) rectF.left, ((int) rectF.top) - gl.L(2.0f), gl.L(f3) + ((int) rectF.right), gl.L(2.0f) + ((int) rectF.bottom));
                    m17Var2.Q = (int) (rectF.height() * f4);
                    m17Var2.c(canvas, paint2);
                } else {
                    f8 = f12;
                    f9 = 2.0f;
                    canvas.drawRoundRect(rectF, rectF.height() * f4, rectF.height() * f4, paint2);
                }
                if (b2 != 0 && b2 != 3) {
                    rectF.set(anbVar.getMeasuredWidth() * 0.1f, anbVar.getMeasuredHeight() * 0.35f, anbVar.getMeasuredWidth() * 0.65f, anbVar.getMeasuredHeight() * 0.55f);
                    b = 3;
                } else {
                    float L3 = f13 + gl.L(5.0f);
                    float L4 = f8 + gl.L(f3) + L;
                    b = 3;
                    if (b2 == 3) {
                        f10 = 0.8f;
                    } else {
                        f10 = 1.0f;
                    }
                    rectF.set(L3, L4, (f6 * f10) + L3, L4 + f8);
                }
                if (b2 != 0 && b2 != b) {
                    m17Var.setBounds(((int) rectF.left) - gl.L(f3), ((int) rectF.top) - gl.L(f9), (int) rectF.right, gl.L(f9) + ((int) rectF.bottom));
                    m17Var.Q = (int) (rectF.height() * f4);
                    m17Var.c(canvas, paint3);
                    return;
                }
                canvas.drawRoundRect(rectF, rectF.height() * f4, rectF.height() * f4, paint3);
                if (anbVar.V != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f9) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f9);
                    rectF.set(height - gl.L(8.0f), centerY - gl.L(8.0f), height + gl.L(8.0f), gl.L(8.0f) + centerY);
                    imageReceiver.k0(rectF);
                    imageReceiver.h(canvas, null);
                    Drawable drawable = this.e;
                    if (drawable == null) {
                        drawable = anbVar.getContext().getDrawable(2131231972).mutate();
                        this.e = drawable;
                    }
                    int i3 = (int) height2;
                    int i4 = (int) centerY;
                    drawable.setBounds(i3 - gl.L(8.0f), i4 - gl.L(8.0f), gl.L(8.0f) + i3, gl.L(8.0f) + i4);
                    this.e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (anbVar.U == null) {
            float f15 = anbVar.b;
            canvas.drawRoundRect(rectF, f15, f15, anbVar.s);
            canvas.save();
            noThemeStaticLayout = anbVar.getNoThemeStaticLayout();
            canvas.translate((anbVar.getWidth() - noThemeStaticLayout.getWidth()) * f4, gl.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f) {
        jy3 jy3Var;
        int[] iArr;
        int i;
        anb anbVar = this.f;
        float f2 = anbVar.b;
        Paint paint = anbVar.r;
        if (this.d != null) {
            canvas.save();
            canvas.clipPath(anbVar.x);
            Drawable drawable = this.d;
            if (drawable instanceof BitmapDrawable) {
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > anbVar.getWidth() / anbVar.getHeight()) {
                    int width = (int) ((anbVar.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - anbVar.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, anbVar.getHeight());
                } else {
                    int height = (int) ((anbVar.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (anbVar.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, anbVar.getWidth(), height + height2);
                }
            } else {
                drawable.setBounds(0, 0, anbVar.getWidth(), anbVar.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f));
            this.d.draw(canvas);
            Drawable drawable2 = this.d;
            if ((drawable2 instanceof ColorDrawable) || ((drawable2 instanceof ye7) && (i = (iArr = ((ye7) drawable2).a)[0]) == iArr[1] && i == iArr[2] && i == iArr[3])) {
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (alpha * f));
                float f3 = anbVar.c;
                RectF rectF = gl.P;
                rectF.set(f3, f3, anbVar.getWidth() - f3, anbVar.getHeight() - f3);
                canvas.drawRoundRect(rectF, f2, f2, paint);
                paint.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        wd2 wd2Var = anbVar.H;
        if (wd2Var != null && (jy3Var = wd2Var.a) != null && jy3Var.l() && anbVar.O != null) {
            return;
        }
        canvas.drawRoundRect(anbVar.w, f2, f2, anbVar.s);
    }
}
