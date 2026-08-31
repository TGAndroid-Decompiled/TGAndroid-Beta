package oh;

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
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.pr;
public final class z7 extends View implements v9 {
    public int B;
    public int C;
    public float D;
    public boolean E;
    public ValueAnimator F;
    public final a8 G;
    public final PorterDuffColorFilter f17997a;
    public boolean f17998b;
    public final TextPaint f17999c;
    public final TextPaint d;
    public final Paint f18000e;
    public final Paint f18001f;
    public float h;
    public float f18002n;
    public final y7[] f18003r;
    public int f18004s;
    public StaticLayout v;
    public float f18005w;
    public boolean f18006x;
    public final boolean f18007y;

    public z7(a8 a8Var, Context context) {
        super(context);
        this.G = a8Var;
        TextPaint textPaint = new TextPaint(1);
        this.f17999c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.f18000e = paint;
        Paint paint2 = new Paint(1);
        this.f18001f = paint2;
        this.f18003r = r7;
        this.f18004s = 0;
        new Path();
        this.f18007y = true;
        this.E = false;
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
        this.f17997a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(z7 z7Var, TextPaint textPaint, CharSequence charSequence, int i10) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setBreakStrategy(0).setHyphenationFrequency(0);
            if (LocaleController.isRTL) {
                alignment = lw0.a();
            } else {
                Layout.Alignment[] alignmentArr = lw0.f28837a;
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

    public final void b(CharSequence charSequence, v7 v7Var, v7 v7Var2, boolean z4, boolean z10) {
        if (charSequence == null) {
            charSequence = "";
        }
        y7[] y7VarArr = this.f18003r;
        if (MediaDataController.stringsEqual(y7VarArr[0].f17975n, charSequence)) {
            y7 y7Var = y7VarArr[0];
            if (y7Var.f17976o == v7Var && y7Var.f17977p == v7Var2) {
                y7Var.f17978q = z4;
                invalidate();
                return;
            }
        }
        this.f18006x = false;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.E = false;
        if (z10) {
            if (y7VarArr[1] == null) {
                y7VarArr[1] = new y7(this);
            }
            y7 y7Var2 = y7VarArr[1];
            y7 y7Var3 = y7VarArr[0];
            y7Var2.g(y7Var3.f17975n, y7Var3.f17976o, y7Var3.f17977p);
            y7 y7Var4 = y7VarArr[1];
            y7 y7Var5 = y7VarArr[0];
            y7Var4.f17978q = y7Var5.f17978q;
            y7Var4.f17979r.d(y7Var5.f17979r.f33725c, true);
            y7VarArr[0].g(charSequence, v7Var, v7Var2);
            y7 y7Var6 = y7VarArr[0];
            y7Var6.f17978q = z4;
            y7Var6.f17979r.d(0.0f, true);
            this.D = 1.0f;
            ValueAnimator valueAnimator2 = this.F;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.E = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, 0.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new f5(this, 2));
            this.F.addListener(new dg.l0(this, 25));
            this.F.setDuration(180L);
            this.F.setInterpolator(pr.f30184g);
            this.F.start();
            return;
        }
        y7VarArr[0].g(charSequence, v7Var, v7Var2);
        y7VarArr[0].f17978q = z4;
        invalidate();
        this.D = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: oh.z7.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i10 = this.C * 2;
        y7[] y7VarArr = this.f18003r;
        int i11 = 0;
        int i12 = y7VarArr[0].f17973l;
        y7 y7Var = y7VarArr[1];
        if (y7Var != null) {
            i11 = y7Var.f17973l;
        }
        return AndroidUtilities.lerp(i12, i11, this.D) + i10;
    }

    public Paint getPaint() {
        return this.f17999c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f18003r[0].f17967e;
    }

    @Override
    public CharSequence getText() {
        return this.f18003r[0].f17975n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        y7 y7Var = this.f18003r[0];
        z7 z7Var = y7Var.v;
        org.telegram.ui.Components.u5.release(z7Var, y7Var.d);
        org.telegram.ui.Components.u5.release(z7Var, y7Var.f17968f);
        if (y7Var.h == null) {
            return;
        }
        while (true) {
            w7[] w7VarArr = y7Var.h;
            if (i10 < w7VarArr.length) {
                w7 w7Var = w7VarArr[i10];
                if (w7Var != null) {
                    org.telegram.ui.Components.u5.release(z7Var, w7Var.f17906a);
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
        y7[] y7VarArr = this.f18003r;
        y7VarArr[0].b(canvas2, 1.0f - this.D);
        y7 y7Var = y7VarArr[1];
        if (y7Var != null) {
            y7Var.b(canvas2, this.D);
        }
        if (this.v != null) {
            float scrollY = this.h + this.G.getScrollY();
            int clamp = (int) ((1.0f - Utilities.clamp(this.f18005w / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f18001f;
            paint.setAlpha(clamp);
            Paint paint2 = this.f18000e;
            paint2.setAlpha(clamp);
            this.d.setAlpha(clamp);
            canvas2.save();
            canvas2.translate(this.f18002n - AndroidUtilities.dp(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(32.0f), this.v.getHeight() + this.C, paint);
            canvas2.restore();
            canvas2.drawRect(this.f18002n - AndroidUtilities.dp(16.0f), scrollY, getMeasuredWidth(), this.v.getHeight() + scrollY + this.C, paint2);
            canvas2.save();
            canvas2.translate(this.f18002n, scrollY);
            this.v.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = (i11 + i10) << 16;
        this.B = AndroidUtilities.dp(16.0f);
        this.C = AndroidUtilities.dp(8.0f);
        int i13 = this.f18004s;
        y7[] y7VarArr = this.f18003r;
        int i14 = 0;
        if (i13 != i12) {
            this.f18004s = i12;
            int max = Math.max(0, View.MeasureSpec.getSize(i10) - (this.B * 2));
            y7VarArr[0].e(max);
            y7 y7Var = y7VarArr[1];
            if (y7Var != null) {
                y7Var.e(max);
            }
        }
        int i15 = this.C * 2;
        int i16 = y7VarArr[0].f17973l;
        y7 y7Var2 = y7VarArr[1];
        if (y7Var2 != null) {
            i14 = y7Var2.f17973l;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(i16, i14, this.D) + i15, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: oh.z7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setPressed(boolean z4) {
        boolean z10;
        if (z4 != isPressed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        super.setPressed(z4);
        if (z10) {
            invalidate();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.G.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        y7 y7Var;
        v7 v7Var;
        v7 v7Var2;
        v7 v7Var3;
        v7 v7Var4;
        y7[] y7VarArr = this.f18003r;
        y7 y7Var2 = y7VarArr[0];
        if ((y7Var2 != null && (y7Var2.f17980s == drawable || (((v7Var3 = y7Var2.f17976o) != null && v7Var3.f17864j == drawable) || ((v7Var4 = y7Var2.f17977p) != null && v7Var4.f17864j == drawable)))) || ((y7Var = y7VarArr[1]) != null && (y7Var.f17980s == drawable || (((v7Var = y7Var.f17976o) != null && v7Var.f17864j == drawable) || ((v7Var2 = y7Var.f17977p) != null && v7Var2.f17864j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
