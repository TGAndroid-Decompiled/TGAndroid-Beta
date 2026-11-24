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
public final class k5b extends View implements okb {
    public final boolean E;
    public int F;
    public int G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public final l5b K;
    public final PorterDuffColorFilter a;
    public boolean b;
    public final TextPaint c;
    public final TextPaint d;
    public final Paint e;
    public final Paint f;
    public float h;
    public float n;
    public final j5b[] r;
    public int s;
    public StaticLayout w;
    public float x;
    public boolean y;

    public k5b(l5b l5bVar, Context context) {
        super(context);
        this.K = l5bVar;
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
        j5b[] j5bVarArr = {new j5b(this), null};
        textPaint.setColor(-1);
        textPaint.linkColor = -1;
        textPaint.setTextSize(gm.L(15.0f));
        textPaint2.setColor(-1);
        textPaint2.setTypeface(gm.o());
        textPaint2.setTextSize(gm.L(16.0f));
        paint.setColor(-16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(new LinearGradient(0.0f, 0.0f, gm.L(16.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(int i, TextPaint textPaint, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setBreakStrategy(0).setHyphenationFrequency(0);
            if (jb6.a0) {
                alignment = oya.a();
            } else {
                Layout.Alignment[] alignmentArr = oya.a;
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

    public final void b(CharSequence charSequence, g5b g5bVar, g5b g5bVar2, boolean z, boolean z2) {
        boolean z3;
        if (charSequence == null) {
            charSequence = "";
        }
        j5b[] j5bVarArr = this.r;
        CharSequence charSequence2 = j5bVarArr[0].n;
        Pattern pattern = hs6.U1;
        if (charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) {
            z3 = false;
        } else {
            z3 = hs6.M(hs6.d0(z8c.t0).Y(new CharSequence[]{new SpannableStringBuilder(charSequence2)}, true, true), hs6.d0(z8c.t0).Y(new CharSequence[]{new SpannableStringBuilder(charSequence)}, true, true));
        }
        if (z3) {
            j5b j5bVar = j5bVarArr[0];
            if (j5bVar.o == g5bVar && j5bVar.p == g5bVar2) {
                j5bVar.q = z;
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
            if (j5bVarArr[1] == null) {
                j5bVarArr[1] = new j5b(this);
            }
            j5b j5bVar2 = j5bVarArr[1];
            j5b j5bVar3 = j5bVarArr[0];
            j5bVar2.g(j5bVar3.n, j5bVar3.o, j5bVar3.p);
            j5b j5bVar4 = j5bVarArr[1];
            j5b j5bVar5 = j5bVarArr[0];
            j5bVar4.q = j5bVar5.q;
            j5bVar4.r.e(true, j5bVar5.r.c);
            j5bVarArr[0].g(charSequence, g5bVar, g5bVar2);
            j5b j5bVar6 = j5bVarArr[0];
            j5bVar6.q = z;
            j5bVar6.r.e(true, 0.0f);
            this.H = 1.0f;
            ValueAnimator valueAnimator2 = this.J;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.I = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, 0.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new rha(this, (byte) 16));
            this.J.addListener(new c39(this, (byte) 29));
            this.J.setDuration(180L);
            this.J.setInterpolator(d53.g);
            this.J.start();
            return;
        }
        j5bVarArr[0].g(charSequence, g5bVar, g5bVar2);
        j5bVarArr[0].q = z;
        invalidate();
        this.H = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k5b.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i = this.G << 1;
        j5b[] j5bVarArr = this.r;
        int i2 = 0;
        int i3 = j5bVarArr[0].l;
        j5b j5bVar = j5bVarArr[1];
        if (j5bVar != null) {
            i2 = j5bVar.l;
        }
        return gm.U1(this.H, i3, i2) + i;
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
        j5b j5bVar = this.r[0];
        k5b k5bVar = j5bVar.v;
        gn.release(k5bVar, j5bVar.d);
        gn.release(k5bVar, j5bVar.f);
        if (j5bVar.h == null) {
            return;
        }
        while (true) {
            h5b[] h5bVarArr = j5bVar.h;
            if (i < h5bVarArr.length) {
                h5b h5bVar = h5bVarArr[i];
                if (h5bVar != null) {
                    gn.release(k5bVar, h5bVar.a);
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
        j5b[] j5bVarArr = this.r;
        j5bVarArr[0].b(canvas2, 1.0f - this.H);
        j5b j5bVar = j5bVarArr[1];
        if (j5bVar != null) {
            j5bVar.b(canvas2, this.H);
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
            canvas2.translate(this.n - gm.L(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, gm.L(32.0f), this.w.getHeight() + this.G, paint);
            canvas2.restore();
            canvas2.drawRect(this.n - gm.L(16.0f), scrollY, getMeasuredWidth(), this.w.getHeight() + scrollY + this.G, paint2);
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
        this.F = gm.L(16.0f);
        this.G = gm.L(8.0f);
        int i4 = this.s;
        j5b[] j5bVarArr = this.r;
        int i5 = 0;
        if (i4 != i3) {
            this.s = i3;
            int max = Math.max(0, View.MeasureSpec.getSize(i) - (this.F << 1));
            j5bVarArr[0].e(max);
            j5b j5bVar = j5bVarArr[1];
            if (j5bVar != null) {
                j5bVar.e(max);
            }
        }
        int i6 = this.G << 1;
        int i7 = j5bVarArr[0].l;
        j5b j5bVar2 = j5bVarArr[1];
        if (j5bVar2 != null) {
            i5 = j5bVar2.l;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.U1(this.H, i7, i5) + i6, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k5b.onTouchEvent(android.view.MotionEvent):boolean");
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
        j5b j5bVar;
        g5b g5bVar;
        g5b g5bVar2;
        g5b g5bVar3;
        g5b g5bVar4;
        j5b[] j5bVarArr = this.r;
        j5b j5bVar2 = j5bVarArr[0];
        if ((j5bVar2 != null && (j5bVar2.s == drawable || (((g5bVar3 = j5bVar2.o) != null && g5bVar3.j == drawable) || ((g5bVar4 = j5bVar2.p) != null && g5bVar4.j == drawable)))) || ((j5bVar = j5bVarArr[1]) != null && (j5bVar.s == drawable || (((g5bVar = j5bVar.o) != null && g5bVar.j == drawable) || ((g5bVar2 = j5bVar.p) != null && g5bVar2.j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
