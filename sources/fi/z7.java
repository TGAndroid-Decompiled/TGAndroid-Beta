package fi;

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
import org.telegram.messenger.m10;
import org.telegram.messenger.si;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ou0;
public final class z7 extends View implements org.telegram.ui.Cells.q9 {
    public final boolean E;
    public int F;
    public int G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public final a8 K;
    public final PorterDuffColorFilter f12594a;
    public boolean f12595b;
    public final TextPaint f12596c;
    public final TextPaint d;
    public final Paint f12597e;
    public final Paint f12598f;
    public float h;
    public float f12599n;
    public final y7[] f12600r;
    public int f12601s;
    public StaticLayout f12602w;
    public float f12603x;
    public boolean f12604y;

    public z7(a8 a8Var, Context context) {
        super(context);
        this.K = a8Var;
        TextPaint textPaint = new TextPaint(1);
        this.f12596c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.f12597e = paint;
        Paint paint2 = new Paint(1);
        this.f12598f = paint2;
        this.f12600r = r7;
        this.f12601s = 0;
        new Path();
        this.E = true;
        this.I = false;
        y7[] y7VarArr = {new y7(this), null};
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
        this.f12594a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(z7 z7Var, TextPaint textPaint, CharSequence charSequence, int i7) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i7).setBreakStrategy(0).setHyphenationFrequency(0);
            if (hd.f24101a0) {
                alignment = ou0.a();
            } else {
                Layout.Alignment[] alignmentArr = ou0.f38088a;
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

    public final void b(CharSequence charSequence, v7 v7Var, v7 v7Var2, boolean z10, boolean z11) {
        boolean z12;
        if (charSequence == null) {
            charSequence = "";
        }
        y7[] y7VarArr = this.f12600r;
        CharSequence charSequence2 = y7VarArr[0].f12562n;
        Pattern pattern = si.S1;
        if (charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) {
            z12 = false;
        } else {
            z12 = si.K(si.b0(m10.f24934t0).W(new CharSequence[]{new SpannableStringBuilder(charSequence2)}, true, true), si.b0(m10.f24934t0).W(new CharSequence[]{new SpannableStringBuilder(charSequence)}, true, true));
        }
        if (z12) {
            y7 y7Var = y7VarArr[0];
            if (y7Var.f12563o == v7Var && y7Var.f12564p == v7Var2) {
                y7Var.f12565q = z10;
                invalidate();
                return;
            }
        }
        this.f12604y = false;
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.I = false;
        if (z11) {
            if (y7VarArr[1] == null) {
                y7VarArr[1] = new y7(this);
            }
            y7 y7Var2 = y7VarArr[1];
            y7 y7Var3 = y7VarArr[0];
            y7Var2.g(y7Var3.f12562n, y7Var3.f12563o, y7Var3.f12564p);
            y7 y7Var4 = y7VarArr[1];
            y7 y7Var5 = y7VarArr[0];
            y7Var4.f12565q = y7Var5.f12565q;
            y7Var4.f12566r.e(true, y7Var5.f12566r.f39903c);
            y7VarArr[0].g(charSequence, v7Var, v7Var2);
            y7 y7Var6 = y7VarArr[0];
            y7Var6.f12565q = z10;
            y7Var6.f12566r.e(true, 0.0f);
            this.H = 1.0f;
            ValueAnimator valueAnimator2 = this.J;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.I = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, 0.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 24));
            this.J.addListener(new ai.i0(this, 17));
            this.J.setDuration(180L);
            this.J.setInterpolator(er.f34421g);
            this.J.start();
            return;
        }
        y7VarArr[0].g(charSequence, v7Var, v7Var2);
        y7VarArr[0].f12565q = z10;
        invalidate();
        this.H = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: fi.z7.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i7 = this.G * 2;
        y7[] y7VarArr = this.f12600r;
        int i10 = 0;
        int i11 = y7VarArr[0].f12560l;
        y7 y7Var = y7VarArr[1];
        if (y7Var != null) {
            i10 = y7Var.f12560l;
        }
        return org.telegram.messenger.g0.W1(this.H, i11, i10) + i7;
    }

    public Paint getPaint() {
        return this.f12596c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f12600r[0].f12554e;
    }

    @Override
    public CharSequence getText() {
        return this.f12600r[0].f12562n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        y7 y7Var = this.f12600r[0];
        z7 z7Var = y7Var.v;
        org.telegram.ui.Components.p5.release(z7Var, y7Var.d);
        org.telegram.ui.Components.p5.release(z7Var, y7Var.f12555f);
        if (y7Var.h == null) {
            return;
        }
        while (true) {
            w7[] w7VarArr = y7Var.h;
            if (i7 < w7VarArr.length) {
                w7 w7Var = w7VarArr[i7];
                if (w7Var != null) {
                    org.telegram.ui.Components.p5.release(z7Var, w7Var.f12470a);
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
        if (this.f12602w != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        y7[] y7VarArr = this.f12600r;
        y7VarArr[0].b(canvas2, 1.0f - this.H);
        y7 y7Var = y7VarArr[1];
        if (y7Var != null) {
            y7Var.b(canvas2, this.H);
        }
        if (this.f12602w != null) {
            float scrollY = this.h + this.K.getScrollY();
            int i7 = (int) ((1.0f - Utilities.i(this.f12603x / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f12598f;
            paint.setAlpha(i7);
            Paint paint2 = this.f12597e;
            paint2.setAlpha(i7);
            this.d.setAlpha(i7);
            canvas2.save();
            canvas2.translate(this.f12599n - org.telegram.messenger.g0.L(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(32.0f), this.f12602w.getHeight() + this.G, paint);
            canvas2.restore();
            canvas2.drawRect(this.f12599n - org.telegram.messenger.g0.L(16.0f), scrollY, getMeasuredWidth(), this.f12602w.getHeight() + scrollY + this.G, paint2);
            canvas2.save();
            canvas2.translate(this.f12599n, scrollY);
            this.f12602w.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = (i10 + i7) << 16;
        this.F = org.telegram.messenger.g0.L(16.0f);
        this.G = org.telegram.messenger.g0.L(8.0f);
        int i12 = this.f12601s;
        y7[] y7VarArr = this.f12600r;
        int i13 = 0;
        if (i12 != i11) {
            this.f12601s = i11;
            int max = Math.max(0, View.MeasureSpec.getSize(i7) - (this.F * 2));
            y7VarArr[0].e(max);
            y7 y7Var = y7VarArr[1];
            if (y7Var != null) {
                y7Var.e(max);
            }
        }
        int i14 = this.G * 2;
        int i15 = y7VarArr[0].f12560l;
        y7 y7Var2 = y7VarArr[1];
        if (y7Var2 != null) {
            i13 = y7Var2.f12560l;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.W1(this.H, i15, i13) + i14, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: fi.z7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        if (z10 != isPressed()) {
            z11 = true;
        } else {
            z11 = false;
        }
        super.setPressed(z10);
        if (z11) {
            invalidate();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.K.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        y7 y7Var;
        v7 v7Var;
        v7 v7Var2;
        v7 v7Var3;
        v7 v7Var4;
        y7[] y7VarArr = this.f12600r;
        y7 y7Var2 = y7VarArr[0];
        if ((y7Var2 != null && (y7Var2.f12567s == drawable || (((v7Var3 = y7Var2.f12563o) != null && v7Var3.f12435j == drawable) || ((v7Var4 = y7Var2.f12564p) != null && v7Var4.f12435j == drawable)))) || ((y7Var = y7VarArr[1]) != null && (y7Var.f12567s == drawable || (((v7Var = y7Var.f12563o) != null && v7Var.f12435j == drawable) || ((v7Var2 = y7Var.f12564p) != null && v7Var2.f12435j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
