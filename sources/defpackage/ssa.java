package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public class ssa extends FrameLayout {
    public float A0;
    public ValueAnimator B0;
    public final RectF C0;
    public yxa D0;
    public final l66[] E;
    public final int[] E0;
    public final LinearLayout.LayoutParams[] F;
    public final int[] F0;
    public final hw4[] G;
    public final int[] G0;
    public final TextPaint H;
    public final qmb I;
    public final qw9[] J;
    public final qw9 K;
    public final FrameLayout L;
    public final bf0 M;
    public final ura N;
    public boolean O;
    public final TextView P;
    public final ImageView Q;
    public final ImageView R;
    public final ImageView S;
    public boolean T;
    public Boolean U;
    public final View.OnClickListener V;
    public final View.OnClickListener W;
    public final ylb a;
    public final View.OnClickListener a0;
    public final FrameLayout b;
    public xra b0;
    public final ksa c;
    public final TL_stars.starGiftAttributeBackdrop[] c0;
    public final bf0[] d;
    public ef0 d0;
    public final TL_stars.starGiftAttributeModel[] e;
    public ef0 e0;
    public final LinearLayout[] f;
    public ef0 f0;
    public boolean g0;
    public final FrameLayout.LayoutParams[] h;
    public CharSequence h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public float l0;
    public float m0;
    public final px4 n;
    public float n0;
    public ValueAnimator o0;
    public final nsa p0;
    public final Paint[] q0;
    public final l66[] r;
    public final RadialGradient[] r0;
    public final l66 s;
    public final Matrix[] s0;
    public RadialGradient t0;
    public final Matrix u0;
    public final Paint v0;
    public final TextView w;
    public final TL_stars.starGiftAttributePattern[] w0;
    public int x;
    public final tm[] x0;
    public final FrameLayout y;
    public int y0;
    public float z0;

    public ssa(Context context, ylb ylbVar, Runnable runnable, View.OnClickListener onClickListener, lpa lpaVar, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f;
        float f2;
        int i;
        int i2;
        float f3;
        float f4;
        int i3;
        float f5;
        int i4;
        qw9[] qw9VarArr;
        int i5;
        this.d = new bf0[5];
        this.e = new TL_stars.starGiftAttributeModel[3];
        this.f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.r = new l66[5];
        this.E = new l66[5];
        this.F = new LinearLayout.LayoutParams[5];
        this.G = new hw4[5];
        this.b0 = new xra(0, 0);
        this.c0 = new TL_stars.starGiftAttributeBackdrop[3];
        this.p0 = new nsa(this, (byte) 0);
        this.q0 = new Paint[3];
        this.r0 = new RadialGradient[3];
        this.s0 = new Matrix[3];
        this.u0 = new Matrix();
        int i6 = 1;
        this.v0 = new Paint(1);
        int i7 = 2;
        this.w0 = new TL_stars.starGiftAttributePattern[2];
        this.x0 = new tm[2];
        int i8 = 0;
        while (true) {
            Paint[] paintArr = this.q0;
            if (i8 >= paintArr.length) {
                break;
            }
            paintArr[i8] = new Paint(1);
            i8++;
        }
        int i9 = 0;
        while (true) {
            tm[] tmVarArr = this.x0;
            f = 28.0f;
            if (i9 >= tmVarArr.length) {
                break;
            }
            tmVarArr[i9] = new tm(gm.L(28.0f), this);
            i9++;
        }
        this.A0 = 1.0f;
        this.C0 = new RectF();
        this.E0 = new int[12];
        this.F0 = new int[12];
        this.G0 = new int[12];
        this.a = ylbVar;
        this.V = onClickListener4;
        this.W = onClickListener5;
        this.a0 = onClickListener6;
        setWillNotDraw(false);
        this.b = new FrameLayout(context);
        int i10 = 0;
        while (true) {
            bf0[] bf0VarArr = this.d;
            float f6 = 0.0f;
            f2 = f;
            if (i10 >= bf0VarArr.length) {
                break;
            }
            bf0VarArr[i10] = new rt4(context, (byte) 1);
            this.d[i10].setLayerNum(6660);
            if (i10 > 0) {
                this.d[i10].getImageReceiver().t1 = (short) 1;
            }
            this.b.addView(this.d[i10], qoe.e(-1, -1, 119));
            bf0 bf0Var = this.d[i10];
            if (i10 == 0) {
                f6 = 1.0f;
            }
            bf0Var.setAlpha(f6);
            i10++;
            f = f2;
        }
        l66 l66Var = new l66(context, null);
        this.s = l66Var;
        l66Var.setTextSize(1, 12.0f);
        l66Var.setGravity(17);
        anb.X(l66Var, cmb.F6, ylbVar);
        anb.G(l66Var, cmb.Wc, ylbVar);
        l66Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setOnClickListener(new osa(this, (byte) 0));
        rve.b(textView, 0.05f, 1.25f);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setLinkTextColor(-1);
        textView.setPadding(gm.L(7.0f), 0, gm.L(7.0f), 0);
        TextView textView2 = new TextView(context);
        this.P = textView2;
        textView2.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(gm.o());
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.4f);
        textView2.setScaleY(0.4f);
        textView2.setVisibility(8);
        textView2.setGravity(17);
        rve.a(textView2);
        qmb qmbVar = new qmb((byte) 18, context, this);
        this.I = qmbVar;
        qmbVar.setOrientation(0);
        this.J = new qw9[3];
        int i11 = 0;
        while (true) {
            qw9[] qw9VarArr2 = this.J;
            if (i11 >= qw9VarArr2.length) {
                break;
            }
            qw9VarArr2[i11] = new qw9(context, (byte) 3);
            if (i11 != 0) {
                if (i11 != i6) {
                    if (i11 != i7) {
                        i4 = i6;
                    } else {
                        i4 = i6;
                        this.J[i11].a(2131231172, jb6.M0(2131750371, null), false);
                        this.J[i11].setOnClickListener(onClickListener4);
                    }
                } else {
                    i4 = i6;
                    this.J[i11].a(2131231106, jb6.M0(2131750358, null), false);
                    this.J[i11].setOnClickListener(onClickListener3);
                }
            } else {
                i4 = i6;
                this.J[i11].a(2131231123, jb6.M0(2131750366, null), false);
                this.J[i11].setOnClickListener(onClickListener2);
            }
            this.J[i11].setBackground(cmb.Z(0, 285212671, 16, 16));
            rve.b(this.J[i11], 0.075f, 1.5f);
            qmb qmbVar2 = this.I;
            qw9 qw9Var = this.J[i11];
            if (i11 != qw9VarArr.length - 1) {
                i5 = 11;
            } else {
                i5 = 0;
            }
            qmbVar2.addView(qw9Var, qoe.q(0, 56, 1.0f, 119, 0, 0, i5, 0));
            i11++;
            i6 = i4;
            i7 = 2;
        }
        qw9 qw9Var2 = new qw9(context, (byte) 3);
        this.K = qw9Var2;
        qw9Var2.a(2131231096, jb6.M0(2131742791, null), false);
        qw9Var2.setBackground(cmb.Z(0, 285212671, 16, 16));
        rve.b(qw9Var2, 0.075f, 1.5f);
        qw9Var2.setVisibility(8);
        this.I.addView(qw9Var2, i6, qoe.q(0, 56, 1.0f, 119, 0, 0, 11, 0));
        this.y = new FrameLayout(context);
        int i12 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f;
            if (i12 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i12] = new LinearLayout(context);
            this.f[i12].setOrientation(1);
            if (i12 == 2) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.L = frameLayout;
                this.f[i12].addView(frameLayout, qoe.r(-1, 144, 119));
                bf0 bf0Var2 = new bf0(context);
                this.M = bf0Var2;
                bf0Var2.setRoundRadius(gm.L(41.0f));
                frameLayout.addView(bf0Var2, qoe.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.r[i12] = new l66(context, null);
                this.r[i12].setTextColor(-1);
                this.r[i12].setTextSize(1, 20.0f);
                this.r[i12].setTypeface(gm.o());
                this.r[i12].setSingleLine();
                l66 l66Var2 = this.r[i12];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                l66Var2.setEllipsize(truncateAt);
                this.r[i12].setGravity(17);
                frameLayout.addView(this.r[i12], qoe.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.E[i12] = new l66(context, null);
                this.E[i12].setTextColor(cmb.v0(cmb.i5, ylbVar));
                this.E[i12].setTextSize(1, 14.0f);
                anb.G(this.E[i12], cmb.Wc, ylbVar);
                this.E[i12].setLineSpacing(gm.L(2.0f), 1.0f);
                this.E[i12].setDisablePaddingsOffsetY(true);
                this.E[i12].setSingleLine();
                this.E[i12].setGravity(17);
                this.E[i12].setEllipsize(truncateAt);
                frameLayout.addView(this.E[i12], qoe.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i12 == 4) {
                ura uraVar = new ura(context, ylbVar);
                this.N = uraVar;
                this.f[i12].addView(uraVar, qoe.o(-1, -2));
                View view = this.f[i12];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = qoe.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i12] = d;
                addView(view, d);
                i12++;
            } else {
                this.r[i12] = new l66(context, null);
                l66[] l66VarArr = this.r;
                if (i12 == 3) {
                    l66VarArr[i12].setTextColor(-1);
                } else {
                    l66VarArr[i12].setTextColor(cmb.v0(cmb.i5, ylbVar));
                }
                this.r[i12].setTextSize(1, 20.0f);
                this.r[i12].setTypeface(gm.o());
                this.r[i12].setGravity(17);
                LinearLayout linearLayout = this.f[i12];
                l66 l66Var3 = this.r[i12];
                if (i12 == 3) {
                    i = 10;
                } else {
                    i = 0;
                }
                linearLayout.addView(l66Var3, qoe.t(-1, -2, 17, 24, i, 24, 0));
                if (i12 == 0) {
                    this.f[i12].addView(this.s, qoe.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f[i12].addView(this.w, qoe.n(19.33f, -2, 17, 0, 6, 0, 2));
                    this.E[i12] = new l66(context, null);
                    l66[] l66VarArr2 = this.E;
                    if (i12 == 3) {
                        l66VarArr2[i12].setTextColor(cmb.p1(0.75f, -1));
                    } else {
                        l66VarArr2[i12].setTextColor(cmb.v0(cmb.i5, ylbVar));
                    }
                    this.E[i12].setTextSize(1, 14.0f);
                    this.E[i12].setGravity(17);
                    anb.G(this.E[i12], cmb.Wc, ylbVar);
                    this.E[i12].setLineSpacing(gm.L(2.0f), 1.0f);
                    this.E[i12].setDisablePaddingsOffsetY(true);
                    this.y.addView(this.E[i12], qoe.e(-2, -2, 17));
                    this.y.addView(this.P, qoe.d(-2, 20.33f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                    LinearLayout linearLayout2 = this.f[i12];
                    FrameLayout frameLayout2 = this.y;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.F;
                    if (i12 == 3) {
                        i3 = 6;
                    } else {
                        i3 = 0;
                    }
                    LinearLayout.LayoutParams t = qoe.t(-1, -2, 17, 24, 0, 24, i3);
                    layoutParamsArr2[i12] = t;
                    linearLayout2.addView(frameLayout2, t);
                } else {
                    this.E[i12] = new l66(context, null);
                    l66[] l66VarArr3 = this.E;
                    if (i12 == 3) {
                        l66VarArr3[i12].setTextColor(cmb.p1(0.75f, -1));
                    } else {
                        l66VarArr3[i12].setTextColor(cmb.v0(cmb.i5, ylbVar));
                    }
                    this.E[i12].setTextSize(1, 14.0f);
                    this.E[i12].setGravity(17);
                    anb.G(this.E[i12], cmb.Wc, ylbVar);
                    this.E[i12].setLineSpacing(gm.L(2.0f), 1.0f);
                    this.E[i12].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout3 = this.f[i12];
                    l66 l66Var4 = this.E[i12];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.F;
                    if (i12 == 3) {
                        i2 = 6;
                    } else {
                        i2 = 0;
                    }
                    LinearLayout.LayoutParams t2 = qoe.t(-1, -2, 17, 24, 0, 24, i2);
                    layoutParamsArr3[i12] = t2;
                    linearLayout3.addView(l66Var4, t2);
                }
                LinearLayout.LayoutParams layoutParams = this.F[i12];
                if (i12 == 3) {
                    f4 = 6.0f;
                } else {
                    if (i12 == 1) {
                        f3 = 7.33f;
                    } else if (this.c0[0] == null) {
                        f3 = 9.0f;
                    } else {
                        f3 = 5.66f;
                    }
                    f4 = f3 - 4.0f;
                }
                layoutParams.topMargin = gm.L(f4);
                this.G[i12] = new hw4(context);
                this.G[i12].setVisibility(8);
                this.G[i12].setPadding(gm.L(30.0f), gm.L(2.0f), gm.L(30.0f), gm.L(2.0f));
                if (i12 == 0) {
                    this.H = this.G[i12].getTextPaint();
                }
                this.f[i12].addView(this.G[i12], qoe.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i12 == 0) {
                this.f[i12].addView(this.I, qoe.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f[i12];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            if (i12 == 2) {
                f5 = 32.0f;
            } else {
                f5 = 170.0f;
            }
            ViewGroup.LayoutParams d2 = qoe.d(-1, -2.0f, 119, 16.0f, f5, 16.0f, 0.0f);
            layoutParamsArr4[i12] = d2;
            addView(view2, d2);
            i12++;
        }
        addView(this.b, qoe.d(160, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        ksa ksaVar = new ksa(context);
        this.c = ksaVar;
        addView(ksaVar, qoe.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setBackground(cmb.K(gm.L(f2), 620756991));
        imageView.setImageResource(2131232102);
        rve.a(imageView);
        addView(imageView, qoe.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView.setOnClickListener(new xl3(runnable, (byte) 7));
        imageView.setVisibility(8);
        ImageView imageView2 = new ImageView(context);
        this.R = imageView2;
        imageView2.setImageResource(2131231114);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(cmb.f0(553648127, 1, -1));
        rve.a(imageView2);
        if (lpaVar != null) {
            addView(imageView2, qoe.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView2.setOnClickListener(lpaVar);
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setContentDescription(jb6.M0(2131754878, null));
        imageView3.setImageResource(2131231754);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(cmb.f0(553648127, 1, -1));
        rve.a(imageView3);
        addView(imageView3, qoe.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView3.setOnClickListener(onClickListener);
        imageView3.setVisibility(8);
        px4 px4Var = new px4(context);
        this.n = px4Var;
        px4Var.b(jb6.M0(2131749686, null), true);
        rx4 rx4Var = px4Var.a;
        if (rx4Var.w == null) {
            yxa yxaVar = new yxa(2, 12);
            rx4Var.w = yxaVar;
            yxaVar.h = 5.0f;
        }
        Path path = rx4Var.f;
        float f7 = rx4Var.s;
        rx4Var.x = true;
        rx4.d(path, f7, true);
        px4Var.setScaleX(1.2f);
        px4Var.setScaleY(1.2f);
        addView(px4Var, qoe.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        px4Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new psa(this, (byte) 1));
        this.B0.addListener(new qsa(this, (byte) 4));
        this.B0.setDuration(320L);
        this.B0.setInterpolator(d53.g);
        this.B0.start();
    }

    public final int b(float f, float f2, float f3, float f4, Canvas canvas) {
        int i = this.y0;
        float f5 = this.z0;
        RadialGradient[] radialGradientArr = this.r0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        Matrix[] matrixArr = this.s0;
        Paint[] paintArr = this.q0;
        int i2 = 0;
        if (i == 0) {
            if (f5 > 0.0f && stargiftattributebackdropArr[2] != null) {
                paintArr[2].setAlpha((int) (this.b0.a(1) * 255.0f));
                matrixArr[2].reset();
                matrixArr[2].postTranslate(f, f2);
                radialGradientArr[2].setLocalMatrix(matrixArr[2]);
                canvas.drawRect(0.0f, 0.0f, f3, f4, paintArr[2]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[2];
                i2 = on2.l(on2.p(on2.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
            }
            if (this.z0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) ((1.0f - this.z0) * this.b0.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f, f2);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f3, f4, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                return on2.l(on2.p(on2.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[1].getAlpha()), i2);
            }
            return i2;
        }
        if (f5 < 1.0f && stargiftattributebackdropArr[1] != null) {
            paintArr[1].setAlpha((int) (this.b0.a(1) * 255.0f));
            matrixArr[1].reset();
            matrixArr[1].postTranslate(f, f2);
            radialGradientArr[1].setLocalMatrix(matrixArr[1]);
            canvas.drawRect(0.0f, 0.0f, f3, f4, paintArr[1]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[1];
            i2 = on2.l(on2.p(on2.f(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
        }
        if (this.z0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.b0.a(1) * 255.0f * this.z0));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f, f2);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f3, f4, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[2];
            return on2.l(on2.p(on2.f(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[2].getAlpha()), i2);
        }
        return i2;
    }

    public final void c(float f, float f2, float f3, float f4, Canvas canvas) {
        int i;
        canvas.save();
        canvas.translate(f, f2);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
        int i2 = 0;
        if (stargiftattributebackdrop == null) {
            i = 0;
        } else {
            i = stargiftattributebackdrop.pattern_color | (-16777216);
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
        if (stargiftattributebackdrop2 != null) {
            i2 = stargiftattributebackdrop2.pattern_color | (-16777216);
        }
        int f5 = on2.f(this.z0, i, i2);
        tm[] tmVarArr = this.x0;
        tmVarArr[1].k(Integer.valueOf(f5));
        bpa.a(canvas, 0, tmVarArr[1], f3, f4, this.b0.a(1), this.A0);
        canvas.restore();
    }

    public void d(defpackage.xra r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ssa.d(xra):void");
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float max;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        float f;
        float f2;
        float f3;
        int[] iArr;
        int[] iArr2;
        ssa ssaVar;
        int i;
        int[] iArr3;
        float f4;
        Canvas canvas2;
        ksa ksaVar;
        float max2;
        qw9 qw9Var;
        float realHeight = getRealHeight();
        canvas.save();
        float f5 = 0.0f;
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float f6 = 2.0f;
        float width = getWidth() / 2.0f;
        float L = gm.L(80.0f) + gm.U1(this.b0.a(1), gm.L(8.0f), gm.L(24.0f));
        xra xraVar = this.b0;
        if ((xraVar.b(0) && xraVar.b(2)) || ((xraVar.b(2) && xraVar.b(3)) || (xraVar.b(3) && xraVar.b(0)))) {
            max = 1.0f;
        } else {
            max = Math.max(xraVar.a(0), Math.max(xraVar.a(2), xraVar.a(3)));
        }
        int i2 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.c0;
        if (i2 > 0 && stargiftattributebackdropArr2[0] != null) {
            if (this.t0 != null && this.b0.a(2) >= 1.0f) {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            } else {
                Paint[] paintArr = this.q0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.s0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, L);
                this.r0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            }
            if (this.t0 != null && this.b0.a(2) > 0.0f) {
                Paint paint = this.v0;
                paint.setAlpha((int) (this.b0.a(2) * 255.0f));
                Matrix matrix = this.u0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.t0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        } else {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        }
        if (this.b0.a(1) > 0.0f) {
            f = width;
            f2 = L;
            int b = b(f, f2, getWidth(), realHeight, canvas);
            realHeight = realHeight;
            k(b);
        } else {
            f = width;
            f2 = L;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
        int[] iArr4 = this.G0;
        int[] iArr5 = this.F0;
        int[] iArr6 = this.E0;
        if (stargiftattributebackdrop != null) {
            int i3 = 0;
            while (i3 < iArr6.length) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                iArr5[i3] = stargiftattributebackdrop2.text_color | (-16777216);
                iArr6[i3] = on2.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i3] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
                i3++;
                f5 = f5;
                f6 = f6;
            }
        }
        float f7 = f5;
        float f8 = f6;
        ksa ksaVar2 = this.c;
        if (ksaVar2.s == null && ksaVar2.w == null && ksaVar2.x == null) {
            ssaVar = this;
            f4 = f;
            f3 = f2;
            iArr = iArr5;
            iArr2 = iArr6;
            i = 1;
            canvas2 = canvas;
            ksaVar = ksaVar2;
            iArr3 = iArr4;
        } else {
            float width2 = getWidth();
            float f9 = f2;
            esa esaVar = ksaVar2.s;
            float f10 = ksaVar2.y;
            int[] iArr7 = this.F0;
            int[] iArr8 = this.E0;
            int[] iArr9 = this.G0;
            f3 = f9;
            iArr = iArr5;
            iArr2 = iArr6;
            ssaVar = this;
            i = 1;
            iArr3 = iArr4;
            f4 = f;
            canvas2 = canvas;
            ksaVar2.a(canvas2, esaVar, f10, width2, realHeight, iArr7, iArr8, iArr9);
            ksaVar2.a(canvas2, ksaVar2.w, ksaVar2.E, width2, realHeight, iArr7, iArr8, iArr9);
            ksaVar2.a(canvas2, ksaVar2.x, ksaVar2.F, width2, realHeight, iArr7, iArr8, iArr9);
            ksaVar = ksaVar2;
            ssaVar.invalidate();
        }
        if (i2 > 0 && stargiftattributebackdropArr[0] != null) {
            int i4 = iArr3[iArr3.length / 2];
            xra xraVar2 = ssaVar.b0;
            if (xraVar2.b(0) && xraVar2.b(3)) {
                max2 = 1.0f;
            } else {
                max2 = Math.max(xraVar2.a(0), xraVar2.a(3));
            }
            int i5 = (max2 > f7 ? 1 : (max2 == f7 ? 0 : -1));
            tm[] tmVarArr = ssaVar.x0;
            if (i5 > 0) {
                canvas2.save();
                canvas2.translate(f4, f3);
                tmVarArr[0].k(Integer.valueOf(i4));
                float f11 = realHeight;
                bpa.a(canvas, 0, tmVarArr[0], ssaVar.getWidth(), f11, max2, 1.0f);
                realHeight = f11;
                canvas.restore();
            }
            if (ssaVar.b0.a(2) > f7) {
                canvas.save();
                tmVarArr[0].k(Integer.valueOf(i4));
                float f12 = realHeight;
                RectF rectF = gm.P;
                LinearLayout[] linearLayoutArr = ssaVar.f;
                float x = linearLayoutArr[2].getX();
                FrameLayout frameLayout = ssaVar.L;
                float x2 = frameLayout.getX() + x;
                bf0 bf0Var = ssaVar.M;
                rectF.set(bf0Var.getX() + x2, bf0Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), bf0Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + bf0Var.getWidth(), bf0Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + bf0Var.getHeight());
                bpa.c(canvas, tmVarArr[0], ssaVar.getWidth(), f12 * 0.7f, 1.0f, rectF, ssaVar.b0.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            int i6 = 0;
            while (true) {
                qw9[] qw9VarArr = ssaVar.J;
                if (i6 > qw9VarArr.length) {
                    break;
                }
                if (i6 < qw9VarArr.length) {
                    qw9Var = qw9VarArr[i6];
                } else {
                    qw9Var = ssaVar.K;
                }
                int[] iArr10 = iArr2;
                if (cmb.F1(qw9Var.getBackground(), iArr10[Utilities.j(Math.round((((qw9Var.getWidth() / f8) + qw9Var.getX()) / ssaVar.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    qw9Var.invalidate();
                }
                i6++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i7 = iArr11[iArr11.length / 2];
            int i8 = iArr12[iArr12.length / 2];
            TextView textView = ssaVar.w;
            if (textView != null && ssaVar.x != i7) {
                ssaVar.x = i7;
                textView.setTextColor(i7);
                cmb.F1(textView.getBackground(), i8, false);
            }
            if (ksaVar.s != null || ksaVar.w != null || ksaVar.x != null) {
                ssaVar.E[0].setTextColor(i7);
            }
            if (ssaVar.b0.a(2) > f7) {
                if (ssaVar.D0 == null) {
                    ssaVar.D0 = new yxa(i, 12);
                }
                FrameLayout frameLayout2 = ssaVar.b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / f8) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / f8;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / f8) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / f8;
                float f13 = measuredHeight + scaleY;
                RectF rectF2 = ssaVar.C0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f13);
                ssaVar.D0.g(rectF2);
                ssaVar.D0.d();
                ssaVar.D0.a(canvas2, cmb.p1(ssaVar.b0.a(2), -1));
                ssaVar.invalidate();
            }
        }
        if (ssaVar.b0.a(1) > f7) {
            ssaVar.c(f4, f3, ssaVar.getWidth(), ssaVar.getRealHeight(), canvas2);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(int i, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, gm.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
        RadialGradient[] radialGradientArr = this.r0;
        radialGradientArr[i] = radialGradient;
        if (i == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, gm.L(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.t0 = radialGradient2;
            this.v0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.s0;
        if (matrixArr[i] == null) {
            matrixArr[i] = new Matrix();
        }
        this.q0[i].setShader(radialGradientArr[i]);
    }

    public final void f(org.telegram.tgnet.tl.TL_stars.StarGift r20, boolean r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ssa.f(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean):void");
    }

    public final void g(int i, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.w0;
            if (stargiftattributepatternArr[i] != stargiftattributepattern) {
                stargiftattributepatternArr[i] = stargiftattributepattern;
                this.x0[i].i(stargiftattributepattern.document, z);
            }
        }
    }

    public int getFinalHeight() {
        int L;
        int measuredHeight;
        boolean d = this.b0.d(0);
        float f = 10.0f;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        LinearLayout[] linearLayoutArr = this.f;
        if (d) {
            if (stargiftattributebackdropArr[0] != null) {
                f = 24.0f;
            }
            return linearLayoutArr[0].getMeasuredHeight() + gm.L(160.0f) + gm.L(f);
        } else if (this.b0.d(1)) {
            if (stargiftattributebackdropArr[1] != null) {
                f = 24.0f;
            }
            return linearLayoutArr[1].getMeasuredHeight() + gm.L(160.0f) + gm.L(f);
        } else {
            if (this.b0.d(2)) {
                L = gm.L(64.0f);
                measuredHeight = linearLayoutArr[2].getMeasuredHeight();
            } else if (this.b0.d(3)) {
                L = gm.L(160.0f);
                measuredHeight = linearLayoutArr[3].getMeasuredHeight();
            } else if (!this.b0.d(4)) {
                return 0;
            } else {
                ura uraVar = this.N;
                if (uraVar.getMeasuredHeight() > 0) {
                    return uraVar.getMeasuredHeight();
                }
                return gm.L(550.0f);
            }
            return measuredHeight + L;
        }
    }

    public float getRealHeight() {
        float f;
        float f2;
        int L;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        float f3 = 10.0f;
        if (stargiftattributebackdropArr[0] != null) {
            f = 24.0f;
        } else {
            f = 10.0f;
        }
        int L2 = gm.L(160.0f) + gm.L(f);
        LinearLayout[] linearLayoutArr = this.f;
        float a = (this.b0.a(0) * (linearLayoutArr[0].getMeasuredHeight() + L2)) + 0.0f;
        if (stargiftattributebackdropArr[1] != null) {
            f2 = 24.0f;
        } else {
            f2 = 10.0f;
        }
        int L3 = gm.L(160.0f) + gm.L(f2);
        float a2 = (this.b0.a(2) * (linearLayoutArr[2].getMeasuredHeight() + gm.L(64.0f))) + (this.b0.a(1) * (linearLayoutArr[1].getMeasuredHeight() + L3)) + a;
        if (stargiftattributebackdropArr[0] != null) {
            f3 = 24.0f;
        }
        int L4 = gm.L(f3);
        float a3 = (this.b0.a(3) * (linearLayoutArr[3].getMeasuredHeight() + gm.L(160.0f) + L4)) + a2;
        ura uraVar = this.N;
        if (uraVar.getMeasuredHeight() > 0) {
            L = uraVar.getMeasuredHeight();
        } else {
            L = gm.L(550.0f);
        }
        return (this.b0.a(4) * L) + a3;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        int i = (this.z0 > 0.5f ? 1 : (this.z0 == 0.5f ? 0 : -1));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        if (i > 0) {
            return stargiftattributebackdropArr[2];
        }
        return stargiftattributebackdropArr[1];
    }

    public bf0 getUpgradeImageView() {
        int i = (this.z0 > 0.5f ? 1 : (this.z0 == 0.5f ? 0 : -1));
        bf0[] bf0VarArr = this.d;
        if (i > 0) {
            return bf0VarArr[2];
        }
        return bf0VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        int i = (this.z0 > 0.5f ? 1 : (this.z0 == 0.5f ? 0 : -1));
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        if (i > 0) {
            return stargiftattributemodelArr[2];
        }
        return stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.w0[1];
    }

    public final void h(int r7, java.lang.CharSequence r8, java.lang.CharSequence r9, android.text.SpannableStringBuilder r10, android.text.SpannableStringBuilder r11, org.telegram.tgnet.TLObject r12, android.text.Spannable r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ssa.h(int, java.lang.CharSequence, java.lang.CharSequence, android.text.SpannableStringBuilder, android.text.SpannableStringBuilder, org.telegram.tgnet.TLObject, android.text.Spannable):void");
    }

    public final void i(int i, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z) {
        int i;
        qmb qmbVar = this.I;
        qmbVar.setVisibility(0);
        qw9[] qw9VarArr = this.J;
        qw9VarArr[0].setAlpha(1.0f);
        qw9VarArr[0].a(2131231123, jb6.M0(2131750366, null), false);
        qw9VarArr[0].setOnClickListener(onClickListener);
        if (onClickListener2 != null) {
            i = 0;
        } else {
            i = 8;
        }
        qw9 qw9Var = this.K;
        qw9Var.setVisibility(i);
        qw9Var.setOnClickListener(onClickListener2);
        qw9VarArr[1].a(2131231106, jb6.M0(2131750358, null), false);
        qw9VarArr[1].setOnClickListener(onClickListener3);
        ((LinearLayout.LayoutParams) qw9VarArr[1].getLayoutParams()).rightMargin = 0;
        setWalletDisplayed(z);
        qw9VarArr[2].setVisibility(8);
        qmbVar.requestLayout();
    }

    public final void l() {
        l66[] l66VarArr;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        l66 l66Var;
        int i;
        int i2;
        int i3;
        int i4;
        l66[] l66VarArr2 = this.r;
        if (l66VarArr2 != null && (l66VarArr = this.E) != null && (stargiftattributebackdropArr = this.c0) != null) {
            int v0 = cmb.v0(cmb.i5, this.a);
            for (int i5 = 0; i5 < 2; i5++) {
                l66 l66Var2 = l66VarArr2[i5];
                if (l66Var2 != null && l66VarArr[i5] != null) {
                    if (stargiftattributebackdropArr[Math.min(1, i5)] == null) {
                        i = v0;
                    } else {
                        i = -1;
                    }
                    l66Var2.setTextColor(i);
                    l66 l66Var3 = l66VarArr[i5];
                    if (i5 != 0 && i5 != 2) {
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                        if (stargiftattributebackdrop == null) {
                            i3 = v0;
                        } else {
                            i3 = stargiftattributebackdrop.text_color | (-16777216);
                        }
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
                        if (stargiftattributebackdrop2 == null) {
                            i4 = v0;
                        } else {
                            i4 = stargiftattributebackdrop2.text_color | (-16777216);
                        }
                        i2 = on2.f(this.z0, i3, i4);
                    } else {
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i5];
                        if (stargiftattributebackdrop3 == null) {
                            i2 = v0;
                        } else {
                            i2 = (-16777216) | stargiftattributebackdrop3.text_color;
                        }
                    }
                    l66Var3.setTextColor(i2);
                }
            }
            if (l66VarArr.length > 2 && (l66Var = l66VarArr[2]) != null) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[0];
                if (stargiftattributebackdrop4 != null) {
                    v0 = stargiftattributebackdrop4.text_color | (-16777216);
                }
                l66Var.setTextColor(v0);
            }
        }
    }

    public final void m() {
        boolean z = this.j0;
        qw9[] qw9VarArr = this.J;
        if (!z && !this.i0) {
            qw9VarArr[0].setAlpha(0.5f);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
            spannableStringBuilder.setSpan(new pn2(2131232248, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) jb6.M0(2131750366, null));
            qw9VarArr[0].a(2131231123, spannableStringBuilder, false);
            return;
        }
        qw9VarArr[0].setAlpha(1.0f);
        qw9VarArr[0].a(2131231123, jb6.M0(2131750366, null), false);
    }

    public final void n() {
        this.n0 = gm.N(33.33f) / gm.N(160.0f);
        FrameLayout frameLayout = this.b;
        l66[] l66VarArr = this.r;
        this.l0 = ((((Math.min(l66VarArr[2].getPaint().measureText(l66VarArr[2].getText().toString()), l66VarArr[2].getWidth()) + l66VarArr[2].getWidth()) / 2.0f) + (l66VarArr[2].getX() + (-frameLayout.getLeft()))) + gm.L(24.0f)) - (gm.L(126.67f) / 2.0f);
        this.m0 = (gm.L(124.0f) + (-frameLayout.getTop())) - (gm.L(126.67f) / 2.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tm[] tmVarArr = this.x0;
        tmVarArr[0].a();
        tmVarArr[1].a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tm[] tmVarArr = this.x0;
        tmVarArr[0].b();
        tmVarArr[1].b();
        gm.r(this.p0);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.b0.b(2)) {
            n();
            d(this.b0);
        }
    }

    public void setInWallet(boolean z) {
        if (this.i0 == z) {
            return;
        }
        this.i0 = z;
        m();
    }

    public void setPreviewAttributes(gpa gpaVar) {
        xra xraVar = this.b0;
        if (xraVar != null && xraVar.b == 1 && isAttachedToWindow()) {
            gm.r(this.p0);
            ValueAnimator valueAnimator = this.o0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.o0 = null;
            }
            int i = 1 - this.y0;
            this.y0 = i;
            bf0[] bf0VarArr = this.d;
            p09 y = bf0VarArr[2 - i].getImageReceiver().y();
            p09 y2 = bf0VarArr[this.y0 + 1].getImageReceiver().y();
            if (y2 != null && y != null) {
                y2.O(false, y.o());
            }
            int i2 = this.y0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = gpaVar.a;
            this.c0[i2] = stargiftattributebackdrop;
            e(i2, stargiftattributebackdrop);
            g(1, gpaVar.b, true);
            int i3 = this.y0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = gpaVar.c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
            stargiftattributemodelArr[i3] = stargiftattributemodel;
            nxa.e1(bf0VarArr[i3].getImageReceiver(), stargiftattributemodelArr[this.y0 + 1].document, 160);
            a();
            float f = this.y0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f, f);
            this.o0 = ofFloat;
            ofFloat.addUpdateListener(new psa(this, (byte) 0));
            this.o0.addListener(new qsa(this, (byte) 3));
            this.o0.setDuration(320L);
            this.o0.setInterpolator(d53.h);
            this.o0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.d0 = new ef0(jva.j(arrayList, TL_stars.starGiftAttributeModel.class));
        this.e0 = new ef0(jva.j(arrayList, TL_stars.starGiftAttributePattern.class));
        this.f0 = new ef0(jva.j(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.E[1].setTextSize(1, 14.0f);
        this.I.setVisibility(8);
        this.z0 = 0.0f;
        this.y0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.e0.b(), true);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        stargiftattributemodelArr[1] = (TL_stars.starGiftAttributeModel) this.d0.b();
        bf0[] bf0VarArr = this.d;
        nxa.e1(bf0VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, 160);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.f0.b();
        this.c0[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.d0.f;
        nxa.e1(bf0VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, 160);
        nsa nsaVar = this.p0;
        gm.r(nsaVar);
        gm.d3(nsaVar, 2500L);
        invalidate();
    }

    public void setResellPrice(nk nkVar) {
        boolean z;
        boolean z2;
        float f;
        boolean l = nkVar.l();
        ok okVar = nkVar.a;
        this.O = !l;
        l66[] l66VarArr = this.E;
        TextView textView = this.P;
        if (!l) {
            ok okVar2 = ok.b;
            if (okVar == okVar2) {
                z = true;
            } else {
                z = false;
            }
            if (okVar == okVar2) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str = "⭐️ " + ((Object) nxa.H0(nkVar.q(), 1.0f, ','));
            if (okVar == okVar2) {
                f = 1.3f;
            } else {
                f = 0.9f;
            }
            textView.setText(nxa.t1(jb6.V(null, null, 2131749613, nxa.X0(z2, str, f, null)), z));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.c0[0];
            textView.setBackground(cmb.b0(gm.L(12.0f), on2.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.k0 = true;
            ViewPropertyAnimator duration = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            d53 d53Var = d53.h;
            duration.setInterpolator(d53Var).setListener(new qsa(this, (byte) 0)).start();
            l66VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(d53Var).start();
        } else {
            ViewPropertyAnimator duration2 = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            d53 d53Var2 = d53.h;
            duration2.setInterpolator(d53Var2).setListener(new qsa(this, (byte) 2)).setListener(new qsa(this, (byte) 1)).start();
            l66VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(d53Var2).start();
        }
        boolean z3 = this.O;
        qw9[] qw9VarArr = this.J;
        if (z3) {
            qw9VarArr[2].a(2131231121, jb6.M0(2131750365, null), true);
        } else {
            qw9VarArr[2].a(2131231122, jb6.M0(2131750379, null), true);
        }
        qw9VarArr[2].setOnClickListener(this.W);
    }

    public void setShowOptions(boolean z) {
        this.T = z;
        d(this.b0);
    }

    public void setStatusPill(CharSequence charSequence) {
        this.h0 = charSequence;
    }

    public void setWalletCard(boolean z) {
        int i;
        int i2;
        qw9 qw9Var = this.J[1];
        if (z) {
            i = 2131231098;
            i2 = 2131742784;
        } else {
            i = 2131231095;
            i2 = 2131742792;
        }
        qw9Var.a(i, jb6.M0(i2, null), false);
    }

    public void setWalletDisplayed(boolean z) {
        float f;
        qw9 qw9Var = this.J[1];
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        qw9Var.setAlpha(f);
    }

    public void setWearPreview(TLObject tLObject) {
        String lowerCase;
        String str;
        String str2;
        if (tLObject instanceof TLRPC.User) {
            str2 = m9c.r((TLRPC.User) tLObject);
            str = jb6.M0(2131747559, null);
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str3 = chat.title;
            boolean V = sd2.V(chat);
            int i = chat.participants_count;
            if (V) {
                if (i > 1) {
                    lowerCase = jb6.H(',', "Subscribers", i);
                } else {
                    lowerCase = jb6.M0(2131751327, null);
                }
            } else if (i > 1) {
                lowerCase = jb6.H(',', "Members", i);
            } else {
                lowerCase = jb6.M0(2131754876, null).toLowerCase();
            }
            str = lowerCase;
            str2 = str3;
        } else {
            return;
        }
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.k(tLObject);
        this.M.f(tLObject, pc0Var);
        this.r[2].setText(str2);
        this.E[2].setText(str);
        n();
        d(this.b0);
    }

    public void k(int i) {
    }
}
