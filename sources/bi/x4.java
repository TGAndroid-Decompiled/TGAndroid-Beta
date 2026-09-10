package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.wr;
import org.telegram.ui.ql0;
public class x4 extends View {
    public boolean A0;
    public Path B0;
    public float C0;
    public Paint D0;
    public float E;
    public Paint E0;
    public final Paint F;
    public LinearGradient F0;
    public CharSequence G;
    public Matrix G0;
    public final org.telegram.ui.Components.n6 H;
    public LinearGradient H0;
    public boolean I;
    public long I0;
    public final TextPaint J;
    public final RectF J0;
    public Layout.Alignment K;
    public n90 K0;
    public StaticLayout L;
    public org.telegram.ui.Components.u5 M;
    public float N;
    public float O;
    public float P;
    public final j90 Q;
    public float R;
    public float S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final org.telegram.ui.Components.d6 W;
    public int f3875a;
    public org.telegram.ui.Cells.z f3876a0;
    public float f3877b;
    public Paint f3878b0;
    public float f3879c;
    public hj0 f3880c0;
    public long d;
    public float f3881d0;
    public boolean e;
    public int f3882e0;
    public final boolean f3883f;
    public int f3884f0;
    public int f3885g0;
    public int h;
    public boolean f3886h0;
    public float f3887i0;
    public float f3888j0;
    public int f3889k0;
    public Runnable f3890l0;
    public final ql0 m0;
    public Drawable f3891n;
    public ValueAnimator f3892n0;
    public float f3893o0;
    public final org.telegram.ui.Components.xc f3894p0;
    public final Rect f3895q0;
    public boolean f3896r;
    public final RectF f3897r0;
    public boolean f3898s;
    public final RectF f3899s0;
    public final Path f3900t0;
    public float f3901u0;
    public float v;
    public float f3902v0;
    public final RectF f3903w;
    public float f3904w0;
    public float f3905x;
    public float f3906x0;
    public float f3907y;
    public boolean f3908y0;
    public boolean f3909z0;

    public x4(Context context, int i10) {
        super(context);
        this.f3877b = 0.5f;
        this.f3879c = 0.0f;
        this.d = 3500L;
        this.e = true;
        this.f3883f = true;
        this.h = -1;
        this.f3898s = true;
        this.v = AndroidUtilities.dp(8.0f);
        this.f3903w = new RectF(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(7.0f));
        this.f3905x = AndroidUtilities.dp(2.0f);
        this.f3907y = AndroidUtilities.dp(7.0f);
        this.E = AndroidUtilities.dp(6.0f);
        Paint paint = new Paint(1);
        this.F = paint;
        TextPaint textPaint = new TextPaint(1);
        this.J = textPaint;
        this.K = Layout.Alignment.ALIGN_NORMAL;
        this.Q = new j90();
        this.T = true;
        this.U = true;
        wr wrVar = wr.h;
        this.W = new org.telegram.ui.Components.d6(this, 350L, wrVar);
        this.f3882e0 = AndroidUtilities.dp(2.0f);
        this.m0 = new ql0(this, 26);
        this.f3893o0 = 1.0f;
        this.f3894p0 = new org.telegram.ui.Components.xc(this, 2.0f, 5.0f);
        this.f3895q0 = new Rect();
        this.f3897r0 = new RectF();
        this.f3899s0 = new RectF();
        this.f3900t0 = new Path();
        this.f3909z0 = true;
        this.J0 = new RectF();
        this.f3875a = i10;
        paint.setColor(-433575896);
        paint.setPathEffect(new CornerPathEffect(this.v));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, false, false);
        this.H = n6Var;
        n6Var.k(0.4f, 320L, wrVar);
        n6Var.setCallback(this);
        t(14.0f);
        n6Var.r(-1);
        textPaint.setColor(-1);
    }

    public static int a(CharSequence charSequence, TextPaint textPaint) {
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return Integer.MAX_VALUE;
        }
        int length = charSequence.length() / 2;
        float f7 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = Float.MAX_VALUE;
        int i10 = 0;
        int i11 = -1;
        while (i10 < 10) {
            while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                length += i11;
            }
            f10 = g(charSequence.subSequence(0, length), textPaint);
            f11 = g(AndroidUtilities.getTrimmedString(charSequence.subSequence(length, charSequence.length())), textPaint);
            if (f10 != f7 || f11 != f12) {
                if (f10 < f11) {
                    length++;
                    i11 = 1;
                } else {
                    length--;
                    i11 = -1;
                }
                if (length <= 0 || length >= charSequence.length()) {
                    break;
                }
                i10++;
                f7 = f10;
                f12 = f11;
            } else {
                break;
            }
        }
        return (int) Math.ceil(Math.max(f10, f11));
    }

    public static java.lang.CharSequence b(java.lang.CharSequence r12, android.text.TextPaint r13) {
        throw new UnsupportedOperationException("Method not decompiled: bi.x4.b(java.lang.CharSequence, android.text.TextPaint):java.lang.CharSequence");
    }

    public static float g(CharSequence charSequence, TextPaint textPaint) {
        float f7 = 0.0f;
        if (charSequence == null) {
            return 0.0f;
        }
        if (!(charSequence instanceof Spanned)) {
            return textPaint.measureText(charSequence.toString());
        }
        Spanned spanned = (Spanned) charSequence;
        s51[] s51VarArr = (s51[]) spanned.getSpans(0, charSequence.length(), s51.class);
        ReplacementSpan[] replacementSpanArr = (ReplacementSpan[]) spanned.getSpans(0, charSequence.length(), ReplacementSpan.class);
        int i10 = 0;
        int i11 = 0;
        while (i10 < replacementSpanArr.length) {
            ReplacementSpan replacementSpan = replacementSpanArr[i10];
            int spanStart = spanned.getSpanStart(replacementSpan);
            int spanEnd = spanned.getSpanEnd(replacementSpan);
            CharSequence charSequence2 = charSequence;
            TextPaint textPaint2 = textPaint;
            i11 = (int) (Math.max(0.0f, replacementSpan.getSize(textPaint2, charSequence2, spanStart, spanEnd, textPaint.getFontMetricsInt()) - textPaint2.measureText(spanned, spanStart, spanEnd)) + i11);
            i10++;
            textPaint = textPaint2;
            charSequence = charSequence2;
        }
        CharSequence charSequence3 = charSequence;
        TextPaint textPaint3 = textPaint;
        if (s51VarArr != null && s51VarArr.length != 0) {
            int i12 = 0;
            for (int i13 = 0; i13 < s51VarArr.length; i13++) {
                int spanStart2 = spanned.getSpanStart(s51VarArr[i13]);
                int spanEnd2 = spanned.getSpanEnd(s51VarArr[i13]);
                int max = Math.max(i12, spanStart2);
                if (max - i12 > 0) {
                    f7 += textPaint3.measureText(spanned, i12, max);
                }
                i12 = Math.max(max, spanEnd2);
                if (i12 - max > 0) {
                    Typeface typeface = textPaint3.getTypeface();
                    textPaint3.setTypeface(s51VarArr[i13].f26954a);
                    textPaint3.setTypeface(typeface);
                    f7 = textPaint3.measureText(spanned, max, i12) + f7;
                }
            }
            int max2 = Math.max(i12, charSequence3.length());
            if (max2 - i12 > 0) {
                f7 += textPaint3.measureText(spanned, i12, max2);
            }
            return f7 + i11;
        }
        return textPaint3.measureText(charSequence3.toString()) + i11;
    }

    private int getTextMaxWidth() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        RectF rectF = this.f3903w;
        int i10 = measuredWidth - ((int) (rectF.left + rectF.right));
        int i11 = this.h;
        if (i11 > 0) {
            i10 = Math.min(i11, i10);
        }
        return Math.max(0, i10);
    }

    public void c(Canvas canvas, float f7) {
        int i10 = this.f3889k0;
        Paint paint = this.F;
        if (i10 != 0) {
            paint.setShadowLayer(this.f3887i0, 0.0f, this.f3888j0, org.telegram.ui.ActionBar.j6.l1(f7, i10));
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f7));
        Path path = this.f3900t0;
        canvas.drawPath(path, paint);
        paint.setAlpha(alpha);
        if (this.A0) {
            int dp = AndroidUtilities.dp(64.0f);
            this.G0.reset();
            this.G0.postTranslate(this.f3897r0.left + (((this.f3904w0 * 4.0f) + (dp * 2)) * (((float) ((System.currentTimeMillis() - this.I0) % 4000)) / 4000.0f)) + (-dp), 0.0f);
            this.F0.setLocalMatrix(this.G0);
            this.H0.setLocalMatrix(this.G0);
            canvas.drawPath(path, this.D0);
            canvas.drawPath(this.B0, this.E0);
            invalidate();
        }
    }

    public final void d(Path path, float f7, float f10, float f11, RectF rectF, Rect rect) {
        float f12;
        float f13 = f7 / 2.0f;
        float f14 = f10 / 2.0f;
        float min = Math.min(this.v, Math.min(f13, f14));
        int i10 = this.f3875a;
        if (i10 != 1 && i10 != 3) {
            float clamp = Utilities.clamp(AndroidUtilities.lerp(getPaddingTop(), getMeasuredHeight() - getPaddingBottom(), this.f3877b) + this.f3879c, getMeasuredHeight() - getPaddingBottom(), getPaddingTop());
            float min2 = Math.min(Math.max(getPaddingTop(), clamp - f14) + f10, getMeasuredHeight() - getPaddingBottom());
            float f15 = min2 - f10;
            float f16 = this.f3907y;
            f12 = Utilities.clamp(clamp, (min2 - min) - f16, f15 + min + f16);
            if (this.f3875a == 0) {
                rectF.set(getPaddingLeft() + this.E, f15, getPaddingLeft() + this.E + f7, min2);
            } else {
                rectF.set(((getMeasuredWidth() - getPaddingRight()) - this.E) - f7, f15, (getMeasuredWidth() - getPaddingRight()) - this.E, min2);
            }
        } else {
            float clamp2 = Utilities.clamp(AndroidUtilities.lerp(getPaddingLeft(), getMeasuredWidth() - getPaddingRight(), this.f3877b) + this.f3879c, getMeasuredWidth() - getPaddingRight(), getPaddingLeft());
            float min3 = Math.min(Math.max(getPaddingLeft(), clamp2 - f13) + f7, getMeasuredWidth() - getPaddingRight());
            float f17 = min3 - f7;
            float f18 = this.f3907y;
            float clamp3 = Utilities.clamp(clamp2, (min3 - min) - f18, f17 + min + f18);
            if (this.f3875a == 1) {
                rectF.set(f17, getPaddingTop() + this.E, min3, getPaddingTop() + this.E + f10);
            } else {
                rectF.set(f17, ((getMeasuredHeight() - this.E) - getPaddingBottom()) - f10, min3, (getMeasuredHeight() - this.E) - getPaddingBottom());
            }
            f12 = clamp3;
        }
        float f19 = -f11;
        rectF.inset(f19, f19);
        if (rect != null) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        path.rewind();
        boolean z10 = this.f3898s;
        RectF rectF2 = this.J0;
        if (z10) {
            path.moveTo(rectF.left, rectF.bottom);
        } else {
            float f20 = rectF.left;
            float f21 = rectF.bottom;
            float f22 = min * 2.0f;
            rectF2.set(f20, f21 - f22, f22 + f20, f21);
            path.arcTo(rectF2, 90.0f, 90.0f);
        }
        if (this.f3875a == 0) {
            path.lineTo(rectF.left, this.f3907y + f12 + AndroidUtilities.dp(2.0f));
            path.lineTo(rectF.left, this.f3907y + f12);
            path.lineTo(rectF.left - this.E, AndroidUtilities.dp(1.0f) + f12);
            float f23 = rectF.left - this.E;
            this.f3901u0 = f23;
            this.f3902v0 = f12;
            path.lineTo(f23, f12 - AndroidUtilities.dp(1.0f));
            path.lineTo(rectF.left, f12 - this.f3907y);
            path.lineTo(rectF.left, (f12 - this.f3907y) - AndroidUtilities.dp(2.0f));
            if (rect != null) {
                rect.left = (int) (rect.left - this.E);
            }
        }
        if (this.f3898s) {
            path.lineTo(rectF.left, rectF.top);
        } else {
            float f24 = rectF.left;
            float f25 = rectF.top;
            float f26 = min * 2.0f;
            rectF2.set(f24, f25, f24 + f26, f26 + f25);
            path.arcTo(rectF2, 180.0f, 90.0f);
        }
        if (this.f3875a == 1) {
            path.lineTo((f12 - this.f3907y) - AndroidUtilities.dp(2.0f), rectF.top);
            path.lineTo(f12 - this.f3907y, rectF.top);
            path.lineTo(f12 - AndroidUtilities.dp(1.0f), rectF.top - this.E);
            this.f3901u0 = f12;
            this.f3902v0 = rectF.top - this.E;
            path.lineTo(AndroidUtilities.dp(1.0f) + f12, rectF.top - this.E);
            path.lineTo(this.f3907y + f12, rectF.top);
            path.lineTo(this.f3907y + f12 + AndroidUtilities.dp(2.0f), rectF.top);
            if (rect != null) {
                rect.top = (int) (rect.top - this.E);
            }
        }
        if (this.f3898s) {
            path.lineTo(rectF.right, rectF.top);
        } else {
            float f27 = rectF.right;
            float f28 = min * 2.0f;
            float f29 = rectF.top;
            rectF2.set(f27 - f28, f29, f27, f28 + f29);
            path.arcTo(rectF2, 270.0f, 90.0f);
        }
        if (this.f3875a == 2) {
            path.lineTo(rectF.right, (f12 - this.f3907y) - AndroidUtilities.dp(2.0f));
            path.lineTo(rectF.right, f12 - this.f3907y);
            path.lineTo(rectF.right + this.E, f12 - AndroidUtilities.dp(1.0f));
            float f30 = rectF.right + this.E;
            this.f3901u0 = f30;
            this.f3902v0 = f12;
            path.lineTo(f30, AndroidUtilities.dp(1.0f) + f12);
            path.lineTo(rectF.right, this.f3907y + f12);
            path.lineTo(rectF.right, this.f3907y + f12 + AndroidUtilities.dp(2.0f));
            if (rect != null) {
                rect.right = (int) (rect.right + this.E);
            }
        }
        if (this.f3898s) {
            path.lineTo(rectF.right, rectF.bottom);
        } else {
            float f31 = rectF.right;
            float f32 = min * 2.0f;
            float f33 = rectF.bottom;
            rectF2.set(f31 - f32, f33 - f32, f31, f33);
            path.arcTo(rectF2, 0.0f, 90.0f);
        }
        if (this.f3875a == 3) {
            path.lineTo(this.f3907y + f12 + AndroidUtilities.dp(2.0f), rectF.bottom);
            path.lineTo(this.f3907y + f12, rectF.bottom);
            path.lineTo(AndroidUtilities.dp(1.0f) + f12, rectF.bottom + this.E);
            this.f3901u0 = f12;
            this.f3902v0 = rectF.bottom + this.E;
            path.lineTo(f12 - AndroidUtilities.dp(1.0f), rectF.bottom + this.E);
            path.lineTo(f12 - this.f3907y, rectF.bottom);
            path.lineTo((f12 - this.f3907y) - AndroidUtilities.dp(2.0f), rectF.bottom);
            if (rect != null) {
                rect.bottom = (int) (rect.bottom + this.E);
            }
        }
        path.close();
        this.f3908y0 = true;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        float d;
        float f7;
        RectF rectF;
        float f10;
        float f11;
        float f12;
        x4 x4Var;
        float f13;
        Canvas canvas2;
        int paddingTop;
        int paddingRight;
        if (!this.I || this.L != null) {
            if (this.V && !this.f3909z0) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e = this.W.e(z10);
            if (this.f3909z0) {
                this.f3909z0 = false;
                invalidate();
            }
            if (e <= 0.0f) {
                return;
            }
            boolean z11 = this.I;
            org.telegram.ui.Components.n6 n6Var = this.H;
            if (z11) {
                d = this.O;
            } else {
                d = n6Var.d();
            }
            if (this.I) {
                f7 = this.P;
            } else {
                f7 = n6Var.e;
            }
            if (this.f3896r) {
                if (this.f3891n == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                    this.f3891n = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
                }
                d += this.f3905x + this.f3891n.getIntrinsicWidth();
                f7 = Math.max(this.f3891n.getIntrinsicHeight(), f7);
            }
            if (this.f3880c0 != null) {
                d += this.f3884f0 + this.f3882e0;
                f7 = Math.max(this.f3885g0, f7);
            }
            float f14 = d;
            RectF rectF2 = this.f3903w;
            float f15 = rectF2.left + f14 + rectF2.right;
            float f16 = rectF2.top + f7 + rectF2.bottom;
            boolean z12 = this.f3908y0;
            RectF rectF3 = this.f3897r0;
            if (z12 && Math.abs(f15 - this.f3904w0) <= 0.1f && Math.abs(f16 - this.f3906x0) <= 0.1f) {
                rectF = rectF3;
            } else {
                this.f3904w0 = f15;
                this.f3906x0 = f16;
                d(this.f3900t0, f15, f16, 0.0f, rectF3, this.f3895q0);
                rectF = rectF3;
                if (this.A0) {
                    d(this.B0, f15, f16, this.C0, this.f3899s0, null);
                }
            }
            if (this.f3883f) {
                f10 = e;
            } else {
                f10 = 1.0f;
            }
            canvas.save();
            if (e < 1.0f && this.e) {
                float lerp = AndroidUtilities.lerp(0.75f, 1.0f, e);
                canvas.scale(lerp, lerp, this.f3901u0, this.f3902v0);
            }
            float a2 = this.f3894p0.a(0.025f);
            if (a2 != 1.0f) {
                canvas.scale(a2, a2, this.f3901u0, this.f3902v0);
            }
            if (this.f3893o0 != 1.0f) {
                int i10 = this.f3875a;
                int i11 = -1;
                if (i10 != 3 && i10 != 1) {
                    if (i10 == 0) {
                        paddingRight = getPaddingLeft();
                    } else {
                        paddingRight = getPaddingRight();
                    }
                    float max = (this.f3893o0 - 1.0f) * Math.max(paddingRight, AndroidUtilities.dp(24.0f));
                    if (this.f3875a != 0) {
                        i11 = 1;
                    }
                    canvas.translate(max * i11, 0.0f);
                } else {
                    if (i10 == 3) {
                        paddingTop = getPaddingBottom();
                    } else {
                        paddingTop = getPaddingTop();
                    }
                    float max2 = (this.f3893o0 - 1.0f) * Math.max(paddingTop, AndroidUtilities.dp(24.0f));
                    if (this.f3875a != 1) {
                        i11 = 1;
                    }
                    canvas.translate(0.0f, max2 * i11);
                }
            }
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(rectF);
            float f17 = -this.E;
            rectF4.inset(f17, f17);
            c(canvas, f10);
            org.telegram.ui.Cells.z zVar = this.f3876a0;
            if (zVar != null) {
                zVar.setAlpha((int) (f10 * 255.0f));
                this.f3876a0.setBounds(this.f3895q0);
                this.f3876a0.draw(canvas);
            }
            float f18 = ((rectF.top + rectF2.top) + (rectF.bottom - rectF2.bottom)) / 2.0f;
            hj0 hj0Var = this.f3880c0;
            if (hj0Var != null) {
                if (this.f3886h0) {
                    float f19 = (rectF2.left / 2.0f) + rectF.left + 0.0f;
                    float f20 = this.f3881d0 + f18;
                    f11 = 255.0f;
                    float f21 = this.f3885g0 / 2.0f;
                    hj0Var.setBounds((int) f19, (int) (f20 - f21), (int) (f19 + this.f3884f0), (int) (f21 + f20));
                    f12 = this.f3884f0 + this.f3882e0 + 0.0f;
                } else {
                    f11 = 255.0f;
                    float f22 = (0.0f + rectF.right) - (rectF2.right / 2.0f);
                    float f23 = this.f3881d0 + f18;
                    float f24 = this.f3885g0 / 2.0f;
                    hj0Var.setBounds((int) (f22 - this.f3884f0), (int) (f23 - f24), (int) f22, (int) (f24 + f23));
                    f12 = 0.0f;
                }
                this.f3880c0.setAlpha((int) (f10 * f11));
                this.f3880c0.draw(canvas);
            } else {
                f11 = 255.0f;
                f12 = 0.0f;
            }
            if (this.I) {
                f13 = f10;
                x4Var = this;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), Math.max(getHeight(), f16), (int) (f10 * f11), 31);
                float f25 = ((f12 + rectF.left) + rectF2.left) - x4Var.N;
                x4Var.R = f25;
                float f26 = f18 - (x4Var.P / 2.0f);
                x4Var.S = f26;
                canvas2.translate(f25, f26);
                if (x4Var.Q.f(canvas2)) {
                    x4Var.invalidate();
                }
                x4Var.L.draw(canvas2);
                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas2, x4Var.L, x4Var.M, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
                canvas2.restore();
            } else {
                x4Var = this;
                f13 = f10;
                canvas2 = canvas;
                CharSequence charSequence = x4Var.G;
                if (charSequence != null) {
                    n6Var.q(charSequence, x4Var.V, true);
                    x4Var.G = null;
                }
                float f27 = rectF.left;
                float f28 = rectF2.left;
                float f29 = x4Var.P / 2.0f;
                n6Var.setBounds((int) (f12 + f27 + f28), (int) (f18 - f29), (int) (f27 + f28 + f14), (int) (f29 + f18));
                n6Var.f25442w = (int) (f13 * f11);
                n6Var.draw(canvas2);
            }
            if (x4Var.f3896r) {
                if (x4Var.f3891n == null) {
                    Drawable mutate2 = x4Var.getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                    x4Var.f3891n = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
                }
                x4Var.f3891n.setAlpha((int) (f13 * f11));
                Drawable drawable = x4Var.f3891n;
                drawable.setBounds((int) ((rectF.right - (rectF2.right * 0.66f)) - drawable.getIntrinsicWidth()), (int) (rectF.centerY() - (x4Var.f3891n.getIntrinsicHeight() / 2.0f)), (int) (rectF.right - (rectF2.right * 0.66f)), (int) ((x4Var.f3891n.getIntrinsicHeight() / 2.0f) + rectF.centerY()));
                x4Var.f3891n.draw(canvas2);
            }
            canvas2.restore();
        }
    }

    public final void e(boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.m0);
        Runnable runnable = this.f3890l0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        this.V = false;
        org.telegram.ui.Components.d6 d6Var = this.W;
        if (!z10) {
            d6Var.getClass();
            d6Var.d(0.0f, false);
        }
        invalidate();
        Runnable runnable2 = this.f3890l0;
        if (runnable2 != null) {
            AndroidUtilities.runOnUIThread(runnable2, d6Var.f22295c * ((float) d6Var.f22297g));
        }
        this.Q.d(true);
    }

    public final void f(int i10, CharSequence charSequence) {
        this.L = new StaticLayout(charSequence, this.J, i10, this.K, 1.0f, 0.0f, false);
        float f7 = i10;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < this.L.getLineCount(); i11++) {
            f7 = Math.min(f7, this.L.getLineLeft(i11));
            f10 = Math.max(f10, this.L.getLineRight(i11));
        }
        this.O = Math.max(0.0f, f10 - f7);
        this.P = this.L.getHeight();
        this.N = f7;
        this.M = org.telegram.ui.Components.y5.update(0, this, this.M, this.L);
    }

    public CharSequence getText() {
        CharSequence charSequence = this.G;
        if (charSequence != null) {
            return charSequence;
        }
        if (!this.I) {
            return this.H.f25428g;
        }
        StaticLayout staticLayout = this.L;
        if (staticLayout != null) {
            return staticLayout.getText();
        }
        return null;
    }

    public TextPaint getTextPaint() {
        if (this.I) {
            return this.J;
        }
        return this.H.f25424a;
    }

    public final void h(int i10) {
        Paint paint = this.F;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
            invalidate();
        }
    }

    public final void i() {
        this.f3896r = true;
        if (!this.I) {
            float f7 = 11.0f;
            float dp = AndroidUtilities.dp(11.0f);
            float dp2 = AndroidUtilities.dp(6.0f);
            if (this.f3896r) {
                f7 = 15.0f;
            }
            this.f3903w.set(dp, dp2, AndroidUtilities.dp(f7), AndroidUtilities.dp(7.0f));
        }
    }

    public final void j(hj0 hj0Var) {
        hj0 hj0Var2 = this.f3880c0;
        if (hj0Var2 != null) {
            hj0Var2.setCallback(null);
        }
        this.f3880c0 = hj0Var;
        hj0Var.setCallback(this);
        hj0 hj0Var3 = this.f3880c0;
        if (com.google.android.gms.internal.vision.e2.u(hj0Var3)) {
            this.d = Math.max(this.d, hj0Var3.r());
        }
        hj0 hj0Var4 = this.f3880c0;
        this.f3884f0 = hj0Var4.f23647b;
        this.f3885g0 = hj0Var4.f23649c;
        this.f3886h0 = true;
    }

    public final void k(float f7, float f10, float f11, float f12) {
        this.f3903w.set(AndroidUtilities.dpf2(f7), AndroidUtilities.dpf2(f10), AndroidUtilities.dpf2(f11), AndroidUtilities.dpf2(f12));
    }

    public final void l(float f7, float f10) {
        if (Math.abs(this.f3877b - f7) >= 1.0f || Math.abs(this.f3879c - AndroidUtilities.dp(f10)) >= 1.0f) {
            this.f3908y0 = false;
            invalidate();
        }
        this.f3877b = f7;
        this.f3879c = AndroidUtilities.dp(f10);
    }

    public final void m(float f7, float f10) {
        if (Math.abs(this.f3877b - f7) >= 1.0f || Math.abs(this.f3879c - f10) >= 1.0f) {
            this.f3908y0 = false;
            invalidate();
        }
        this.f3877b = f7;
        this.f3879c = f10;
    }

    public final void n() {
        this.h = AndroidUtilities.dp(165.0f);
    }

    public final void o(int i10) {
        this.h = i10;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.y5.release(this, this.M);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        this.f3908y0 = false;
        int textMaxWidth = getTextMaxWidth();
        org.telegram.ui.Components.n6 n6Var = this.H;
        n6Var.G = textMaxWidth;
        if (this.I) {
            CharSequence charSequence = this.G;
            if (charSequence == null) {
                StaticLayout staticLayout = this.L;
                if (staticLayout != null) {
                    charSequence = staticLayout.getText();
                } else {
                    return;
                }
            }
            StaticLayout staticLayout2 = this.L;
            if (staticLayout2 == null || staticLayout2.getWidth() != textMaxWidth) {
                f(textMaxWidth, charSequence);
            }
        } else {
            CharSequence charSequence2 = this.G;
            if (charSequence2 != null) {
                n6Var.q(charSequence2, false, true);
            }
        }
        this.G = null;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: bi.x4.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(boolean z10) {
        this.I = z10;
        RectF rectF = this.f3903w;
        float f7 = 15.0f;
        if (z10) {
            rectF.set(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
            this.f3905x = AndroidUtilities.dp(6.0f);
            return;
        }
        float dp = AndroidUtilities.dp(11.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        if (!this.f3896r) {
            f7 = 11.0f;
        }
        rectF.set(dp, dp2, AndroidUtilities.dp(f7), AndroidUtilities.dp(7.0f));
        this.f3905x = AndroidUtilities.dp(2.0f);
    }

    public final void q(float f7) {
        CornerPathEffect cornerPathEffect;
        this.v = AndroidUtilities.dp(f7);
        CornerPathEffect cornerPathEffect2 = null;
        if (this.f3898s) {
            cornerPathEffect = new CornerPathEffect(this.v);
        } else {
            cornerPathEffect = null;
        }
        this.F.setPathEffect(cornerPathEffect);
        Paint paint = this.f3878b0;
        if (paint != null) {
            if (this.f3898s) {
                cornerPathEffect2 = new CornerPathEffect(this.v);
            }
            paint.setPathEffect(cornerPathEffect2);
        }
    }

    public final void r() {
        this.f3898s = false;
        this.F.setPathEffect(null);
    }

    public final void s(CharSequence charSequence) {
        if (getMeasuredWidth() < 0) {
            this.G = charSequence;
        } else if (!this.I) {
            this.H.q(charSequence, false, true);
        } else {
            f(getTextMaxWidth(), charSequence);
        }
    }

    public final void t(float f7) {
        this.H.t(AndroidUtilities.dpf2(f7));
        this.J.setTextSize(AndroidUtilities.dpf2(f7));
    }

    public final void u() {
        if (this.V && this.U) {
            ValueAnimator valueAnimator = this.f3892n0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f3892n0 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f3892n0 = ofFloat;
            ofFloat.addUpdateListener(new ai.a(this, 5));
            this.f3892n0.addListener(new h(this, 3));
            this.f3892n0.setInterpolator(wr.f28823k);
            this.f3892n0.setDuration(300L);
            this.f3892n0.start();
        }
        AndroidUtilities.makeAccessibilityAnnouncement(getText());
        this.V = true;
        invalidate();
        ql0 ql0Var = this.m0;
        AndroidUtilities.cancelRunOnUIThread(ql0Var);
        long j3 = this.d;
        if (j3 > 0) {
            AndroidUtilities.runOnUIThread(ql0Var, j3);
        }
        Runnable runnable = this.f3890l0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.H && drawable != this.f3876a0 && drawable != this.f3880c0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
