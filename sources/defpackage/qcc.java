package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class qcc extends View {
    public ShapeDrawable a;
    public Drawable b;
    public StaticLayout c;
    public TextPaint d;
    public long e;
    public float f;
    public float h;
    public boolean n;
    public int r;

    public final void a(boolean z) {
        this.n = z;
        invalidate();
    }

    public final void b() {
        int i;
        Drawable drawable = this.b;
        this.d.setColor(bkb.w0(null, bkb.fg, false));
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            i = bkb.gg;
            bkb.A1(bkb.w0(null, i, false), shapeDrawable);
        } else {
            int L = gl.L(5.0f);
            i = bkb.gg;
            this.a = bkb.b0(L, bkb.w0(null, i, false));
        }
        int w0 = bkb.w0(null, i, false);
        if (w0 == this.r && drawable.getColorFilter() != null) {
            return;
        }
        this.r = w0;
        drawable.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        Drawable drawable = this.b;
        if (this.c != null) {
            boolean z = this.n;
            float f2 = this.h;
            if (z) {
                if (f2 != 1.0f) {
                    float f3 = f2 + 0.12f;
                    this.h = f3;
                    if (f3 > 1.0f) {
                        this.h = 1.0f;
                    }
                    invalidate();
                }
            } else {
                if (f2 != 0.0f) {
                    float f4 = f2 - 0.12f;
                    this.h = f4;
                    if (f4 < 0.0f) {
                        this.h = 0.0f;
                    }
                    invalidate();
                }
                if (this.h == 0.0f) {
                    return;
                }
            }
            float f5 = this.h;
            if (f5 > 0.5f) {
                f = 1.0f;
            } else {
                f = f5 / 0.5f;
            }
            int i = (int) (f * 255.0f);
            canvas.save();
            float f6 = this.h;
            canvas.scale(f6, f6, this.f, getMeasuredHeight());
            canvas.translate(this.f - (this.c.getWidth() / 2.0f), 0.0f);
            this.a.setBounds(-gl.L(8.0f), 0, gl.L(8.0f) + this.c.getWidth(), (int) (gl.N(4.0f) + this.c.getHeight()));
            drawable.setBounds(oo1.A(2, this.c.getWidth() / 2, drawable), (int) (gl.N(4.0f) + this.c.getHeight()), oo1.w(2, this.c.getWidth() / 2, drawable), drawable.getIntrinsicHeight() + ((int) (gl.N(4.0f) + this.c.getHeight())));
            drawable.setAlpha(i);
            this.a.setAlpha(i);
            this.d.setAlpha(i);
            drawable.draw(canvas);
            this.a.draw(canvas);
            canvas.translate(0.0f, gl.N(1.0f));
            this.c.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.b.getIntrinsicHeight() + gl.L(4.0f) + this.c.getHeight(), 1073741824));
    }

    public void setCx(float f) {
        this.f = f;
        invalidate();
    }

    public void setTime(int i) {
        long j = i;
        if (j != this.e) {
            this.e = j;
            String g0 = gl.g0(i, false, false);
            TextPaint textPaint = this.d;
            this.c = new StaticLayout(g0, textPaint, (int) textPaint.measureText(g0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
    }
}
