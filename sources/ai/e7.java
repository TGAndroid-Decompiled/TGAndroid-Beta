package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.yq;
import org.telegram.ui.sa1;
public class e7 extends FrameLayout {
    public final int[] A0;
    public final LinearLayout.LayoutParams[] E;
    public final yh.l0[] F;
    public final TextPaint G;
    public final sa1 H;
    public final ah.v[] I;
    public final ah.v J;
    public final FrameLayout K;
    public final org.telegram.ui.Components.w9 L;
    public final d6 M;
    public boolean N;
    public final TextView O;
    public final ImageView P;
    public final ImageView Q;
    public final ImageView R;
    public final View.OnClickListener S;
    public final View.OnClickListener T;
    public final View.OnClickListener U;
    public g6 V;
    public final TL_stars.starGiftAttributeBackdrop[] W;
    public final org.telegram.ui.ActionBar.d6 f1210a;
    public a f1211a0;
    public final FrameLayout f1212b;
    public a f1213b0;
    public final v6 f1214c;
    public a f1215c0;
    public final org.telegram.ui.Components.w9[] d;
    public boolean f1216d0;
    public final TL_stars.starGiftAttributeModel[] e;
    public boolean f1217e0;
    public final LinearLayout[] f1218f;
    public float f1219f0;
    public float f1220g0;
    public final FrameLayout.LayoutParams[] h;
    public float f1221h0;
    public ValueAnimator f1222i0;
    public final a3.d f1223j0;
    public final Paint[] f1224k0;
    public final RadialGradient[] f1225l0;
    public final Matrix[] m0;
    public final yh.i1 f1226n;
    public RadialGradient f1227n0;
    public final Matrix f1228o0;
    public final Paint f1229p0;
    public final TL_stars.starGiftAttributePattern[] f1230q0;
    public final x90[] f1231r;
    public final org.telegram.ui.Components.p5[] f1232r0;
    public final x90 f1233s;
    public int f1234s0;
    public float f1235t0;
    public float f1236u0;
    public final TextView v;
    public ValueAnimator f1237v0;
    public int f1238w;
    public final RectF f1239w0;
    public final FrameLayout f1240x;
    public ce f1241x0;
    public final x90[] f1242y;
    public final int[] f1243y0;
    public final int[] f1244z0;

    public e7(Context context, org.telegram.ui.ActionBar.d6 d6Var, Runnable runnable, View.OnClickListener onClickListener, c2 c2Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f7;
        float f10;
        float f11;
        this.d = new org.telegram.ui.Components.w9[5];
        this.e = new TL_stars.starGiftAttributeModel[3];
        this.f1218f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.f1231r = new x90[5];
        this.f1242y = new x90[5];
        this.E = new LinearLayout.LayoutParams[5];
        this.F = new yh.l0[5];
        this.V = new g6(0, 0);
        this.W = new TL_stars.starGiftAttributeBackdrop[3];
        this.f1223j0 = new a3.d(this, 19);
        this.f1224k0 = new Paint[3];
        this.f1225l0 = new RadialGradient[3];
        this.m0 = new Matrix[3];
        this.f1228o0 = new Matrix();
        this.f1229p0 = new Paint(1);
        int i10 = 2;
        this.f1230q0 = new TL_stars.starGiftAttributePattern[2];
        this.f1232r0 = new org.telegram.ui.Components.p5[2];
        int i11 = 0;
        while (true) {
            Paint[] paintArr = this.f1224k0;
            if (i11 >= paintArr.length) {
                break;
            }
            paintArr[i11] = new Paint(1);
            i11++;
        }
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.p5[] p5VarArr = this.f1232r0;
            f7 = 28.0f;
            if (i12 >= p5VarArr.length) {
                break;
            }
            p5VarArr[i12] = new org.telegram.ui.Components.p5(AndroidUtilities.dp(28.0f), this);
            i12++;
        }
        this.f1236u0 = 1.0f;
        this.f1239w0 = new RectF();
        this.f1243y0 = new int[12];
        this.f1244z0 = new int[12];
        this.A0 = new int[12];
        this.f1210a = d6Var;
        this.S = onClickListener4;
        this.T = onClickListener5;
        this.U = onClickListener6;
        setWillNotDraw(false);
        this.f1212b = new FrameLayout(context);
        int i13 = 0;
        while (true) {
            org.telegram.ui.Components.w9[] w9VarArr = this.d;
            float f12 = 0.0f;
            f10 = f7;
            if (i13 >= w9VarArr.length) {
                break;
            }
            w9VarArr[i13] = new b7(context, 0);
            this.d[i13].setLayerNum(6660);
            if (i13 > 0) {
                this.d[i13].getImageReceiver().setCrossfadeDuration(1);
            }
            this.f1212b.addView(this.d[i13], w7.z5.e(-1, -1, 119));
            org.telegram.ui.Components.w9 w9Var = this.d[i13];
            if (i13 == 0) {
                f12 = 1.0f;
            }
            w9Var.setAlpha(f12);
            i13++;
            f7 = f10;
        }
        x90 x90Var = new x90(context, null);
        this.f1233s = x90Var;
        x90Var.setTextSize(1, 12.0f);
        x90Var.setGravity(17);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21045gc, d6Var));
        x90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setOnClickListener(new y6(this, 0));
        w7.b6.b(textView, 0.05f, 1.25f);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setLinkTextColor(-1);
        textView.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        TextView textView2 = new TextView(context);
        this.O = textView2;
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.4f);
        textView2.setScaleY(0.4f);
        textView2.setVisibility(8);
        textView2.setGravity(17);
        w7.b6.a(textView2);
        sa1 sa1Var = new sa1(this, context, 1);
        this.H = sa1Var;
        sa1Var.setOrientation(0);
        this.I = new ah.v[3];
        int i14 = 0;
        while (true) {
            ah.v[] vVarArr = this.I;
            if (i14 >= vVarArr.length) {
                break;
            }
            vVarArr[i14] = new ah.v(context, 2);
            if (i14 == 0) {
                this.I[i14].c(R.drawable.filled_gift_send, LocaleController.getString(R.string.Gift2ActionTransfer), false);
                this.I[i14].setOnClickListener(onClickListener2);
            } else if (i14 == 1) {
                this.I[i14].c(R.drawable.filled_crown_on, LocaleController.getString(R.string.Gift2ActionWear), false);
                this.I[i14].setOnClickListener(onClickListener3);
            } else if (i14 == i10) {
                this.I[i14].c(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                this.I[i14].setOnClickListener(onClickListener4);
            }
            this.I[i14].setBackground(org.telegram.ui.ActionBar.h6.a0(0, 285212671, 16, 16));
            w7.b6.b(this.I[i14], 0.075f, 1.5f);
            sa1 sa1Var2 = this.H;
            ah.v[] vVarArr2 = this.I;
            sa1Var2.addView(vVarArr2[i14], w7.z5.p(0, 56, 1.0f, 119, 0, 0, i14 != vVarArr2.length - 1 ? 11 : 0, 0));
            i14++;
            i10 = 2;
        }
        ah.v vVar = new ah.v(context, 2);
        this.J = vVar;
        vVar.c(R.drawable.filled_card_color, LocaleController.getString(R.string.WalletGiftApplyColor), false);
        vVar.setBackground(org.telegram.ui.ActionBar.h6.a0(0, 285212671, 16, 16));
        w7.b6.b(vVar, 0.075f, 1.5f);
        vVar.setVisibility(8);
        this.H.addView(vVar, 1, w7.z5.p(0, 56, 1.0f, 119, 0, 0, 11, 0));
        this.f1240x = new FrameLayout(context);
        int i15 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f1218f;
            if (i15 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i15] = new LinearLayout(context);
            this.f1218f[i15].setOrientation(1);
            if (i15 == 2) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.K = frameLayout;
                this.f1218f[i15].addView(frameLayout, w7.z5.q(-1, 144, 119));
                org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context);
                this.L = w9Var2;
                w9Var2.setRoundRadius(AndroidUtilities.dp(41.0f));
                frameLayout.addView(w9Var2, w7.z5.a(82.0f, 0.0f, 2.0f, 0.0f, 0.0f, 82, 49));
                this.f1231r[i15] = new x90(context, null);
                this.f1231r[i15].setTextColor(-1);
                this.f1231r[i15].setTextSize(1, 20.0f);
                this.f1231r[i15].setTypeface(AndroidUtilities.bold());
                this.f1231r[i15].setSingleLine();
                x90 x90Var2 = this.f1231r[i15];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                x90Var2.setEllipsize(truncateAt);
                this.f1231r[i15].setGravity(17);
                frameLayout.addView(this.f1231r[i15], w7.z5.a(-2.0f, 16.0f, 95.33f, 16.0f, 0.0f, -1, 49));
                this.f1242y[i15] = new x90(context, null);
                this.f1242y[i15].setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21092j5, d6Var));
                this.f1242y[i15].setTextSize(1, 14.0f);
                this.f1242y[i15].setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21045gc, d6Var));
                this.f1242y[i15].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.f1242y[i15].setDisablePaddingsOffsetY(true);
                this.f1242y[i15].setSingleLine();
                this.f1242y[i15].setGravity(17);
                this.f1242y[i15].setEllipsize(truncateAt);
                frameLayout.addView(this.f1242y[i15], w7.z5.a(-2.0f, 16.0f, 122.0f, 16.0f, 0.0f, -1, 49));
            } else if (i15 == 4) {
                d6 d6Var2 = new d6(context, d6Var);
                this.M = d6Var2;
                this.f1218f[i15].addView(d6Var2, w7.z5.n(-1, -2));
                View view = this.f1218f[i15];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams a2 = w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 119);
                layoutParamsArr[i15] = a2;
                addView(view, a2);
                i15++;
            } else {
                this.f1231r[i15] = new x90(context, null);
                this.f1231r[i15].setTextColor(i15 == 3 ? -1 : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21092j5, d6Var));
                this.f1231r[i15].setTextSize(1, 20.0f);
                this.f1231r[i15].setTypeface(AndroidUtilities.bold());
                this.f1231r[i15].setGravity(17);
                this.f1218f[i15].addView(this.f1231r[i15], w7.z5.t(-1, -2, 17, 24, i15 == 3 ? 10 : 0, 24, 0));
                if (i15 == 0) {
                    this.f1218f[i15].addView(this.f1233s, w7.z5.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f1218f[i15].addView(this.v, w7.z5.s(-2, 17, 0, 6, 0, 19.33f, 2));
                }
                if (i15 == 0) {
                    this.f1242y[i15] = new x90(context, null);
                    this.f1242y[i15].setTextColor(i15 == 3 ? org.telegram.ui.ActionBar.h6.m1(0.75f, -1) : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21092j5, d6Var));
                    this.f1242y[i15].setTextSize(1, 14.0f);
                    this.f1242y[i15].setGravity(17);
                    this.f1242y[i15].setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21045gc, d6Var));
                    this.f1242y[i15].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f1242y[i15].setDisablePaddingsOffsetY(true);
                    this.f1240x.addView(this.f1242y[i15], w7.z5.e(-2, -2, 17));
                    this.f1240x.addView(this.O, w7.z5.b(-2.0f, 20.33f, 17));
                    LinearLayout linearLayout = this.f1218f[i15];
                    FrameLayout frameLayout2 = this.f1240x;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
                    LinearLayout.LayoutParams t10 = w7.z5.t(-1, -2, 17, 24, 0, 24, i15 == 3 ? 6 : 0);
                    layoutParamsArr2[i15] = t10;
                    linearLayout.addView(frameLayout2, t10);
                } else {
                    this.f1242y[i15] = new x90(context, null);
                    this.f1242y[i15].setTextColor(i15 == 3 ? org.telegram.ui.ActionBar.h6.m1(0.75f, -1) : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21092j5, d6Var));
                    this.f1242y[i15].setTextSize(1, 14.0f);
                    this.f1242y[i15].setGravity(17);
                    this.f1242y[i15].setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21045gc, d6Var));
                    this.f1242y[i15].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f1242y[i15].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout2 = this.f1218f[i15];
                    x90 x90Var3 = this.f1242y[i15];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.E;
                    LinearLayout.LayoutParams t11 = w7.z5.t(-1, -2, 17, 24, 0, 24, i15 == 3 ? 6 : 0);
                    layoutParamsArr3[i15] = t11;
                    linearLayout2.addView(x90Var3, t11);
                }
                LinearLayout.LayoutParams layoutParams = this.E[i15];
                if (i15 == 3) {
                    f11 = 6.0f;
                } else {
                    f11 = (i15 == 1 ? 7.33f : this.W[0] == null ? 9.0f : 5.66f) - 4.0f;
                }
                layoutParams.topMargin = AndroidUtilities.dp(f11);
                this.F[i15] = new yh.l0(context);
                this.F[i15].setVisibility(8);
                this.F[i15].setPadding(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f));
                if (i15 == 0) {
                    this.G = this.F[i15].getTextPaint();
                }
                this.f1218f[i15].addView(this.F[i15], w7.z5.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i15 == 0) {
                this.f1218f[i15].addView(this.H, w7.z5.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f1218f[i15];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            ViewGroup.LayoutParams a10 = w7.z5.a(-2.0f, 16.0f, i15 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f, -1, 119);
            layoutParamsArr4[i15] = a10;
            addView(view2, a10);
            i15++;
        }
        addView(this.f1212b, w7.z5.a(160.0f, 0.0f, 8.0f, 0.0f, 0.0f, 160, 49));
        v6 v6Var = new v6(context);
        this.f1214c = v6Var;
        addView(v6Var, w7.z5.a(160.0f, 0.0f, 8.0f, 0.0f, 0.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        this.P = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(f10), 620756991));
        imageView.setImageResource(R.drawable.msg_close);
        w7.b6.a(imageView);
        addView(imageView, w7.z5.a(28.0f, 0.0f, 12.0f, 12.0f, 0.0f, 28, 53));
        imageView.setOnClickListener(new z6(0, runnable));
        imageView.setVisibility(8);
        ImageView imageView2 = new ImageView(context);
        this.Q = imageView2;
        imageView2.setImageResource(R.drawable.filled_forge);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(553648127, 1, -1));
        w7.b6.a(imageView2);
        if (c2Var != null) {
            addView(imageView2, w7.z5.a(42.0f, 0.0f, 5.0f, 47.0f, 0.0f, 42, 53));
            imageView2.setOnClickListener(c2Var);
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.R = imageView3;
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView3.setImageResource(R.drawable.media_more);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.g0(553648127, 1, -1));
        w7.b6.a(imageView3);
        addView(imageView3, w7.z5.a(42.0f, 0.0f, 5.0f, 5.0f, 0.0f, 42, 53));
        imageView3.setOnClickListener(onClickListener);
        imageView3.setVisibility(8);
        yh.i1 i1Var = new yh.i1(context);
        this.f1226n = i1Var;
        i1Var.b(LocaleController.getString(R.string.GiftCrafted), true);
        yh.k1 k1Var = i1Var.f50317a;
        if (k1Var.v == null) {
            ce ceVar = new ce(2, 12);
            k1Var.v = ceVar;
            ceVar.h = 5.0f;
        }
        Path path = k1Var.f50355f;
        float f13 = k1Var.f50358s;
        k1Var.f50359w = true;
        yh.k1.d(path, f13, true);
        i1Var.setScaleX(1.2f);
        i1Var.setScaleY(1.2f);
        addView(i1Var, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 51));
        i1Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f1237v0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f1237v0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1237v0 = ofFloat;
        ofFloat.addUpdateListener(new a7(this, 1));
        this.f1237v0.addListener(new c7(this, 4));
        this.f1237v0.setDuration(320L);
        this.f1237v0.setInterpolator(bs.f25031g);
        this.f1237v0.start();
    }

    public final int b(Canvas canvas, float f7, float f10, float f11, float f12) {
        int i10 = this.f1234s0;
        RadialGradient[] radialGradientArr = this.f1225l0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.W;
        Matrix[] matrixArr = this.m0;
        Paint[] paintArr = this.f1224k0;
        int i11 = 0;
        if (i10 == 0) {
            if (this.f1235t0 > 0.0f && stargiftattributebackdropArr[2] != null) {
                paintArr[2].setAlpha((int) (this.V.a(1) * 255.0f));
                matrixArr[2].reset();
                matrixArr[2].postTranslate(f7, f10);
                radialGradientArr[2].setLocalMatrix(matrixArr[2]);
                canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[2]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[2];
                i11 = i0.b.k(i0.b.o(i0.b.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
            }
            if (this.f1235t0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) ((1.0f - this.f1235t0) * this.V.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f7, f10);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                return i0.b.k(i0.b.o(i0.b.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[1].getAlpha()), i11);
            }
            return i11;
        }
        if (this.f1235t0 < 1.0f && stargiftattributebackdropArr[1] != null) {
            paintArr[1].setAlpha((int) (this.V.a(1) * 255.0f));
            matrixArr[1].reset();
            matrixArr[1].postTranslate(f7, f10);
            radialGradientArr[1].setLocalMatrix(matrixArr[1]);
            canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[1]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[1];
            i11 = i0.b.k(i0.b.o(i0.b.f(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
        }
        if (this.f1235t0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.V.a(1) * 255.0f * this.f1235t0));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f7, f10);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[2];
            return i0.b.k(i0.b.o(i0.b.f(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[2].getAlpha()), i11);
        }
        return i11;
    }

    public final void c(Canvas canvas, float f7, float f10, float f11, float f12) {
        int i10;
        canvas.save();
        canvas.translate(f7, f10);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.W;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
        int i11 = 0;
        if (stargiftattributebackdrop == null) {
            i10 = 0;
        } else {
            i10 = stargiftattributebackdrop.pattern_color | (-16777216);
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
        if (stargiftattributebackdrop2 != null) {
            i11 = stargiftattributebackdrop2.pattern_color | (-16777216);
        }
        int f13 = i0.b.f(this.f1235t0, i10, i11);
        org.telegram.ui.Components.p5[] p5VarArr = this.f1232r0;
        p5VarArr[1].k(Integer.valueOf(f13));
        m1.a(canvas, 0, p5VarArr[1], f11, f12, this.V.a(1), this.f1236u0);
        canvas.restore();
    }

    public void d(g6 g6Var) {
        View[] viewArr;
        float f7;
        float f10;
        float f11;
        int i10;
        boolean z10;
        int i11;
        x90[] x90VarArr;
        int f12;
        float max;
        float a2;
        int i12;
        int i13;
        int i14;
        boolean z11;
        float f13;
        int i15;
        int i16;
        float f14;
        float f15;
        int i17;
        int i18;
        this.V = g6Var;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            viewArr = this.f1218f;
            f7 = 0.0f;
            if (i20 >= viewArr.length) {
                break;
            }
            float a10 = g6Var.a(i20);
            viewArr[i20].setAlpha(a10);
            View view = viewArr[i20];
            if (a10 > 0.0f) {
                i18 = 0;
            } else {
                i18 = 4;
            }
            view.setVisibility(i18);
            i20++;
        }
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.W;
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
        if ((stargiftattributebackdropArr[0] != null && g6Var.f1365c == 2) || (stargiftattributebackdropArr[1] != null && g6Var.f1365c == 1)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        if (stargiftattributebackdropArr[0] != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        float a11 = g6Var.a(0);
        int i21 = g6Var.f1365c;
        float lerp = AndroidUtilities.lerp(false, z10, a11);
        ImageView imageView2 = this.R;
        imageView2.setAlpha(lerp);
        if (stargiftattributebackdropArr[0] != null && i21 == 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView2.setVisibility(i11);
        if (!this.f1217e0) {
            float lerp2 = AndroidUtilities.lerp(false, this.N, g6Var.a(0));
            TextView textView = this.O;
            textView.setAlpha(lerp2);
            if (this.N) {
                f14 = 1.0f;
            } else {
                f14 = 0.4f;
            }
            textView.setScaleX(AndroidUtilities.lerp(0.4f, f14, g6Var.a(0)));
            if (this.N) {
                f15 = 1.0f;
            } else {
                f15 = 0.4f;
            }
            textView.setScaleY(AndroidUtilities.lerp(0.4f, f15, g6Var.a(0)));
            if (this.N && i21 == 0) {
                i17 = 0;
            } else {
                i17 = 4;
            }
            textView.setVisibility(i17);
        }
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21092j5, this.f1210a);
        int i22 = 0;
        while (true) {
            x90VarArr = this.f1242y;
            if (i22 >= 2) {
                break;
            }
            float f16 = f7;
            x90 x90Var = this.f1231r[i22];
            if (stargiftattributebackdropArr[Math.min(1, i22)] == null) {
                i13 = w02;
            } else {
                i13 = -1;
            }
            x90Var.setTextColor(i13);
            x90 x90Var2 = x90VarArr[i22];
            if (i22 != 0 && i22 != 2) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                if (stargiftattributebackdrop == null) {
                    i15 = w02;
                } else {
                    i15 = stargiftattributebackdrop.text_color | (-16777216);
                }
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
                if (stargiftattributebackdrop2 == null) {
                    i16 = w02;
                } else {
                    i16 = stargiftattributebackdrop2.text_color | (-16777216);
                }
                i14 = i0.b.f(this.f1235t0, i15, i16);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i22];
                if (stargiftattributebackdrop3 == null) {
                    i14 = w02;
                } else {
                    i14 = stargiftattributebackdrop3.text_color | (-16777216);
                }
            }
            x90Var2.setTextColor(i14);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[i22];
            FrameLayout.LayoutParams[] layoutParamsArr = this.h;
            if (stargiftattributebackdrop4 != null) {
                if (AndroidUtilities.dp(184.0f) == layoutParamsArr[i22].topMargin && viewArr[i22].getPaddingBottom() == AndroidUtilities.dp(18.0f)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    viewArr[i22].setPadding(0, 0, 0, AndroidUtilities.dp(18.0f));
                    layoutParamsArr[i22].topMargin = AndroidUtilities.dp(184.0f);
                }
            } else {
                if (AndroidUtilities.dp(170.0f) == layoutParamsArr[i22].topMargin && viewArr[i22].getPaddingBottom() == AndroidUtilities.dp(3.0f)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    viewArr[i22].setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                    layoutParamsArr[i22].topMargin = AndroidUtilities.dp(170.0f);
                }
            }
            LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
            LinearLayout.LayoutParams layoutParams = layoutParamsArr2[i22];
            if (i22 == 1) {
                f13 = 7.33f;
            } else if (stargiftattributebackdropArr[0] == null) {
                f13 = 9.0f;
            } else {
                f13 = 5.66f;
            }
            layoutParams.topMargin = AndroidUtilities.dp(f13 - 4.0f);
            if (z11) {
                viewArr[i22].setLayoutParams(layoutParamsArr[i22]);
                if (i22 == 0) {
                    this.f1240x.setLayoutParams(layoutParamsArr2[i22]);
                } else {
                    x90VarArr[i22].setLayoutParams(layoutParamsArr2[i22]);
                }
            }
            i22++;
            f7 = f16;
        }
        float f17 = f7;
        int dp = AndroidUtilities.dp(24.0f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop5 == null) {
            f12 = 553648127;
        } else {
            f12 = i0.b.f(0.25f, stargiftattributebackdrop5.edge_color | (-16777216), stargiftattributebackdrop5.pattern_color | (-16777216));
        }
        this.v.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, f12));
        x90 x90Var3 = x90VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            w02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        x90Var3.setTextColor(w02);
        org.telegram.ui.Components.w9[] w9VarArr = this.d;
        org.telegram.ui.Components.w9 w9Var = w9VarArr[0];
        g6 g6Var2 = this.V;
        if (g6Var2.b(0) && g6Var2.b(2)) {
            max = 1.0f;
        } else {
            max = Math.max(g6Var2.a(0), g6Var2.a(2));
        }
        w9Var.setAlpha(Math.max(max, this.V.a(3)));
        w9VarArr[1].setAlpha((1.0f - this.f1235t0) * g6Var.a(1));
        w9VarArr[2].setAlpha(g6Var.a(1) * this.f1235t0);
        float lerp3 = AndroidUtilities.lerp(1.0f, this.f1221h0, g6Var.a(2));
        FrameLayout frameLayout = this.f1212b;
        frameLayout.setScaleX(lerp3);
        frameLayout.setScaleY(AndroidUtilities.lerp(1.0f, this.f1221h0, g6Var.a(2)));
        frameLayout.setTranslationX(g6Var.a(2) * this.f1219f0);
        frameLayout.setTranslationY((g6Var.a(2) * this.f1220g0) + (g6Var.a(1) * AndroidUtilities.dp(16.0f)));
        View view2 = viewArr[2];
        int i23 = g6Var.f1364b;
        if (i23 == 2 && i21 == 2) {
            a2 = f17;
        } else {
            if (i23 != 2) {
                i21 = i23;
            }
            a2 = (1.0f - g6Var.a(2)) * (-(viewArr[i21].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view2.setTranslationY(a2);
        if (this.f1216d0 && this.V.b(0)) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        yh.i1 i1Var = this.f1226n;
        i1Var.setVisibility(i12);
        i1Var.setAlpha(this.V.a(0));
        if (g6Var.a(4) <= f17) {
            i19 = 8;
        }
        d6 d6Var = this.M;
        d6Var.setVisibility(i19);
        d6Var.setAlpha(g6Var.a(4));
        invalidate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float max;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        float f7;
        float f10;
        float f11;
        int[] iArr;
        int[] iArr2;
        float f12;
        int i10;
        int[] iArr3;
        e7 e7Var;
        Canvas canvas2;
        v6 v6Var;
        float max2;
        ah.v vVar;
        float realHeight = getRealHeight();
        canvas.save();
        float f13 = 0.0f;
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float f14 = 2.0f;
        float width = getWidth() / 2.0f;
        float dp = AndroidUtilities.dp(80.0f) + AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), this.V.a(1));
        g6 g6Var = this.V;
        if ((g6Var.b(0) && g6Var.b(2)) || ((g6Var.b(2) && g6Var.b(3)) || (g6Var.b(3) && g6Var.b(0)))) {
            max = 1.0f;
        } else {
            max = Math.max(g6Var.a(0), Math.max(g6Var.a(2), g6Var.a(3)));
        }
        int i11 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.W;
        if (i11 > 0 && stargiftattributebackdropArr2[0] != null) {
            if (this.f1227n0 != null && this.V.a(2) >= 1.0f) {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            } else {
                Paint[] paintArr = this.f1224k0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.m0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, dp);
                this.f1225l0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            }
            if (this.f1227n0 != null && this.V.a(2) > 0.0f) {
                Paint paint = this.f1229p0;
                paint.setAlpha((int) (this.V.a(2) * 255.0f));
                Matrix matrix = this.f1228o0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.f1227n0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        } else {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        }
        if (this.V.a(1) > 0.0f) {
            f7 = width;
            f10 = dp;
            k(b(canvas, f7, f10, getWidth(), realHeight));
        } else {
            f7 = width;
            f10 = dp;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
        int[] iArr4 = this.A0;
        int[] iArr5 = this.f1244z0;
        int[] iArr6 = this.f1243y0;
        if (stargiftattributebackdrop != null) {
            int i12 = 0;
            while (i12 < iArr6.length) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                iArr5[i12] = stargiftattributebackdrop2.text_color | (-16777216);
                iArr6[i12] = i0.b.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i12] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
                i12++;
                f13 = f13;
                f14 = f14;
            }
        }
        float f15 = f13;
        float f16 = f14;
        v6 v6Var2 = this.f1214c;
        if (v6Var2.f2310s == null && v6Var2.v == null && v6Var2.f2311w == null) {
            e7Var = this;
            f12 = f7;
            f11 = f10;
            iArr = iArr5;
            iArr2 = iArr6;
            i10 = 1;
            v6Var = v6Var2;
            iArr3 = iArr4;
            canvas2 = canvas;
        } else {
            float width2 = getWidth();
            float f17 = f7;
            p6 p6Var = v6Var2.f2310s;
            float f18 = f10;
            float f19 = v6Var2.f2312x;
            int[] iArr7 = this.f1244z0;
            int[] iArr8 = this.f1243y0;
            int[] iArr9 = this.A0;
            f11 = f18;
            iArr = iArr5;
            iArr2 = iArr6;
            f12 = f17;
            i10 = 1;
            iArr3 = iArr4;
            e7Var = this;
            canvas2 = canvas;
            v6Var2.a(canvas2, p6Var, f19, width2, realHeight, iArr7, iArr8, iArr9);
            v6Var2.a(canvas2, v6Var2.v, v6Var2.f2313y, width2, realHeight, iArr7, iArr8, iArr9);
            v6Var2.a(canvas2, v6Var2.f2311w, v6Var2.E, width2, realHeight, iArr7, iArr8, iArr9);
            v6Var = v6Var2;
            e7Var.invalidate();
        }
        if (i11 > 0 && stargiftattributebackdropArr[0] != null) {
            int i13 = iArr3[iArr3.length / 2];
            g6 g6Var2 = e7Var.V;
            if (g6Var2.b(0) && g6Var2.b(3)) {
                max2 = 1.0f;
            } else {
                max2 = Math.max(g6Var2.a(0), g6Var2.a(3));
            }
            int i14 = (max2 > f15 ? 1 : (max2 == f15 ? 0 : -1));
            org.telegram.ui.Components.p5[] p5VarArr = e7Var.f1232r0;
            if (i14 > 0) {
                canvas2.save();
                canvas2.translate(f12, f11);
                p5VarArr[0].k(Integer.valueOf(i13));
                m1.a(canvas, 0, p5VarArr[0], e7Var.getWidth(), realHeight, max2, 1.0f);
                realHeight = realHeight;
                canvas.restore();
            }
            if (e7Var.V.a(2) > f15) {
                canvas.save();
                p5VarArr[0].k(Integer.valueOf(i13));
                float f20 = realHeight;
                RectF rectF = AndroidUtilities.rectTmp;
                LinearLayout[] linearLayoutArr = e7Var.f1218f;
                float x10 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = e7Var.K;
                float x11 = frameLayout.getX() + x10;
                org.telegram.ui.Components.w9 w9Var = e7Var.L;
                rectF.set(w9Var.getX() + x11, w9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), w9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + w9Var.getWidth(), w9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + w9Var.getHeight());
                m1.c(canvas, p5VarArr[0], e7Var.getWidth(), f20 * 0.7f, 1.0f, rectF, e7Var.V.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            int i15 = 0;
            while (true) {
                ah.v[] vVarArr = e7Var.I;
                if (i15 > vVarArr.length) {
                    break;
                }
                if (i15 < vVarArr.length) {
                    vVar = vVarArr[i15];
                } else {
                    vVar = e7Var.J;
                }
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.h6.C1(vVar.getBackground(), iArr10[Utilities.clamp(Math.round((((vVar.getWidth() / f16) + vVar.getX()) / e7Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    vVar.invalidate();
                }
                i15++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i16 = iArr11[iArr11.length / 2];
            int i17 = iArr12[iArr12.length / 2];
            TextView textView = e7Var.v;
            if (textView != null && e7Var.f1238w != i16) {
                e7Var.f1238w = i16;
                textView.setTextColor(i16);
                org.telegram.ui.ActionBar.h6.C1(textView.getBackground(), i17, false);
            }
            if (v6Var.f2310s != null || v6Var.v != null || v6Var.f2311w != null) {
                e7Var.f1242y[0].setTextColor(i16);
            }
            if (e7Var.V.a(2) > f15) {
                if (e7Var.f1241x0 == null) {
                    e7Var.f1241x0 = new ce(i10, 12);
                }
                FrameLayout frameLayout2 = e7Var.f1212b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / f16) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / f16;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / f16) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / f16;
                float f21 = measuredHeight + scaleY;
                RectF rectF2 = e7Var.f1239w0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f21);
                e7Var.f1241x0.g(rectF2);
                e7Var.f1241x0.d();
                e7Var.f1241x0.a(canvas2, org.telegram.ui.ActionBar.h6.m1(e7Var.V.a(2), -1));
                e7Var.invalidate();
            }
        }
        if (e7Var.V.a(1) > f15) {
            e7Var.c(canvas2, f12, f11, e7Var.getWidth(), e7Var.getRealHeight());
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(int i10, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
        RadialGradient[] radialGradientArr = this.f1225l0;
        radialGradientArr[i10] = radialGradient;
        if (i10 == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.f1227n0 = radialGradient2;
            this.f1229p0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.m0;
        if (matrixArr[i10] == null) {
            matrixArr[i10] = new Matrix();
        }
        this.f1224k0[i10].setShader(radialGradientArr[i10]);
    }

    public final void f(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        ag.c cVar;
        boolean z14;
        int i10;
        int i11;
        this.N = false;
        if (!z10 && !z11) {
            z13 = false;
        } else {
            z13 = true;
        }
        boolean z15 = starGift instanceof TL_stars.TL_starGiftUnique;
        int i12 = 8;
        sa1 sa1Var = this.H;
        x90[] x90VarArr = this.f1242y;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.W;
        if (z15) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) fa.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) fa.l(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            x90VarArr[0].setTextSize(1, 13.0f);
            if (z13) {
                i12 = 0;
            }
            sa1Var.setVisibility(i12);
            ah.v[] vVarArr = this.I;
            vVarArr[2].setVisibility(0);
            if (z13) {
                ah.v vVar = vVarArr[1];
                if (z12) {
                    i10 = R.drawable.filled_crown_off;
                } else {
                    i10 = R.drawable.filled_crown_on;
                }
                if (z12) {
                    i11 = R.string.Gift2ActionWearOff;
                } else {
                    i11 = R.string.Gift2ActionWear;
                }
                vVar.c(i10, LocaleController.getString(i11), false);
            }
            float f7 = 1.0f;
            if (starGift.resell_amount != null) {
                this.N = true;
                boolean z16 = starGift.resale_ton_only;
                ag.c cVar2 = ag.c.f636b;
                if (z16) {
                    cVar = cVar2;
                } else {
                    cVar = ag.c.f635a;
                }
                ag.a resellAmount = starGift.getResellAmount(cVar);
                int i13 = R.string.GiftOnSale;
                if (resellAmount.f631a == cVar2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                CharSequence formatSpannable = LocaleController.formatSpannable(i13, ld.T0("⭐️ " + ((Object) ld.K0(resellAmount.o(), 1.0f, ',')), z14), Float.valueOf(0.9f));
                TextView textView = this.O;
                textView.setText(formatSpannable);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(12.0f), i0.b.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                if (k7.a2(UserConfig.selectedAccount, DialogObject.getPeerDialogId(starGift.owner_id))) {
                    textView.setOnClickListener(new y6(this, 1));
                    w7.b6.a(textView);
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                }
            }
            if (z10) {
                vVarArr[0].setAlpha(1.0f);
                vVarArr[0].c(R.drawable.filled_gift_send, LocaleController.getString(R.string.Gift2ActionTransfer), false);
            } else {
                vVarArr[0].setAlpha(0.5f);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                spannableStringBuilder.setSpan(new yq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTransfer));
                vVarArr[0].c(R.drawable.filled_gift_send, spannableStringBuilder, false);
            }
            ah.v vVar2 = vVarArr[1];
            if (!z10 && !z11) {
                f7 = 0.5f;
            }
            vVar2.setAlpha(f7);
            if (z10) {
                ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                View.OnClickListener onClickListener = this.T;
                if (arrayList != null) {
                    vVarArr[2].c(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), false);
                    vVarArr[2].setOnClickListener(onClickListener);
                } else {
                    vVarArr[2].c(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), false);
                    vVarArr[2].setOnClickListener(onClickListener);
                }
            } else {
                vVarArr[2].c(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                vVarArr[2].setOnClickListener(this.S);
            }
            this.f1216d0 = starGift.crafted;
            this.f1226n.f50317a.e(stargiftattributebackdropArr[0], false, true);
        } else {
            stargiftattributebackdropArr[0] = null;
            x90VarArr[0].setTextSize(1, 14.0f);
            this.f1216d0 = false;
            sa1Var.setVisibility(8);
        }
        e(0, stargiftattributebackdropArr[0]);
        ld.b1(this.d[0].getImageReceiver(), starGift, 160);
        this.e[0] = (TL_stars.starGiftAttributeModel) fa.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        d(this.V);
    }

    public final void g(int i10, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z10) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.f1230q0;
            if (stargiftattributepatternArr[i10] != stargiftattributepattern) {
                stargiftattributepatternArr[i10] = stargiftattributepattern;
                this.f1232r0[i10].i(stargiftattributepattern.document, z10);
            }
        }
    }

    public int getFinalHeight() {
        int dp;
        int measuredHeight;
        boolean d = this.V.d(0);
        float f7 = 10.0f;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.W;
        LinearLayout[] linearLayoutArr = this.f1218f;
        if (d) {
            if (stargiftattributebackdropArr[0] != null) {
                f7 = 24.0f;
            }
            return linearLayoutArr[0].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f7);
        } else if (this.V.d(1)) {
            if (stargiftattributebackdropArr[1] != null) {
                f7 = 24.0f;
            }
            return linearLayoutArr[1].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f7);
        } else {
            if (this.V.d(2)) {
                dp = AndroidUtilities.dp(64.0f);
                measuredHeight = linearLayoutArr[2].getMeasuredHeight();
            } else if (this.V.d(3)) {
                dp = AndroidUtilities.dp(160.0f);
                measuredHeight = linearLayoutArr[3].getMeasuredHeight();
            } else if (!this.V.d(4)) {
                return 0;
            } else {
                d6 d6Var = this.M;
                if (d6Var.getMeasuredHeight() > 0) {
                    return d6Var.getMeasuredHeight();
                }
                return AndroidUtilities.dp(550.0f);
            }
            return measuredHeight + dp;
        }
    }

    public float getRealHeight() {
        float f7;
        float f10;
        int dp;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.W;
        float f11 = 10.0f;
        if (stargiftattributebackdropArr[0] != null) {
            f7 = 24.0f;
        } else {
            f7 = 10.0f;
        }
        int dp2 = AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f7);
        LinearLayout[] linearLayoutArr = this.f1218f;
        float a2 = (this.V.a(0) * (linearLayoutArr[0].getMeasuredHeight() + dp2)) + 0.0f;
        if (stargiftattributebackdropArr[1] != null) {
            f10 = 24.0f;
        } else {
            f10 = 10.0f;
        }
        int dp3 = AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f10);
        float a10 = (this.V.a(2) * (linearLayoutArr[2].getMeasuredHeight() + AndroidUtilities.dp(64.0f))) + (this.V.a(1) * (linearLayoutArr[1].getMeasuredHeight() + dp3)) + a2;
        if (stargiftattributebackdropArr[0] != null) {
            f11 = 24.0f;
        }
        int dp4 = AndroidUtilities.dp(f11);
        float a11 = (this.V.a(3) * (linearLayoutArr[3].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + dp4)) + a10;
        d6 d6Var = this.M;
        if (d6Var.getMeasuredHeight() > 0) {
            dp = d6Var.getMeasuredHeight();
        } else {
            dp = AndroidUtilities.dp(550.0f);
        }
        return (this.V.a(4) * dp) + a11;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        int i10 = (this.f1235t0 > 0.5f ? 1 : (this.f1235t0 == 0.5f ? 0 : -1));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.W;
        if (i10 > 0) {
            return stargiftattributebackdropArr[2];
        }
        return stargiftattributebackdropArr[1];
    }

    public org.telegram.ui.Components.w9 getUpgradeImageView() {
        int i10 = (this.f1235t0 > 0.5f ? 1 : (this.f1235t0 == 0.5f ? 0 : -1));
        org.telegram.ui.Components.w9[] w9VarArr = this.d;
        if (i10 > 0) {
            return w9VarArr[2];
        }
        return w9VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        int i10 = (this.f1235t0 > 0.5f ? 1 : (this.f1235t0 == 0.5f ? 0 : -1));
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        if (i10 > 0) {
            return stargiftattributemodelArr[2];
        }
        return stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.f1230q0[1];
    }

    public final void h(int i10, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence3, TLObject tLObject, Spannable spannable) {
        int i11;
        int i12;
        this.f1231r[i10].setText(charSequence);
        FrameLayout frameLayout = this.f1240x;
        x90[] x90VarArr = this.f1242y;
        x90 x90Var = this.f1233s;
        TextView textView = this.v;
        int i13 = 0;
        if (i10 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            x90Var.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                x90VarArr[i10].setVisibility(8);
            }
        } else if (i10 == 0 && !TextUtils.isEmpty(charSequence3)) {
            x90Var.setText(charSequence3);
            x90Var.setVisibility(0);
            textView.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                x90VarArr[i10].setVisibility(8);
            }
        } else {
            x90VarArr[i10].setText(charSequence2);
            if (i10 == 0) {
                if (TextUtils.isEmpty(charSequence2)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                frameLayout.setVisibility(i12);
            } else {
                x90 x90Var2 = x90VarArr[i10];
                if (TextUtils.isEmpty(charSequence2)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                x90Var2.setVisibility(i11);
            }
            x90Var.setVisibility(8);
            textView.setVisibility(8);
        }
        yh.l0[] l0VarArr = this.F;
        yh.l0 l0Var = l0VarArr[i10];
        if (l0Var != null) {
            if (TextUtils.isEmpty(spannable)) {
                i13 = 8;
            }
            l0Var.setVisibility(i13);
            l0VarArr[i10].setUser(tLObject);
            l0VarArr[i10].setMessage(spannable);
        }
    }

    public final void i(int i10, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i10, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z10) {
        int i10;
        sa1 sa1Var = this.H;
        sa1Var.setVisibility(0);
        ah.v[] vVarArr = this.I;
        vVarArr[0].setAlpha(1.0f);
        vVarArr[0].c(R.drawable.filled_gift_send, LocaleController.getString(R.string.Gift2ActionTransfer), false);
        vVarArr[0].setOnClickListener(onClickListener);
        if (onClickListener2 != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ah.v vVar = this.J;
        vVar.setVisibility(i10);
        vVar.setOnClickListener(onClickListener2);
        vVarArr[1].c(R.drawable.filled_crown_on, LocaleController.getString(R.string.Gift2ActionWear), false);
        vVarArr[1].setOnClickListener(onClickListener3);
        ((LinearLayout.LayoutParams) vVarArr[1].getLayoutParams()).rightMargin = 0;
        setWalletDisplayed(z10);
        vVarArr[2].setVisibility(8);
        sa1Var.requestLayout();
    }

    public final void l() {
        this.f1221h0 = AndroidUtilities.dpf2(33.33f) / AndroidUtilities.dpf2(160.0f);
        FrameLayout frameLayout = this.f1212b;
        x90[] x90VarArr = this.f1231r;
        this.f1219f0 = ((((Math.min(x90VarArr[2].getPaint().measureText(x90VarArr[2].getText().toString()), x90VarArr[2].getWidth()) + x90VarArr[2].getWidth()) / 2.0f) + (x90VarArr[2].getX() + (-frameLayout.getLeft()))) + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(126.67f) / 2.0f);
        this.f1220g0 = (AndroidUtilities.dp(124.0f) + (-frameLayout.getTop())) - (AndroidUtilities.dp(126.67f) / 2.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.p5[] p5VarArr = this.f1232r0;
        p5VarArr[0].a();
        p5VarArr[1].a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.p5[] p5VarArr = this.f1232r0;
        p5VarArr[0].b();
        p5VarArr[1].b();
        AndroidUtilities.cancelRunOnUIThread(this.f1223j0);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.V.b(2)) {
            l();
            d(this.V);
        }
    }

    public void setPreviewAttributes(v1 v1Var) {
        g6 g6Var = this.V;
        if (g6Var != null && g6Var.f1365c == 1 && isAttachedToWindow()) {
            AndroidUtilities.cancelRunOnUIThread(this.f1223j0);
            ValueAnimator valueAnimator = this.f1222i0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f1222i0 = null;
            }
            int i10 = 1 - this.f1234s0;
            this.f1234s0 = i10;
            org.telegram.ui.Components.w9[] w9VarArr = this.d;
            uj0 lottieAnimation = w9VarArr[2 - i10].getImageReceiver().getLottieAnimation();
            uj0 lottieAnimation2 = w9VarArr[this.f1234s0 + 1].getImageReceiver().getLottieAnimation();
            if (lottieAnimation2 != null && lottieAnimation != null) {
                lottieAnimation2.T(lottieAnimation.t(), false);
            }
            int i11 = this.f1234s0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = v1Var.f2284a;
            this.W[i11] = stargiftattributebackdrop;
            e(i11, stargiftattributebackdrop);
            g(1, v1Var.f2285b, true);
            int i12 = this.f1234s0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = v1Var.f2286c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
            stargiftattributemodelArr[i12] = stargiftattributemodel;
            ld.a1(w9VarArr[i12].getImageReceiver(), stargiftattributemodelArr[this.f1234s0 + 1].document, 160);
            a();
            float f7 = this.f1234s0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
            this.f1222i0 = ofFloat;
            ofFloat.addUpdateListener(new a7(this, 0));
            this.f1222i0.addListener(new c7(this, 3));
            this.f1222i0.setDuration(320L);
            this.f1222i0.setInterpolator(bs.h);
            this.f1222i0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.f1211a0 = new a(fa.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.f1213b0 = new a(fa.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.f1215c0 = new a(fa.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.f1242y[1].setTextSize(1, 14.0f);
        this.H.setVisibility(8);
        this.f1235t0 = 0.0f;
        this.f1234s0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.f1213b0.c(), true);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        stargiftattributemodelArr[1] = (TL_stars.starGiftAttributeModel) this.f1211a0.c();
        org.telegram.ui.Components.w9[] w9VarArr = this.d;
        ld.a1(w9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, 160);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.f1215c0.c();
        this.W[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.f1211a0.f923f;
        ld.a1(w9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, 160);
        a3.d dVar = this.f1223j0;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 2500L);
        invalidate();
    }

    public void setResellPrice(ag.a aVar) {
        boolean z10;
        boolean k10 = aVar.k();
        this.N = !k10;
        x90[] x90VarArr = this.f1242y;
        TextView textView = this.O;
        if (!k10) {
            int i10 = R.string.GiftOnSale;
            if (aVar.f631a == ag.c.f636b) {
                z10 = true;
            } else {
                z10 = false;
            }
            textView.setText(LocaleController.formatSpannable(i10, ld.V0(z10, "⭐️ " + ((Object) ld.K0(aVar.o(), 1.0f, ',')), 0.9f, null, 0.0f, 1.0f)));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.W[0];
            textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(12.0f), i0.b.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.f1217e0 = true;
            ViewPropertyAnimator duration = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            bs bsVar = bs.h;
            duration.setInterpolator(bsVar).setListener(new c7(this, 0)).start();
            x90VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(bsVar).start();
        } else {
            ViewPropertyAnimator duration2 = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            bs bsVar2 = bs.h;
            duration2.setInterpolator(bsVar2).setListener(new c7(this, 2)).setListener(new c7(this, 1)).start();
            x90VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(bsVar2).start();
        }
        boolean z11 = this.N;
        ah.v[] vVarArr = this.I;
        if (z11) {
            vVarArr[2].c(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), true);
        } else {
            vVarArr[2].c(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), true);
        }
        vVarArr[2].setOnClickListener(this.T);
    }

    public void setWalletCard(boolean z10) {
        int i10;
        int i11;
        ah.v vVar = this.I[1];
        if (z10) {
            i10 = R.drawable.filled_card_remove;
        } else {
            i10 = R.drawable.filled_card_add;
        }
        if (z10) {
            i11 = R.string.WalletGiftRemoveFromCard;
        } else {
            i11 = R.string.WalletGiftAddToCard;
        }
        vVar.c(i10, LocaleController.getString(i11), false);
    }

    public void setWalletDisplayed(boolean z10) {
        float f7;
        ah.v vVar = this.I[1];
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        vVar.setAlpha(f7);
    }

    public void setWearPreview(TLObject tLObject) {
        String lowerCase;
        String str;
        String str2;
        if (tLObject instanceof TLRPC.User) {
            str2 = UserObject.getUserName((TLRPC.User) tLObject);
            str = LocaleController.getString(R.string.Online);
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str3 = chat.title;
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                int i10 = chat.participants_count;
                if (i10 > 1) {
                    lowerCase = LocaleController.formatPluralStringComma("Subscribers", i10);
                } else {
                    lowerCase = LocaleController.getString(R.string.DiscussChannel);
                }
            } else {
                int i11 = chat.participants_count;
                if (i11 > 1) {
                    lowerCase = LocaleController.formatPluralStringComma("Members", i11);
                } else {
                    lowerCase = LocaleController.getString(R.string.AccDescrGroup).toLowerCase();
                }
            }
            str = lowerCase;
            str2 = str3;
        } else {
            return;
        }
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.p(tLObject);
        this.L.e(tLObject, h9Var);
        this.f1231r[2].setText(str2);
        this.f1242y[2].setText(str);
        l();
        d(this.V);
    }

    public void k(int i10) {
    }
}
