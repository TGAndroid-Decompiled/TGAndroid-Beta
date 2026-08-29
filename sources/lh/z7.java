package lh;

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
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.jr;
public final class z7 extends View implements t9 {
    public int A;
    public int B;
    public float C;
    public boolean D;
    public ValueAnimator E;
    public final a8 F;
    public final PorterDuffColorFilter f16467a;
    public boolean f16468b;
    public final TextPaint f16469c;
    public final TextPaint d;
    public final Paint f16470e;
    public final Paint f16471f;
    public float h;
    public float f16472n;
    public final y7[] f16473r;
    public int f16474s;
    public StaticLayout v;
    public float f16475w;
    public boolean f16476x;
    public final boolean f16477y;

    public z7(a8 a8Var, Context context) {
        super(context);
        this.F = a8Var;
        TextPaint textPaint = new TextPaint(1);
        this.f16469c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.f16470e = paint;
        Paint paint2 = new Paint(1);
        this.f16471f = paint2;
        this.f16473r = r7;
        this.f16474s = 0;
        new Path();
        this.f16477y = true;
        this.D = false;
        y7[] y7VarArr = {new y7(this), null};
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
        this.f16467a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(z7 z7Var, TextPaint textPaint, CharSequence charSequence, int i10) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setBreakStrategy(0).setHyphenationFrequency(0);
            if (LocaleController.isRTL) {
                alignment = bw0.a();
            } else {
                Layout.Alignment[] alignmentArr = bw0.f27242a;
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

    public final void b(CharSequence charSequence, v7 v7Var, v7 v7Var2, boolean z10, boolean z11) {
        if (charSequence == null) {
            charSequence = "";
        }
        y7[] y7VarArr = this.f16473r;
        if (MediaDataController.stringsEqual(y7VarArr[0].f16433n, charSequence)) {
            y7 y7Var = y7VarArr[0];
            if (y7Var.f16434o == v7Var && y7Var.f16435p == v7Var2) {
                y7Var.f16436q = z10;
                invalidate();
                return;
            }
        }
        this.f16476x = false;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.D = false;
        if (z11) {
            if (y7VarArr[1] == null) {
                y7VarArr[1] = new y7(this);
            }
            y7 y7Var2 = y7VarArr[1];
            y7 y7Var3 = y7VarArr[0];
            y7Var2.g(y7Var3.f16433n, y7Var3.f16434o, y7Var3.f16435p);
            y7 y7Var4 = y7VarArr[1];
            y7 y7Var5 = y7VarArr[0];
            y7Var4.f16436q = y7Var5.f16436q;
            y7Var4.f16437r.d(y7Var5.f16437r.f27666c, true);
            y7VarArr[0].g(charSequence, v7Var, v7Var2);
            y7 y7Var6 = y7VarArr[0];
            y7Var6.f16436q = z10;
            y7Var6.f16437r.d(0.0f, true);
            this.C = 1.0f;
            ValueAnimator valueAnimator2 = this.E;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.D = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C, 0.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new d5(this, 2));
            this.E.addListener(new ag.m0(this, 24));
            this.E.setDuration(180L);
            this.E.setInterpolator(jr.f29801g);
            this.E.start();
            return;
        }
        y7VarArr[0].g(charSequence, v7Var, v7Var2);
        y7VarArr[0].f16436q = z10;
        invalidate();
        this.C = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: lh.z7.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i10 = this.B * 2;
        y7[] y7VarArr = this.f16473r;
        int i11 = 0;
        int i12 = y7VarArr[0].f16431l;
        y7 y7Var = y7VarArr[1];
        if (y7Var != null) {
            i11 = y7Var.f16431l;
        }
        return AndroidUtilities.lerp(i12, i11, this.C) + i10;
    }

    public Paint getPaint() {
        return this.f16469c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f16473r[0].f16425e;
    }

    @Override
    public CharSequence getText() {
        return this.f16473r[0].f16433n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        y7 y7Var = this.f16473r[0];
        z7 z7Var = y7Var.v;
        org.telegram.ui.Components.y5.release(z7Var, y7Var.d);
        org.telegram.ui.Components.y5.release(z7Var, y7Var.f16426f);
        if (y7Var.h == null) {
            return;
        }
        while (true) {
            w7[] w7VarArr = y7Var.h;
            if (i10 < w7VarArr.length) {
                w7 w7Var = w7VarArr[i10];
                if (w7Var != null) {
                    org.telegram.ui.Components.y5.release(z7Var, w7Var.f16369a);
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
        y7[] y7VarArr = this.f16473r;
        y7VarArr[0].b(canvas2, 1.0f - this.C);
        y7 y7Var = y7VarArr[1];
        if (y7Var != null) {
            y7Var.b(canvas2, this.C);
        }
        if (this.v != null) {
            float scrollY = this.h + this.F.getScrollY();
            int clamp = (int) ((1.0f - Utilities.clamp(this.f16475w / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f16471f;
            paint.setAlpha(clamp);
            Paint paint2 = this.f16470e;
            paint2.setAlpha(clamp);
            this.d.setAlpha(clamp);
            canvas2.save();
            canvas2.translate(this.f16472n - AndroidUtilities.dp(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(32.0f), this.v.getHeight() + this.B, paint);
            canvas2.restore();
            canvas2.drawRect(this.f16472n - AndroidUtilities.dp(16.0f), scrollY, getMeasuredWidth(), this.v.getHeight() + scrollY + this.B, paint2);
            canvas2.save();
            canvas2.translate(this.f16472n, scrollY);
            this.v.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = (i11 + i10) << 16;
        this.A = AndroidUtilities.dp(16.0f);
        this.B = AndroidUtilities.dp(8.0f);
        int i13 = this.f16474s;
        y7[] y7VarArr = this.f16473r;
        int i14 = 0;
        if (i13 != i12) {
            this.f16474s = i12;
            int max = Math.max(0, View.MeasureSpec.getSize(i10) - (this.A * 2));
            y7VarArr[0].e(max);
            y7 y7Var = y7VarArr[1];
            if (y7Var != null) {
                y7Var.e(max);
            }
        }
        int i15 = this.B * 2;
        int i16 = y7VarArr[0].f16431l;
        y7 y7Var2 = y7VarArr[1];
        if (y7Var2 != null) {
            i14 = y7Var2.f16431l;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(i16, i14, this.C) + i15, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: lh.z7.onTouchEvent(android.view.MotionEvent):boolean");
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
    public void setTranslationY(float f9) {
        if (getTranslationY() != f9) {
            super.setTranslationY(f9);
            this.F.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        y7 y7Var;
        v7 v7Var;
        v7 v7Var2;
        v7 v7Var3;
        v7 v7Var4;
        y7[] y7VarArr = this.f16473r;
        y7 y7Var2 = y7VarArr[0];
        if ((y7Var2 != null && (y7Var2.f16438s == drawable || (((v7Var3 = y7Var2.f16434o) != null && v7Var3.f16330j == drawable) || ((v7Var4 = y7Var2.f16435p) != null && v7Var4.f16330j == drawable)))) || ((y7Var = y7VarArr[1]) != null && (y7Var.f16438s == drawable || (((v7Var = y7Var.f16434o) != null && v7Var.f16330j == drawable) || ((v7Var2 = y7Var.f16435p) != null && v7Var2.f16330j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
