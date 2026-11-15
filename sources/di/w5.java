package di;

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
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.z70;
import org.telegram.ui.z51;
public class w5 extends FrameLayout {
    public bc A0;
    public final int[] B0;
    public final int[] C0;
    public final int[] D0;
    public final z70[] E;
    public final LinearLayout.LayoutParams[] F;
    public final bi.h1[] G;
    public final TextPaint H;
    public final z51 I;
    public final ai.j0[] J;
    public final ai.j0 K;
    public final FrameLayout L;
    public final org.telegram.ui.Components.i9 M;
    public final y4 N;
    public boolean O;
    public final TextView P;
    public final ImageView Q;
    public final ImageView R;
    public final ImageView S;
    public boolean T;
    public Boolean U;
    public final View.OnClickListener V;
    public final View.OnClickListener W;
    public final org.telegram.ui.ActionBar.e6 f9657a;
    public final View.OnClickListener f9658a0;
    public final FrameLayout f9659b;
    public b5 f9660b0;
    public final o5 f9661c;
    public final TL_stars.starGiftAttributeBackdrop[] f9662c0;
    public final org.telegram.ui.Components.i9[] d;
    public com.google.android.gms.common.api.internal.p f9663d0;
    public final TL_stars.starGiftAttributeModel[] f9664e;
    public com.google.android.gms.common.api.internal.p f9665e0;
    public final LinearLayout[] f9666f;
    public com.google.android.gms.common.api.internal.p f9667f0;
    public boolean f9668g0;
    public final FrameLayout.LayoutParams[] h;
    public boolean f9669h0;
    public float f9670i0;
    public float f9671j0;
    public float f9672k0;
    public ValueAnimator f9673l0;
    public final ch.w m0;
    public final bi.j2 f9674n;
    public final Paint[] f9675n0;
    public final RadialGradient[] f9676o0;
    public final Matrix[] f9677p0;
    public RadialGradient f9678q0;
    public final z70[] f9679r;
    public final Matrix f9680r0;
    public final z70 f9681s;
    public final Paint f9682s0;
    public final TL_stars.starGiftAttributePattern[] f9683t0;
    public final org.telegram.ui.Components.e5[] f9684u0;
    public int f9685v0;
    public final TextView f9686w;
    public float f9687w0;
    public int f9688x;
    public float f9689x0;
    public final FrameLayout f9690y;
    public ValueAnimator f9691y0;
    public final RectF f9692z0;

    public w5(Context context, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable, View.OnClickListener onClickListener, k1 k1Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
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
        ai.j0[] j0VarArr;
        int i13;
        this.d = new org.telegram.ui.Components.i9[5];
        this.f9664e = new TL_stars.starGiftAttributeModel[3];
        this.f9666f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.f9679r = new z70[5];
        this.E = new z70[5];
        this.F = new LinearLayout.LayoutParams[5];
        this.G = new bi.h1[5];
        this.f9660b0 = new b5(0, 0);
        this.f9662c0 = new TL_stars.starGiftAttributeBackdrop[3];
        this.m0 = new ch.w(this, 19);
        this.f9675n0 = new Paint[3];
        this.f9676o0 = new RadialGradient[3];
        this.f9677p0 = new Matrix[3];
        this.f9680r0 = new Matrix();
        int i14 = 1;
        this.f9682s0 = new Paint(1);
        this.f9683t0 = new TL_stars.starGiftAttributePattern[2];
        this.f9684u0 = new org.telegram.ui.Components.e5[2];
        int i15 = 0;
        while (true) {
            Paint[] paintArr = this.f9675n0;
            if (i15 >= paintArr.length) {
                break;
            }
            paintArr[i15] = new Paint(1);
            i15++;
        }
        int i16 = 0;
        while (true) {
            org.telegram.ui.Components.e5[] e5VarArr = this.f9684u0;
            f10 = 28.0f;
            if (i16 >= e5VarArr.length) {
                break;
            }
            e5VarArr[i16] = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(28.0f), this);
            i16++;
        }
        this.f9689x0 = 1.0f;
        this.f9692z0 = new RectF();
        this.B0 = new int[12];
        this.C0 = new int[12];
        this.D0 = new int[12];
        this.f9657a = e6Var;
        this.V = onClickListener4;
        this.W = onClickListener5;
        this.f9658a0 = onClickListener6;
        setWillNotDraw(false);
        this.f9659b = new FrameLayout(context);
        int i17 = 0;
        while (true) {
            org.telegram.ui.Components.i9[] i9VarArr = this.d;
            f11 = f10;
            float f15 = 0.0f;
            if (i17 >= i9VarArr.length) {
                break;
            }
            i9VarArr[i17] = new t5(context, 0);
            this.d[i17].setLayerNum(6660);
            if (i17 > 0) {
                this.d[i17].getImageReceiver().f22300t1 = 1;
            }
            this.f9659b.addView(this.d[i17], c8.ja.e(-1, -1, 119));
            org.telegram.ui.Components.i9 i9Var = this.d[i17];
            if (i17 == 0) {
                f15 = 1.0f;
            }
            i9Var.setAlpha(f15);
            i17++;
            f10 = f11;
        }
        z70 z70Var = new z70(context, null);
        this.f9681s = z70Var;
        z70Var.setTextSize(1, 12.0f);
        z70Var.setGravity(17);
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.G6, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        z70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        TextView textView = new TextView(context);
        this.f9686w = textView;
        textView.setOnClickListener(new r5(this, 0));
        c8.na.b(textView, 0.05f, 1.25f);
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
        c8.na.a(textView2);
        z51 z51Var = new z51(3, context, this);
        this.I = z51Var;
        z51Var.setOrientation(0);
        this.J = new ai.j0[3];
        int i18 = 0;
        while (true) {
            ai.j0[] j0VarArr2 = this.J;
            if (i18 >= j0VarArr2.length) {
                break;
            }
            j0VarArr2[i18] = new ai.j0(context, 5);
            if (i18 != 0) {
                if (i18 != i14) {
                    if (i18 != 2) {
                        i12 = i14;
                    } else {
                        i12 = i14;
                        this.J[i18].e(2131231169, hd.M0(2131750438, null), false);
                        this.J[i18].setOnClickListener(onClickListener4);
                    }
                } else {
                    i12 = i14;
                    this.J[i18].e(2131231103, hd.M0(2131750425, null), false);
                    this.J[i18].setOnClickListener(onClickListener3);
                }
            } else {
                i12 = i14;
                this.J[i18].e(2131231120, hd.M0(2131750433, null), false);
                this.J[i18].setOnClickListener(onClickListener2);
            }
            this.J[i18].setBackground(org.telegram.ui.ActionBar.j6.b0(0, 285212671, 16, 16));
            c8.na.b(this.J[i18], 0.075f, 1.5f);
            z51 z51Var2 = this.I;
            ai.j0 j0Var = this.J[i18];
            if (i18 != j0VarArr.length - 1) {
                i13 = 11;
            } else {
                i13 = 0;
            }
            z51Var2.addView(j0Var, c8.ja.q(0, 56, 1.0f, 119, 0, 0, i13, 0));
            i18++;
            i14 = i12;
        }
        ai.j0 j0Var2 = new ai.j0(context, 5);
        this.K = j0Var2;
        j0Var2.e(2131231093, hd.M0(2131743109, null), false);
        j0Var2.setBackground(org.telegram.ui.ActionBar.j6.b0(0, 285212671, 16, 16));
        c8.na.b(j0Var2, 0.075f, 1.5f);
        j0Var2.setVisibility(8);
        this.I.addView(j0Var2, i14, c8.ja.q(0, 56, 1.0f, 119, 0, 0, 11, 0));
        this.f9690y = new FrameLayout(context);
        int i19 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f9666f;
            if (i19 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i19] = new LinearLayout(context);
            this.f9666f[i19].setOrientation(1);
            if (i19 == 2) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.L = frameLayout;
                this.f9666f[i19].addView(frameLayout, c8.ja.r(-1, 144, 119));
                org.telegram.ui.Components.i9 i9Var2 = new org.telegram.ui.Components.i9(context);
                this.M = i9Var2;
                i9Var2.setRoundRadius(org.telegram.messenger.g0.L(41.0f));
                frameLayout.addView(i9Var2, c8.ja.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.f9679r[i19] = new z70(context, null);
                this.f9679r[i19].setTextColor(-1);
                this.f9679r[i19].setTextSize(1, 20.0f);
                this.f9679r[i19].setTypeface(org.telegram.messenger.g0.o());
                this.f9679r[i19].setSingleLine();
                z70 z70Var2 = this.f9679r[i19];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                z70Var2.setEllipsize(truncateAt);
                this.f9679r[i19].setGravity(17);
                frameLayout.addView(this.f9679r[i19], c8.ja.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.E[i19] = new z70(context, null);
                this.E[i19].setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28957j5, e6Var));
                this.E[i19].setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.q6.G(this.E[i19], org.telegram.ui.ActionBar.j6.Xc, e6Var);
                this.E[i19].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                this.E[i19].setDisablePaddingsOffsetY(true);
                this.E[i19].setSingleLine();
                this.E[i19].setGravity(17);
                this.E[i19].setEllipsize(truncateAt);
                frameLayout.addView(this.E[i19], c8.ja.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i19 == 4) {
                y4 y4Var = new y4(context, e6Var);
                this.N = y4Var;
                this.f9666f[i19].addView(y4Var, c8.ja.o(-1, -2));
                View view = this.f9666f[i19];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = c8.ja.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i19] = d;
                addView(view, d);
                i19++;
            } else {
                this.f9679r[i19] = new z70(context, null);
                if (i19 == 3) {
                    this.f9679r[i19].setTextColor(-1);
                } else {
                    this.f9679r[i19].setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28957j5, e6Var));
                }
                this.f9679r[i19].setTextSize(1, 20.0f);
                this.f9679r[i19].setTypeface(org.telegram.messenger.g0.o());
                this.f9679r[i19].setGravity(17);
                LinearLayout linearLayout = this.f9666f[i19];
                z70 z70Var3 = this.f9679r[i19];
                if (i19 == 3) {
                    i7 = 10;
                } else {
                    i7 = 0;
                }
                linearLayout.addView(z70Var3, c8.ja.t(-1, -2, 17, 24, i7, 24, 0));
                if (i19 == 0) {
                    this.f9666f[i19].addView(this.f9681s, c8.ja.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f9666f[i19].addView(this.f9686w, c8.ja.n(19.33f, -2, 17, 0, 6, 0, 2));
                }
                if (i19 == 0) {
                    this.E[i19] = new z70(context, null);
                    if (i19 == 3) {
                        this.E[i19].setTextColor(org.telegram.ui.ActionBar.j6.r1(0.75f, -1));
                    } else {
                        this.E[i19].setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28957j5, e6Var));
                    }
                    this.E[i19].setTextSize(1, 14.0f);
                    this.E[i19].setGravity(17);
                    org.telegram.ui.ActionBar.q6.G(this.E[i19], org.telegram.ui.ActionBar.j6.Xc, e6Var);
                    this.E[i19].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.E[i19].setDisablePaddingsOffsetY(true);
                    this.f9690y.addView(this.E[i19], c8.ja.e(-2, -2, 17));
                    this.f9690y.addView(this.P, c8.ja.a(-2.0f, 20.33f, 17));
                    LinearLayout linearLayout2 = this.f9666f[i19];
                    FrameLayout frameLayout2 = this.f9690y;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.F;
                    if (i19 == 3) {
                        i11 = 6;
                    } else {
                        i11 = 0;
                    }
                    LinearLayout.LayoutParams t6 = c8.ja.t(-1, -2, 17, 24, 0, 24, i11);
                    layoutParamsArr2[i19] = t6;
                    linearLayout2.addView(frameLayout2, t6);
                } else {
                    this.E[i19] = new z70(context, null);
                    if (i19 == 3) {
                        this.E[i19].setTextColor(org.telegram.ui.ActionBar.j6.r1(0.75f, -1));
                    } else {
                        this.E[i19].setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28957j5, e6Var));
                    }
                    this.E[i19].setTextSize(1, 14.0f);
                    this.E[i19].setGravity(17);
                    org.telegram.ui.ActionBar.q6.G(this.E[i19], org.telegram.ui.ActionBar.j6.Xc, e6Var);
                    this.E[i19].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.E[i19].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout3 = this.f9666f[i19];
                    z70 z70Var4 = this.E[i19];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.F;
                    if (i19 == 3) {
                        i10 = 6;
                    } else {
                        i10 = 0;
                    }
                    LinearLayout.LayoutParams t10 = c8.ja.t(-1, -2, 17, 24, 0, 24, i10);
                    layoutParamsArr3[i19] = t10;
                    linearLayout3.addView(z70Var4, t10);
                }
                LinearLayout.LayoutParams layoutParams = this.F[i19];
                if (i19 == 3) {
                    f13 = 6.0f;
                } else {
                    if (i19 == 1) {
                        f12 = 7.33f;
                    } else if (this.f9662c0[0] == null) {
                        f12 = 9.0f;
                    } else {
                        f12 = 5.66f;
                    }
                    f13 = f12 - 4.0f;
                }
                layoutParams.topMargin = org.telegram.messenger.g0.L(f13);
                this.G[i19] = new bi.h1(context);
                this.G[i19].setVisibility(8);
                this.G[i19].setPadding(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(2.0f));
                if (i19 == 0) {
                    this.H = this.G[i19].getTextPaint();
                }
                this.f9666f[i19].addView(this.G[i19], c8.ja.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i19 == 0) {
                this.f9666f[i19].addView(this.I, c8.ja.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f9666f[i19];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            if (i19 == 2) {
                f14 = 32.0f;
            } else {
                f14 = 170.0f;
            }
            ViewGroup.LayoutParams d2 = c8.ja.d(-1, -2.0f, 119, 16.0f, f14, 16.0f, 0.0f);
            layoutParamsArr4[i19] = d2;
            addView(view2, d2);
            i19++;
        }
        addView(this.f9659b, c8.ja.d(160, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        o5 o5Var = new o5(context);
        this.f9661c = o5Var;
        addView(o5Var, c8.ja.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(f11), 620756991));
        imageView.setImageResource(2131232097);
        c8.na.a(imageView);
        addView(imageView, c8.ja.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView.setOnClickListener(new bi.d0(1, runnable));
        imageView.setVisibility(8);
        ImageView imageView2 = new ImageView(context);
        this.R = imageView2;
        imageView2.setImageResource(2131231111);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        c8.na.a(imageView2);
        if (k1Var != null) {
            addView(imageView2, c8.ja.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView2.setOnClickListener(k1Var);
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setContentDescription(hd.M0(2131754878, null));
        imageView3.setImageResource(2131231749);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
        c8.na.a(imageView3);
        addView(imageView3, c8.ja.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView3.setOnClickListener(onClickListener);
        imageView3.setVisibility(8);
        bi.j2 j2Var = new bi.j2(context);
        this.f9674n = j2Var;
        j2Var.b(hd.M0(2131749753, null), true);
        bi.l2 l2Var = j2Var.f3624a;
        if (l2Var.f3667w == null) {
            bc bcVar = new bc(2, 12);
            l2Var.f3667w = bcVar;
            bcVar.h = 5.0f;
        }
        Path path = l2Var.f3663f;
        float f16 = l2Var.f3666s;
        l2Var.f3668x = true;
        bi.l2.d(path, f16, true);
        j2Var.setScaleX(1.2f);
        j2Var.setScaleY(1.2f);
        addView(j2Var, c8.ja.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        j2Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f9691y0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f9691y0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f9691y0 = ofFloat;
        ofFloat.addUpdateListener(new s5(this, 1));
        this.f9691y0.addListener(new u5(this, 4));
        this.f9691y0.setDuration(320L);
        this.f9691y0.setInterpolator(er.f34421g);
        this.f9691y0.start();
    }

    public final int b(float f10, float f11, float f12, float f13, Canvas canvas) {
        int i7 = this.f9685v0;
        RadialGradient[] radialGradientArr = this.f9676o0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f9662c0;
        Matrix[] matrixArr = this.f9677p0;
        Paint[] paintArr = this.f9675n0;
        int i10 = 0;
        if (i7 == 0) {
            if (this.f9687w0 > 0.0f && stargiftattributebackdropArr[2] != null) {
                paintArr[2].setAlpha((int) (this.f9660b0.a(1) * 255.0f));
                matrixArr[2].reset();
                matrixArr[2].postTranslate(f10, f11);
                radialGradientArr[2].setLocalMatrix(matrixArr[2]);
                canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[2]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[2];
                i10 = i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
            }
            if (this.f9687w0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) ((1.0f - this.f9687w0) * this.f9660b0.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f10, f11);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                return i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[1].getAlpha()), i10);
            }
            return i10;
        }
        if (this.f9687w0 < 1.0f && stargiftattributebackdropArr[1] != null) {
            paintArr[1].setAlpha((int) (this.f9660b0.a(1) * 255.0f));
            matrixArr[1].reset();
            matrixArr[1].postTranslate(f10, f11);
            radialGradientArr[1].setLocalMatrix(matrixArr[1]);
            canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[1]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[1];
            i10 = i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
        }
        if (this.f9687w0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.f9660b0.a(1) * 255.0f * this.f9687w0));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f10, f11);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[2];
            return i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[2].getAlpha()), i10);
        }
        return i10;
    }

    public final void c(float f10, float f11, float f12, float f13, Canvas canvas) {
        int i7;
        canvas.save();
        canvas.translate(f10, f11);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f9662c0;
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
        int f14 = i0.a.f(this.f9687w0, i7, i10);
        org.telegram.ui.Components.e5[] e5VarArr = this.f9684u0;
        e5VarArr[1].k(Integer.valueOf(f14));
        w0.a(canvas, 0, e5VarArr[1], f12, f13, this.f9660b0.a(1), this.f9689x0);
        canvas.restore();
    }

    public void d(b5 b5Var) {
        View[] viewArr;
        float f10;
        float f11;
        int i7;
        boolean z10;
        int i10;
        boolean z11;
        z70[] z70VarArr;
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
        this.f9660b0 = b5Var;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            viewArr = this.f9666f;
            if (i19 >= viewArr.length) {
                break;
            }
            float a11 = b5Var.a(i19);
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
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f9662c0;
        if (stargiftattributebackdropArr[0] != null) {
            f10 = b5Var.a(2);
        } else {
            f10 = 0.0f;
        }
        if (stargiftattributebackdropArr[1] != null) {
            f11 = b5Var.a(1);
        } else {
            f11 = 0.0f;
        }
        float max2 = Math.max(f10, f11);
        ImageView imageView = this.Q;
        imageView.setAlpha(max2);
        if ((stargiftattributebackdropArr[0] != null && b5Var.f8251c == 2) || (stargiftattributebackdropArr[1] != null && b5Var.f8251c == 1)) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        imageView.setVisibility(i7);
        if (stargiftattributebackdropArr[0] == null && !this.T) {
            z10 = false;
        } else {
            z10 = true;
        }
        float a12 = b5Var.a(0);
        int i20 = b5Var.f8251c;
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f9657a;
        if (bool == null || bool.booleanValue() != z11) {
            this.U = Boolean.valueOf(z11);
            if (z11) {
                imageView2.clearColorFilter();
                imageView2.setBackground(org.telegram.ui.ActionBar.j6.h0(553648127, 1, -1));
            } else {
                org.telegram.ui.ActionBar.q6.s(imageView2, org.telegram.ui.ActionBar.j6.J5, e6Var, PorterDuff.Mode.SRC_IN);
                int i22 = org.telegram.ui.ActionBar.j6.f28941i6;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i22, e6Var), 1, -1);
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i22);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.q6.j(imageView2, h02, null, M, e6Var);
            }
        }
        if (!this.f9669h0) {
            float V12 = org.telegram.messenger.g0.V1(false, this.O, b5Var.a(0));
            TextView textView = this.P;
            textView.setAlpha(V12);
            if (this.O) {
                f14 = 1.0f;
            } else {
                f14 = 0.4f;
            }
            textView.setScaleX(org.telegram.messenger.g0.T1(0.4f, f14, b5Var.a(0)));
            if (this.O) {
                f15 = 1.0f;
            } else {
                f15 = 0.4f;
            }
            textView.setScaleY(org.telegram.messenger.g0.T1(0.4f, f15, b5Var.a(0)));
            if (this.O && i20 == 0) {
                i16 = 0;
            } else {
                i16 = 4;
            }
            textView.setVisibility(i16);
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
        int i23 = 0;
        while (true) {
            z70VarArr = this.E;
            if (i23 >= 2) {
                break;
            }
            z70 z70Var = this.f9679r[i23];
            if (stargiftattributebackdropArr[Math.min(1, i23)] == null) {
                i12 = w02;
            } else {
                i12 = i21;
            }
            z70Var.setTextColor(i12);
            z70 z70Var2 = z70VarArr[i23];
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
                i13 = i0.a.f(this.f9687w0, i14, i15);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i23];
                if (stargiftattributebackdrop3 == null) {
                    i13 = w02;
                } else {
                    i13 = stargiftattributebackdrop3.text_color | (-16777216);
                }
            }
            z70Var2.setTextColor(i13);
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
                    this.f9690y.setLayoutParams(layoutParamsArr2[i23]);
                } else {
                    z70VarArr[i23].setLayoutParams(layoutParamsArr2[i23]);
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
        this.f9686w.setBackground(org.telegram.ui.ActionBar.j6.d0(L, f12));
        z70 z70Var3 = z70VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            w02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        z70Var3.setTextColor(w02);
        org.telegram.ui.Components.i9[] i9VarArr = this.d;
        org.telegram.ui.Components.i9 i9Var = i9VarArr[0];
        b5 b5Var2 = this.f9660b0;
        if (b5Var2.b(0) && b5Var2.b(2)) {
            max = 1.0f;
        } else {
            max = Math.max(b5Var2.a(0), b5Var2.a(2));
        }
        i9Var.setAlpha(Math.max(max, this.f9660b0.a(3)));
        i9VarArr[1].setAlpha((1.0f - this.f9687w0) * b5Var.a(1));
        i9VarArr[2].setAlpha(b5Var.a(1) * this.f9687w0);
        float T1 = org.telegram.messenger.g0.T1(1.0f, this.f9672k0, b5Var.a(2));
        FrameLayout frameLayout = this.f9659b;
        frameLayout.setScaleX(T1);
        frameLayout.setScaleY(org.telegram.messenger.g0.T1(1.0f, this.f9672k0, b5Var.a(2)));
        frameLayout.setTranslationX(b5Var.a(2) * this.f9670i0);
        frameLayout.setTranslationY((b5Var.a(2) * this.f9671j0) + (b5Var.a(1) * org.telegram.messenger.g0.L(16.0f)));
        View view2 = viewArr[2];
        int i24 = b5Var.f8250b;
        if (i24 == 2 && i20 == 2) {
            a10 = 0.0f;
        } else {
            if (i24 != 2) {
                i20 = i24;
            }
            a10 = (1.0f - b5Var.a(2)) * (-(viewArr[i20].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view2.setTranslationY(a10);
        if (this.f9668g0 && this.f9660b0.b(0)) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        bi.j2 j2Var = this.f9674n;
        j2Var.setVisibility(i11);
        j2Var.setAlpha(this.f9660b0.a(0));
        if (b5Var.a(4) <= 0.0f) {
            i18 = 8;
        }
        y4 y4Var = this.N;
        y4Var.setVisibility(i18);
        y4Var.setAlpha(b5Var.a(4));
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
        w5 w5Var;
        int i7;
        int[] iArr3;
        float f13;
        Canvas canvas2;
        o5 o5Var;
        float max2;
        ai.j0 j0Var;
        float realHeight = getRealHeight();
        canvas.save();
        float f14 = 0.0f;
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float f15 = 2.0f;
        float width = getWidth() / 2.0f;
        float L = org.telegram.messenger.g0.L(80.0f) + org.telegram.messenger.g0.W1(this.f9660b0.a(1), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f));
        b5 b5Var = this.f9660b0;
        if ((b5Var.b(0) && b5Var.b(2)) || ((b5Var.b(2) && b5Var.b(3)) || (b5Var.b(3) && b5Var.b(0)))) {
            max = 1.0f;
        } else {
            max = Math.max(b5Var.a(0), Math.max(b5Var.a(2), b5Var.a(3)));
        }
        int i10 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.f9662c0;
        if (i10 > 0 && stargiftattributebackdropArr2[0] != null) {
            if (this.f9678q0 != null && this.f9660b0.a(2) >= 1.0f) {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            } else {
                Paint[] paintArr = this.f9675n0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.f9677p0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, L);
                this.f9676o0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            }
            if (this.f9678q0 != null && this.f9660b0.a(2) > 0.0f) {
                Paint paint = this.f9682s0;
                paint.setAlpha((int) (this.f9660b0.a(2) * 255.0f));
                Matrix matrix = this.f9680r0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.f9678q0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        } else {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        }
        if (this.f9660b0.a(1) > 0.0f) {
            f10 = width;
            f11 = L;
            int b10 = b(f10, f11, getWidth(), realHeight, canvas);
            realHeight = realHeight;
            k(b10);
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
        o5 o5Var2 = this.f9661c;
        if (o5Var2.f9161s == null && o5Var2.f9162w == null && o5Var2.f9163x == null) {
            w5Var = this;
            f13 = f10;
            f12 = f11;
            iArr = iArr5;
            iArr2 = iArr6;
            i7 = 1;
            canvas2 = canvas;
            o5Var = o5Var2;
            iArr3 = iArr4;
        } else {
            float width2 = getWidth();
            float f18 = f11;
            i5 i5Var = o5Var2.f9161s;
            float f19 = o5Var2.f9164y;
            int[] iArr7 = this.C0;
            int[] iArr8 = this.B0;
            int[] iArr9 = this.D0;
            f12 = f18;
            iArr = iArr5;
            iArr2 = iArr6;
            w5Var = this;
            i7 = 1;
            iArr3 = iArr4;
            f13 = f10;
            canvas2 = canvas;
            o5Var2.a(canvas2, i5Var, f19, width2, realHeight, iArr7, iArr8, iArr9);
            o5Var2.a(canvas2, o5Var2.f9162w, o5Var2.E, width2, realHeight, iArr7, iArr8, iArr9);
            o5Var2.a(canvas2, o5Var2.f9163x, o5Var2.F, width2, realHeight, iArr7, iArr8, iArr9);
            o5Var = o5Var2;
            w5Var.invalidate();
        }
        if (i10 > 0 && stargiftattributebackdropArr[0] != null) {
            int i12 = iArr3[iArr3.length / 2];
            b5 b5Var2 = w5Var.f9660b0;
            if (b5Var2.b(0) && b5Var2.b(3)) {
                max2 = 1.0f;
            } else {
                max2 = Math.max(b5Var2.a(0), b5Var2.a(3));
            }
            int i13 = (max2 > f16 ? 1 : (max2 == f16 ? 0 : -1));
            org.telegram.ui.Components.e5[] e5VarArr = w5Var.f9684u0;
            if (i13 > 0) {
                canvas2.save();
                canvas2.translate(f13, f12);
                e5VarArr[0].k(Integer.valueOf(i12));
                float f20 = realHeight;
                w0.a(canvas, 0, e5VarArr[0], w5Var.getWidth(), f20, max2, 1.0f);
                realHeight = f20;
                canvas.restore();
            }
            if (w5Var.f9660b0.a(2) > f16) {
                canvas.save();
                e5VarArr[0].k(Integer.valueOf(i12));
                float f21 = realHeight;
                RectF rectF = org.telegram.messenger.g0.P;
                LinearLayout[] linearLayoutArr = w5Var.f9666f;
                float x10 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = w5Var.L;
                float x11 = frameLayout.getX() + x10;
                org.telegram.ui.Components.i9 i9Var = w5Var.M;
                rectF.set(i9Var.getX() + x11, i9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), i9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + i9Var.getWidth(), i9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + i9Var.getHeight());
                w0.c(canvas, e5VarArr[0], w5Var.getWidth(), f21 * 0.7f, 1.0f, rectF, w5Var.f9660b0.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            int i14 = 0;
            while (true) {
                ai.j0[] j0VarArr = w5Var.J;
                if (i14 > j0VarArr.length) {
                    break;
                }
                if (i14 < j0VarArr.length) {
                    j0Var = j0VarArr[i14];
                } else {
                    j0Var = w5Var.K;
                }
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.j6.H1(j0Var.getBackground(), iArr10[Utilities.j(Math.round((((j0Var.getWidth() / f17) + j0Var.getX()) / w5Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    j0Var.invalidate();
                }
                i14++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i15 = iArr11[iArr11.length / 2];
            int i16 = iArr12[iArr12.length / 2];
            TextView textView = w5Var.f9686w;
            if (textView != null && w5Var.f9688x != i15) {
                w5Var.f9688x = i15;
                textView.setTextColor(i15);
                org.telegram.ui.ActionBar.j6.H1(textView.getBackground(), i16, false);
            }
            if (o5Var.f9161s != null || o5Var.f9162w != null || o5Var.f9163x != null) {
                w5Var.E[0].setTextColor(i15);
            }
            if (w5Var.f9660b0.a(2) > f16) {
                if (w5Var.A0 == null) {
                    w5Var.A0 = new bc(i7, 12);
                }
                FrameLayout frameLayout2 = w5Var.f9659b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / f17) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / f17;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / f17) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / f17;
                float f22 = measuredHeight + scaleY;
                RectF rectF2 = w5Var.f9692z0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f22);
                w5Var.A0.g(rectF2);
                w5Var.A0.d();
                w5Var.A0.a(canvas2, org.telegram.ui.ActionBar.j6.r1(w5Var.f9660b0.a(2), -1));
                w5Var.invalidate();
            }
        }
        if (w5Var.f9660b0.a(1) > f16) {
            w5Var.c(f13, f12, w5Var.getWidth(), w5Var.getRealHeight(), canvas2);
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
        RadialGradient[] radialGradientArr = this.f9676o0;
        radialGradientArr[i7] = radialGradient;
        if (i7 == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.f9678q0 = radialGradient2;
            this.f9682s0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.f9677p0;
        if (matrixArr[i7] == null) {
            matrixArr[i7] = new Matrix();
        }
        this.f9675n0[i7].setShader(radialGradientArr[i7]);
    }

    public final void f(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        cg.b bVar;
        cg.a resellAmount;
        boolean z14;
        int i7;
        int i10;
        this.O = false;
        if (!z10 && !z11) {
            z13 = false;
        } else {
            z13 = true;
        }
        boolean z15 = starGift instanceof TL_stars.TL_starGiftUnique;
        int i11 = 8;
        z51 z51Var = this.I;
        z70[] z70VarArr = this.E;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f9662c0;
        if (z15) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) v8.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) v8.l(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            z70VarArr[0].setTextSize(1, 13.0f);
            if (z13) {
                i11 = 0;
            }
            z51Var.setVisibility(i11);
            ai.j0[] j0VarArr = this.J;
            j0VarArr[2].setVisibility(0);
            if (z13) {
                ai.j0 j0Var = j0VarArr[1];
                if (z12) {
                    i7 = 2131231102;
                } else {
                    i7 = 2131231103;
                }
                if (z12) {
                    i10 = 2131750422;
                } else {
                    i10 = 2131750425;
                }
                j0Var.e(i7, hd.M0(i10, null), false);
            }
            float f10 = 1.0f;
            if (starGift.resell_amount != null) {
                this.O = true;
                boolean z16 = starGift.resale_ton_only;
                cg.b bVar2 = cg.b.f4988b;
                if (z16) {
                    bVar = bVar2;
                } else {
                    bVar = cg.b.f4987a;
                }
                if (starGift.getResellAmount(bVar).f4985a == bVar2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                CharSequence V = hd.V(null, null, 2131749681, mb.V0("⭐️ " + ((Object) mb.M0(resellAmount.o(), 1.0f, ',')), z14), Float.valueOf(0.9f));
                TextView textView = this.P;
                textView.setText(V);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(12.0f), i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                if (c6.K1(m10.f24934t0, org.telegram.messenger.m5.o(starGift.owner_id))) {
                    textView.setOnClickListener(new r5(this, 1));
                    c8.na.a(textView);
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                }
            }
            if (z10) {
                j0VarArr[0].setAlpha(1.0f);
                j0VarArr[0].e(2131231120, hd.M0(2131750433, null), false);
            } else {
                j0VarArr[0].setAlpha(0.5f);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                spannableStringBuilder.setSpan(new eq(2131232243, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) hd.M0(2131750433, null));
                j0VarArr[0].e(2131231120, spannableStringBuilder, false);
            }
            ai.j0 j0Var2 = j0VarArr[1];
            if (!z10 && !z11) {
                f10 = 0.5f;
            }
            j0Var2.setAlpha(f10);
            if (z10) {
                ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                View.OnClickListener onClickListener = this.W;
                if (arrayList != null) {
                    j0VarArr[2].e(2131231118, hd.M0(2131750432, null), false);
                    j0VarArr[2].setOnClickListener(onClickListener);
                } else {
                    j0VarArr[2].e(2131231119, hd.M0(2131750446, null), false);
                    j0VarArr[2].setOnClickListener(onClickListener);
                }
            } else {
                j0VarArr[2].e(2131231169, hd.M0(2131750438, null), false);
                j0VarArr[2].setOnClickListener(this.V);
            }
            this.f9668g0 = starGift.crafted;
            this.f9674n.f3624a.e(stargiftattributebackdropArr[0], false, true);
        } else {
            stargiftattributebackdropArr[0] = null;
            z70VarArr[0].setTextSize(1, 14.0f);
            this.f9668g0 = false;
            z51Var.setVisibility(8);
        }
        e(0, stargiftattributebackdropArr[0]);
        mb.d1(this.d[0].getImageReceiver(), starGift, 160);
        this.f9664e[0] = (TL_stars.starGiftAttributeModel) v8.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        d(this.f9660b0);
    }

    public final void g(int i7, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z10) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.f9683t0;
            if (stargiftattributepatternArr[i7] != stargiftattributepattern) {
                stargiftattributepatternArr[i7] = stargiftattributepattern;
                this.f9684u0[i7].i(stargiftattributepattern.document, z10);
            }
        }
    }

    public int getFinalHeight() {
        int L;
        int measuredHeight;
        boolean d = this.f9660b0.d(0);
        float f10 = 10.0f;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f9662c0;
        LinearLayout[] linearLayoutArr = this.f9666f;
        if (d) {
            if (stargiftattributebackdropArr[0] != null) {
                f10 = 24.0f;
            }
            return linearLayoutArr[0].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(f10);
        } else if (this.f9660b0.d(1)) {
            if (stargiftattributebackdropArr[1] != null) {
                f10 = 24.0f;
            }
            return linearLayoutArr[1].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(f10);
        } else {
            if (this.f9660b0.d(2)) {
                L = org.telegram.messenger.g0.L(64.0f);
                measuredHeight = linearLayoutArr[2].getMeasuredHeight();
            } else if (this.f9660b0.d(3)) {
                L = org.telegram.messenger.g0.L(160.0f);
                measuredHeight = linearLayoutArr[3].getMeasuredHeight();
            } else if (!this.f9660b0.d(4)) {
                return 0;
            } else {
                y4 y4Var = this.N;
                if (y4Var.getMeasuredHeight() > 0) {
                    return y4Var.getMeasuredHeight();
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
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f9662c0;
        float f12 = 10.0f;
        if (stargiftattributebackdropArr[0] != null) {
            f10 = 24.0f;
        } else {
            f10 = 10.0f;
        }
        int L2 = org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(f10);
        LinearLayout[] linearLayoutArr = this.f9666f;
        float a10 = (this.f9660b0.a(0) * (linearLayoutArr[0].getMeasuredHeight() + L2)) + 0.0f;
        if (stargiftattributebackdropArr[1] != null) {
            f11 = 24.0f;
        } else {
            f11 = 10.0f;
        }
        int L3 = org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(f11);
        float a11 = (this.f9660b0.a(2) * (linearLayoutArr[2].getMeasuredHeight() + org.telegram.messenger.g0.L(64.0f))) + (this.f9660b0.a(1) * (linearLayoutArr[1].getMeasuredHeight() + L3)) + a10;
        if (stargiftattributebackdropArr[0] != null) {
            f12 = 24.0f;
        }
        int L4 = org.telegram.messenger.g0.L(f12);
        float a12 = (this.f9660b0.a(3) * (linearLayoutArr[3].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + L4)) + a11;
        y4 y4Var = this.N;
        if (y4Var.getMeasuredHeight() > 0) {
            L = y4Var.getMeasuredHeight();
        } else {
            L = org.telegram.messenger.g0.L(550.0f);
        }
        return (this.f9660b0.a(4) * L) + a12;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        int i7 = (this.f9687w0 > 0.5f ? 1 : (this.f9687w0 == 0.5f ? 0 : -1));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f9662c0;
        if (i7 > 0) {
            return stargiftattributebackdropArr[2];
        }
        return stargiftattributebackdropArr[1];
    }

    public org.telegram.ui.Components.i9 getUpgradeImageView() {
        int i7 = (this.f9687w0 > 0.5f ? 1 : (this.f9687w0 == 0.5f ? 0 : -1));
        org.telegram.ui.Components.i9[] i9VarArr = this.d;
        if (i7 > 0) {
            return i9VarArr[2];
        }
        return i9VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        int i7 = (this.f9687w0 > 0.5f ? 1 : (this.f9687w0 == 0.5f ? 0 : -1));
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.f9664e;
        if (i7 > 0) {
            return stargiftattributemodelArr[2];
        }
        return stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.f9683t0[1];
    }

    public final void h(int i7, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence3, TLObject tLObject, Spannable spannable) {
        int i10;
        int i11;
        this.f9679r[i7].setText(charSequence);
        FrameLayout frameLayout = this.f9690y;
        z70[] z70VarArr = this.E;
        z70 z70Var = this.f9681s;
        TextView textView = this.f9686w;
        int i12 = 0;
        if (i7 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            z70Var.setVisibility(8);
            if (i7 == 0) {
                frameLayout.setVisibility(8);
            } else {
                z70VarArr[i7].setVisibility(8);
            }
        } else if (i7 == 0 && !TextUtils.isEmpty(charSequence3)) {
            z70Var.setText(charSequence3);
            z70Var.setVisibility(0);
            textView.setVisibility(8);
            if (i7 == 0) {
                frameLayout.setVisibility(8);
            } else {
                z70VarArr[i7].setVisibility(8);
            }
        } else {
            z70VarArr[i7].setText(charSequence2);
            if (i7 == 0) {
                if (TextUtils.isEmpty(charSequence2)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                frameLayout.setVisibility(i11);
            } else {
                z70 z70Var2 = z70VarArr[i7];
                if (TextUtils.isEmpty(charSequence2)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                z70Var2.setVisibility(i10);
            }
            z70Var.setVisibility(8);
            textView.setVisibility(8);
        }
        bi.h1[] h1VarArr = this.G;
        bi.h1 h1Var = h1VarArr[i7];
        if (h1Var != null) {
            if (TextUtils.isEmpty(spannable)) {
                i12 = 8;
            }
            h1Var.setVisibility(i12);
            h1VarArr[i7].setUser(tLObject);
            h1VarArr[i7].setMessage(spannable);
        }
    }

    public final void i(int i7, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i7, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z10) {
        int i7;
        z51 z51Var = this.I;
        z51Var.setVisibility(0);
        ai.j0[] j0VarArr = this.J;
        j0VarArr[0].setAlpha(1.0f);
        j0VarArr[0].e(2131231120, hd.M0(2131750433, null), false);
        j0VarArr[0].setOnClickListener(onClickListener);
        if (onClickListener2 != null) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        ai.j0 j0Var = this.K;
        j0Var.setVisibility(i7);
        j0Var.setOnClickListener(onClickListener2);
        j0VarArr[1].e(2131231103, hd.M0(2131750425, null), false);
        j0VarArr[1].setOnClickListener(onClickListener3);
        ((LinearLayout.LayoutParams) j0VarArr[1].getLayoutParams()).rightMargin = 0;
        setWalletDisplayed(z10);
        j0VarArr[2].setVisibility(8);
        z51Var.requestLayout();
    }

    public final void l() {
        z70[] z70VarArr;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        z70 z70Var;
        int i7;
        int i10;
        int i11;
        int i12;
        z70[] z70VarArr2 = this.f9679r;
        if (z70VarArr2 != null && (z70VarArr = this.E) != null && (stargiftattributebackdropArr = this.f9662c0) != null) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28957j5, this.f9657a);
            for (int i13 = 0; i13 < 2; i13++) {
                z70 z70Var2 = z70VarArr2[i13];
                if (z70Var2 != null && z70VarArr[i13] != null) {
                    if (stargiftattributebackdropArr[Math.min(1, i13)] == null) {
                        i7 = w02;
                    } else {
                        i7 = -1;
                    }
                    z70Var2.setTextColor(i7);
                    z70 z70Var3 = z70VarArr[i13];
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
                        i10 = i0.a.f(this.f9687w0, i11, i12);
                    } else {
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i13];
                        if (stargiftattributebackdrop3 == null) {
                            i10 = w02;
                        } else {
                            i10 = (-16777216) | stargiftattributebackdrop3.text_color;
                        }
                    }
                    z70Var3.setTextColor(i10);
                }
            }
            if (z70VarArr.length > 2 && (z70Var = z70VarArr[2]) != null) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[0];
                if (stargiftattributebackdrop4 != null) {
                    w02 = stargiftattributebackdrop4.text_color | (-16777216);
                }
                z70Var.setTextColor(w02);
            }
        }
    }

    public final void m() {
        this.f9672k0 = org.telegram.messenger.g0.N(33.33f) / org.telegram.messenger.g0.N(160.0f);
        FrameLayout frameLayout = this.f9659b;
        z70[] z70VarArr = this.f9679r;
        this.f9670i0 = ((((Math.min(z70VarArr[2].getPaint().measureText(z70VarArr[2].getText().toString()), z70VarArr[2].getWidth()) + z70VarArr[2].getWidth()) / 2.0f) + (z70VarArr[2].getX() + (-frameLayout.getLeft()))) + org.telegram.messenger.g0.L(24.0f)) - (org.telegram.messenger.g0.L(126.67f) / 2.0f);
        this.f9671j0 = (org.telegram.messenger.g0.L(124.0f) + (-frameLayout.getTop())) - (org.telegram.messenger.g0.L(126.67f) / 2.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.e5[] e5VarArr = this.f9684u0;
        e5VarArr[0].a();
        e5VarArr[1].a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.e5[] e5VarArr = this.f9684u0;
        e5VarArr[0].b();
        e5VarArr[1].b();
        org.telegram.messenger.g0.r(this.m0);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f9660b0.b(2)) {
            m();
            d(this.f9660b0);
        }
    }

    public void setPreviewAttributes(d1 d1Var) {
        b5 b5Var = this.f9660b0;
        if (b5Var != null && b5Var.f8251c == 1 && isAttachedToWindow()) {
            org.telegram.messenger.g0.r(this.m0);
            ValueAnimator valueAnimator = this.f9673l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f9673l0 = null;
            }
            int i7 = 1 - this.f9685v0;
            this.f9685v0 = i7;
            org.telegram.ui.Components.i9[] i9VarArr = this.d;
            ch0 B = i9VarArr[2 - i7].getImageReceiver().B();
            ch0 B2 = i9VarArr[this.f9685v0 + 1].getImageReceiver().B();
            if (B2 != null && B != null) {
                B2.T(false, B.t());
            }
            int i10 = this.f9685v0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = d1Var.f8392a;
            this.f9662c0[i10] = stargiftattributebackdrop;
            e(i10, stargiftattributebackdrop);
            g(1, d1Var.f8393b, true);
            int i11 = this.f9685v0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = d1Var.f8394c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.f9664e;
            stargiftattributemodelArr[i11] = stargiftattributemodel;
            mb.c1(i9VarArr[i11].getImageReceiver(), stargiftattributemodelArr[this.f9685v0 + 1].document, 160);
            a();
            float f10 = this.f9685v0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f10, f10);
            this.f9673l0 = ofFloat;
            ofFloat.addUpdateListener(new s5(this, 0));
            this.f9673l0.addListener(new u5(this, 3));
            this.f9673l0.setDuration(320L);
            this.f9673l0.setInterpolator(er.h);
            this.f9673l0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.f9663d0 = new com.google.android.gms.common.api.internal.p(v8.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.f9665e0 = new com.google.android.gms.common.api.internal.p(v8.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.f9667f0 = new com.google.android.gms.common.api.internal.p(v8.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.E[1].setTextSize(1, 14.0f);
        this.I.setVisibility(8);
        this.f9687w0 = 0.0f;
        this.f9685v0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.f9665e0.c(), true);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.f9664e;
        stargiftattributemodelArr[1] = (TL_stars.starGiftAttributeModel) this.f9663d0.c();
        org.telegram.ui.Components.i9[] i9VarArr = this.d;
        mb.c1(i9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, 160);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.f9667f0.c();
        this.f9662c0[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.f9663d0.f6062f;
        mb.c1(i9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, 160);
        ch.w wVar = this.m0;
        org.telegram.messenger.g0.r(wVar);
        org.telegram.messenger.g0.i3(wVar, 2500L);
        invalidate();
    }

    public void setResellPrice(cg.a aVar) {
        boolean z10;
        boolean z11;
        boolean k10 = aVar.k();
        this.O = !k10;
        z70[] z70VarArr = this.E;
        TextView textView = this.P;
        boolean z12 = true;
        if (!k10) {
            if (aVar.f4985a == cg.b.f4988b) {
                z11 = true;
            } else {
                z11 = true;
                z12 = false;
            }
            int i7 = z11;
            Object[] objArr = new Object[i7];
            objArr[0] = mb.X0(z12, "⭐️ " + ((Object) mb.M0(aVar.o(), 1.0f, ',')), 0.9f, null, 0.0f, 1.0f);
            textView.setText(hd.V(null, null, 2131749681, objArr));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f9662c0[0];
            textView.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(12.0f), i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.f9669h0 = i7;
            ViewPropertyAnimator duration = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            er erVar = er.h;
            duration.setInterpolator(erVar).setListener(new u5(this, 0)).start();
            z70VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(erVar).start();
            z10 = i7;
        } else {
            z10 = true;
            ViewPropertyAnimator duration2 = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            er erVar2 = er.h;
            duration2.setInterpolator(erVar2).setListener(new u5(this, 2)).setListener(new u5(this, 1)).start();
            z70VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(erVar2).start();
        }
        boolean z13 = this.O;
        ai.j0[] j0VarArr = this.J;
        if (z13) {
            j0VarArr[2].e(2131231118, hd.M0(2131750432, null), z10);
        } else {
            j0VarArr[2].e(2131231119, hd.M0(2131750446, null), z10);
        }
        j0VarArr[2].setOnClickListener(this.W);
    }

    public void setShowOptions(boolean z10) {
        this.T = z10;
        d(this.f9660b0);
    }

    public void setWalletCard(boolean z10) {
        int i7;
        int i10;
        ai.j0 j0Var = this.J[1];
        if (z10) {
            i7 = 2131231095;
        } else {
            i7 = 2131231092;
        }
        if (z10) {
            i10 = 2131743102;
        } else {
            i10 = 2131743110;
        }
        j0Var.e(i7, hd.M0(i10, null), false);
    }

    public void setWalletDisplayed(boolean z10) {
        float f10;
        ai.j0 j0Var = this.J[1];
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        j0Var.setAlpha(f10);
    }

    public void setWearPreview(TLObject tLObject) {
        String lowerCase;
        String str;
        String str2;
        if (tLObject instanceof TLRPC.User) {
            str2 = q10.p((TLRPC.User) tLObject);
            str = hd.M0(2131747826, null);
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str3 = chat.title;
            if (org.telegram.messenger.t3.V(chat)) {
                int i7 = chat.participants_count;
                if (i7 > 1) {
                    lowerCase = hd.H(',', "Subscribers", i7);
                } else {
                    lowerCase = hd.M0(2131751390, null);
                }
            } else {
                int i10 = chat.participants_count;
                if (i10 > 1) {
                    lowerCase = hd.H(',', "Members", i10);
                } else {
                    lowerCase = hd.M0(2131754876, null).toLowerCase();
                }
            }
            str = lowerCase;
            str2 = str3;
        } else {
            return;
        }
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        t8Var.l(tLObject);
        this.M.f(tLObject, t8Var);
        this.f9679r[2].setText(str2);
        this.E[2].setText(str);
        m();
        d(this.f9660b0);
    }

    public void k(int i7) {
    }
}
