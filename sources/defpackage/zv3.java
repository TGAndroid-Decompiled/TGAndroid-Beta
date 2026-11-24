package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
public final class zv3 extends yv3 {
    public Drawable i;
    public Drawable j;
    public StaticLayout k;
    public float l;
    public float m;
    public Paint n;
    public final cw3 o;

    public zv3(cw3 cw3Var, int i, int i2, String str) {
        super(cw3Var);
        float f;
        this.o = cw3Var;
        this.a = i;
        Drawable mutate = cw3Var.getContext().getResources().getDrawable(i2).mutate();
        this.i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = cw3Var.b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, gl.q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.k = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f = this.k.getLineWidth(0);
        } else {
            f = 0.0f;
        }
        this.l = f;
        this.m = this.k.getLineCount() > 0 ? this.k.getLineLeft(0) : 0.0f;
        this.b = gl.N(45.6f) + this.l;
        this.c = gl.N(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f, float f2) {
        RectF rectF = this.f;
        rectF.set(f, f2, this.b + f, this.c + f2);
        float a = this.g.a(0.05f);
        canvas.save();
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), this.o.a);
        if (this.j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        Drawable drawable = this.i;
        int i = 0;
        ru3 ru3Var = drawable;
        if (drawable == null) {
            ru3 f3 = vu3.f(null);
            this.i = f3;
            boolean A = ug8.A(f3);
            ru3Var = f3;
            if (A) {
                f3.a = false;
                ru3Var = f3;
            }
        }
        if (ru3Var != null) {
            float L = gl.L(24.0f) / 2;
            this.i.setBounds((int) ((rectF.left + gl.L(18.0f)) - L), (int) (((this.c / 2.0f) + rectF.top) - L), (int) (rectF.left + gl.L(18.0f) + L), (int) ((this.c / 2.0f) + rectF.top + L));
            this.i.draw(canvas);
        }
        if (this.j != null) {
            RectF rectF2 = gl.P;
            rectF2.set(rectF.left + gl.L(18.55f), ((rectF.top + this.c) - gl.L(5.0f)) - gl.L(12.55f), rectF.left + gl.L(29.45f), rectF.left + gl.L(31.0f));
            canvas.drawRoundRect(rectF2, gl.L(6.0f), gl.L(6.0f), this.n);
            this.j.setBounds((int) (rectF.left + gl.L(18.0f)), (int) (((rectF.top + this.c) - gl.L(5.0f)) - gl.L(12.0f)), (int) (rectF.left + gl.L(30.0f)), (int) ((rectF.top + this.c) - gl.L(5.0f)));
            this.j.draw(canvas);
            canvas.restore();
        }
        float f4 = rectF.left;
        if (this.i != null) {
            i = 28;
        }
        de9.n(this.k.getHeight(), 2.0f, (this.c / 2.0f) + rectF.top, (f4 + gl.L(6 + i)) - this.m, canvas);
        this.k.draw(canvas);
        canvas.restore();
    }

    public zv3(cw3 cw3Var, CharSequence charSequence) {
        super(cw3Var);
        this.o = cw3Var;
        this.a = (byte) 5;
        TextPaint textPaint = cw3Var.b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, gl.q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.k = staticLayout;
        this.l = staticLayout.getLineCount() > 0 ? this.k.getLineWidth(0) : 0.0f;
        this.m = this.k.getLineCount() > 0 ? this.k.getLineLeft(0) : 0.0f;
        this.b = gl.N(12.0f) + this.l;
        this.c = gl.N(36.0f);
    }
}
