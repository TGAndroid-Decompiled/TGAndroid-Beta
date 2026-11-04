package ei;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.li;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.xq;
public final class g8 extends View implements org.telegram.ui.Cells.q9 {
    public final boolean E;
    public int F;
    public int G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public final h8 K;
    public final PorterDuffColorFilter f10338a;
    public boolean f10339b;
    public final TextPaint f10340c;
    public final TextPaint d;
    public final Paint f10341e;
    public final Paint f10342f;
    public float h;
    public float f10343n;
    public final f8[] f10344r;
    public int f10345s;
    public StaticLayout f10346w;
    public float f10347x;
    public boolean f10348y;

    public g8(h8 h8Var, Context context) {
        super(context);
        this.K = h8Var;
        TextPaint textPaint = new TextPaint(1);
        this.f10340c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.f10341e = paint;
        Paint paint2 = new Paint(1);
        this.f10342f = paint2;
        this.f10344r = r7;
        this.f10345s = 0;
        new Path();
        this.E = true;
        this.I = false;
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
        this.f10338a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(g8 g8Var, TextPaint textPaint, CharSequence charSequence, int i3) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i3).setBreakStrategy(0).setHyphenationFrequency(0);
            if (bd.f21784a0) {
                alignment = lu0.a();
            } else {
                Layout.Alignment[] alignmentArr = lu0.f35891a;
                if (alignmentArr.length >= 5) {
                    alignment = alignmentArr[3];
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            return hyphenationFrequency.setAlignment(alignment).build();
        }
        return new StaticLayout(charSequence, textPaint, i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    public final void b(CharSequence charSequence, c8 c8Var, c8 c8Var2, boolean z10, boolean z11) {
        boolean z12;
        if (charSequence == null) {
            charSequence = "";
        }
        f8[] f8VarArr = this.f10344r;
        CharSequence charSequence2 = f8VarArr[0].f10284n;
        Pattern pattern = li.S1;
        if (charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) {
            z12 = false;
        } else {
            z12 = li.K(li.b0(h10.f22829t0).W(new CharSequence[]{new SpannableStringBuilder(charSequence2)}, true, true), li.b0(h10.f22829t0).W(new CharSequence[]{new SpannableStringBuilder(charSequence)}, true, true));
        }
        if (z12) {
            f8 f8Var = f8VarArr[0];
            if (f8Var.f10285o == c8Var && f8Var.f10286p == c8Var2) {
                f8Var.f10287q = z10;
                invalidate();
                return;
            }
        }
        this.f10348y = false;
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.I = false;
        if (z11) {
            if (f8VarArr[1] == null) {
                f8VarArr[1] = new f8(this);
            }
            f8 f8Var2 = f8VarArr[1];
            f8 f8Var3 = f8VarArr[0];
            f8Var2.g(f8Var3.f10284n, f8Var3.f10285o, f8Var3.f10286p);
            f8 f8Var4 = f8VarArr[1];
            f8 f8Var5 = f8VarArr[0];
            f8Var4.f10287q = f8Var5.f10287q;
            f8Var4.f10288r.e(true, f8Var5.f10288r.f38645c);
            f8VarArr[0].g(charSequence, c8Var, c8Var2);
            f8 f8Var6 = f8VarArr[0];
            f8Var6.f10287q = z10;
            f8Var6.f10288r.e(true, 0.0f);
            this.H = 1.0f;
            ValueAnimator valueAnimator2 = this.J;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.I = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, 0.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new bh.f(this, 24));
            this.J.addListener(new ai.e1(this, 17));
            this.J.setDuration(180L);
            this.J.setInterpolator(xq.f40453g);
            this.J.start();
            return;
        }
        f8VarArr[0].g(charSequence, c8Var, c8Var2);
        f8VarArr[0].f10287q = z10;
        invalidate();
        this.H = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: ei.g8.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i3 = this.G * 2;
        f8[] f8VarArr = this.f10344r;
        int i10 = 0;
        int i11 = f8VarArr[0].f10282l;
        f8 f8Var = f8VarArr[1];
        if (f8Var != null) {
            i10 = f8Var.f10282l;
        }
        return org.telegram.messenger.g0.W1(this.H, i11, i10) + i3;
    }

    public Paint getPaint() {
        return this.f10340c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f10344r[0].f10276e;
    }

    @Override
    public CharSequence getText() {
        return this.f10344r[0].f10284n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = 0;
        f8 f8Var = this.f10344r[0];
        g8 g8Var = f8Var.v;
        org.telegram.ui.Components.p5.release(g8Var, f8Var.d);
        org.telegram.ui.Components.p5.release(g8Var, f8Var.f10277f);
        if (f8Var.h == null) {
            return;
        }
        while (true) {
            d8[] d8VarArr = f8Var.h;
            if (i3 < d8VarArr.length) {
                d8 d8Var = d8VarArr[i3];
                if (d8Var != null) {
                    org.telegram.ui.Components.p5.release(g8Var, d8Var.f10206a);
                }
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f10346w != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        f8[] f8VarArr = this.f10344r;
        f8VarArr[0].b(canvas2, 1.0f - this.H);
        f8 f8Var = f8VarArr[1];
        if (f8Var != null) {
            f8Var.b(canvas2, this.H);
        }
        if (this.f10346w != null) {
            float scrollY = this.h + this.K.getScrollY();
            int i3 = (int) ((1.0f - Utilities.i(this.f10347x / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f10342f;
            paint.setAlpha(i3);
            Paint paint2 = this.f10341e;
            paint2.setAlpha(i3);
            this.d.setAlpha(i3);
            canvas2.save();
            canvas2.translate(this.f10343n - org.telegram.messenger.g0.L(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(32.0f), this.f10346w.getHeight() + this.G, paint);
            canvas2.restore();
            canvas2.drawRect(this.f10343n - org.telegram.messenger.g0.L(16.0f), scrollY, getMeasuredWidth(), this.f10346w.getHeight() + scrollY + this.G, paint2);
            canvas2.save();
            canvas2.translate(this.f10343n, scrollY);
            this.f10346w.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11 = (i10 + i3) << 16;
        this.F = org.telegram.messenger.g0.L(16.0f);
        this.G = org.telegram.messenger.g0.L(8.0f);
        int i12 = this.f10345s;
        f8[] f8VarArr = this.f10344r;
        int i13 = 0;
        if (i12 != i11) {
            this.f10345s = i11;
            int max = Math.max(0, View.MeasureSpec.getSize(i3) - (this.F * 2));
            f8VarArr[0].e(max);
            f8 f8Var = f8VarArr[1];
            if (f8Var != null) {
                f8Var.e(max);
            }
        }
        int i14 = this.G * 2;
        int i15 = f8VarArr[0].f10282l;
        f8 f8Var2 = f8VarArr[1];
        if (f8Var2 != null) {
            i13 = f8Var2.f10282l;
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.W1(this.H, i15, i13) + i14, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: ei.g8.onTouchEvent(android.view.MotionEvent):boolean");
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
        f8 f8Var;
        c8 c8Var;
        c8 c8Var2;
        c8 c8Var3;
        c8 c8Var4;
        f8[] f8VarArr = this.f10344r;
        f8 f8Var2 = f8VarArr[0];
        if ((f8Var2 != null && (f8Var2.f10289s == drawable || (((c8Var3 = f8Var2.f10285o) != null && c8Var3.f10168j == drawable) || ((c8Var4 = f8Var2.f10286p) != null && c8Var4.f10168j == drawable)))) || ((f8Var = f8VarArr[1]) != null && (f8Var.f10289s == drawable || (((c8Var = f8Var.f10285o) != null && c8Var.f10168j == drawable) || ((c8Var2 = f8Var.f10286p) != null && c8Var2.f10168j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
