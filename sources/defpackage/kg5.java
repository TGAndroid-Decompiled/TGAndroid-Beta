package defpackage;

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
import org.telegram.messenger.Utilities;
public class kg5 extends View {
    public float A0;
    public final v41 B0;
    public final Rect C0;
    public final RectF D0;
    public float E;
    public final RectF E0;
    public float F;
    public final Path F0;
    public final Paint G;
    public float G0;
    public CharSequence H;
    public float H0;
    public final hn I;
    public float I0;
    public boolean J;
    public float J0;
    public final TextPaint K;
    public boolean K0;
    public Layout.Alignment L;
    public boolean L0;
    public StaticLayout M;
    public boolean M0;
    public dm N;
    public Path N0;
    public float O;
    public float O0;
    public float P;
    public Paint P0;
    public float Q;
    public Paint Q0;
    public final m66 R;
    public LinearGradient R0;
    public float S;
    public Matrix S0;
    public float T;
    public LinearGradient T0;
    public boolean U;
    public long U0;
    public boolean V;
    public final RectF V0;
    public boolean W;
    public q66 W0;
    public byte a;
    public final mm a0;
    public float b;
    public hf0 b0;
    public float c;
    public Paint c0;
    public long d;
    public Drawable d0;
    public boolean e;
    public float e0;
    public final boolean f;
    public int f0;
    public int g0;
    public int h;
    public int h0;
    public boolean i0;
    public float j0;
    public float k0;
    public int l0;
    public jl0 m0;
    public Drawable n;
    public final float n0;
    public final float o0;
    public final float p0;
    public final float q0;
    public boolean r;
    public Runnable r0;
    public boolean s;
    public View s0;
    public float t0;
    public float u0;
    public float v0;
    public float w;
    public float w0;
    public final RectF x;
    public final int[] x0;
    public float y;
    public final ug y0;
    public ValueAnimator z0;

    public kg5(Context context, int i) {
        super(context);
        this.b = 0.5f;
        this.c = 0.0f;
        this.d = 3500L;
        this.e = true;
        this.f = true;
        this.h = -1;
        this.s = true;
        this.w = hl.L(8.0f);
        this.x = new RectF(hl.L(11.0f), hl.L(6.0f), hl.L(11.0f), hl.L(7.0f));
        this.y = hl.L(2.0f);
        this.E = hl.L(7.0f);
        this.F = hl.L(6.0f);
        Paint paint = new Paint(1);
        this.G = paint;
        TextPaint textPaint = new TextPaint(1);
        this.K = textPaint;
        this.L = Layout.Alignment.ALIGN_NORMAL;
        this.R = new m66();
        this.U = true;
        this.V = true;
        k43 k43Var = k43.h;
        this.a0 = new mm(350L, this, k43Var);
        this.f0 = hl.L(2.0f);
        this.n0 = hl.N(4.0f);
        this.o0 = hl.N(4.0f);
        this.p0 = hl.N(5.0f);
        this.q0 = hl.N(2.0f);
        this.t0 = Float.NaN;
        this.x0 = new int[2];
        this.y0 = new ug(this, (byte) 4);
        this.A0 = 1.0f;
        this.B0 = new v41(this, 2.0f, 5.0f);
        this.C0 = new Rect();
        this.D0 = new RectF();
        this.E0 = new RectF();
        this.F0 = new Path();
        this.L0 = true;
        this.V0 = new RectF();
        this.a = i;
        paint.setColor(-433575896);
        paint.setPathEffect(new CornerPathEffect(this.w));
        hn hnVar = new hn(true, true, false);
        this.I = hnVar;
        hnVar.n(0.4f, 320L, k43Var);
        hnVar.setCallback(this);
        u(14.0f);
        hnVar.u(-1);
        textPaint.setColor(-1);
    }

    public static int a(CharSequence charSequence, TextPaint textPaint) {
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return Integer.MAX_VALUE;
        }
        int length = charSequence.length() / 2;
        float f = 0.0f;
        int i = 0;
        int i2 = -1;
        float f2 = 0.0f;
        float f3 = Float.MAX_VALUE;
        float f4 = 0.0f;
        while (i < 10) {
            while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                length += i2;
            }
            f4 = h(charSequence.subSequence(0, length), textPaint);
            f2 = h(hl.m1(charSequence.subSequence(length, charSequence.length())), textPaint);
            if (f4 != f || f2 != f3) {
                if (f4 < f2) {
                    length++;
                    i2 = 1;
                } else {
                    length--;
                    i2 = -1;
                }
                if (length <= 0 || length >= charSequence.length()) {
                    break;
                }
                i++;
                f = f4;
                f3 = f2;
            } else {
                break;
            }
        }
        return (int) Math.ceil(Math.max(f4, f2));
    }

    public static CharSequence b(CharSequence charSequence, TextPaint textPaint) {
        int i;
        if (TextUtils.indexOf(charSequence, '\n') < 0) {
            int length = charSequence.length() / 2;
            float f = Float.MAX_VALUE;
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            float f2 = 0.0f;
            float f3 = Float.MAX_VALUE;
            while (i2 < 10) {
                while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                    length += i3;
                }
                float h = h(charSequence.subSequence(0, length), textPaint);
                float h2 = h(hl.m1(charSequence.subSequence(length, charSequence.length())), textPaint);
                if (length > 0 && length < charSequence.length() && Math.max(h, h2) < f) {
                    f = Math.max(h, h2);
                    i4 = length;
                }
                if (h != f2 || h2 != f3) {
                    if (h < h2) {
                        length++;
                        i = 1;
                    } else {
                        length--;
                        i = -1;
                    }
                    if (length <= 0 || length >= charSequence.length()) {
                        break;
                    }
                    i2++;
                    f2 = h;
                    i3 = i;
                    f3 = h2;
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                return TextUtils.concat(hl.m1(charSequence.subSequence(0, i4)), "\n", hl.m1(charSequence.subSequence(i4, charSequence.length())));
            }
        }
        return charSequence;
    }

    private int getTextMaxWidth() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        RectF rectF = this.x;
        int i = measuredWidth - ((int) (rectF.left + rectF.right));
        int i2 = this.h;
        if (i2 > 0) {
            i = Math.min(i2, i);
        }
        return Math.max(0, i);
    }

    public static float h(CharSequence charSequence, TextPaint textPaint) {
        int spanStart;
        int spanEnd;
        CharSequence charSequence2;
        float f = 0.0f;
        if (charSequence == null) {
            return 0.0f;
        }
        if (!(charSequence instanceof Spanned)) {
            return textPaint.measureText(charSequence.toString());
        }
        Spanned spanned = (Spanned) charSequence;
        y7c[] y7cVarArr = (y7c[]) spanned.getSpans(0, charSequence.length(), y7c.class);
        ReplacementSpan[] replacementSpanArr = (ReplacementSpan[]) spanned.getSpans(0, charSequence.length(), ReplacementSpan.class);
        int i = 0;
        int i2 = 0;
        while (i < replacementSpanArr.length) {
            ReplacementSpan replacementSpan = replacementSpanArr[i];
            TextPaint textPaint2 = textPaint;
            i2 = (int) (Math.max(0.0f, replacementSpan.getSize(textPaint2, charSequence2, spanStart, spanEnd, textPaint.getFontMetricsInt()) - textPaint2.measureText(spanned, spanned.getSpanStart(replacementSpan), spanned.getSpanEnd(replacementSpan))) + i2);
            i++;
            textPaint = textPaint2;
            charSequence = charSequence;
        }
        CharSequence charSequence3 = charSequence;
        TextPaint textPaint3 = textPaint;
        if (y7cVarArr != null && y7cVarArr.length != 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < y7cVarArr.length; i4++) {
                int spanStart2 = spanned.getSpanStart(y7cVarArr[i4]);
                int spanEnd2 = spanned.getSpanEnd(y7cVarArr[i4]);
                int max = Math.max(i3, spanStart2);
                if (max - i3 > 0) {
                    f += textPaint3.measureText(spanned, i3, max);
                }
                i3 = Math.max(max, spanEnd2);
                if (i3 - max > 0) {
                    Typeface typeface = textPaint3.getTypeface();
                    textPaint3.setTypeface(y7cVarArr[i4].a);
                    textPaint3.setTypeface(typeface);
                    f = textPaint3.measureText(spanned, max, i3) + f;
                }
            }
            int max2 = Math.max(i3, charSequence3.length());
            if (max2 - i3 > 0) {
                f += textPaint3.measureText(spanned, i3, max2);
            }
            return f + i2;
        }
        return textPaint3.measureText(charSequence3.toString()) + i2;
    }

    public void c(Canvas canvas, float f) {
        jl0 jl0Var = this.m0;
        if (jl0Var != null) {
            jl0Var.setAlpha(Math.max(1, (int) (f * 255.0f)));
            this.m0.draw(canvas);
            d(canvas);
            return;
        }
        int i = this.l0;
        Paint paint = this.G;
        if (i != 0) {
            paint.setShadowLayer(this.j0, 0.0f, this.k0, aob.p1(f, i));
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f));
        canvas.drawPath(this.F0, paint);
        paint.setAlpha(alpha);
        d(canvas);
    }

    public final void d(Canvas canvas) {
        if (this.M0) {
            int L = hl.L(64.0f);
            float currentTimeMillis = ((float) ((System.currentTimeMillis() - this.U0) % 4000)) / 4000.0f;
            float v = uh9.v(this.I0 * 4.0f, L << 1, currentTimeMillis, -L);
            this.S0.reset();
            this.S0.postTranslate(this.D0.left + v, 0.0f);
            this.R0.setLocalMatrix(this.S0);
            this.T0.setLocalMatrix(this.S0);
            canvas.drawPath(this.F0, this.P0);
            canvas.drawPath(this.N0, this.Q0);
            invalidate();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        float c;
        float f;
        RectF rectF;
        RectF rectF2;
        boolean z2;
        float f2;
        float f3;
        float f4;
        float f5;
        kg5 kg5Var;
        RectF rectF3;
        float f6;
        float f7;
        float f8;
        float f9;
        Canvas canvas2;
        Drawable drawable;
        float f10;
        int paddingBottom;
        int paddingRight;
        if (!this.J || this.M != null) {
            if (this.W && !this.L0) {
                z = true;
            } else {
                z = false;
            }
            float d = this.a0.d(z);
            if (this.L0) {
                this.L0 = false;
                invalidate();
            }
            if (d <= 0.0f) {
                jl0 jl0Var = this.m0;
                if (jl0Var != null) {
                    jl0Var.setAlpha(0);
                    return;
                }
                return;
            }
            boolean z3 = this.J;
            hn hnVar = this.I;
            if (z3) {
                c = this.P;
            } else {
                c = hnVar.c();
            }
            if (this.J) {
                f = this.Q;
            } else {
                f = hnVar.e;
            }
            if (this.r) {
                if (this.n == null) {
                    Drawable mutate = getContext().getResources().getDrawable(2131232240).mutate();
                    this.n = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
                }
                c += this.y + this.n.getIntrinsicWidth();
                f = Math.max(this.n.getIntrinsicHeight(), f);
            }
            if (this.d0 != null) {
                c += this.g0 + this.f0;
                f = Math.max(this.h0, f);
            }
            float f11 = c;
            RectF rectF4 = this.x;
            float f12 = rectF4.left + f11 + rectF4.right;
            float f13 = rectF4.top + f + rectF4.bottom;
            boolean z4 = this.K0;
            RectF rectF5 = this.D0;
            if (z4 && Math.abs(f12 - this.I0) <= 0.1f && Math.abs(f13 - this.J0) <= 0.1f) {
                kg5Var = this;
                rectF = rectF4;
                f6 = f13;
                rectF3 = rectF5;
                f5 = f11;
            } else {
                this.I0 = f12;
                this.J0 = f13;
                rectF = rectF4;
                e(this.F0, f12, f13, 0.0f, rectF5, this.C0);
                if (this.m0 == null) {
                    rectF2 = rectF5;
                    f3 = f12;
                    f4 = f13;
                    f5 = f11;
                } else {
                    int round = Math.round(this.F);
                    int round2 = Math.round(rectF5.left);
                    int round3 = Math.round(rectF5.top);
                    int round4 = Math.round(rectF5.right);
                    int round5 = Math.round(rectF5.bottom);
                    byte b = this.a;
                    rectF2 = rectF5;
                    if (b != 0) {
                        if (b != 1) {
                            if (b != 2) {
                                round5 += round;
                            } else {
                                round4 += round;
                            }
                        } else {
                            round3 -= round;
                        }
                    } else {
                        round2 -= round;
                    }
                    if (b != 0 && b != 2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    jl0 jl0Var2 = this.m0;
                    if (z2) {
                        f2 = this.H0;
                    } else {
                        f2 = this.G0;
                    }
                    float f14 = round;
                    f3 = f12;
                    il0 il0Var = jl0Var2.S;
                    int i = il0Var.n;
                    f4 = f13;
                    float f15 = this.n0;
                    f5 = f11;
                    float f16 = this.o0;
                    if (i != b || il0Var.o != f2 || il0Var.p != f14 || il0Var.q != f15 || il0Var.r != f16) {
                        il0Var.n = b;
                        il0Var.o = f2;
                        il0Var.p = f14;
                        il0Var.q = f15;
                        il0Var.r = f16;
                        il0Var.a();
                        jl0Var2.n();
                        jl0Var2.invalidateSelf();
                    }
                    this.m0.setBounds(round2, round3, round4, round5);
                }
                if (this.M0) {
                    rectF3 = rectF2;
                    f6 = f4;
                    e(this.N0, f3, f6, this.O0, this.E0, null);
                    kg5Var = this;
                } else {
                    kg5Var = this;
                    rectF3 = rectF2;
                    f6 = f4;
                }
            }
            if (kg5Var.f) {
                f7 = d;
            } else {
                f7 = 1.0f;
            }
            canvas.save();
            if (d < 1.0f && kg5Var.e) {
                float R1 = hl.R1(0.75f, 1.0f, d);
                canvas.scale(R1, R1, kg5Var.G0, kg5Var.H0);
            }
            float a = kg5Var.B0.a(0.025f);
            if (a != 1.0f) {
                canvas.scale(a, a, kg5Var.G0, kg5Var.H0);
            }
            if (kg5Var.A0 != 1.0f) {
                byte b2 = kg5Var.a;
                int i2 = -1;
                if (b2 != 3) {
                    if (b2 == 1) {
                        paddingBottom = kg5Var.getPaddingTop();
                    } else {
                        if (b2 == 0) {
                            paddingRight = kg5Var.getPaddingLeft();
                        } else {
                            paddingRight = kg5Var.getPaddingRight();
                        }
                        float max = (kg5Var.A0 - 1.0f) * Math.max(paddingRight, hl.L(24.0f));
                        if (kg5Var.a != 0) {
                            i2 = 1;
                        }
                        canvas.translate(max * i2, 0.0f);
                    }
                } else {
                    paddingBottom = kg5Var.getPaddingBottom();
                }
                float max2 = (kg5Var.A0 - 1.0f) * Math.max(paddingBottom, hl.L(24.0f));
                if (kg5Var.a != 1) {
                    i2 = 1;
                }
                canvas.translate(0.0f, max2 * i2);
            }
            RectF rectF6 = hl.P;
            rectF6.set(rectF3);
            float f17 = -kg5Var.F;
            rectF6.inset(f17, f17);
            kg5Var.c(canvas, f7);
            hf0 hf0Var = kg5Var.b0;
            if (hf0Var != null) {
                hf0Var.setAlpha((int) (f7 * 255.0f));
                kg5Var.b0.setBounds(kg5Var.C0);
                kg5Var.b0.draw(canvas);
            }
            float f18 = ((rectF3.top + rectF.top) + (rectF3.bottom - rectF.bottom)) / 2.0f;
            Drawable drawable2 = kg5Var.d0;
            if (drawable2 != null) {
                if (kg5Var.i0) {
                    float f19 = (rectF.left / 2.0f) + 0.0f + rectF3.left;
                    float f20 = kg5Var.e0 + f18;
                    float f21 = kg5Var.h0 / 2.0f;
                    f8 = 255.0f;
                    drawable2.setBounds((int) f19, (int) (f20 - f21), (int) (f19 + kg5Var.g0), (int) (f21 + f20));
                    f10 = kg5Var.g0 + kg5Var.f0 + 0.0f;
                } else {
                    f8 = 255.0f;
                    float f22 = (0.0f + rectF3.right) - (rectF.right / 2.0f);
                    float f23 = kg5Var.e0 + f18;
                    float f24 = kg5Var.h0 / 2.0f;
                    drawable2.setBounds((int) (f22 - kg5Var.g0), (int) (f23 - f24), (int) f22, (int) (f24 + f23));
                    f10 = 0.0f;
                }
                kg5Var.d0.setAlpha((int) (f7 * f8));
                kg5Var.d0.draw(canvas);
                f9 = f10;
            } else {
                f8 = 255.0f;
                f9 = 0.0f;
            }
            if (kg5Var.J) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, kg5Var.getWidth(), Math.max(kg5Var.getHeight(), f6), (int) (f7 * f8), 31);
                float f25 = ((f9 + rectF3.left) + rectF.left) - kg5Var.O;
                kg5Var.S = f25;
                float f26 = f18 - (kg5Var.Q / 2.0f);
                kg5Var.T = f26;
                canvas2.translate(f25, f26);
                if (kg5Var.R.g(canvas2)) {
                    kg5Var.invalidate();
                }
                kg5Var.M.draw(canvas2);
                hm.drawAnimatedEmojis(canvas2, kg5Var.M, kg5Var.N, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
                canvas2.restore();
            } else {
                canvas2 = canvas;
                CharSequence charSequence = kg5Var.H;
                if (charSequence != null) {
                    hnVar.t(charSequence, kg5Var.W, true);
                    kg5Var.H = null;
                }
                float f27 = rectF3.left;
                float f28 = rectF.left;
                float f29 = kg5Var.Q / 2.0f;
                hnVar.setBounds((int) (f9 + f27 + f28), (int) (f18 - f29), (int) (f27 + f28 + f5), (int) (f29 + f18));
                hnVar.C = (int) (f7 * f8);
                hnVar.draw(canvas2);
            }
            if (kg5Var.r) {
                if (kg5Var.n == null) {
                    Drawable mutate2 = kg5Var.getContext().getResources().getDrawable(2131232240).mutate();
                    kg5Var.n = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
                }
                kg5Var.n.setAlpha((int) (f7 * f8));
                kg5Var.n.setBounds((int) ((rectF3.right - (rectF.right * 0.66f)) - drawable.getIntrinsicWidth()), (int) (rectF3.centerY() - (kg5Var.n.getIntrinsicHeight() / 2.0f)), (int) (rectF3.right - (rectF.right * 0.66f)), (int) ((kg5Var.n.getIntrinsicHeight() / 2.0f) + rectF3.centerY()));
                kg5Var.n.draw(canvas2);
            }
            canvas2.restore();
        }
    }

    public final void e(Path path, float f, float f2, float f3, RectF rectF, Rect rect) {
        float f4;
        float f5 = f / 2.0f;
        float f6 = f2 / 2.0f;
        float min = Math.min(this.w, Math.min(f5, f6));
        byte b = this.a;
        if (b != 1 && b != 3) {
            float i = Utilities.i(hl.U1(this.b, getPaddingTop(), getMeasuredHeight() - getPaddingBottom()) + this.c, getMeasuredHeight() - getPaddingBottom(), getPaddingTop());
            float min2 = Math.min(Math.max(getPaddingTop(), i - f6) + f2, getMeasuredHeight() - getPaddingBottom());
            float f7 = min2 - f2;
            float f8 = this.E;
            f4 = Utilities.i(i, (min2 - min) - f8, f7 + min + f8);
            if (this.a == 0) {
                rectF.set(getPaddingLeft() + this.F, f7, getPaddingLeft() + this.F + f, min2);
            } else {
                rectF.set(((getMeasuredWidth() - getPaddingRight()) - this.F) - f, f7, (getMeasuredWidth() - getPaddingRight()) - this.F, min2);
            }
        } else {
            float i2 = Utilities.i(hl.U1(this.b, getPaddingLeft(), getMeasuredWidth() - getPaddingRight()) + this.c, getMeasuredWidth() - getPaddingRight(), getPaddingLeft());
            float min3 = Math.min(Math.max(getPaddingLeft(), i2 - f5) + f, getMeasuredWidth() - getPaddingRight());
            float f9 = min3 - f;
            float f10 = this.E;
            float i3 = Utilities.i(i2, (min3 - min) - f10, f9 + min + f10);
            if (this.a == 1) {
                rectF.set(f9, getPaddingTop() + this.F, min3, getPaddingTop() + this.F + f2);
            } else {
                rectF.set(f9, ((getMeasuredHeight() - this.F) - getPaddingBottom()) - f2, min3, (getMeasuredHeight() - this.F) - getPaddingBottom());
            }
            f4 = i3;
        }
        float f11 = -f3;
        rectF.inset(f11, f11);
        if (rect != null) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        path.rewind();
        boolean z = this.s;
        float f12 = rectF.left;
        RectF rectF2 = this.V0;
        if (z) {
            path.moveTo(f12, rectF.bottom);
        } else {
            float f13 = rectF.bottom;
            float f14 = min * 2.0f;
            rectF2.set(f12, f13 - f14, f14 + f12, f13);
            path.arcTo(rectF2, 90.0f, 90.0f);
        }
        if (this.a == 0) {
            path.lineTo(rectF.left, this.E + f4 + hl.L(2.0f));
            path.lineTo(rectF.left, this.E + f4);
            path.lineTo(rectF.left - this.F, hl.L(1.0f) + f4);
            float f15 = rectF.left - this.F;
            this.G0 = f15;
            this.H0 = f4;
            path.lineTo(f15, f4 - hl.L(1.0f));
            path.lineTo(rectF.left, f4 - this.E);
            path.lineTo(rectF.left, (f4 - this.E) - hl.L(2.0f));
            if (rect != null) {
                rect.left = (int) (rect.left - this.F);
            }
        }
        boolean z2 = this.s;
        float f16 = rectF.left;
        if (z2) {
            path.lineTo(f16, rectF.top);
        } else {
            float f17 = rectF.top;
            float f18 = min * 2.0f;
            rectF2.set(f16, f17, f16 + f18, f18 + f17);
            path.arcTo(rectF2, 180.0f, 90.0f);
        }
        if (this.a == 1) {
            path.lineTo((f4 - this.E) - hl.L(2.0f), rectF.top);
            path.lineTo(f4 - this.E, rectF.top);
            path.lineTo(f4 - hl.L(1.0f), rectF.top - this.F);
            this.G0 = f4;
            this.H0 = rectF.top - this.F;
            path.lineTo(hl.L(1.0f) + f4, rectF.top - this.F);
            path.lineTo(this.E + f4, rectF.top);
            path.lineTo(this.E + f4 + hl.L(2.0f), rectF.top);
            if (rect != null) {
                rect.top = (int) (rect.top - this.F);
            }
        }
        boolean z3 = this.s;
        float f19 = rectF.right;
        if (z3) {
            path.lineTo(f19, rectF.top);
        } else {
            float f20 = min * 2.0f;
            float f21 = rectF.top;
            rectF2.set(f19 - f20, f21, f19, f20 + f21);
            path.arcTo(rectF2, 270.0f, 90.0f);
        }
        if (this.a == 2) {
            path.lineTo(rectF.right, (f4 - this.E) - hl.L(2.0f));
            path.lineTo(rectF.right, f4 - this.E);
            path.lineTo(rectF.right + this.F, f4 - hl.L(1.0f));
            float f22 = rectF.right + this.F;
            this.G0 = f22;
            this.H0 = f4;
            path.lineTo(f22, hl.L(1.0f) + f4);
            path.lineTo(rectF.right, this.E + f4);
            path.lineTo(rectF.right, this.E + f4 + hl.L(2.0f));
            if (rect != null) {
                rect.right = (int) (rect.right + this.F);
            }
        }
        boolean z4 = this.s;
        float f23 = rectF.right;
        if (z4) {
            path.lineTo(f23, rectF.bottom);
        } else {
            float f24 = min * 2.0f;
            float f25 = rectF.bottom;
            rectF2.set(f23 - f24, f25 - f24, f23, f25);
            path.arcTo(rectF2, 0.0f, 90.0f);
        }
        if (this.a == 3) {
            path.lineTo(this.E + f4 + hl.L(2.0f), rectF.bottom);
            path.lineTo(this.E + f4, rectF.bottom);
            path.lineTo(hl.L(1.0f) + f4, rectF.bottom + this.F);
            this.G0 = f4;
            this.H0 = rectF.bottom + this.F;
            path.lineTo(f4 - hl.L(1.0f), rectF.bottom + this.F);
            path.lineTo(f4 - this.E, rectF.bottom);
            path.lineTo((f4 - this.E) - hl.L(2.0f), rectF.bottom);
            if (rect != null) {
                rect.bottom = (int) (rect.bottom + this.F);
            }
        }
        path.close();
        this.K0 = true;
    }

    public final void f(boolean z) {
        hl.r(this.y0);
        Runnable runnable = this.r0;
        if (runnable != null) {
            hl.r(runnable);
        }
        this.W = false;
        mm mmVar = this.a0;
        if (!z) {
            mmVar.getClass();
            mmVar.e(false, 0.0f);
        }
        invalidate();
        Runnable runnable2 = this.r0;
        if (runnable2 != null) {
            hl.d3(runnable2, mmVar.c * ((float) mmVar.g));
        }
        this.R.e(true);
    }

    public final void g(int i, CharSequence charSequence) {
        this.M = new StaticLayout(charSequence, this.K, i, this.L, 1.0f, 0.0f, false);
        float f = i;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < this.M.getLineCount(); i2++) {
            f = Math.min(f, this.M.getLineLeft(i2));
            f2 = Math.max(f2, this.M.getLineRight(i2));
        }
        this.P = Math.max(0.0f, f2 - f);
        this.Q = this.M.getHeight();
        this.O = f;
        this.N = hm.update(0, this, this.N, this.M);
    }

    public View getAnchorView() {
        return this.s0;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.H;
        if (charSequence != null) {
            return charSequence;
        }
        if (!this.J) {
            return this.I.i;
        }
        StaticLayout staticLayout = this.M;
        if (staticLayout != null) {
            return staticLayout.getText();
        }
        return null;
    }

    public TextPaint getTextPaint() {
        if (this.J) {
            return this.K;
        }
        return this.I.a;
    }

    public final void i(int i) {
        Paint paint = this.G;
        if (paint.getColor() != i) {
            paint.setColor(i);
            invalidate();
        }
    }

    public final void j(boolean z) {
        this.r = z;
        if (!this.J) {
            float f = 11.0f;
            float L = hl.L(11.0f);
            float L2 = hl.L(6.0f);
            if (this.r) {
                f = 15.0f;
            }
            this.x.set(L, L2, hl.L(f), hl.L(7.0f));
        }
    }

    public final void k(ll0 ll0Var) {
        ol0 ol0Var = new ol0(null);
        ol0Var.e = new xz((byte) 10);
        ol0Var.f(872415231, 872415231);
        ol0Var.e(452984831, 452984831);
        ol0Var.d(808661811, 805306368);
        ol0Var.n = hl.N(6.0f);
        ol0Var.r = 0.0f;
        ol0Var.f = 1.0f;
        ol0Var.h = 1.0f;
        jl0 c = ll0Var.c(this, ol0Var, false);
        this.m0 = c;
        c.setCallback(this);
        this.m0.r(this.w + this.q0);
        this.m0.u((int) this.p0);
        jl0 jl0Var = this.m0;
        jl0Var.S.g = 1.0f;
        jl0Var.n();
        jl0 jl0Var2 = this.m0;
        if (!jl0Var2.R) {
            jl0Var2.R = true;
            jl0Var2.Q = null;
            jl0Var2.invalidateSelf();
        }
        this.m0.setAlpha(0);
        this.K0 = false;
        invalidate();
    }

    public final void l(Drawable drawable) {
        Drawable drawable2 = this.d0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.d0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            Drawable drawable3 = this.d0;
            if (drawable3 instanceof b29) {
                this.d = Math.max(this.d, ((b29) drawable3).m());
            }
            this.g0 = this.d0.getIntrinsicWidth();
            this.h0 = this.d0.getIntrinsicHeight();
            this.i0 = true;
        }
    }

    public final void m(float f, float f2, float f3, float f4) {
        this.x.set(hl.N(f), hl.N(f2), hl.N(f3), hl.N(f4));
    }

    public final void n(float f, float f2) {
        if (Math.abs(this.b - f) >= 1.0f || Math.abs(this.c - hl.L(f2)) >= 1.0f) {
            this.K0 = false;
            invalidate();
        }
        this.b = f;
        this.c = hl.L(f2);
    }

    public void o(float f, float f2) {
        if (Math.abs(this.b - f) >= 1.0f || Math.abs(this.c - f2) >= 1.0f) {
            this.K0 = false;
            invalidate();
        }
        this.b = f;
        this.c = f2;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hm.release(this, this.N);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && this.W) {
            y();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        this.K0 = false;
        int textMaxWidth = getTextMaxWidth();
        hn hnVar = this.I;
        hnVar.N = textMaxWidth;
        boolean z = this.J;
        CharSequence charSequence = this.H;
        if (z) {
            if (charSequence == null) {
                StaticLayout staticLayout = this.M;
                if (staticLayout != null) {
                    charSequence = staticLayout.getText();
                } else {
                    return;
                }
            }
            StaticLayout staticLayout2 = this.M;
            if (staticLayout2 == null || staticLayout2.getWidth() != textMaxWidth) {
                g(textMaxWidth, charSequence);
            }
        } else if (charSequence != null) {
            hnVar.t(charSequence, false, true);
        }
        this.H = null;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg5.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(boolean z) {
        this.J = z;
        float f = 15.0f;
        RectF rectF = this.x;
        if (z) {
            rectF.set(hl.L(15.0f), hl.L(8.0f), hl.L(15.0f), hl.L(8.0f));
            this.y = hl.L(6.0f);
            return;
        }
        float L = hl.L(11.0f);
        float L2 = hl.L(6.0f);
        if (!this.r) {
            f = 11.0f;
        }
        rectF.set(L, L2, hl.L(f), hl.L(7.0f));
        this.y = hl.L(2.0f);
    }

    public final void q(float f) {
        CornerPathEffect cornerPathEffect;
        float L = hl.L(f);
        this.w = L;
        jl0 jl0Var = this.m0;
        if (jl0Var != null) {
            jl0Var.r(L + this.q0);
        }
        CornerPathEffect cornerPathEffect2 = null;
        if (this.s) {
            cornerPathEffect = new CornerPathEffect(this.w);
        } else {
            cornerPathEffect = null;
        }
        this.G.setPathEffect(cornerPathEffect);
        Paint paint = this.c0;
        if (paint != null) {
            if (this.s) {
                cornerPathEffect2 = new CornerPathEffect(this.w);
            }
            paint.setPathEffect(cornerPathEffect2);
        }
    }

    public final void r() {
        this.s = false;
        this.G.setPathEffect(null);
    }

    public final void s(float f, float f2, int i) {
        this.j0 = f;
        this.k0 = f2;
        this.l0 = i;
        this.G.setShadowLayer(f, 0.0f, f2, i);
    }

    public final void t(CharSequence charSequence) {
        if (getMeasuredWidth() < 0) {
            this.H = charSequence;
        } else if (!this.J) {
            this.I.t(charSequence, false, true);
        } else {
            g(getTextMaxWidth(), charSequence);
        }
    }

    public final void u(float f) {
        this.I.w(hl.N(f));
        this.K.setTextSize(hl.N(f));
    }

    public final void v() {
        if (this.W && this.V) {
            ValueAnimator valueAnimator = this.z0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.z0 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.z0 = ofFloat;
            ofFloat.addUpdateListener(new ch4(this, (byte) 11));
            this.z0.addListener(new ad5(this, (byte) 1));
            this.z0.setInterpolator(k43.k);
            this.z0.setDuration(300L);
            this.z0.start();
        }
        hl.g2(getText());
        this.W = true;
        invalidate();
        ug ugVar = this.y0;
        hl.r(ugVar);
        long j = this.d;
        if (j > 0) {
            hl.d3(ugVar, j);
        }
        Runnable runnable = this.r0;
        if (runnable != null) {
            hl.r(runnable);
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.I && drawable != this.b0 && drawable != this.d0 && drawable != this.m0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w(float f, float f2, boolean z) {
        this.s0 = null;
        this.t0 = f;
        this.u0 = f2;
        y();
        if (!this.W) {
            v();
            if (!z) {
                this.a0.a(true);
            }
        }
    }

    public final void x(View view, boolean z) {
        boolean z2;
        if (this.W && this.s0 == view) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.s0 = view;
        this.t0 = Float.NaN;
        y();
        if (!z2) {
            v();
            if (!z) {
                this.a0.a(true);
            }
        }
    }

    public final void y() {
        float f;
        float f2;
        if (getParent() instanceof View) {
            if (this.s0 != null || !Float.isNaN(this.t0)) {
                if (!isLaidOut()) {
                    post(new ug(this, (byte) 5));
                    return;
                }
                View view = this.s0;
                if (view != null) {
                    int[] iArr = this.x0;
                    view.getLocationInWindow(iArr);
                    ((View) getParent()).getLocationInWindow(iArr);
                    float f3 = iArr[0] - iArr[0];
                    float f4 = iArr[1] - iArr[1];
                    int width = this.s0.getWidth();
                    int height = this.s0.getHeight();
                    float f5 = f3 + this.w0;
                    byte b = this.a;
                    if (b != 0) {
                        float f6 = this.v0;
                        if (b != 1) {
                            if (b != 2) {
                                f = (width / 2.0f) + f5;
                                f2 = f4 - f6;
                            } else {
                                f = f5 - f6;
                            }
                        } else {
                            f = (width / 2.0f) + f5;
                            f2 = f4 + height + f6;
                        }
                    } else {
                        f = this.v0 + f5 + width;
                    }
                    f2 = f4 + (height / 2.0f);
                } else {
                    f = this.t0;
                    f2 = this.u0;
                }
                byte b2 = this.a;
                if (b2 != 0) {
                    if (b2 != 1) {
                        if (b2 != 2) {
                            setTranslationY(f2 - ((getHeight() + getTop()) - getPaddingBottom()));
                            o(0.0f, (f - getLeft()) - getPaddingLeft());
                            return;
                        }
                        setTranslationX(f - ((getWidth() + getLeft()) - getPaddingRight()));
                        o(0.0f, (f2 - getTop()) - getPaddingTop());
                        return;
                    }
                    setTranslationY(f2 - (getPaddingTop() + getTop()));
                    o(0.0f, (f - getLeft()) - getPaddingLeft());
                    return;
                }
                setTranslationX(f - (getPaddingLeft() + getLeft()));
                o(0.0f, (f2 - getTop()) - getPaddingTop());
            }
        }
    }
}
