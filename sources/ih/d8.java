package ih;

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
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.rv0;
public final class d8 extends View implements w9 {
    public int A;
    public int B;
    public float C;
    public boolean D;
    public ValueAnimator E;
    public final e8 F;
    public final PorterDuffColorFilter f11330a;
    public boolean f11331b;
    public final TextPaint f11332c;
    public final TextPaint d;
    public final Paint f11333e;
    public final Paint f11334f;
    public float h;
    public float f11335n;
    public final c8[] f11336r;
    public int f11337s;
    public StaticLayout v;
    public float f11338w;
    public boolean f11339x;
    public final boolean f11340y;

    public d8(e8 e8Var, Context context) {
        super(context);
        this.F = e8Var;
        TextPaint textPaint = new TextPaint(1);
        this.f11332c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.f11333e = paint;
        Paint paint2 = new Paint(1);
        this.f11334f = paint2;
        this.f11336r = r7;
        this.f11337s = 0;
        new Path();
        this.f11340y = true;
        this.D = false;
        c8[] c8VarArr = {new c8(this), null};
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
        this.f11330a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(d8 d8Var, TextPaint textPaint, CharSequence charSequence, int i9) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i9).setBreakStrategy(0).setHyphenationFrequency(0);
            if (LocaleController.isRTL) {
                alignment = rv0.a();
            } else {
                Layout.Alignment[] alignmentArr = rv0.f32294a;
                if (alignmentArr.length >= 5) {
                    alignment = alignmentArr[3];
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            return hyphenationFrequency.setAlignment(alignment).build();
        }
        return new StaticLayout(charSequence, textPaint, i9, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    public final void b(CharSequence charSequence, z7 z7Var, z7 z7Var2, boolean z10, boolean z11) {
        if (charSequence == null) {
            charSequence = "";
        }
        c8[] c8VarArr = this.f11336r;
        if (MediaDataController.stringsEqual(c8VarArr[0].f11304n, charSequence)) {
            c8 c8Var = c8VarArr[0];
            if (c8Var.f11305o == z7Var && c8Var.f11306p == z7Var2) {
                c8Var.f11307q = z10;
                invalidate();
                return;
            }
        }
        this.f11339x = false;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.D = false;
        if (z11) {
            if (c8VarArr[1] == null) {
                c8VarArr[1] = new c8(this);
            }
            c8 c8Var2 = c8VarArr[1];
            c8 c8Var3 = c8VarArr[0];
            c8Var2.g(c8Var3.f11304n, c8Var3.f11305o, c8Var3.f11306p);
            c8 c8Var4 = c8VarArr[1];
            c8 c8Var5 = c8VarArr[0];
            c8Var4.f11307q = c8Var5.f11307q;
            c8Var4.f11308r.d(c8Var5.f11308r.f34854c, true);
            c8VarArr[0].g(charSequence, z7Var, z7Var2);
            c8 c8Var6 = c8VarArr[0];
            c8Var6.f11307q = z10;
            c8Var6.f11308r.d(0.0f, true);
            this.C = 1.0f;
            ValueAnimator valueAnimator2 = this.E;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.D = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C, 0.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new bg.b(this, 23));
            this.E.addListener(new ag.e(this, 19));
            this.E.setDuration(180L);
            this.E.setInterpolator(gr.f28845g);
            this.E.start();
            return;
        }
        c8VarArr[0].g(charSequence, z7Var, z7Var2);
        c8VarArr[0].f11307q = z10;
        invalidate();
        this.C = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: ih.d8.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i9 = this.B * 2;
        c8[] c8VarArr = this.f11336r;
        int i10 = 0;
        int i11 = c8VarArr[0].f11302l;
        c8 c8Var = c8VarArr[1];
        if (c8Var != null) {
            i10 = c8Var.f11302l;
        }
        return AndroidUtilities.lerp(i11, i10, this.C) + i9;
    }

    public Paint getPaint() {
        return this.f11332c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f11336r[0].f11296e;
    }

    @Override
    public CharSequence getText() {
        return this.f11336r[0].f11304n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = 0;
        c8 c8Var = this.f11336r[0];
        d8 d8Var = c8Var.v;
        org.telegram.ui.Components.t5.release(d8Var, c8Var.d);
        org.telegram.ui.Components.t5.release(d8Var, c8Var.f11297f);
        if (c8Var.h == null) {
            return;
        }
        while (true) {
            a8[] a8VarArr = c8Var.h;
            if (i9 < a8VarArr.length) {
                a8 a8Var = a8VarArr[i9];
                if (a8Var != null) {
                    org.telegram.ui.Components.t5.release(d8Var, a8Var.f11231a);
                }
                i9++;
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
        c8[] c8VarArr = this.f11336r;
        c8VarArr[0].b(canvas2, 1.0f - this.C);
        c8 c8Var = c8VarArr[1];
        if (c8Var != null) {
            c8Var.b(canvas2, this.C);
        }
        if (this.v != null) {
            float scrollY = this.h + this.F.getScrollY();
            int clamp = (int) ((1.0f - Utilities.clamp(this.f11338w / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f11334f;
            paint.setAlpha(clamp);
            Paint paint2 = this.f11333e;
            paint2.setAlpha(clamp);
            this.d.setAlpha(clamp);
            canvas2.save();
            canvas2.translate(this.f11335n - AndroidUtilities.dp(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(32.0f), this.v.getHeight() + this.B, paint);
            canvas2.restore();
            canvas2.drawRect(this.f11335n - AndroidUtilities.dp(16.0f), scrollY, getMeasuredWidth(), this.v.getHeight() + scrollY + this.B, paint2);
            canvas2.save();
            canvas2.translate(this.f11335n, scrollY);
            this.v.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11 = (i10 + i9) << 16;
        this.A = AndroidUtilities.dp(16.0f);
        this.B = AndroidUtilities.dp(8.0f);
        int i12 = this.f11337s;
        c8[] c8VarArr = this.f11336r;
        int i13 = 0;
        if (i12 != i11) {
            this.f11337s = i11;
            int max = Math.max(0, View.MeasureSpec.getSize(i9) - (this.A * 2));
            c8VarArr[0].e(max);
            c8 c8Var = c8VarArr[1];
            if (c8Var != null) {
                c8Var.e(max);
            }
        }
        int i14 = this.B * 2;
        int i15 = c8VarArr[0].f11302l;
        c8 c8Var2 = c8VarArr[1];
        if (c8Var2 != null) {
            i13 = c8Var2.f11302l;
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(i15, i13, this.C) + i14, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: ih.d8.onTouchEvent(android.view.MotionEvent):boolean");
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
            this.F.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        c8 c8Var;
        z7 z7Var;
        z7 z7Var2;
        z7 z7Var3;
        z7 z7Var4;
        c8[] c8VarArr = this.f11336r;
        c8 c8Var2 = c8VarArr[0];
        if ((c8Var2 != null && (c8Var2.f11309s == drawable || (((z7Var3 = c8Var2.f11305o) != null && z7Var3.f12388j == drawable) || ((z7Var4 = c8Var2.f11306p) != null && z7Var4.f12388j == drawable)))) || ((c8Var = c8VarArr[1]) != null && (c8Var.f11309s == drawable || (((z7Var = c8Var.f11305o) != null && z7Var.f12388j == drawable) || ((z7Var2 = c8Var.f11306p) != null && z7Var2.f12388j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
