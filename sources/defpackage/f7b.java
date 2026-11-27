package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
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
public final class f7b extends View implements imb {
    public final boolean E;
    public int F;
    public int G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public final g7b K;
    public final PorterDuffColorFilter a;
    public boolean b;
    public final TextPaint c;
    public final TextPaint d;
    public final Paint e;
    public final Paint f;
    public float h;
    public float n;
    public final e7b[] r;
    public int s;
    public StaticLayout w;
    public float x;
    public boolean y;

    public f7b(g7b g7bVar, Context context) {
        super(context);
        this.K = g7bVar;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        this.r = r7;
        this.s = 0;
        this.E = true;
        this.I = false;
        e7b[] e7bVarArr = {new e7b(this), null};
        textPaint.setColor(-1);
        textPaint.linkColor = -1;
        textPaint.setTextSize(hl.L(15.0f));
        textPaint2.setColor(-1);
        textPaint2.setTypeface(hl.o());
        textPaint2.setTextSize(hl.L(16.0f));
        paint.setColor(-16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(new LinearGradient(0.0f, 0.0f, hl.L(16.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(int i, TextPaint textPaint, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setBreakStrategy(0).setHyphenationFrequency(0);
            if (ob6.a0) {
                alignment = o0b.a();
            } else {
                Layout.Alignment[] alignmentArr = o0b.a;
                if (alignmentArr.length >= 5) {
                    alignment = alignmentArr[3];
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            return hyphenationFrequency.setAlignment(alignment).build();
        }
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    public final void b(CharSequence charSequence, b7b b7bVar, b7b b7bVar2, boolean z, boolean z2) {
        boolean z3;
        if (charSequence == null) {
            charSequence = "";
        }
        e7b[] e7bVarArr = this.r;
        CharSequence charSequence2 = e7bVarArr[0].n;
        Pattern pattern = ls6.U1;
        if (charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) {
            z3 = false;
        } else {
            z3 = ls6.M(ls6.d0(yac.t0).Y(new CharSequence[]{new SpannableStringBuilder(charSequence2)}, true, true), ls6.d0(yac.t0).Y(new CharSequence[]{new SpannableStringBuilder(charSequence)}, true, true));
        }
        if (z3) {
            e7b e7bVar = e7bVarArr[0];
            if (e7bVar.o == b7bVar && e7bVar.p == b7bVar2) {
                e7bVar.q = z;
                invalidate();
                return;
            }
        }
        this.y = false;
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.I = false;
        if (z2) {
            if (e7bVarArr[1] == null) {
                e7bVarArr[1] = new e7b(this);
            }
            e7b e7bVar2 = e7bVarArr[1];
            e7b e7bVar3 = e7bVarArr[0];
            e7bVar2.g(e7bVar3.n, e7bVar3.o, e7bVar3.p);
            e7b e7bVar4 = e7bVarArr[1];
            e7b e7bVar5 = e7bVarArr[0];
            e7bVar4.q = e7bVar5.q;
            e7bVar4.r.e(true, e7bVar5.r.c);
            e7bVarArr[0].g(charSequence, b7bVar, b7bVar2);
            e7b e7bVar6 = e7bVarArr[0];
            e7bVar6.q = z;
            e7bVar6.r.e(true, 0.0f);
            this.H = 1.0f;
            ValueAnimator valueAnimator2 = this.J;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.I = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, 0.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new ija(this, (byte) 16));
            this.J.addListener(new po9(this, (byte) 26));
            this.J.setDuration(180L);
            this.J.setInterpolator(k43.g);
            this.J.start();
            return;
        }
        e7bVarArr[0].g(charSequence, b7bVar, b7bVar2);
        e7bVarArr[0].q = z;
        invalidate();
        this.H = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f7b.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i = this.G << 1;
        e7b[] e7bVarArr = this.r;
        int i2 = 0;
        int i3 = e7bVarArr[0].l;
        e7b e7bVar = e7bVarArr[1];
        if (e7bVar != null) {
            i2 = e7bVar.l;
        }
        return hl.U1(this.H, i3, i2) + i;
    }

    public Paint getPaint() {
        return this.c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.r[0].e;
    }

    @Override
    public CharSequence getText() {
        return this.r[0].n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        e7b e7bVar = this.r[0];
        f7b f7bVar = e7bVar.v;
        hm.release(f7bVar, e7bVar.d);
        hm.release(f7bVar, e7bVar.f);
        if (e7bVar.h == null) {
            return;
        }
        while (true) {
            c7b[] c7bVarArr = e7bVar.h;
            if (i < c7bVarArr.length) {
                c7b c7bVar = c7bVarArr[i];
                if (c7bVar != null) {
                    hm.release(f7bVar, c7bVar.a);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.w != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        e7b[] e7bVarArr = this.r;
        e7bVarArr[0].b(canvas2, 1.0f - this.H);
        e7b e7bVar = e7bVarArr[1];
        if (e7bVar != null) {
            e7bVar.b(canvas2, this.H);
        }
        if (this.w != null) {
            float scrollY = this.h + this.K.getScrollY();
            int i = (int) ((1.0f - Utilities.i(this.x / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f;
            paint.setAlpha(i);
            Paint paint2 = this.e;
            paint2.setAlpha(i);
            this.d.setAlpha(i);
            canvas2.save();
            canvas2.translate(this.n - hl.L(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, hl.L(32.0f), this.w.getHeight() + this.G, paint);
            canvas2.restore();
            canvas2.drawRect(this.n - hl.L(16.0f), scrollY, getMeasuredWidth(), this.w.getHeight() + scrollY + this.G, paint2);
            canvas2.save();
            canvas2.translate(this.n, scrollY);
            this.w.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = (i2 + i) << 16;
        this.F = hl.L(16.0f);
        this.G = hl.L(8.0f);
        int i4 = this.s;
        e7b[] e7bVarArr = this.r;
        int i5 = 0;
        if (i4 != i3) {
            this.s = i3;
            int max = Math.max(0, View.MeasureSpec.getSize(i) - (this.F << 1));
            e7bVarArr[0].e(max);
            e7b e7bVar = e7bVarArr[1];
            if (e7bVar != null) {
                e7bVar.e(max);
            }
        }
        int i6 = this.G << 1;
        int i7 = e7bVarArr[0].l;
        e7b e7bVar2 = e7bVarArr[1];
        if (e7bVar2 != null) {
            i5 = e7bVar2.l;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.U1(this.H, i7, i5) + i6, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f7b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setPressed(boolean z) {
        boolean z2;
        if (z != isPressed()) {
            z2 = true;
        } else {
            z2 = false;
        }
        super.setPressed(z);
        if (z2) {
            invalidate();
        }
    }

    @Override
    public void setTranslationY(float f) {
        if (getTranslationY() != f) {
            super.setTranslationY(f);
            this.K.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        e7b e7bVar;
        b7b b7bVar;
        b7b b7bVar2;
        b7b b7bVar3;
        b7b b7bVar4;
        e7b[] e7bVarArr = this.r;
        e7b e7bVar2 = e7bVarArr[0];
        if ((e7bVar2 != null && (e7bVar2.s == drawable || (((b7bVar3 = e7bVar2.o) != null && b7bVar3.j == drawable) || ((b7bVar4 = e7bVar2.p) != null && b7bVar4.j == drawable)))) || ((e7bVar = e7bVarArr[1]) != null && (e7bVar.s == drawable || (((b7bVar = e7bVar.o) != null && b7bVar.j == drawable) || ((b7bVar2 = e7bVar.p) != null && b7bVar2.j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
