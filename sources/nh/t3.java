package nh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.z80;
import org.telegram.ui.vk0;
public class t3 extends View {
    public float A;
    public Paint A0;
    public final Paint B;
    public LinearGradient B0;
    public CharSequence C;
    public Matrix C0;
    public final org.telegram.ui.Components.n6 D;
    public LinearGradient D0;
    public boolean E;
    public long E0;
    public final TextPaint F;
    public final RectF F0;
    public Layout.Alignment G;
    public z80 G0;
    public StaticLayout H;
    public org.telegram.ui.Components.u5 I;
    public float J;
    public float K;
    public float L;
    public final v80 M;
    public float N;
    public float O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final org.telegram.ui.Components.d6 S;
    public org.telegram.ui.Cells.z T;
    public Paint U;
    public xi0 V;
    public float W;
    public int f18585a;
    public int f18586a0;
    public float f18587b;
    public int f18588b0;
    public float f18589c;
    public int f18590c0;
    public long d;
    public boolean f18591d0;
    public boolean f18592e;
    public float f18593e0;
    public final boolean f18594f;
    public float f18595f0;
    public int f18596g0;
    public int h;
    public Runnable f18597h0;
    public final vk0 f18598i0;
    public ValueAnimator f18599j0;
    public float f18600k0;
    public final uc f18601l0;
    public final Rect m0;
    public Drawable f18602n;
    public final RectF f18603n0;
    public final RectF f18604o0;
    public final Path f18605p0;
    public float f18606q0;
    public boolean f18607r;
    public float f18608r0;
    public boolean f18609s;
    public float f18610s0;
    public float f18611t0;
    public boolean f18612u0;
    public float v;
    public boolean f18613v0;
    public final RectF f18614w;
    public boolean f18615w0;
    public float f18616x;
    public Path f18617x0;
    public float f18618y;
    public float f18619y0;
    public Paint f18620z0;

    public t3(Context context, int i10) {
        super(context);
        this.f18587b = 0.5f;
        this.f18589c = 0.0f;
        this.d = 3500L;
        this.f18592e = true;
        this.f18594f = true;
        this.h = -1;
        this.f18609s = true;
        this.v = AndroidUtilities.dp(8.0f);
        this.f18614w = new RectF(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(7.0f));
        this.f18616x = AndroidUtilities.dp(2.0f);
        this.f18618y = AndroidUtilities.dp(7.0f);
        this.A = AndroidUtilities.dp(6.0f);
        Paint paint = new Paint(1);
        this.B = paint;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.G = Layout.Alignment.ALIGN_NORMAL;
        this.M = new v80();
        this.P = true;
        this.Q = true;
        jr jrVar = jr.h;
        this.S = new org.telegram.ui.Components.d6(this, 350L, jrVar);
        this.f18586a0 = AndroidUtilities.dp(2.0f);
        this.f18598i0 = new vk0(this, 27);
        this.f18600k0 = 1.0f;
        this.f18601l0 = new uc(this, 2.0f, 5.0f);
        this.m0 = new Rect();
        this.f18603n0 = new RectF();
        this.f18604o0 = new RectF();
        this.f18605p0 = new Path();
        this.f18613v0 = true;
        this.F0 = new RectF();
        this.f18585a = i10;
        paint.setColor(-433575896);
        paint.setPathEffect(new CornerPathEffect(this.v));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, false, false);
        this.D = n6Var;
        n6Var.k(0.4f, 320L, jrVar);
        n6Var.setCallback(this);
        u(14.0f);
        n6Var.r(-1);
        textPaint.setColor(-1);
    }

    public static int a(CharSequence charSequence, TextPaint textPaint) {
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return Integer.MAX_VALUE;
        }
        int length = charSequence.length() / 2;
        float f9 = 0.0f;
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
            if (f10 != f9 || f11 != f12) {
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
                f9 = f10;
                f12 = f11;
            } else {
                break;
            }
        }
        return (int) Math.ceil(Math.max(f10, f11));
    }

    public static java.lang.CharSequence b(java.lang.CharSequence r12, android.text.TextPaint r13) {
        throw new UnsupportedOperationException("Method not decompiled: nh.t3.b(java.lang.CharSequence, android.text.TextPaint):java.lang.CharSequence");
    }

    public static float g(CharSequence charSequence, TextPaint textPaint) {
        float f9 = 0.0f;
        if (charSequence == null) {
            return 0.0f;
        }
        if (!(charSequence instanceof Spanned)) {
            return textPaint.measureText(charSequence.toString());
        }
        Spanned spanned = (Spanned) charSequence;
        t41[] t41VarArr = (t41[]) spanned.getSpans(0, charSequence.length(), t41.class);
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
        if (t41VarArr != null && t41VarArr.length != 0) {
            int i12 = 0;
            for (int i13 = 0; i13 < t41VarArr.length; i13++) {
                int spanStart2 = spanned.getSpanStart(t41VarArr[i13]);
                int spanEnd2 = spanned.getSpanEnd(t41VarArr[i13]);
                int max = Math.max(i12, spanStart2);
                if (max - i12 > 0) {
                    f9 += textPaint3.measureText(spanned, i12, max);
                }
                i12 = Math.max(max, spanEnd2);
                if (i12 - max > 0) {
                    Typeface typeface = textPaint3.getTypeface();
                    textPaint3.setTypeface(t41VarArr[i13].f32866a);
                    textPaint3.setTypeface(typeface);
                    f9 = textPaint3.measureText(spanned, max, i12) + f9;
                }
            }
            int max2 = Math.max(i12, charSequence3.length());
            if (max2 - i12 > 0) {
                f9 += textPaint3.measureText(spanned, i12, max2);
            }
            return f9 + i11;
        }
        return textPaint3.measureText(charSequence3.toString()) + i11;
    }

    private int getTextMaxWidth() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        RectF rectF = this.f18614w;
        int i10 = measuredWidth - ((int) (rectF.left + rectF.right));
        int i11 = this.h;
        if (i11 > 0) {
            i10 = Math.min(i11, i10);
        }
        return Math.max(0, i10);
    }

    public void c(Canvas canvas, float f9) {
        int i10 = this.f18596g0;
        Paint paint = this.B;
        if (i10 != 0) {
            paint.setShadowLayer(this.f18593e0, 0.0f, this.f18595f0, org.telegram.ui.ActionBar.g6.l1(f9, i10));
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f9));
        Path path = this.f18605p0;
        canvas.drawPath(path, paint);
        paint.setAlpha(alpha);
        if (this.f18615w0) {
            int dp = AndroidUtilities.dp(64.0f);
            this.C0.reset();
            this.C0.postTranslate(this.f18603n0.left + (((this.f18610s0 * 4.0f) + (dp * 2)) * (((float) ((System.currentTimeMillis() - this.E0) % 4000)) / 4000.0f)) + (-dp), 0.0f);
            this.B0.setLocalMatrix(this.C0);
            this.D0.setLocalMatrix(this.C0);
            canvas.drawPath(path, this.f18620z0);
            canvas.drawPath(this.f18617x0, this.A0);
            invalidate();
        }
    }

    public final void d(Path path, float f9, float f10, float f11, RectF rectF, Rect rect) {
        float f12;
        float f13 = f9 / 2.0f;
        float f14 = f10 / 2.0f;
        float min = Math.min(this.v, Math.min(f13, f14));
        int i10 = this.f18585a;
        if (i10 != 1 && i10 != 3) {
            float clamp = Utilities.clamp(AndroidUtilities.lerp(getPaddingTop(), getMeasuredHeight() - getPaddingBottom(), this.f18587b) + this.f18589c, getMeasuredHeight() - getPaddingBottom(), getPaddingTop());
            float min2 = Math.min(Math.max(getPaddingTop(), clamp - f14) + f10, getMeasuredHeight() - getPaddingBottom());
            float f15 = min2 - f10;
            float f16 = this.f18618y;
            f12 = Utilities.clamp(clamp, (min2 - min) - f16, f15 + min + f16);
            if (this.f18585a == 0) {
                rectF.set(getPaddingLeft() + this.A, f15, getPaddingLeft() + this.A + f9, min2);
            } else {
                rectF.set(((getMeasuredWidth() - getPaddingRight()) - this.A) - f9, f15, (getMeasuredWidth() - getPaddingRight()) - this.A, min2);
            }
        } else {
            float clamp2 = Utilities.clamp(AndroidUtilities.lerp(getPaddingLeft(), getMeasuredWidth() - getPaddingRight(), this.f18587b) + this.f18589c, getMeasuredWidth() - getPaddingRight(), getPaddingLeft());
            float min3 = Math.min(Math.max(getPaddingLeft(), clamp2 - f13) + f9, getMeasuredWidth() - getPaddingRight());
            float f17 = min3 - f9;
            float f18 = this.f18618y;
            float clamp3 = Utilities.clamp(clamp2, (min3 - min) - f18, f17 + min + f18);
            if (this.f18585a == 1) {
                rectF.set(f17, getPaddingTop() + this.A, min3, getPaddingTop() + this.A + f10);
            } else {
                rectF.set(f17, ((getMeasuredHeight() - this.A) - getPaddingBottom()) - f10, min3, (getMeasuredHeight() - this.A) - getPaddingBottom());
            }
            f12 = clamp3;
        }
        float f19 = -f11;
        rectF.inset(f19, f19);
        if (rect != null) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        path.rewind();
        boolean z10 = this.f18609s;
        RectF rectF2 = this.F0;
        if (z10) {
            path.moveTo(rectF.left, rectF.bottom);
        } else {
            float f20 = rectF.left;
            float f21 = rectF.bottom;
            float f22 = min * 2.0f;
            rectF2.set(f20, f21 - f22, f22 + f20, f21);
            path.arcTo(rectF2, 90.0f, 90.0f);
        }
        if (this.f18585a == 0) {
            path.lineTo(rectF.left, this.f18618y + f12 + AndroidUtilities.dp(2.0f));
            path.lineTo(rectF.left, this.f18618y + f12);
            path.lineTo(rectF.left - this.A, AndroidUtilities.dp(1.0f) + f12);
            float f23 = rectF.left - this.A;
            this.f18606q0 = f23;
            this.f18608r0 = f12;
            path.lineTo(f23, f12 - AndroidUtilities.dp(1.0f));
            path.lineTo(rectF.left, f12 - this.f18618y);
            path.lineTo(rectF.left, (f12 - this.f18618y) - AndroidUtilities.dp(2.0f));
            if (rect != null) {
                rect.left = (int) (rect.left - this.A);
            }
        }
        if (this.f18609s) {
            path.lineTo(rectF.left, rectF.top);
        } else {
            float f24 = rectF.left;
            float f25 = rectF.top;
            float f26 = min * 2.0f;
            rectF2.set(f24, f25, f24 + f26, f26 + f25);
            path.arcTo(rectF2, 180.0f, 90.0f);
        }
        if (this.f18585a == 1) {
            path.lineTo((f12 - this.f18618y) - AndroidUtilities.dp(2.0f), rectF.top);
            path.lineTo(f12 - this.f18618y, rectF.top);
            path.lineTo(f12 - AndroidUtilities.dp(1.0f), rectF.top - this.A);
            this.f18606q0 = f12;
            this.f18608r0 = rectF.top - this.A;
            path.lineTo(AndroidUtilities.dp(1.0f) + f12, rectF.top - this.A);
            path.lineTo(this.f18618y + f12, rectF.top);
            path.lineTo(this.f18618y + f12 + AndroidUtilities.dp(2.0f), rectF.top);
            if (rect != null) {
                rect.top = (int) (rect.top - this.A);
            }
        }
        if (this.f18609s) {
            path.lineTo(rectF.right, rectF.top);
        } else {
            float f27 = rectF.right;
            float f28 = min * 2.0f;
            float f29 = rectF.top;
            rectF2.set(f27 - f28, f29, f27, f28 + f29);
            path.arcTo(rectF2, 270.0f, 90.0f);
        }
        if (this.f18585a == 2) {
            path.lineTo(rectF.right, (f12 - this.f18618y) - AndroidUtilities.dp(2.0f));
            path.lineTo(rectF.right, f12 - this.f18618y);
            path.lineTo(rectF.right + this.A, f12 - AndroidUtilities.dp(1.0f));
            float f30 = rectF.right + this.A;
            this.f18606q0 = f30;
            this.f18608r0 = f12;
            path.lineTo(f30, AndroidUtilities.dp(1.0f) + f12);
            path.lineTo(rectF.right, this.f18618y + f12);
            path.lineTo(rectF.right, this.f18618y + f12 + AndroidUtilities.dp(2.0f));
            if (rect != null) {
                rect.right = (int) (rect.right + this.A);
            }
        }
        if (this.f18609s) {
            path.lineTo(rectF.right, rectF.bottom);
        } else {
            float f31 = rectF.right;
            float f32 = min * 2.0f;
            float f33 = rectF.bottom;
            rectF2.set(f31 - f32, f33 - f32, f31, f33);
            path.arcTo(rectF2, 0.0f, 90.0f);
        }
        if (this.f18585a == 3) {
            path.lineTo(this.f18618y + f12 + AndroidUtilities.dp(2.0f), rectF.bottom);
            path.lineTo(this.f18618y + f12, rectF.bottom);
            path.lineTo(AndroidUtilities.dp(1.0f) + f12, rectF.bottom + this.A);
            this.f18606q0 = f12;
            this.f18608r0 = rectF.bottom + this.A;
            path.lineTo(f12 - AndroidUtilities.dp(1.0f), rectF.bottom + this.A);
            path.lineTo(f12 - this.f18618y, rectF.bottom);
            path.lineTo((f12 - this.f18618y) - AndroidUtilities.dp(2.0f), rectF.bottom);
            if (rect != null) {
                rect.bottom = (int) (rect.bottom + this.A);
            }
        }
        path.close();
        this.f18612u0 = true;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        float d;
        float f9;
        RectF rectF;
        float f10;
        float f11;
        float f12;
        t3 t3Var;
        float f13;
        Canvas canvas2;
        int paddingTop;
        int paddingRight;
        if (!this.E || this.H != null) {
            if (this.R && !this.f18613v0) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = this.S.e(z10);
            if (this.f18613v0) {
                this.f18613v0 = false;
                invalidate();
            }
            if (e10 <= 0.0f) {
                return;
            }
            boolean z11 = this.E;
            org.telegram.ui.Components.n6 n6Var = this.D;
            if (z11) {
                d = this.K;
            } else {
                d = n6Var.d();
            }
            if (this.E) {
                f9 = this.L;
            } else {
                f9 = n6Var.f30864e;
            }
            if (this.f18607r) {
                if (this.f18602n == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                    this.f18602n = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
                }
                d += this.f18616x + this.f18602n.getIntrinsicWidth();
                f9 = Math.max(this.f18602n.getIntrinsicHeight(), f9);
            }
            if (this.V != null) {
                d += this.f18588b0 + this.f18586a0;
                f9 = Math.max(this.f18590c0, f9);
            }
            float f14 = d;
            RectF rectF2 = this.f18614w;
            float f15 = rectF2.left + f14 + rectF2.right;
            float f16 = rectF2.top + f9 + rectF2.bottom;
            boolean z12 = this.f18612u0;
            RectF rectF3 = this.f18603n0;
            if (z12 && Math.abs(f15 - this.f18610s0) <= 0.1f && Math.abs(f16 - this.f18611t0) <= 0.1f) {
                rectF = rectF3;
            } else {
                this.f18610s0 = f15;
                this.f18611t0 = f16;
                d(this.f18605p0, f15, f16, 0.0f, rectF3, this.m0);
                rectF = rectF3;
                if (this.f18615w0) {
                    d(this.f18617x0, f15, f16, this.f18619y0, this.f18604o0, null);
                }
            }
            if (this.f18594f) {
                f10 = e10;
            } else {
                f10 = 1.0f;
            }
            canvas.save();
            if (e10 < 1.0f && this.f18592e) {
                float lerp = AndroidUtilities.lerp(0.75f, 1.0f, e10);
                canvas.scale(lerp, lerp, this.f18606q0, this.f18608r0);
            }
            float a2 = this.f18601l0.a(0.025f);
            if (a2 != 1.0f) {
                canvas.scale(a2, a2, this.f18606q0, this.f18608r0);
            }
            if (this.f18600k0 != 1.0f) {
                int i10 = this.f18585a;
                int i11 = -1;
                if (i10 != 3 && i10 != 1) {
                    if (i10 == 0) {
                        paddingRight = getPaddingLeft();
                    } else {
                        paddingRight = getPaddingRight();
                    }
                    float max = (this.f18600k0 - 1.0f) * Math.max(paddingRight, AndroidUtilities.dp(24.0f));
                    if (this.f18585a != 0) {
                        i11 = 1;
                    }
                    canvas.translate(max * i11, 0.0f);
                } else {
                    if (i10 == 3) {
                        paddingTop = getPaddingBottom();
                    } else {
                        paddingTop = getPaddingTop();
                    }
                    float max2 = (this.f18600k0 - 1.0f) * Math.max(paddingTop, AndroidUtilities.dp(24.0f));
                    if (this.f18585a != 1) {
                        i11 = 1;
                    }
                    canvas.translate(0.0f, max2 * i11);
                }
            }
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(rectF);
            float f17 = -this.A;
            rectF4.inset(f17, f17);
            c(canvas, f10);
            org.telegram.ui.Cells.z zVar = this.T;
            if (zVar != null) {
                zVar.setAlpha((int) (f10 * 255.0f));
                this.T.setBounds(this.m0);
                this.T.draw(canvas);
            }
            float f18 = ((rectF.top + rectF2.top) + (rectF.bottom - rectF2.bottom)) / 2.0f;
            xi0 xi0Var = this.V;
            if (xi0Var != null) {
                if (this.f18591d0) {
                    float f19 = (rectF2.left / 2.0f) + rectF.left + 0.0f;
                    float f20 = this.W + f18;
                    f11 = 255.0f;
                    float f21 = this.f18590c0 / 2.0f;
                    xi0Var.setBounds((int) f19, (int) (f20 - f21), (int) (f19 + this.f18588b0), (int) (f21 + f20));
                    f12 = this.f18588b0 + this.f18586a0 + 0.0f;
                } else {
                    f11 = 255.0f;
                    float f22 = (0.0f + rectF.right) - (rectF2.right / 2.0f);
                    float f23 = this.W + f18;
                    float f24 = this.f18590c0 / 2.0f;
                    xi0Var.setBounds((int) (f22 - this.f18588b0), (int) (f23 - f24), (int) f22, (int) (f24 + f23));
                    f12 = 0.0f;
                }
                this.V.setAlpha((int) (f10 * f11));
                this.V.draw(canvas);
            } else {
                f11 = 255.0f;
                f12 = 0.0f;
            }
            if (this.E) {
                f13 = f10;
                t3Var = this;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), Math.max(getHeight(), f16), (int) (f10 * f11), 31);
                float f25 = ((f12 + rectF.left) + rectF2.left) - t3Var.J;
                t3Var.N = f25;
                float f26 = f18 - (t3Var.L / 2.0f);
                t3Var.O = f26;
                canvas2.translate(f25, f26);
                if (t3Var.M.f(canvas2)) {
                    t3Var.invalidate();
                }
                t3Var.H.draw(canvas2);
                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas2, t3Var.H, t3Var.I, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
                canvas2.restore();
            } else {
                t3Var = this;
                f13 = f10;
                canvas2 = canvas;
                CharSequence charSequence = t3Var.C;
                if (charSequence != null) {
                    n6Var.q(charSequence, t3Var.R, true);
                    t3Var.C = null;
                }
                float f27 = rectF.left;
                float f28 = rectF2.left;
                float f29 = t3Var.L / 2.0f;
                n6Var.setBounds((int) (f12 + f27 + f28), (int) (f18 - f29), (int) (f27 + f28 + f14), (int) (f29 + f18));
                n6Var.f30880w = (int) (f13 * f11);
                n6Var.draw(canvas2);
            }
            if (t3Var.f18607r) {
                if (t3Var.f18602n == null) {
                    Drawable mutate2 = t3Var.getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                    t3Var.f18602n = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
                }
                t3Var.f18602n.setAlpha((int) (f13 * f11));
                Drawable drawable = t3Var.f18602n;
                drawable.setBounds((int) ((rectF.right - (rectF2.right * 0.66f)) - drawable.getIntrinsicWidth()), (int) (rectF.centerY() - (t3Var.f18602n.getIntrinsicHeight() / 2.0f)), (int) (rectF.right - (rectF2.right * 0.66f)), (int) ((t3Var.f18602n.getIntrinsicHeight() / 2.0f) + rectF.centerY()));
                t3Var.f18602n.draw(canvas2);
            }
            canvas2.restore();
        }
    }

    public final void e(boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.f18598i0);
        Runnable runnable = this.f18597h0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        this.R = false;
        org.telegram.ui.Components.d6 d6Var = this.S;
        if (!z10) {
            d6Var.getClass();
            d6Var.d(0.0f, false);
        }
        invalidate();
        Runnable runnable2 = this.f18597h0;
        if (runnable2 != null) {
            AndroidUtilities.runOnUIThread(runnable2, d6Var.f27666c * ((float) d6Var.f27669g));
        }
        this.M.d(true);
    }

    public final void f(int i10, CharSequence charSequence) {
        this.H = new StaticLayout(charSequence, this.F, i10, this.G, 1.0f, 0.0f, false);
        float f9 = i10;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < this.H.getLineCount(); i11++) {
            f9 = Math.min(f9, this.H.getLineLeft(i11));
            f10 = Math.max(f10, this.H.getLineRight(i11));
        }
        this.K = Math.max(0.0f, f10 - f9);
        this.L = this.H.getHeight();
        this.J = f9;
        this.I = org.telegram.ui.Components.y5.update(0, this, this.I, this.H);
    }

    public CharSequence getText() {
        CharSequence charSequence = this.C;
        if (charSequence != null) {
            return charSequence;
        }
        if (!this.E) {
            return this.D.f30866g;
        }
        StaticLayout staticLayout = this.H;
        if (staticLayout != null) {
            return staticLayout.getText();
        }
        return null;
    }

    public TextPaint getTextPaint() {
        if (this.E) {
            return this.F;
        }
        return this.D.f30861a;
    }

    public final void h(int i10) {
        Paint paint = this.B;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
            invalidate();
        }
    }

    public final void i() {
        this.f18607r = true;
        if (!this.E) {
            float f9 = 11.0f;
            float dp = AndroidUtilities.dp(11.0f);
            float dp2 = AndroidUtilities.dp(6.0f);
            if (this.f18607r) {
                f9 = 15.0f;
            }
            this.f18614w.set(dp, dp2, AndroidUtilities.dp(f9), AndroidUtilities.dp(7.0f));
        }
    }

    public final void j(int i10) {
        xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(34.0f), j7.l1.k(i10, ""), AndroidUtilities.dp(34.0f));
        xi0Var.start();
        k(xi0Var);
    }

    public final void k(xi0 xi0Var) {
        xi0 xi0Var2 = this.V;
        if (xi0Var2 != null) {
            xi0Var2.setCallback(null);
        }
        this.V = xi0Var;
        xi0Var.setCallback(this);
        xi0 xi0Var3 = this.V;
        if (com.google.android.recaptcha.internal.a.u(xi0Var3)) {
            this.d = Math.max(this.d, xi0Var3.p());
        }
        xi0 xi0Var4 = this.V;
        this.f18588b0 = xi0Var4.f34732b;
        this.f18590c0 = xi0Var4.f34734c;
        this.f18591d0 = true;
    }

    public final void l(float f9, float f10, float f11, float f12) {
        this.f18614w.set(AndroidUtilities.dpf2(f9), AndroidUtilities.dpf2(f10), AndroidUtilities.dpf2(f11), AndroidUtilities.dpf2(f12));
    }

    public final void m(float f9, float f10) {
        if (Math.abs(this.f18587b - f9) >= 1.0f || Math.abs(this.f18589c - AndroidUtilities.dp(f10)) >= 1.0f) {
            this.f18612u0 = false;
            invalidate();
        }
        this.f18587b = f9;
        this.f18589c = AndroidUtilities.dp(f10);
    }

    public final void n(float f9, float f10) {
        if (Math.abs(this.f18587b - f9) >= 1.0f || Math.abs(this.f18589c - f10) >= 1.0f) {
            this.f18612u0 = false;
            invalidate();
        }
        this.f18587b = f9;
        this.f18589c = f10;
    }

    public final void o() {
        this.h = AndroidUtilities.dp(165.0f);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.y5.release(this, this.I);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        this.f18612u0 = false;
        int textMaxWidth = getTextMaxWidth();
        org.telegram.ui.Components.n6 n6Var = this.D;
        n6Var.G = textMaxWidth;
        if (this.E) {
            CharSequence charSequence = this.C;
            if (charSequence == null) {
                StaticLayout staticLayout = this.H;
                if (staticLayout != null) {
                    charSequence = staticLayout.getText();
                } else {
                    return;
                }
            }
            StaticLayout staticLayout2 = this.H;
            if (staticLayout2 == null || staticLayout2.getWidth() != textMaxWidth) {
                f(textMaxWidth, charSequence);
            }
        } else {
            CharSequence charSequence2 = this.C;
            if (charSequence2 != null) {
                n6Var.q(charSequence2, false, true);
            }
        }
        this.C = null;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: nh.t3.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i10) {
        this.h = i10;
    }

    public final void q(boolean z10) {
        this.E = z10;
        RectF rectF = this.f18614w;
        float f9 = 15.0f;
        if (z10) {
            rectF.set(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
            this.f18616x = AndroidUtilities.dp(6.0f);
            return;
        }
        float dp = AndroidUtilities.dp(11.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        if (!this.f18607r) {
            f9 = 11.0f;
        }
        rectF.set(dp, dp2, AndroidUtilities.dp(f9), AndroidUtilities.dp(7.0f));
        this.f18616x = AndroidUtilities.dp(2.0f);
    }

    public final void r(float f9) {
        CornerPathEffect cornerPathEffect;
        this.v = AndroidUtilities.dp(f9);
        CornerPathEffect cornerPathEffect2 = null;
        if (this.f18609s) {
            cornerPathEffect = new CornerPathEffect(this.v);
        } else {
            cornerPathEffect = null;
        }
        this.B.setPathEffect(cornerPathEffect);
        Paint paint = this.U;
        if (paint != null) {
            if (this.f18609s) {
                cornerPathEffect2 = new CornerPathEffect(this.v);
            }
            paint.setPathEffect(cornerPathEffect2);
        }
    }

    public final void s() {
        this.f18609s = false;
        this.B.setPathEffect(null);
    }

    public final void t(CharSequence charSequence) {
        if (getMeasuredWidth() < 0) {
            this.C = charSequence;
        } else if (!this.E) {
            this.D.q(charSequence, false, true);
        } else {
            f(getTextMaxWidth(), charSequence);
        }
    }

    public final void u(float f9) {
        this.D.t(AndroidUtilities.dpf2(f9));
        this.F.setTextSize(AndroidUtilities.dpf2(f9));
    }

    public final void v() {
        if (this.R && this.Q) {
            ValueAnimator valueAnimator = this.f18599j0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f18599j0 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f18599j0 = ofFloat;
            ofFloat.addUpdateListener(new lh.d5(this, 8));
            this.f18599j0.addListener(new ag.m0(this, 29));
            this.f18599j0.setInterpolator(jr.f29804k);
            this.f18599j0.setDuration(300L);
            this.f18599j0.start();
        }
        AndroidUtilities.makeAccessibilityAnnouncement(getText());
        this.R = true;
        invalidate();
        vk0 vk0Var = this.f18598i0;
        AndroidUtilities.cancelRunOnUIThread(vk0Var);
        long j10 = this.d;
        if (j10 > 0) {
            AndroidUtilities.runOnUIThread(vk0Var, j10);
        }
        Runnable runnable = this.f18597h0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.D && drawable != this.T && drawable != this.V && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
