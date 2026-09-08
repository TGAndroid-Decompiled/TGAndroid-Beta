package di;

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
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.rl0;
public class f4 extends View {
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
    public final org.telegram.ui.Components.p6 H;
    public LinearGradient H0;
    public boolean I;
    public long I0;
    public final TextPaint J;
    public final RectF J0;
    public Layout.Alignment K;
    public e90 K0;
    public StaticLayout L;
    public org.telegram.ui.Components.v5 M;
    public float N;
    public float O;
    public float P;
    public final a90 Q;
    public float R;
    public float S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final org.telegram.ui.Components.e6 W;
    public int f7222a;
    public org.telegram.ui.Cells.z f7223a0;
    public float f7224b;
    public Paint f7225b0;
    public float f7226c;
    public xi0 f7227c0;
    public long d;
    public float f7228d0;
    public boolean f7229e;
    public int f7230e0;
    public final boolean f7231f;
    public int f7232f0;
    public int f7233g0;
    public int h;
    public boolean f7234h0;
    public float f7235i0;
    public float f7236j0;
    public int f7237k0;
    public Runnable f7238l0;
    public final rl0 m0;
    public Drawable f7239n;
    public ValueAnimator f7240n0;
    public float f7241o0;
    public final org.telegram.ui.Components.zc f7242p0;
    public final Rect f7243q0;
    public boolean f7244r;
    public final RectF f7245r0;
    public boolean f7246s;
    public final RectF f7247s0;
    public final Path f7248t0;
    public float f7249u0;
    public float v;
    public float f7250v0;
    public final RectF f7251w;
    public float f7252w0;
    public float f7253x;
    public float f7254x0;
    public float f7255y;
    public boolean f7256y0;
    public boolean f7257z0;

    public f4(Context context, int i10) {
        super(context);
        this.f7224b = 0.5f;
        this.f7226c = 0.0f;
        this.d = 3500L;
        this.f7229e = true;
        this.f7231f = true;
        this.h = -1;
        this.f7246s = true;
        this.v = AndroidUtilities.dp(8.0f);
        this.f7251w = new RectF(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(7.0f));
        this.f7253x = AndroidUtilities.dp(2.0f);
        this.f7255y = AndroidUtilities.dp(7.0f);
        this.E = AndroidUtilities.dp(6.0f);
        Paint paint = new Paint(1);
        this.F = paint;
        TextPaint textPaint = new TextPaint(1);
        this.J = textPaint;
        this.K = Layout.Alignment.ALIGN_NORMAL;
        this.Q = new a90();
        this.T = true;
        this.U = true;
        pr prVar = pr.h;
        this.W = new org.telegram.ui.Components.e6(this, 350L, prVar);
        this.f7230e0 = AndroidUtilities.dp(2.0f);
        this.m0 = new rl0(this, 26);
        this.f7241o0 = 1.0f;
        this.f7242p0 = new org.telegram.ui.Components.zc(this, 2.0f, 5.0f);
        this.f7243q0 = new Rect();
        this.f7245r0 = new RectF();
        this.f7247s0 = new RectF();
        this.f7248t0 = new Path();
        this.f7257z0 = true;
        this.J0 = new RectF();
        this.f7222a = i10;
        paint.setColor(-433575896);
        paint.setPathEffect(new CornerPathEffect(this.v));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(true, true, false, false);
        this.H = p6Var;
        p6Var.k(0.4f, 320L, prVar);
        p6Var.setCallback(this);
        t(14.0f);
        p6Var.r(-1);
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
        throw new UnsupportedOperationException("Method not decompiled: di.f4.b(java.lang.CharSequence, android.text.TextPaint):java.lang.CharSequence");
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
        e51[] e51VarArr = (e51[]) spanned.getSpans(0, charSequence.length(), e51.class);
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
        if (e51VarArr != null && e51VarArr.length != 0) {
            int i12 = 0;
            for (int i13 = 0; i13 < e51VarArr.length; i13++) {
                int spanStart2 = spanned.getSpanStart(e51VarArr[i13]);
                int spanEnd2 = spanned.getSpanEnd(e51VarArr[i13]);
                int max = Math.max(i12, spanStart2);
                if (max - i12 > 0) {
                    f7 += textPaint3.measureText(spanned, i12, max);
                }
                i12 = Math.max(max, spanEnd2);
                if (i12 - max > 0) {
                    Typeface typeface = textPaint3.getTypeface();
                    textPaint3.setTypeface(e51VarArr[i13].f25587a);
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
        RectF rectF = this.f7251w;
        int i10 = measuredWidth - ((int) (rectF.left + rectF.right));
        int i11 = this.h;
        if (i11 > 0) {
            i10 = Math.min(i11, i10);
        }
        return Math.max(0, i10);
    }

    public void c(Canvas canvas, float f7) {
        int i10 = this.f7237k0;
        Paint paint = this.F;
        if (i10 != 0) {
            paint.setShadowLayer(this.f7235i0, 0.0f, this.f7236j0, org.telegram.ui.ActionBar.j6.l1(f7, i10));
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f7));
        Path path = this.f7248t0;
        canvas.drawPath(path, paint);
        paint.setAlpha(alpha);
        if (this.A0) {
            int dp = AndroidUtilities.dp(64.0f);
            this.G0.reset();
            this.G0.postTranslate(this.f7245r0.left + (((this.f7252w0 * 4.0f) + (dp * 2)) * (((float) ((System.currentTimeMillis() - this.I0) % 4000)) / 4000.0f)) + (-dp), 0.0f);
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
        int i10 = this.f7222a;
        if (i10 != 1 && i10 != 3) {
            float clamp = Utilities.clamp(AndroidUtilities.lerp(getPaddingTop(), getMeasuredHeight() - getPaddingBottom(), this.f7224b) + this.f7226c, getMeasuredHeight() - getPaddingBottom(), getPaddingTop());
            float min2 = Math.min(Math.max(getPaddingTop(), clamp - f14) + f10, getMeasuredHeight() - getPaddingBottom());
            float f15 = min2 - f10;
            float f16 = this.f7255y;
            f12 = Utilities.clamp(clamp, (min2 - min) - f16, f15 + min + f16);
            if (this.f7222a == 0) {
                rectF.set(getPaddingLeft() + this.E, f15, getPaddingLeft() + this.E + f7, min2);
            } else {
                rectF.set(((getMeasuredWidth() - getPaddingRight()) - this.E) - f7, f15, (getMeasuredWidth() - getPaddingRight()) - this.E, min2);
            }
        } else {
            float clamp2 = Utilities.clamp(AndroidUtilities.lerp(getPaddingLeft(), getMeasuredWidth() - getPaddingRight(), this.f7224b) + this.f7226c, getMeasuredWidth() - getPaddingRight(), getPaddingLeft());
            float min3 = Math.min(Math.max(getPaddingLeft(), clamp2 - f13) + f7, getMeasuredWidth() - getPaddingRight());
            float f17 = min3 - f7;
            float f18 = this.f7255y;
            float clamp3 = Utilities.clamp(clamp2, (min3 - min) - f18, f17 + min + f18);
            if (this.f7222a == 1) {
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
        boolean z10 = this.f7246s;
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
        if (this.f7222a == 0) {
            path.lineTo(rectF.left, this.f7255y + f12 + AndroidUtilities.dp(2.0f));
            path.lineTo(rectF.left, this.f7255y + f12);
            path.lineTo(rectF.left - this.E, AndroidUtilities.dp(1.0f) + f12);
            float f23 = rectF.left - this.E;
            this.f7249u0 = f23;
            this.f7250v0 = f12;
            path.lineTo(f23, f12 - AndroidUtilities.dp(1.0f));
            path.lineTo(rectF.left, f12 - this.f7255y);
            path.lineTo(rectF.left, (f12 - this.f7255y) - AndroidUtilities.dp(2.0f));
            if (rect != null) {
                rect.left = (int) (rect.left - this.E);
            }
        }
        if (this.f7246s) {
            path.lineTo(rectF.left, rectF.top);
        } else {
            float f24 = rectF.left;
            float f25 = rectF.top;
            float f26 = min * 2.0f;
            rectF2.set(f24, f25, f24 + f26, f26 + f25);
            path.arcTo(rectF2, 180.0f, 90.0f);
        }
        if (this.f7222a == 1) {
            path.lineTo((f12 - this.f7255y) - AndroidUtilities.dp(2.0f), rectF.top);
            path.lineTo(f12 - this.f7255y, rectF.top);
            path.lineTo(f12 - AndroidUtilities.dp(1.0f), rectF.top - this.E);
            this.f7249u0 = f12;
            this.f7250v0 = rectF.top - this.E;
            path.lineTo(AndroidUtilities.dp(1.0f) + f12, rectF.top - this.E);
            path.lineTo(this.f7255y + f12, rectF.top);
            path.lineTo(this.f7255y + f12 + AndroidUtilities.dp(2.0f), rectF.top);
            if (rect != null) {
                rect.top = (int) (rect.top - this.E);
            }
        }
        if (this.f7246s) {
            path.lineTo(rectF.right, rectF.top);
        } else {
            float f27 = rectF.right;
            float f28 = min * 2.0f;
            float f29 = rectF.top;
            rectF2.set(f27 - f28, f29, f27, f28 + f29);
            path.arcTo(rectF2, 270.0f, 90.0f);
        }
        if (this.f7222a == 2) {
            path.lineTo(rectF.right, (f12 - this.f7255y) - AndroidUtilities.dp(2.0f));
            path.lineTo(rectF.right, f12 - this.f7255y);
            path.lineTo(rectF.right + this.E, f12 - AndroidUtilities.dp(1.0f));
            float f30 = rectF.right + this.E;
            this.f7249u0 = f30;
            this.f7250v0 = f12;
            path.lineTo(f30, AndroidUtilities.dp(1.0f) + f12);
            path.lineTo(rectF.right, this.f7255y + f12);
            path.lineTo(rectF.right, this.f7255y + f12 + AndroidUtilities.dp(2.0f));
            if (rect != null) {
                rect.right = (int) (rect.right + this.E);
            }
        }
        if (this.f7246s) {
            path.lineTo(rectF.right, rectF.bottom);
        } else {
            float f31 = rectF.right;
            float f32 = min * 2.0f;
            float f33 = rectF.bottom;
            rectF2.set(f31 - f32, f33 - f32, f31, f33);
            path.arcTo(rectF2, 0.0f, 90.0f);
        }
        if (this.f7222a == 3) {
            path.lineTo(this.f7255y + f12 + AndroidUtilities.dp(2.0f), rectF.bottom);
            path.lineTo(this.f7255y + f12, rectF.bottom);
            path.lineTo(AndroidUtilities.dp(1.0f) + f12, rectF.bottom + this.E);
            this.f7249u0 = f12;
            this.f7250v0 = rectF.bottom + this.E;
            path.lineTo(f12 - AndroidUtilities.dp(1.0f), rectF.bottom + this.E);
            path.lineTo(f12 - this.f7255y, rectF.bottom);
            path.lineTo((f12 - this.f7255y) - AndroidUtilities.dp(2.0f), rectF.bottom);
            if (rect != null) {
                rect.bottom = (int) (rect.bottom + this.E);
            }
        }
        path.close();
        this.f7256y0 = true;
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
        f4 f4Var;
        float f13;
        Canvas canvas2;
        int paddingTop;
        int paddingRight;
        if (!this.I || this.L != null) {
            if (this.V && !this.f7257z0) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = this.W.e(z10);
            if (this.f7257z0) {
                this.f7257z0 = false;
                invalidate();
            }
            if (e7 <= 0.0f) {
                return;
            }
            boolean z11 = this.I;
            org.telegram.ui.Components.p6 p6Var = this.H;
            if (z11) {
                d = this.O;
            } else {
                d = p6Var.d();
            }
            if (this.I) {
                f7 = this.P;
            } else {
                f7 = p6Var.f29314e;
            }
            if (this.f7244r) {
                if (this.f7239n == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                    this.f7239n = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
                }
                d += this.f7253x + this.f7239n.getIntrinsicWidth();
                f7 = Math.max(this.f7239n.getIntrinsicHeight(), f7);
            }
            if (this.f7227c0 != null) {
                d += this.f7232f0 + this.f7230e0;
                f7 = Math.max(this.f7233g0, f7);
            }
            float f14 = d;
            RectF rectF2 = this.f7251w;
            float f15 = rectF2.left + f14 + rectF2.right;
            float f16 = rectF2.top + f7 + rectF2.bottom;
            boolean z12 = this.f7256y0;
            RectF rectF3 = this.f7245r0;
            if (z12 && Math.abs(f15 - this.f7252w0) <= 0.1f && Math.abs(f16 - this.f7254x0) <= 0.1f) {
                rectF = rectF3;
            } else {
                this.f7252w0 = f15;
                this.f7254x0 = f16;
                d(this.f7248t0, f15, f16, 0.0f, rectF3, this.f7243q0);
                rectF = rectF3;
                if (this.A0) {
                    d(this.B0, f15, f16, this.C0, this.f7247s0, null);
                }
            }
            if (this.f7231f) {
                f10 = e7;
            } else {
                f10 = 1.0f;
            }
            canvas.save();
            if (e7 < 1.0f && this.f7229e) {
                float lerp = AndroidUtilities.lerp(0.75f, 1.0f, e7);
                canvas.scale(lerp, lerp, this.f7249u0, this.f7250v0);
            }
            float a2 = this.f7242p0.a(0.025f);
            if (a2 != 1.0f) {
                canvas.scale(a2, a2, this.f7249u0, this.f7250v0);
            }
            if (this.f7241o0 != 1.0f) {
                int i10 = this.f7222a;
                int i11 = -1;
                if (i10 != 3 && i10 != 1) {
                    if (i10 == 0) {
                        paddingRight = getPaddingLeft();
                    } else {
                        paddingRight = getPaddingRight();
                    }
                    float max = (this.f7241o0 - 1.0f) * Math.max(paddingRight, AndroidUtilities.dp(24.0f));
                    if (this.f7222a != 0) {
                        i11 = 1;
                    }
                    canvas.translate(max * i11, 0.0f);
                } else {
                    if (i10 == 3) {
                        paddingTop = getPaddingBottom();
                    } else {
                        paddingTop = getPaddingTop();
                    }
                    float max2 = (this.f7241o0 - 1.0f) * Math.max(paddingTop, AndroidUtilities.dp(24.0f));
                    if (this.f7222a != 1) {
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
            org.telegram.ui.Cells.z zVar = this.f7223a0;
            if (zVar != null) {
                zVar.setAlpha((int) (f10 * 255.0f));
                this.f7223a0.setBounds(this.f7243q0);
                this.f7223a0.draw(canvas);
            }
            float f18 = ((rectF.top + rectF2.top) + (rectF.bottom - rectF2.bottom)) / 2.0f;
            xi0 xi0Var = this.f7227c0;
            if (xi0Var != null) {
                if (this.f7234h0) {
                    float f19 = (rectF2.left / 2.0f) + rectF.left + 0.0f;
                    float f20 = this.f7228d0 + f18;
                    f11 = 255.0f;
                    float f21 = this.f7233g0 / 2.0f;
                    xi0Var.setBounds((int) f19, (int) (f20 - f21), (int) (f19 + this.f7232f0), (int) (f21 + f20));
                    f12 = this.f7232f0 + this.f7230e0 + 0.0f;
                } else {
                    f11 = 255.0f;
                    float f22 = (0.0f + rectF.right) - (rectF2.right / 2.0f);
                    float f23 = this.f7228d0 + f18;
                    float f24 = this.f7233g0 / 2.0f;
                    xi0Var.setBounds((int) (f22 - this.f7232f0), (int) (f23 - f24), (int) f22, (int) (f24 + f23));
                    f12 = 0.0f;
                }
                this.f7227c0.setAlpha((int) (f10 * f11));
                this.f7227c0.draw(canvas);
            } else {
                f11 = 255.0f;
                f12 = 0.0f;
            }
            if (this.I) {
                f13 = f10;
                f4Var = this;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), Math.max(getHeight(), f16), (int) (f10 * f11), 31);
                float f25 = ((f12 + rectF.left) + rectF2.left) - f4Var.N;
                f4Var.R = f25;
                float f26 = f18 - (f4Var.P / 2.0f);
                f4Var.S = f26;
                canvas2.translate(f25, f26);
                if (f4Var.Q.f(canvas2)) {
                    f4Var.invalidate();
                }
                f4Var.L.draw(canvas2);
                org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas2, f4Var.L, f4Var.M, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
                canvas2.restore();
            } else {
                f4Var = this;
                f13 = f10;
                canvas2 = canvas;
                CharSequence charSequence = f4Var.G;
                if (charSequence != null) {
                    p6Var.q(charSequence, f4Var.V, true);
                    f4Var.G = null;
                }
                float f27 = rectF.left;
                float f28 = rectF2.left;
                float f29 = f4Var.P / 2.0f;
                p6Var.setBounds((int) (f12 + f27 + f28), (int) (f18 - f29), (int) (f27 + f28 + f14), (int) (f29 + f18));
                p6Var.f29330w = (int) (f13 * f11);
                p6Var.draw(canvas2);
            }
            if (f4Var.f7244r) {
                if (f4Var.f7239n == null) {
                    Drawable mutate2 = f4Var.getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                    f4Var.f7239n = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
                }
                f4Var.f7239n.setAlpha((int) (f13 * f11));
                Drawable drawable = f4Var.f7239n;
                drawable.setBounds((int) ((rectF.right - (rectF2.right * 0.66f)) - drawable.getIntrinsicWidth()), (int) (rectF.centerY() - (f4Var.f7239n.getIntrinsicHeight() / 2.0f)), (int) (rectF.right - (rectF2.right * 0.66f)), (int) ((f4Var.f7239n.getIntrinsicHeight() / 2.0f) + rectF.centerY()));
                f4Var.f7239n.draw(canvas2);
            }
            canvas2.restore();
        }
    }

    public final void e(boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.m0);
        Runnable runnable = this.f7238l0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        this.V = false;
        org.telegram.ui.Components.e6 e6Var = this.W;
        if (!z10) {
            e6Var.getClass();
            e6Var.d(0.0f, false);
        }
        invalidate();
        Runnable runnable2 = this.f7238l0;
        if (runnable2 != null) {
            AndroidUtilities.runOnUIThread(runnable2, e6Var.f25592c * ((float) e6Var.f25595g));
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
        this.M = org.telegram.ui.Components.z5.update(0, this, this.M, this.L);
    }

    public CharSequence getText() {
        CharSequence charSequence = this.G;
        if (charSequence != null) {
            return charSequence;
        }
        if (!this.I) {
            return this.H.f29316g;
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
        return this.H.f29311a;
    }

    public final void h(int i10) {
        Paint paint = this.F;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
            invalidate();
        }
    }

    public final void i() {
        this.f7244r = true;
        if (!this.I) {
            float f7 = 11.0f;
            float dp = AndroidUtilities.dp(11.0f);
            float dp2 = AndroidUtilities.dp(6.0f);
            if (this.f7244r) {
                f7 = 15.0f;
            }
            this.f7251w.set(dp, dp2, AndroidUtilities.dp(f7), AndroidUtilities.dp(7.0f));
        }
    }

    public final void j(xi0 xi0Var) {
        xi0 xi0Var2 = this.f7227c0;
        if (xi0Var2 != null) {
            xi0Var2.setCallback(null);
        }
        this.f7227c0 = xi0Var;
        xi0Var.setCallback(this);
        xi0 xi0Var3 = this.f7227c0;
        if (com.google.android.gms.internal.vision.e2.u(xi0Var3)) {
            this.d = Math.max(this.d, xi0Var3.p());
        }
        xi0 xi0Var4 = this.f7227c0;
        this.f7232f0 = xi0Var4.f32579b;
        this.f7233g0 = xi0Var4.f32581c;
        this.f7234h0 = true;
    }

    public final void k(float f7, float f10, float f11, float f12) {
        this.f7251w.set(AndroidUtilities.dpf2(f7), AndroidUtilities.dpf2(f10), AndroidUtilities.dpf2(f11), AndroidUtilities.dpf2(f12));
    }

    public final void l(float f7, float f10) {
        if (Math.abs(this.f7224b - f7) >= 1.0f || Math.abs(this.f7226c - AndroidUtilities.dp(f10)) >= 1.0f) {
            this.f7256y0 = false;
            invalidate();
        }
        this.f7224b = f7;
        this.f7226c = AndroidUtilities.dp(f10);
    }

    public final void m(float f7, float f10) {
        if (Math.abs(this.f7224b - f7) >= 1.0f || Math.abs(this.f7226c - f10) >= 1.0f) {
            this.f7256y0 = false;
            invalidate();
        }
        this.f7224b = f7;
        this.f7226c = f10;
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
        org.telegram.ui.Components.z5.release(this, this.M);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        this.f7256y0 = false;
        int textMaxWidth = getTextMaxWidth();
        org.telegram.ui.Components.p6 p6Var = this.H;
        p6Var.G = textMaxWidth;
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
                p6Var.q(charSequence2, false, true);
            }
        }
        this.G = null;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: di.f4.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(boolean z10) {
        this.I = z10;
        RectF rectF = this.f7251w;
        float f7 = 15.0f;
        if (z10) {
            rectF.set(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
            this.f7253x = AndroidUtilities.dp(6.0f);
            return;
        }
        float dp = AndroidUtilities.dp(11.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        if (!this.f7244r) {
            f7 = 11.0f;
        }
        rectF.set(dp, dp2, AndroidUtilities.dp(f7), AndroidUtilities.dp(7.0f));
        this.f7253x = AndroidUtilities.dp(2.0f);
    }

    public final void q(float f7) {
        CornerPathEffect cornerPathEffect;
        this.v = AndroidUtilities.dp(f7);
        CornerPathEffect cornerPathEffect2 = null;
        if (this.f7246s) {
            cornerPathEffect = new CornerPathEffect(this.v);
        } else {
            cornerPathEffect = null;
        }
        this.F.setPathEffect(cornerPathEffect);
        Paint paint = this.f7225b0;
        if (paint != null) {
            if (this.f7246s) {
                cornerPathEffect2 = new CornerPathEffect(this.v);
            }
            paint.setPathEffect(cornerPathEffect2);
        }
    }

    public final void r() {
        this.f7246s = false;
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
            ValueAnimator valueAnimator = this.f7240n0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f7240n0 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f7240n0 = ofFloat;
            ofFloat.addUpdateListener(new ah.d0(this, 20));
            this.f7240n0.addListener(new ah.b(this, 17));
            this.f7240n0.setInterpolator(pr.f29497k);
            this.f7240n0.setDuration(300L);
            this.f7240n0.start();
        }
        AndroidUtilities.makeAccessibilityAnnouncement(getText());
        this.V = true;
        invalidate();
        rl0 rl0Var = this.m0;
        AndroidUtilities.cancelRunOnUIThread(rl0Var);
        long j3 = this.d;
        if (j3 > 0) {
            AndroidUtilities.runOnUIThread(rl0Var, j3);
        }
        Runnable runnable = this.f7238l0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.H && drawable != this.f7223a0 && drawable != this.f7227c0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
