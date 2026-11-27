package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class pkb {
    public final TextPaint a;
    public StaticLayout b;
    public float c;
    public float d;
    public float e;
    public int f;
    public Layout.Alignment g;
    public float h;
    public boolean i;
    public View j;
    public dm k;
    public byte l;
    public PorterDuffColorFilter m;
    public int n;
    public boolean o;
    public float p;
    public LinearGradient q;
    public Matrix r;
    public Paint s;
    public int t;

    public pkb(CharSequence charSequence, float f, Typeface typeface) {
        this.e = 9999.0f;
        this.f = 1;
        this.g = Layout.Alignment.ALIGN_NORMAL;
        this.l = (byte) 0;
        this.p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        textPaint.setTextSize(hl.L(f));
        textPaint.setTypeface(typeface);
        p(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.g != alignment) {
            this.g = alignment;
            p(this.b.getText());
        }
    }

    public final float b() {
        float f = 0.0f;
        for (int i = 0; i < this.b.getLineCount(); i++) {
            f = Math.max(f, this.b.getLineWidth(i));
        }
        return f;
    }

    public final void c(float f, float f2, float f3, int i, Canvas canvas) {
        float height;
        if (this.b == null) {
            return;
        }
        TextPaint textPaint = this.a;
        textPaint.setColor(i);
        textPaint.linkColor = i;
        int alpha = textPaint.getAlpha();
        if (f3 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f3));
        }
        canvas.save();
        if (this.f > 1) {
            height = 0.0f;
        } else {
            height = this.b.getHeight() / 2.0f;
        }
        canvas.translate(f, f2 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.b;
        if (staticLayout != null) {
            float f = this.p;
            if (f >= 0.0f && this.c > f) {
                canvas.saveLayerAlpha(0.0f, -this.t, f - 1.0f, staticLayout.getHeight() + this.t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z = this.o;
            StaticLayout staticLayout2 = this.b;
            TextPaint textPaint = this.a;
            if (z) {
                canvas.drawText(staticLayout2.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                staticLayout2.draw(canvas);
            }
            if (this.i) {
                if (this.m == null || textPaint.getColor() != this.n) {
                    int color = textPaint.getColor();
                    this.n = color;
                    this.m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                hm.drawAnimatedEmojis(canvas, this.b, this.k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.m);
            }
            canvas.restore();
            float f2 = this.p;
            if (f2 >= 0.0f && this.c > f2) {
                if (this.q == null) {
                    this.q = new LinearGradient(0.0f, 0.0f, hl.L(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.r = new Matrix();
                    Paint paint = new Paint(1);
                    this.s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.s.setShader(this.q);
                }
                canvas.save();
                this.r.reset();
                this.r.postTranslate(this.p - hl.L(8.0f), 0.0f);
                this.q.setLocalMatrix(this.r);
                canvas.drawRect(this.p - hl.L(8.0f), 0.0f, this.p, this.b.getHeight(), this.s);
                canvas.restore();
                canvas.restore();
            }
        }
    }

    public final void e(Canvas canvas, float f, float f2) {
        f(canvas, f, f2, 1.0f);
    }

    public final void f(Canvas canvas, float f, float f2, float f3) {
        float height;
        if (this.b == null) {
            return;
        }
        canvas.save();
        if (this.f > 1) {
            height = 0.0f;
        } else {
            height = this.b.getHeight() / 2.0f;
        }
        canvas.translate(f, f2 - height);
        TextPaint textPaint = this.a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f3));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final Paint.FontMetricsInt g() {
        return this.a.getFontMetricsInt();
    }

    public final float h() {
        return this.b.getHeight();
    }

    public final CharSequence i() {
        StaticLayout staticLayout = this.b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.b.getText();
        }
        return "";
    }

    public final float j() {
        float f = this.p;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        float f2 = this.c;
        if (i >= 0) {
            return Math.min(f, f2);
        }
        return f2;
    }

    public final void k(float f) {
        if (this.h != f) {
            this.h = f;
            p(this.b.getText());
        }
    }

    public final void l(int i) {
        this.f = i;
        p(this.b.getText());
    }

    public final void m(int i) {
        this.a.setColor(i);
    }

    public final void n(int i) {
        if (this.l != i) {
            this.l = i;
            if (this.i) {
                hm.release(this.j, this.k);
                this.k = hm.update(this.l, this.j, this.k, this.b);
            }
        }
    }

    public final void o(float f) {
        this.e = f;
        p(this.b.getText());
    }

    public final void p(CharSequence charSequence) {
        StaticLayout staticLayout;
        if (this.f > 1) {
            staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.a, (int) Math.max(this.e, 1.0f)).setAlignment(this.g).setMaxLines(this.f).setLineSpacing(this.h, 1.0f).build();
            this.b = staticLayout;
        } else {
            StaticLayout staticLayout2 = new StaticLayout(hl.J2(charSequence), this.a, (int) Math.max(this.e, 1.0f), this.g, 1.0f, this.h, false);
            this.b = staticLayout2;
            staticLayout = staticLayout2;
        }
        if (this.g == Layout.Alignment.ALIGN_CENTER) {
            this.c = staticLayout.getWidth();
            this.d = 0.0f;
        } else {
            this.c = 0.0f;
            this.d = staticLayout.getWidth();
            for (int i = 0; i < this.b.getLineCount(); i++) {
                this.c = Math.max(this.c, this.b.getLineWidth(i));
                this.d = Math.min(this.d, this.b.getLineLeft(i));
            }
        }
        View view = this.j;
        if (view != null && view.isAttachedToWindow()) {
            this.k = hm.update(this.l, this.j, this.k, this.b);
        }
    }

    public final void q(View view) {
        this.i = true;
        this.j = view;
        if (view.isAttachedToWindow()) {
            this.k = hm.update(this.l, view, this.k, this.b);
        }
        view.addOnAttachStateChangeListener(new vl0(this, view, (byte) 1));
    }

    public pkb(String str, float f) {
        this(str, f, null);
    }

    public pkb(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f = 1;
        this.g = Layout.Alignment.ALIGN_NORMAL;
        this.l = (byte) 0;
        this.p = -1.0f;
        this.a = textPaint;
        p(charSequence);
    }
}
