package bi;

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
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.c61;
public class e7 extends FrameLayout {
    public final int[] A0;
    public final int[] B0;
    public final int[] C0;
    public final w70[] D;
    public final LinearLayout.LayoutParams[] E;
    public final zh.k0[] F;
    public final TextPaint G;
    public final c61 H;
    public final x5[] I;
    public final x5 J;
    public final FrameLayout K;
    public final org.telegram.ui.Components.l9 L;
    public final d6 M;
    public boolean N;
    public final TextView O;
    public final ImageView P;
    public final ImageView Q;
    public final ImageView R;
    public boolean S;
    public Boolean T;
    public final View.OnClickListener U;
    public final View.OnClickListener V;
    public final View.OnClickListener W;
    public final org.telegram.ui.ActionBar.f6 f3765a;
    public g6 f3766a0;
    public final FrameLayout f3767b;
    public final TL_stars.starGiftAttributeBackdrop[] f3768b0;
    public final v6 f3769c;
    public a f3770c0;
    public final org.telegram.ui.Components.l9[] d;
    public a f3771d0;
    public final TL_stars.starGiftAttributeModel[] f3772e;
    public a f3773e0;
    public final LinearLayout[] f3774f;
    public boolean f3775f0;
    public boolean f3776g0;
    public final FrameLayout.LayoutParams[] h;
    public float f3777h0;
    public float f3778i0;
    public float f3779j0;
    public ValueAnimator f3780k0;
    public final a3.f f3781l0;
    public final Paint[] m0;
    public final zh.a1 f3782n;
    public final RadialGradient[] f3783n0;
    public final Matrix[] f3784o0;
    public RadialGradient f3785p0;
    public final Matrix f3786q0;
    public final w70[] f3787r;
    public final Paint f3788r0;
    public final w70 f3789s;
    public final TL_stars.starGiftAttributePattern[] f3790s0;
    public final org.telegram.ui.Components.g5[] f3791t0;
    public int f3792u0;
    public float f3793v0;
    public final TextView f3794w;
    public float f3795w0;
    public int f3796x;
    public ValueAnimator f3797x0;
    public final FrameLayout f3798y;
    public final RectF f3799y0;
    public ud f3800z0;

    public e7(Context context, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable, View.OnClickListener onClickListener, y1 y1Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f10;
        float f11;
        int i7;
        int i10;
        float f12;
        float f13;
        int i11;
        float f14;
        int i12;
        this.d = new org.telegram.ui.Components.l9[5];
        this.f3772e = new TL_stars.starGiftAttributeModel[3];
        this.f3774f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.f3787r = new w70[5];
        this.D = new w70[5];
        this.E = new LinearLayout.LayoutParams[5];
        this.F = new zh.k0[5];
        this.f3766a0 = new g6(0, 0);
        this.f3768b0 = new TL_stars.starGiftAttributeBackdrop[3];
        this.f3781l0 = new a3.f(this, 28);
        this.m0 = new Paint[3];
        this.f3783n0 = new RadialGradient[3];
        this.f3784o0 = new Matrix[3];
        this.f3786q0 = new Matrix();
        this.f3788r0 = new Paint(1);
        int i13 = 2;
        this.f3790s0 = new TL_stars.starGiftAttributePattern[2];
        this.f3791t0 = new org.telegram.ui.Components.g5[2];
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.m0;
            if (i14 >= paintArr.length) {
                break;
            }
            paintArr[i14] = new Paint(1);
            i14++;
        }
        int i15 = 0;
        while (true) {
            org.telegram.ui.Components.g5[] g5VarArr = this.f3791t0;
            f10 = 28.0f;
            if (i15 >= g5VarArr.length) {
                break;
            }
            g5VarArr[i15] = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(28.0f), this);
            i15++;
        }
        this.f3795w0 = 1.0f;
        this.f3799y0 = new RectF();
        this.A0 = new int[12];
        this.B0 = new int[12];
        this.C0 = new int[12];
        this.f3765a = f6Var;
        this.U = onClickListener4;
        this.V = onClickListener5;
        this.W = onClickListener6;
        setWillNotDraw(false);
        this.f3767b = new FrameLayout(context);
        int i16 = 0;
        while (true) {
            org.telegram.ui.Components.l9[] l9VarArr = this.d;
            float f15 = 0.0f;
            f11 = f10;
            if (i16 >= l9VarArr.length) {
                break;
            }
            l9VarArr[i16] = new b7(context, 0);
            this.d[i16].setLayerNum(6660);
            if (i16 > 0) {
                this.d[i16].getImageReceiver().f21216s1 = 1;
            }
            this.f3767b.addView(this.d[i16], c8.ha.e(-1, -1, 119));
            org.telegram.ui.Components.l9 l9Var = this.d[i16];
            if (i16 == 0) {
                f15 = 1.0f;
            }
            l9Var.setAlpha(f15);
            i16++;
            f10 = f11;
        }
        w70 w70Var = new w70(context, null);
        this.f3789s = w70Var;
        w70Var.setTextSize(1, 12.0f);
        w70Var.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        w70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        TextView textView = new TextView(context);
        this.f3794w = textView;
        textView.setOnClickListener(new y6(this, 0));
        c8.ka.b(textView, 0.05f, 1.25f);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setLinkTextColor(-1);
        textView.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        TextView textView2 = new TextView(context);
        this.O = textView2;
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.4f);
        textView2.setScaleY(0.4f);
        textView2.setVisibility(8);
        textView2.setGravity(17);
        c8.ka.a(textView2);
        c61 c61Var = new c61(2, context, this);
        this.H = c61Var;
        c61Var.setOrientation(0);
        this.I = new x5[3];
        int i17 = 0;
        while (true) {
            x5[] x5VarArr = this.I;
            if (i17 >= x5VarArr.length) {
                break;
            }
            x5VarArr[i17] = new x5(context, 1);
            if (i17 != 0) {
                if (i17 != 1) {
                    if (i17 == i13) {
                        this.I[i17].e(2131231169, org.telegram.messenger.hd.M0(2131750437, null), false);
                        this.I[i17].setOnClickListener(onClickListener4);
                    }
                } else {
                    this.I[i17].e(2131231103, org.telegram.messenger.hd.M0(2131750424, null), false);
                    this.I[i17].setOnClickListener(onClickListener3);
                }
            } else {
                this.I[i17].e(2131231120, org.telegram.messenger.hd.M0(2131750432, null), false);
                this.I[i17].setOnClickListener(onClickListener2);
            }
            this.I[i17].setBackground(org.telegram.ui.ActionBar.k6.b0(0, 285212671, 16, 16));
            c8.ka.b(this.I[i17], 0.075f, 1.5f);
            c61 c61Var2 = this.H;
            x5[] x5VarArr2 = this.I;
            x5 x5Var = x5VarArr2[i17];
            if (i17 != x5VarArr2.length - 1) {
                i12 = 11;
            } else {
                i12 = 0;
            }
            c61Var2.addView(x5Var, c8.ha.q(0, 56, 1.0f, 119, 0, 0, i12, 0));
            i17++;
            i13 = 2;
        }
        x5 x5Var2 = new x5(context, 1);
        this.J = x5Var2;
        x5Var2.e(2131231093, org.telegram.messenger.hd.M0(2131743110, null), false);
        x5Var2.setBackground(org.telegram.ui.ActionBar.k6.b0(0, 285212671, 16, 16));
        c8.ka.b(x5Var2, 0.075f, 1.5f);
        x5Var2.setVisibility(8);
        this.H.addView(x5Var2, 1, c8.ha.q(0, 56, 1.0f, 119, 0, 0, 11, 0));
        this.f3798y = new FrameLayout(context);
        int i18 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f3774f;
            if (i18 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i18] = new LinearLayout(context);
            this.f3774f[i18].setOrientation(1);
            if (i18 == 2) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.K = frameLayout;
                this.f3774f[i18].addView(frameLayout, c8.ha.r(-1, 144, 119));
                org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(context);
                this.L = l9Var2;
                l9Var2.setRoundRadius(org.telegram.messenger.g0.L(41.0f));
                frameLayout.addView(l9Var2, c8.ha.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.f3787r[i18] = new w70(context, null);
                this.f3787r[i18].setTextColor(-1);
                this.f3787r[i18].setTextSize(1, 20.0f);
                this.f3787r[i18].setTypeface(org.telegram.messenger.g0.o());
                this.f3787r[i18].setSingleLine();
                w70 w70Var2 = this.f3787r[i18];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                w70Var2.setEllipsize(truncateAt);
                this.f3787r[i18].setGravity(17);
                frameLayout.addView(this.f3787r[i18], c8.ha.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.D[i18] = new w70(context, null);
                this.D[i18].setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27956j5, f6Var));
                this.D[i18].setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.H(this.D[i18], org.telegram.ui.ActionBar.k6.Uc, f6Var);
                this.D[i18].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                this.D[i18].setDisablePaddingsOffsetY(true);
                this.D[i18].setSingleLine();
                this.D[i18].setGravity(17);
                this.D[i18].setEllipsize(truncateAt);
                frameLayout.addView(this.D[i18], c8.ha.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i18 == 4) {
                d6 d6Var = new d6(context, f6Var);
                this.M = d6Var;
                this.f3774f[i18].addView(d6Var, c8.ha.o(-1, -2));
                View view = this.f3774f[i18];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = c8.ha.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i18] = d;
                addView(view, d);
                i18++;
            } else {
                this.f3787r[i18] = new w70(context, null);
                if (i18 == 3) {
                    this.f3787r[i18].setTextColor(-1);
                } else {
                    this.f3787r[i18].setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27956j5, f6Var));
                }
                this.f3787r[i18].setTextSize(1, 20.0f);
                this.f3787r[i18].setTypeface(org.telegram.messenger.g0.o());
                this.f3787r[i18].setGravity(17);
                LinearLayout linearLayout = this.f3774f[i18];
                w70 w70Var3 = this.f3787r[i18];
                if (i18 == 3) {
                    i7 = 10;
                } else {
                    i7 = 0;
                }
                linearLayout.addView(w70Var3, c8.ha.t(-1, -2, 17, 24, i7, 24, 0));
                if (i18 == 0) {
                    this.f3774f[i18].addView(this.f3789s, c8.ha.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f3774f[i18].addView(this.f3794w, c8.ha.n(19.33f, -2, 17, 0, 6, 0, 2));
                }
                if (i18 == 0) {
                    this.D[i18] = new w70(context, null);
                    if (i18 == 3) {
                        this.D[i18].setTextColor(org.telegram.ui.ActionBar.k6.r1(0.75f, -1));
                    } else {
                        this.D[i18].setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27956j5, f6Var));
                    }
                    this.D[i18].setTextSize(1, 14.0f);
                    this.D[i18].setGravity(17);
                    org.telegram.ui.ActionBar.r6.H(this.D[i18], org.telegram.ui.ActionBar.k6.Uc, f6Var);
                    this.D[i18].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.D[i18].setDisablePaddingsOffsetY(true);
                    this.f3798y.addView(this.D[i18], c8.ha.e(-2, -2, 17));
                    this.f3798y.addView(this.O, c8.ha.a(-2.0f, 20.33f, 17));
                    LinearLayout linearLayout2 = this.f3774f[i18];
                    FrameLayout frameLayout2 = this.f3798y;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
                    if (i18 == 3) {
                        i11 = 6;
                    } else {
                        i11 = 0;
                    }
                    LinearLayout.LayoutParams t6 = c8.ha.t(-1, -2, 17, 24, 0, 24, i11);
                    layoutParamsArr2[i18] = t6;
                    linearLayout2.addView(frameLayout2, t6);
                } else {
                    this.D[i18] = new w70(context, null);
                    if (i18 == 3) {
                        this.D[i18].setTextColor(org.telegram.ui.ActionBar.k6.r1(0.75f, -1));
                    } else {
                        this.D[i18].setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27956j5, f6Var));
                    }
                    this.D[i18].setTextSize(1, 14.0f);
                    this.D[i18].setGravity(17);
                    org.telegram.ui.ActionBar.r6.H(this.D[i18], org.telegram.ui.ActionBar.k6.Uc, f6Var);
                    this.D[i18].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.D[i18].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout3 = this.f3774f[i18];
                    w70 w70Var4 = this.D[i18];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.E;
                    if (i18 == 3) {
                        i10 = 6;
                    } else {
                        i10 = 0;
                    }
                    LinearLayout.LayoutParams t10 = c8.ha.t(-1, -2, 17, 24, 0, 24, i10);
                    layoutParamsArr3[i18] = t10;
                    linearLayout3.addView(w70Var4, t10);
                }
                LinearLayout.LayoutParams layoutParams = this.E[i18];
                if (i18 == 3) {
                    f13 = 6.0f;
                } else {
                    if (i18 == 1) {
                        f12 = 7.33f;
                    } else if (this.f3768b0[0] == null) {
                        f12 = 9.0f;
                    } else {
                        f12 = 5.66f;
                    }
                    f13 = f12 - 4.0f;
                }
                layoutParams.topMargin = org.telegram.messenger.g0.L(f13);
                this.F[i18] = new zh.k0(context);
                this.F[i18].setVisibility(8);
                this.F[i18].setPadding(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(2.0f));
                if (i18 == 0) {
                    this.G = this.F[i18].getTextPaint();
                }
                this.f3774f[i18].addView(this.F[i18], c8.ha.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i18 == 0) {
                this.f3774f[i18].addView(this.H, c8.ha.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f3774f[i18];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            if (i18 == 2) {
                f14 = 32.0f;
            } else {
                f14 = 170.0f;
            }
            ViewGroup.LayoutParams d2 = c8.ha.d(-1, -2.0f, 119, 16.0f, f14, 16.0f, 0.0f);
            layoutParamsArr4[i18] = d2;
            addView(view2, d2);
            i18++;
        }
        addView(this.f3767b, c8.ha.d(160, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        v6 v6Var = new v6(context);
        this.f3769c = v6Var;
        addView(v6Var, c8.ha.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.P = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(f11), 620756991));
        imageView.setImageResource(2131232096);
        c8.ka.a(imageView);
        addView(imageView, c8.ha.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView.setOnClickListener(new z6(0, runnable));
        imageView.setVisibility(8);
        ImageView imageView2 = new ImageView(context);
        this.Q = imageView2;
        imageView2.setImageResource(2131231111);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        c8.ka.a(imageView2);
        if (y1Var != null) {
            addView(imageView2, c8.ha.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView2.setOnClickListener(y1Var);
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.R = imageView3;
        imageView3.setContentDescription(org.telegram.messenger.hd.M0(2131754878, null));
        imageView3.setImageResource(2131231749);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        c8.ka.a(imageView3);
        addView(imageView3, c8.ha.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView3.setOnClickListener(onClickListener);
        imageView3.setVisibility(8);
        zh.a1 a1Var = new zh.a1(context);
        this.f3782n = a1Var;
        a1Var.b(org.telegram.messenger.hd.M0(2131749752, null), true);
        zh.c1 c1Var = a1Var.f60079a;
        if (c1Var.f60125w == null) {
            ud udVar = new ud(2, 12);
            c1Var.f60125w = udVar;
            udVar.h = 5.0f;
        }
        Path path = c1Var.f60121f;
        float f16 = c1Var.f60124s;
        c1Var.f60126x = true;
        zh.c1.d(path, f16, true);
        a1Var.setScaleX(1.2f);
        a1Var.setScaleY(1.2f);
        addView(a1Var, c8.ha.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        a1Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f3797x0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f3797x0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3797x0 = ofFloat;
        ofFloat.addUpdateListener(new a7(this, 1));
        this.f3797x0.addListener(new c7(this, 4));
        this.f3797x0.setDuration(320L);
        this.f3797x0.setInterpolator(xq.f40311g);
        this.f3797x0.start();
    }

    public final int b(Canvas canvas, float f10, float f11, float f12, float f13) {
        int i7 = this.f3792u0;
        RadialGradient[] radialGradientArr = this.f3783n0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f3768b0;
        Matrix[] matrixArr = this.f3784o0;
        Paint[] paintArr = this.m0;
        int i10 = 0;
        if (i7 == 0) {
            if (this.f3793v0 > 0.0f && stargiftattributebackdropArr[2] != null) {
                paintArr[2].setAlpha((int) (this.f3766a0.a(1) * 255.0f));
                matrixArr[2].reset();
                matrixArr[2].postTranslate(f10, f11);
                radialGradientArr[2].setLocalMatrix(matrixArr[2]);
                canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[2]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[2];
                i10 = i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
            }
            if (this.f3793v0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) ((1.0f - this.f3793v0) * this.f3766a0.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f10, f11);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                return i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[1].getAlpha()), i10);
            }
            return i10;
        }
        if (this.f3793v0 < 1.0f && stargiftattributebackdropArr[1] != null) {
            paintArr[1].setAlpha((int) (this.f3766a0.a(1) * 255.0f));
            matrixArr[1].reset();
            matrixArr[1].postTranslate(f10, f11);
            radialGradientArr[1].setLocalMatrix(matrixArr[1]);
            canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[1]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[1];
            i10 = i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
        }
        if (this.f3793v0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.f3766a0.a(1) * 255.0f * this.f3793v0));
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
        int i7;
        canvas.save();
        canvas.translate(f10, f11);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f3768b0;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
        int i10 = 0;
        if (stargiftattributebackdrop == null) {
            i7 = 0;
        } else {
            i7 = stargiftattributebackdrop.pattern_color | (-16777216);
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
        if (stargiftattributebackdrop2 != null) {
            i10 = stargiftattributebackdrop2.pattern_color | (-16777216);
        }
        int f14 = i0.a.f(this.f3793v0, i7, i10);
        org.telegram.ui.Components.g5[] g5VarArr = this.f3791t0;
        g5VarArr[1].k(Integer.valueOf(f14));
        i1.a(canvas, 0, g5VarArr[1], f12, f13, this.f3766a0.a(1), this.f3795w0);
        canvas.restore();
    }

    public void d(g6 g6Var) {
        View[] viewArr;
        float f10;
        float f11;
        int i7;
        boolean z9;
        int i10;
        boolean z10;
        w70[] w70VarArr;
        int f12;
        float max;
        float a10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        float f13;
        int i14;
        int i15;
        float f14;
        float f15;
        int i16;
        int i17;
        this.f3766a0 = g6Var;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            viewArr = this.f3774f;
            if (i19 >= viewArr.length) {
                break;
            }
            float a11 = g6Var.a(i19);
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
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f3768b0;
        if (stargiftattributebackdropArr[0] != null) {
            f10 = g6Var.a(2);
        } else {
            f10 = 0.0f;
        }
        if (stargiftattributebackdropArr[1] != null) {
            f11 = g6Var.a(1);
        } else {
            f11 = 0.0f;
        }
        float max2 = Math.max(f10, f11);
        ImageView imageView = this.P;
        imageView.setAlpha(max2);
        if ((stargiftattributebackdropArr[0] != null && g6Var.f3944c == 2) || (stargiftattributebackdropArr[1] != null && g6Var.f3944c == 1)) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        imageView.setVisibility(i7);
        if (stargiftattributebackdropArr[0] == null && !this.S) {
            z9 = false;
        } else {
            z9 = true;
        }
        float a12 = g6Var.a(0);
        int i20 = g6Var.f3944c;
        float V1 = org.telegram.messenger.g0.V1(false, z9, a12);
        ImageView imageView2 = this.R;
        imageView2.setAlpha(V1);
        if (z9 && i20 == 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView2.setVisibility(i10);
        if (stargiftattributebackdropArr[0] != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.T;
        int i21 = -1;
        org.telegram.ui.ActionBar.f6 f6Var = this.f3765a;
        if (bool == null || bool.booleanValue() != z10) {
            this.T = Boolean.valueOf(z10);
            if (z10) {
                imageView2.clearColorFilter();
                imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
            } else {
                org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.J5, f6Var, PorterDuff.Mode.SRC_IN);
                int i22 = org.telegram.ui.ActionBar.k6.f27940i6;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i22, f6Var), 1, -1);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i22);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N, f6Var);
            }
        }
        if (!this.f3776g0) {
            float V12 = org.telegram.messenger.g0.V1(false, this.N, g6Var.a(0));
            TextView textView = this.O;
            textView.setAlpha(V12);
            if (this.N) {
                f14 = 1.0f;
            } else {
                f14 = 0.4f;
            }
            textView.setScaleX(org.telegram.messenger.g0.T1(0.4f, f14, g6Var.a(0)));
            if (this.N) {
                f15 = 1.0f;
            } else {
                f15 = 0.4f;
            }
            textView.setScaleY(org.telegram.messenger.g0.T1(0.4f, f15, g6Var.a(0)));
            if (this.N && i20 == 0) {
                i16 = 0;
            } else {
                i16 = 4;
            }
            textView.setVisibility(i16);
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27956j5, f6Var);
        int i23 = 0;
        while (true) {
            w70VarArr = this.D;
            if (i23 >= 2) {
                break;
            }
            w70 w70Var = this.f3787r[i23];
            if (stargiftattributebackdropArr[Math.min(1, i23)] == null) {
                i12 = w02;
            } else {
                i12 = i21;
            }
            w70Var.setTextColor(i12);
            w70 w70Var2 = w70VarArr[i23];
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
                i13 = i0.a.f(this.f3793v0, i14, i15);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i23];
                if (stargiftattributebackdrop3 == null) {
                    i13 = w02;
                } else {
                    i13 = stargiftattributebackdrop3.text_color | (-16777216);
                }
            }
            w70Var2.setTextColor(i13);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[i23];
            FrameLayout.LayoutParams[] layoutParamsArr = this.h;
            if (stargiftattributebackdrop4 != null) {
                if (org.telegram.messenger.g0.L(184.0f) == layoutParamsArr[i23].topMargin && viewArr[i23].getPaddingBottom() == org.telegram.messenger.g0.L(18.0f)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    viewArr[i23].setPadding(0, 0, 0, org.telegram.messenger.g0.L(18.0f));
                    layoutParamsArr[i23].topMargin = org.telegram.messenger.g0.L(184.0f);
                }
            } else {
                if (org.telegram.messenger.g0.L(170.0f) == layoutParamsArr[i23].topMargin && viewArr[i23].getPaddingBottom() == org.telegram.messenger.g0.L(3.0f)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    viewArr[i23].setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
                    layoutParamsArr[i23].topMargin = org.telegram.messenger.g0.L(170.0f);
                }
            }
            LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
            LinearLayout.LayoutParams layoutParams = layoutParamsArr2[i23];
            if (i23 == 1) {
                f13 = 7.33f;
            } else if (stargiftattributebackdropArr[0] == null) {
                f13 = 9.0f;
            } else {
                f13 = 5.66f;
            }
            layoutParams.topMargin = org.telegram.messenger.g0.L(f13 - 4.0f);
            if (z11) {
                viewArr[i23].setLayoutParams(layoutParamsArr[i23]);
                if (i23 == 0) {
                    this.f3798y.setLayoutParams(layoutParamsArr2[i23]);
                } else {
                    w70VarArr[i23].setLayoutParams(layoutParamsArr2[i23]);
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
        this.f3794w.setBackground(org.telegram.ui.ActionBar.k6.d0(L, f12));
        w70 w70Var3 = w70VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            w02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        w70Var3.setTextColor(w02);
        org.telegram.ui.Components.l9[] l9VarArr = this.d;
        org.telegram.ui.Components.l9 l9Var = l9VarArr[0];
        g6 g6Var2 = this.f3766a0;
        if (g6Var2.b(0) && g6Var2.b(2)) {
            max = 1.0f;
        } else {
            max = Math.max(g6Var2.a(0), g6Var2.a(2));
        }
        l9Var.setAlpha(Math.max(max, this.f3766a0.a(3)));
        l9VarArr[1].setAlpha((1.0f - this.f3793v0) * g6Var.a(1));
        l9VarArr[2].setAlpha(g6Var.a(1) * this.f3793v0);
        float T1 = org.telegram.messenger.g0.T1(1.0f, this.f3779j0, g6Var.a(2));
        FrameLayout frameLayout = this.f3767b;
        frameLayout.setScaleX(T1);
        frameLayout.setScaleY(org.telegram.messenger.g0.T1(1.0f, this.f3779j0, g6Var.a(2)));
        frameLayout.setTranslationX(g6Var.a(2) * this.f3777h0);
        frameLayout.setTranslationY((g6Var.a(2) * this.f3778i0) + (g6Var.a(1) * org.telegram.messenger.g0.L(16.0f)));
        View view2 = viewArr[2];
        int i24 = g6Var.f3943b;
        if (i24 == 2 && i20 == 2) {
            a10 = 0.0f;
        } else {
            if (i24 != 2) {
                i20 = i24;
            }
            a10 = (1.0f - g6Var.a(2)) * (-(viewArr[i20].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view2.setTranslationY(a10);
        if (this.f3775f0 && this.f3766a0.b(0)) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        zh.a1 a1Var = this.f3782n;
        a1Var.setVisibility(i11);
        a1Var.setAlpha(this.f3766a0.a(0));
        if (g6Var.a(4) <= 0.0f) {
            i18 = 8;
        }
        d6 d6Var = this.M;
        d6Var.setVisibility(i18);
        d6Var.setAlpha(g6Var.a(4));
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
        int i7;
        int[] iArr3;
        e7 e7Var;
        Canvas canvas2;
        v6 v6Var;
        float max2;
        x5 x5Var;
        float realHeight = getRealHeight();
        canvas.save();
        float f14 = 0.0f;
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float f15 = 2.0f;
        float width = getWidth() / 2.0f;
        float L = org.telegram.messenger.g0.L(80.0f) + org.telegram.messenger.g0.W1(this.f3766a0.a(1), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f));
        g6 g6Var = this.f3766a0;
        if ((g6Var.b(0) && g6Var.b(2)) || ((g6Var.b(2) && g6Var.b(3)) || (g6Var.b(3) && g6Var.b(0)))) {
            max = 1.0f;
        } else {
            max = Math.max(g6Var.a(0), Math.max(g6Var.a(2), g6Var.a(3)));
        }
        int i10 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.f3768b0;
        if (i10 > 0 && stargiftattributebackdropArr2[0] != null) {
            if (this.f3785p0 != null && this.f3766a0.a(2) >= 1.0f) {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            } else {
                Paint[] paintArr = this.m0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.f3784o0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, L);
                this.f3783n0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            }
            if (this.f3785p0 != null && this.f3766a0.a(2) > 0.0f) {
                Paint paint = this.f3788r0;
                paint.setAlpha((int) (this.f3766a0.a(2) * 255.0f));
                Matrix matrix = this.f3786q0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.f3785p0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        } else {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        }
        if (this.f3766a0.a(1) > 0.0f) {
            f10 = width;
            f11 = L;
            k(b(canvas, f10, f11, getWidth(), realHeight));
        } else {
            f10 = width;
            f11 = L;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
        int[] iArr4 = this.C0;
        int[] iArr5 = this.B0;
        int[] iArr6 = this.A0;
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
        v6 v6Var2 = this.f3769c;
        if (v6Var2.f4890s == null && v6Var2.f4891w == null && v6Var2.f4892x == null) {
            e7Var = this;
            f13 = f10;
            f12 = f11;
            iArr = iArr5;
            iArr2 = iArr6;
            i7 = 1;
            v6Var = v6Var2;
            iArr3 = iArr4;
            canvas2 = canvas;
        } else {
            float width2 = getWidth();
            float f18 = f10;
            p6 p6Var = v6Var2.f4890s;
            float f19 = f11;
            float f20 = v6Var2.f4893y;
            int[] iArr7 = this.B0;
            int[] iArr8 = this.A0;
            int[] iArr9 = this.C0;
            f12 = f19;
            iArr = iArr5;
            iArr2 = iArr6;
            f13 = f18;
            i7 = 1;
            iArr3 = iArr4;
            e7Var = this;
            canvas2 = canvas;
            v6Var2.a(canvas2, p6Var, f20, width2, realHeight, iArr7, iArr8, iArr9);
            v6Var2.a(canvas2, v6Var2.f4891w, v6Var2.D, width2, realHeight, iArr7, iArr8, iArr9);
            v6Var2.a(canvas2, v6Var2.f4892x, v6Var2.E, width2, realHeight, iArr7, iArr8, iArr9);
            v6Var = v6Var2;
            e7Var.invalidate();
        }
        if (i10 > 0 && stargiftattributebackdropArr[0] != null) {
            int i12 = iArr3[iArr3.length / 2];
            g6 g6Var2 = e7Var.f3766a0;
            if (g6Var2.b(0) && g6Var2.b(3)) {
                max2 = 1.0f;
            } else {
                max2 = Math.max(g6Var2.a(0), g6Var2.a(3));
            }
            int i13 = (max2 > f16 ? 1 : (max2 == f16 ? 0 : -1));
            org.telegram.ui.Components.g5[] g5VarArr = e7Var.f3791t0;
            if (i13 > 0) {
                canvas2.save();
                canvas2.translate(f13, f12);
                g5VarArr[0].k(Integer.valueOf(i12));
                i1.a(canvas, 0, g5VarArr[0], e7Var.getWidth(), realHeight, max2, 1.0f);
                realHeight = realHeight;
                canvas.restore();
            }
            if (e7Var.f3766a0.a(2) > f16) {
                canvas.save();
                g5VarArr[0].k(Integer.valueOf(i12));
                float f21 = realHeight;
                RectF rectF = org.telegram.messenger.g0.P;
                LinearLayout[] linearLayoutArr = e7Var.f3774f;
                float x10 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = e7Var.K;
                float x11 = frameLayout.getX() + x10;
                org.telegram.ui.Components.l9 l9Var = e7Var.L;
                rectF.set(l9Var.getX() + x11, l9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), l9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + l9Var.getWidth(), l9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + l9Var.getHeight());
                i1.c(canvas, g5VarArr[0], e7Var.getWidth(), f21 * 0.7f, 1.0f, rectF, e7Var.f3766a0.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            int i14 = 0;
            while (true) {
                x5[] x5VarArr = e7Var.I;
                if (i14 > x5VarArr.length) {
                    break;
                }
                if (i14 < x5VarArr.length) {
                    x5Var = x5VarArr[i14];
                } else {
                    x5Var = e7Var.J;
                }
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.k6.H1(x5Var.getBackground(), iArr10[Utilities.j(Math.round((((x5Var.getWidth() / f17) + x5Var.getX()) / e7Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    x5Var.invalidate();
                }
                i14++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i15 = iArr11[iArr11.length / 2];
            int i16 = iArr12[iArr12.length / 2];
            TextView textView = e7Var.f3794w;
            if (textView != null && e7Var.f3796x != i15) {
                e7Var.f3796x = i15;
                textView.setTextColor(i15);
                org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), i16, false);
            }
            if (v6Var.f4890s != null || v6Var.f4891w != null || v6Var.f4892x != null) {
                e7Var.D[0].setTextColor(i15);
            }
            if (e7Var.f3766a0.a(2) > f16) {
                if (e7Var.f3800z0 == null) {
                    e7Var.f3800z0 = new ud(i7, 12);
                }
                FrameLayout frameLayout2 = e7Var.f3767b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / f17) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / f17;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / f17) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / f17;
                float f22 = measuredHeight + scaleY;
                RectF rectF2 = e7Var.f3799y0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f22);
                e7Var.f3800z0.g(rectF2);
                e7Var.f3800z0.d();
                e7Var.f3800z0.a(canvas2, org.telegram.ui.ActionBar.k6.r1(e7Var.f3766a0.a(2), -1));
                e7Var.invalidate();
            }
        }
        if (e7Var.f3766a0.a(1) > f16) {
            e7Var.c(canvas2, f13, f12, e7Var.getWidth(), e7Var.getRealHeight());
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(int i7, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
        RadialGradient[] radialGradientArr = this.f3783n0;
        radialGradientArr[i7] = radialGradient;
        if (i7 == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.f3785p0 = radialGradient2;
            this.f3788r0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.f3784o0;
        if (matrixArr[i7] == null) {
            matrixArr[i7] = new Matrix();
        }
        this.m0[i7].setShader(radialGradientArr[i7]);
    }

    public final void f(TL_stars.StarGift starGift, boolean z9, boolean z10, boolean z11) {
        boolean z12;
        cg.b bVar;
        cg.a resellAmount;
        boolean z13;
        int i7;
        int i10;
        this.N = false;
        if (!z9 && !z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        boolean z14 = starGift instanceof TL_stars.TL_starGiftUnique;
        int i11 = 8;
        c61 c61Var = this.H;
        w70[] w70VarArr = this.D;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f3768b0;
        if (z14) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) ea.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) ea.l(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            w70VarArr[0].setTextSize(1, 13.0f);
            if (z12) {
                i11 = 0;
            }
            c61Var.setVisibility(i11);
            x5[] x5VarArr = this.I;
            x5VarArr[2].setVisibility(0);
            if (z12) {
                x5 x5Var = x5VarArr[1];
                if (z11) {
                    i7 = 2131231102;
                } else {
                    i7 = 2131231103;
                }
                if (z11) {
                    i10 = 2131750421;
                } else {
                    i10 = 2131750424;
                }
                x5Var.e(i7, org.telegram.messenger.hd.M0(i10, null), false);
            }
            float f10 = 1.0f;
            if (starGift.resell_amount != null) {
                this.N = true;
                boolean z15 = starGift.resale_ton_only;
                cg.b bVar2 = cg.b.f6163b;
                if (z15) {
                    bVar = bVar2;
                } else {
                    bVar = cg.b.f6162a;
                }
                if (starGift.getResellAmount(bVar).f6160a == bVar2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                CharSequence V = org.telegram.messenger.hd.V(null, null, 2131749680, dd.V0("⭐️ " + ((Object) dd.M0(resellAmount.o(), 1.0f, ',')), z13), Float.valueOf(0.9f));
                TextView textView = this.O;
                textView.setText(V);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                if (k7.K1(p10.f24459s0, org.telegram.messenger.m5.o(starGift.owner_id))) {
                    textView.setOnClickListener(new y6(this, 1));
                    c8.ka.a(textView);
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                }
            }
            if (z9) {
                x5VarArr[0].setAlpha(1.0f);
                x5VarArr[0].e(2131231120, org.telegram.messenger.hd.M0(2131750432, null), false);
            } else {
                x5VarArr[0].setAlpha(0.5f);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                spannableStringBuilder.setSpan(new wp(2131232242, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131750432, null));
                x5VarArr[0].e(2131231120, spannableStringBuilder, false);
            }
            x5 x5Var2 = x5VarArr[1];
            if (!z9 && !z10) {
                f10 = 0.5f;
            }
            x5Var2.setAlpha(f10);
            if (z9) {
                ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                View.OnClickListener onClickListener = this.V;
                if (arrayList != null) {
                    x5VarArr[2].e(2131231118, org.telegram.messenger.hd.M0(2131750431, null), false);
                    x5VarArr[2].setOnClickListener(onClickListener);
                } else {
                    x5VarArr[2].e(2131231119, org.telegram.messenger.hd.M0(2131750445, null), false);
                    x5VarArr[2].setOnClickListener(onClickListener);
                }
            } else {
                x5VarArr[2].e(2131231169, org.telegram.messenger.hd.M0(2131750437, null), false);
                x5VarArr[2].setOnClickListener(this.U);
            }
            this.f3775f0 = starGift.crafted;
            this.f3782n.f60079a.e(stargiftattributebackdropArr[0], false, true);
        } else {
            stargiftattributebackdropArr[0] = null;
            w70VarArr[0].setTextSize(1, 14.0f);
            this.f3775f0 = false;
            c61Var.setVisibility(8);
        }
        e(0, stargiftattributebackdropArr[0]);
        dd.d1(this.d[0].getImageReceiver(), starGift, 160);
        this.f3772e[0] = (TL_stars.starGiftAttributeModel) ea.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        d(this.f3766a0);
    }

    public final void g(int i7, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z9) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.f3790s0;
            if (stargiftattributepatternArr[i7] != stargiftattributepattern) {
                stargiftattributepatternArr[i7] = stargiftattributepattern;
                this.f3791t0[i7].i(stargiftattributepattern.document, z9);
            }
        }
    }

    public int getFinalHeight() {
        int L;
        int measuredHeight;
        boolean d = this.f3766a0.d(0);
        float f10 = 10.0f;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f3768b0;
        LinearLayout[] linearLayoutArr = this.f3774f;
        if (d) {
            if (stargiftattributebackdropArr[0] != null) {
                f10 = 24.0f;
            }
            return linearLayoutArr[0].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(f10);
        } else if (this.f3766a0.d(1)) {
            if (stargiftattributebackdropArr[1] != null) {
                f10 = 24.0f;
            }
            return linearLayoutArr[1].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(f10);
        } else {
            if (this.f3766a0.d(2)) {
                L = org.telegram.messenger.g0.L(64.0f);
                measuredHeight = linearLayoutArr[2].getMeasuredHeight();
            } else if (this.f3766a0.d(3)) {
                L = org.telegram.messenger.g0.L(160.0f);
                measuredHeight = linearLayoutArr[3].getMeasuredHeight();
            } else if (!this.f3766a0.d(4)) {
                return 0;
            } else {
                d6 d6Var = this.M;
                if (d6Var.getMeasuredHeight() > 0) {
                    return d6Var.getMeasuredHeight();
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
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f3768b0;
        float f12 = 10.0f;
        if (stargiftattributebackdropArr[0] != null) {
            f10 = 24.0f;
        } else {
            f10 = 10.0f;
        }
        int L2 = org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(f10);
        LinearLayout[] linearLayoutArr = this.f3774f;
        float a10 = (this.f3766a0.a(0) * (linearLayoutArr[0].getMeasuredHeight() + L2)) + 0.0f;
        if (stargiftattributebackdropArr[1] != null) {
            f11 = 24.0f;
        } else {
            f11 = 10.0f;
        }
        int L3 = org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(f11);
        float a11 = (this.f3766a0.a(2) * (linearLayoutArr[2].getMeasuredHeight() + org.telegram.messenger.g0.L(64.0f))) + (this.f3766a0.a(1) * (linearLayoutArr[1].getMeasuredHeight() + L3)) + a10;
        if (stargiftattributebackdropArr[0] != null) {
            f12 = 24.0f;
        }
        int L4 = org.telegram.messenger.g0.L(f12);
        float a12 = (this.f3766a0.a(3) * (linearLayoutArr[3].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + L4)) + a11;
        d6 d6Var = this.M;
        if (d6Var.getMeasuredHeight() > 0) {
            L = d6Var.getMeasuredHeight();
        } else {
            L = org.telegram.messenger.g0.L(550.0f);
        }
        return (this.f3766a0.a(4) * L) + a12;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        int i7 = (this.f3793v0 > 0.5f ? 1 : (this.f3793v0 == 0.5f ? 0 : -1));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f3768b0;
        if (i7 > 0) {
            return stargiftattributebackdropArr[2];
        }
        return stargiftattributebackdropArr[1];
    }

    public org.telegram.ui.Components.l9 getUpgradeImageView() {
        int i7 = (this.f3793v0 > 0.5f ? 1 : (this.f3793v0 == 0.5f ? 0 : -1));
        org.telegram.ui.Components.l9[] l9VarArr = this.d;
        if (i7 > 0) {
            return l9VarArr[2];
        }
        return l9VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        int i7 = (this.f3793v0 > 0.5f ? 1 : (this.f3793v0 == 0.5f ? 0 : -1));
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.f3772e;
        if (i7 > 0) {
            return stargiftattributemodelArr[2];
        }
        return stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.f3790s0[1];
    }

    public final void h(int i7, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence3, TLObject tLObject, Spannable spannable) {
        int i10;
        int i11;
        this.f3787r[i7].setText(charSequence);
        FrameLayout frameLayout = this.f3798y;
        w70[] w70VarArr = this.D;
        w70 w70Var = this.f3789s;
        TextView textView = this.f3794w;
        int i12 = 0;
        if (i7 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            w70Var.setVisibility(8);
            if (i7 == 0) {
                frameLayout.setVisibility(8);
            } else {
                w70VarArr[i7].setVisibility(8);
            }
        } else if (i7 == 0 && !TextUtils.isEmpty(charSequence3)) {
            w70Var.setText(charSequence3);
            w70Var.setVisibility(0);
            textView.setVisibility(8);
            if (i7 == 0) {
                frameLayout.setVisibility(8);
            } else {
                w70VarArr[i7].setVisibility(8);
            }
        } else {
            w70VarArr[i7].setText(charSequence2);
            if (i7 == 0) {
                if (TextUtils.isEmpty(charSequence2)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                frameLayout.setVisibility(i11);
            } else {
                w70 w70Var2 = w70VarArr[i7];
                if (TextUtils.isEmpty(charSequence2)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                w70Var2.setVisibility(i10);
            }
            w70Var.setVisibility(8);
            textView.setVisibility(8);
        }
        zh.k0[] k0VarArr = this.F;
        zh.k0 k0Var = k0VarArr[i7];
        if (k0Var != null) {
            if (TextUtils.isEmpty(spannable)) {
                i12 = 8;
            }
            k0Var.setVisibility(i12);
            k0VarArr[i7].setUser(tLObject);
            k0VarArr[i7].setMessage(spannable);
        }
    }

    public final void i(int i7, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i7, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z9) {
        int i7;
        c61 c61Var = this.H;
        c61Var.setVisibility(0);
        x5[] x5VarArr = this.I;
        x5VarArr[0].setAlpha(1.0f);
        x5VarArr[0].e(2131231120, org.telegram.messenger.hd.M0(2131750432, null), false);
        x5VarArr[0].setOnClickListener(onClickListener);
        if (onClickListener2 != null) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        x5 x5Var = this.J;
        x5Var.setVisibility(i7);
        x5Var.setOnClickListener(onClickListener2);
        x5VarArr[1].e(2131231103, org.telegram.messenger.hd.M0(2131750424, null), false);
        x5VarArr[1].setOnClickListener(onClickListener3);
        ((LinearLayout.LayoutParams) x5VarArr[1].getLayoutParams()).rightMargin = 0;
        setWalletDisplayed(z9);
        x5VarArr[2].setVisibility(8);
        c61Var.requestLayout();
    }

    public final void l() {
        w70[] w70VarArr;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        w70 w70Var;
        int i7;
        int i10;
        int i11;
        int i12;
        w70[] w70VarArr2 = this.f3787r;
        if (w70VarArr2 != null && (w70VarArr = this.D) != null && (stargiftattributebackdropArr = this.f3768b0) != null) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27956j5, this.f3765a);
            for (int i13 = 0; i13 < 2; i13++) {
                w70 w70Var2 = w70VarArr2[i13];
                if (w70Var2 != null && w70VarArr[i13] != null) {
                    if (stargiftattributebackdropArr[Math.min(1, i13)] == null) {
                        i7 = w02;
                    } else {
                        i7 = -1;
                    }
                    w70Var2.setTextColor(i7);
                    w70 w70Var3 = w70VarArr[i13];
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
                        i10 = i0.a.f(this.f3793v0, i11, i12);
                    } else {
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i13];
                        if (stargiftattributebackdrop3 == null) {
                            i10 = w02;
                        } else {
                            i10 = (-16777216) | stargiftattributebackdrop3.text_color;
                        }
                    }
                    w70Var3.setTextColor(i10);
                }
            }
            if (w70VarArr.length > 2 && (w70Var = w70VarArr[2]) != null) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[0];
                if (stargiftattributebackdrop4 != null) {
                    w02 = stargiftattributebackdrop4.text_color | (-16777216);
                }
                w70Var.setTextColor(w02);
            }
        }
    }

    public final void m() {
        this.f3779j0 = org.telegram.messenger.g0.N(33.33f) / org.telegram.messenger.g0.N(160.0f);
        FrameLayout frameLayout = this.f3767b;
        w70[] w70VarArr = this.f3787r;
        this.f3777h0 = ((((Math.min(w70VarArr[2].getPaint().measureText(w70VarArr[2].getText().toString()), w70VarArr[2].getWidth()) + w70VarArr[2].getWidth()) / 2.0f) + (w70VarArr[2].getX() + (-frameLayout.getLeft()))) + org.telegram.messenger.g0.L(24.0f)) - (org.telegram.messenger.g0.L(126.67f) / 2.0f);
        this.f3778i0 = (org.telegram.messenger.g0.L(124.0f) + (-frameLayout.getTop())) - (org.telegram.messenger.g0.L(126.67f) / 2.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.g5[] g5VarArr = this.f3791t0;
        g5VarArr[0].a();
        g5VarArr[1].a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.g5[] g5VarArr = this.f3791t0;
        g5VarArr[0].b();
        g5VarArr[1].b();
        org.telegram.messenger.g0.r(this.f3781l0);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.f3766a0.b(2)) {
            m();
            d(this.f3766a0);
        }
    }

    public void setPreviewAttributes(r1 r1Var) {
        g6 g6Var = this.f3766a0;
        if (g6Var != null && g6Var.f3944c == 1 && isAttachedToWindow()) {
            org.telegram.messenger.g0.r(this.f3781l0);
            ValueAnimator valueAnimator = this.f3780k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f3780k0 = null;
            }
            int i7 = 1 - this.f3792u0;
            this.f3792u0 = i7;
            org.telegram.ui.Components.l9[] l9VarArr = this.d;
            zg0 B = l9VarArr[2 - i7].getImageReceiver().B();
            zg0 B2 = l9VarArr[this.f3792u0 + 1].getImageReceiver().B();
            if (B2 != null && B != null) {
                B2.T(false, B.t());
            }
            int i10 = this.f3792u0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = r1Var.f4604a;
            this.f3768b0[i10] = stargiftattributebackdrop;
            e(i10, stargiftattributebackdrop);
            g(1, r1Var.f4605b, true);
            int i11 = this.f3792u0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = r1Var.f4606c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.f3772e;
            stargiftattributemodelArr[i11] = stargiftattributemodel;
            dd.c1(l9VarArr[i11].getImageReceiver(), stargiftattributemodelArr[this.f3792u0 + 1].document, 160);
            a();
            float f10 = this.f3792u0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f10, f10);
            this.f3780k0 = ofFloat;
            ofFloat.addUpdateListener(new a7(this, 0));
            this.f3780k0.addListener(new c7(this, 3));
            this.f3780k0.setDuration(320L);
            this.f3780k0.setInterpolator(xq.h);
            this.f3780k0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.f3770c0 = new a(ea.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.f3771d0 = new a(ea.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.f3773e0 = new a(ea.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.D[1].setTextSize(1, 14.0f);
        this.H.setVisibility(8);
        this.f3793v0 = 0.0f;
        this.f3792u0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.f3771d0.c(), true);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.f3772e;
        stargiftattributemodelArr[1] = (TL_stars.starGiftAttributeModel) this.f3770c0.c();
        org.telegram.ui.Components.l9[] l9VarArr = this.d;
        dd.c1(l9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, 160);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.f3773e0.c();
        this.f3768b0[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.f3770c0.f3416f;
        dd.c1(l9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, 160);
        a3.f fVar = this.f3781l0;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.i3(fVar, 2500L);
        invalidate();
    }

    public void setResellPrice(cg.a aVar) {
        boolean z9;
        boolean z10;
        boolean k10 = aVar.k();
        this.N = !k10;
        w70[] w70VarArr = this.D;
        TextView textView = this.O;
        boolean z11 = true;
        if (!k10) {
            if (aVar.f6160a == cg.b.f6163b) {
                z10 = true;
            } else {
                z10 = true;
                z11 = false;
            }
            int i7 = z10;
            Object[] objArr = new Object[i7];
            objArr[0] = dd.X0(z11, "⭐️ " + ((Object) dd.M0(aVar.o(), 1.0f, ',')), 0.9f, null, 0.0f, 1.0f);
            textView.setText(org.telegram.messenger.hd.V(null, null, 2131749680, objArr));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f3768b0[0];
            textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.f3776g0 = i7;
            ViewPropertyAnimator duration = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).setListener(new c7(this, 0)).start();
            w70VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(xqVar).start();
            z9 = i7;
        } else {
            z9 = true;
            ViewPropertyAnimator duration2 = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            xq xqVar2 = xq.h;
            duration2.setInterpolator(xqVar2).setListener(new c7(this, 2)).setListener(new c7(this, 1)).start();
            w70VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(xqVar2).start();
        }
        boolean z12 = this.N;
        x5[] x5VarArr = this.I;
        if (z12) {
            x5VarArr[2].e(2131231118, org.telegram.messenger.hd.M0(2131750431, null), z9);
        } else {
            x5VarArr[2].e(2131231119, org.telegram.messenger.hd.M0(2131750445, null), z9);
        }
        x5VarArr[2].setOnClickListener(this.V);
    }

    public void setShowOptions(boolean z9) {
        this.S = z9;
        d(this.f3766a0);
    }

    public void setWalletCard(boolean z9) {
        int i7;
        int i10;
        x5 x5Var = this.I[1];
        if (z9) {
            i7 = 2131231095;
        } else {
            i7 = 2131231092;
        }
        if (z9) {
            i10 = 2131743103;
        } else {
            i10 = 2131743111;
        }
        x5Var.e(i7, org.telegram.messenger.hd.M0(i10, null), false);
    }

    public void setWalletDisplayed(boolean z9) {
        float f10;
        x5 x5Var = this.I[1];
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        x5Var.setAlpha(f10);
    }

    public void setWearPreview(TLObject tLObject) {
        String lowerCase;
        String str;
        String str2;
        if (tLObject instanceof TLRPC.User) {
            str2 = t10.p((TLRPC.User) tLObject);
            str = org.telegram.messenger.hd.M0(2131747825, null);
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str3 = chat.title;
            if (org.telegram.messenger.t3.V(chat)) {
                int i7 = chat.participants_count;
                if (i7 > 1) {
                    lowerCase = org.telegram.messenger.hd.H(',', "Subscribers", i7);
                } else {
                    lowerCase = org.telegram.messenger.hd.M0(2131751391, null);
                }
            } else {
                int i10 = chat.participants_count;
                if (i10 > 1) {
                    lowerCase = org.telegram.messenger.hd.H(',', "Members", i10);
                } else {
                    lowerCase = org.telegram.messenger.hd.M0(2131754876, null).toLowerCase();
                }
            }
            str = lowerCase;
            str2 = str3;
        } else {
            return;
        }
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.l(tLObject);
        this.L.e(tLObject, w8Var);
        this.f3787r[2].setText(str2);
        this.D[2].setText(str);
        m();
        d(this.f3766a0);
    }

    public void k(int i7) {
    }
}
