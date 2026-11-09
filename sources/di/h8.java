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
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.xq;
public final class h8 extends View implements org.telegram.ui.Cells.r9 {
    public final boolean D;
    public int E;
    public int F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final i8 J;
    public final PorterDuffColorFilter f9077a;
    public boolean f9078b;
    public final TextPaint f9079c;
    public final TextPaint d;
    public final Paint f9080e;
    public final Paint f9081f;
    public float h;
    public float f9082n;
    public final g8[] f9083r;
    public int f9084s;
    public StaticLayout f9085w;
    public float f9086x;
    public boolean f9087y;

    public h8(i8 i8Var, Context context) {
        super(context);
        this.J = i8Var;
        TextPaint textPaint = new TextPaint(1);
        this.f9079c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.f9080e = paint;
        Paint paint2 = new Paint(1);
        this.f9081f = paint2;
        this.f9083r = r7;
        this.f9084s = 0;
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
        this.f9077a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(h8 h8Var, TextPaint textPaint, CharSequence charSequence, int i7) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i7).setBreakStrategy(0).setHyphenationFrequency(0);
            if (id.f23157a0) {
                alignment = ou0.a();
            } else {
                Layout.Alignment[] alignmentArr = ou0.f36806a;
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
        g8[] g8VarArr = this.f9083r;
        CharSequence charSequence2 = g8VarArr[0].f9047n;
        Pattern pattern = ui.R1;
        if (charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) {
            z11 = false;
        } else {
            z11 = ui.K(ui.b0(p10.f24470s0).W(new CharSequence[]{new SpannableStringBuilder(charSequence2)}, true, true), ui.b0(p10.f24470s0).W(new CharSequence[]{new SpannableStringBuilder(charSequence)}, true, true));
        }
        if (z11) {
            g8 g8Var = g8VarArr[0];
            if (g8Var.f9048o == c8Var && g8Var.f9049p == c8Var2) {
                g8Var.f9050q = z9;
                invalidate();
                return;
            }
        }
        this.f9087y = false;
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
            g8Var2.g(g8Var3.f9047n, g8Var3.f9048o, g8Var3.f9049p);
            g8 g8Var4 = g8VarArr[1];
            g8 g8Var5 = g8VarArr[0];
            g8Var4.f9050q = g8Var5.f9050q;
            g8Var4.f9051r.e(true, g8Var5.f9051r.f39910c);
            g8VarArr[0].g(charSequence, c8Var, c8Var2);
            g8 g8Var6 = g8VarArr[0];
            g8Var6.f9050q = z9;
            g8Var6.f9051r.e(true, 0.0f);
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
            this.I.setInterpolator(xq.f40459g);
            this.I.start();
            return;
        }
        g8VarArr[0].g(charSequence, c8Var, c8Var2);
        g8VarArr[0].f9050q = z9;
        invalidate();
        this.G = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: di.h8.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i7 = this.F * 2;
        g8[] g8VarArr = this.f9083r;
        int i10 = 0;
        int i11 = g8VarArr[0].f9045l;
        g8 g8Var = g8VarArr[1];
        if (g8Var != null) {
            i10 = g8Var.f9045l;
        }
        return org.telegram.messenger.g0.W1(this.G, i11, i10) + i7;
    }

    public Paint getPaint() {
        return this.f9079c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f9083r[0].f9039e;
    }

    @Override
    public CharSequence getText() {
        return this.f9083r[0].f9047n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        g8 g8Var = this.f9083r[0];
        h8 h8Var = g8Var.v;
        org.telegram.ui.Components.r5.release(h8Var, g8Var.d);
        org.telegram.ui.Components.r5.release(h8Var, g8Var.f9040f);
        if (g8Var.h == null) {
            return;
        }
        while (true) {
            d8[] d8VarArr = g8Var.h;
            if (i7 < d8VarArr.length) {
                d8 d8Var = d8VarArr[i7];
                if (d8Var != null) {
                    org.telegram.ui.Components.r5.release(h8Var, d8Var.f8932a);
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
        if (this.f9085w != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        g8[] g8VarArr = this.f9083r;
        g8VarArr[0].b(canvas2, 1.0f - this.G);
        g8 g8Var = g8VarArr[1];
        if (g8Var != null) {
            g8Var.b(canvas2, this.G);
        }
        if (this.f9085w != null) {
            float scrollY = this.h + this.J.getScrollY();
            int i7 = (int) ((1.0f - Utilities.i(this.f9086x / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f9081f;
            paint.setAlpha(i7);
            Paint paint2 = this.f9080e;
            paint2.setAlpha(i7);
            this.d.setAlpha(i7);
            canvas2.save();
            canvas2.translate(this.f9082n - org.telegram.messenger.g0.L(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(32.0f), this.f9085w.getHeight() + this.F, paint);
            canvas2.restore();
            canvas2.drawRect(this.f9082n - org.telegram.messenger.g0.L(16.0f), scrollY, getMeasuredWidth(), this.f9085w.getHeight() + scrollY + this.F, paint2);
            canvas2.save();
            canvas2.translate(this.f9082n, scrollY);
            this.f9085w.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = (i10 + i7) << 16;
        this.E = org.telegram.messenger.g0.L(16.0f);
        this.F = org.telegram.messenger.g0.L(8.0f);
        int i12 = this.f9084s;
        g8[] g8VarArr = this.f9083r;
        int i13 = 0;
        if (i12 != i11) {
            this.f9084s = i11;
            int max = Math.max(0, View.MeasureSpec.getSize(i7) - (this.E * 2));
            g8VarArr[0].e(max);
            g8 g8Var = g8VarArr[1];
            if (g8Var != null) {
                g8Var.e(max);
            }
        }
        int i14 = this.F * 2;
        int i15 = g8VarArr[0].f9045l;
        g8 g8Var2 = g8VarArr[1];
        if (g8Var2 != null) {
            i13 = g8Var2.f9045l;
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
        g8[] g8VarArr = this.f9083r;
        g8 g8Var2 = g8VarArr[0];
        if ((g8Var2 != null && (g8Var2.f9052s == drawable || (((c8Var3 = g8Var2.f9048o) != null && c8Var3.f8890j == drawable) || ((c8Var4 = g8Var2.f9049p) != null && c8Var4.f8890j == drawable)))) || ((g8Var = g8VarArr[1]) != null && (g8Var.f9052s == drawable || (((c8Var = g8Var.f9048o) != null && c8Var.f8890j == drawable) || ((c8Var2 = g8Var.f9049p) != null && c8Var2.f8890j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
