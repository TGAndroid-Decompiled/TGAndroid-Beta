package fi;

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
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.oy;
public class m3 extends View {
    public final ic A0;
    public final Rect B0;
    public final RectF C0;
    public float D;
    public final RectF D0;
    public float E;
    public final Path E0;
    public final Paint F;
    public float F0;
    public CharSequence G;
    public float G0;
    public final org.telegram.ui.Components.i6 H;
    public float H0;
    public boolean I;
    public float I0;
    public final TextPaint J;
    public boolean J0;
    public Layout.Alignment K;
    public boolean K0;
    public StaticLayout L;
    public boolean L0;
    public org.telegram.ui.Components.n5 M;
    public Path M0;
    public float N;
    public float N0;
    public float O;
    public Paint O0;
    public float P;
    public Paint P0;
    public final n2.n0 Q;
    public LinearGradient Q0;
    public float R;
    public Matrix R0;
    public float S;
    public LinearGradient S0;
    public boolean T;
    public long T0;
    public boolean U;
    public final RectF U0;
    public boolean V;
    public x70 V0;
    public final org.telegram.ui.Components.w5 W;
    public int f12415a;
    public org.telegram.ui.Cells.y f12416a0;
    public float f12417b;
    public Paint f12418b0;
    public float f12419c;
    public Drawable f12420c0;
    public long d;
    public float f12421d0;
    public boolean f12422e;
    public int f12423e0;
    public final boolean f12424f;
    public int f12425f0;
    public int f12426g0;
    public int h;
    public boolean f12427h0;
    public float f12428i0;
    public float f12429j0;
    public int f12430k0;
    public fh.g f12431l0;
    public final float m0;
    public Drawable f12432n;
    public final float f12433n0;
    public final float f12434o0;
    public final float f12435p0;
    public Runnable f12436q0;
    public boolean f12437r;
    public View f12438r0;
    public boolean f12439s;
    public float f12440s0;
    public float f12441t0;
    public float f12442u0;
    public float f12443v0;
    public float f12444w;
    public final int[] f12445w0;
    public final RectF f12446x;
    public final oy f12447x0;
    public float f12448y;
    public ValueAnimator f12449y0;
    public float f12450z0;

    public m3(Context context, int i7) {
        super(context);
        this.f12417b = 0.5f;
        this.f12419c = 0.0f;
        this.d = 3500L;
        this.f12422e = true;
        this.f12424f = true;
        this.h = -1;
        this.f12439s = true;
        this.f12444w = org.telegram.messenger.g0.L(8.0f);
        this.f12446x = new RectF(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f));
        this.f12448y = org.telegram.messenger.g0.L(2.0f);
        this.D = org.telegram.messenger.g0.L(7.0f);
        this.E = org.telegram.messenger.g0.L(6.0f);
        Paint paint = new Paint(1);
        this.F = paint;
        TextPaint textPaint = new TextPaint(1);
        this.J = textPaint;
        this.K = Layout.Alignment.ALIGN_NORMAL;
        this.Q = new n2.n0();
        this.T = true;
        this.U = true;
        xq xqVar = xq.h;
        this.W = new org.telegram.ui.Components.w5(this, 350L, xqVar);
        this.f12423e0 = org.telegram.messenger.g0.L(2.0f);
        this.m0 = org.telegram.messenger.g0.N(4.0f);
        this.f12433n0 = org.telegram.messenger.g0.N(4.0f);
        this.f12434o0 = org.telegram.messenger.g0.N(5.0f);
        this.f12435p0 = org.telegram.messenger.g0.N(2.0f);
        this.f12440s0 = Float.NaN;
        this.f12445w0 = new int[2];
        this.f12447x0 = new oy(this, 1);
        this.f12450z0 = 1.0f;
        this.A0 = new ic(this, 2.0f, 5.0f);
        this.B0 = new Rect();
        this.C0 = new RectF();
        this.D0 = new RectF();
        this.E0 = new Path();
        this.K0 = true;
        this.U0 = new RectF();
        this.f12415a = i7;
        paint.setColor(-433575896);
        paint.setPathEffect(new CornerPathEffect(this.f12444w));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, false);
        this.H = i6Var;
        i6Var.n(0.4f, 320L, xqVar);
        i6Var.setCallback(this);
        v(14.0f);
        i6Var.u(-1);
        textPaint.setColor(-1);
    }

    public static int a(CharSequence charSequence, TextPaint textPaint) {
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return Integer.MAX_VALUE;
        }
        int length = charSequence.length() / 2;
        float f10 = 0.0f;
        int i7 = 0;
        int i10 = -1;
        float f11 = 0.0f;
        float f12 = Float.MAX_VALUE;
        float f13 = 0.0f;
        while (i7 < 10) {
            while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                length += i10;
            }
            f13 = h(charSequence.subSequence(0, length), textPaint);
            f11 = h(org.telegram.messenger.g0.n1(charSequence.subSequence(length, charSequence.length())), textPaint);
            if (f13 != f10 || f11 != f12) {
                if (f13 < f11) {
                    length++;
                    i10 = 1;
                } else {
                    length--;
                    i10 = -1;
                }
                if (length <= 0 || length >= charSequence.length()) {
                    break;
                }
                i7++;
                f10 = f13;
                f12 = f11;
            } else {
                break;
            }
        }
        return (int) Math.ceil(Math.max(f13, f11));
    }

    public static CharSequence b(CharSequence charSequence, TextPaint textPaint) {
        int i7;
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return charSequence;
        }
        int length = charSequence.length() / 2;
        float f10 = Float.MAX_VALUE;
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        float f11 = 0.0f;
        float f12 = Float.MAX_VALUE;
        while (i10 < 10) {
            while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                length += i11;
            }
            float h = h(charSequence.subSequence(0, length), textPaint);
            float h7 = h(org.telegram.messenger.g0.n1(charSequence.subSequence(length, charSequence.length())), textPaint);
            if (length > 0 && length < charSequence.length() && Math.max(h, h7) < f10) {
                f10 = Math.max(h, h7);
                i12 = length;
            }
            if (h != f11 || h7 != f12) {
                if (h < h7) {
                    length++;
                    i7 = 1;
                } else {
                    length--;
                    i7 = -1;
                }
                if (length <= 0 || length >= charSequence.length()) {
                    break;
                }
                i10++;
                f11 = h;
                i11 = i7;
                f12 = h7;
            } else {
                break;
            }
        }
        if (i12 < 0) {
            return charSequence;
        }
        return TextUtils.concat(org.telegram.messenger.g0.n1(charSequence.subSequence(0, i12)), "\n", org.telegram.messenger.g0.n1(charSequence.subSequence(i12, charSequence.length())));
    }

    private int getTextMaxWidth() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        RectF rectF = this.f12446x;
        int i7 = measuredWidth - ((int) (rectF.left + rectF.right));
        int i10 = this.h;
        if (i10 > 0) {
            i7 = Math.min(i10, i7);
        }
        return Math.max(0, i7);
    }

    public static float h(CharSequence charSequence, TextPaint textPaint) {
        int spanStart;
        int spanEnd;
        CharSequence charSequence2;
        float f10 = 0.0f;
        if (charSequence == null) {
            return 0.0f;
        }
        if (!(charSequence instanceof Spanned)) {
            return textPaint.measureText(charSequence.toString());
        }
        Spanned spanned = (Spanned) charSequence;
        u31[] u31VarArr = (u31[]) spanned.getSpans(0, charSequence.length(), u31.class);
        ReplacementSpan[] replacementSpanArr = (ReplacementSpan[]) spanned.getSpans(0, charSequence.length(), ReplacementSpan.class);
        int i7 = 0;
        int i10 = 0;
        while (i7 < replacementSpanArr.length) {
            ReplacementSpan replacementSpan = replacementSpanArr[i7];
            TextPaint textPaint2 = textPaint;
            i10 = (int) (Math.max(0.0f, replacementSpan.getSize(textPaint2, charSequence2, spanStart, spanEnd, textPaint.getFontMetricsInt()) - textPaint2.measureText(spanned, spanned.getSpanStart(replacementSpan), spanned.getSpanEnd(replacementSpan))) + i10);
            i7++;
            textPaint = textPaint2;
            charSequence = charSequence;
        }
        CharSequence charSequence3 = charSequence;
        TextPaint textPaint3 = textPaint;
        if (u31VarArr != null && u31VarArr.length != 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < u31VarArr.length; i12++) {
                int spanStart2 = spanned.getSpanStart(u31VarArr[i12]);
                int spanEnd2 = spanned.getSpanEnd(u31VarArr[i12]);
                int max = Math.max(i11, spanStart2);
                if (max - i11 > 0) {
                    f10 += textPaint3.measureText(spanned, i11, max);
                }
                i11 = Math.max(max, spanEnd2);
                if (i11 - max > 0) {
                    Typeface typeface = textPaint3.getTypeface();
                    textPaint3.setTypeface(u31VarArr[i12].f38509a);
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

    public void c(Canvas canvas, float f10) {
        fh.g gVar = this.f12431l0;
        if (gVar != null) {
            gVar.setAlpha(Math.max(1, (int) (f10 * 255.0f)));
            this.f12431l0.draw(canvas);
            d(canvas);
            return;
        }
        int i7 = this.f12430k0;
        Paint paint = this.F;
        if (i7 != 0) {
            paint.setShadowLayer(this.f12428i0, 0.0f, this.f12429j0, org.telegram.ui.ActionBar.k6.r1(f10, i7));
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f10));
        canvas.drawPath(this.E0, paint);
        paint.setAlpha(alpha);
        d(canvas);
    }

    public final void d(Canvas canvas) {
        if (this.L0) {
            int L = org.telegram.messenger.g0.L(64.0f);
            float currentTimeMillis = ((float) ((System.currentTimeMillis() - this.T0) % 4000)) / 4000.0f;
            float b10 = org.telegram.messenger.camera.q.b(this.H0 * 4.0f, L * 2, currentTimeMillis, -L);
            this.R0.reset();
            this.R0.postTranslate(this.C0.left + b10, 0.0f);
            this.Q0.setLocalMatrix(this.R0);
            this.S0.setLocalMatrix(this.R0);
            canvas.drawPath(this.E0, this.O0);
            canvas.drawPath(this.M0, this.P0);
            invalidate();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z9;
        float c10;
        float f10;
        RectF rectF;
        RectF rectF2;
        boolean z10;
        float f11;
        float f12;
        float f13;
        float f14;
        m3 m3Var;
        RectF rectF3;
        float f15;
        float f16;
        float f17;
        float f18;
        Canvas canvas2;
        Drawable drawable;
        float f19;
        int paddingTop;
        int paddingRight;
        if (!this.I || this.L != null) {
            if (this.V && !this.K0) {
                z9 = true;
            } else {
                z9 = false;
            }
            float d = this.W.d(z9);
            if (this.K0) {
                this.K0 = false;
                invalidate();
            }
            if (d <= 0.0f) {
                fh.g gVar = this.f12431l0;
                if (gVar != null) {
                    gVar.setAlpha(0);
                    return;
                }
                return;
            }
            boolean z11 = this.I;
            org.telegram.ui.Components.i6 i6Var = this.H;
            if (z11) {
                c10 = this.O;
            } else {
                c10 = i6Var.c();
            }
            if (this.I) {
                f10 = this.P;
            } else {
                f10 = i6Var.f34555e;
            }
            if (this.f12437r) {
                if (this.f12432n == null) {
                    Drawable mutate = getContext().getResources().getDrawable(2131232235).mutate();
                    this.f12432n = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
                }
                c10 += this.f12448y + this.f12432n.getIntrinsicWidth();
                f10 = Math.max(this.f12432n.getIntrinsicHeight(), f10);
            }
            if (this.f12420c0 != null) {
                c10 += this.f12425f0 + this.f12423e0;
                f10 = Math.max(this.f12426g0, f10);
            }
            float f20 = c10;
            RectF rectF4 = this.f12446x;
            float f21 = rectF4.left + f20 + rectF4.right;
            float f22 = rectF4.top + f10 + rectF4.bottom;
            boolean z12 = this.J0;
            RectF rectF5 = this.C0;
            if (z12 && Math.abs(f21 - this.H0) <= 0.1f && Math.abs(f22 - this.I0) <= 0.1f) {
                m3Var = this;
                rectF = rectF4;
                f15 = f22;
                rectF3 = rectF5;
                f14 = f20;
            } else {
                this.H0 = f21;
                this.I0 = f22;
                rectF = rectF4;
                e(this.E0, f21, f22, 0.0f, rectF5, this.B0);
                if (this.f12431l0 == null) {
                    rectF2 = rectF5;
                    f12 = f21;
                    f13 = f22;
                    f14 = f20;
                } else {
                    int round = Math.round(this.E);
                    int round2 = Math.round(rectF5.left);
                    int round3 = Math.round(rectF5.top);
                    int round4 = Math.round(rectF5.right);
                    int round5 = Math.round(rectF5.bottom);
                    int i7 = this.f12415a;
                    rectF2 = rectF5;
                    if (i7 != 0) {
                        if (i7 != 1) {
                            if (i7 != 2) {
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
                    if (i7 != 0 && i7 != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    fh.g gVar2 = this.f12431l0;
                    if (z10) {
                        f11 = this.G0;
                    } else {
                        f11 = this.F0;
                    }
                    float f23 = round;
                    f12 = f21;
                    fh.f fVar = gVar2.Q;
                    int i10 = fVar.f11516n;
                    f13 = f22;
                    float f24 = this.m0;
                    f14 = f20;
                    float f25 = this.f12433n0;
                    if (i10 != i7 || fVar.f11517o != f11 || fVar.f11518p != f23 || fVar.f11519q != f24 || fVar.f11520r != f25) {
                        fVar.f11516n = i7;
                        fVar.f11517o = f11;
                        fVar.f11518p = f23;
                        fVar.f11519q = f24;
                        fVar.f11520r = f25;
                        fVar.a();
                        gVar2.n();
                        gVar2.invalidateSelf();
                    }
                    this.f12431l0.setBounds(round2, round3, round4, round5);
                }
                if (this.L0) {
                    rectF3 = rectF2;
                    f15 = f13;
                    e(this.M0, f12, f15, this.N0, this.D0, null);
                    m3Var = this;
                } else {
                    m3Var = this;
                    rectF3 = rectF2;
                    f15 = f13;
                }
            }
            if (m3Var.f12424f) {
                f16 = d;
            } else {
                f16 = 1.0f;
            }
            canvas.save();
            if (d < 1.0f && m3Var.f12422e) {
                float T1 = org.telegram.messenger.g0.T1(0.75f, 1.0f, d);
                canvas.scale(T1, T1, m3Var.F0, m3Var.G0);
            }
            float a10 = m3Var.A0.a(0.025f);
            if (a10 != 1.0f) {
                canvas.scale(a10, a10, m3Var.F0, m3Var.G0);
            }
            if (m3Var.f12450z0 != 1.0f) {
                int i11 = m3Var.f12415a;
                int i12 = -1;
                if (i11 != 3 && i11 != 1) {
                    if (i11 == 0) {
                        paddingRight = m3Var.getPaddingLeft();
                    } else {
                        paddingRight = m3Var.getPaddingRight();
                    }
                    float max = (m3Var.f12450z0 - 1.0f) * Math.max(paddingRight, org.telegram.messenger.g0.L(24.0f));
                    if (m3Var.f12415a != 0) {
                        i12 = 1;
                    }
                    canvas.translate(max * i12, 0.0f);
                } else {
                    if (i11 == 3) {
                        paddingTop = m3Var.getPaddingBottom();
                    } else {
                        paddingTop = m3Var.getPaddingTop();
                    }
                    float max2 = (m3Var.f12450z0 - 1.0f) * Math.max(paddingTop, org.telegram.messenger.g0.L(24.0f));
                    if (m3Var.f12415a != 1) {
                        i12 = 1;
                    }
                    canvas.translate(0.0f, max2 * i12);
                }
            }
            RectF rectF6 = org.telegram.messenger.g0.P;
            rectF6.set(rectF3);
            float f26 = -m3Var.E;
            rectF6.inset(f26, f26);
            m3Var.c(canvas, f16);
            org.telegram.ui.Cells.y yVar = m3Var.f12416a0;
            if (yVar != null) {
                yVar.setAlpha((int) (f16 * 255.0f));
                m3Var.f12416a0.setBounds(m3Var.B0);
                m3Var.f12416a0.draw(canvas);
            }
            float f27 = ((rectF3.top + rectF.top) + (rectF3.bottom - rectF.bottom)) / 2.0f;
            Drawable drawable2 = m3Var.f12420c0;
            if (drawable2 != null) {
                if (m3Var.f12427h0) {
                    float f28 = (rectF.left / 2.0f) + 0.0f + rectF3.left;
                    float f29 = m3Var.f12421d0 + f27;
                    float f30 = m3Var.f12426g0 / 2.0f;
                    f17 = 255.0f;
                    drawable2.setBounds((int) f28, (int) (f29 - f30), (int) (f28 + m3Var.f12425f0), (int) (f30 + f29));
                    f19 = m3Var.f12425f0 + m3Var.f12423e0 + 0.0f;
                } else {
                    f17 = 255.0f;
                    float f31 = (0.0f + rectF3.right) - (rectF.right / 2.0f);
                    float f32 = m3Var.f12421d0 + f27;
                    float f33 = m3Var.f12426g0 / 2.0f;
                    drawable2.setBounds((int) (f31 - m3Var.f12425f0), (int) (f32 - f33), (int) f31, (int) (f33 + f32));
                    f19 = 0.0f;
                }
                m3Var.f12420c0.setAlpha((int) (f16 * f17));
                m3Var.f12420c0.draw(canvas);
                f18 = f19;
            } else {
                f17 = 255.0f;
                f18 = 0.0f;
            }
            if (m3Var.I) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, m3Var.getWidth(), Math.max(m3Var.getHeight(), f15), (int) (f16 * f17), 31);
                float f34 = ((f18 + rectF3.left) + rectF.left) - m3Var.N;
                m3Var.R = f34;
                float f35 = f27 - (m3Var.P / 2.0f);
                m3Var.S = f35;
                canvas2.translate(f34, f35);
                if (m3Var.Q.h(canvas2)) {
                    m3Var.invalidate();
                }
                m3Var.L.draw(canvas2);
                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas2, m3Var.L, m3Var.M, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
                canvas2.restore();
            } else {
                canvas2 = canvas;
                CharSequence charSequence = m3Var.G;
                if (charSequence != null) {
                    i6Var.t(charSequence, m3Var.V, true);
                    m3Var.G = null;
                }
                float f36 = rectF3.left;
                float f37 = rectF.left;
                float f38 = m3Var.P / 2.0f;
                i6Var.setBounds((int) (f18 + f36 + f37), (int) (f27 - f38), (int) (f36 + f37 + f14), (int) (f38 + f27));
                i6Var.B = (int) (f16 * f17);
                i6Var.draw(canvas2);
            }
            if (m3Var.f12437r) {
                if (m3Var.f12432n == null) {
                    Drawable mutate2 = m3Var.getContext().getResources().getDrawable(2131232235).mutate();
                    m3Var.f12432n = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
                }
                m3Var.f12432n.setAlpha((int) (f16 * f17));
                m3Var.f12432n.setBounds((int) ((rectF3.right - (rectF.right * 0.66f)) - drawable.getIntrinsicWidth()), (int) (rectF3.centerY() - (m3Var.f12432n.getIntrinsicHeight() / 2.0f)), (int) (rectF3.right - (rectF.right * 0.66f)), (int) ((m3Var.f12432n.getIntrinsicHeight() / 2.0f) + rectF3.centerY()));
                m3Var.f12432n.draw(canvas2);
            }
            canvas2.restore();
        }
    }

    public final void e(Path path, float f10, float f11, float f12, RectF rectF, Rect rect) {
        float f13;
        float f14 = f10 / 2.0f;
        float f15 = f11 / 2.0f;
        float min = Math.min(this.f12444w, Math.min(f14, f15));
        int i7 = this.f12415a;
        if (i7 != 1 && i7 != 3) {
            float i10 = Utilities.i(org.telegram.messenger.g0.W1(this.f12417b, getPaddingTop(), getMeasuredHeight() - getPaddingBottom()) + this.f12419c, getMeasuredHeight() - getPaddingBottom(), getPaddingTop());
            float min2 = Math.min(Math.max(getPaddingTop(), i10 - f15) + f11, getMeasuredHeight() - getPaddingBottom());
            float f16 = min2 - f11;
            float f17 = this.D;
            f13 = Utilities.i(i10, (min2 - min) - f17, f16 + min + f17);
            if (this.f12415a == 0) {
                rectF.set(getPaddingLeft() + this.E, f16, getPaddingLeft() + this.E + f10, min2);
            } else {
                rectF.set(((getMeasuredWidth() - getPaddingRight()) - this.E) - f10, f16, (getMeasuredWidth() - getPaddingRight()) - this.E, min2);
            }
        } else {
            float i11 = Utilities.i(org.telegram.messenger.g0.W1(this.f12417b, getPaddingLeft(), getMeasuredWidth() - getPaddingRight()) + this.f12419c, getMeasuredWidth() - getPaddingRight(), getPaddingLeft());
            float min3 = Math.min(Math.max(getPaddingLeft(), i11 - f14) + f10, getMeasuredWidth() - getPaddingRight());
            float f18 = min3 - f10;
            float f19 = this.D;
            float i12 = Utilities.i(i11, (min3 - min) - f19, f18 + min + f19);
            if (this.f12415a == 1) {
                rectF.set(f18, getPaddingTop() + this.E, min3, getPaddingTop() + this.E + f11);
            } else {
                rectF.set(f18, ((getMeasuredHeight() - this.E) - getPaddingBottom()) - f11, min3, (getMeasuredHeight() - this.E) - getPaddingBottom());
            }
            f13 = i12;
        }
        float f20 = -f12;
        rectF.inset(f20, f20);
        if (rect != null) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        path.rewind();
        boolean z9 = this.f12439s;
        RectF rectF2 = this.U0;
        if (z9) {
            path.moveTo(rectF.left, rectF.bottom);
        } else {
            float f21 = rectF.left;
            float f22 = rectF.bottom;
            float f23 = min * 2.0f;
            rectF2.set(f21, f22 - f23, f23 + f21, f22);
            path.arcTo(rectF2, 90.0f, 90.0f);
        }
        if (this.f12415a == 0) {
            path.lineTo(rectF.left, this.D + f13 + org.telegram.messenger.g0.L(2.0f));
            path.lineTo(rectF.left, this.D + f13);
            path.lineTo(rectF.left - this.E, org.telegram.messenger.g0.L(1.0f) + f13);
            float f24 = rectF.left - this.E;
            this.F0 = f24;
            this.G0 = f13;
            path.lineTo(f24, f13 - org.telegram.messenger.g0.L(1.0f));
            path.lineTo(rectF.left, f13 - this.D);
            path.lineTo(rectF.left, (f13 - this.D) - org.telegram.messenger.g0.L(2.0f));
            if (rect != null) {
                rect.left = (int) (rect.left - this.E);
            }
        }
        if (this.f12439s) {
            path.lineTo(rectF.left, rectF.top);
        } else {
            float f25 = rectF.left;
            float f26 = rectF.top;
            float f27 = min * 2.0f;
            rectF2.set(f25, f26, f25 + f27, f27 + f26);
            path.arcTo(rectF2, 180.0f, 90.0f);
        }
        if (this.f12415a == 1) {
            path.lineTo((f13 - this.D) - org.telegram.messenger.g0.L(2.0f), rectF.top);
            path.lineTo(f13 - this.D, rectF.top);
            path.lineTo(f13 - org.telegram.messenger.g0.L(1.0f), rectF.top - this.E);
            this.F0 = f13;
            this.G0 = rectF.top - this.E;
            path.lineTo(org.telegram.messenger.g0.L(1.0f) + f13, rectF.top - this.E);
            path.lineTo(this.D + f13, rectF.top);
            path.lineTo(this.D + f13 + org.telegram.messenger.g0.L(2.0f), rectF.top);
            if (rect != null) {
                rect.top = (int) (rect.top - this.E);
            }
        }
        if (this.f12439s) {
            path.lineTo(rectF.right, rectF.top);
        } else {
            float f28 = rectF.right;
            float f29 = min * 2.0f;
            float f30 = rectF.top;
            rectF2.set(f28 - f29, f30, f28, f29 + f30);
            path.arcTo(rectF2, 270.0f, 90.0f);
        }
        if (this.f12415a == 2) {
            path.lineTo(rectF.right, (f13 - this.D) - org.telegram.messenger.g0.L(2.0f));
            path.lineTo(rectF.right, f13 - this.D);
            path.lineTo(rectF.right + this.E, f13 - org.telegram.messenger.g0.L(1.0f));
            float f31 = rectF.right + this.E;
            this.F0 = f31;
            this.G0 = f13;
            path.lineTo(f31, org.telegram.messenger.g0.L(1.0f) + f13);
            path.lineTo(rectF.right, this.D + f13);
            path.lineTo(rectF.right, this.D + f13 + org.telegram.messenger.g0.L(2.0f));
            if (rect != null) {
                rect.right = (int) (rect.right + this.E);
            }
        }
        if (this.f12439s) {
            path.lineTo(rectF.right, rectF.bottom);
        } else {
            float f32 = rectF.right;
            float f33 = min * 2.0f;
            float f34 = rectF.bottom;
            rectF2.set(f32 - f33, f34 - f33, f32, f34);
            path.arcTo(rectF2, 0.0f, 90.0f);
        }
        if (this.f12415a == 3) {
            path.lineTo(this.D + f13 + org.telegram.messenger.g0.L(2.0f), rectF.bottom);
            path.lineTo(this.D + f13, rectF.bottom);
            path.lineTo(org.telegram.messenger.g0.L(1.0f) + f13, rectF.bottom + this.E);
            this.F0 = f13;
            this.G0 = rectF.bottom + this.E;
            path.lineTo(f13 - org.telegram.messenger.g0.L(1.0f), rectF.bottom + this.E);
            path.lineTo(f13 - this.D, rectF.bottom);
            path.lineTo((f13 - this.D) - org.telegram.messenger.g0.L(2.0f), rectF.bottom);
            if (rect != null) {
                rect.bottom = (int) (rect.bottom + this.E);
            }
        }
        path.close();
        this.J0 = true;
    }

    public final void f(boolean z9) {
        org.telegram.messenger.g0.r(this.f12447x0);
        Runnable runnable = this.f12436q0;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        this.V = false;
        org.telegram.ui.Components.w5 w5Var = this.W;
        if (!z9) {
            w5Var.getClass();
            w5Var.e(false, 0.0f);
        }
        invalidate();
        Runnable runnable2 = this.f12436q0;
        if (runnable2 != null) {
            org.telegram.messenger.g0.i3(runnable2, w5Var.f39805c * ((float) w5Var.f39808g));
        }
        this.Q.f(true);
    }

    public final void g(int i7, CharSequence charSequence) {
        this.L = new StaticLayout(charSequence, this.J, i7, this.K, 1.0f, 0.0f, false);
        float f10 = i7;
        float f11 = 0.0f;
        for (int i10 = 0; i10 < this.L.getLineCount(); i10++) {
            f10 = Math.min(f10, this.L.getLineLeft(i10));
            f11 = Math.max(f11, this.L.getLineRight(i10));
        }
        this.O = Math.max(0.0f, f11 - f10);
        this.P = this.L.getHeight();
        this.N = f10;
        this.M = org.telegram.ui.Components.r5.update(0, this, this.M, this.L);
    }

    public View getAnchorView() {
        return this.f12438r0;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.G;
        if (charSequence != null) {
            return charSequence;
        }
        if (!this.I) {
            return this.H.f34558i;
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
        return this.H.f34550a;
    }

    public final void i(float f10) {
        this.f12442u0 = f10;
    }

    public final void j(int i7) {
        Paint paint = this.F;
        if (paint.getColor() != i7) {
            paint.setColor(i7);
            invalidate();
        }
    }

    public final void k(boolean z9) {
        this.f12437r = z9;
        if (!this.I) {
            float f10 = 11.0f;
            float L = org.telegram.messenger.g0.L(11.0f);
            float L2 = org.telegram.messenger.g0.L(6.0f);
            if (this.f12437r) {
                f10 = 15.0f;
            }
            this.f12446x.set(L, L2, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(7.0f));
        }
    }

    public final void l(dh.c cVar) {
        gh.e eVar = new gh.e(null);
        eVar.f13971e = new g2.c(6);
        eVar.f(872415231, 872415231);
        eVar.e(452984831, 452984831);
        eVar.d(808661811, 805306368);
        eVar.f13973n = org.telegram.messenger.g0.N(6.0f);
        eVar.f13974r = 0.0f;
        eVar.f13972f = 1.0f;
        eVar.h = 1.0f;
        fh.g c10 = cVar.c(this, eVar, false);
        this.f12431l0 = c10;
        c10.setCallback(this);
        this.f12431l0.r(this.f12444w + this.f12435p0);
        this.f12431l0.u((int) this.f12434o0);
        fh.g gVar = this.f12431l0;
        gVar.Q.f11510g = 1.0f;
        gVar.n();
        fh.g gVar2 = this.f12431l0;
        if (!gVar2.P) {
            gVar2.P = true;
            gVar2.O = null;
            gVar2.invalidateSelf();
        }
        this.f12431l0.setAlpha(0);
        this.J0 = false;
        invalidate();
    }

    public final void m(Drawable drawable) {
        Drawable drawable2 = this.f12420c0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f12420c0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            Drawable drawable3 = this.f12420c0;
            if (drawable3 instanceof zg0) {
                this.d = Math.max(this.d, ((zg0) drawable3).r());
            }
            this.f12425f0 = this.f12420c0.getIntrinsicWidth();
            this.f12426g0 = this.f12420c0.getIntrinsicHeight();
            this.f12427h0 = true;
        }
    }

    public final void n(float f10, float f11, float f12, float f13) {
        this.f12446x.set(org.telegram.messenger.g0.N(f10), org.telegram.messenger.g0.N(f11), org.telegram.messenger.g0.N(f12), org.telegram.messenger.g0.N(f13));
    }

    public final void o(float f10, float f11) {
        if (Math.abs(this.f12417b - f10) >= 1.0f || Math.abs(this.f12419c - org.telegram.messenger.g0.L(f11)) >= 1.0f) {
            this.J0 = false;
            invalidate();
        }
        this.f12417b = f10;
        this.f12419c = org.telegram.messenger.g0.L(f11);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.r5.release(this, this.M);
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (z9 && this.V) {
            z();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        this.J0 = false;
        int textMaxWidth = getTextMaxWidth();
        org.telegram.ui.Components.i6 i6Var = this.H;
        i6Var.M = textMaxWidth;
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
                g(textMaxWidth, charSequence);
            }
        } else {
            CharSequence charSequence2 = this.G;
            if (charSequence2 != null) {
                i6Var.t(charSequence2, false, true);
            }
        }
        this.G = null;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: fi.m3.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(float f10, float f11) {
        if (Math.abs(this.f12417b - f10) >= 1.0f || Math.abs(this.f12419c - f11) >= 1.0f) {
            this.J0 = false;
            invalidate();
        }
        this.f12417b = f10;
        this.f12419c = f11;
    }

    public final void q(int i7) {
        this.h = i7;
    }

    public final void r(boolean z9) {
        this.I = z9;
        RectF rectF = this.f12446x;
        float f10 = 15.0f;
        if (z9) {
            rectF.set(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
            this.f12448y = org.telegram.messenger.g0.L(6.0f);
            return;
        }
        float L = org.telegram.messenger.g0.L(11.0f);
        float L2 = org.telegram.messenger.g0.L(6.0f);
        if (!this.f12437r) {
            f10 = 11.0f;
        }
        rectF.set(L, L2, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(7.0f));
        this.f12448y = org.telegram.messenger.g0.L(2.0f);
    }

    public final void s(float f10) {
        CornerPathEffect cornerPathEffect;
        float L = org.telegram.messenger.g0.L(f10);
        this.f12444w = L;
        fh.g gVar = this.f12431l0;
        if (gVar != null) {
            gVar.r(L + this.f12435p0);
        }
        CornerPathEffect cornerPathEffect2 = null;
        if (this.f12439s) {
            cornerPathEffect = new CornerPathEffect(this.f12444w);
        } else {
            cornerPathEffect = null;
        }
        this.F.setPathEffect(cornerPathEffect);
        Paint paint = this.f12418b0;
        if (paint != null) {
            if (this.f12439s) {
                cornerPathEffect2 = new CornerPathEffect(this.f12444w);
            }
            paint.setPathEffect(cornerPathEffect2);
        }
    }

    public final void t() {
        this.f12439s = false;
        this.F.setPathEffect(null);
    }

    public final void u(CharSequence charSequence) {
        if (getMeasuredWidth() < 0) {
            this.G = charSequence;
        } else if (!this.I) {
            this.H.t(charSequence, false, true);
        } else {
            g(getTextMaxWidth(), charSequence);
        }
    }

    public final void v(float f10) {
        this.H.w(org.telegram.messenger.g0.N(f10));
        this.J.setTextSize(org.telegram.messenger.g0.N(f10));
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.H && drawable != this.f12416a0 && drawable != this.f12420c0 && drawable != this.f12431l0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w() {
        if (this.V && this.U) {
            ValueAnimator valueAnimator = this.f12449y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f12449y0 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f12449y0 = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 29));
            this.f12449y0.addListener(new bi.t5(this, 19));
            this.f12449y0.setInterpolator(xq.f40370k);
            this.f12449y0.setDuration(300L);
            this.f12449y0.start();
        }
        org.telegram.messenger.g0.i2(getText());
        this.V = true;
        invalidate();
        oy oyVar = this.f12447x0;
        org.telegram.messenger.g0.r(oyVar);
        long j3 = this.d;
        if (j3 > 0) {
            org.telegram.messenger.g0.i3(oyVar, j3);
        }
        Runnable runnable = this.f12436q0;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
    }

    public final void x(float f10, float f11, boolean z9) {
        this.f12438r0 = null;
        this.f12440s0 = f10;
        this.f12441t0 = f11;
        z();
        if (!this.V) {
            w();
            if (!z9) {
                this.W.a(true);
            }
        }
    }

    public final void y(View view, boolean z9) {
        boolean z10;
        if (this.V && this.f12438r0 == view) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12438r0 = view;
        this.f12440s0 = Float.NaN;
        z();
        if (!z10) {
            w();
            if (!z9) {
                this.W.a(true);
            }
        }
    }

    public final void z() {
        float f10;
        float f11;
        if (getParent() instanceof View) {
            if (this.f12438r0 != null || !Float.isNaN(this.f12440s0)) {
                if (!isLaidOut()) {
                    post(new bi.s2(this, 2));
                    return;
                }
                View view = this.f12438r0;
                if (view != null) {
                    int[] iArr = this.f12445w0;
                    view.getLocationInWindow(iArr);
                    ((View) getParent()).getLocationInWindow(iArr);
                    float f12 = iArr[0] - iArr[0];
                    float f13 = iArr[1] - iArr[1];
                    int width = this.f12438r0.getWidth();
                    int height = this.f12438r0.getHeight();
                    float f14 = f12 + this.f12443v0;
                    int i7 = this.f12415a;
                    if (i7 != 0) {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                f10 = (width / 2.0f) + f14;
                                f11 = f13 - this.f12442u0;
                            } else {
                                f10 = f14 - this.f12442u0;
                            }
                        } else {
                            f10 = (width / 2.0f) + f14;
                            f11 = f13 + height + this.f12442u0;
                        }
                    } else {
                        f10 = this.f12442u0 + f14 + width;
                    }
                    f11 = f13 + (height / 2.0f);
                } else {
                    f10 = this.f12440s0;
                    f11 = this.f12441t0;
                }
                int i10 = this.f12415a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            setTranslationY(f11 - ((getHeight() + getTop()) - getPaddingBottom()));
                            p(0.0f, (f10 - getLeft()) - getPaddingLeft());
                            return;
                        }
                        setTranslationX(f10 - ((getWidth() + getLeft()) - getPaddingRight()));
                        p(0.0f, (f11 - getTop()) - getPaddingTop());
                        return;
                    }
                    setTranslationY(f11 - (getPaddingTop() + getTop()));
                    p(0.0f, (f10 - getLeft()) - getPaddingLeft());
                    return;
                }
                setTranslationX(f10 - (getPaddingLeft() + getLeft()));
                p(0.0f, (f11 - getTop()) - getPaddingTop());
            }
        }
    }
}
