package bi;

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
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.pr;
public final class da extends View implements org.telegram.ui.Cells.z9 {
    public int E;
    public int F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final ea J;
    public final PorterDuffColorFilter f2903a;
    public boolean f2904b;
    public final TextPaint f2905c;
    public final TextPaint d;
    public final Paint f2906e;
    public final Paint f2907f;
    public float h;
    public float f2908n;
    public final ca[] f2909r;
    public int f2910s;
    public StaticLayout v;
    public float f2911w;
    public boolean f2912x;
    public final boolean f2913y;

    public da(ea eaVar, Context context) {
        super(context);
        this.J = eaVar;
        TextPaint textPaint = new TextPaint(1);
        this.f2905c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.f2906e = paint;
        Paint paint2 = new Paint(1);
        this.f2907f = paint2;
        this.f2909r = r7;
        this.f2910s = 0;
        new Path();
        this.f2913y = true;
        this.H = false;
        ca[] caVarArr = {new ca(this), null};
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
        this.f2903a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(da daVar, TextPaint textPaint, CharSequence charSequence, int i10) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setBreakStrategy(0).setHyphenationFrequency(0);
            if (LocaleController.isRTL) {
                alignment = iw0.a();
            } else {
                Layout.Alignment[] alignmentArr = iw0.f27306a;
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

    public final void b(CharSequence charSequence, z9 z9Var, z9 z9Var2, boolean z10, boolean z11) {
        if (charSequence == null) {
            charSequence = "";
        }
        ca[] caVarArr = this.f2909r;
        if (MediaDataController.stringsEqual(caVarArr[0].f2862n, charSequence)) {
            ca caVar = caVarArr[0];
            if (caVar.f2863o == z9Var && caVar.f2864p == z9Var2) {
                caVar.f2865q = z10;
                invalidate();
                return;
            }
        }
        this.f2912x = false;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.H = false;
        if (z11) {
            if (caVarArr[1] == null) {
                caVarArr[1] = new ca(this);
            }
            ca caVar2 = caVarArr[1];
            ca caVar3 = caVarArr[0];
            caVar2.g(caVar3.f2862n, caVar3.f2863o, caVar3.f2864p);
            ca caVar4 = caVarArr[1];
            ca caVar5 = caVarArr[0];
            caVar4.f2865q = caVar5.f2865q;
            caVar4.f2866r.d(caVar5.f2866r.f25592c, true);
            caVarArr[0].g(charSequence, z9Var, z9Var2);
            ca caVar6 = caVarArr[0];
            caVar6.f2865q = z10;
            caVar6.f2866r.d(0.0f, true);
            this.G = 1.0f;
            ValueAnimator valueAnimator2 = this.I;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.H = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new ah.d0(this, 14));
            this.I.addListener(new ah.b(this, 13));
            this.I.setDuration(180L);
            this.I.setInterpolator(pr.f29494g);
            this.I.start();
            return;
        }
        caVarArr[0].g(charSequence, z9Var, z9Var2);
        caVarArr[0].f2865q = z10;
        invalidate();
        this.G = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: bi.da.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i10 = this.F * 2;
        ca[] caVarArr = this.f2909r;
        int i11 = 0;
        int i12 = caVarArr[0].f2860l;
        ca caVar = caVarArr[1];
        if (caVar != null) {
            i11 = caVar.f2860l;
        }
        return AndroidUtilities.lerp(i12, i11, this.G) + i10;
    }

    public Paint getPaint() {
        return this.f2905c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f2909r[0].f2854e;
    }

    @Override
    public CharSequence getText() {
        return this.f2909r[0].f2862n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        ca caVar = this.f2909r[0];
        da daVar = caVar.v;
        org.telegram.ui.Components.z5.release(daVar, caVar.d);
        org.telegram.ui.Components.z5.release(daVar, caVar.f2855f);
        if (caVar.h == null) {
            return;
        }
        while (true) {
            aa[] aaVarArr = caVar.h;
            if (i10 < aaVarArr.length) {
                aa aaVar = aaVarArr[i10];
                if (aaVar != null) {
                    org.telegram.ui.Components.z5.release(daVar, aaVar.f2800a);
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
        ca[] caVarArr = this.f2909r;
        caVarArr[0].b(canvas2, 1.0f - this.G);
        ca caVar = caVarArr[1];
        if (caVar != null) {
            caVar.b(canvas2, this.G);
        }
        if (this.v != null) {
            float scrollY = this.h + this.J.getScrollY();
            int clamp = (int) ((1.0f - Utilities.clamp(this.f2911w / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f2907f;
            paint.setAlpha(clamp);
            Paint paint2 = this.f2906e;
            paint2.setAlpha(clamp);
            this.d.setAlpha(clamp);
            canvas2.save();
            canvas2.translate(this.f2908n - AndroidUtilities.dp(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(32.0f), this.v.getHeight() + this.F, paint);
            canvas2.restore();
            canvas2.drawRect(this.f2908n - AndroidUtilities.dp(16.0f), scrollY, getMeasuredWidth(), this.v.getHeight() + scrollY + this.F, paint2);
            canvas2.save();
            canvas2.translate(this.f2908n, scrollY);
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
        int i13 = this.f2910s;
        ca[] caVarArr = this.f2909r;
        int i14 = 0;
        if (i13 != i12) {
            this.f2910s = i12;
            int max = Math.max(0, View.MeasureSpec.getSize(i10) - (this.E * 2));
            caVarArr[0].e(max);
            ca caVar = caVarArr[1];
            if (caVar != null) {
                caVar.e(max);
            }
        }
        int i15 = this.F * 2;
        int i16 = caVarArr[0].f2860l;
        ca caVar2 = caVarArr[1];
        if (caVar2 != null) {
            i14 = caVar2.f2860l;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(i16, i14, this.G) + i15, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: bi.da.onTouchEvent(android.view.MotionEvent):boolean");
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
        ca caVar;
        z9 z9Var;
        z9 z9Var2;
        z9 z9Var3;
        z9 z9Var4;
        ca[] caVarArr = this.f2909r;
        ca caVar2 = caVarArr[0];
        if ((caVar2 != null && (caVar2.f2867s == drawable || (((z9Var3 = caVar2.f2863o) != null && z9Var3.f4108j == drawable) || ((z9Var4 = caVar2.f2864p) != null && z9Var4.f4108j == drawable)))) || ((caVar = caVarArr[1]) != null && (caVar.f2867s == drawable || (((z9Var = caVar.f2863o) != null && z9Var.f4108j == drawable) || ((z9Var2 = caVar.f2864p) != null && z9Var2.f4108j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
