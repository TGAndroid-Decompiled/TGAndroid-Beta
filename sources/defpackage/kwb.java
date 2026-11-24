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
public final class kwb extends FrameLayout implements bs5 {
    public final be0 a;
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
    public final lwb y;

    public kwb(lwb lwbVar, Context context) {
        super(context);
        this.y = lwbVar;
        this.b = new Paint(1);
        setWillNotDraw(false);
        be0 be0Var = new be0(context);
        this.a = be0Var;
        addView(be0Var, nme.d(20, 20.0f, 51, 12.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override
    public final void e(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void g(Canvas canvas, float f) {
        int v0 = bkb.v0(bkb.c6, this.y.e);
        Paint paint = this.b;
        paint.setColor(v0);
        RectF rectF = gl.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, gl.L(16.0f), gl.L(16.0f), paint);
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
        lwb lwbVar = this.y;
        TextPaint textPaint = lwbVar.q0;
        wjb wjbVar = lwbVar.e;
        int i2 = (getTranslationY() > 0.0f ? 1 : (getTranslationY() == 0.0f ? 0 : -1));
        Paint paint = this.b;
        if (i2 != 0) {
            paint.setColor(bkb.v0(bkb.c6, wjbVar));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            paint = paint;
        } else {
            canvas2 = canvas;
        }
        if (this.s) {
            paint.setColor(bkb.p1(0.06f, bkb.v0(bkb.F6, wjbVar)));
            RectF rectF = gl.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRoundRect(rectF, gl.L(16.0f), gl.L(16.0f), paint);
        }
        int L = gl.L(12.0f);
        int width = getWidth() - gl.L(12.0f);
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(gl.L(26.0f) + L, ((gl.L(20.0f) - this.d.getHeight()) / 2.0f) + gl.L(10.0f));
            this.d.draw(canvas2);
            canvas2.restore();
        }
        float f4 = width;
        if (this.f != null) {
            float width2 = f4 - staticLayout.getWidth();
            canvas2.save();
            canvas2.translate(width2, ((gl.L(20.0f) - this.f.getHeight()) / 2.0f) + gl.L(10.0f));
            this.f.draw(canvas2);
            canvas2.restore();
            f = width2 - gl.L(6.0f);
        } else {
            f = f4;
        }
        int v0 = bkb.v0(bkb.x6, wjbVar);
        if (this.r && (drawable2 = this.x) != null) {
            drawable2.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            int L2 = gl.L(13.0f);
            int i3 = (int) f;
            f2 = 12.0f;
            f3 = 2.0f;
            this.x.setBounds(i3 - L2, gl.L(14.0f), i3, gl.L(14.0f) + L2);
            this.x.draw(canvas2);
            f -= gl.L(6.0f) + L2;
        } else {
            f2 = 12.0f;
            f3 = 2.0f;
        }
        if (this.n && (drawable = this.w) != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            int L3 = gl.L(f2);
            int i4 = (int) f;
            this.w.setBounds(i4 - L3, gl.L(14.0f), i4, gl.L(14.0f) + L3);
            this.w.draw(canvas2);
        }
        if (this.e != null) {
            canvas2.save();
            canvas2.translate(L, gl.L(34.0f));
            this.e.draw(canvas2);
            canvas2.restore();
        }
        if (this.h != null) {
            float max = Math.max(gl.L(23.0f), textPaint.measureText(this.h) + gl.L(14.0f));
            if (this.n) {
                i = bkb.U8;
            } else {
                i = bkb.T8;
            }
            paint.setColor(bkb.v0(i, wjbVar));
            RectF rectF2 = gl.P;
            rectF2.set(f4 - max, gl.L(34.0f), f4, gl.L(57.0f));
            canvas2.drawRoundRect(rectF2, gl.L(11.5f), gl.L(11.5f), paint);
            textPaint.setColor(bkb.v0(bkb.V8, wjbVar));
            canvas2.drawText(this.h, rectF2.centerX() - (textPaint.measureText(this.h) / f3), rectF2.centerY() - ((textPaint.ascent() + textPaint.descent()) / f3), textPaint);
        }
        if (this.c && !this.s) {
            paint.setColor(bkb.v0(bkb.c7, wjbVar));
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
        int L = gl.L(34.0f) + i3;
        if (i3 > gl.L(24.0f)) {
            f = 6.0f;
        } else {
            f = 10.0f;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(gl.L(48.0f), gl.L(f) + L), 1073741824));
    }

    @Override
    public final void setScrimHidden(boolean z) {
        tb4.a(this, z);
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
