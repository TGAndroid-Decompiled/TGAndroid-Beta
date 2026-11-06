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
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.xq;
public final class g8 extends View implements org.telegram.ui.Cells.r9 {
    public final boolean D;
    public int E;
    public int F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final h8 J;
    public final PorterDuffColorFilter f9051a;
    public boolean f9052b;
    public final TextPaint f9053c;
    public final TextPaint d;
    public final Paint f9054e;
    public final Paint f9055f;
    public float h;
    public float f9056n;
    public final f8[] f9057r;
    public int f9058s;
    public StaticLayout f9059w;
    public float f9060x;
    public boolean f9061y;

    public g8(h8 h8Var, Context context) {
        super(context);
        this.J = h8Var;
        TextPaint textPaint = new TextPaint(1);
        this.f9053c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.f9054e = paint;
        Paint paint2 = new Paint(1);
        this.f9055f = paint2;
        this.f9057r = r7;
        this.f9058s = 0;
        new Path();
        this.D = true;
        this.H = false;
        f8[] f8VarArr = {new f8(this), null};
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
        this.f9051a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(g8 g8Var, TextPaint textPaint, CharSequence charSequence, int i7) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i7).setBreakStrategy(0).setHyphenationFrequency(0);
            if (hd.f22878a0) {
                alignment = mu0.a();
            } else {
                Layout.Alignment[] alignmentArr = mu0.f36100a;
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
        f8[] f8VarArr = this.f9057r;
        CharSequence charSequence2 = f8VarArr[0].f9014n;
        Pattern pattern = ui.R1;
        if (charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) {
            z11 = false;
        } else {
            z11 = ui.K(ui.b0(p10.f24467s0).W(new CharSequence[]{new SpannableStringBuilder(charSequence2)}, true, true), ui.b0(p10.f24467s0).W(new CharSequence[]{new SpannableStringBuilder(charSequence)}, true, true));
        }
        if (z11) {
            f8 f8Var = f8VarArr[0];
            if (f8Var.f9015o == c8Var && f8Var.f9016p == c8Var2) {
                f8Var.f9017q = z9;
                invalidate();
                return;
            }
        }
        this.f9061y = false;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.H = false;
        if (z10) {
            if (f8VarArr[1] == null) {
                f8VarArr[1] = new f8(this);
            }
            f8 f8Var2 = f8VarArr[1];
            f8 f8Var3 = f8VarArr[0];
            f8Var2.g(f8Var3.f9014n, f8Var3.f9015o, f8Var3.f9016p);
            f8 f8Var4 = f8VarArr[1];
            f8 f8Var5 = f8VarArr[0];
            f8Var4.f9017q = f8Var5.f9017q;
            f8Var4.f9018r.e(true, f8Var5.f9018r.f39855c);
            f8VarArr[0].g(charSequence, c8Var, c8Var2);
            f8 f8Var6 = f8VarArr[0];
            f8Var6.f9017q = z9;
            f8Var6.f9018r.e(true, 0.0f);
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
            this.I.setInterpolator(xq.f40346g);
            this.I.start();
            return;
        }
        f8VarArr[0].g(charSequence, c8Var, c8Var2);
        f8VarArr[0].f9017q = z9;
        invalidate();
        this.G = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: di.g8.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i7 = this.F * 2;
        f8[] f8VarArr = this.f9057r;
        int i10 = 0;
        int i11 = f8VarArr[0].f9012l;
        f8 f8Var = f8VarArr[1];
        if (f8Var != null) {
            i10 = f8Var.f9012l;
        }
        return org.telegram.messenger.g0.W1(this.G, i11, i10) + i7;
    }

    public Paint getPaint() {
        return this.f9053c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f9057r[0].f9006e;
    }

    @Override
    public CharSequence getText() {
        return this.f9057r[0].f9014n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        f8 f8Var = this.f9057r[0];
        g8 g8Var = f8Var.v;
        org.telegram.ui.Components.r5.release(g8Var, f8Var.d);
        org.telegram.ui.Components.r5.release(g8Var, f8Var.f9007f);
        if (f8Var.h == null) {
            return;
        }
        while (true) {
            d8[] d8VarArr = f8Var.h;
            if (i7 < d8VarArr.length) {
                d8 d8Var = d8VarArr[i7];
                if (d8Var != null) {
                    org.telegram.ui.Components.r5.release(g8Var, d8Var.f8934a);
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
        if (this.f9059w != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        f8[] f8VarArr = this.f9057r;
        f8VarArr[0].b(canvas2, 1.0f - this.G);
        f8 f8Var = f8VarArr[1];
        if (f8Var != null) {
            f8Var.b(canvas2, this.G);
        }
        if (this.f9059w != null) {
            float scrollY = this.h + this.J.getScrollY();
            int i7 = (int) ((1.0f - Utilities.i(this.f9060x / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f9055f;
            paint.setAlpha(i7);
            Paint paint2 = this.f9054e;
            paint2.setAlpha(i7);
            this.d.setAlpha(i7);
            canvas2.save();
            canvas2.translate(this.f9056n - org.telegram.messenger.g0.L(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(32.0f), this.f9059w.getHeight() + this.F, paint);
            canvas2.restore();
            canvas2.drawRect(this.f9056n - org.telegram.messenger.g0.L(16.0f), scrollY, getMeasuredWidth(), this.f9059w.getHeight() + scrollY + this.F, paint2);
            canvas2.save();
            canvas2.translate(this.f9056n, scrollY);
            this.f9059w.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = (i10 + i7) << 16;
        this.E = org.telegram.messenger.g0.L(16.0f);
        this.F = org.telegram.messenger.g0.L(8.0f);
        int i12 = this.f9058s;
        f8[] f8VarArr = this.f9057r;
        int i13 = 0;
        if (i12 != i11) {
            this.f9058s = i11;
            int max = Math.max(0, View.MeasureSpec.getSize(i7) - (this.E * 2));
            f8VarArr[0].e(max);
            f8 f8Var = f8VarArr[1];
            if (f8Var != null) {
                f8Var.e(max);
            }
        }
        int i14 = this.F * 2;
        int i15 = f8VarArr[0].f9012l;
        f8 f8Var2 = f8VarArr[1];
        if (f8Var2 != null) {
            i13 = f8Var2.f9012l;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.W1(this.G, i15, i13) + i14, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: di.g8.onTouchEvent(android.view.MotionEvent):boolean");
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
        f8 f8Var;
        c8 c8Var;
        c8 c8Var2;
        c8 c8Var3;
        c8 c8Var4;
        f8[] f8VarArr = this.f9057r;
        f8 f8Var2 = f8VarArr[0];
        if ((f8Var2 != null && (f8Var2.f9019s == drawable || (((c8Var3 = f8Var2.f9015o) != null && c8Var3.f8886j == drawable) || ((c8Var4 = f8Var2.f9016p) != null && c8Var4.f8886j == drawable)))) || ((f8Var = f8VarArr[1]) != null && (f8Var.f9019s == drawable || (((c8Var = f8Var.f9015o) != null && c8Var.f8886j == drawable) || ((c8Var2 = f8Var.f9016p) != null && c8Var2.f8886j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
