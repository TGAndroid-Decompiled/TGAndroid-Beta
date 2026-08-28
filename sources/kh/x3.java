package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.zk0;
public class x3 extends View {
    public float A;
    public Paint A0;
    public final Paint B;
    public LinearGradient B0;
    public CharSequence C;
    public Matrix C0;
    public final org.telegram.ui.Components.i6 D;
    public LinearGradient D0;
    public boolean E;
    public long E0;
    public final TextPaint F;
    public final RectF F0;
    public Layout.Alignment G;
    public m80 G0;
    public StaticLayout H;
    public org.telegram.ui.Components.p5 I;
    public float J;
    public float K;
    public float L;
    public final i80 M;
    public float N;
    public float O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final org.telegram.ui.Components.y5 S;
    public org.telegram.ui.Cells.z T;
    public Paint U;
    public mi0 V;
    public float W;
    public int f16340a;
    public int f16341a0;
    public float f16342b;
    public int f16343b0;
    public float f16344c;
    public int f16345c0;
    public long d;
    public boolean f16346d0;
    public boolean f16347e;
    public float f16348e0;
    public final boolean f16349f;
    public float f16350f0;
    public int f16351g0;
    public int h;
    public Runnable f16352h0;
    public final zk0 f16353i0;
    public ValueAnimator f16354j0;
    public float f16355k0;
    public final org.telegram.ui.Components.pc f16356l0;
    public final Rect m0;
    public Drawable f16357n;
    public final RectF f16358n0;
    public final RectF f16359o0;
    public final Path f16360p0;
    public float f16361q0;
    public boolean f16362r;
    public float f16363r0;
    public boolean f16364s;
    public float f16365s0;
    public float f16366t0;
    public boolean f16367u0;
    public float v;
    public boolean f16368v0;
    public final RectF f16369w;
    public boolean f16370w0;
    public float f16371x;
    public Path f16372x0;
    public float f16373y;
    public float f16374y0;
    public Paint f16375z0;

    public x3(Context context, int i9) {
        super(context);
        this.f16342b = 0.5f;
        this.f16344c = 0.0f;
        this.d = 3500L;
        this.f16347e = true;
        this.f16349f = true;
        this.h = -1;
        this.f16364s = true;
        this.v = AndroidUtilities.dp(8.0f);
        this.f16369w = new RectF(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(7.0f));
        this.f16371x = AndroidUtilities.dp(2.0f);
        this.f16373y = AndroidUtilities.dp(7.0f);
        this.A = AndroidUtilities.dp(6.0f);
        Paint paint = new Paint(1);
        this.B = paint;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.G = Layout.Alignment.ALIGN_NORMAL;
        this.M = new i80();
        this.P = true;
        this.Q = true;
        gr grVar = gr.h;
        this.S = new org.telegram.ui.Components.y5(this, 350L, grVar);
        this.f16341a0 = AndroidUtilities.dp(2.0f);
        this.f16353i0 = new zk0(this, 27);
        this.f16355k0 = 1.0f;
        this.f16356l0 = new org.telegram.ui.Components.pc(this, 2.0f, 5.0f);
        this.m0 = new Rect();
        this.f16358n0 = new RectF();
        this.f16359o0 = new RectF();
        this.f16360p0 = new Path();
        this.f16368v0 = true;
        this.F0 = new RectF();
        this.f16340a = i9;
        paint.setColor(-433575896);
        paint.setPathEffect(new CornerPathEffect(this.v));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, false, false);
        this.D = i6Var;
        i6Var.k(0.4f, 320L, grVar);
        i6Var.setCallback(this);
        u(14.0f);
        i6Var.r(-1);
        textPaint.setColor(-1);
    }

    public static int a(CharSequence charSequence, TextPaint textPaint) {
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return Integer.MAX_VALUE;
        }
        int length = charSequence.length() / 2;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = Float.MAX_VALUE;
        int i9 = 0;
        int i10 = -1;
        while (i9 < 10) {
            while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                length += i10;
            }
            f11 = g(charSequence.subSequence(0, length), textPaint);
            f12 = g(AndroidUtilities.getTrimmedString(charSequence.subSequence(length, charSequence.length())), textPaint);
            if (f11 != f10 || f12 != f13) {
                if (f11 < f12) {
                    length++;
                    i10 = 1;
                } else {
                    length--;
                    i10 = -1;
                }
                if (length <= 0 || length >= charSequence.length()) {
                    break;
                }
                i9++;
                f10 = f11;
                f13 = f12;
            } else {
                break;
            }
        }
        return (int) Math.ceil(Math.max(f11, f12));
    }

    public static java.lang.CharSequence b(java.lang.CharSequence r12, android.text.TextPaint r13) {
        throw new UnsupportedOperationException("Method not decompiled: kh.x3.b(java.lang.CharSequence, android.text.TextPaint):java.lang.CharSequence");
    }

    public static float g(CharSequence charSequence, TextPaint textPaint) {
        float f10 = 0.0f;
        if (charSequence == null) {
            return 0.0f;
        }
        if (!(charSequence instanceof Spanned)) {
            return textPaint.measureText(charSequence.toString());
        }
        Spanned spanned = (Spanned) charSequence;
        i41[] i41VarArr = (i41[]) spanned.getSpans(0, charSequence.length(), i41.class);
        ReplacementSpan[] replacementSpanArr = (ReplacementSpan[]) spanned.getSpans(0, charSequence.length(), ReplacementSpan.class);
        int i9 = 0;
        int i10 = 0;
        while (i9 < replacementSpanArr.length) {
            ReplacementSpan replacementSpan = replacementSpanArr[i9];
            int spanStart = spanned.getSpanStart(replacementSpan);
            int spanEnd = spanned.getSpanEnd(replacementSpan);
            CharSequence charSequence2 = charSequence;
            TextPaint textPaint2 = textPaint;
            i10 = (int) (Math.max(0.0f, replacementSpan.getSize(textPaint2, charSequence2, spanStart, spanEnd, textPaint.getFontMetricsInt()) - textPaint2.measureText(spanned, spanStart, spanEnd)) + i10);
            i9++;
            textPaint = textPaint2;
            charSequence = charSequence2;
        }
        CharSequence charSequence3 = charSequence;
        TextPaint textPaint3 = textPaint;
        if (i41VarArr != null && i41VarArr.length != 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < i41VarArr.length; i12++) {
                int spanStart2 = spanned.getSpanStart(i41VarArr[i12]);
                int spanEnd2 = spanned.getSpanEnd(i41VarArr[i12]);
                int max = Math.max(i11, spanStart2);
                if (max - i11 > 0) {
                    f10 += textPaint3.measureText(spanned, i11, max);
                }
                i11 = Math.max(max, spanEnd2);
                if (i11 - max > 0) {
                    Typeface typeface = textPaint3.getTypeface();
                    textPaint3.setTypeface(i41VarArr[i12].f29312a);
                    textPaint3.setTypeface(typeface);
                    f10 = textPaint3.measureText(spanned, max, i11) + f10;
                }
            }
            int max2 = Math.max(i11, charSequence3.length());
            if (max2 - i11 > 0) {
                f10 += textPaint3.measureText(spanned, i11, max2);
            }
            return f10 + i10;
        }
        return textPaint3.measureText(charSequence3.toString()) + i10;
    }

    private int getTextMaxWidth() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        RectF rectF = this.f16369w;
        int i9 = measuredWidth - ((int) (rectF.left + rectF.right));
        int i10 = this.h;
        if (i10 > 0) {
            i9 = Math.min(i10, i9);
        }
        return Math.max(0, i9);
    }

    public void c(Canvas canvas, float f10) {
        int i9 = this.f16351g0;
        Paint paint = this.B;
        if (i9 != 0) {
            paint.setShadowLayer(this.f16348e0, 0.0f, this.f16350f0, org.telegram.ui.ActionBar.f6.l1(f10, i9));
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f10));
        Path path = this.f16360p0;
        canvas.drawPath(path, paint);
        paint.setAlpha(alpha);
        if (this.f16370w0) {
            int dp = AndroidUtilities.dp(64.0f);
            this.C0.reset();
            this.C0.postTranslate(this.f16358n0.left + (((this.f16365s0 * 4.0f) + (dp * 2)) * (((float) ((System.currentTimeMillis() - this.E0) % 4000)) / 4000.0f)) + (-dp), 0.0f);
            this.B0.setLocalMatrix(this.C0);
            this.D0.setLocalMatrix(this.C0);
            canvas.drawPath(path, this.f16375z0);
            canvas.drawPath(this.f16372x0, this.A0);
            invalidate();
        }
    }

    public final void d(Path path, float f10, float f11, float f12, RectF rectF, Rect rect) {
        float f13;
        float f14 = f10 / 2.0f;
        float f15 = f11 / 2.0f;
        float min = Math.min(this.v, Math.min(f14, f15));
        int i9 = this.f16340a;
        if (i9 != 1 && i9 != 3) {
            float clamp = Utilities.clamp(AndroidUtilities.lerp(getPaddingTop(), getMeasuredHeight() - getPaddingBottom(), this.f16342b) + this.f16344c, getMeasuredHeight() - getPaddingBottom(), getPaddingTop());
            float min2 = Math.min(Math.max(getPaddingTop(), clamp - f15) + f11, getMeasuredHeight() - getPaddingBottom());
            float f16 = min2 - f11;
            float f17 = this.f16373y;
            f13 = Utilities.clamp(clamp, (min2 - min) - f17, f16 + min + f17);
            if (this.f16340a == 0) {
                rectF.set(getPaddingLeft() + this.A, f16, getPaddingLeft() + this.A + f10, min2);
            } else {
                rectF.set(((getMeasuredWidth() - getPaddingRight()) - this.A) - f10, f16, (getMeasuredWidth() - getPaddingRight()) - this.A, min2);
            }
        } else {
            float clamp2 = Utilities.clamp(AndroidUtilities.lerp(getPaddingLeft(), getMeasuredWidth() - getPaddingRight(), this.f16342b) + this.f16344c, getMeasuredWidth() - getPaddingRight(), getPaddingLeft());
            float min3 = Math.min(Math.max(getPaddingLeft(), clamp2 - f14) + f10, getMeasuredWidth() - getPaddingRight());
            float f18 = min3 - f10;
            float f19 = this.f16373y;
            float clamp3 = Utilities.clamp(clamp2, (min3 - min) - f19, f18 + min + f19);
            if (this.f16340a == 1) {
                rectF.set(f18, getPaddingTop() + this.A, min3, getPaddingTop() + this.A + f11);
            } else {
                rectF.set(f18, ((getMeasuredHeight() - this.A) - getPaddingBottom()) - f11, min3, (getMeasuredHeight() - this.A) - getPaddingBottom());
            }
            f13 = clamp3;
        }
        float f20 = -f12;
        rectF.inset(f20, f20);
        if (rect != null) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        path.rewind();
        boolean z10 = this.f16364s;
        RectF rectF2 = this.F0;
        if (z10) {
            path.moveTo(rectF.left, rectF.bottom);
        } else {
            float f21 = rectF.left;
            float f22 = rectF.bottom;
            float f23 = min * 2.0f;
            rectF2.set(f21, f22 - f23, f23 + f21, f22);
            path.arcTo(rectF2, 90.0f, 90.0f);
        }
        if (this.f16340a == 0) {
            path.lineTo(rectF.left, this.f16373y + f13 + AndroidUtilities.dp(2.0f));
            path.lineTo(rectF.left, this.f16373y + f13);
            path.lineTo(rectF.left - this.A, AndroidUtilities.dp(1.0f) + f13);
            float f24 = rectF.left - this.A;
            this.f16361q0 = f24;
            this.f16363r0 = f13;
            path.lineTo(f24, f13 - AndroidUtilities.dp(1.0f));
            path.lineTo(rectF.left, f13 - this.f16373y);
            path.lineTo(rectF.left, (f13 - this.f16373y) - AndroidUtilities.dp(2.0f));
            if (rect != null) {
                rect.left = (int) (rect.left - this.A);
            }
        }
        if (this.f16364s) {
            path.lineTo(rectF.left, rectF.top);
        } else {
            float f25 = rectF.left;
            float f26 = rectF.top;
            float f27 = min * 2.0f;
            rectF2.set(f25, f26, f25 + f27, f27 + f26);
            path.arcTo(rectF2, 180.0f, 90.0f);
        }
        if (this.f16340a == 1) {
            path.lineTo((f13 - this.f16373y) - AndroidUtilities.dp(2.0f), rectF.top);
            path.lineTo(f13 - this.f16373y, rectF.top);
            path.lineTo(f13 - AndroidUtilities.dp(1.0f), rectF.top - this.A);
            this.f16361q0 = f13;
            this.f16363r0 = rectF.top - this.A;
            path.lineTo(AndroidUtilities.dp(1.0f) + f13, rectF.top - this.A);
            path.lineTo(this.f16373y + f13, rectF.top);
            path.lineTo(this.f16373y + f13 + AndroidUtilities.dp(2.0f), rectF.top);
            if (rect != null) {
                rect.top = (int) (rect.top - this.A);
            }
        }
        if (this.f16364s) {
            path.lineTo(rectF.right, rectF.top);
        } else {
            float f28 = rectF.right;
            float f29 = min * 2.0f;
            float f30 = rectF.top;
            rectF2.set(f28 - f29, f30, f28, f29 + f30);
            path.arcTo(rectF2, 270.0f, 90.0f);
        }
        if (this.f16340a == 2) {
            path.lineTo(rectF.right, (f13 - this.f16373y) - AndroidUtilities.dp(2.0f));
            path.lineTo(rectF.right, f13 - this.f16373y);
            path.lineTo(rectF.right + this.A, f13 - AndroidUtilities.dp(1.0f));
            float f31 = rectF.right + this.A;
            this.f16361q0 = f31;
            this.f16363r0 = f13;
            path.lineTo(f31, AndroidUtilities.dp(1.0f) + f13);
            path.lineTo(rectF.right, this.f16373y + f13);
            path.lineTo(rectF.right, this.f16373y + f13 + AndroidUtilities.dp(2.0f));
            if (rect != null) {
                rect.right = (int) (rect.right + this.A);
            }
        }
        if (this.f16364s) {
            path.lineTo(rectF.right, rectF.bottom);
        } else {
            float f32 = rectF.right;
            float f33 = min * 2.0f;
            float f34 = rectF.bottom;
            rectF2.set(f32 - f33, f34 - f33, f32, f34);
            path.arcTo(rectF2, 0.0f, 90.0f);
        }
        if (this.f16340a == 3) {
            path.lineTo(this.f16373y + f13 + AndroidUtilities.dp(2.0f), rectF.bottom);
            path.lineTo(this.f16373y + f13, rectF.bottom);
            path.lineTo(AndroidUtilities.dp(1.0f) + f13, rectF.bottom + this.A);
            this.f16361q0 = f13;
            this.f16363r0 = rectF.bottom + this.A;
            path.lineTo(f13 - AndroidUtilities.dp(1.0f), rectF.bottom + this.A);
            path.lineTo(f13 - this.f16373y, rectF.bottom);
            path.lineTo((f13 - this.f16373y) - AndroidUtilities.dp(2.0f), rectF.bottom);
            if (rect != null) {
                rect.bottom = (int) (rect.bottom + this.A);
            }
        }
        path.close();
        this.f16367u0 = true;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        float d;
        float f10;
        RectF rectF;
        float f11;
        float f12;
        float f13;
        x3 x3Var;
        float f14;
        Canvas canvas2;
        int paddingTop;
        int paddingRight;
        if (!this.E || this.H != null) {
            if (this.R && !this.f16368v0) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = this.S.e(z10);
            if (this.f16368v0) {
                this.f16368v0 = false;
                invalidate();
            }
            if (e10 <= 0.0f) {
                return;
            }
            boolean z11 = this.E;
            org.telegram.ui.Components.i6 i6Var = this.D;
            if (z11) {
                d = this.K;
            } else {
                d = i6Var.d();
            }
            if (this.E) {
                f10 = this.L;
            } else {
                f10 = i6Var.f29335e;
            }
            if (this.f16362r) {
                if (this.f16357n == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                    this.f16357n = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
                }
                d += this.f16371x + this.f16357n.getIntrinsicWidth();
                f10 = Math.max(this.f16357n.getIntrinsicHeight(), f10);
            }
            if (this.V != null) {
                d += this.f16343b0 + this.f16341a0;
                f10 = Math.max(this.f16345c0, f10);
            }
            float f15 = d;
            RectF rectF2 = this.f16369w;
            float f16 = rectF2.left + f15 + rectF2.right;
            float f17 = rectF2.top + f10 + rectF2.bottom;
            boolean z12 = this.f16367u0;
            RectF rectF3 = this.f16358n0;
            if (z12 && Math.abs(f16 - this.f16365s0) <= 0.1f && Math.abs(f17 - this.f16366t0) <= 0.1f) {
                rectF = rectF3;
            } else {
                this.f16365s0 = f16;
                this.f16366t0 = f17;
                d(this.f16360p0, f16, f17, 0.0f, rectF3, this.m0);
                rectF = rectF3;
                if (this.f16370w0) {
                    d(this.f16372x0, f16, f17, this.f16374y0, this.f16359o0, null);
                }
            }
            if (this.f16349f) {
                f11 = e10;
            } else {
                f11 = 1.0f;
            }
            canvas.save();
            if (e10 < 1.0f && this.f16347e) {
                float lerp = AndroidUtilities.lerp(0.75f, 1.0f, e10);
                canvas.scale(lerp, lerp, this.f16361q0, this.f16363r0);
            }
            float a2 = this.f16356l0.a(0.025f);
            if (a2 != 1.0f) {
                canvas.scale(a2, a2, this.f16361q0, this.f16363r0);
            }
            if (this.f16355k0 != 1.0f) {
                int i9 = this.f16340a;
                int i10 = -1;
                if (i9 != 3 && i9 != 1) {
                    if (i9 == 0) {
                        paddingRight = getPaddingLeft();
                    } else {
                        paddingRight = getPaddingRight();
                    }
                    float max = (this.f16355k0 - 1.0f) * Math.max(paddingRight, AndroidUtilities.dp(24.0f));
                    if (this.f16340a != 0) {
                        i10 = 1;
                    }
                    canvas.translate(max * i10, 0.0f);
                } else {
                    if (i9 == 3) {
                        paddingTop = getPaddingBottom();
                    } else {
                        paddingTop = getPaddingTop();
                    }
                    float max2 = (this.f16355k0 - 1.0f) * Math.max(paddingTop, AndroidUtilities.dp(24.0f));
                    if (this.f16340a != 1) {
                        i10 = 1;
                    }
                    canvas.translate(0.0f, max2 * i10);
                }
            }
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(rectF);
            float f18 = -this.A;
            rectF4.inset(f18, f18);
            c(canvas, f11);
            org.telegram.ui.Cells.z zVar = this.T;
            if (zVar != null) {
                zVar.setAlpha((int) (f11 * 255.0f));
                this.T.setBounds(this.m0);
                this.T.draw(canvas);
            }
            float f19 = ((rectF.top + rectF2.top) + (rectF.bottom - rectF2.bottom)) / 2.0f;
            mi0 mi0Var = this.V;
            if (mi0Var != null) {
                if (this.f16346d0) {
                    float f20 = (rectF2.left / 2.0f) + rectF.left + 0.0f;
                    float f21 = this.W + f19;
                    f12 = 255.0f;
                    float f22 = this.f16345c0 / 2.0f;
                    mi0Var.setBounds((int) f20, (int) (f21 - f22), (int) (f20 + this.f16343b0), (int) (f22 + f21));
                    f13 = this.f16343b0 + this.f16341a0 + 0.0f;
                } else {
                    f12 = 255.0f;
                    float f23 = (0.0f + rectF.right) - (rectF2.right / 2.0f);
                    float f24 = this.W + f19;
                    float f25 = this.f16345c0 / 2.0f;
                    mi0Var.setBounds((int) (f23 - this.f16343b0), (int) (f24 - f25), (int) f23, (int) (f25 + f24));
                    f13 = 0.0f;
                }
                this.V.setAlpha((int) (f11 * f12));
                this.V.draw(canvas);
            } else {
                f12 = 255.0f;
                f13 = 0.0f;
            }
            if (this.E) {
                f14 = f11;
                x3Var = this;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), Math.max(getHeight(), f17), (int) (f11 * f12), 31);
                float f26 = ((f13 + rectF.left) + rectF2.left) - x3Var.J;
                x3Var.N = f26;
                float f27 = f19 - (x3Var.L / 2.0f);
                x3Var.O = f27;
                canvas2.translate(f26, f27);
                if (x3Var.M.f(canvas2)) {
                    x3Var.invalidate();
                }
                x3Var.H.draw(canvas2);
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas2, x3Var.H, x3Var.I, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
                canvas2.restore();
            } else {
                x3Var = this;
                f14 = f11;
                canvas2 = canvas;
                CharSequence charSequence = x3Var.C;
                if (charSequence != null) {
                    i6Var.q(charSequence, x3Var.R, true);
                    x3Var.C = null;
                }
                float f28 = rectF.left;
                float f29 = rectF2.left;
                float f30 = x3Var.L / 2.0f;
                i6Var.setBounds((int) (f13 + f28 + f29), (int) (f19 - f30), (int) (f28 + f29 + f15), (int) (f30 + f19));
                i6Var.f29351w = (int) (f14 * f12);
                i6Var.draw(canvas2);
            }
            if (x3Var.f16362r) {
                if (x3Var.f16357n == null) {
                    Drawable mutate2 = x3Var.getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                    x3Var.f16357n = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
                }
                x3Var.f16357n.setAlpha((int) (f14 * f12));
                Drawable drawable = x3Var.f16357n;
                drawable.setBounds((int) ((rectF.right - (rectF2.right * 0.66f)) - drawable.getIntrinsicWidth()), (int) (rectF.centerY() - (x3Var.f16357n.getIntrinsicHeight() / 2.0f)), (int) (rectF.right - (rectF2.right * 0.66f)), (int) ((x3Var.f16357n.getIntrinsicHeight() / 2.0f) + rectF.centerY()));
                x3Var.f16357n.draw(canvas2);
            }
            canvas2.restore();
        }
    }

    public final void e(boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.f16353i0);
        Runnable runnable = this.f16352h0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        this.R = false;
        org.telegram.ui.Components.y5 y5Var = this.S;
        if (!z10) {
            y5Var.getClass();
            y5Var.d(0.0f, false);
        }
        invalidate();
        Runnable runnable2 = this.f16352h0;
        if (runnable2 != null) {
            AndroidUtilities.runOnUIThread(runnable2, y5Var.f34854c * ((float) y5Var.f34857g));
        }
        this.M.d(true);
    }

    public final void f(int i9, CharSequence charSequence) {
        this.H = new StaticLayout(charSequence, this.F, i9, this.G, 1.0f, 0.0f, false);
        float f10 = i9;
        float f11 = 0.0f;
        for (int i10 = 0; i10 < this.H.getLineCount(); i10++) {
            f10 = Math.min(f10, this.H.getLineLeft(i10));
            f11 = Math.max(f11, this.H.getLineRight(i10));
        }
        this.K = Math.max(0.0f, f11 - f10);
        this.L = this.H.getHeight();
        this.J = f10;
        this.I = org.telegram.ui.Components.t5.update(0, this, this.I, this.H);
    }

    public CharSequence getText() {
        CharSequence charSequence = this.C;
        if (charSequence != null) {
            return charSequence;
        }
        if (!this.E) {
            return this.D.f29337g;
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
        return this.D.f29332a;
    }

    public final void h(int i9) {
        Paint paint = this.B;
        if (paint.getColor() != i9) {
            paint.setColor(i9);
            invalidate();
        }
    }

    public final void i() {
        this.f16362r = true;
        if (!this.E) {
            float f10 = 11.0f;
            float dp = AndroidUtilities.dp(11.0f);
            float dp2 = AndroidUtilities.dp(6.0f);
            if (this.f16362r) {
                f10 = 15.0f;
            }
            this.f16369w.set(dp, dp2, AndroidUtilities.dp(f10), AndroidUtilities.dp(7.0f));
        }
    }

    public final void j(int i9) {
        mi0 mi0Var = new mi0(i9, AndroidUtilities.dp(34.0f), j3.r0.l(i9, ""), AndroidUtilities.dp(34.0f));
        mi0Var.start();
        k(mi0Var);
    }

    public final void k(mi0 mi0Var) {
        mi0 mi0Var2 = this.V;
        if (mi0Var2 != null) {
            mi0Var2.setCallback(null);
        }
        this.V = mi0Var;
        mi0Var.setCallback(this);
        mi0 mi0Var3 = this.V;
        if (e2.c.v(mi0Var3)) {
            this.d = Math.max(this.d, mi0Var3.p());
        }
        mi0 mi0Var4 = this.V;
        this.f16343b0 = mi0Var4.f30842b;
        this.f16345c0 = mi0Var4.f30844c;
        this.f16346d0 = true;
    }

    public final void l(float f10, float f11, float f12, float f13) {
        this.f16369w.set(AndroidUtilities.dpf2(f10), AndroidUtilities.dpf2(f11), AndroidUtilities.dpf2(f12), AndroidUtilities.dpf2(f13));
    }

    public final void m(float f10, float f11) {
        if (Math.abs(this.f16342b - f10) >= 1.0f || Math.abs(this.f16344c - AndroidUtilities.dp(f11)) >= 1.0f) {
            this.f16367u0 = false;
            invalidate();
        }
        this.f16342b = f10;
        this.f16344c = AndroidUtilities.dp(f11);
    }

    public final void n(float f10, float f11) {
        if (Math.abs(this.f16342b - f10) >= 1.0f || Math.abs(this.f16344c - f11) >= 1.0f) {
            this.f16367u0 = false;
            invalidate();
        }
        this.f16342b = f10;
        this.f16344c = f11;
    }

    public final void o() {
        this.h = AndroidUtilities.dp(165.0f);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.t5.release(this, this.I);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        this.f16367u0 = false;
        int textMaxWidth = getTextMaxWidth();
        org.telegram.ui.Components.i6 i6Var = this.D;
        i6Var.G = textMaxWidth;
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
                i6Var.q(charSequence2, false, true);
            }
        }
        this.C = null;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: kh.x3.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i9) {
        this.h = i9;
    }

    public final void q(boolean z10) {
        this.E = z10;
        RectF rectF = this.f16369w;
        float f10 = 15.0f;
        if (z10) {
            rectF.set(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
            this.f16371x = AndroidUtilities.dp(6.0f);
            return;
        }
        float dp = AndroidUtilities.dp(11.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        if (!this.f16362r) {
            f10 = 11.0f;
        }
        rectF.set(dp, dp2, AndroidUtilities.dp(f10), AndroidUtilities.dp(7.0f));
        this.f16371x = AndroidUtilities.dp(2.0f);
    }

    public final void r(float f10) {
        CornerPathEffect cornerPathEffect;
        this.v = AndroidUtilities.dp(f10);
        CornerPathEffect cornerPathEffect2 = null;
        if (this.f16364s) {
            cornerPathEffect = new CornerPathEffect(this.v);
        } else {
            cornerPathEffect = null;
        }
        this.B.setPathEffect(cornerPathEffect);
        Paint paint = this.U;
        if (paint != null) {
            if (this.f16364s) {
                cornerPathEffect2 = new CornerPathEffect(this.v);
            }
            paint.setPathEffect(cornerPathEffect2);
        }
    }

    public final void s() {
        this.f16364s = false;
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

    public final void u(float f10) {
        this.D.t(AndroidUtilities.dpf2(f10));
        this.F.setTextSize(AndroidUtilities.dpf2(f10));
    }

    public final void v() {
        if (this.R && this.Q) {
            ValueAnimator valueAnimator = this.f16354j0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f16354j0 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f16354j0 = ofFloat;
            ofFloat.addUpdateListener(new bg.b(this, 29));
            this.f16354j0.addListener(new ag.e(this, 23));
            this.f16354j0.setInterpolator(gr.f28848k);
            this.f16354j0.setDuration(300L);
            this.f16354j0.start();
        }
        AndroidUtilities.makeAccessibilityAnnouncement(getText());
        this.R = true;
        invalidate();
        zk0 zk0Var = this.f16353i0;
        AndroidUtilities.cancelRunOnUIThread(zk0Var);
        long j10 = this.d;
        if (j10 > 0) {
            AndroidUtilities.runOnUIThread(zk0Var, j10);
        }
        Runnable runnable = this.f16352h0;
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
