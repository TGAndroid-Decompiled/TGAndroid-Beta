package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.s51;
public class f6 extends FrameLayout {
    public lc A0;
    public final int[] B0;
    public final int[] C0;
    public final int[] D0;
    public final s70[] E;
    public final LinearLayout.LayoutParams[] F;
    public final ai.k1[] G;
    public final TextPaint H;
    public final s51 I;
    public final ai.c0[] J;
    public final ai.c0 K;
    public final FrameLayout L;
    public final org.telegram.ui.Components.k9 M;
    public final h5 N;
    public boolean O;
    public final TextView P;
    public final ImageView Q;
    public final ImageView R;
    public final ImageView S;
    public boolean T;
    public Boolean U;
    public final View.OnClickListener V;
    public final View.OnClickListener W;
    public final org.telegram.ui.ActionBar.e6 f5083a;
    public final View.OnClickListener f5084a0;
    public final FrameLayout f5085b;
    public k5 f5086b0;
    public final x5 f5087c;
    public final TL_stars.starGiftAttributeBackdrop[] f5088c0;
    public final org.telegram.ui.Components.k9[] d;
    public a f5089d0;
    public final TL_stars.starGiftAttributeModel[] f5090e;
    public a f5091e0;
    public final LinearLayout[] f5092f;
    public a f5093f0;
    public boolean f5094g0;
    public final FrameLayout.LayoutParams[] h;
    public boolean f5095h0;
    public float f5096i0;
    public float f5097j0;
    public float f5098k0;
    public ValueAnimator f5099l0;
    public final d1 m0;
    public final ai.r2 f5100n;
    public final Paint[] f5101n0;
    public final RadialGradient[] f5102o0;
    public final Matrix[] f5103p0;
    public RadialGradient f5104q0;
    public final s70[] f5105r;
    public final Matrix f5106r0;
    public final s70 f5107s;
    public final Paint f5108s0;
    public final TL_stars.starGiftAttributePattern[] f5109t0;
    public final org.telegram.ui.Components.e5[] f5110u0;
    public int f5111v0;
    public final TextView f5112w;
    public float f5113w0;
    public int f5114x;
    public float f5115x0;
    public final FrameLayout f5116y;
    public ValueAnimator f5117y0;
    public final RectF f5118z0;

    public f6(Context context, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable, View.OnClickListener onClickListener, r1 r1Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f10;
        float f11;
        int i3;
        int i10;
        float f12;
        float f13;
        int i11;
        float f14;
        int i12;
        ai.c0[] c0VarArr;
        int i13;
        this.d = new org.telegram.ui.Components.k9[5];
        this.f5090e = new TL_stars.starGiftAttributeModel[3];
        this.f5092f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.f5105r = new s70[5];
        this.E = new s70[5];
        this.F = new LinearLayout.LayoutParams[5];
        this.G = new ai.k1[5];
        this.f5086b0 = new k5(0, 0);
        this.f5088c0 = new TL_stars.starGiftAttributeBackdrop[3];
        this.m0 = new d1(this, 8);
        this.f5101n0 = new Paint[3];
        this.f5102o0 = new RadialGradient[3];
        this.f5103p0 = new Matrix[3];
        this.f5106r0 = new Matrix();
        int i14 = 1;
        this.f5108s0 = new Paint(1);
        this.f5109t0 = new TL_stars.starGiftAttributePattern[2];
        this.f5110u0 = new org.telegram.ui.Components.e5[2];
        int i15 = 0;
        while (true) {
            Paint[] paintArr = this.f5101n0;
            if (i15 >= paintArr.length) {
                break;
            }
            paintArr[i15] = new Paint(1);
            i15++;
        }
        int i16 = 0;
        while (true) {
            org.telegram.ui.Components.e5[] e5VarArr = this.f5110u0;
            f10 = 28.0f;
            if (i16 >= e5VarArr.length) {
                break;
            }
            e5VarArr[i16] = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(28.0f), this);
            i16++;
        }
        this.f5115x0 = 1.0f;
        this.f5118z0 = new RectF();
        this.B0 = new int[12];
        this.C0 = new int[12];
        this.D0 = new int[12];
        this.f5083a = e6Var;
        this.V = onClickListener4;
        this.W = onClickListener5;
        this.f5084a0 = onClickListener6;
        setWillNotDraw(false);
        this.f5085b = new FrameLayout(context);
        int i17 = 0;
        while (true) {
            org.telegram.ui.Components.k9[] k9VarArr = this.d;
            f11 = f10;
            float f15 = 0.0f;
            if (i17 >= k9VarArr.length) {
                break;
            }
            k9VarArr[i17] = new c6(context, 0);
            this.d[i17].setLayerNum(6660);
            if (i17 > 0) {
                this.d[i17].getImageReceiver().f21271t1 = 1;
            }
            this.f5085b.addView(this.d[i17], mf.e(-1, -1, 119));
            org.telegram.ui.Components.k9 k9Var = this.d[i17];
            if (i17 == 0) {
                f15 = 1.0f;
            }
            k9Var.setAlpha(f15);
            i17++;
            f10 = f11;
        }
        s70 s70Var = new s70(context, null);
        this.f5107s = s70Var;
        s70Var.setTextSize(1, 12.0f);
        s70Var.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        s70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        TextView textView = new TextView(context);
        this.f5112w = textView;
        textView.setOnClickListener(new a6(this, 0));
        pf.b(textView, 0.05f, 1.25f);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setLinkTextColor(-1);
        textView.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        TextView textView2 = new TextView(context);
        this.P = textView2;
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.4f);
        textView2.setScaleY(0.4f);
        textView2.setVisibility(8);
        textView2.setGravity(17);
        pf.a(textView2);
        s51 s51Var = new s51(3, context, this);
        this.I = s51Var;
        s51Var.setOrientation(0);
        this.J = new ai.c0[3];
        int i18 = 0;
        while (true) {
            ai.c0[] c0VarArr2 = this.J;
            if (i18 >= c0VarArr2.length) {
                break;
            }
            c0VarArr2[i18] = new ai.c0(context, 2);
            if (i18 != 0) {
                if (i18 != i14) {
                    if (i18 != 2) {
                        i12 = i14;
                    } else {
                        i12 = i14;
                        this.J[i18].e(2131231169, bd.M0(2131750446, null), false);
                        this.J[i18].setOnClickListener(onClickListener4);
                    }
                } else {
                    i12 = i14;
                    this.J[i18].e(2131231103, bd.M0(2131750433, null), false);
                    this.J[i18].setOnClickListener(onClickListener3);
                }
            } else {
                i12 = i14;
                this.J[i18].e(2131231120, bd.M0(2131750441, null), false);
                this.J[i18].setOnClickListener(onClickListener2);
            }
            this.J[i18].setBackground(org.telegram.ui.ActionBar.k6.b0(0, 285212671, 16, 16));
            pf.b(this.J[i18], 0.075f, 1.5f);
            s51 s51Var2 = this.I;
            ai.c0 c0Var = this.J[i18];
            if (i18 != c0VarArr.length - 1) {
                i13 = 11;
            } else {
                i13 = 0;
            }
            s51Var2.addView(c0Var, mf.q(0, 56, 1.0f, 119, 0, 0, i13, 0));
            i18++;
            i14 = i12;
        }
        ai.c0 c0Var2 = new ai.c0(context, 2);
        this.K = c0Var2;
        c0Var2.e(2131231093, bd.M0(2131743119, null), false);
        c0Var2.setBackground(org.telegram.ui.ActionBar.k6.b0(0, 285212671, 16, 16));
        pf.b(c0Var2, 0.075f, 1.5f);
        c0Var2.setVisibility(8);
        this.I.addView(c0Var2, i14, mf.q(0, 56, 1.0f, 119, 0, 0, 11, 0));
        this.f5116y = new FrameLayout(context);
        int i19 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f5092f;
            if (i19 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i19] = new LinearLayout(context);
            this.f5092f[i19].setOrientation(1);
            if (i19 == 2) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.L = frameLayout;
                this.f5092f[i19].addView(frameLayout, mf.r(-1, 144, 119));
                org.telegram.ui.Components.k9 k9Var2 = new org.telegram.ui.Components.k9(context);
                this.M = k9Var2;
                k9Var2.setRoundRadius(org.telegram.messenger.g0.L(41.0f));
                frameLayout.addView(k9Var2, mf.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.f5105r[i19] = new s70(context, null);
                this.f5105r[i19].setTextColor(-1);
                this.f5105r[i19].setTextSize(1, 20.0f);
                this.f5105r[i19].setTypeface(org.telegram.messenger.g0.o());
                this.f5105r[i19].setSingleLine();
                s70 s70Var2 = this.f5105r[i19];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                s70Var2.setEllipsize(truncateAt);
                this.f5105r[i19].setGravity(17);
                frameLayout.addView(this.f5105r[i19], mf.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.E[i19] = new s70(context, null);
                this.E[i19].setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27988j5, e6Var));
                this.E[i19].setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.H(this.E[i19], org.telegram.ui.ActionBar.k6.Uc, e6Var);
                this.E[i19].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                this.E[i19].setDisablePaddingsOffsetY(true);
                this.E[i19].setSingleLine();
                this.E[i19].setGravity(17);
                this.E[i19].setEllipsize(truncateAt);
                frameLayout.addView(this.E[i19], mf.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i19 == 4) {
                h5 h5Var = new h5(context, e6Var);
                this.N = h5Var;
                this.f5092f[i19].addView(h5Var, mf.o(-1, -2));
                View view = this.f5092f[i19];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = mf.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i19] = d;
                addView(view, d);
                i19++;
            } else {
                this.f5105r[i19] = new s70(context, null);
                if (i19 == 3) {
                    this.f5105r[i19].setTextColor(-1);
                } else {
                    this.f5105r[i19].setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27988j5, e6Var));
                }
                this.f5105r[i19].setTextSize(1, 20.0f);
                this.f5105r[i19].setTypeface(org.telegram.messenger.g0.o());
                this.f5105r[i19].setGravity(17);
                LinearLayout linearLayout = this.f5092f[i19];
                s70 s70Var3 = this.f5105r[i19];
                if (i19 == 3) {
                    i3 = 10;
                } else {
                    i3 = 0;
                }
                linearLayout.addView(s70Var3, mf.t(-1, -2, 17, 24, i3, 24, 0));
                if (i19 == 0) {
                    this.f5092f[i19].addView(this.f5107s, mf.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f5092f[i19].addView(this.f5112w, mf.n(19.33f, -2, 17, 0, 6, 0, 2));
                }
                if (i19 == 0) {
                    this.E[i19] = new s70(context, null);
                    if (i19 == 3) {
                        this.E[i19].setTextColor(org.telegram.ui.ActionBar.k6.r1(0.75f, -1));
                    } else {
                        this.E[i19].setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27988j5, e6Var));
                    }
                    this.E[i19].setTextSize(1, 14.0f);
                    this.E[i19].setGravity(17);
                    org.telegram.ui.ActionBar.r6.H(this.E[i19], org.telegram.ui.ActionBar.k6.Uc, e6Var);
                    this.E[i19].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.E[i19].setDisablePaddingsOffsetY(true);
                    this.f5116y.addView(this.E[i19], mf.e(-2, -2, 17));
                    this.f5116y.addView(this.P, mf.a(-2.0f, 20.33f, 17));
                    LinearLayout linearLayout2 = this.f5092f[i19];
                    FrameLayout frameLayout2 = this.f5116y;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.F;
                    if (i19 == 3) {
                        i11 = 6;
                    } else {
                        i11 = 0;
                    }
                    LinearLayout.LayoutParams t10 = mf.t(-1, -2, 17, 24, 0, 24, i11);
                    layoutParamsArr2[i19] = t10;
                    linearLayout2.addView(frameLayout2, t10);
                } else {
                    this.E[i19] = new s70(context, null);
                    if (i19 == 3) {
                        this.E[i19].setTextColor(org.telegram.ui.ActionBar.k6.r1(0.75f, -1));
                    } else {
                        this.E[i19].setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27988j5, e6Var));
                    }
                    this.E[i19].setTextSize(1, 14.0f);
                    this.E[i19].setGravity(17);
                    org.telegram.ui.ActionBar.r6.H(this.E[i19], org.telegram.ui.ActionBar.k6.Uc, e6Var);
                    this.E[i19].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.E[i19].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout3 = this.f5092f[i19];
                    s70 s70Var4 = this.E[i19];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.F;
                    if (i19 == 3) {
                        i10 = 6;
                    } else {
                        i10 = 0;
                    }
                    LinearLayout.LayoutParams t11 = mf.t(-1, -2, 17, 24, 0, 24, i10);
                    layoutParamsArr3[i19] = t11;
                    linearLayout3.addView(s70Var4, t11);
                }
                LinearLayout.LayoutParams layoutParams = this.F[i19];
                if (i19 == 3) {
                    f13 = 6.0f;
                } else {
                    if (i19 == 1) {
                        f12 = 7.33f;
                    } else if (this.f5088c0[0] == null) {
                        f12 = 9.0f;
                    } else {
                        f12 = 5.66f;
                    }
                    f13 = f12 - 4.0f;
                }
                layoutParams.topMargin = org.telegram.messenger.g0.L(f13);
                this.G[i19] = new ai.k1(context);
                this.G[i19].setVisibility(8);
                this.G[i19].setPadding(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(2.0f));
                if (i19 == 0) {
                    this.H = this.G[i19].getTextPaint();
                }
                this.f5092f[i19].addView(this.G[i19], mf.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i19 == 0) {
                this.f5092f[i19].addView(this.I, mf.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f5092f[i19];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            if (i19 == 2) {
                f14 = 32.0f;
            } else {
                f14 = 170.0f;
            }
            ViewGroup.LayoutParams d10 = mf.d(-1, -2.0f, 119, 16.0f, f14, 16.0f, 0.0f);
            layoutParamsArr4[i19] = d10;
            addView(view2, d10);
            i19++;
        }
        addView(this.f5085b, mf.d(160, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        x5 x5Var = new x5(context);
        this.f5087c = x5Var;
        addView(x5Var, mf.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(f11), 620756991));
        imageView.setImageResource(2131232096);
        pf.a(imageView);
        addView(imageView, mf.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView.setOnClickListener(new ai.j0(1, runnable));
        imageView.setVisibility(8);
        ImageView imageView2 = new ImageView(context);
        this.R = imageView2;
        imageView2.setImageResource(2131231111);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        pf.a(imageView2);
        if (r1Var != null) {
            addView(imageView2, mf.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView2.setOnClickListener(r1Var);
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setContentDescription(bd.M0(2131754878, null));
        imageView3.setImageResource(2131231749);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        pf.a(imageView3);
        addView(imageView3, mf.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView3.setOnClickListener(onClickListener);
        imageView3.setVisibility(8);
        ai.r2 r2Var = new ai.r2(context);
        this.f5100n = r2Var;
        r2Var.b(bd.M0(2131749761, null), true);
        ai.t2 t2Var = r2Var.f940a;
        if (t2Var.f984w == null) {
            lc lcVar = new lc(2, 12);
            t2Var.f984w = lcVar;
            lcVar.h = 5.0f;
        }
        Path path = t2Var.f980f;
        float f16 = t2Var.f983s;
        t2Var.f985x = true;
        ai.t2.d(path, f16, true);
        r2Var.setScaleX(1.2f);
        r2Var.setScaleY(1.2f);
        addView(r2Var, mf.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        r2Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f5117y0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5117y0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5117y0 = ofFloat;
        ofFloat.addUpdateListener(new b6(this, 1));
        this.f5117y0.addListener(new d6(this, 4));
        this.f5117y0.setDuration(320L);
        this.f5117y0.setInterpolator(xq.f40453g);
        this.f5117y0.start();
    }

    public final int b(Canvas canvas, float f10, float f11, float f12, float f13) {
        int i3 = this.f5111v0;
        RadialGradient[] radialGradientArr = this.f5102o0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f5088c0;
        Matrix[] matrixArr = this.f5103p0;
        Paint[] paintArr = this.f5101n0;
        int i10 = 0;
        if (i3 == 0) {
            if (this.f5113w0 > 0.0f && stargiftattributebackdropArr[2] != null) {
                paintArr[2].setAlpha((int) (this.f5086b0.a(1) * 255.0f));
                matrixArr[2].reset();
                matrixArr[2].postTranslate(f10, f11);
                radialGradientArr[2].setLocalMatrix(matrixArr[2]);
                canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[2]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[2];
                i10 = i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
            }
            if (this.f5113w0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) ((1.0f - this.f5113w0) * this.f5086b0.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f10, f11);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                return i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[1].getAlpha()), i10);
            }
            return i10;
        }
        if (this.f5113w0 < 1.0f && stargiftattributebackdropArr[1] != null) {
            paintArr[1].setAlpha((int) (this.f5086b0.a(1) * 255.0f));
            matrixArr[1].reset();
            matrixArr[1].postTranslate(f10, f11);
            radialGradientArr[1].setLocalMatrix(matrixArr[1]);
            canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[1]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[1];
            i10 = i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
        }
        if (this.f5113w0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.f5086b0.a(1) * 255.0f * this.f5113w0));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f10, f11);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[2];
            return i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[2].getAlpha()), i10);
        }
        return i10;
    }

    public final void c(Canvas canvas, float f10, float f11, float f12, float f13) {
        int i3;
        canvas.save();
        canvas.translate(f10, f11);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f5088c0;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
        int i10 = 0;
        if (stargiftattributebackdrop == null) {
            i3 = 0;
        } else {
            i3 = stargiftattributebackdrop.pattern_color | (-16777216);
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
        if (stargiftattributebackdrop2 != null) {
            i10 = stargiftattributebackdrop2.pattern_color | (-16777216);
        }
        int f14 = i0.a.f(this.f5113w0, i3, i10);
        org.telegram.ui.Components.e5[] e5VarArr = this.f5110u0;
        e5VarArr[1].k(Integer.valueOf(f14));
        b1.a(canvas, 0, e5VarArr[1], f12, f13, this.f5086b0.a(1), this.f5115x0);
        canvas.restore();
    }

    public void d(k5 k5Var) {
        View[] viewArr;
        float f10;
        float f11;
        int i3;
        boolean z10;
        int i10;
        boolean z11;
        s70[] s70VarArr;
        int f12;
        float max;
        float a10;
        int i11;
        int i12;
        int i13;
        boolean z12;
        float f13;
        int i14;
        int i15;
        float f14;
        float f15;
        int i16;
        int i17;
        this.f5086b0 = k5Var;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            viewArr = this.f5092f;
            if (i19 >= viewArr.length) {
                break;
            }
            float a11 = k5Var.a(i19);
            viewArr[i19].setAlpha(a11);
            View view = viewArr[i19];
            if (a11 > 0.0f) {
                i17 = 0;
            } else {
                i17 = 4;
            }
            view.setVisibility(i17);
            i19++;
        }
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f5088c0;
        if (stargiftattributebackdropArr[0] != null) {
            f10 = k5Var.a(2);
        } else {
            f10 = 0.0f;
        }
        if (stargiftattributebackdropArr[1] != null) {
            f11 = k5Var.a(1);
        } else {
            f11 = 0.0f;
        }
        float max2 = Math.max(f10, f11);
        ImageView imageView = this.Q;
        imageView.setAlpha(max2);
        if ((stargiftattributebackdropArr[0] != null && k5Var.f5382c == 2) || (stargiftattributebackdropArr[1] != null && k5Var.f5382c == 1)) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        if (stargiftattributebackdropArr[0] == null && !this.T) {
            z10 = false;
        } else {
            z10 = true;
        }
        float a12 = k5Var.a(0);
        int i20 = k5Var.f5382c;
        float V1 = org.telegram.messenger.g0.V1(false, z10, a12);
        ImageView imageView2 = this.S;
        imageView2.setAlpha(V1);
        if (z10 && i20 == 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView2.setVisibility(i10);
        if (stargiftattributebackdropArr[0] != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.U;
        int i21 = -1;
        org.telegram.ui.ActionBar.e6 e6Var = this.f5083a;
        if (bool == null || bool.booleanValue() != z11) {
            this.U = Boolean.valueOf(z11);
            if (z11) {
                imageView2.clearColorFilter();
                imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
            } else {
                org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.J5, e6Var, PorterDuff.Mode.SRC_IN);
                int i22 = org.telegram.ui.ActionBar.k6.f27972i6;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i22, e6Var), 1, -1);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i22);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N, e6Var);
            }
        }
        if (!this.f5095h0) {
            float V12 = org.telegram.messenger.g0.V1(false, this.O, k5Var.a(0));
            TextView textView = this.P;
            textView.setAlpha(V12);
            if (this.O) {
                f14 = 1.0f;
            } else {
                f14 = 0.4f;
            }
            textView.setScaleX(org.telegram.messenger.g0.T1(0.4f, f14, k5Var.a(0)));
            if (this.O) {
                f15 = 1.0f;
            } else {
                f15 = 0.4f;
            }
            textView.setScaleY(org.telegram.messenger.g0.T1(0.4f, f15, k5Var.a(0)));
            if (this.O && i20 == 0) {
                i16 = 0;
            } else {
                i16 = 4;
            }
            textView.setVisibility(i16);
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
        int i23 = 0;
        while (true) {
            s70VarArr = this.E;
            if (i23 >= 2) {
                break;
            }
            s70 s70Var = this.f5105r[i23];
            if (stargiftattributebackdropArr[Math.min(1, i23)] == null) {
                i12 = w02;
            } else {
                i12 = i21;
            }
            s70Var.setTextColor(i12);
            s70 s70Var2 = s70VarArr[i23];
            if (i23 != 0 && i23 != 2) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                if (stargiftattributebackdrop == null) {
                    i14 = w02;
                } else {
                    i14 = stargiftattributebackdrop.text_color | (-16777216);
                }
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
                if (stargiftattributebackdrop2 == null) {
                    i15 = w02;
                } else {
                    i15 = stargiftattributebackdrop2.text_color | (-16777216);
                }
                i13 = i0.a.f(this.f5113w0, i14, i15);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i23];
                if (stargiftattributebackdrop3 == null) {
                    i13 = w02;
                } else {
                    i13 = stargiftattributebackdrop3.text_color | (-16777216);
                }
            }
            s70Var2.setTextColor(i13);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[i23];
            FrameLayout.LayoutParams[] layoutParamsArr = this.h;
            if (stargiftattributebackdrop4 != null) {
                if (org.telegram.messenger.g0.L(184.0f) == layoutParamsArr[i23].topMargin && viewArr[i23].getPaddingBottom() == org.telegram.messenger.g0.L(18.0f)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    viewArr[i23].setPadding(0, 0, 0, org.telegram.messenger.g0.L(18.0f));
                    layoutParamsArr[i23].topMargin = org.telegram.messenger.g0.L(184.0f);
                }
            } else {
                if (org.telegram.messenger.g0.L(170.0f) == layoutParamsArr[i23].topMargin && viewArr[i23].getPaddingBottom() == org.telegram.messenger.g0.L(3.0f)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    viewArr[i23].setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
                    layoutParamsArr[i23].topMargin = org.telegram.messenger.g0.L(170.0f);
                }
            }
            LinearLayout.LayoutParams[] layoutParamsArr2 = this.F;
            LinearLayout.LayoutParams layoutParams = layoutParamsArr2[i23];
            if (i23 == 1) {
                f13 = 7.33f;
            } else if (stargiftattributebackdropArr[0] == null) {
                f13 = 9.0f;
            } else {
                f13 = 5.66f;
            }
            layoutParams.topMargin = org.telegram.messenger.g0.L(f13 - 4.0f);
            if (z12) {
                viewArr[i23].setLayoutParams(layoutParamsArr[i23]);
                if (i23 == 0) {
                    this.f5116y.setLayoutParams(layoutParamsArr2[i23]);
                } else {
                    s70VarArr[i23].setLayoutParams(layoutParamsArr2[i23]);
                }
            }
            i23++;
            i21 = -1;
        }
        int L = org.telegram.messenger.g0.L(24.0f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop5 == null) {
            f12 = 553648127;
        } else {
            f12 = i0.a.f(0.25f, stargiftattributebackdrop5.edge_color | (-16777216), stargiftattributebackdrop5.pattern_color | (-16777216));
        }
        this.f5112w.setBackground(org.telegram.ui.ActionBar.k6.d0(L, f12));
        s70 s70Var3 = s70VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            w02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        s70Var3.setTextColor(w02);
        org.telegram.ui.Components.k9[] k9VarArr = this.d;
        org.telegram.ui.Components.k9 k9Var = k9VarArr[0];
        k5 k5Var2 = this.f5086b0;
        if (k5Var2.b(0) && k5Var2.b(2)) {
            max = 1.0f;
        } else {
            max = Math.max(k5Var2.a(0), k5Var2.a(2));
        }
        k9Var.setAlpha(Math.max(max, this.f5086b0.a(3)));
        k9VarArr[1].setAlpha((1.0f - this.f5113w0) * k5Var.a(1));
        k9VarArr[2].setAlpha(k5Var.a(1) * this.f5113w0);
        float T1 = org.telegram.messenger.g0.T1(1.0f, this.f5098k0, k5Var.a(2));
        FrameLayout frameLayout = this.f5085b;
        frameLayout.setScaleX(T1);
        frameLayout.setScaleY(org.telegram.messenger.g0.T1(1.0f, this.f5098k0, k5Var.a(2)));
        frameLayout.setTranslationX(k5Var.a(2) * this.f5096i0);
        frameLayout.setTranslationY((k5Var.a(2) * this.f5097j0) + (k5Var.a(1) * org.telegram.messenger.g0.L(16.0f)));
        View view2 = viewArr[2];
        int i24 = k5Var.f5381b;
        if (i24 == 2 && i20 == 2) {
            a10 = 0.0f;
        } else {
            if (i24 != 2) {
                i20 = i24;
            }
            a10 = (1.0f - k5Var.a(2)) * (-(viewArr[i20].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view2.setTranslationY(a10);
        if (this.f5094g0 && this.f5086b0.b(0)) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        ai.r2 r2Var = this.f5100n;
        r2Var.setVisibility(i11);
        r2Var.setAlpha(this.f5086b0.a(0));
        if (k5Var.a(4) <= 0.0f) {
            i18 = 8;
        }
        h5 h5Var = this.N;
        h5Var.setVisibility(i18);
        h5Var.setAlpha(k5Var.a(4));
        invalidate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float max;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        float f10;
        float f11;
        float f12;
        int[] iArr;
        int[] iArr2;
        float f13;
        int i3;
        int[] iArr3;
        f6 f6Var;
        Canvas canvas2;
        x5 x5Var;
        float max2;
        ai.c0 c0Var;
        float realHeight = getRealHeight();
        canvas.save();
        float f14 = 0.0f;
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float f15 = 2.0f;
        float width = getWidth() / 2.0f;
        float L = org.telegram.messenger.g0.L(80.0f) + org.telegram.messenger.g0.W1(this.f5086b0.a(1), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f));
        k5 k5Var = this.f5086b0;
        if ((k5Var.b(0) && k5Var.b(2)) || ((k5Var.b(2) && k5Var.b(3)) || (k5Var.b(3) && k5Var.b(0)))) {
            max = 1.0f;
        } else {
            max = Math.max(k5Var.a(0), Math.max(k5Var.a(2), k5Var.a(3)));
        }
        int i10 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.f5088c0;
        if (i10 > 0 && stargiftattributebackdropArr2[0] != null) {
            if (this.f5104q0 != null && this.f5086b0.a(2) >= 1.0f) {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            } else {
                Paint[] paintArr = this.f5101n0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.f5103p0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, L);
                this.f5102o0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            }
            if (this.f5104q0 != null && this.f5086b0.a(2) > 0.0f) {
                Paint paint = this.f5108s0;
                paint.setAlpha((int) (this.f5086b0.a(2) * 255.0f));
                Matrix matrix = this.f5106r0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.f5104q0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        } else {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        }
        if (this.f5086b0.a(1) > 0.0f) {
            f10 = width;
            f11 = L;
            k(b(canvas, f10, f11, getWidth(), realHeight));
        } else {
            f10 = width;
            f11 = L;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
        int[] iArr4 = this.D0;
        int[] iArr5 = this.C0;
        int[] iArr6 = this.B0;
        if (stargiftattributebackdrop != null) {
            int i11 = 0;
            while (i11 < iArr6.length) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                iArr5[i11] = stargiftattributebackdrop2.text_color | (-16777216);
                iArr6[i11] = i0.a.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i11] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
                i11++;
                f14 = f14;
                f15 = f15;
            }
        }
        float f16 = f14;
        float f17 = f15;
        x5 x5Var2 = this.f5087c;
        if (x5Var2.f6349s == null && x5Var2.f6350w == null && x5Var2.f6351x == null) {
            f6Var = this;
            f13 = f10;
            f12 = f11;
            iArr = iArr5;
            iArr2 = iArr6;
            i3 = 1;
            x5Var = x5Var2;
            iArr3 = iArr4;
            canvas2 = canvas;
        } else {
            float width2 = getWidth();
            float f18 = f10;
            r5 r5Var = x5Var2.f6349s;
            float f19 = f11;
            float f20 = x5Var2.f6352y;
            int[] iArr7 = this.C0;
            int[] iArr8 = this.B0;
            int[] iArr9 = this.D0;
            f12 = f19;
            iArr = iArr5;
            iArr2 = iArr6;
            f13 = f18;
            i3 = 1;
            iArr3 = iArr4;
            f6Var = this;
            canvas2 = canvas;
            x5Var2.a(canvas2, r5Var, f20, width2, realHeight, iArr7, iArr8, iArr9);
            x5Var2.a(canvas2, x5Var2.f6350w, x5Var2.E, width2, realHeight, iArr7, iArr8, iArr9);
            x5Var2.a(canvas2, x5Var2.f6351x, x5Var2.F, width2, realHeight, iArr7, iArr8, iArr9);
            x5Var = x5Var2;
            f6Var.invalidate();
        }
        if (i10 > 0 && stargiftattributebackdropArr[0] != null) {
            int i12 = iArr3[iArr3.length / 2];
            k5 k5Var2 = f6Var.f5086b0;
            if (k5Var2.b(0) && k5Var2.b(3)) {
                max2 = 1.0f;
            } else {
                max2 = Math.max(k5Var2.a(0), k5Var2.a(3));
            }
            int i13 = (max2 > f16 ? 1 : (max2 == f16 ? 0 : -1));
            org.telegram.ui.Components.e5[] e5VarArr = f6Var.f5110u0;
            if (i13 > 0) {
                canvas2.save();
                canvas2.translate(f13, f12);
                e5VarArr[0].k(Integer.valueOf(i12));
                b1.a(canvas, 0, e5VarArr[0], f6Var.getWidth(), realHeight, max2, 1.0f);
                realHeight = realHeight;
                canvas.restore();
            }
            if (f6Var.f5086b0.a(2) > f16) {
                canvas.save();
                e5VarArr[0].k(Integer.valueOf(i12));
                float f21 = realHeight;
                RectF rectF = org.telegram.messenger.g0.P;
                LinearLayout[] linearLayoutArr = f6Var.f5092f;
                float x10 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = f6Var.L;
                float x11 = frameLayout.getX() + x10;
                org.telegram.ui.Components.k9 k9Var = f6Var.M;
                rectF.set(k9Var.getX() + x11, k9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), k9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + k9Var.getWidth(), k9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + k9Var.getHeight());
                b1.c(canvas, e5VarArr[0], f6Var.getWidth(), f21 * 0.7f, 1.0f, rectF, f6Var.f5086b0.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            int i14 = 0;
            while (true) {
                ai.c0[] c0VarArr = f6Var.J;
                if (i14 > c0VarArr.length) {
                    break;
                }
                if (i14 < c0VarArr.length) {
                    c0Var = c0VarArr[i14];
                } else {
                    c0Var = f6Var.K;
                }
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.k6.H1(c0Var.getBackground(), iArr10[Utilities.j(Math.round((((c0Var.getWidth() / f17) + c0Var.getX()) / f6Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    c0Var.invalidate();
                }
                i14++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i15 = iArr11[iArr11.length / 2];
            int i16 = iArr12[iArr12.length / 2];
            TextView textView = f6Var.f5112w;
            if (textView != null && f6Var.f5114x != i15) {
                f6Var.f5114x = i15;
                textView.setTextColor(i15);
                org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), i16, false);
            }
            if (x5Var.f6349s != null || x5Var.f6350w != null || x5Var.f6351x != null) {
                f6Var.E[0].setTextColor(i15);
            }
            if (f6Var.f5086b0.a(2) > f16) {
                if (f6Var.A0 == null) {
                    f6Var.A0 = new lc(i3, 12);
                }
                FrameLayout frameLayout2 = f6Var.f5085b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / f17) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / f17;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / f17) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / f17;
                float f22 = measuredHeight + scaleY;
                RectF rectF2 = f6Var.f5118z0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f22);
                f6Var.A0.g(rectF2);
                f6Var.A0.d();
                f6Var.A0.a(canvas2, org.telegram.ui.ActionBar.k6.r1(f6Var.f5086b0.a(2), -1));
                f6Var.invalidate();
            }
        }
        if (f6Var.f5086b0.a(1) > f16) {
            f6Var.c(canvas2, f13, f12, f6Var.getWidth(), f6Var.getRealHeight());
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(int i3, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
        RadialGradient[] radialGradientArr = this.f5102o0;
        radialGradientArr[i3] = radialGradient;
        if (i3 == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.f5104q0 = radialGradient2;
            this.f5108s0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.f5103p0;
        if (matrixArr[i3] == null) {
            matrixArr[i3] = new Matrix();
        }
        this.f5101n0[i3].setShader(radialGradientArr[i3]);
    }

    public final void f(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        dg.b bVar;
        dg.a resellAmount;
        boolean z14;
        int i3;
        int i10;
        this.O = false;
        if (!z10 && !z11) {
            z13 = false;
        } else {
            z13 = true;
        }
        boolean z15 = starGift instanceof TL_stars.TL_starGiftUnique;
        int i11 = 8;
        s51 s51Var = this.I;
        s70[] s70VarArr = this.E;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f5088c0;
        if (z15) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) e9.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) e9.l(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            s70VarArr[0].setTextSize(1, 13.0f);
            if (z13) {
                i11 = 0;
            }
            s51Var.setVisibility(i11);
            ai.c0[] c0VarArr = this.J;
            c0VarArr[2].setVisibility(0);
            if (z13) {
                ai.c0 c0Var = c0VarArr[1];
                if (z12) {
                    i3 = 2131231102;
                } else {
                    i3 = 2131231103;
                }
                if (z12) {
                    i10 = 2131750430;
                } else {
                    i10 = 2131750433;
                }
                c0Var.e(i3, bd.M0(i10, null), false);
            }
            float f10 = 1.0f;
            if (starGift.resell_amount != null) {
                this.O = true;
                boolean z16 = starGift.resale_ton_only;
                dg.b bVar2 = dg.b.f8926b;
                if (z16) {
                    bVar = bVar2;
                } else {
                    bVar = dg.b.f8925a;
                }
                if (starGift.getResellAmount(bVar).f8923a == bVar2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                CharSequence V = bd.V(null, null, 2131749689, wb.V0("⭐️ " + ((Object) wb.M0(resellAmount.o(), 1.0f, ',')), z14), Float.valueOf(0.9f));
                TextView textView = this.P;
                textView.setText(V);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                if (l6.K1(h10.f22829t0, org.telegram.messenger.m5.o(starGift.owner_id))) {
                    textView.setOnClickListener(new a6(this, 1));
                    pf.a(textView);
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                }
            }
            if (z10) {
                c0VarArr[0].setAlpha(1.0f);
                c0VarArr[0].e(2131231120, bd.M0(2131750441, null), false);
            } else {
                c0VarArr[0].setAlpha(0.5f);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                spannableStringBuilder.setSpan(new wp(2131232242, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) bd.M0(2131750441, null));
                c0VarArr[0].e(2131231120, spannableStringBuilder, false);
            }
            ai.c0 c0Var2 = c0VarArr[1];
            if (!z10 && !z11) {
                f10 = 0.5f;
            }
            c0Var2.setAlpha(f10);
            if (z10) {
                ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                View.OnClickListener onClickListener = this.W;
                if (arrayList != null) {
                    c0VarArr[2].e(2131231118, bd.M0(2131750440, null), false);
                    c0VarArr[2].setOnClickListener(onClickListener);
                } else {
                    c0VarArr[2].e(2131231119, bd.M0(2131750454, null), false);
                    c0VarArr[2].setOnClickListener(onClickListener);
                }
            } else {
                c0VarArr[2].e(2131231169, bd.M0(2131750446, null), false);
                c0VarArr[2].setOnClickListener(this.V);
            }
            this.f5094g0 = starGift.crafted;
            this.f5100n.f940a.e(stargiftattributebackdropArr[0], false, true);
        } else {
            stargiftattributebackdropArr[0] = null;
            s70VarArr[0].setTextSize(1, 14.0f);
            this.f5094g0 = false;
            s51Var.setVisibility(8);
        }
        e(0, stargiftattributebackdropArr[0]);
        wb.d1(this.d[0].getImageReceiver(), starGift, 160);
        this.f5090e[0] = (TL_stars.starGiftAttributeModel) e9.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        d(this.f5086b0);
    }

    public final void g(int i3, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z10) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.f5109t0;
            if (stargiftattributepatternArr[i3] != stargiftattributepattern) {
                stargiftattributepatternArr[i3] = stargiftattributepattern;
                this.f5110u0[i3].i(stargiftattributepattern.document, z10);
            }
        }
    }

    public int getFinalHeight() {
        int L;
        int measuredHeight;
        boolean d = this.f5086b0.d(0);
        float f10 = 10.0f;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f5088c0;
        LinearLayout[] linearLayoutArr = this.f5092f;
        if (d) {
            if (stargiftattributebackdropArr[0] != null) {
                f10 = 24.0f;
            }
            return linearLayoutArr[0].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(f10);
        } else if (this.f5086b0.d(1)) {
            if (stargiftattributebackdropArr[1] != null) {
                f10 = 24.0f;
            }
            return linearLayoutArr[1].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(f10);
        } else {
            if (this.f5086b0.d(2)) {
                L = org.telegram.messenger.g0.L(64.0f);
                measuredHeight = linearLayoutArr[2].getMeasuredHeight();
            } else if (this.f5086b0.d(3)) {
                L = org.telegram.messenger.g0.L(160.0f);
                measuredHeight = linearLayoutArr[3].getMeasuredHeight();
            } else if (!this.f5086b0.d(4)) {
                return 0;
            } else {
                h5 h5Var = this.N;
                if (h5Var.getMeasuredHeight() > 0) {
                    return h5Var.getMeasuredHeight();
                }
                return org.telegram.messenger.g0.L(550.0f);
            }
            return measuredHeight + L;
        }
    }

    public float getRealHeight() {
        float f10;
        float f11;
        int L;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f5088c0;
        float f12 = 10.0f;
        if (stargiftattributebackdropArr[0] != null) {
            f10 = 24.0f;
        } else {
            f10 = 10.0f;
        }
        int L2 = org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(f10);
        LinearLayout[] linearLayoutArr = this.f5092f;
        float a10 = (this.f5086b0.a(0) * (linearLayoutArr[0].getMeasuredHeight() + L2)) + 0.0f;
        if (stargiftattributebackdropArr[1] != null) {
            f11 = 24.0f;
        } else {
            f11 = 10.0f;
        }
        int L3 = org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(f11);
        float a11 = (this.f5086b0.a(2) * (linearLayoutArr[2].getMeasuredHeight() + org.telegram.messenger.g0.L(64.0f))) + (this.f5086b0.a(1) * (linearLayoutArr[1].getMeasuredHeight() + L3)) + a10;
        if (stargiftattributebackdropArr[0] != null) {
            f12 = 24.0f;
        }
        int L4 = org.telegram.messenger.g0.L(f12);
        float a12 = (this.f5086b0.a(3) * (linearLayoutArr[3].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + L4)) + a11;
        h5 h5Var = this.N;
        if (h5Var.getMeasuredHeight() > 0) {
            L = h5Var.getMeasuredHeight();
        } else {
            L = org.telegram.messenger.g0.L(550.0f);
        }
        return (this.f5086b0.a(4) * L) + a12;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        int i3 = (this.f5113w0 > 0.5f ? 1 : (this.f5113w0 == 0.5f ? 0 : -1));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f5088c0;
        if (i3 > 0) {
            return stargiftattributebackdropArr[2];
        }
        return stargiftattributebackdropArr[1];
    }

    public org.telegram.ui.Components.k9 getUpgradeImageView() {
        int i3 = (this.f5113w0 > 0.5f ? 1 : (this.f5113w0 == 0.5f ? 0 : -1));
        org.telegram.ui.Components.k9[] k9VarArr = this.d;
        if (i3 > 0) {
            return k9VarArr[2];
        }
        return k9VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        int i3 = (this.f5113w0 > 0.5f ? 1 : (this.f5113w0 == 0.5f ? 0 : -1));
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.f5090e;
        if (i3 > 0) {
            return stargiftattributemodelArr[2];
        }
        return stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.f5109t0[1];
    }

    public final void h(int i3, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence3, TLObject tLObject, Spannable spannable) {
        int i10;
        int i11;
        this.f5105r[i3].setText(charSequence);
        FrameLayout frameLayout = this.f5116y;
        s70[] s70VarArr = this.E;
        s70 s70Var = this.f5107s;
        TextView textView = this.f5112w;
        int i12 = 0;
        if (i3 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            s70Var.setVisibility(8);
            if (i3 == 0) {
                frameLayout.setVisibility(8);
            } else {
                s70VarArr[i3].setVisibility(8);
            }
        } else if (i3 == 0 && !TextUtils.isEmpty(charSequence3)) {
            s70Var.setText(charSequence3);
            s70Var.setVisibility(0);
            textView.setVisibility(8);
            if (i3 == 0) {
                frameLayout.setVisibility(8);
            } else {
                s70VarArr[i3].setVisibility(8);
            }
        } else {
            s70VarArr[i3].setText(charSequence2);
            if (i3 == 0) {
                if (TextUtils.isEmpty(charSequence2)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                frameLayout.setVisibility(i11);
            } else {
                s70 s70Var2 = s70VarArr[i3];
                if (TextUtils.isEmpty(charSequence2)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                s70Var2.setVisibility(i10);
            }
            s70Var.setVisibility(8);
            textView.setVisibility(8);
        }
        ai.k1[] k1VarArr = this.G;
        ai.k1 k1Var = k1VarArr[i3];
        if (k1Var != null) {
            if (TextUtils.isEmpty(spannable)) {
                i12 = 8;
            }
            k1Var.setVisibility(i12);
            k1VarArr[i3].setUser(tLObject);
            k1VarArr[i3].setMessage(spannable);
        }
    }

    public final void i(int i3, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i3, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z10) {
        int i3;
        s51 s51Var = this.I;
        s51Var.setVisibility(0);
        ai.c0[] c0VarArr = this.J;
        c0VarArr[0].setAlpha(1.0f);
        c0VarArr[0].e(2131231120, bd.M0(2131750441, null), false);
        c0VarArr[0].setOnClickListener(onClickListener);
        if (onClickListener2 != null) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        ai.c0 c0Var = this.K;
        c0Var.setVisibility(i3);
        c0Var.setOnClickListener(onClickListener2);
        c0VarArr[1].e(2131231103, bd.M0(2131750433, null), false);
        c0VarArr[1].setOnClickListener(onClickListener3);
        ((LinearLayout.LayoutParams) c0VarArr[1].getLayoutParams()).rightMargin = 0;
        setWalletDisplayed(z10);
        c0VarArr[2].setVisibility(8);
        s51Var.requestLayout();
    }

    public final void l() {
        s70[] s70VarArr;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        s70 s70Var;
        int i3;
        int i10;
        int i11;
        int i12;
        s70[] s70VarArr2 = this.f5105r;
        if (s70VarArr2 != null && (s70VarArr = this.E) != null && (stargiftattributebackdropArr = this.f5088c0) != null) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27988j5, this.f5083a);
            for (int i13 = 0; i13 < 2; i13++) {
                s70 s70Var2 = s70VarArr2[i13];
                if (s70Var2 != null && s70VarArr[i13] != null) {
                    if (stargiftattributebackdropArr[Math.min(1, i13)] == null) {
                        i3 = w02;
                    } else {
                        i3 = -1;
                    }
                    s70Var2.setTextColor(i3);
                    s70 s70Var3 = s70VarArr[i13];
                    if (i13 != 0 && i13 != 2) {
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                        if (stargiftattributebackdrop == null) {
                            i11 = w02;
                        } else {
                            i11 = stargiftattributebackdrop.text_color | (-16777216);
                        }
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
                        if (stargiftattributebackdrop2 == null) {
                            i12 = w02;
                        } else {
                            i12 = (-16777216) | stargiftattributebackdrop2.text_color;
                        }
                        i10 = i0.a.f(this.f5113w0, i11, i12);
                    } else {
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i13];
                        if (stargiftattributebackdrop3 == null) {
                            i10 = w02;
                        } else {
                            i10 = (-16777216) | stargiftattributebackdrop3.text_color;
                        }
                    }
                    s70Var3.setTextColor(i10);
                }
            }
            if (s70VarArr.length > 2 && (s70Var = s70VarArr[2]) != null) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[0];
                if (stargiftattributebackdrop4 != null) {
                    w02 = stargiftattributebackdrop4.text_color | (-16777216);
                }
                s70Var.setTextColor(w02);
            }
        }
    }

    public final void m() {
        this.f5098k0 = org.telegram.messenger.g0.N(33.33f) / org.telegram.messenger.g0.N(160.0f);
        FrameLayout frameLayout = this.f5085b;
        s70[] s70VarArr = this.f5105r;
        this.f5096i0 = ((((Math.min(s70VarArr[2].getPaint().measureText(s70VarArr[2].getText().toString()), s70VarArr[2].getWidth()) + s70VarArr[2].getWidth()) / 2.0f) + (s70VarArr[2].getX() + (-frameLayout.getLeft()))) + org.telegram.messenger.g0.L(24.0f)) - (org.telegram.messenger.g0.L(126.67f) / 2.0f);
        this.f5097j0 = (org.telegram.messenger.g0.L(124.0f) + (-frameLayout.getTop())) - (org.telegram.messenger.g0.L(126.67f) / 2.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.e5[] e5VarArr = this.f5110u0;
        e5VarArr[0].a();
        e5VarArr[1].a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.e5[] e5VarArr = this.f5110u0;
        e5VarArr[0].b();
        e5VarArr[1].b();
        org.telegram.messenger.g0.r(this.m0);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.f5086b0.b(2)) {
            m();
            d(this.f5086b0);
        }
    }

    public void setPreviewAttributes(k1 k1Var) {
        k5 k5Var = this.f5086b0;
        if (k5Var != null && k5Var.f5382c == 1 && isAttachedToWindow()) {
            org.telegram.messenger.g0.r(this.m0);
            ValueAnimator valueAnimator = this.f5099l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f5099l0 = null;
            }
            int i3 = 1 - this.f5111v0;
            this.f5111v0 = i3;
            org.telegram.ui.Components.k9[] k9VarArr = this.d;
            ch0 B = k9VarArr[2 - i3].getImageReceiver().B();
            ch0 B2 = k9VarArr[this.f5111v0 + 1].getImageReceiver().B();
            if (B2 != null && B != null) {
                B2.T(false, B.t());
            }
            int i10 = this.f5111v0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = k1Var.f5371a;
            this.f5088c0[i10] = stargiftattributebackdrop;
            e(i10, stargiftattributebackdrop);
            g(1, k1Var.f5372b, true);
            int i11 = this.f5111v0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = k1Var.f5373c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.f5090e;
            stargiftattributemodelArr[i11] = stargiftattributemodel;
            wb.c1(k9VarArr[i11].getImageReceiver(), stargiftattributemodelArr[this.f5111v0 + 1].document, 160);
            a();
            float f10 = this.f5111v0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f10, f10);
            this.f5099l0 = ofFloat;
            ofFloat.addUpdateListener(new b6(this, 0));
            this.f5099l0.addListener(new d6(this, 3));
            this.f5099l0.setDuration(320L);
            this.f5099l0.setInterpolator(xq.h);
            this.f5099l0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.f5089d0 = new a(e9.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.f5091e0 = new a(e9.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.f5093f0 = new a(e9.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.E[1].setTextSize(1, 14.0f);
        this.I.setVisibility(8);
        this.f5113w0 = 0.0f;
        this.f5111v0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.f5091e0.c(), true);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.f5090e;
        stargiftattributemodelArr[1] = (TL_stars.starGiftAttributeModel) this.f5089d0.c();
        org.telegram.ui.Components.k9[] k9VarArr = this.d;
        wb.c1(k9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, 160);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.f5093f0.c();
        this.f5088c0[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.f5089d0.f4786f;
        wb.c1(k9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, 160);
        d1 d1Var = this.m0;
        org.telegram.messenger.g0.r(d1Var);
        org.telegram.messenger.g0.i3(d1Var, 2500L);
        invalidate();
    }

    public void setResellPrice(dg.a aVar) {
        boolean z10;
        boolean z11;
        boolean k10 = aVar.k();
        this.O = !k10;
        s70[] s70VarArr = this.E;
        TextView textView = this.P;
        boolean z12 = true;
        if (!k10) {
            if (aVar.f8923a == dg.b.f8926b) {
                z11 = true;
            } else {
                z11 = true;
                z12 = false;
            }
            int i3 = z11;
            Object[] objArr = new Object[i3];
            objArr[0] = wb.X0(z12, "⭐️ " + ((Object) wb.M0(aVar.o(), 1.0f, ',')), 0.9f, null, 0.0f, 1.0f);
            textView.setText(bd.V(null, null, 2131749689, objArr));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f5088c0[0];
            textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.f5095h0 = i3;
            ViewPropertyAnimator duration = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).setListener(new d6(this, 0)).start();
            s70VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(xqVar).start();
            z10 = i3;
        } else {
            z10 = true;
            ViewPropertyAnimator duration2 = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            xq xqVar2 = xq.h;
            duration2.setInterpolator(xqVar2).setListener(new d6(this, 2)).setListener(new d6(this, 1)).start();
            s70VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(xqVar2).start();
        }
        boolean z13 = this.O;
        ai.c0[] c0VarArr = this.J;
        if (z13) {
            c0VarArr[2].e(2131231118, bd.M0(2131750440, null), z10);
        } else {
            c0VarArr[2].e(2131231119, bd.M0(2131750454, null), z10);
        }
        c0VarArr[2].setOnClickListener(this.W);
    }

    public void setShowOptions(boolean z10) {
        this.T = z10;
        d(this.f5086b0);
    }

    public void setWalletCard(boolean z10) {
        int i3;
        int i10;
        ai.c0 c0Var = this.J[1];
        if (z10) {
            i3 = 2131231095;
        } else {
            i3 = 2131231092;
        }
        if (z10) {
            i10 = 2131743112;
        } else {
            i10 = 2131743120;
        }
        c0Var.e(i3, bd.M0(i10, null), false);
    }

    public void setWalletDisplayed(boolean z10) {
        float f10;
        ai.c0 c0Var = this.J[1];
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        c0Var.setAlpha(f10);
    }

    public void setWearPreview(TLObject tLObject) {
        String lowerCase;
        String str;
        String str2;
        if (tLObject instanceof TLRPC.User) {
            str2 = l10.p((TLRPC.User) tLObject);
            str = bd.M0(2131747834, null);
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str3 = chat.title;
            if (org.telegram.messenger.t3.V(chat)) {
                int i3 = chat.participants_count;
                if (i3 > 1) {
                    lowerCase = bd.H(',', "Subscribers", i3);
                } else {
                    lowerCase = bd.M0(2131751391, null);
                }
            } else {
                int i10 = chat.participants_count;
                if (i10 > 1) {
                    lowerCase = bd.H(',', "Members", i10);
                } else {
                    lowerCase = bd.M0(2131754876, null).toLowerCase();
                }
            }
            str = lowerCase;
            str2 = str3;
        } else {
            return;
        }
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.l(tLObject);
        this.M.e(tLObject, u8Var);
        this.f5105r[2].setText(str2);
        this.E[2].setText(str);
        m();
        d(this.f5086b0);
    }

    public void k(int i3) {
    }
}
