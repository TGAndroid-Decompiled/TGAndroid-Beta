package defpackage;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.animation.DecelerateInterpolator;
public final class wl6 extends Drawable {
    public en0 A;
    public m37 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final RectF f;
    public PorterDuffColorFilter g;
    public float h;
    public final DecelerateInterpolator i;
    public boolean j;
    public float k;
    public int l;
    public String m;
    public int n;
    public float o;
    public int p;
    public int q;
    public float r;
    public float s;
    public long t;
    public boolean u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public wl6() {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f = new RectF();
        this.h = 1.0f;
        this.i = new DecelerateInterpolator();
        this.k = 400.0f;
        this.l = -1;
        this.o = 1.0f;
        this.r = 1.0f;
        paint.setColor(-1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(gm.L(3.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        textPaint.setTypeface(gm.o());
        textPaint.setTextSize(gm.L(13.0f));
        textPaint.setColor(-1);
        paint2.setColor(-1);
    }

    public final void a(boolean z) {
        m37 m37Var = this.B;
        if (m37Var != null && m37Var.l() && !this.E) {
            Rect bounds = getBounds();
            m37 m37Var2 = this.B;
            Shader shader = m37Var2.a;
            Matrix matrix = m37Var2.k;
            matrix.reset();
            this.B.a();
            if (z) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.u) {
            return this.r;
        }
        return 1.0f;
    }

    public final void c(int i) {
        int i2 = (-16777216) | i;
        this.b.setColor(i2);
        this.d.setColor(i2);
        this.e.setColor(i2);
        this.a.setColor(i2);
        this.g = new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wl6.d(int, boolean):void");
    }

    @Override
    public final void draw(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wl6.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z, float f) {
        if (this.w == f) {
            return;
        }
        if (!z) {
            this.x = f;
            this.y = f;
        } else {
            float f2 = this.x;
            if (f2 > f) {
                this.x = f;
                f2 = f;
            }
            this.y = f2;
        }
        this.w = f;
        this.z = 0.0f;
        invalidateSelf();
    }

    @Override
    public final int getIntrinsicHeight() {
        return gm.L(48.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gm.L(48.0f);
    }

    @Override
    public final int getMinimumHeight() {
        return gm.L(48.0f);
    }

    @Override
    public final int getMinimumWidth() {
        return gm.L(48.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        en0 en0Var = this.A;
        if (en0Var != null) {
            en0Var.a.invalidate();
        }
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float L = (i3 - i) / gm.L(48.0f);
        this.h = L;
        if (L < 0.7f) {
            this.b.setStrokeWidth(gm.L(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i) {
    }
}
