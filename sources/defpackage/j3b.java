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
public final class j3b extends View implements nib {
    public final boolean E;
    public int F;
    public int G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public final k3b K;
    public final PorterDuffColorFilter a;
    public boolean b;
    public final TextPaint c;
    public final TextPaint d;
    public final Paint e;
    public final Paint f;
    public float h;
    public float n;
    public final i3b[] r;
    public int s;
    public StaticLayout w;
    public float x;
    public boolean y;

    public j3b(k3b k3bVar, Context context) {
        super(context);
        this.K = k3bVar;
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
        i3b[] i3bVarArr = {new i3b(this), null};
        textPaint.setColor(-1);
        textPaint.linkColor = -1;
        textPaint.setTextSize(gl.L(15.0f));
        textPaint2.setColor(-1);
        textPaint2.setTypeface(gl.o());
        textPaint2.setTextSize(gl.L(16.0f));
        paint.setColor(-16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(new LinearGradient(0.0f, 0.0f, gl.L(16.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(int i, TextPaint textPaint, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setBreakStrategy(0).setHyphenationFrequency(0);
            if (k96.a0) {
                alignment = lwa.a();
            } else {
                Layout.Alignment[] alignmentArr = lwa.a;
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

    public final void b(CharSequence charSequence, f3b f3bVar, f3b f3bVar2, boolean z, boolean z2) {
        boolean z3;
        if (charSequence == null) {
            charSequence = "";
        }
        i3b[] i3bVarArr = this.r;
        CharSequence charSequence2 = i3bVarArr[0].n;
        Pattern pattern = hq6.U1;
        if (charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) {
            z3 = false;
        } else {
            z3 = hq6.M(hq6.d0(y6c.t0).Y(new CharSequence[]{new SpannableStringBuilder(charSequence2)}, true, true), hq6.d0(y6c.t0).Y(new CharSequence[]{new SpannableStringBuilder(charSequence)}, true, true));
        }
        if (z3) {
            i3b i3bVar = i3bVarArr[0];
            if (i3bVar.o == f3bVar && i3bVar.p == f3bVar2) {
                i3bVar.q = z;
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
            if (i3bVarArr[1] == null) {
                i3bVarArr[1] = new i3b(this);
            }
            i3b i3bVar2 = i3bVarArr[1];
            i3b i3bVar3 = i3bVarArr[0];
            i3bVar2.g(i3bVar3.n, i3bVar3.o, i3bVar3.p);
            i3b i3bVar4 = i3bVarArr[1];
            i3b i3bVar5 = i3bVarArr[0];
            i3bVar4.q = i3bVar5.q;
            i3bVar4.r.e(true, i3bVar5.r.c);
            i3bVarArr[0].g(charSequence, f3bVar, f3bVar2);
            i3b i3bVar6 = i3bVarArr[0];
            i3bVar6.q = z;
            i3bVar6.r.e(true, 0.0f);
            this.H = 1.0f;
            ValueAnimator valueAnimator2 = this.J;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.I = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, 0.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new gja(this, (byte) 14));
            this.J.addListener(new ng9(this, (byte) 27));
            this.J.setDuration(180L);
            this.J.setInterpolator(s33.g);
            this.J.start();
            return;
        }
        i3bVarArr[0].g(charSequence, f3bVar, f3bVar2);
        i3bVarArr[0].q = z;
        invalidate();
        this.H = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j3b.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i = this.G << 1;
        i3b[] i3bVarArr = this.r;
        int i2 = 0;
        int i3 = i3bVarArr[0].l;
        i3b i3bVar = i3bVarArr[1];
        if (i3bVar != null) {
            i2 = i3bVar.l;
        }
        return gl.U1(this.H, i3, i2) + i;
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
        i3b i3bVar = this.r[0];
        j3b j3bVar = i3bVar.v;
        gm.release(j3bVar, i3bVar.d);
        gm.release(j3bVar, i3bVar.f);
        if (i3bVar.h == null) {
            return;
        }
        while (true) {
            g3b[] g3bVarArr = i3bVar.h;
            if (i < g3bVarArr.length) {
                g3b g3bVar = g3bVarArr[i];
                if (g3bVar != null) {
                    gm.release(j3bVar, g3bVar.a);
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
        i3b[] i3bVarArr = this.r;
        i3bVarArr[0].b(canvas2, 1.0f - this.H);
        i3b i3bVar = i3bVarArr[1];
        if (i3bVar != null) {
            i3bVar.b(canvas2, this.H);
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
            canvas2.translate(this.n - gl.L(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, gl.L(32.0f), this.w.getHeight() + this.G, paint);
            canvas2.restore();
            canvas2.drawRect(this.n - gl.L(16.0f), scrollY, getMeasuredWidth(), this.w.getHeight() + scrollY + this.G, paint2);
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
        this.F = gl.L(16.0f);
        this.G = gl.L(8.0f);
        int i4 = this.s;
        i3b[] i3bVarArr = this.r;
        int i5 = 0;
        if (i4 != i3) {
            this.s = i3;
            int max = Math.max(0, View.MeasureSpec.getSize(i) - (this.F << 1));
            i3bVarArr[0].e(max);
            i3b i3bVar = i3bVarArr[1];
            if (i3bVar != null) {
                i3bVar.e(max);
            }
        }
        int i6 = this.G << 1;
        int i7 = i3bVarArr[0].l;
        i3b i3bVar2 = i3bVarArr[1];
        if (i3bVar2 != null) {
            i5 = i3bVar2.l;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.U1(this.H, i7, i5) + i6, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j3b.onTouchEvent(android.view.MotionEvent):boolean");
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
        i3b i3bVar;
        f3b f3bVar;
        f3b f3bVar2;
        f3b f3bVar3;
        f3b f3bVar4;
        i3b[] i3bVarArr = this.r;
        i3b i3bVar2 = i3bVarArr[0];
        if ((i3bVar2 != null && (i3bVar2.s == drawable || (((f3bVar3 = i3bVar2.o) != null && f3bVar3.j == drawable) || ((f3bVar4 = i3bVar2.p) != null && f3bVar4.j == drawable)))) || ((i3bVar = i3bVarArr[1]) != null && (i3bVar.s == drawable || (((f3bVar = i3bVar.o) != null && f3bVar.j == drawable) || ((f3bVar2 = i3bVar.p) != null && f3bVar2.j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
