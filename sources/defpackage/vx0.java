package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class vx0 {
    public final Path A;
    public final xx0 a;
    public final View b;
    public int c;
    public int d;
    public final mm e;
    public final mm f;
    public final Paint g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint i;
    public final Paint j;
    public int k;
    public final hf0 l;
    public int m;
    public final int n;
    public boolean o;
    public final boolean p;
    public final float q;
    public final Bitmap r;
    public final Drawable s;
    public int t;
    public final pkb u;
    public pkb v;
    public float w;
    public final float[] x;
    public final Path y;
    public final Path z;

    public vx0(View view, xx0 xx0Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new Paint(3);
        hf0 f0 = aob.f0(822083583, 1, -1);
        this.l = f0;
        this.t = -1;
        this.x = new float[8];
        this.y = new Path();
        Path path = new Path();
        this.z = path;
        Path path2 = new Path();
        this.A = path2;
        this.b = view;
        this.a = xx0Var;
        f0.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        k43 k43Var = k43.h;
        this.e = new mm(320L, view, k43Var);
        this.f = new mm(320L, view, k43Var);
        this.r = xx0Var.F;
        String b = xx0Var.b();
        textPaint = yx0.getTextPaint();
        this.u = new pkb(pv3.m(b, textPaint.getFontMetricsInt(), false, null, 0), 17.0f, hl.o());
        int i = xx0Var.q;
        this.n = i;
        this.p = hl.B(i) < 0.721f;
        o oVar = xx0Var.J;
        if (oVar != null) {
            ArrayList arrayList = oVar.e0;
            if (!arrayList.isEmpty()) {
                Object g = c00.g(1, arrayList);
                if ((g instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) g).cached_page) == null || page.local == null)) {
                    this.s = view.getContext().getResources().getDrawable(2131232195).mutate();
                }
            }
        }
        this.q = xx0Var.I;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(hl.L(12.0f), hl.L(12.0f));
        path.moveTo(hl.L(12.0f), 0.0f);
        path.lineTo(0.0f, hl.L(12.0f));
        path2.rewind();
        path2.moveTo(0.0f, hl.L(6.33f) / 2.0f);
        path2.lineTo(hl.L(12.66f) / 2.0f, (-hl.L(6.33f)) / 2.0f);
        path2.lineTo(hl.L(12.66f), hl.L(6.33f) / 2.0f);
    }

    public final void a(Canvas canvas, RectF rectF, float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i;
        int f9 = vm2.f(this.w, this.m, this.n);
        Paint paint = this.g;
        paint.setColor(f9);
        float f10 = f2 * 255.0f;
        paint.setAlpha((int) f10);
        float f11 = 0.0f;
        paint.setShadowLayer(hl.L(2.33f), 0.0f, hl.L(1.0f), aob.p1(f2, 268435456));
        float[] fArr = this.x;
        fArr[3] = f;
        fArr[2] = f;
        fArr[1] = f;
        int i2 = 0;
        fArr[0] = f;
        float R1 = hl.R1(f, 0.0f, this.w);
        fArr[7] = R1;
        fArr[6] = R1;
        fArr[5] = R1;
        fArr[4] = R1;
        Path path = this.y;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        float f12 = this.q;
        if (f12 > 0.0f && this.w > 0.0f && f2 > 0.0f) {
            canvas.save();
            canvas.clipPath(path);
            if (hl.B(f9) > 0.721f) {
                i = -16777216;
            } else {
                i = -1;
            }
            int p1 = aob.p1(0.07f * f2 * this.w, i);
            Paint paint2 = this.h;
            paint2.setColor(p1);
            float f13 = rectF.left;
            canvas.drawRect(f13, rectF.top, (rectF.width() * f12) + f13, rectF.bottom, paint2);
            canvas.restore();
        }
        if (this.o) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        if (this.p) {
            f11 = 1.0f;
        }
        float R12 = hl.R1(f4, f11, this.w);
        int f14 = vm2.f(R12, -16777216, -1);
        Paint paint3 = this.i;
        paint3.setColor(f14);
        paint3.setStrokeWidth(hl.L(2.0f));
        canvas.save();
        canvas.translate(rectF.left, rectF.centerY());
        int f15 = vm2.f(R12, 553648127, 553648127);
        int L = hl.L(25.0f);
        int L2 = hl.L(25.0f);
        hf0 hf0Var = this.l;
        hf0Var.setBounds(hl.L(25.0f) + (-hl.L(25.0f)), -hl.L(25.0f), hl.L(25.0f) + L, L2);
        if (this.k != f15) {
            this.k = f15;
            aob.F1(hf0Var, f15, false);
        }
        hf0Var.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(rectF.left + hl.L(18.0f), rectF.centerY() - hl.L(6.0f));
        float f16 = f10 * f3;
        int i3 = (int) f16;
        paint3.setAlpha(i3);
        canvas.drawPath(this.z, paint3);
        canvas.restore();
        canvas.save();
        canvas.translate(rectF.right - hl.L(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.w) * f16));
        canvas.drawPath(this.A, paint3);
        canvas.restore();
        Bitmap bitmap = this.r;
        if (bitmap != null) {
            int L3 = hl.L(24.0f);
            canvas.save();
            Rect rect = hl.Q;
            float f17 = L3;
            float f18 = f17 / 2.0f;
            rect.set((int) (rectF.left + hl.L(56.0f)), (int) (rectF.centerY() - f18), (int) (rectF.left + hl.L(56.0f) + f17), (int) (rectF.centerY() + f18));
            Paint paint4 = this.j;
            paint4.setAlpha(i3);
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas.restore();
            i2 = hl.L(4.0f) + L3;
        } else {
            Drawable drawable = this.s;
            if (drawable != null) {
                float L4 = hl.L(24.0f);
                int intrinsicHeight = (int) ((L4 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = hl.Q;
                float f19 = (L4 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + hl.L(56.0f)), (int) (rectF.centerY() - f19), (int) ((intrinsicHeight * 0.7f) + rectF.left + hl.L(56.0f)), (int) (rectF.centerY() + f19));
                if (f14 != this.t) {
                    this.t = f14;
                    drawable.setColorFilter(new PorterDuffColorFilter(f14, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i3);
                drawable.setBounds(rect2);
                drawable.draw(canvas);
                i2 = intrinsicHeight - hl.L(2.0f);
            }
        }
        pkb pkbVar = this.v;
        if (pkbVar != null) {
            pkbVar.p = (int) ((rectF.width() - hl.L(100.0f)) - f8);
            f5 = 1.0f;
            pkbVar.c(rectF.left + hl.L(60.0f) + i2, rectF.centerY(), qd4.z(1.0f, this.w, f2, f3), f14, canvas);
            f14 = f14;
        } else {
            f5 = 1.0f;
        }
        float width = rectF.width() - hl.L(100.0f);
        pkb pkbVar2 = this.u;
        pkbVar2.p = (int) (width - f6);
        float L5 = rectF.left + hl.L(60.0f) + i2;
        float centerY = rectF.centerY();
        if (this.v == null) {
            f7 = f5;
        } else {
            f7 = this.w;
        }
        pkbVar2.c(L5, centerY, f7 * f2 * f3, f14, canvas);
    }

    public final float b() {
        float min;
        boolean z;
        float c = c();
        if (c < 0.0f) {
            min = c + 1.0f;
        } else if (c >= 0.0f && c < 1.0f) {
            min = hl.R1(1.0f, 0.87f, c);
        } else {
            min = (1.0f - Math.min(1.0f, c - 1.0f)) * 0.87f;
        }
        if (this.d >= 0) {
            z = true;
        } else {
            z = false;
        }
        return this.f.d(z) * min;
    }

    public final float c() {
        if (this.d < 0) {
            return this.c;
        }
        return this.e.e(false, this.c);
    }
}
