package ci;

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
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.hx0;
import org.telegram.ui.Components.zr;
public final class q8 extends View implements org.telegram.ui.Cells.x9 {
    public int E;
    public int F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final r8 J;
    public final PorterDuffColorFilter f5798a;
    public boolean f5799b;
    public final TextPaint f5800c;
    public final TextPaint d;
    public final Paint e;
    public final Paint f5801f;
    public float h;
    public float f5802n;
    public final p8[] f5803r;
    public int f5804s;
    public StaticLayout v;
    public float f5805w;
    public boolean f5806x;
    public final boolean f5807y;

    public q8(r8 r8Var, Context context) {
        super(context);
        this.J = r8Var;
        TextPaint textPaint = new TextPaint(1);
        this.f5800c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f5801f = paint2;
        this.f5803r = r7;
        this.f5804s = 0;
        new Path();
        this.f5807y = true;
        this.H = false;
        p8[] p8VarArr = {new p8(this), null};
        textPaint.setColor(-1);
        textPaint.linkColor = -1;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint2.setColor(-1);
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(16.0f));
        paint.setColor(-16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(16.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f5798a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(q8 q8Var, TextPaint textPaint, CharSequence charSequence, int i10) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setBreakStrategy(0).setHyphenationFrequency(0);
            if (LocaleController.isRTL) {
                alignment = hx0.a();
            } else {
                Layout.Alignment[] alignmentArr = hx0.f27193a;
                if (alignmentArr.length >= 5) {
                    alignment = alignmentArr[3];
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            return hyphenationFrequency.setAlignment(alignment).build();
        }
        return new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    public final void b(CharSequence charSequence, m8 m8Var, m8 m8Var2, boolean z10, boolean z11) {
        if (charSequence == null) {
            charSequence = "";
        }
        p8[] p8VarArr = this.f5803r;
        if (MediaDataController.stringsEqual(p8VarArr[0].f5745n, charSequence)) {
            p8 p8Var = p8VarArr[0];
            if (p8Var.f5746o == m8Var && p8Var.f5747p == m8Var2) {
                p8Var.f5748q = z10;
                invalidate();
                return;
            }
        }
        this.f5806x = false;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.H = false;
        if (z11) {
            if (p8VarArr[1] == null) {
                p8VarArr[1] = new p8(this);
            }
            p8 p8Var2 = p8VarArr[1];
            p8 p8Var3 = p8VarArr[0];
            p8Var2.g(p8Var3.f5745n, p8Var3.f5746o, p8Var3.f5747p);
            p8 p8Var4 = p8VarArr[1];
            p8 p8Var5 = p8VarArr[0];
            p8Var4.f5748q = p8Var5.f5748q;
            p8Var4.f5749r.d(p8Var5.f5749r.f25568c, true);
            p8VarArr[0].g(charSequence, m8Var, m8Var2);
            p8 p8Var6 = p8VarArr[0];
            p8Var6.f5748q = z10;
            p8Var6.f5749r.d(0.0f, true);
            this.G = 1.0f;
            ValueAnimator valueAnimator2 = this.I;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.H = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new ah.c0(this, 21));
            this.I.addListener(new ah.b(this, 15));
            this.I.setDuration(180L);
            this.I.setInterpolator(zr.f33338g);
            this.I.start();
            return;
        }
        p8VarArr[0].g(charSequence, m8Var, m8Var2);
        p8VarArr[0].f5748q = z10;
        invalidate();
        this.G = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: ci.q8.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i10 = this.F * 2;
        p8[] p8VarArr = this.f5803r;
        int i11 = 0;
        int i12 = p8VarArr[0].f5743l;
        p8 p8Var = p8VarArr[1];
        if (p8Var != null) {
            i11 = p8Var.f5743l;
        }
        return AndroidUtilities.lerp(i12, i11, this.G) + i10;
    }

    public Paint getPaint() {
        return this.f5800c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f5803r[0].e;
    }

    @Override
    public CharSequence getText() {
        return this.f5803r[0].f5745n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        p8 p8Var = this.f5803r[0];
        q8 q8Var = p8Var.v;
        org.telegram.ui.Components.y5.release(q8Var, p8Var.d);
        org.telegram.ui.Components.y5.release(q8Var, p8Var.f5738f);
        if (p8Var.h == null) {
            return;
        }
        while (true) {
            n8[] n8VarArr = p8Var.h;
            if (i10 < n8VarArr.length) {
                n8 n8Var = n8VarArr[i10];
                if (n8Var != null) {
                    org.telegram.ui.Components.y5.release(q8Var, n8Var.f5607a);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.v != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        p8[] p8VarArr = this.f5803r;
        p8VarArr[0].b(canvas2, 1.0f - this.G);
        p8 p8Var = p8VarArr[1];
        if (p8Var != null) {
            p8Var.b(canvas2, this.G);
        }
        if (this.v != null) {
            float scrollY = this.h + this.J.getScrollY();
            int clamp = (int) ((1.0f - Utilities.clamp(this.f5805w / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f5801f;
            paint.setAlpha(clamp);
            Paint paint2 = this.e;
            paint2.setAlpha(clamp);
            this.d.setAlpha(clamp);
            canvas2.save();
            canvas2.translate(this.f5802n - AndroidUtilities.dp(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(32.0f), this.v.getHeight() + this.F, paint);
            canvas2.restore();
            canvas2.drawRect(this.f5802n - AndroidUtilities.dp(16.0f), scrollY, getMeasuredWidth(), this.v.getHeight() + scrollY + this.F, paint2);
            canvas2.save();
            canvas2.translate(this.f5802n, scrollY);
            this.v.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = (i11 + i10) << 16;
        this.E = AndroidUtilities.dp(16.0f);
        this.F = AndroidUtilities.dp(8.0f);
        int i13 = this.f5804s;
        p8[] p8VarArr = this.f5803r;
        int i14 = 0;
        if (i13 != i12) {
            this.f5804s = i12;
            int max = Math.max(0, View.MeasureSpec.getSize(i10) - (this.E * 2));
            p8VarArr[0].e(max);
            p8 p8Var = p8VarArr[1];
            if (p8Var != null) {
                p8Var.e(max);
            }
        }
        int i15 = this.F * 2;
        int i16 = p8VarArr[0].f5743l;
        p8 p8Var2 = p8VarArr[1];
        if (p8Var2 != null) {
            i14 = p8Var2.f5743l;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(i16, i14, this.G) + i15, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: ci.q8.onTouchEvent(android.view.MotionEvent):boolean");
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
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.J.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        p8 p8Var;
        m8 m8Var;
        m8 m8Var2;
        m8 m8Var3;
        m8 m8Var4;
        p8[] p8VarArr = this.f5803r;
        p8 p8Var2 = p8VarArr[0];
        if ((p8Var2 != null && (p8Var2.f5750s == drawable || (((m8Var3 = p8Var2.f5746o) != null && m8Var3.f5570j == drawable) || ((m8Var4 = p8Var2.f5747p) != null && m8Var4.f5570j == drawable)))) || ((p8Var = p8VarArr[1]) != null && (p8Var.f5750s == drawable || (((m8Var = p8Var.f5746o) != null && m8Var.f5570j == drawable) || ((m8Var2 = p8Var.f5747p) != null && m8Var2.f5570j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
