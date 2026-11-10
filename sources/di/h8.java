package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.wq;
public final class h8 extends View implements org.telegram.ui.Cells.r9 {
    public final boolean D;
    public int E;
    public int F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final i8 J;
    public final PorterDuffColorFilter f9082a;
    public boolean f9083b;
    public final TextPaint f9084c;
    public final TextPaint d;
    public final Paint f9085e;
    public final Paint f9086f;
    public float h;
    public float f9087n;
    public final g8[] f9088r;
    public int f9089s;
    public StaticLayout f9090w;
    public float f9091x;
    public boolean f9092y;

    public h8(i8 i8Var, Context context) {
        super(context);
        this.J = i8Var;
        TextPaint textPaint = new TextPaint(1);
        this.f9084c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.f9085e = paint;
        Paint paint2 = new Paint(1);
        this.f9086f = paint2;
        this.f9088r = r7;
        this.f9089s = 0;
        new Path();
        this.D = true;
        this.H = false;
        g8[] g8VarArr = {new g8(this), null};
        textPaint.setColor(-1);
        textPaint.linkColor = -1;
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint2.setColor(-1);
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(16.0f));
        paint.setColor(-16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(16.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f9082a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(h8 h8Var, TextPaint textPaint, CharSequence charSequence, int i7) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i7).setBreakStrategy(0).setHyphenationFrequency(0);
            if (id.f23161a0) {
                alignment = nu0.a();
            } else {
                Layout.Alignment[] alignmentArr = nu0.f36397a;
                if (alignmentArr.length >= 5) {
                    alignment = alignmentArr[3];
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            return hyphenationFrequency.setAlignment(alignment).build();
        }
        return new StaticLayout(charSequence, textPaint, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    public final void b(CharSequence charSequence, c8 c8Var, c8 c8Var2, boolean z9, boolean z10) {
        boolean z11;
        if (charSequence == null) {
            charSequence = "";
        }
        g8[] g8VarArr = this.f9088r;
        CharSequence charSequence2 = g8VarArr[0].f9052n;
        Pattern pattern = ui.R1;
        if (charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) {
            z11 = false;
        } else {
            z11 = ui.K(ui.b0(p10.f24474s0).W(new CharSequence[]{new SpannableStringBuilder(charSequence2)}, true, true), ui.b0(p10.f24474s0).W(new CharSequence[]{new SpannableStringBuilder(charSequence)}, true, true));
        }
        if (z11) {
            g8 g8Var = g8VarArr[0];
            if (g8Var.f9053o == c8Var && g8Var.f9054p == c8Var2) {
                g8Var.f9055q = z9;
                invalidate();
                return;
            }
        }
        this.f9092y = false;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.H = false;
        if (z10) {
            if (g8VarArr[1] == null) {
                g8VarArr[1] = new g8(this);
            }
            g8 g8Var2 = g8VarArr[1];
            g8 g8Var3 = g8VarArr[0];
            g8Var2.g(g8Var3.f9052n, g8Var3.f9053o, g8Var3.f9054p);
            g8 g8Var4 = g8VarArr[1];
            g8 g8Var5 = g8VarArr[0];
            g8Var4.f9055q = g8Var5.f9055q;
            g8Var4.f9056r.e(true, g8Var5.f9056r.f38854c);
            g8VarArr[0].g(charSequence, c8Var, c8Var2);
            g8 g8Var6 = g8VarArr[0];
            g8Var6.f9055q = z9;
            g8Var6.f9056r.e(true, 0.0f);
            this.G = 1.0f;
            ValueAnimator valueAnimator2 = this.I;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.H = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 23));
            this.I.addListener(new bi.t5(this, 15));
            this.I.setDuration(180L);
            this.I.setInterpolator(wq.f40047g);
            this.I.start();
            return;
        }
        g8VarArr[0].g(charSequence, c8Var, c8Var2);
        g8VarArr[0].f9055q = z9;
        invalidate();
        this.G = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: di.h8.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i7 = this.F * 2;
        g8[] g8VarArr = this.f9088r;
        int i10 = 0;
        int i11 = g8VarArr[0].f9050l;
        g8 g8Var = g8VarArr[1];
        if (g8Var != null) {
            i10 = g8Var.f9050l;
        }
        return org.telegram.messenger.g0.W1(this.G, i11, i10) + i7;
    }

    public Paint getPaint() {
        return this.f9084c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f9088r[0].f9044e;
    }

    @Override
    public CharSequence getText() {
        return this.f9088r[0].f9052n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        g8 g8Var = this.f9088r[0];
        h8 h8Var = g8Var.v;
        org.telegram.ui.Components.q5.release(h8Var, g8Var.d);
        org.telegram.ui.Components.q5.release(h8Var, g8Var.f9045f);
        if (g8Var.h == null) {
            return;
        }
        while (true) {
            d8[] d8VarArr = g8Var.h;
            if (i7 < d8VarArr.length) {
                d8 d8Var = d8VarArr[i7];
                if (d8Var != null) {
                    org.telegram.ui.Components.q5.release(h8Var, d8Var.f8937a);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f9090w != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        g8[] g8VarArr = this.f9088r;
        g8VarArr[0].b(canvas2, 1.0f - this.G);
        g8 g8Var = g8VarArr[1];
        if (g8Var != null) {
            g8Var.b(canvas2, this.G);
        }
        if (this.f9090w != null) {
            float scrollY = this.h + this.J.getScrollY();
            int i7 = (int) ((1.0f - Utilities.i(this.f9091x / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f9086f;
            paint.setAlpha(i7);
            Paint paint2 = this.f9085e;
            paint2.setAlpha(i7);
            this.d.setAlpha(i7);
            canvas2.save();
            canvas2.translate(this.f9087n - org.telegram.messenger.g0.L(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(32.0f), this.f9090w.getHeight() + this.F, paint);
            canvas2.restore();
            canvas2.drawRect(this.f9087n - org.telegram.messenger.g0.L(16.0f), scrollY, getMeasuredWidth(), this.f9090w.getHeight() + scrollY + this.F, paint2);
            canvas2.save();
            canvas2.translate(this.f9087n, scrollY);
            this.f9090w.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = (i10 + i7) << 16;
        this.E = org.telegram.messenger.g0.L(16.0f);
        this.F = org.telegram.messenger.g0.L(8.0f);
        int i12 = this.f9089s;
        g8[] g8VarArr = this.f9088r;
        int i13 = 0;
        if (i12 != i11) {
            this.f9089s = i11;
            int max = Math.max(0, View.MeasureSpec.getSize(i7) - (this.E * 2));
            g8VarArr[0].e(max);
            g8 g8Var = g8VarArr[1];
            if (g8Var != null) {
                g8Var.e(max);
            }
        }
        int i14 = this.F * 2;
        int i15 = g8VarArr[0].f9050l;
        g8 g8Var2 = g8VarArr[1];
        if (g8Var2 != null) {
            i13 = g8Var2.f9050l;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.W1(this.G, i15, i13) + i14, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: di.h8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setPressed(boolean z9) {
        boolean z10;
        if (z9 != isPressed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        super.setPressed(z9);
        if (z10) {
            invalidate();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.J.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        g8 g8Var;
        c8 c8Var;
        c8 c8Var2;
        c8 c8Var3;
        c8 c8Var4;
        g8[] g8VarArr = this.f9088r;
        g8 g8Var2 = g8VarArr[0];
        if ((g8Var2 != null && (g8Var2.f9057s == drawable || (((c8Var3 = g8Var2.f9053o) != null && c8Var3.f8895j == drawable) || ((c8Var4 = g8Var2.f9054p) != null && c8Var4.f8895j == drawable)))) || ((g8Var = g8VarArr[1]) != null && (g8Var.f9057s == drawable || (((c8Var = g8Var.f9053o) != null && c8Var.f8895j == drawable) || ((c8Var2 = g8Var.f9054p) != null && c8Var2.f8895j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
