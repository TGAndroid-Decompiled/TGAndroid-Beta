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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ex0;
public final class r8 extends View implements org.telegram.ui.Cells.w9 {
    public int E;
    public int F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final s8 J;
    public final PorterDuffColorFilter f5930a;
    public boolean f5931b;
    public final TextPaint f5932c;
    public final TextPaint d;
    public final Paint e;
    public final Paint f5933f;
    public float h;
    public float f5934n;
    public final q8[] f5935r;
    public int f5936s;
    public StaticLayout v;
    public float f5937w;
    public boolean f5938x;
    public final boolean f5939y;

    public r8(s8 s8Var, Context context) {
        super(context);
        this.J = s8Var;
        TextPaint textPaint = new TextPaint(1);
        this.f5932c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f5933f = paint2;
        this.f5935r = r7;
        this.f5936s = 0;
        new Path();
        this.f5939y = true;
        this.H = false;
        q8[] q8VarArr = {new q8(this), null};
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
        this.f5930a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(r8 r8Var, TextPaint textPaint, CharSequence charSequence, int i10) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setBreakStrategy(0).setHyphenationFrequency(0);
            if (LocaleController.isRTL) {
                alignment = ex0.a();
            } else {
                Layout.Alignment[] alignmentArr = ex0.f26043a;
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

    public final void b(CharSequence charSequence, n8 n8Var, n8 n8Var2, boolean z10, boolean z11) {
        if (charSequence == null) {
            charSequence = "";
        }
        q8[] q8VarArr = this.f5935r;
        if (MediaDataController.stringsEqual(q8VarArr[0].f5860n, charSequence)) {
            q8 q8Var = q8VarArr[0];
            if (q8Var.f5861o == n8Var && q8Var.f5862p == n8Var2) {
                q8Var.f5863q = z10;
                invalidate();
                return;
            }
        }
        this.f5938x = false;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.H = false;
        if (z11) {
            if (q8VarArr[1] == null) {
                q8VarArr[1] = new q8(this);
            }
            q8 q8Var2 = q8VarArr[1];
            q8 q8Var3 = q8VarArr[0];
            q8Var2.g(q8Var3.f5860n, q8Var3.f5861o, q8Var3.f5862p);
            q8 q8Var4 = q8VarArr[1];
            q8 q8Var5 = q8VarArr[0];
            q8Var4.f5863q = q8Var5.f5863q;
            q8Var4.f5864r.d(q8Var5.f5864r.f26110c, true);
            q8VarArr[0].g(charSequence, n8Var, n8Var2);
            q8 q8Var6 = q8VarArr[0];
            q8Var6.f5863q = z10;
            q8Var6.f5864r.d(0.0f, true);
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
            this.I.setInterpolator(bs.f25015g);
            this.I.start();
            return;
        }
        q8VarArr[0].g(charSequence, n8Var, n8Var2);
        q8VarArr[0].f5863q = z10;
        invalidate();
        this.G = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: ci.r8.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i10 = this.F * 2;
        q8[] q8VarArr = this.f5935r;
        int i11 = 0;
        int i12 = q8VarArr[0].f5858l;
        q8 q8Var = q8VarArr[1];
        if (q8Var != null) {
            i11 = q8Var.f5858l;
        }
        return AndroidUtilities.lerp(i12, i11, this.G) + i10;
    }

    public Paint getPaint() {
        return this.f5932c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f5935r[0].e;
    }

    @Override
    public CharSequence getText() {
        return this.f5935r[0].f5860n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        q8 q8Var = this.f5935r[0];
        r8 r8Var = q8Var.v;
        org.telegram.ui.Components.a6.release(r8Var, q8Var.d);
        org.telegram.ui.Components.a6.release(r8Var, q8Var.f5853f);
        if (q8Var.h == null) {
            return;
        }
        while (true) {
            o8[] o8VarArr = q8Var.h;
            if (i10 < o8VarArr.length) {
                o8 o8Var = o8VarArr[i10];
                if (o8Var != null) {
                    org.telegram.ui.Components.a6.release(r8Var, o8Var.f5702a);
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
        q8[] q8VarArr = this.f5935r;
        q8VarArr[0].b(canvas2, 1.0f - this.G);
        q8 q8Var = q8VarArr[1];
        if (q8Var != null) {
            q8Var.b(canvas2, this.G);
        }
        if (this.v != null) {
            float scrollY = this.h + this.J.getScrollY();
            int clamp = (int) ((1.0f - Utilities.clamp(this.f5937w / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f5933f;
            paint.setAlpha(clamp);
            Paint paint2 = this.e;
            paint2.setAlpha(clamp);
            this.d.setAlpha(clamp);
            canvas2.save();
            canvas2.translate(this.f5934n - AndroidUtilities.dp(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(32.0f), this.v.getHeight() + this.F, paint);
            canvas2.restore();
            canvas2.drawRect(this.f5934n - AndroidUtilities.dp(16.0f), scrollY, getMeasuredWidth(), this.v.getHeight() + scrollY + this.F, paint2);
            canvas2.save();
            canvas2.translate(this.f5934n, scrollY);
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
        int i13 = this.f5936s;
        q8[] q8VarArr = this.f5935r;
        int i14 = 0;
        if (i13 != i12) {
            this.f5936s = i12;
            int max = Math.max(0, View.MeasureSpec.getSize(i10) - (this.E * 2));
            q8VarArr[0].e(max);
            q8 q8Var = q8VarArr[1];
            if (q8Var != null) {
                q8Var.e(max);
            }
        }
        int i15 = this.F * 2;
        int i16 = q8VarArr[0].f5858l;
        q8 q8Var2 = q8VarArr[1];
        if (q8Var2 != null) {
            i14 = q8Var2.f5858l;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(i16, i14, this.G) + i15, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: ci.r8.onTouchEvent(android.view.MotionEvent):boolean");
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
        q8 q8Var;
        n8 n8Var;
        n8 n8Var2;
        n8 n8Var3;
        n8 n8Var4;
        q8[] q8VarArr = this.f5935r;
        q8 q8Var2 = q8VarArr[0];
        if ((q8Var2 != null && (q8Var2.f5865s == drawable || (((n8Var3 = q8Var2.f5861o) != null && n8Var3.f5666j == drawable) || ((n8Var4 = q8Var2.f5862p) != null && n8Var4.f5666j == drawable)))) || ((q8Var = q8VarArr[1]) != null && (q8Var.f5865s == drawable || (((n8Var = q8Var.f5861o) != null && n8Var.f5666j == drawable) || ((n8Var2 = q8Var.f5862p) != null && n8Var2.f5666j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
