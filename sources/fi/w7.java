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
import org.telegram.messenger.k10;
import org.telegram.messenger.si;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.zu0;
public final class w7 extends View implements s9 {
    public final boolean E;
    public int F;
    public int G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public final x7 K;
    public final PorterDuffColorFilter f12745a;
    public boolean f12746b;
    public final TextPaint f12747c;
    public final TextPaint d;
    public final Paint f12748e;
    public final Paint f12749f;
    public float h;
    public float f12750n;
    public final v7[] f12751r;
    public int f12752s;
    public StaticLayout f12753w;
    public float f12754x;
    public boolean f12755y;

    public w7(x7 x7Var, Context context) {
        super(context);
        this.K = x7Var;
        TextPaint textPaint = new TextPaint(1);
        this.f12747c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.f12748e = paint;
        Paint paint2 = new Paint(1);
        this.f12749f = paint2;
        this.f12751r = r7;
        this.f12752s = 0;
        new Path();
        this.E = true;
        this.I = false;
        v7[] v7VarArr = {new v7(this), null};
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
        this.f12745a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(w7 w7Var, TextPaint textPaint, CharSequence charSequence, int i7) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i7).setBreakStrategy(0).setHyphenationFrequency(0);
            if (hd.f24444a0) {
                alignment = zu0.a();
            } else {
                Layout.Alignment[] alignmentArr = zu0.f42993a;
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

    public final void b(CharSequence charSequence, s7 s7Var, s7 s7Var2, boolean z10, boolean z11) {
        boolean z12;
        if (charSequence == null) {
            charSequence = "";
        }
        v7[] v7VarArr = this.f12751r;
        CharSequence charSequence2 = v7VarArr[0].f12705n;
        Pattern pattern = si.U1;
        if (charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) {
            z12 = false;
        } else {
            z12 = si.M(si.d0(k10.f24968t0).Y(new CharSequence[]{new SpannableStringBuilder(charSequence2)}, true, true), si.d0(k10.f24968t0).Y(new CharSequence[]{new SpannableStringBuilder(charSequence)}, true, true));
        }
        if (z12) {
            v7 v7Var = v7VarArr[0];
            if (v7Var.f12706o == s7Var && v7Var.f12707p == s7Var2) {
                v7Var.f12708q = z10;
                invalidate();
                return;
            }
        }
        this.f12755y = false;
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.I = false;
        if (z11) {
            if (v7VarArr[1] == null) {
                v7VarArr[1] = new v7(this);
            }
            v7 v7Var2 = v7VarArr[1];
            v7 v7Var3 = v7VarArr[0];
            v7Var2.g(v7Var3.f12705n, v7Var3.f12706o, v7Var3.f12707p);
            v7 v7Var4 = v7VarArr[1];
            v7 v7Var5 = v7VarArr[0];
            v7Var4.f12708q = v7Var5.f12708q;
            v7Var4.f12709r.e(true, v7Var5.f12709r.f34386c);
            v7VarArr[0].g(charSequence, s7Var, s7Var2);
            v7 v7Var6 = v7VarArr[0];
            v7Var6.f12708q = z10;
            v7Var6.f12709r.e(true, 0.0f);
            this.H = 1.0f;
            ValueAnimator valueAnimator2 = this.J;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.I = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, 0.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new ah.g(this, 24));
            this.J.addListener(new ai.k0(this, 17));
            this.J.setDuration(180L);
            this.J.setInterpolator(nr.f37961g);
            this.J.start();
            return;
        }
        v7VarArr[0].g(charSequence, s7Var, s7Var2);
        v7VarArr[0].f12708q = z10;
        invalidate();
        this.H = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: fi.w7.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i7 = this.G * 2;
        v7[] v7VarArr = this.f12751r;
        int i10 = 0;
        int i11 = v7VarArr[0].f12703l;
        v7 v7Var = v7VarArr[1];
        if (v7Var != null) {
            i10 = v7Var.f12703l;
        }
        return org.telegram.messenger.g0.W1(this.H, i11, i10) + i7;
    }

    public Paint getPaint() {
        return this.f12747c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f12751r[0].f12697e;
    }

    @Override
    public CharSequence getText() {
        return this.f12751r[0].f12705n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        v7 v7Var = this.f12751r[0];
        w7 w7Var = v7Var.v;
        org.telegram.ui.Components.y5.release(w7Var, v7Var.d);
        org.telegram.ui.Components.y5.release(w7Var, v7Var.f12698f);
        if (v7Var.h == null) {
            return;
        }
        while (true) {
            t7[] t7VarArr = v7Var.h;
            if (i7 < t7VarArr.length) {
                t7 t7Var = t7VarArr[i7];
                if (t7Var != null) {
                    org.telegram.ui.Components.y5.release(w7Var, t7Var.f12630a);
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
        if (this.f12753w != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        v7[] v7VarArr = this.f12751r;
        v7VarArr[0].b(canvas2, 1.0f - this.H);
        v7 v7Var = v7VarArr[1];
        if (v7Var != null) {
            v7Var.b(canvas2, this.H);
        }
        if (this.f12753w != null) {
            float scrollY = this.h + this.K.getScrollY();
            int i7 = (int) ((1.0f - Utilities.i(this.f12754x / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f12749f;
            paint.setAlpha(i7);
            Paint paint2 = this.f12748e;
            paint2.setAlpha(i7);
            this.d.setAlpha(i7);
            canvas2.save();
            canvas2.translate(this.f12750n - org.telegram.messenger.g0.L(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(32.0f), this.f12753w.getHeight() + this.G, paint);
            canvas2.restore();
            canvas2.drawRect(this.f12750n - org.telegram.messenger.g0.L(16.0f), scrollY, getMeasuredWidth(), this.f12753w.getHeight() + scrollY + this.G, paint2);
            canvas2.save();
            canvas2.translate(this.f12750n, scrollY);
            this.f12753w.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = (i10 + i7) << 16;
        this.F = org.telegram.messenger.g0.L(16.0f);
        this.G = org.telegram.messenger.g0.L(8.0f);
        int i12 = this.f12752s;
        v7[] v7VarArr = this.f12751r;
        int i13 = 0;
        if (i12 != i11) {
            this.f12752s = i11;
            int max = Math.max(0, View.MeasureSpec.getSize(i7) - (this.F * 2));
            v7VarArr[0].e(max);
            v7 v7Var = v7VarArr[1];
            if (v7Var != null) {
                v7Var.e(max);
            }
        }
        int i14 = this.G * 2;
        int i15 = v7VarArr[0].f12703l;
        v7 v7Var2 = v7VarArr[1];
        if (v7Var2 != null) {
            i13 = v7Var2.f12703l;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.W1(this.H, i15, i13) + i14, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: fi.w7.onTouchEvent(android.view.MotionEvent):boolean");
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
        v7 v7Var;
        s7 s7Var;
        s7 s7Var2;
        s7 s7Var3;
        s7 s7Var4;
        v7[] v7VarArr = this.f12751r;
        v7 v7Var2 = v7VarArr[0];
        if ((v7Var2 != null && (v7Var2.f12710s == drawable || (((s7Var3 = v7Var2.f12706o) != null && s7Var3.f12582j == drawable) || ((s7Var4 = v7Var2.f12707p) != null && s7Var4.f12582j == drawable)))) || ((v7Var = v7VarArr[1]) != null && (v7Var.f12710s == drawable || (((s7Var = v7Var.f12706o) != null && s7Var.f12582j == drawable) || ((s7Var2 = v7Var.f12707p) != null && s7Var2.f12582j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
