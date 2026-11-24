package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
public final class apb {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final bpb f;

    public apb(bpb bpbVar) {
        this.f = bpbVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(2.0f));
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
        bpb bpbVar = this.f;
        ImageReceiver imageReceiver = bpbVar.Q;
        float f11 = bpbVar.e;
        m37 m37Var = bpbVar.T;
        m37 m37Var2 = bpbVar.S;
        float f12 = bpbVar.d;
        float f13 = bpbVar.c;
        byte b2 = bpbVar.L;
        RectF rectF = bpbVar.w;
        if (!bpbVar.a0 && bpbVar.E == null) {
            f4 = 0.5f;
            f2 = 255.0f;
            f3 = 4.0f;
        } else {
            hf2 hf2Var = bpbVar.H;
            f2 = 255.0f;
            sz3 sz3Var = (sz3) hf2Var.a.f.get(hf2Var.c);
            if (bpbVar.H.a.l()) {
                i = cmb.v0(cmb.Ei, bpbVar.y);
            } else {
                i = sz3Var.j;
            }
            Paint paint = this.a;
            paint.setColor(i);
            paint.setAlpha((int) (bpbVar.N * f * 255.0f));
            f3 = 4.0f;
            f4 = 0.5f;
            float A = td4.A(1.0f, bpbVar.N, gm.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(A, A, bpbVar.getWidth() - A, bpbVar.getHeight() - A);
            float f14 = bpbVar.a;
            canvas.drawRoundRect(rectF, f14, f14, paint);
        }
        int i2 = (int) (f * f2);
        Paint paint2 = this.b;
        paint2.setAlpha(i2);
        Paint paint3 = this.c;
        paint3.setAlpha(i2);
        rectF.set(f13, f13, bpbVar.getWidth() - f13, bpbVar.getHeight() - f13);
        tz3 tz3Var = bpbVar.H.a;
        if (tz3Var != null) {
            if (tz3Var.l()) {
                bpbVar.H.a.getClass();
            } else if (b2 != 4) {
                if (b2 == 2) {
                    bpbVar.H.getClass();
                    return;
                }
                float L = gm.L(8.0f) + f13;
                if (b2 == 3) {
                    f5 = 5.0f;
                } else {
                    f5 = 22.0f;
                }
                float L2 = gm.L(f5) + f13;
                if (b2 != 0 && b2 != 3) {
                    L = 0.12f * bpbVar.getMeasuredHeight();
                    f6 = f11;
                    rectF.set(bpbVar.getMeasuredWidth() - (bpbVar.getMeasuredWidth() * 0.65f), L, bpbVar.getMeasuredWidth() - (bpbVar.getMeasuredWidth() * 0.1f), bpbVar.getMeasuredHeight() * 0.32f);
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
                    m37Var2.setBounds((int) rectF.left, ((int) rectF.top) - gm.L(2.0f), gm.L(f3) + ((int) rectF.right), gm.L(2.0f) + ((int) rectF.bottom));
                    m37Var2.Q = (int) (rectF.height() * f4);
                    m37Var2.c(canvas, paint2);
                } else {
                    f8 = f12;
                    f9 = 2.0f;
                    canvas.drawRoundRect(rectF, rectF.height() * f4, rectF.height() * f4, paint2);
                }
                if (b2 != 0 && b2 != 3) {
                    rectF.set(bpbVar.getMeasuredWidth() * 0.1f, bpbVar.getMeasuredHeight() * 0.35f, bpbVar.getMeasuredWidth() * 0.65f, bpbVar.getMeasuredHeight() * 0.55f);
                    b = 3;
                } else {
                    float L3 = f13 + gm.L(5.0f);
                    float L4 = f8 + gm.L(f3) + L;
                    b = 3;
                    if (b2 == 3) {
                        f10 = 0.8f;
                    } else {
                        f10 = 1.0f;
                    }
                    rectF.set(L3, L4, (f6 * f10) + L3, L4 + f8);
                }
                if (b2 != 0 && b2 != b) {
                    m37Var.setBounds(((int) rectF.left) - gm.L(f3), ((int) rectF.top) - gm.L(f9), (int) rectF.right, gm.L(f9) + ((int) rectF.bottom));
                    m37Var.Q = (int) (rectF.height() * f4);
                    m37Var.c(canvas, paint3);
                    return;
                }
                canvas.drawRoundRect(rectF, rectF.height() * f4, rectF.height() * f4, paint3);
                if (bpbVar.V != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f9) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f9);
                    rectF.set(height - gm.L(8.0f), centerY - gm.L(8.0f), height + gm.L(8.0f), gm.L(8.0f) + centerY);
                    imageReceiver.k0(rectF);
                    imageReceiver.h(canvas, null);
                    Drawable drawable = this.e;
                    if (drawable == null) {
                        drawable = bpbVar.getContext().getDrawable(2131231973).mutate();
                        this.e = drawable;
                    }
                    int i3 = (int) height2;
                    int i4 = (int) centerY;
                    drawable.setBounds(i3 - gm.L(8.0f), i4 - gm.L(8.0f), gm.L(8.0f) + i3, gm.L(8.0f) + i4);
                    this.e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (bpbVar.U == null) {
            float f15 = bpbVar.b;
            canvas.drawRoundRect(rectF, f15, f15, bpbVar.s);
            canvas.save();
            noThemeStaticLayout = bpbVar.getNoThemeStaticLayout();
            canvas.translate((bpbVar.getWidth() - noThemeStaticLayout.getWidth()) * f4, gm.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f) {
        tz3 tz3Var;
        int[] iArr;
        int i;
        bpb bpbVar = this.f;
        float f2 = bpbVar.b;
        Paint paint = bpbVar.r;
        if (this.d != null) {
            canvas.save();
            canvas.clipPath(bpbVar.x);
            Drawable drawable = this.d;
            if (drawable instanceof BitmapDrawable) {
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > bpbVar.getWidth() / bpbVar.getHeight()) {
                    int width = (int) ((bpbVar.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - bpbVar.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, bpbVar.getHeight());
                } else {
                    int height = (int) ((bpbVar.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (bpbVar.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, bpbVar.getWidth(), height + height2);
                }
            } else {
                drawable.setBounds(0, 0, bpbVar.getWidth(), bpbVar.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f));
            this.d.draw(canvas);
            Drawable drawable2 = this.d;
            if ((drawable2 instanceof ColorDrawable) || ((drawable2 instanceof ah7) && (i = (iArr = ((ah7) drawable2).a)[0]) == iArr[1] && i == iArr[2] && i == iArr[3])) {
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (alpha * f));
                float f3 = bpbVar.c;
                RectF rectF = gm.P;
                rectF.set(f3, f3, bpbVar.getWidth() - f3, bpbVar.getHeight() - f3);
                canvas.drawRoundRect(rectF, f2, f2, paint);
                paint.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        hf2 hf2Var = bpbVar.H;
        if (hf2Var != null && (tz3Var = hf2Var.a) != null && tz3Var.l() && bpbVar.O != null) {
            return;
        }
        canvas.drawRoundRect(bpbVar.w, f2, f2, bpbVar.s);
    }
}
