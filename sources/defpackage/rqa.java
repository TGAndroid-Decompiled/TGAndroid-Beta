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
public class rqa extends FrameLayout {
    public float A0;
    public ValueAnimator B0;
    public final RectF C0;
    public vva D0;
    public final l46[] E;
    public final int[] E0;
    public final LinearLayout.LayoutParams[] F;
    public final int[] F0;
    public final fu4[] G;
    public final int[] G0;
    public final TextPaint H;
    public final pkb I;
    public final gw9[] J;
    public final gw9 K;
    public final FrameLayout L;
    public final be0 M;
    public final upa N;
    public boolean O;
    public final TextView P;
    public final ImageView Q;
    public final ImageView R;
    public final ImageView S;
    public boolean T;
    public Boolean U;
    public final View.OnClickListener V;
    public final View.OnClickListener W;
    public final wjb a;
    public final View.OnClickListener a0;
    public final FrameLayout b;
    public xpa b0;
    public final kqa c;
    public final TL_stars.starGiftAttributeBackdrop[] c0;
    public final be0[] d;
    public ee0 d0;
    public final TL_stars.starGiftAttributeModel[] e;
    public ee0 e0;
    public final LinearLayout[] f;
    public ee0 f0;
    public boolean g0;
    public final FrameLayout.LayoutParams[] h;
    public CharSequence h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public float l0;
    public float m0;
    public final ov4 n;
    public float n0;
    public ValueAnimator o0;
    public final z6a p0;
    public final Paint[] q0;
    public final l46[] r;
    public final RadialGradient[] r0;
    public final l46 s;
    public final Matrix[] s0;
    public RadialGradient t0;
    public final Matrix u0;
    public final Paint v0;
    public final TextView w;
    public final TL_stars.starGiftAttributePattern[] w0;
    public int x;
    public final tl[] x0;
    public final FrameLayout y;
    public int y0;
    public float z0;

    public rqa(Context context, wjb wjbVar, Runnable runnable, View.OnClickListener onClickListener, lna lnaVar, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
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
        gw9[] gw9VarArr;
        int i5;
        this.d = new be0[5];
        this.e = new TL_stars.starGiftAttributeModel[3];
        this.f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.r = new l46[5];
        this.E = new l46[5];
        this.F = new LinearLayout.LayoutParams[5];
        this.G = new fu4[5];
        this.b0 = new xpa(0, 0);
        this.c0 = new TL_stars.starGiftAttributeBackdrop[3];
        this.p0 = new z6a(this, (byte) 22);
        this.q0 = new Paint[3];
        this.r0 = new RadialGradient[3];
        this.s0 = new Matrix[3];
        this.u0 = new Matrix();
        int i6 = 1;
        this.v0 = new Paint(1);
        this.w0 = new TL_stars.starGiftAttributePattern[2];
        this.x0 = new tl[2];
        int i7 = 0;
        while (true) {
            Paint[] paintArr = this.q0;
            if (i7 >= paintArr.length) {
                break;
            }
            paintArr[i7] = new Paint(1);
            i7++;
        }
        int i8 = 0;
        while (true) {
            tl[] tlVarArr = this.x0;
            f = 28.0f;
            if (i8 >= tlVarArr.length) {
                break;
            }
            tlVarArr[i8] = new tl(gl.L(28.0f), this);
            i8++;
        }
        this.A0 = 1.0f;
        this.C0 = new RectF();
        this.E0 = new int[12];
        this.F0 = new int[12];
        this.G0 = new int[12];
        this.a = wjbVar;
        this.V = onClickListener4;
        this.W = onClickListener5;
        this.a0 = onClickListener6;
        setWillNotDraw(false);
        this.b = new FrameLayout(context);
        int i9 = 0;
        while (true) {
            be0[] be0VarArr = this.d;
            float f6 = 0.0f;
            f2 = f;
            if (i9 >= be0VarArr.length) {
                break;
            }
            be0VarArr[i9] = new qr4(context, (byte) 1);
            this.d[i9].setLayerNum(6660);
            if (i9 > 0) {
                this.d[i9].getImageReceiver().t1 = (short) 1;
            }
            this.b.addView(this.d[i9], nme.e(-1, -1, 119));
            be0 be0Var = this.d[i9];
            if (i9 == 0) {
                f6 = 1.0f;
            }
            be0Var.setAlpha(f6);
            i9++;
            f = f2;
        }
        l46 l46Var = new l46(context, null);
        this.s = l46Var;
        l46Var.setTextSize(1, 12.0f);
        l46Var.setGravity(17);
        zkb.X(l46Var, bkb.F6, wjbVar);
        zkb.G(l46Var, bkb.Wc, wjbVar);
        l46Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setOnClickListener(new nqa(this, (byte) 0));
        ote.b(textView, 0.05f, 1.25f);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setLinkTextColor(-1);
        textView.setPadding(gl.L(7.0f), 0, gl.L(7.0f), 0);
        TextView textView2 = new TextView(context);
        this.P = textView2;
        textView2.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(gl.o());
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.4f);
        textView2.setScaleY(0.4f);
        textView2.setVisibility(8);
        textView2.setGravity(17);
        ote.a(textView2);
        pkb pkbVar = new pkb((byte) 18, context, this);
        this.I = pkbVar;
        pkbVar.setOrientation(0);
        this.J = new gw9[3];
        int i10 = 0;
        while (true) {
            gw9[] gw9VarArr2 = this.J;
            if (i10 >= gw9VarArr2.length) {
                break;
            }
            gw9VarArr2[i10] = new gw9(context, (byte) 2);
            if (i10 != 0) {
                if (i10 != i6) {
                    if (i10 != 2) {
                        i4 = i6;
                    } else {
                        i4 = i6;
                        this.J[i10].a(2131231171, k96.M0(2131750422, null), false);
                        this.J[i10].setOnClickListener(onClickListener4);
                    }
                } else {
                    i4 = i6;
                    this.J[i10].a(2131231105, k96.M0(2131750409, null), false);
                    this.J[i10].setOnClickListener(onClickListener3);
                }
            } else {
                i4 = i6;
                this.J[i10].a(2131231122, k96.M0(2131750417, null), false);
                this.J[i10].setOnClickListener(onClickListener2);
            }
            this.J[i10].setBackground(bkb.Z(0, 285212671, 16, 16));
            ote.b(this.J[i10], 0.075f, 1.5f);
            pkb pkbVar2 = this.I;
            gw9 gw9Var = this.J[i10];
            if (i10 != gw9VarArr.length - 1) {
                i5 = 11;
            } else {
                i5 = 0;
            }
            pkbVar2.addView(gw9Var, nme.q(0, 56, 1.0f, 119, 0, 0, i5, 0));
            i10++;
            i6 = i4;
        }
        gw9 gw9Var2 = new gw9(context, (byte) 2);
        this.K = gw9Var2;
        gw9Var2.a(2131231095, k96.M0(2131742865, null), false);
        gw9Var2.setBackground(bkb.Z(0, 285212671, 16, 16));
        ote.b(gw9Var2, 0.075f, 1.5f);
        gw9Var2.setVisibility(8);
        this.I.addView(gw9Var2, i6, nme.q(0, 56, 1.0f, 119, 0, 0, 11, 0));
        this.y = new FrameLayout(context);
        int i11 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f;
            if (i11 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i11] = new LinearLayout(context);
            this.f[i11].setOrientation(1);
            if (i11 == 2) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.L = frameLayout;
                this.f[i11].addView(frameLayout, nme.r(-1, 144, 119));
                be0 be0Var2 = new be0(context);
                this.M = be0Var2;
                be0Var2.setRoundRadius(gl.L(41.0f));
                frameLayout.addView(be0Var2, nme.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.r[i11] = new l46(context, null);
                this.r[i11].setTextColor(-1);
                this.r[i11].setTextSize(1, 20.0f);
                this.r[i11].setTypeface(gl.o());
                this.r[i11].setSingleLine();
                l46 l46Var2 = this.r[i11];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                l46Var2.setEllipsize(truncateAt);
                this.r[i11].setGravity(17);
                frameLayout.addView(this.r[i11], nme.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.E[i11] = new l46(context, null);
                this.E[i11].setTextColor(bkb.v0(bkb.i5, wjbVar));
                this.E[i11].setTextSize(1, 14.0f);
                zkb.G(this.E[i11], bkb.Wc, wjbVar);
                this.E[i11].setLineSpacing(gl.L(2.0f), 1.0f);
                this.E[i11].setDisablePaddingsOffsetY(true);
                this.E[i11].setSingleLine();
                this.E[i11].setGravity(17);
                this.E[i11].setEllipsize(truncateAt);
                frameLayout.addView(this.E[i11], nme.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i11 == 4) {
                upa upaVar = new upa(context, wjbVar);
                this.N = upaVar;
                this.f[i11].addView(upaVar, nme.o(-1, -2));
                View view = this.f[i11];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = nme.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i11] = d;
                addView(view, d);
                i11++;
            } else {
                this.r[i11] = new l46(context, null);
                l46[] l46VarArr = this.r;
                if (i11 == 3) {
                    l46VarArr[i11].setTextColor(-1);
                } else {
                    l46VarArr[i11].setTextColor(bkb.v0(bkb.i5, wjbVar));
                }
                this.r[i11].setTextSize(1, 20.0f);
                this.r[i11].setTypeface(gl.o());
                this.r[i11].setGravity(17);
                LinearLayout linearLayout = this.f[i11];
                l46 l46Var3 = this.r[i11];
                if (i11 == 3) {
                    i = 10;
                } else {
                    i = 0;
                }
                linearLayout.addView(l46Var3, nme.t(-1, -2, 17, 24, i, 24, 0));
                if (i11 == 0) {
                    this.f[i11].addView(this.s, nme.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f[i11].addView(this.w, nme.n(19.33f, -2, 17, 0, 6, 0, 2));
                    this.E[i11] = new l46(context, null);
                    l46[] l46VarArr2 = this.E;
                    if (i11 == 3) {
                        l46VarArr2[i11].setTextColor(bkb.p1(0.75f, -1));
                    } else {
                        l46VarArr2[i11].setTextColor(bkb.v0(bkb.i5, wjbVar));
                    }
                    this.E[i11].setTextSize(1, 14.0f);
                    this.E[i11].setGravity(17);
                    zkb.G(this.E[i11], bkb.Wc, wjbVar);
                    this.E[i11].setLineSpacing(gl.L(2.0f), 1.0f);
                    this.E[i11].setDisablePaddingsOffsetY(true);
                    this.y.addView(this.E[i11], nme.e(-2, -2, 17));
                    this.y.addView(this.P, nme.d(-2, 20.33f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                    LinearLayout linearLayout2 = this.f[i11];
                    FrameLayout frameLayout2 = this.y;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.F;
                    if (i11 == 3) {
                        i3 = 6;
                    } else {
                        i3 = 0;
                    }
                    LinearLayout.LayoutParams t = nme.t(-1, -2, 17, 24, 0, 24, i3);
                    layoutParamsArr2[i11] = t;
                    linearLayout2.addView(frameLayout2, t);
                } else {
                    this.E[i11] = new l46(context, null);
                    l46[] l46VarArr3 = this.E;
                    if (i11 == 3) {
                        l46VarArr3[i11].setTextColor(bkb.p1(0.75f, -1));
                    } else {
                        l46VarArr3[i11].setTextColor(bkb.v0(bkb.i5, wjbVar));
                    }
                    this.E[i11].setTextSize(1, 14.0f);
                    this.E[i11].setGravity(17);
                    zkb.G(this.E[i11], bkb.Wc, wjbVar);
                    this.E[i11].setLineSpacing(gl.L(2.0f), 1.0f);
                    this.E[i11].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout3 = this.f[i11];
                    l46 l46Var4 = this.E[i11];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.F;
                    if (i11 == 3) {
                        i2 = 6;
                    } else {
                        i2 = 0;
                    }
                    LinearLayout.LayoutParams t2 = nme.t(-1, -2, 17, 24, 0, 24, i2);
                    layoutParamsArr3[i11] = t2;
                    linearLayout3.addView(l46Var4, t2);
                }
                LinearLayout.LayoutParams layoutParams = this.F[i11];
                if (i11 == 3) {
                    f4 = 6.0f;
                } else {
                    if (i11 == 1) {
                        f3 = 7.33f;
                    } else if (this.c0[0] == null) {
                        f3 = 9.0f;
                    } else {
                        f3 = 5.66f;
                    }
                    f4 = f3 - 4.0f;
                }
                layoutParams.topMargin = gl.L(f4);
                this.G[i11] = new fu4(context);
                this.G[i11].setVisibility(8);
                this.G[i11].setPadding(gl.L(30.0f), gl.L(2.0f), gl.L(30.0f), gl.L(2.0f));
                if (i11 == 0) {
                    this.H = this.G[i11].getTextPaint();
                }
                this.f[i11].addView(this.G[i11], nme.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i11 == 0) {
                this.f[i11].addView(this.I, nme.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f[i11];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            if (i11 == 2) {
                f5 = 32.0f;
            } else {
                f5 = 170.0f;
            }
            ViewGroup.LayoutParams d2 = nme.d(-1, -2.0f, 119, 16.0f, f5, 16.0f, 0.0f);
            layoutParamsArr4[i11] = d2;
            addView(view2, d2);
            i11++;
        }
        addView(this.b, nme.d(160, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        kqa kqaVar = new kqa(context);
        this.c = kqaVar;
        addView(kqaVar, nme.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setBackground(bkb.K(gl.L(f2), 620756991));
        imageView.setImageResource(2131232101);
        ote.a(imageView);
        addView(imageView, nme.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView.setOnClickListener(new nk3(runnable, (byte) 7));
        imageView.setVisibility(8);
        ImageView imageView2 = new ImageView(context);
        this.R = imageView2;
        imageView2.setImageResource(2131231113);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(bkb.f0(553648127, 1, -1));
        ote.a(imageView2);
        if (lnaVar != null) {
            addView(imageView2, nme.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView2.setOnClickListener(lnaVar);
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setContentDescription(k96.M0(2131754878, null));
        imageView3.setImageResource(2131231753);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(bkb.f0(553648127, 1, -1));
        ote.a(imageView3);
        addView(imageView3, nme.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView3.setOnClickListener(onClickListener);
        imageView3.setVisibility(8);
        ov4 ov4Var = new ov4(context);
        this.n = ov4Var;
        ov4Var.b(k96.M0(2131749737, null), true);
        qv4 qv4Var = ov4Var.a;
        if (qv4Var.w == null) {
            vva vvaVar = new vva(2, 12);
            qv4Var.w = vvaVar;
            vvaVar.h = 5.0f;
        }
        Path path = qv4Var.f;
        float f7 = qv4Var.s;
        qv4Var.x = true;
        qv4.d(path, f7, true);
        ov4Var.setScaleX(1.2f);
        ov4Var.setScaleY(1.2f);
        addView(ov4Var, nme.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ov4Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new oqa(this, (byte) 1));
        this.B0.addListener(new pqa(this, (byte) 4));
        this.B0.setDuration(320L);
        this.B0.setInterpolator(s33.g);
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
                i2 = bm2.k(bm2.o(bm2.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
            }
            if (this.z0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) ((1.0f - this.z0) * this.b0.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f, f2);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f3, f4, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                return bm2.k(bm2.o(bm2.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[1].getAlpha()), i2);
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
            i2 = bm2.k(bm2.o(bm2.f(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
        }
        if (this.z0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.b0.a(1) * 255.0f * this.z0));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f, f2);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f3, f4, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[2];
            return bm2.k(bm2.o(bm2.f(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[2].getAlpha()), i2);
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
        int f5 = bm2.f(this.z0, i, i2);
        tl[] tlVarArr = this.x0;
        tlVarArr[1].k(Integer.valueOf(f5));
        ana.a(canvas, 0, tlVarArr[1], f3, f4, this.b0.a(1), this.A0);
        canvas.restore();
    }

    public void d(defpackage.xpa r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqa.d(xpa):void");
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
        rqa rqaVar;
        int i;
        int[] iArr3;
        float f4;
        Canvas canvas2;
        kqa kqaVar;
        float max2;
        gw9 gw9Var;
        float realHeight = getRealHeight();
        canvas.save();
        float f5 = 0.0f;
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float f6 = 2.0f;
        float width = getWidth() / 2.0f;
        float L = gl.L(80.0f) + gl.U1(this.b0.a(1), gl.L(8.0f), gl.L(24.0f));
        xpa xpaVar = this.b0;
        if ((xpaVar.b(0) && xpaVar.b(2)) || ((xpaVar.b(2) && xpaVar.b(3)) || (xpaVar.b(3) && xpaVar.b(0)))) {
            max = 1.0f;
        } else {
            max = Math.max(xpaVar.a(0), Math.max(xpaVar.a(2), xpaVar.a(3)));
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
                iArr6[i3] = bm2.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i3] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
                i3++;
                f5 = f5;
                f6 = f6;
            }
        }
        float f7 = f5;
        float f8 = f6;
        kqa kqaVar2 = this.c;
        if (kqaVar2.s == null && kqaVar2.w == null && kqaVar2.x == null) {
            rqaVar = this;
            f4 = f;
            f3 = f2;
            iArr = iArr5;
            iArr2 = iArr6;
            i = 1;
            canvas2 = canvas;
            kqaVar = kqaVar2;
            iArr3 = iArr4;
        } else {
            float width2 = getWidth();
            float f9 = f2;
            eqa eqaVar = kqaVar2.s;
            float f10 = kqaVar2.y;
            int[] iArr7 = this.F0;
            int[] iArr8 = this.E0;
            int[] iArr9 = this.G0;
            f3 = f9;
            iArr = iArr5;
            iArr2 = iArr6;
            rqaVar = this;
            i = 1;
            iArr3 = iArr4;
            f4 = f;
            canvas2 = canvas;
            kqaVar2.a(canvas2, eqaVar, f10, width2, realHeight, iArr7, iArr8, iArr9);
            kqaVar2.a(canvas2, kqaVar2.w, kqaVar2.E, width2, realHeight, iArr7, iArr8, iArr9);
            kqaVar2.a(canvas2, kqaVar2.x, kqaVar2.F, width2, realHeight, iArr7, iArr8, iArr9);
            kqaVar = kqaVar2;
            rqaVar.invalidate();
        }
        if (i2 > 0 && stargiftattributebackdropArr[0] != null) {
            int i4 = iArr3[iArr3.length / 2];
            xpa xpaVar2 = rqaVar.b0;
            if (xpaVar2.b(0) && xpaVar2.b(3)) {
                max2 = 1.0f;
            } else {
                max2 = Math.max(xpaVar2.a(0), xpaVar2.a(3));
            }
            int i5 = (max2 > f7 ? 1 : (max2 == f7 ? 0 : -1));
            tl[] tlVarArr = rqaVar.x0;
            if (i5 > 0) {
                canvas2.save();
                canvas2.translate(f4, f3);
                tlVarArr[0].k(Integer.valueOf(i4));
                float f11 = realHeight;
                ana.a(canvas, 0, tlVarArr[0], rqaVar.getWidth(), f11, max2, 1.0f);
                realHeight = f11;
                canvas.restore();
            }
            if (rqaVar.b0.a(2) > f7) {
                canvas.save();
                tlVarArr[0].k(Integer.valueOf(i4));
                float f12 = realHeight;
                RectF rectF = gl.P;
                LinearLayout[] linearLayoutArr = rqaVar.f;
                float x = linearLayoutArr[2].getX();
                FrameLayout frameLayout = rqaVar.L;
                float x2 = frameLayout.getX() + x;
                be0 be0Var = rqaVar.M;
                rectF.set(be0Var.getX() + x2, be0Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), be0Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + be0Var.getWidth(), be0Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + be0Var.getHeight());
                ana.c(canvas, tlVarArr[0], rqaVar.getWidth(), f12 * 0.7f, 1.0f, rectF, rqaVar.b0.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            int i6 = 0;
            while (true) {
                gw9[] gw9VarArr = rqaVar.J;
                if (i6 > gw9VarArr.length) {
                    break;
                }
                if (i6 < gw9VarArr.length) {
                    gw9Var = gw9VarArr[i6];
                } else {
                    gw9Var = rqaVar.K;
                }
                int[] iArr10 = iArr2;
                if (bkb.F1(gw9Var.getBackground(), iArr10[Utilities.j(Math.round((((gw9Var.getWidth() / f8) + gw9Var.getX()) / rqaVar.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    gw9Var.invalidate();
                }
                i6++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i7 = iArr11[iArr11.length / 2];
            int i8 = iArr12[iArr12.length / 2];
            TextView textView = rqaVar.w;
            if (textView != null && rqaVar.x != i7) {
                rqaVar.x = i7;
                textView.setTextColor(i7);
                bkb.F1(textView.getBackground(), i8, false);
            }
            if (kqaVar.s != null || kqaVar.w != null || kqaVar.x != null) {
                rqaVar.E[0].setTextColor(i7);
            }
            if (rqaVar.b0.a(2) > f7) {
                if (rqaVar.D0 == null) {
                    rqaVar.D0 = new vva(i, 12);
                }
                FrameLayout frameLayout2 = rqaVar.b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / f8) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / f8;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / f8) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / f8;
                float f13 = measuredHeight + scaleY;
                RectF rectF2 = rqaVar.C0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f13);
                rqaVar.D0.g(rectF2);
                rqaVar.D0.d();
                rqaVar.D0.a(canvas2, bkb.p1(rqaVar.b0.a(2), -1));
                rqaVar.invalidate();
            }
        }
        if (rqaVar.b0.a(1) > f7) {
            rqaVar.c(f4, f3, rqaVar.getWidth(), rqaVar.getRealHeight(), canvas2);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(int i, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, gl.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
        RadialGradient[] radialGradientArr = this.r0;
        radialGradientArr[i] = radialGradient;
        if (i == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, gl.L(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqa.f(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean):void");
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
            return linearLayoutArr[0].getMeasuredHeight() + gl.L(160.0f) + gl.L(f);
        } else if (this.b0.d(1)) {
            if (stargiftattributebackdropArr[1] != null) {
                f = 24.0f;
            }
            return linearLayoutArr[1].getMeasuredHeight() + gl.L(160.0f) + gl.L(f);
        } else {
            if (this.b0.d(2)) {
                L = gl.L(64.0f);
                measuredHeight = linearLayoutArr[2].getMeasuredHeight();
            } else if (this.b0.d(3)) {
                L = gl.L(160.0f);
                measuredHeight = linearLayoutArr[3].getMeasuredHeight();
            } else if (!this.b0.d(4)) {
                return 0;
            } else {
                upa upaVar = this.N;
                if (upaVar.getMeasuredHeight() > 0) {
                    return upaVar.getMeasuredHeight();
                }
                return gl.L(550.0f);
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
        int L2 = gl.L(160.0f) + gl.L(f);
        LinearLayout[] linearLayoutArr = this.f;
        float a = (this.b0.a(0) * (linearLayoutArr[0].getMeasuredHeight() + L2)) + 0.0f;
        if (stargiftattributebackdropArr[1] != null) {
            f2 = 24.0f;
        } else {
            f2 = 10.0f;
        }
        int L3 = gl.L(160.0f) + gl.L(f2);
        float a2 = (this.b0.a(2) * (linearLayoutArr[2].getMeasuredHeight() + gl.L(64.0f))) + (this.b0.a(1) * (linearLayoutArr[1].getMeasuredHeight() + L3)) + a;
        if (stargiftattributebackdropArr[0] != null) {
            f3 = 24.0f;
        }
        int L4 = gl.L(f3);
        float a3 = (this.b0.a(3) * (linearLayoutArr[3].getMeasuredHeight() + gl.L(160.0f) + L4)) + a2;
        upa upaVar = this.N;
        if (upaVar.getMeasuredHeight() > 0) {
            L = upaVar.getMeasuredHeight();
        } else {
            L = gl.L(550.0f);
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

    public be0 getUpgradeImageView() {
        int i = (this.z0 > 0.5f ? 1 : (this.z0 == 0.5f ? 0 : -1));
        be0[] be0VarArr = this.d;
        if (i > 0) {
            return be0VarArr[2];
        }
        return be0VarArr[1];
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqa.h(int, java.lang.CharSequence, java.lang.CharSequence, android.text.SpannableStringBuilder, android.text.SpannableStringBuilder, org.telegram.tgnet.TLObject, android.text.Spannable):void");
    }

    public final void i(int i, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z) {
        int i;
        pkb pkbVar = this.I;
        pkbVar.setVisibility(0);
        gw9[] gw9VarArr = this.J;
        gw9VarArr[0].setAlpha(1.0f);
        gw9VarArr[0].a(2131231122, k96.M0(2131750417, null), false);
        gw9VarArr[0].setOnClickListener(onClickListener);
        if (onClickListener2 != null) {
            i = 0;
        } else {
            i = 8;
        }
        gw9 gw9Var = this.K;
        gw9Var.setVisibility(i);
        gw9Var.setOnClickListener(onClickListener2);
        gw9VarArr[1].a(2131231105, k96.M0(2131750409, null), false);
        gw9VarArr[1].setOnClickListener(onClickListener3);
        ((LinearLayout.LayoutParams) gw9VarArr[1].getLayoutParams()).rightMargin = 0;
        setWalletDisplayed(z);
        gw9VarArr[2].setVisibility(8);
        pkbVar.requestLayout();
    }

    public final void l() {
        l46[] l46VarArr;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        l46 l46Var;
        int i;
        int i2;
        int i3;
        int i4;
        l46[] l46VarArr2 = this.r;
        if (l46VarArr2 != null && (l46VarArr = this.E) != null && (stargiftattributebackdropArr = this.c0) != null) {
            int v0 = bkb.v0(bkb.i5, this.a);
            for (int i5 = 0; i5 < 2; i5++) {
                l46 l46Var2 = l46VarArr2[i5];
                if (l46Var2 != null && l46VarArr[i5] != null) {
                    if (stargiftattributebackdropArr[Math.min(1, i5)] == null) {
                        i = v0;
                    } else {
                        i = -1;
                    }
                    l46Var2.setTextColor(i);
                    l46 l46Var3 = l46VarArr[i5];
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
                        i2 = bm2.f(this.z0, i3, i4);
                    } else {
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i5];
                        if (stargiftattributebackdrop3 == null) {
                            i2 = v0;
                        } else {
                            i2 = (-16777216) | stargiftattributebackdrop3.text_color;
                        }
                    }
                    l46Var3.setTextColor(i2);
                }
            }
            if (l46VarArr.length > 2 && (l46Var = l46VarArr[2]) != null) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[0];
                if (stargiftattributebackdrop4 != null) {
                    v0 = stargiftattributebackdrop4.text_color | (-16777216);
                }
                l46Var.setTextColor(v0);
            }
        }
    }

    public final void m() {
        boolean z = this.j0;
        gw9[] gw9VarArr = this.J;
        if (!z && !this.i0) {
            gw9VarArr[0].setAlpha(0.5f);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
            spannableStringBuilder.setSpan(new cm2(2131232247, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) k96.M0(2131750417, null));
            gw9VarArr[0].a(2131231122, spannableStringBuilder, false);
            return;
        }
        gw9VarArr[0].setAlpha(1.0f);
        gw9VarArr[0].a(2131231122, k96.M0(2131750417, null), false);
    }

    public final void n() {
        this.n0 = gl.N(33.33f) / gl.N(160.0f);
        FrameLayout frameLayout = this.b;
        l46[] l46VarArr = this.r;
        this.l0 = ((((Math.min(l46VarArr[2].getPaint().measureText(l46VarArr[2].getText().toString()), l46VarArr[2].getWidth()) + l46VarArr[2].getWidth()) / 2.0f) + (l46VarArr[2].getX() + (-frameLayout.getLeft()))) + gl.L(24.0f)) - (gl.L(126.67f) / 2.0f);
        this.m0 = (gl.L(124.0f) + (-frameLayout.getTop())) - (gl.L(126.67f) / 2.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tl[] tlVarArr = this.x0;
        tlVarArr[0].a();
        tlVarArr[1].a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tl[] tlVarArr = this.x0;
        tlVarArr[0].b();
        tlVarArr[1].b();
        gl.r(this.p0);
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

    public void setPreviewAttributes(gna gnaVar) {
        xpa xpaVar = this.b0;
        if (xpaVar != null && xpaVar.b == 1 && isAttachedToWindow()) {
            gl.r(this.p0);
            ValueAnimator valueAnimator = this.o0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.o0 = null;
            }
            int i = 1 - this.y0;
            this.y0 = i;
            be0[] be0VarArr = this.d;
            oy8 y = be0VarArr[2 - i].getImageReceiver().y();
            oy8 y2 = be0VarArr[this.y0 + 1].getImageReceiver().y();
            if (y2 != null && y != null) {
                y2.O(false, y.o());
            }
            int i2 = this.y0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = gnaVar.a;
            this.c0[i2] = stargiftattributebackdrop;
            e(i2, stargiftattributebackdrop);
            g(1, gnaVar.b, true);
            int i3 = this.y0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = gnaVar.c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
            stargiftattributemodelArr[i3] = stargiftattributemodel;
            jva.d1(be0VarArr[i3].getImageReceiver(), stargiftattributemodelArr[this.y0 + 1].document, 160);
            a();
            float f = this.y0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f, f);
            this.o0 = ofFloat;
            ofFloat.addUpdateListener(new oqa(this, (byte) 0));
            this.o0.addListener(new pqa(this, (byte) 3));
            this.o0.setDuration(320L);
            this.o0.setInterpolator(s33.h);
            this.o0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.d0 = new ee0(gta.j(arrayList, TL_stars.starGiftAttributeModel.class));
        this.e0 = new ee0(gta.j(arrayList, TL_stars.starGiftAttributePattern.class));
        this.f0 = new ee0(gta.j(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.E[1].setTextSize(1, 14.0f);
        this.I.setVisibility(8);
        this.z0 = 0.0f;
        this.y0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.e0.b(), true);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        stargiftattributemodelArr[1] = (TL_stars.starGiftAttributeModel) this.d0.b();
        be0[] be0VarArr = this.d;
        jva.d1(be0VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, 160);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.f0.b();
        this.c0[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.d0.f;
        jva.d1(be0VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, 160);
        z6a z6aVar = this.p0;
        gl.r(z6aVar);
        gl.e3(z6aVar, 2500L);
        invalidate();
    }

    public void setResellPrice(nj njVar) {
        boolean z;
        boolean z2;
        float f;
        boolean l = njVar.l();
        oj ojVar = njVar.a;
        this.O = !l;
        l46[] l46VarArr = this.E;
        TextView textView = this.P;
        if (!l) {
            oj ojVar2 = oj.b;
            if (ojVar == ojVar2) {
                z = true;
            } else {
                z = false;
            }
            if (ojVar == ojVar2) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str = "⭐️ " + ((Object) jva.G0(njVar.q(), 1.0f, ','));
            if (ojVar == ojVar2) {
                f = 1.3f;
            } else {
                f = 0.9f;
            }
            textView.setText(jva.s1(k96.V(null, null, 2131749664, jva.W0(z2, str, f, null)), z));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.c0[0];
            textView.setBackground(bkb.b0(gl.L(12.0f), bm2.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.k0 = true;
            ViewPropertyAnimator duration = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            s33 s33Var = s33.h;
            duration.setInterpolator(s33Var).setListener(new pqa(this, (byte) 0)).start();
            l46VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(s33Var).start();
        } else {
            ViewPropertyAnimator duration2 = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            s33 s33Var2 = s33.h;
            duration2.setInterpolator(s33Var2).setListener(new pqa(this, (byte) 2)).setListener(new pqa(this, (byte) 1)).start();
            l46VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(s33Var2).start();
        }
        boolean z3 = this.O;
        gw9[] gw9VarArr = this.J;
        if (z3) {
            gw9VarArr[2].a(2131231120, k96.M0(2131750416, null), true);
        } else {
            gw9VarArr[2].a(2131231121, k96.M0(2131750430, null), true);
        }
        gw9VarArr[2].setOnClickListener(this.W);
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
        gw9 gw9Var = this.J[1];
        if (z) {
            i = 2131231097;
            i2 = 2131742858;
        } else {
            i = 2131231094;
            i2 = 2131742866;
        }
        gw9Var.a(i, k96.M0(i2, null), false);
    }

    public void setWalletDisplayed(boolean z) {
        float f;
        gw9 gw9Var = this.J[1];
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        gw9Var.setAlpha(f);
    }

    public void setWearPreview(TLObject tLObject) {
        String lowerCase;
        String str;
        String str2;
        if (tLObject instanceof TLRPC.User) {
            str2 = l7c.q((TLRPC.User) tLObject);
            str = k96.M0(2131747633, null);
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str3 = chat.title;
            boolean V = hc2.V(chat);
            int i = chat.participants_count;
            if (V) {
                if (i > 1) {
                    lowerCase = k96.H(',', "Subscribers", i);
                } else {
                    lowerCase = k96.M0(2131751378, null);
                }
            } else if (i > 1) {
                lowerCase = k96.H(',', "Members", i);
            } else {
                lowerCase = k96.M0(2131754876, null).toLowerCase();
            }
            str = lowerCase;
            str2 = str3;
        } else {
            return;
        }
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.k(tLObject);
        this.M.f(tLObject, pb0Var);
        this.r[2].setText(str2);
        this.E[2].setText(str);
        n();
        d(this.b0);
    }

    public void k(int i) {
    }
}
