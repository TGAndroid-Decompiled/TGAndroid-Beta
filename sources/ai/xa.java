package ai;

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
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.sx0;
public final class xa extends View implements org.telegram.ui.Cells.x9 {
    public int E;
    public int F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final ya J;
    public final PorterDuffColorFilter f1915a;
    public boolean f1916b;
    public final TextPaint f1917c;
    public final TextPaint d;
    public final Paint f1918e;
    public final Paint f1919f;
    public float h;
    public float f1920n;
    public final wa[] f1921r;
    public int f1922s;
    public StaticLayout v;
    public float f1923w;
    public boolean f1924x;
    public final boolean f1925y;

    public xa(ya yaVar, Context context) {
        super(context);
        this.J = yaVar;
        TextPaint textPaint = new TextPaint(1);
        this.f1917c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.f1918e = paint;
        Paint paint2 = new Paint(1);
        this.f1919f = paint2;
        this.f1921r = r7;
        this.f1922s = 0;
        new Path();
        this.f1925y = true;
        this.H = false;
        wa[] waVarArr = {new wa(this), null};
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
        this.f1915a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(xa xaVar, TextPaint textPaint, CharSequence charSequence, int i10) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setBreakStrategy(0).setHyphenationFrequency(0);
            if (LocaleController.isRTL) {
                alignment = sx0.a();
            } else {
                Layout.Alignment[] alignmentArr = sx0.f30703a;
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

    public final void b(CharSequence charSequence, ta taVar, ta taVar2, boolean z10, boolean z11) {
        if (charSequence == null) {
            charSequence = "";
        }
        wa[] waVarArr = this.f1921r;
        if (MediaDataController.stringsEqual(waVarArr[0].f1877n, charSequence)) {
            wa waVar = waVarArr[0];
            if (waVar.f1878o == taVar && waVar.f1879p == taVar2) {
                waVar.f1880q = z10;
                invalidate();
                return;
            }
        }
        this.f1924x = false;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.H = false;
        if (z11) {
            if (waVarArr[1] == null) {
                waVarArr[1] = new wa(this);
            }
            wa waVar2 = waVarArr[1];
            wa waVar3 = waVarArr[0];
            waVar2.g(waVar3.f1877n, waVar3.f1878o, waVar3.f1879p);
            wa waVar4 = waVarArr[1];
            wa waVar5 = waVarArr[0];
            waVar4.f1880q = waVar5.f1880q;
            waVar4.f1881r.d(waVar5.f1881r.f26301c, true);
            waVarArr[0].g(charSequence, taVar, taVar2);
            wa waVar6 = waVarArr[0];
            waVar6.f1880q = z10;
            waVar6.f1881r.d(0.0f, true);
            this.G = 1.0f;
            ValueAnimator valueAnimator2 = this.I;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.H = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new a(this, 13));
            this.I.addListener(new b(this, 10));
            this.I.setDuration(180L);
            this.I.setInterpolator(js.f27635g);
            this.I.start();
            return;
        }
        waVarArr[0].g(charSequence, taVar, taVar2);
        waVarArr[0].f1880q = z10;
        invalidate();
        this.G = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: ai.xa.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i10 = this.F * 2;
        wa[] waVarArr = this.f1921r;
        int i11 = 0;
        int i12 = waVarArr[0].f1875l;
        wa waVar = waVarArr[1];
        if (waVar != null) {
            i11 = waVar.f1875l;
        }
        return AndroidUtilities.lerp(i12, i11, this.G) + i10;
    }

    public Paint getPaint() {
        return this.f1917c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f1921r[0].f1869e;
    }

    @Override
    public CharSequence getText() {
        return this.f1921r[0].f1877n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        wa waVar = this.f1921r[0];
        xa xaVar = waVar.v;
        org.telegram.ui.Components.b6.release(xaVar, waVar.d);
        org.telegram.ui.Components.b6.release(xaVar, waVar.f1870f);
        if (waVar.h == null) {
            return;
        }
        while (true) {
            ua[] uaVarArr = waVar.h;
            if (i10 < uaVarArr.length) {
                ua uaVar = uaVarArr[i10];
                if (uaVar != null) {
                    org.telegram.ui.Components.b6.release(xaVar, uaVar.f1805a);
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
        wa[] waVarArr = this.f1921r;
        waVarArr[0].b(canvas2, 1.0f - this.G);
        wa waVar = waVarArr[1];
        if (waVar != null) {
            waVar.b(canvas2, this.G);
        }
        if (this.v != null) {
            float scrollY = this.h + this.J.getScrollY();
            int clamp = (int) ((1.0f - Utilities.clamp(this.f1923w / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f1919f;
            paint.setAlpha(clamp);
            Paint paint2 = this.f1918e;
            paint2.setAlpha(clamp);
            this.d.setAlpha(clamp);
            canvas2.save();
            canvas2.translate(this.f1920n - AndroidUtilities.dp(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(32.0f), this.v.getHeight() + this.F, paint);
            canvas2.restore();
            canvas2.drawRect(this.f1920n - AndroidUtilities.dp(16.0f), scrollY, getMeasuredWidth(), this.v.getHeight() + scrollY + this.F, paint2);
            canvas2.save();
            canvas2.translate(this.f1920n, scrollY);
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
        int i13 = this.f1922s;
        wa[] waVarArr = this.f1921r;
        int i14 = 0;
        if (i13 != i12) {
            this.f1922s = i12;
            int max = Math.max(0, View.MeasureSpec.getSize(i10) - (this.E * 2));
            waVarArr[0].e(max);
            wa waVar = waVarArr[1];
            if (waVar != null) {
                waVar.e(max);
            }
        }
        int i15 = this.F * 2;
        int i16 = waVarArr[0].f1875l;
        wa waVar2 = waVarArr[1];
        if (waVar2 != null) {
            i14 = waVar2.f1875l;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(i16, i14, this.G) + i15, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: ai.xa.onTouchEvent(android.view.MotionEvent):boolean");
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
        wa waVar;
        ta taVar;
        ta taVar2;
        ta taVar3;
        ta taVar4;
        wa[] waVarArr = this.f1921r;
        wa waVar2 = waVarArr[0];
        if ((waVar2 != null && (waVar2.f1882s == drawable || (((taVar3 = waVar2.f1878o) != null && taVar3.f1758j == drawable) || ((taVar4 = waVar2.f1879p) != null && taVar4.f1758j == drawable)))) || ((waVar = waVarArr[1]) != null && (waVar.f1882s == drawable || (((taVar = waVar.f1878o) != null && taVar.f1758j == drawable) || ((taVar2 = waVar.f1879p) != null && taVar2.f1758j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
