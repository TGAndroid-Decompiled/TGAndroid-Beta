package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
public final class m0c extends FrameLayout implements eu5 {
    public final de0 a;
    public final Paint b;
    public boolean c;
    public StaticLayout d;
    public StaticLayout e;
    public StaticLayout f;
    public String h;
    public boolean n;
    public boolean r;
    public boolean s;
    public Drawable w;
    public Drawable x;
    public final n0c y;

    public m0c(n0c n0cVar, Context context) {
        super(context);
        this.y = n0cVar;
        this.b = new Paint(1);
        setWillNotDraw(false);
        de0 de0Var = new de0(context);
        this.a = de0Var;
        addView(de0Var, tre.d(20, 20.0f, 51, 12.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override
    public final void e(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void f(Canvas canvas, float f) {
        int v0 = aob.v0(aob.d6, this.y.e);
        Paint paint = this.b;
        paint.setColor(v0);
        RectF rectF = hl.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, hl.L(16.0f), hl.L(16.0f), paint);
        draw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout;
        float f;
        float f2;
        float f3;
        int i;
        Drawable drawable;
        Drawable drawable2;
        n0c n0cVar = this.y;
        TextPaint textPaint = n0cVar.q0;
        vnb vnbVar = n0cVar.e;
        int i2 = (getTranslationY() > 0.0f ? 1 : (getTranslationY() == 0.0f ? 0 : -1));
        Paint paint = this.b;
        if (i2 != 0) {
            paint.setColor(aob.v0(aob.d6, vnbVar));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            paint = paint;
        } else {
            canvas2 = canvas;
        }
        if (this.s) {
            paint.setColor(aob.p1(0.06f, aob.v0(aob.G6, vnbVar)));
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRoundRect(rectF, hl.L(16.0f), hl.L(16.0f), paint);
        }
        int L = hl.L(12.0f);
        int width = getWidth() - hl.L(12.0f);
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(hl.L(26.0f) + L, ((hl.L(20.0f) - this.d.getHeight()) / 2.0f) + hl.L(10.0f));
            this.d.draw(canvas2);
            canvas2.restore();
        }
        float f4 = width;
        if (this.f != null) {
            float width2 = f4 - staticLayout.getWidth();
            canvas2.save();
            canvas2.translate(width2, ((hl.L(20.0f) - this.f.getHeight()) / 2.0f) + hl.L(10.0f));
            this.f.draw(canvas2);
            canvas2.restore();
            f = width2 - hl.L(6.0f);
        } else {
            f = f4;
        }
        int v0 = aob.v0(aob.y6, vnbVar);
        if (this.r && (drawable2 = this.x) != null) {
            drawable2.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            int L2 = hl.L(13.0f);
            int i3 = (int) f;
            f2 = 12.0f;
            f3 = 2.0f;
            this.x.setBounds(i3 - L2, hl.L(14.0f), i3, hl.L(14.0f) + L2);
            this.x.draw(canvas2);
            f -= hl.L(6.0f) + L2;
        } else {
            f2 = 12.0f;
            f3 = 2.0f;
        }
        if (this.n && (drawable = this.w) != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            int L3 = hl.L(f2);
            int i4 = (int) f;
            this.w.setBounds(i4 - L3, hl.L(14.0f), i4, hl.L(14.0f) + L3);
            this.w.draw(canvas2);
        }
        if (this.e != null) {
            canvas2.save();
            canvas2.translate(L, hl.L(34.0f));
            this.e.draw(canvas2);
            canvas2.restore();
        }
        if (this.h != null) {
            float max = Math.max(hl.L(23.0f), textPaint.measureText(this.h) + hl.L(14.0f));
            if (this.n) {
                i = aob.V8;
            } else {
                i = aob.U8;
            }
            paint.setColor(aob.v0(i, vnbVar));
            RectF rectF2 = hl.P;
            rectF2.set(f4 - max, hl.L(34.0f), f4, hl.L(57.0f));
            canvas2.drawRoundRect(rectF2, hl.L(11.5f), hl.L(11.5f), paint);
            textPaint.setColor(aob.v0(aob.W8, vnbVar));
            canvas2.drawText(this.h, rectF2.centerX() - (textPaint.measureText(this.h) / f3), rectF2.centerY() - ((textPaint.ascent() + textPaint.descent()) / f3), textPaint);
        }
        if (this.c && !this.s) {
            paint.setColor(aob.v0(aob.d7, vnbVar));
            canvas2.drawRect(L, getHeight() - 1, f4, getHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        float f;
        StaticLayout staticLayout = this.e;
        if (staticLayout != null && staticLayout.getText().length() > 0) {
            i3 = this.e.getHeight();
        } else {
            i3 = 0;
        }
        int L = hl.L(34.0f) + i3;
        if (i3 > hl.L(24.0f)) {
            f = 6.0f;
        } else {
            f = 10.0f;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(hl.L(48.0f), hl.L(f) + L), 1073741824));
    }

    @Override
    public final void setScrimHidden(boolean z) {
        qd4.a(this, z);
    }

    @Override
    public final void setTranslationY(float f) {
        boolean z;
        boolean z2 = false;
        if (getTranslationY() != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (f != 0.0f) {
            z2 = true;
        }
        if (z != z2) {
            invalidate();
        }
        super.setTranslationY(f);
    }
}
