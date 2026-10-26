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
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.px0;
public final class o8 extends View implements org.telegram.ui.Cells.ba {
    public int E;
    public int F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final p8 J;
    public final PorterDuffColorFilter f8883a;
    public boolean f8884b;
    public final TextPaint f8885c;
    public final TextPaint d;
    public final Paint e;
    public final Paint f8886f;
    public float h;
    public float f8887n;
    public final n8[] f8888r;
    public int f8889s;
    public StaticLayout v;
    public float f8890w;
    public boolean f8891x;
    public final boolean f8892y;

    public o8(p8 p8Var, Context context) {
        super(context);
        this.J = p8Var;
        TextPaint textPaint = new TextPaint(1);
        this.f8885c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f8886f = paint2;
        this.f8888r = r7;
        this.f8889s = 0;
        new Path();
        this.f8892y = true;
        this.H = false;
        n8[] n8VarArr = {new n8(this), null};
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
        this.f8883a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(o8 o8Var, TextPaint textPaint, CharSequence charSequence, int i10) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setBreakStrategy(0).setHyphenationFrequency(0);
            if (LocaleController.isRTL) {
                alignment = px0.a();
            } else {
                Layout.Alignment[] alignmentArr = px0.f31732a;
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

    public final void b(CharSequence charSequence, k8 k8Var, k8 k8Var2, boolean z10, boolean z11) {
        if (charSequence == null) {
            charSequence = "";
        }
        n8[] n8VarArr = this.f8888r;
        if (MediaDataController.stringsEqual(n8VarArr[0].f8847n, charSequence)) {
            n8 n8Var = n8VarArr[0];
            if (n8Var.f8848o == k8Var && n8Var.f8849p == k8Var2) {
                n8Var.f8850q = z10;
                invalidate();
                return;
            }
        }
        this.f8891x = false;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.H = false;
        if (z11) {
            if (n8VarArr[1] == null) {
                n8VarArr[1] = new n8(this);
            }
            n8 n8Var2 = n8VarArr[1];
            n8 n8Var3 = n8VarArr[0];
            n8Var2.g(n8Var3.f8847n, n8Var3.f8848o, n8Var3.f8849p);
            n8 n8Var4 = n8VarArr[1];
            n8 n8Var5 = n8VarArr[0];
            n8Var4.f8850q = n8Var5.f8850q;
            n8Var4.f8851r.d(n8Var5.f8851r.f28811c, true);
            n8VarArr[0].g(charSequence, k8Var, k8Var2);
            n8 n8Var6 = n8VarArr[0];
            n8Var6.f8850q = z10;
            n8Var6.f8851r.d(0.0f, true);
            this.G = 1.0f;
            ValueAnimator valueAnimator2 = this.I;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.H = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new ai.g0(this, 23));
            this.I.addListener(new bh.b(this, 16));
            this.I.setDuration(180L);
            this.I.setInterpolator(ds.f27587g);
            this.I.start();
            return;
        }
        n8VarArr[0].g(charSequence, k8Var, k8Var2);
        n8VarArr[0].f8850q = z10;
        invalidate();
        this.G = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: di.o8.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i10 = this.F * 2;
        n8[] n8VarArr = this.f8888r;
        int i11 = 0;
        int i12 = n8VarArr[0].f8845l;
        n8 n8Var = n8VarArr[1];
        if (n8Var != null) {
            i11 = n8Var.f8845l;
        }
        return AndroidUtilities.lerp(i12, i11, this.G) + i10;
    }

    public Paint getPaint() {
        return this.f8885c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f8888r[0].e;
    }

    @Override
    public CharSequence getText() {
        return this.f8888r[0].f8847n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        n8 n8Var = this.f8888r[0];
        o8 o8Var = n8Var.v;
        org.telegram.ui.Components.c6.release(o8Var, n8Var.d);
        org.telegram.ui.Components.c6.release(o8Var, n8Var.f8840f);
        if (n8Var.h == null) {
            return;
        }
        while (true) {
            l8[] l8VarArr = n8Var.h;
            if (i10 < l8VarArr.length) {
                l8 l8Var = l8VarArr[i10];
                if (l8Var != null) {
                    org.telegram.ui.Components.c6.release(o8Var, l8Var.f8765a);
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
        n8[] n8VarArr = this.f8888r;
        n8VarArr[0].b(canvas2, 1.0f - this.G);
        n8 n8Var = n8VarArr[1];
        if (n8Var != null) {
            n8Var.b(canvas2, this.G);
        }
        if (this.v != null) {
            float scrollY = this.h + this.J.getScrollY();
            int clamp = (int) ((1.0f - Utilities.clamp(this.f8890w / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f8886f;
            paint.setAlpha(clamp);
            Paint paint2 = this.e;
            paint2.setAlpha(clamp);
            this.d.setAlpha(clamp);
            canvas2.save();
            canvas2.translate(this.f8887n - AndroidUtilities.dp(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(32.0f), this.v.getHeight() + this.F, paint);
            canvas2.restore();
            canvas2.drawRect(this.f8887n - AndroidUtilities.dp(16.0f), scrollY, getMeasuredWidth(), this.v.getHeight() + scrollY + this.F, paint2);
            canvas2.save();
            canvas2.translate(this.f8887n, scrollY);
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
        int i13 = this.f8889s;
        n8[] n8VarArr = this.f8888r;
        int i14 = 0;
        if (i13 != i12) {
            this.f8889s = i12;
            int max = Math.max(0, View.MeasureSpec.getSize(i10) - (this.E * 2));
            n8VarArr[0].e(max);
            n8 n8Var = n8VarArr[1];
            if (n8Var != null) {
                n8Var.e(max);
            }
        }
        int i15 = this.F * 2;
        int i16 = n8VarArr[0].f8845l;
        n8 n8Var2 = n8VarArr[1];
        if (n8Var2 != null) {
            i14 = n8Var2.f8845l;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(i16, i14, this.G) + i15, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: di.o8.onTouchEvent(android.view.MotionEvent):boolean");
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
        n8 n8Var;
        k8 k8Var;
        k8 k8Var2;
        k8 k8Var3;
        k8 k8Var4;
        n8[] n8VarArr = this.f8888r;
        n8 n8Var2 = n8VarArr[0];
        if ((n8Var2 != null && (n8Var2.f8852s == drawable || (((k8Var3 = n8Var2.f8848o) != null && k8Var3.f8734j == drawable) || ((k8Var4 = n8Var2.f8849p) != null && k8Var4.f8734j == drawable)))) || ((n8Var = n8VarArr[1]) != null && (n8Var.f8852s == drawable || (((k8Var = n8Var.f8848o) != null && k8Var.f8734j == drawable) || ((k8Var2 = n8Var.f8849p) != null && k8Var2.f8734j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
