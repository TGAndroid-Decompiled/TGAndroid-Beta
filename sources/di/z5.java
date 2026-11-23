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
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.d61;
public class z5 extends FrameLayout {
    public float A0;
    public ValueAnimator B0;
    public final RectF C0;
    public ec D0;
    public final m80[] E;
    public final int[] E0;
    public final LinearLayout.LayoutParams[] F;
    public final int[] F0;
    public final bi.m1[] G;
    public final int[] G0;
    public final TextPaint H;
    public final d61 I;
    public final ai.l0[] J;
    public final ai.l0 K;
    public final FrameLayout L;
    public final org.telegram.ui.Components.q9 M;
    public final b5 N;
    public boolean O;
    public final TextView P;
    public final ImageView Q;
    public final ImageView R;
    public final ImageView S;
    public boolean T;
    public Boolean U;
    public final View.OnClickListener V;
    public final View.OnClickListener W;
    public final org.telegram.ui.ActionBar.h6 f10143a;
    public final View.OnClickListener f10144a0;
    public final FrameLayout f10145b;
    public e5 f10146b0;
    public final r5 f10147c;
    public final TL_stars.starGiftAttributeBackdrop[] f10148c0;
    public final org.telegram.ui.Components.q9[] d;
    public com.google.android.gms.common.api.internal.p f10149d0;
    public final TL_stars.starGiftAttributeModel[] f10150e;
    public com.google.android.gms.common.api.internal.p f10151e0;
    public final LinearLayout[] f10152f;
    public com.google.android.gms.common.api.internal.p f10153f0;
    public boolean f10154g0;
    public final FrameLayout.LayoutParams[] h;
    public CharSequence f10155h0;
    public boolean f10156i0;
    public boolean f10157j0;
    public boolean f10158k0;
    public float f10159l0;
    public float m0;
    public final bi.h3 f10160n;
    public float f10161n0;
    public ValueAnimator f10162o0;
    public final ca.r f10163p0;
    public final Paint[] f10164q0;
    public final m80[] f10165r;
    public final RadialGradient[] f10166r0;
    public final m80 f10167s;
    public final Matrix[] f10168s0;
    public RadialGradient f10169t0;
    public final Matrix f10170u0;
    public final Paint f10171v0;
    public final TextView f10172w;
    public final TL_stars.starGiftAttributePattern[] f10173w0;
    public int f10174x;
    public final org.telegram.ui.Components.n5[] f10175x0;
    public final FrameLayout f10176y;
    public int f10177y0;
    public float f10178z0;

    public z5(Context context, org.telegram.ui.ActionBar.h6 h6Var, Runnable runnable, View.OnClickListener onClickListener, i1 i1Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
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
        this.d = new org.telegram.ui.Components.q9[5];
        this.f10150e = new TL_stars.starGiftAttributeModel[3];
        this.f10152f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.f10165r = new m80[5];
        this.E = new m80[5];
        this.F = new LinearLayout.LayoutParams[5];
        this.G = new bi.m1[5];
        int i13 = 0;
        this.f10146b0 = new e5(0, 0);
        this.f10148c0 = new TL_stars.starGiftAttributeBackdrop[3];
        this.f10163p0 = new ca.r(this, 23);
        this.f10164q0 = new Paint[3];
        this.f10166r0 = new RadialGradient[3];
        this.f10168s0 = new Matrix[3];
        this.f10170u0 = new Matrix();
        this.f10171v0 = new Paint(1);
        int i14 = 2;
        this.f10173w0 = new TL_stars.starGiftAttributePattern[2];
        this.f10175x0 = new org.telegram.ui.Components.n5[2];
        int i15 = 0;
        while (true) {
            Paint[] paintArr = this.f10164q0;
            if (i15 >= paintArr.length) {
                break;
            }
            paintArr[i15] = new Paint(1);
            i15++;
        }
        int i16 = 0;
        while (true) {
            org.telegram.ui.Components.n5[] n5VarArr = this.f10175x0;
            f10 = 28.0f;
            if (i16 >= n5VarArr.length) {
                break;
            }
            n5VarArr[i16] = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(28.0f), this);
            i16++;
        }
        this.A0 = 1.0f;
        this.C0 = new RectF();
        this.E0 = new int[12];
        this.F0 = new int[12];
        this.G0 = new int[12];
        this.f10143a = h6Var;
        this.V = onClickListener4;
        this.W = onClickListener5;
        this.f10144a0 = onClickListener6;
        setWillNotDraw(false);
        this.f10145b = new FrameLayout(context);
        int i17 = 0;
        while (true) {
            org.telegram.ui.Components.q9[] q9VarArr = this.d;
            float f15 = 0.0f;
            f11 = f10;
            if (i17 >= q9VarArr.length) {
                break;
            }
            q9VarArr[i17] = new w5(context, 0);
            this.d[i17].setLayerNum(6660);
            if (i17 > 0) {
                this.d[i17].getImageReceiver().f22694t1 = 1;
            }
            this.f10145b.addView(this.d[i17], c8.ma.e(-1, -1, 119));
            org.telegram.ui.Components.q9 q9Var = this.d[i17];
            if (i17 == 0) {
                f15 = 1.0f;
            }
            q9Var.setAlpha(f15);
            i17++;
            f10 = f11;
        }
        m80 m80Var = new m80(context, null);
        this.f10167s = m80Var;
        m80Var.setTextSize(1, 12.0f);
        m80Var.setGravity(17);
        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.Xc, h6Var);
        m80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        TextView textView = new TextView(context);
        this.f10172w = textView;
        textView.setOnClickListener(new u5(this, 0));
        c8.ra.b(textView, 0.05f, 1.25f);
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
        c8.ra.a(textView2);
        d61 d61Var = new d61(2, context, this);
        this.I = d61Var;
        d61Var.setOrientation(0);
        this.J = new ai.l0[3];
        int i18 = 0;
        while (true) {
            ai.l0[] l0VarArr = this.J;
            if (i18 >= l0VarArr.length) {
                break;
            }
            l0VarArr[i18] = new ai.l0(context, 6);
            if (i18 != 0) {
                if (i18 != 1) {
                    if (i18 == i14) {
                        this.J[i18].e(2131231169, hd.N0(2131750421, null), false);
                        this.J[i18].setOnClickListener(onClickListener4);
                    }
                } else {
                    this.J[i18].e(2131231103, hd.N0(2131750408, null), false);
                    this.J[i18].setOnClickListener(onClickListener3);
                }
            } else {
                this.J[i18].e(2131231120, hd.N0(2131750416, null), false);
                this.J[i18].setOnClickListener(onClickListener2);
            }
            this.J[i18].setBackground(org.telegram.ui.ActionBar.m6.b0(0, 285212671, 16, 16));
            c8.ra.b(this.J[i18], 0.075f, 1.5f);
            d61 d61Var2 = this.I;
            ai.l0[] l0VarArr2 = this.J;
            ai.l0 l0Var = l0VarArr2[i18];
            if (i18 != l0VarArr2.length - 1) {
                i12 = 11;
            } else {
                i12 = 0;
            }
            d61Var2.addView(l0Var, c8.ma.q(0, 56, 1.0f, 119, 0, 0, i12, 0));
            i18++;
            i14 = 2;
        }
        ai.l0 l0Var2 = new ai.l0(context, 6);
        this.K = l0Var2;
        l0Var2.e(2131231093, hd.N0(2131742862, null), false);
        l0Var2.setBackground(org.telegram.ui.ActionBar.m6.b0(0, 285212671, 16, 16));
        c8.ra.b(l0Var2, 0.075f, 1.5f);
        l0Var2.setVisibility(8);
        this.I.addView(l0Var2, 1, c8.ma.q(0, 56, 1.0f, 119, 0, 0, 11, 0));
        this.f10176y = new FrameLayout(context);
        int i19 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f10152f;
            if (i19 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i19] = new LinearLayout(context);
            this.f10152f[i19].setOrientation(1);
            if (i19 == 2) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.L = frameLayout;
                this.f10152f[i19].addView(frameLayout, c8.ma.r(-1, 144, 119));
                org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(context);
                this.M = q9Var2;
                q9Var2.setRoundRadius(org.telegram.messenger.g0.L(41.0f));
                frameLayout.addView(q9Var2, c8.ma.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.f10165r[i19] = new m80(context, null);
                this.f10165r[i19].setTextColor(-1);
                this.f10165r[i19].setTextSize(1, 20.0f);
                this.f10165r[i19].setTypeface(org.telegram.messenger.g0.o());
                this.f10165r[i19].setSingleLine();
                m80 m80Var2 = this.f10165r[i19];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                m80Var2.setEllipsize(truncateAt);
                this.f10165r[i19].setGravity(17);
                frameLayout.addView(this.f10165r[i19], c8.ma.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.E[i19] = new m80(context, null);
                this.E[i19].setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29489j5, h6Var));
                this.E[i19].setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.t6.G(this.E[i19], org.telegram.ui.ActionBar.m6.Xc, h6Var);
                this.E[i19].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                this.E[i19].setDisablePaddingsOffsetY(true);
                this.E[i19].setSingleLine();
                this.E[i19].setGravity(17);
                this.E[i19].setEllipsize(truncateAt);
                frameLayout.addView(this.E[i19], c8.ma.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i19 == 4) {
                b5 b5Var = new b5(context, h6Var);
                this.N = b5Var;
                this.f10152f[i19].addView(b5Var, c8.ma.o(-1, -2));
                View view = this.f10152f[i19];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = c8.ma.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i19] = d;
                addView(view, d);
                i19++;
                i13 = 0;
            } else {
                this.f10165r[i19] = new m80(context, null);
                if (i19 == 3) {
                    this.f10165r[i19].setTextColor(-1);
                } else {
                    this.f10165r[i19].setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29489j5, h6Var));
                }
                this.f10165r[i19].setTextSize(1, 20.0f);
                this.f10165r[i19].setTypeface(org.telegram.messenger.g0.o());
                this.f10165r[i19].setGravity(17);
                LinearLayout linearLayout = this.f10152f[i19];
                m80 m80Var3 = this.f10165r[i19];
                if (i19 == 3) {
                    i7 = 10;
                } else {
                    i7 = i13;
                }
                linearLayout.addView(m80Var3, c8.ma.t(-1, -2, 17, 24, i7, 24, 0));
                if (i19 == 0) {
                    this.f10152f[i19].addView(this.f10167s, c8.ma.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f10152f[i19].addView(this.f10172w, c8.ma.n(19.33f, -2, 17, 0, 6, 0, 2));
                }
                if (i19 == 0) {
                    this.E[i19] = new m80(context, null);
                    if (i19 == 3) {
                        this.E[i19].setTextColor(org.telegram.ui.ActionBar.m6.r1(0.75f, -1));
                    } else {
                        this.E[i19].setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29489j5, h6Var));
                    }
                    this.E[i19].setTextSize(1, 14.0f);
                    this.E[i19].setGravity(17);
                    org.telegram.ui.ActionBar.t6.G(this.E[i19], org.telegram.ui.ActionBar.m6.Xc, h6Var);
                    this.E[i19].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.E[i19].setDisablePaddingsOffsetY(true);
                    this.f10176y.addView(this.E[i19], c8.ma.e(-2, -2, 17));
                    this.f10176y.addView(this.P, c8.ma.d(-2, 20.33f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                    LinearLayout linearLayout2 = this.f10152f[i19];
                    FrameLayout frameLayout2 = this.f10176y;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.F;
                    if (i19 == 3) {
                        i11 = 6;
                    } else {
                        i11 = i13;
                    }
                    LinearLayout.LayoutParams t6 = c8.ma.t(-1, -2, 17, 24, 0, 24, i11);
                    layoutParamsArr2[i19] = t6;
                    linearLayout2.addView(frameLayout2, t6);
                } else {
                    this.E[i19] = new m80(context, null);
                    if (i19 == 3) {
                        this.E[i19].setTextColor(org.telegram.ui.ActionBar.m6.r1(0.75f, -1));
                    } else {
                        this.E[i19].setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29489j5, h6Var));
                    }
                    this.E[i19].setTextSize(1, 14.0f);
                    this.E[i19].setGravity(17);
                    org.telegram.ui.ActionBar.t6.G(this.E[i19], org.telegram.ui.ActionBar.m6.Xc, h6Var);
                    this.E[i19].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.E[i19].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout3 = this.f10152f[i19];
                    m80 m80Var4 = this.E[i19];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.F;
                    if (i19 == 3) {
                        i10 = 6;
                    } else {
                        i10 = i13;
                    }
                    LinearLayout.LayoutParams t10 = c8.ma.t(-1, -2, 17, 24, 0, 24, i10);
                    layoutParamsArr3[i19] = t10;
                    linearLayout3.addView(m80Var4, t10);
                }
                LinearLayout.LayoutParams layoutParams = this.F[i19];
                if (i19 == 3) {
                    f13 = 6.0f;
                } else {
                    if (i19 == 1) {
                        f12 = 7.33f;
                    } else if (this.f10148c0[i13] == null) {
                        f12 = 9.0f;
                    } else {
                        f12 = 5.66f;
                    }
                    f13 = f12 - 4.0f;
                }
                layoutParams.topMargin = org.telegram.messenger.g0.L(f13);
                this.G[i19] = new bi.m1(context);
                this.G[i19].setVisibility(8);
                this.G[i19].setPadding(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(2.0f));
                if (i19 == 0) {
                    this.H = this.G[i19].getTextPaint();
                }
                this.f10152f[i19].addView(this.G[i19], c8.ma.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i19 == 0) {
                this.f10152f[i19].addView(this.I, c8.ma.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f10152f[i19];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            if (i19 == 2) {
                f14 = 32.0f;
            } else {
                f14 = 170.0f;
            }
            ViewGroup.LayoutParams d2 = c8.ma.d(-1, -2.0f, 119, 16.0f, f14, 16.0f, 0.0f);
            layoutParamsArr4[i19] = d2;
            addView(view2, d2);
            i19++;
            i13 = 0;
        }
        addView(this.f10145b, c8.ma.d(160, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        r5 r5Var = new r5(context);
        this.f10147c = r5Var;
        addView(r5Var, c8.ma.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(f11), 620756991));
        imageView.setImageResource(2131232098);
        c8.ra.a(imageView);
        addView(imageView, c8.ma.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView.setOnClickListener(new bi.d0(1, runnable));
        imageView.setVisibility(8);
        ImageView imageView2 = new ImageView(context);
        this.R = imageView2;
        imageView2.setImageResource(2131231111);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(org.telegram.ui.ActionBar.m6.h0(553648127, 1, -1));
        c8.ra.a(imageView2);
        if (i1Var != null) {
            addView(imageView2, c8.ma.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView2.setOnClickListener(i1Var);
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setContentDescription(hd.N0(2131754878, null));
        imageView3.setImageResource(2131231750);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.m6.h0(553648127, 1, -1));
        c8.ra.a(imageView3);
        addView(imageView3, c8.ma.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView3.setOnClickListener(onClickListener);
        imageView3.setVisibility(8);
        bi.h3 h3Var = new bi.h3(context);
        this.f10160n = h3Var;
        h3Var.b(hd.N0(2131749736, null), true);
        bi.j3 j3Var = h3Var.f3699a;
        if (j3Var.f3748w == null) {
            ec ecVar = new ec(2, 12);
            j3Var.f3748w = ecVar;
            ecVar.h = 5.0f;
        }
        Path path = j3Var.f3744f;
        float f16 = j3Var.f3747s;
        j3Var.f3749x = true;
        bi.j3.d(path, f16, true);
        h3Var.setScaleX(1.2f);
        h3Var.setScaleY(1.2f);
        addView(h3Var, c8.ma.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        h3Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new v5(this, 1));
        this.B0.addListener(new x5(this, 4));
        this.B0.setDuration(320L);
        this.B0.setInterpolator(nr.f37962g);
        this.B0.start();
    }

    public final int b(float f10, float f11, float f12, float f13, Canvas canvas) {
        int i7 = this.f10177y0;
        RadialGradient[] radialGradientArr = this.f10166r0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f10148c0;
        Matrix[] matrixArr = this.f10168s0;
        Paint[] paintArr = this.f10164q0;
        int i10 = 0;
        if (i7 == 0) {
            if (this.f10178z0 > 0.0f && stargiftattributebackdropArr[2] != null) {
                paintArr[2].setAlpha((int) (this.f10146b0.a(1) * 255.0f));
                matrixArr[2].reset();
                matrixArr[2].postTranslate(f10, f11);
                radialGradientArr[2].setLocalMatrix(matrixArr[2]);
                canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[2]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[2];
                i10 = i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
            }
            if (this.f10178z0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) ((1.0f - this.f10178z0) * this.f10146b0.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f10, f11);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                return i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[1].getAlpha()), i10);
            }
            return i10;
        }
        if (this.f10178z0 < 1.0f && stargiftattributebackdropArr[1] != null) {
            paintArr[1].setAlpha((int) (this.f10146b0.a(1) * 255.0f));
            matrixArr[1].reset();
            matrixArr[1].postTranslate(f10, f11);
            radialGradientArr[1].setLocalMatrix(matrixArr[1]);
            canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[1]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[1];
            i10 = i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
        }
        if (this.f10178z0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.f10146b0.a(1) * 255.0f * this.f10178z0));
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
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f10148c0;
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
        int f14 = i0.a.f(this.f10178z0, i7, i10);
        org.telegram.ui.Components.n5[] n5VarArr = this.f10175x0;
        n5VarArr[1].k(Integer.valueOf(f14));
        v0.a(canvas, 0, n5VarArr[1], f12, f13, this.f10146b0.a(1), this.A0);
        canvas.restore();
    }

    public void d(e5 e5Var) {
        View[] viewArr;
        float f10;
        float f11;
        int i7;
        boolean z10;
        int i10;
        boolean z11;
        m80[] m80VarArr;
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
        this.f10146b0 = e5Var;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            viewArr = this.f10152f;
            if (i19 >= viewArr.length) {
                break;
            }
            float a11 = e5Var.a(i19);
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
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f10148c0;
        if (stargiftattributebackdropArr[0] != null) {
            f10 = e5Var.a(2);
        } else {
            f10 = 0.0f;
        }
        if (stargiftattributebackdropArr[1] != null) {
            f11 = e5Var.a(1);
        } else {
            f11 = 0.0f;
        }
        float max2 = Math.max(f10, f11);
        ImageView imageView = this.Q;
        imageView.setAlpha(max2);
        if ((stargiftattributebackdropArr[0] != null && e5Var.f8741c == 2) || (stargiftattributebackdropArr[1] != null && e5Var.f8741c == 1)) {
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
        float a12 = e5Var.a(0);
        int i20 = e5Var.f8741c;
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
        org.telegram.ui.ActionBar.h6 h6Var = this.f10143a;
        if (bool == null || bool.booleanValue() != z11) {
            this.U = Boolean.valueOf(z11);
            if (z11) {
                imageView2.clearColorFilter();
                imageView2.setBackground(org.telegram.ui.ActionBar.m6.h0(553648127, 1, -1));
            } else {
                org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.J5, h6Var, PorterDuff.Mode.SRC_IN);
                int i22 = org.telegram.ui.ActionBar.m6.f29473i6;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i22, h6Var), 1, -1);
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i22);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.t6.j(imageView2, h02, null, M, h6Var);
            }
        }
        if (!this.f10158k0) {
            float V12 = org.telegram.messenger.g0.V1(false, this.O, e5Var.a(0));
            TextView textView = this.P;
            textView.setAlpha(V12);
            if (this.O) {
                f14 = 1.0f;
            } else {
                f14 = 0.4f;
            }
            textView.setScaleX(org.telegram.messenger.g0.T1(0.4f, f14, e5Var.a(0)));
            if (this.O) {
                f15 = 1.0f;
            } else {
                f15 = 0.4f;
            }
            textView.setScaleY(org.telegram.messenger.g0.T1(0.4f, f15, e5Var.a(0)));
            if (!this.O) {
                i16 = 8;
            } else if (i20 == 0) {
                i16 = 0;
            } else {
                i16 = 4;
            }
            textView.setVisibility(i16);
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29489j5, h6Var);
        int i23 = 0;
        while (true) {
            m80VarArr = this.E;
            if (i23 >= 2) {
                break;
            }
            m80 m80Var = this.f10165r[i23];
            if (stargiftattributebackdropArr[Math.min(1, i23)] == null) {
                i12 = w02;
            } else {
                i12 = i21;
            }
            m80Var.setTextColor(i12);
            m80 m80Var2 = m80VarArr[i23];
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
                i13 = i0.a.f(this.f10178z0, i14, i15);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i23];
                if (stargiftattributebackdrop3 == null) {
                    i13 = w02;
                } else {
                    i13 = stargiftattributebackdrop3.text_color | (-16777216);
                }
            }
            m80Var2.setTextColor(i13);
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
                    this.f10176y.setLayoutParams(layoutParamsArr2[i23]);
                } else {
                    m80VarArr[i23].setLayoutParams(layoutParamsArr2[i23]);
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
        this.f10172w.setBackground(org.telegram.ui.ActionBar.m6.d0(L, f12));
        m80 m80Var3 = m80VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            w02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        m80Var3.setTextColor(w02);
        org.telegram.ui.Components.q9[] q9VarArr = this.d;
        org.telegram.ui.Components.q9 q9Var = q9VarArr[0];
        e5 e5Var2 = this.f10146b0;
        if (e5Var2.b(0) && e5Var2.b(2)) {
            max = 1.0f;
        } else {
            max = Math.max(e5Var2.a(0), e5Var2.a(2));
        }
        q9Var.setAlpha(Math.max(max, this.f10146b0.a(3)));
        q9VarArr[1].setAlpha((1.0f - this.f10178z0) * e5Var.a(1));
        q9VarArr[2].setAlpha(e5Var.a(1) * this.f10178z0);
        float T1 = org.telegram.messenger.g0.T1(1.0f, this.f10161n0, e5Var.a(2));
        FrameLayout frameLayout = this.f10145b;
        frameLayout.setScaleX(T1);
        frameLayout.setScaleY(org.telegram.messenger.g0.T1(1.0f, this.f10161n0, e5Var.a(2)));
        frameLayout.setTranslationX(e5Var.a(2) * this.f10159l0);
        frameLayout.setTranslationY((e5Var.a(2) * this.m0) + (e5Var.a(1) * org.telegram.messenger.g0.L(16.0f)));
        View view2 = viewArr[2];
        int i24 = e5Var.f8740b;
        if (i24 == 2 && i20 == 2) {
            a10 = 0.0f;
        } else {
            if (i24 != 2) {
                i20 = i24;
            }
            a10 = (1.0f - e5Var.a(2)) * (-(viewArr[i20].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view2.setTranslationY(a10);
        if (this.f10154g0 && this.f10146b0.b(0)) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        bi.h3 h3Var = this.f10160n;
        h3Var.setVisibility(i11);
        h3Var.setAlpha(this.f10146b0.a(0));
        if (e5Var.a(4) <= 0.0f) {
            i18 = 8;
        }
        b5 b5Var = this.N;
        b5Var.setVisibility(i18);
        b5Var.setAlpha(e5Var.a(4));
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
        z5 z5Var;
        int i7;
        int[] iArr3;
        float f13;
        Canvas canvas2;
        r5 r5Var;
        float max2;
        ai.l0 l0Var;
        float realHeight = getRealHeight();
        canvas.save();
        float f14 = 0.0f;
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float f15 = 2.0f;
        float width = getWidth() / 2.0f;
        float L = org.telegram.messenger.g0.L(80.0f) + org.telegram.messenger.g0.W1(this.f10146b0.a(1), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f));
        e5 e5Var = this.f10146b0;
        if ((e5Var.b(0) && e5Var.b(2)) || ((e5Var.b(2) && e5Var.b(3)) || (e5Var.b(3) && e5Var.b(0)))) {
            max = 1.0f;
        } else {
            max = Math.max(e5Var.a(0), Math.max(e5Var.a(2), e5Var.a(3)));
        }
        int i10 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.f10148c0;
        if (i10 > 0 && stargiftattributebackdropArr2[0] != null) {
            if (this.f10169t0 != null && this.f10146b0.a(2) >= 1.0f) {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            } else {
                Paint[] paintArr = this.f10164q0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.f10168s0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, L);
                this.f10166r0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            }
            if (this.f10169t0 != null && this.f10146b0.a(2) > 0.0f) {
                Paint paint = this.f10171v0;
                paint.setAlpha((int) (this.f10146b0.a(2) * 255.0f));
                Matrix matrix = this.f10170u0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.f10169t0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        } else {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        }
        if (this.f10146b0.a(1) > 0.0f) {
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
        int[] iArr4 = this.G0;
        int[] iArr5 = this.F0;
        int[] iArr6 = this.E0;
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
        r5 r5Var2 = this.f10147c;
        if (r5Var2.f9679s == null && r5Var2.f9680w == null && r5Var2.f9681x == null) {
            z5Var = this;
            f13 = f10;
            f12 = f11;
            iArr = iArr5;
            iArr2 = iArr6;
            i7 = 1;
            canvas2 = canvas;
            r5Var = r5Var2;
            iArr3 = iArr4;
        } else {
            float width2 = getWidth();
            float f18 = f11;
            l5 l5Var = r5Var2.f9679s;
            float f19 = r5Var2.f9682y;
            int[] iArr7 = this.F0;
            int[] iArr8 = this.E0;
            int[] iArr9 = this.G0;
            f12 = f18;
            iArr = iArr5;
            iArr2 = iArr6;
            z5Var = this;
            i7 = 1;
            iArr3 = iArr4;
            f13 = f10;
            canvas2 = canvas;
            r5Var2.a(canvas2, l5Var, f19, width2, realHeight, iArr7, iArr8, iArr9);
            r5Var2.a(canvas2, r5Var2.f9680w, r5Var2.E, width2, realHeight, iArr7, iArr8, iArr9);
            r5Var2.a(canvas2, r5Var2.f9681x, r5Var2.F, width2, realHeight, iArr7, iArr8, iArr9);
            r5Var = r5Var2;
            z5Var.invalidate();
        }
        if (i10 > 0 && stargiftattributebackdropArr[0] != null) {
            int i12 = iArr3[iArr3.length / 2];
            e5 e5Var2 = z5Var.f10146b0;
            if (e5Var2.b(0) && e5Var2.b(3)) {
                max2 = 1.0f;
            } else {
                max2 = Math.max(e5Var2.a(0), e5Var2.a(3));
            }
            int i13 = (max2 > f16 ? 1 : (max2 == f16 ? 0 : -1));
            org.telegram.ui.Components.n5[] n5VarArr = z5Var.f10175x0;
            if (i13 > 0) {
                canvas2.save();
                canvas2.translate(f13, f12);
                n5VarArr[0].k(Integer.valueOf(i12));
                float f20 = realHeight;
                v0.a(canvas, 0, n5VarArr[0], z5Var.getWidth(), f20, max2, 1.0f);
                realHeight = f20;
                canvas.restore();
            }
            if (z5Var.f10146b0.a(2) > f16) {
                canvas.save();
                n5VarArr[0].k(Integer.valueOf(i12));
                float f21 = realHeight;
                RectF rectF = org.telegram.messenger.g0.P;
                LinearLayout[] linearLayoutArr = z5Var.f10152f;
                float x10 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = z5Var.L;
                float x11 = frameLayout.getX() + x10;
                org.telegram.ui.Components.q9 q9Var = z5Var.M;
                rectF.set(q9Var.getX() + x11, q9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), q9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + q9Var.getWidth(), q9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + q9Var.getHeight());
                v0.c(canvas, n5VarArr[0], z5Var.getWidth(), f21 * 0.7f, 1.0f, rectF, z5Var.f10146b0.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            int i14 = 0;
            while (true) {
                ai.l0[] l0VarArr = z5Var.J;
                if (i14 > l0VarArr.length) {
                    break;
                }
                if (i14 < l0VarArr.length) {
                    l0Var = l0VarArr[i14];
                } else {
                    l0Var = z5Var.K;
                }
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.m6.H1(l0Var.getBackground(), iArr10[Utilities.j(Math.round((((l0Var.getWidth() / f17) + l0Var.getX()) / z5Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    l0Var.invalidate();
                }
                i14++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i15 = iArr11[iArr11.length / 2];
            int i16 = iArr12[iArr12.length / 2];
            TextView textView = z5Var.f10172w;
            if (textView != null && z5Var.f10174x != i15) {
                z5Var.f10174x = i15;
                textView.setTextColor(i15);
                org.telegram.ui.ActionBar.m6.H1(textView.getBackground(), i16, false);
            }
            if (r5Var.f9679s != null || r5Var.f9680w != null || r5Var.f9681x != null) {
                z5Var.E[0].setTextColor(i15);
            }
            if (z5Var.f10146b0.a(2) > f16) {
                if (z5Var.D0 == null) {
                    z5Var.D0 = new ec(i7, 12);
                }
                FrameLayout frameLayout2 = z5Var.f10145b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / f17) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / f17;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / f17) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / f17;
                float f22 = measuredHeight + scaleY;
                RectF rectF2 = z5Var.C0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f22);
                z5Var.D0.g(rectF2);
                z5Var.D0.d();
                z5Var.D0.a(canvas2, org.telegram.ui.ActionBar.m6.r1(z5Var.f10146b0.a(2), -1));
                z5Var.invalidate();
            }
        }
        if (z5Var.f10146b0.a(1) > f16) {
            z5Var.c(f13, f12, z5Var.getWidth(), z5Var.getRealHeight(), canvas2);
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
        RadialGradient[] radialGradientArr = this.f10166r0;
        radialGradientArr[i7] = radialGradient;
        if (i7 == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.f10169t0 = radialGradient2;
            this.f10171v0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.f10168s0;
        if (matrixArr[i7] == null) {
            matrixArr[i7] = new Matrix();
        }
        this.f10164q0[i7].setShader(radialGradientArr[i7]);
    }

    public final void f(org.telegram.tgnet.tl.TL_stars.StarGift r20, boolean r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: di.z5.f(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean):void");
    }

    public final void g(int i7, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z10) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.f10173w0;
            if (stargiftattributepatternArr[i7] != stargiftattributepattern) {
                stargiftattributepatternArr[i7] = stargiftattributepattern;
                this.f10175x0[i7].i(stargiftattributepattern.document, z10);
            }
        }
    }

    public int getFinalHeight() {
        int L;
        int measuredHeight;
        boolean d = this.f10146b0.d(0);
        float f10 = 10.0f;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f10148c0;
        LinearLayout[] linearLayoutArr = this.f10152f;
        if (d) {
            if (stargiftattributebackdropArr[0] != null) {
                f10 = 24.0f;
            }
            return linearLayoutArr[0].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(f10);
        } else if (this.f10146b0.d(1)) {
            if (stargiftattributebackdropArr[1] != null) {
                f10 = 24.0f;
            }
            return linearLayoutArr[1].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(f10);
        } else {
            if (this.f10146b0.d(2)) {
                L = org.telegram.messenger.g0.L(64.0f);
                measuredHeight = linearLayoutArr[2].getMeasuredHeight();
            } else if (this.f10146b0.d(3)) {
                L = org.telegram.messenger.g0.L(160.0f);
                measuredHeight = linearLayoutArr[3].getMeasuredHeight();
            } else if (!this.f10146b0.d(4)) {
                return 0;
            } else {
                b5 b5Var = this.N;
                if (b5Var.getMeasuredHeight() > 0) {
                    return b5Var.getMeasuredHeight();
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
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f10148c0;
        float f12 = 10.0f;
        if (stargiftattributebackdropArr[0] != null) {
            f10 = 24.0f;
        } else {
            f10 = 10.0f;
        }
        int L2 = org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(f10);
        LinearLayout[] linearLayoutArr = this.f10152f;
        float a10 = (this.f10146b0.a(0) * (linearLayoutArr[0].getMeasuredHeight() + L2)) + 0.0f;
        if (stargiftattributebackdropArr[1] != null) {
            f11 = 24.0f;
        } else {
            f11 = 10.0f;
        }
        int L3 = org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(f11);
        float a11 = (this.f10146b0.a(2) * (linearLayoutArr[2].getMeasuredHeight() + org.telegram.messenger.g0.L(64.0f))) + (this.f10146b0.a(1) * (linearLayoutArr[1].getMeasuredHeight() + L3)) + a10;
        if (stargiftattributebackdropArr[0] != null) {
            f12 = 24.0f;
        }
        int L4 = org.telegram.messenger.g0.L(f12);
        float a12 = (this.f10146b0.a(3) * (linearLayoutArr[3].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + L4)) + a11;
        b5 b5Var = this.N;
        if (b5Var.getMeasuredHeight() > 0) {
            L = b5Var.getMeasuredHeight();
        } else {
            L = org.telegram.messenger.g0.L(550.0f);
        }
        return (this.f10146b0.a(4) * L) + a12;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        int i7 = (this.f10178z0 > 0.5f ? 1 : (this.f10178z0 == 0.5f ? 0 : -1));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f10148c0;
        if (i7 > 0) {
            return stargiftattributebackdropArr[2];
        }
        return stargiftattributebackdropArr[1];
    }

    public org.telegram.ui.Components.q9 getUpgradeImageView() {
        int i7 = (this.f10178z0 > 0.5f ? 1 : (this.f10178z0 == 0.5f ? 0 : -1));
        org.telegram.ui.Components.q9[] q9VarArr = this.d;
        if (i7 > 0) {
            return q9VarArr[2];
        }
        return q9VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        int i7 = (this.f10178z0 > 0.5f ? 1 : (this.f10178z0 == 0.5f ? 0 : -1));
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.f10150e;
        if (i7 > 0) {
            return stargiftattributemodelArr[2];
        }
        return stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.f10173w0[1];
    }

    public final void h(int i7, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence3, TLObject tLObject, Spannable spannable) {
        int i10;
        int i11;
        this.f10165r[i7].setText(charSequence);
        FrameLayout frameLayout = this.f10176y;
        m80[] m80VarArr = this.E;
        m80 m80Var = this.f10167s;
        TextView textView = this.f10172w;
        int i12 = 0;
        if (i7 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            m80Var.setVisibility(8);
            if (i7 == 0) {
                frameLayout.setVisibility(8);
            } else {
                m80VarArr[i7].setVisibility(8);
            }
        } else if (i7 == 0 && !TextUtils.isEmpty(charSequence3)) {
            m80Var.setText(charSequence3);
            m80Var.setVisibility(0);
            textView.setVisibility(8);
            if (i7 == 0) {
                frameLayout.setVisibility(8);
            } else {
                m80VarArr[i7].setVisibility(8);
            }
        } else {
            m80VarArr[i7].setText(charSequence2);
            if (i7 == 0) {
                if (TextUtils.isEmpty(charSequence2)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                frameLayout.setVisibility(i11);
            } else {
                m80 m80Var2 = m80VarArr[i7];
                if (TextUtils.isEmpty(charSequence2)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                m80Var2.setVisibility(i10);
            }
            m80Var.setVisibility(8);
            textView.setVisibility(8);
        }
        bi.m1[] m1VarArr = this.G;
        bi.m1 m1Var = m1VarArr[i7];
        if (m1Var != null) {
            if (TextUtils.isEmpty(spannable)) {
                i12 = 8;
            }
            m1Var.setVisibility(i12);
            m1VarArr[i7].setUser(tLObject);
            m1VarArr[i7].setMessage(spannable);
        }
    }

    public final void i(int i7, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i7, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z10) {
        int i7;
        d61 d61Var = this.I;
        d61Var.setVisibility(0);
        ai.l0[] l0VarArr = this.J;
        l0VarArr[0].setAlpha(1.0f);
        l0VarArr[0].e(2131231120, hd.N0(2131750416, null), false);
        l0VarArr[0].setOnClickListener(onClickListener);
        if (onClickListener2 != null) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        ai.l0 l0Var = this.K;
        l0Var.setVisibility(i7);
        l0Var.setOnClickListener(onClickListener2);
        l0VarArr[1].e(2131231103, hd.N0(2131750408, null), false);
        l0VarArr[1].setOnClickListener(onClickListener3);
        ((LinearLayout.LayoutParams) l0VarArr[1].getLayoutParams()).rightMargin = 0;
        setWalletDisplayed(z10);
        l0VarArr[2].setVisibility(8);
        d61Var.requestLayout();
    }

    public final void l() {
        m80[] m80VarArr;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        m80 m80Var;
        int i7;
        int i10;
        int i11;
        int i12;
        m80[] m80VarArr2 = this.f10165r;
        if (m80VarArr2 != null && (m80VarArr = this.E) != null && (stargiftattributebackdropArr = this.f10148c0) != null) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29489j5, this.f10143a);
            for (int i13 = 0; i13 < 2; i13++) {
                m80 m80Var2 = m80VarArr2[i13];
                if (m80Var2 != null && m80VarArr[i13] != null) {
                    if (stargiftattributebackdropArr[Math.min(1, i13)] == null) {
                        i7 = w02;
                    } else {
                        i7 = -1;
                    }
                    m80Var2.setTextColor(i7);
                    m80 m80Var3 = m80VarArr[i13];
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
                        i10 = i0.a.f(this.f10178z0, i11, i12);
                    } else {
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i13];
                        if (stargiftattributebackdrop3 == null) {
                            i10 = w02;
                        } else {
                            i10 = (-16777216) | stargiftattributebackdrop3.text_color;
                        }
                    }
                    m80Var3.setTextColor(i10);
                }
            }
            if (m80VarArr.length > 2 && (m80Var = m80VarArr[2]) != null) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[0];
                if (stargiftattributebackdrop4 != null) {
                    w02 = stargiftattributebackdrop4.text_color | (-16777216);
                }
                m80Var.setTextColor(w02);
            }
        }
    }

    public final void m() {
        boolean z10 = this.f10157j0;
        ai.l0[] l0VarArr = this.J;
        if (!z10 && !this.f10156i0) {
            l0VarArr[0].setAlpha(0.5f);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
            spannableStringBuilder.setSpan(new nq(2131232244, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) hd.N0(2131750416, null));
            l0VarArr[0].e(2131231120, spannableStringBuilder, false);
            return;
        }
        l0VarArr[0].setAlpha(1.0f);
        l0VarArr[0].e(2131231120, hd.N0(2131750416, null), false);
    }

    public final void n() {
        this.f10161n0 = org.telegram.messenger.g0.N(33.33f) / org.telegram.messenger.g0.N(160.0f);
        FrameLayout frameLayout = this.f10145b;
        m80[] m80VarArr = this.f10165r;
        this.f10159l0 = ((((Math.min(m80VarArr[2].getPaint().measureText(m80VarArr[2].getText().toString()), m80VarArr[2].getWidth()) + m80VarArr[2].getWidth()) / 2.0f) + (m80VarArr[2].getX() + (-frameLayout.getLeft()))) + org.telegram.messenger.g0.L(24.0f)) - (org.telegram.messenger.g0.L(126.67f) / 2.0f);
        this.m0 = (org.telegram.messenger.g0.L(124.0f) + (-frameLayout.getTop())) - (org.telegram.messenger.g0.L(126.67f) / 2.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.n5[] n5VarArr = this.f10175x0;
        n5VarArr[0].a();
        n5VarArr[1].a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.n5[] n5VarArr = this.f10175x0;
        n5VarArr[0].b();
        n5VarArr[1].b();
        org.telegram.messenger.g0.r(this.f10163p0);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f10146b0.b(2)) {
            n();
            d(this.f10146b0);
        }
    }

    public void setInWallet(boolean z10) {
        if (this.f10156i0 == z10) {
            return;
        }
        this.f10156i0 = z10;
        m();
    }

    public void setPreviewAttributes(c1 c1Var) {
        e5 e5Var = this.f10146b0;
        if (e5Var != null && e5Var.f8741c == 1 && isAttachedToWindow()) {
            org.telegram.messenger.g0.r(this.f10163p0);
            ValueAnimator valueAnimator = this.f10162o0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f10162o0 = null;
            }
            int i7 = 1 - this.f10177y0;
            this.f10177y0 = i7;
            org.telegram.ui.Components.q9[] q9VarArr = this.d;
            oh0 B = q9VarArr[2 - i7].getImageReceiver().B();
            oh0 B2 = q9VarArr[this.f10177y0 + 1].getImageReceiver().B();
            if (B2 != null && B != null) {
                B2.T(false, B.t());
            }
            int i10 = this.f10177y0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = c1Var.f8616a;
            this.f10148c0[i10] = stargiftattributebackdrop;
            e(i10, stargiftattributebackdrop);
            g(1, c1Var.f8617b, true);
            int i11 = this.f10177y0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = c1Var.f8618c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.f10150e;
            stargiftattributemodelArr[i11] = stargiftattributemodel;
            pb.d1(q9VarArr[i11].getImageReceiver(), stargiftattributemodelArr[this.f10177y0 + 1].document, 160);
            a();
            float f10 = this.f10177y0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f10, f10);
            this.f10162o0 = ofFloat;
            ofFloat.addUpdateListener(new v5(this, 0));
            this.f10162o0.addListener(new x5(this, 3));
            this.f10162o0.setDuration(320L);
            this.f10162o0.setInterpolator(nr.h);
            this.f10162o0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.f10149d0 = new com.google.android.gms.common.api.internal.p(y8.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.f10151e0 = new com.google.android.gms.common.api.internal.p(y8.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.f10153f0 = new com.google.android.gms.common.api.internal.p(y8.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.E[1].setTextSize(1, 14.0f);
        this.I.setVisibility(8);
        this.f10178z0 = 0.0f;
        this.f10177y0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.f10151e0.c(), true);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.f10150e;
        stargiftattributemodelArr[1] = (TL_stars.starGiftAttributeModel) this.f10149d0.c();
        org.telegram.ui.Components.q9[] q9VarArr = this.d;
        pb.d1(q9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, 160);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.f10153f0.c();
        this.f10148c0[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.f10149d0.f6377f;
        pb.d1(q9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, 160);
        ca.r rVar = this.f10163p0;
        org.telegram.messenger.g0.r(rVar);
        org.telegram.messenger.g0.h3(rVar, 2500L);
        invalidate();
    }

    public void setResellPrice(cg.a aVar) {
        char c10;
        boolean z10;
        boolean z11;
        float f10;
        boolean l10 = aVar.l();
        cg.b bVar = aVar.f5303a;
        this.O = !l10;
        m80[] m80VarArr = this.E;
        TextView textView = this.P;
        if (!l10) {
            cg.b bVar2 = cg.b.f5306b;
            if (bVar == bVar2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bVar == bVar2) {
                z11 = true;
            } else {
                z11 = false;
            }
            String str = "⭐️ " + ((Object) pb.M0(aVar.q(), 1.0f, ','));
            if (bVar == bVar2) {
                f10 = 1.3f;
            } else {
                f10 = 0.9f;
            }
            textView.setText(pb.t1(hd.V(null, null, 2131749663, pb.X0(z11, str, f10, null)), z10));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f10148c0[0];
            textView.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(12.0f), i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.f10158k0 = true;
            ViewPropertyAnimator duration = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            nr nrVar = nr.h;
            duration.setInterpolator(nrVar).setListener(new x5(this, 0)).start();
            m80VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(nrVar).start();
        } else {
            ViewPropertyAnimator duration2 = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            nr nrVar2 = nr.h;
            duration2.setInterpolator(nrVar2).setListener(new x5(this, 2)).setListener(new x5(this, 1)).start();
            m80VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(nrVar2).start();
        }
        boolean z12 = this.O;
        ai.l0[] l0VarArr = this.J;
        if (z12) {
            c10 = 2;
            l0VarArr[2].e(2131231118, hd.N0(2131750415, null), true);
        } else {
            c10 = 2;
            l0VarArr[2].e(2131231119, hd.N0(2131750429, null), true);
        }
        l0VarArr[c10].setOnClickListener(this.W);
    }

    public void setShowOptions(boolean z10) {
        this.T = z10;
        d(this.f10146b0);
    }

    public void setStatusPill(CharSequence charSequence) {
        this.f10155h0 = charSequence;
    }

    public void setWalletCard(boolean z10) {
        int i7;
        int i10;
        ai.l0 l0Var = this.J[1];
        if (z10) {
            i7 = 2131231095;
        } else {
            i7 = 2131231092;
        }
        if (z10) {
            i10 = 2131742855;
        } else {
            i10 = 2131742863;
        }
        l0Var.e(i7, hd.N0(i10, null), false);
    }

    public void setWalletDisplayed(boolean z10) {
        float f10;
        ai.l0 l0Var = this.J[1];
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        l0Var.setAlpha(f10);
    }

    public void setWearPreview(TLObject tLObject) {
        String lowerCase;
        String str;
        String str2;
        if (tLObject instanceof TLRPC.User) {
            str2 = p10.q((TLRPC.User) tLObject);
            str = hd.N0(2131747632, null);
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str3 = chat.title;
            if (org.telegram.messenger.v3.V(chat)) {
                int i7 = chat.participants_count;
                if (i7 > 1) {
                    lowerCase = hd.H(',', "Subscribers", i7);
                } else {
                    lowerCase = hd.N0(2131751378, null);
                }
            } else {
                int i10 = chat.participants_count;
                if (i10 > 1) {
                    lowerCase = hd.H(',', "Members", i10);
                } else {
                    lowerCase = hd.N0(2131754876, null).toLowerCase();
                }
            }
            str = lowerCase;
            str2 = str3;
        } else {
            return;
        }
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.l(tLObject);
        this.M.f(tLObject, b9Var);
        this.f10165r[2].setText(str2);
        this.E[2].setText(str);
        n();
        d(this.f10146b0);
    }

    public void k(int i7) {
    }
}
