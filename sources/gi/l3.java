package gi;

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
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ky;
public class l3 extends View {
    public float A0;
    public final gc B0;
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
    public final org.telegram.ui.Components.g6 I;
    public float I0;
    public boolean J;
    public float J0;
    public final TextPaint K;
    public boolean K0;
    public Layout.Alignment L;
    public boolean L0;
    public StaticLayout M;
    public boolean M0;
    public org.telegram.ui.Components.l5 N;
    public Path N0;
    public float O;
    public float O0;
    public float P;
    public Paint P0;
    public float Q;
    public Paint Q0;
    public final m2.p0 R;
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
    public t70 W0;
    public int f13077a;
    public final org.telegram.ui.Components.u5 f13078a0;
    public float f13079b;
    public org.telegram.ui.Cells.y f13080b0;
    public float f13081c;
    public Paint f13082c0;
    public long d;
    public Drawable f13083d0;
    public boolean f13084e;
    public float f13085e0;
    public final boolean f13086f;
    public int f13087f0;
    public int f13088g0;
    public int h;
    public int f13089h0;
    public boolean f13090i0;
    public float f13091j0;
    public float f13092k0;
    public int f13093l0;
    public gh.g m0;
    public Drawable f13094n;
    public final float f13095n0;
    public final float f13096o0;
    public final float f13097p0;
    public final float f13098q0;
    public boolean f13099r;
    public Runnable f13100r0;
    public boolean f13101s;
    public View f13102s0;
    public float f13103t0;
    public float f13104u0;
    public float f13105v0;
    public float f13106w;
    public float f13107w0;
    public final RectF f13108x;
    public final int[] f13109x0;
    public float f13110y;
    public final ky f13111y0;
    public ValueAnimator f13112z0;

    public l3(Context context, int i3) {
        super(context);
        this.f13079b = 0.5f;
        this.f13081c = 0.0f;
        this.d = 3500L;
        this.f13084e = true;
        this.f13086f = true;
        this.h = -1;
        this.f13101s = true;
        this.f13106w = org.telegram.messenger.g0.L(8.0f);
        this.f13108x = new RectF(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f));
        this.f13110y = org.telegram.messenger.g0.L(2.0f);
        this.E = org.telegram.messenger.g0.L(7.0f);
        this.F = org.telegram.messenger.g0.L(6.0f);
        Paint paint = new Paint(1);
        this.G = paint;
        TextPaint textPaint = new TextPaint(1);
        this.K = textPaint;
        this.L = Layout.Alignment.ALIGN_NORMAL;
        this.R = new m2.p0();
        this.U = true;
        this.V = true;
        xq xqVar = xq.h;
        this.f13078a0 = new org.telegram.ui.Components.u5(this, 350L, xqVar);
        this.f13087f0 = org.telegram.messenger.g0.L(2.0f);
        this.f13095n0 = org.telegram.messenger.g0.N(4.0f);
        this.f13096o0 = org.telegram.messenger.g0.N(4.0f);
        this.f13097p0 = org.telegram.messenger.g0.N(5.0f);
        this.f13098q0 = org.telegram.messenger.g0.N(2.0f);
        this.f13103t0 = Float.NaN;
        this.f13109x0 = new int[2];
        this.f13111y0 = new ky(this, 1);
        this.A0 = 1.0f;
        this.B0 = new gc(this, 2.0f, 5.0f);
        this.C0 = new Rect();
        this.D0 = new RectF();
        this.E0 = new RectF();
        this.F0 = new Path();
        this.L0 = true;
        this.V0 = new RectF();
        this.f13077a = i3;
        paint.setColor(-433575896);
        paint.setPathEffect(new CornerPathEffect(this.f13106w));
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(true, true, false);
        this.I = g6Var;
        g6Var.n(0.4f, 320L, xqVar);
        g6Var.setCallback(this);
        v(14.0f);
        g6Var.u(-1);
        textPaint.setColor(-1);
    }

    public static int a(CharSequence charSequence, TextPaint textPaint) {
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return Integer.MAX_VALUE;
        }
        int length = charSequence.length() / 2;
        float f10 = 0.0f;
        int i3 = 0;
        int i10 = -1;
        float f11 = 0.0f;
        float f12 = Float.MAX_VALUE;
        float f13 = 0.0f;
        while (i3 < 10) {
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
                i3++;
                f10 = f13;
                f12 = f11;
            } else {
                break;
            }
        }
        return (int) Math.ceil(Math.max(f13, f11));
    }

    public static CharSequence b(CharSequence charSequence, TextPaint textPaint) {
        int i3;
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
                    i3 = 1;
                } else {
                    length--;
                    i3 = -1;
                }
                if (length <= 0 || length >= charSequence.length()) {
                    break;
                }
                i10++;
                f11 = h;
                i11 = i3;
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
        RectF rectF = this.f13108x;
        int i3 = measuredWidth - ((int) (rectF.left + rectF.right));
        int i10 = this.h;
        if (i10 > 0) {
            i3 = Math.min(i10, i3);
        }
        return Math.max(0, i3);
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
        o31[] o31VarArr = (o31[]) spanned.getSpans(0, charSequence.length(), o31.class);
        ReplacementSpan[] replacementSpanArr = (ReplacementSpan[]) spanned.getSpans(0, charSequence.length(), ReplacementSpan.class);
        int i3 = 0;
        int i10 = 0;
        while (i3 < replacementSpanArr.length) {
            ReplacementSpan replacementSpan = replacementSpanArr[i3];
            TextPaint textPaint2 = textPaint;
            i10 = (int) (Math.max(0.0f, replacementSpan.getSize(textPaint2, charSequence2, spanStart, spanEnd, textPaint.getFontMetricsInt()) - textPaint2.measureText(spanned, spanned.getSpanStart(replacementSpan), spanned.getSpanEnd(replacementSpan))) + i10);
            i3++;
            textPaint = textPaint2;
            charSequence = charSequence;
        }
        CharSequence charSequence3 = charSequence;
        TextPaint textPaint3 = textPaint;
        if (o31VarArr != null && o31VarArr.length != 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < o31VarArr.length; i12++) {
                int spanStart2 = spanned.getSpanStart(o31VarArr[i12]);
                int spanEnd2 = spanned.getSpanEnd(o31VarArr[i12]);
                int max = Math.max(i11, spanStart2);
                if (max - i11 > 0) {
                    f10 += textPaint3.measureText(spanned, i11, max);
                }
                i11 = Math.max(max, spanEnd2);
                if (i11 - max > 0) {
                    Typeface typeface = textPaint3.getTypeface();
                    textPaint3.setTypeface(o31VarArr[i12].f36687a);
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
        gh.g gVar = this.m0;
        if (gVar != null) {
            gVar.setAlpha(Math.max(1, (int) (f10 * 255.0f)));
            this.m0.draw(canvas);
            d(canvas);
            return;
        }
        int i3 = this.f13093l0;
        Paint paint = this.G;
        if (i3 != 0) {
            paint.setShadowLayer(this.f13091j0, 0.0f, this.f13092k0, org.telegram.ui.ActionBar.k6.r1(f10, i3));
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f10));
        canvas.drawPath(this.F0, paint);
        paint.setAlpha(alpha);
        d(canvas);
    }

    public final void d(Canvas canvas) {
        if (this.M0) {
            int L = org.telegram.messenger.g0.L(64.0f);
            float currentTimeMillis = ((float) ((System.currentTimeMillis() - this.U0) % 4000)) / 4000.0f;
            float b10 = org.telegram.messenger.camera.q.b(this.I0 * 4.0f, L * 2, currentTimeMillis, -L);
            this.S0.reset();
            this.S0.postTranslate(this.D0.left + b10, 0.0f);
            this.R0.setLocalMatrix(this.S0);
            this.T0.setLocalMatrix(this.S0);
            canvas.drawPath(this.F0, this.P0);
            canvas.drawPath(this.N0, this.Q0);
            invalidate();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        float c2;
        float f10;
        RectF rectF;
        RectF rectF2;
        boolean z11;
        float f11;
        float f12;
        float f13;
        float f14;
        l3 l3Var;
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
        if (!this.J || this.M != null) {
            if (this.W && !this.L0) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d = this.f13078a0.d(z10);
            if (this.L0) {
                this.L0 = false;
                invalidate();
            }
            if (d <= 0.0f) {
                gh.g gVar = this.m0;
                if (gVar != null) {
                    gVar.setAlpha(0);
                    return;
                }
                return;
            }
            boolean z12 = this.J;
            org.telegram.ui.Components.g6 g6Var = this.I;
            if (z12) {
                c2 = this.P;
            } else {
                c2 = g6Var.c();
            }
            if (this.J) {
                f10 = this.Q;
            } else {
                f10 = g6Var.f33986e;
            }
            if (this.f13099r) {
                if (this.f13094n == null) {
                    Drawable mutate = getContext().getResources().getDrawable(2131232235).mutate();
                    this.f13094n = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
                }
                c2 += this.f13110y + this.f13094n.getIntrinsicWidth();
                f10 = Math.max(this.f13094n.getIntrinsicHeight(), f10);
            }
            if (this.f13083d0 != null) {
                c2 += this.f13088g0 + this.f13087f0;
                f10 = Math.max(this.f13089h0, f10);
            }
            float f20 = c2;
            RectF rectF4 = this.f13108x;
            float f21 = rectF4.left + f20 + rectF4.right;
            float f22 = rectF4.top + f10 + rectF4.bottom;
            boolean z13 = this.K0;
            RectF rectF5 = this.D0;
            if (z13 && Math.abs(f21 - this.I0) <= 0.1f && Math.abs(f22 - this.J0) <= 0.1f) {
                l3Var = this;
                rectF = rectF4;
                f15 = f22;
                rectF3 = rectF5;
                f14 = f20;
            } else {
                this.I0 = f21;
                this.J0 = f22;
                rectF = rectF4;
                e(this.F0, f21, f22, 0.0f, rectF5, this.C0);
                if (this.m0 == null) {
                    rectF2 = rectF5;
                    f12 = f21;
                    f13 = f22;
                    f14 = f20;
                } else {
                    int round = Math.round(this.F);
                    int round2 = Math.round(rectF5.left);
                    int round3 = Math.round(rectF5.top);
                    int round4 = Math.round(rectF5.right);
                    int round5 = Math.round(rectF5.bottom);
                    int i3 = this.f13077a;
                    rectF2 = rectF5;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
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
                    if (i3 != 0 && i3 != 2) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    gh.g gVar2 = this.m0;
                    if (z11) {
                        f11 = this.H0;
                    } else {
                        f11 = this.G0;
                    }
                    float f23 = round;
                    f12 = f21;
                    gh.f fVar = gVar2.R;
                    int i10 = fVar.f12310n;
                    f13 = f22;
                    float f24 = this.f13095n0;
                    f14 = f20;
                    float f25 = this.f13096o0;
                    if (i10 != i3 || fVar.f12311o != f11 || fVar.f12312p != f23 || fVar.f12313q != f24 || fVar.f12314r != f25) {
                        fVar.f12310n = i3;
                        fVar.f12311o = f11;
                        fVar.f12312p = f23;
                        fVar.f12313q = f24;
                        fVar.f12314r = f25;
                        fVar.a();
                        gVar2.n();
                        gVar2.invalidateSelf();
                    }
                    this.m0.setBounds(round2, round3, round4, round5);
                }
                if (this.M0) {
                    rectF3 = rectF2;
                    f15 = f13;
                    e(this.N0, f12, f15, this.O0, this.E0, null);
                    l3Var = this;
                } else {
                    l3Var = this;
                    rectF3 = rectF2;
                    f15 = f13;
                }
            }
            if (l3Var.f13086f) {
                f16 = d;
            } else {
                f16 = 1.0f;
            }
            canvas.save();
            if (d < 1.0f && l3Var.f13084e) {
                float T1 = org.telegram.messenger.g0.T1(0.75f, 1.0f, d);
                canvas.scale(T1, T1, l3Var.G0, l3Var.H0);
            }
            float a10 = l3Var.B0.a(0.025f);
            if (a10 != 1.0f) {
                canvas.scale(a10, a10, l3Var.G0, l3Var.H0);
            }
            if (l3Var.A0 != 1.0f) {
                int i11 = l3Var.f13077a;
                int i12 = -1;
                if (i11 != 3 && i11 != 1) {
                    if (i11 == 0) {
                        paddingRight = l3Var.getPaddingLeft();
                    } else {
                        paddingRight = l3Var.getPaddingRight();
                    }
                    float max = (l3Var.A0 - 1.0f) * Math.max(paddingRight, org.telegram.messenger.g0.L(24.0f));
                    if (l3Var.f13077a != 0) {
                        i12 = 1;
                    }
                    canvas.translate(max * i12, 0.0f);
                } else {
                    if (i11 == 3) {
                        paddingTop = l3Var.getPaddingBottom();
                    } else {
                        paddingTop = l3Var.getPaddingTop();
                    }
                    float max2 = (l3Var.A0 - 1.0f) * Math.max(paddingTop, org.telegram.messenger.g0.L(24.0f));
                    if (l3Var.f13077a != 1) {
                        i12 = 1;
                    }
                    canvas.translate(0.0f, max2 * i12);
                }
            }
            RectF rectF6 = org.telegram.messenger.g0.P;
            rectF6.set(rectF3);
            float f26 = -l3Var.F;
            rectF6.inset(f26, f26);
            l3Var.c(canvas, f16);
            org.telegram.ui.Cells.y yVar = l3Var.f13080b0;
            if (yVar != null) {
                yVar.setAlpha((int) (f16 * 255.0f));
                l3Var.f13080b0.setBounds(l3Var.C0);
                l3Var.f13080b0.draw(canvas);
            }
            float f27 = ((rectF3.top + rectF.top) + (rectF3.bottom - rectF.bottom)) / 2.0f;
            Drawable drawable2 = l3Var.f13083d0;
            if (drawable2 != null) {
                if (l3Var.f13090i0) {
                    float f28 = (rectF.left / 2.0f) + 0.0f + rectF3.left;
                    float f29 = l3Var.f13085e0 + f27;
                    float f30 = l3Var.f13089h0 / 2.0f;
                    f17 = 255.0f;
                    drawable2.setBounds((int) f28, (int) (f29 - f30), (int) (f28 + l3Var.f13088g0), (int) (f30 + f29));
                    f19 = l3Var.f13088g0 + l3Var.f13087f0 + 0.0f;
                } else {
                    f17 = 255.0f;
                    float f31 = (0.0f + rectF3.right) - (rectF.right / 2.0f);
                    float f32 = l3Var.f13085e0 + f27;
                    float f33 = l3Var.f13089h0 / 2.0f;
                    drawable2.setBounds((int) (f31 - l3Var.f13088g0), (int) (f32 - f33), (int) f31, (int) (f33 + f32));
                    f19 = 0.0f;
                }
                l3Var.f13083d0.setAlpha((int) (f16 * f17));
                l3Var.f13083d0.draw(canvas);
                f18 = f19;
            } else {
                f17 = 255.0f;
                f18 = 0.0f;
            }
            if (l3Var.J) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, l3Var.getWidth(), Math.max(l3Var.getHeight(), f15), (int) (f16 * f17), 31);
                float f34 = ((f18 + rectF3.left) + rectF.left) - l3Var.O;
                l3Var.S = f34;
                float f35 = f27 - (l3Var.Q / 2.0f);
                l3Var.T = f35;
                canvas2.translate(f34, f35);
                if (l3Var.R.h(canvas2)) {
                    l3Var.invalidate();
                }
                l3Var.M.draw(canvas2);
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas2, l3Var.M, l3Var.N, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
                canvas2.restore();
            } else {
                canvas2 = canvas;
                CharSequence charSequence = l3Var.H;
                if (charSequence != null) {
                    g6Var.t(charSequence, l3Var.W, true);
                    l3Var.H = null;
                }
                float f36 = rectF3.left;
                float f37 = rectF.left;
                float f38 = l3Var.Q / 2.0f;
                g6Var.setBounds((int) (f18 + f36 + f37), (int) (f27 - f38), (int) (f36 + f37 + f14), (int) (f38 + f27));
                g6Var.B = (int) (f16 * f17);
                g6Var.draw(canvas2);
            }
            if (l3Var.f13099r) {
                if (l3Var.f13094n == null) {
                    Drawable mutate2 = l3Var.getContext().getResources().getDrawable(2131232235).mutate();
                    l3Var.f13094n = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
                }
                l3Var.f13094n.setAlpha((int) (f16 * f17));
                l3Var.f13094n.setBounds((int) ((rectF3.right - (rectF.right * 0.66f)) - drawable.getIntrinsicWidth()), (int) (rectF3.centerY() - (l3Var.f13094n.getIntrinsicHeight() / 2.0f)), (int) (rectF3.right - (rectF.right * 0.66f)), (int) ((l3Var.f13094n.getIntrinsicHeight() / 2.0f) + rectF3.centerY()));
                l3Var.f13094n.draw(canvas2);
            }
            canvas2.restore();
        }
    }

    public final void e(Path path, float f10, float f11, float f12, RectF rectF, Rect rect) {
        float f13;
        float f14 = f10 / 2.0f;
        float f15 = f11 / 2.0f;
        float min = Math.min(this.f13106w, Math.min(f14, f15));
        int i3 = this.f13077a;
        if (i3 != 1 && i3 != 3) {
            float i10 = Utilities.i(org.telegram.messenger.g0.W1(this.f13079b, getPaddingTop(), getMeasuredHeight() - getPaddingBottom()) + this.f13081c, getMeasuredHeight() - getPaddingBottom(), getPaddingTop());
            float min2 = Math.min(Math.max(getPaddingTop(), i10 - f15) + f11, getMeasuredHeight() - getPaddingBottom());
            float f16 = min2 - f11;
            float f17 = this.E;
            f13 = Utilities.i(i10, (min2 - min) - f17, f16 + min + f17);
            if (this.f13077a == 0) {
                rectF.set(getPaddingLeft() + this.F, f16, getPaddingLeft() + this.F + f10, min2);
            } else {
                rectF.set(((getMeasuredWidth() - getPaddingRight()) - this.F) - f10, f16, (getMeasuredWidth() - getPaddingRight()) - this.F, min2);
            }
        } else {
            float i11 = Utilities.i(org.telegram.messenger.g0.W1(this.f13079b, getPaddingLeft(), getMeasuredWidth() - getPaddingRight()) + this.f13081c, getMeasuredWidth() - getPaddingRight(), getPaddingLeft());
            float min3 = Math.min(Math.max(getPaddingLeft(), i11 - f14) + f10, getMeasuredWidth() - getPaddingRight());
            float f18 = min3 - f10;
            float f19 = this.E;
            float i12 = Utilities.i(i11, (min3 - min) - f19, f18 + min + f19);
            if (this.f13077a == 1) {
                rectF.set(f18, getPaddingTop() + this.F, min3, getPaddingTop() + this.F + f11);
            } else {
                rectF.set(f18, ((getMeasuredHeight() - this.F) - getPaddingBottom()) - f11, min3, (getMeasuredHeight() - this.F) - getPaddingBottom());
            }
            f13 = i12;
        }
        float f20 = -f12;
        rectF.inset(f20, f20);
        if (rect != null) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        path.rewind();
        boolean z10 = this.f13101s;
        RectF rectF2 = this.V0;
        if (z10) {
            path.moveTo(rectF.left, rectF.bottom);
        } else {
            float f21 = rectF.left;
            float f22 = rectF.bottom;
            float f23 = min * 2.0f;
            rectF2.set(f21, f22 - f23, f23 + f21, f22);
            path.arcTo(rectF2, 90.0f, 90.0f);
        }
        if (this.f13077a == 0) {
            path.lineTo(rectF.left, this.E + f13 + org.telegram.messenger.g0.L(2.0f));
            path.lineTo(rectF.left, this.E + f13);
            path.lineTo(rectF.left - this.F, org.telegram.messenger.g0.L(1.0f) + f13);
            float f24 = rectF.left - this.F;
            this.G0 = f24;
            this.H0 = f13;
            path.lineTo(f24, f13 - org.telegram.messenger.g0.L(1.0f));
            path.lineTo(rectF.left, f13 - this.E);
            path.lineTo(rectF.left, (f13 - this.E) - org.telegram.messenger.g0.L(2.0f));
            if (rect != null) {
                rect.left = (int) (rect.left - this.F);
            }
        }
        if (this.f13101s) {
            path.lineTo(rectF.left, rectF.top);
        } else {
            float f25 = rectF.left;
            float f26 = rectF.top;
            float f27 = min * 2.0f;
            rectF2.set(f25, f26, f25 + f27, f27 + f26);
            path.arcTo(rectF2, 180.0f, 90.0f);
        }
        if (this.f13077a == 1) {
            path.lineTo((f13 - this.E) - org.telegram.messenger.g0.L(2.0f), rectF.top);
            path.lineTo(f13 - this.E, rectF.top);
            path.lineTo(f13 - org.telegram.messenger.g0.L(1.0f), rectF.top - this.F);
            this.G0 = f13;
            this.H0 = rectF.top - this.F;
            path.lineTo(org.telegram.messenger.g0.L(1.0f) + f13, rectF.top - this.F);
            path.lineTo(this.E + f13, rectF.top);
            path.lineTo(this.E + f13 + org.telegram.messenger.g0.L(2.0f), rectF.top);
            if (rect != null) {
                rect.top = (int) (rect.top - this.F);
            }
        }
        if (this.f13101s) {
            path.lineTo(rectF.right, rectF.top);
        } else {
            float f28 = rectF.right;
            float f29 = min * 2.0f;
            float f30 = rectF.top;
            rectF2.set(f28 - f29, f30, f28, f29 + f30);
            path.arcTo(rectF2, 270.0f, 90.0f);
        }
        if (this.f13077a == 2) {
            path.lineTo(rectF.right, (f13 - this.E) - org.telegram.messenger.g0.L(2.0f));
            path.lineTo(rectF.right, f13 - this.E);
            path.lineTo(rectF.right + this.F, f13 - org.telegram.messenger.g0.L(1.0f));
            float f31 = rectF.right + this.F;
            this.G0 = f31;
            this.H0 = f13;
            path.lineTo(f31, org.telegram.messenger.g0.L(1.0f) + f13);
            path.lineTo(rectF.right, this.E + f13);
            path.lineTo(rectF.right, this.E + f13 + org.telegram.messenger.g0.L(2.0f));
            if (rect != null) {
                rect.right = (int) (rect.right + this.F);
            }
        }
        if (this.f13101s) {
            path.lineTo(rectF.right, rectF.bottom);
        } else {
            float f32 = rectF.right;
            float f33 = min * 2.0f;
            float f34 = rectF.bottom;
            rectF2.set(f32 - f33, f34 - f33, f32, f34);
            path.arcTo(rectF2, 0.0f, 90.0f);
        }
        if (this.f13077a == 3) {
            path.lineTo(this.E + f13 + org.telegram.messenger.g0.L(2.0f), rectF.bottom);
            path.lineTo(this.E + f13, rectF.bottom);
            path.lineTo(org.telegram.messenger.g0.L(1.0f) + f13, rectF.bottom + this.F);
            this.G0 = f13;
            this.H0 = rectF.bottom + this.F;
            path.lineTo(f13 - org.telegram.messenger.g0.L(1.0f), rectF.bottom + this.F);
            path.lineTo(f13 - this.E, rectF.bottom);
            path.lineTo((f13 - this.E) - org.telegram.messenger.g0.L(2.0f), rectF.bottom);
            if (rect != null) {
                rect.bottom = (int) (rect.bottom + this.F);
            }
        }
        path.close();
        this.K0 = true;
    }

    public final void f(boolean z10) {
        org.telegram.messenger.g0.r(this.f13111y0);
        Runnable runnable = this.f13100r0;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        this.W = false;
        org.telegram.ui.Components.u5 u5Var = this.f13078a0;
        if (!z10) {
            u5Var.getClass();
            u5Var.e(false, 0.0f);
        }
        invalidate();
        Runnable runnable2 = this.f13100r0;
        if (runnable2 != null) {
            org.telegram.messenger.g0.i3(runnable2, u5Var.f38645c * ((float) u5Var.f38648g));
        }
        this.R.f(true);
    }

    public final void g(int i3, CharSequence charSequence) {
        this.M = new StaticLayout(charSequence, this.K, i3, this.L, 1.0f, 0.0f, false);
        float f10 = i3;
        float f11 = 0.0f;
        for (int i10 = 0; i10 < this.M.getLineCount(); i10++) {
            f10 = Math.min(f10, this.M.getLineLeft(i10));
            f11 = Math.max(f11, this.M.getLineRight(i10));
        }
        this.P = Math.max(0.0f, f11 - f10);
        this.Q = this.M.getHeight();
        this.O = f10;
        this.N = org.telegram.ui.Components.p5.update(0, this, this.N, this.M);
    }

    public View getAnchorView() {
        return this.f13102s0;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.H;
        if (charSequence != null) {
            return charSequence;
        }
        if (!this.J) {
            return this.I.f33989i;
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
        return this.I.f33981a;
    }

    public final void i(float f10) {
        this.f13105v0 = f10;
    }

    public final void j(int i3) {
        Paint paint = this.G;
        if (paint.getColor() != i3) {
            paint.setColor(i3);
            invalidate();
        }
    }

    public final void k(boolean z10) {
        this.f13099r = z10;
        if (!this.J) {
            float f10 = 11.0f;
            float L = org.telegram.messenger.g0.L(11.0f);
            float L2 = org.telegram.messenger.g0.L(6.0f);
            if (this.f13099r) {
                f10 = 15.0f;
            }
            this.f13108x.set(L, L2, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(7.0f));
        }
    }

    public final void l(eh.c cVar) {
        hh.e eVar = new hh.e(null);
        eVar.f14417e = new i8(6);
        eVar.f(872415231, 872415231);
        eVar.e(452984831, 452984831);
        eVar.d(808661811, 805306368);
        eVar.f14419n = org.telegram.messenger.g0.N(6.0f);
        eVar.f14420r = 0.0f;
        eVar.f14418f = 1.0f;
        eVar.h = 1.0f;
        gh.g c2 = cVar.c(this, eVar, false);
        this.m0 = c2;
        c2.setCallback(this);
        this.m0.r(this.f13106w + this.f13098q0);
        this.m0.u((int) this.f13097p0);
        gh.g gVar = this.m0;
        gVar.R.f12304g = 1.0f;
        gVar.n();
        gh.g gVar2 = this.m0;
        if (!gVar2.Q) {
            gVar2.Q = true;
            gVar2.P = null;
            gVar2.invalidateSelf();
        }
        this.m0.setAlpha(0);
        this.K0 = false;
        invalidate();
    }

    public final void m(Drawable drawable) {
        Drawable drawable2 = this.f13083d0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f13083d0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            Drawable drawable3 = this.f13083d0;
            if (drawable3 instanceof ch0) {
                this.d = Math.max(this.d, ((ch0) drawable3).r());
            }
            this.f13088g0 = this.f13083d0.getIntrinsicWidth();
            this.f13089h0 = this.f13083d0.getIntrinsicHeight();
            this.f13090i0 = true;
        }
    }

    public final void n(float f10, float f11, float f12, float f13) {
        this.f13108x.set(org.telegram.messenger.g0.N(f10), org.telegram.messenger.g0.N(f11), org.telegram.messenger.g0.N(f12), org.telegram.messenger.g0.N(f13));
    }

    public final void o(float f10, float f11) {
        if (Math.abs(this.f13079b - f10) >= 1.0f || Math.abs(this.f13081c - org.telegram.messenger.g0.L(f11)) >= 1.0f) {
            this.K0 = false;
            invalidate();
        }
        this.f13079b = f10;
        this.f13081c = org.telegram.messenger.g0.L(f11);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.p5.release(this, this.N);
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (z10 && this.W) {
            z();
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        this.K0 = false;
        int textMaxWidth = getTextMaxWidth();
        org.telegram.ui.Components.g6 g6Var = this.I;
        g6Var.M = textMaxWidth;
        if (this.J) {
            CharSequence charSequence = this.H;
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
        } else {
            CharSequence charSequence2 = this.H;
            if (charSequence2 != null) {
                g6Var.t(charSequence2, false, true);
            }
        }
        this.H = null;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: gi.l3.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(float f10, float f11) {
        if (Math.abs(this.f13079b - f10) >= 1.0f || Math.abs(this.f13081c - f11) >= 1.0f) {
            this.K0 = false;
            invalidate();
        }
        this.f13079b = f10;
        this.f13081c = f11;
    }

    public final void q(int i3) {
        this.h = i3;
    }

    public final void r(boolean z10) {
        this.J = z10;
        RectF rectF = this.f13108x;
        float f10 = 15.0f;
        if (z10) {
            rectF.set(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
            this.f13110y = org.telegram.messenger.g0.L(6.0f);
            return;
        }
        float L = org.telegram.messenger.g0.L(11.0f);
        float L2 = org.telegram.messenger.g0.L(6.0f);
        if (!this.f13099r) {
            f10 = 11.0f;
        }
        rectF.set(L, L2, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(7.0f));
        this.f13110y = org.telegram.messenger.g0.L(2.0f);
    }

    public final void s(float f10) {
        CornerPathEffect cornerPathEffect;
        float L = org.telegram.messenger.g0.L(f10);
        this.f13106w = L;
        gh.g gVar = this.m0;
        if (gVar != null) {
            gVar.r(L + this.f13098q0);
        }
        CornerPathEffect cornerPathEffect2 = null;
        if (this.f13101s) {
            cornerPathEffect = new CornerPathEffect(this.f13106w);
        } else {
            cornerPathEffect = null;
        }
        this.G.setPathEffect(cornerPathEffect);
        Paint paint = this.f13082c0;
        if (paint != null) {
            if (this.f13101s) {
                cornerPathEffect2 = new CornerPathEffect(this.f13106w);
            }
            paint.setPathEffect(cornerPathEffect2);
        }
    }

    public final void t() {
        this.f13101s = false;
        this.G.setPathEffect(null);
    }

    public final void u(CharSequence charSequence) {
        if (getMeasuredWidth() < 0) {
            this.H = charSequence;
        } else if (!this.J) {
            this.I.t(charSequence, false, true);
        } else {
            g(getTextMaxWidth(), charSequence);
        }
    }

    public final void v(float f10) {
        this.I.w(org.telegram.messenger.g0.N(f10));
        this.K.setTextSize(org.telegram.messenger.g0.N(f10));
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.I && drawable != this.f13080b0 && drawable != this.f13083d0 && drawable != this.m0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w() {
        if (this.W && this.V) {
            ValueAnimator valueAnimator = this.f13112z0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f13112z0 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f13112z0 = ofFloat;
            ofFloat.addUpdateListener(new j3(this, 0));
            this.f13112z0.addListener(new ai.e1(this, 21));
            this.f13112z0.setInterpolator(xq.f40456k);
            this.f13112z0.setDuration(300L);
            this.f13112z0.start();
        }
        org.telegram.messenger.g0.i2(getText());
        this.W = true;
        invalidate();
        ky kyVar = this.f13111y0;
        org.telegram.messenger.g0.r(kyVar);
        long j10 = this.d;
        if (j10 > 0) {
            org.telegram.messenger.g0.i3(kyVar, j10);
        }
        Runnable runnable = this.f13100r0;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
    }

    public final void x(float f10, float f11, boolean z10) {
        this.f13102s0 = null;
        this.f13103t0 = f10;
        this.f13104u0 = f11;
        z();
        if (!this.W) {
            w();
            if (!z10) {
                this.f13078a0.a(true);
            }
        }
    }

    public final void y(View view, boolean z10) {
        boolean z11;
        if (this.W && this.f13102s0 == view) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f13102s0 = view;
        this.f13103t0 = Float.NaN;
        z();
        if (!z11) {
            w();
            if (!z10) {
                this.f13078a0.a(true);
            }
        }
    }

    public final void z() {
        float f10;
        float f11;
        if (getParent() instanceof View) {
            if (this.f13102s0 != null || !Float.isNaN(this.f13103t0)) {
                if (!isLaidOut()) {
                    post(new ai.i0(this, 3));
                    return;
                }
                View view = this.f13102s0;
                if (view != null) {
                    int[] iArr = this.f13109x0;
                    view.getLocationInWindow(iArr);
                    ((View) getParent()).getLocationInWindow(iArr);
                    float f12 = iArr[0] - iArr[0];
                    float f13 = iArr[1] - iArr[1];
                    int width = this.f13102s0.getWidth();
                    int height = this.f13102s0.getHeight();
                    float f14 = f12 + this.f13107w0;
                    int i3 = this.f13077a;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                f10 = (width / 2.0f) + f14;
                                f11 = f13 - this.f13105v0;
                            } else {
                                f10 = f14 - this.f13105v0;
                            }
                        } else {
                            f10 = (width / 2.0f) + f14;
                            f11 = f13 + height + this.f13105v0;
                        }
                    } else {
                        f10 = this.f13105v0 + f14 + width;
                    }
                    f11 = f13 + (height / 2.0f);
                } else {
                    f10 = this.f13103t0;
                    f11 = this.f13104u0;
                }
                int i10 = this.f13077a;
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
