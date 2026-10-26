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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.zq;
import org.telegram.ui.xa1;
public class b7 extends FrameLayout {
    public final int[] A0;
    public final int[] B0;
    public final int[] C0;
    public final LinearLayout.LayoutParams[] E;
    public final zh.k0[] F;
    public final TextPaint G;
    public final xa1 H;
    public final bh.p[] I;
    public final bh.p J;
    public final FrameLayout K;
    public final org.telegram.ui.Components.y9 L;
    public final z5 M;
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
    public final org.telegram.ui.ActionBar.u6 f4343a;
    public c6 f4344a0;
    public final FrameLayout f4345b;
    public final TL_stars.starGiftAttributeBackdrop[] f4346b0;
    public final r6 f4347c;
    public a f4348c0;
    public final org.telegram.ui.Components.y9[] d;
    public a f4349d0;
    public final TL_stars.starGiftAttributeModel[] e;
    public a f4350e0;
    public final LinearLayout[] f4351f;
    public boolean f4352f0;
    public boolean f4353g0;
    public final FrameLayout.LayoutParams[] h;
    public float f4354h0;
    public float f4355i0;
    public float f4356j0;
    public ValueAnimator f4357k0;
    public final u6 f4358l0;
    public final Paint[] m0;
    public final zh.h1 f4359n;
    public final RadialGradient[] f4360n0;
    public final Matrix[] f4361o0;
    public RadialGradient f4362p0;
    public final Matrix f4363q0;
    public final z90[] f4364r;
    public final Paint f4365r0;
    public final z90 f4366s;
    public final TL_stars.starGiftAttributePattern[] f4367s0;
    public final org.telegram.ui.Components.r5[] f4368t0;
    public int f4369u0;
    public final TextView v;
    public float f4370v0;
    public int f4371w;
    public float f4372w0;
    public final FrameLayout f4373x;
    public ValueAnimator f4374x0;
    public final z90[] f4375y;
    public final RectF f4376y0;
    public td f4377z0;

    public b7(Context context, org.telegram.ui.ActionBar.u6 u6Var, Runnable runnable, View.OnClickListener onClickListener, z1 z1Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f7;
        float f10;
        float f11;
        this.d = new org.telegram.ui.Components.y9[5];
        this.e = new TL_stars.starGiftAttributeModel[3];
        this.f4351f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.f4364r = new z90[5];
        this.f4375y = new z90[5];
        this.E = new LinearLayout.LayoutParams[5];
        this.F = new zh.k0[5];
        int i10 = 0;
        this.f4344a0 = new c6(0, 0);
        this.f4346b0 = new TL_stars.starGiftAttributeBackdrop[3];
        this.f4358l0 = new u6(this, 0);
        this.m0 = new Paint[3];
        this.f4360n0 = new RadialGradient[3];
        this.f4361o0 = new Matrix[3];
        this.f4363q0 = new Matrix();
        this.f4365r0 = new Paint(1);
        int i11 = 2;
        this.f4367s0 = new TL_stars.starGiftAttributePattern[2];
        this.f4368t0 = new org.telegram.ui.Components.r5[2];
        int i12 = 0;
        while (true) {
            Paint[] paintArr = this.m0;
            if (i12 >= paintArr.length) {
                break;
            }
            paintArr[i12] = new Paint(1);
            i12++;
        }
        int i13 = 0;
        while (true) {
            org.telegram.ui.Components.r5[] r5VarArr = this.f4368t0;
            f7 = 28.0f;
            if (i13 >= r5VarArr.length) {
                break;
            }
            r5VarArr[i13] = new org.telegram.ui.Components.r5(AndroidUtilities.dp(28.0f), this);
            i13++;
        }
        this.f4372w0 = 1.0f;
        this.f4376y0 = new RectF();
        this.A0 = new int[12];
        this.B0 = new int[12];
        this.C0 = new int[12];
        this.f4343a = u6Var;
        this.U = onClickListener4;
        this.V = onClickListener5;
        this.W = onClickListener6;
        setWillNotDraw(false);
        this.f4345b = new FrameLayout(context);
        int i14 = 0;
        while (true) {
            org.telegram.ui.Components.y9[] y9VarArr = this.d;
            float f12 = 0.0f;
            f10 = f7;
            if (i14 >= y9VarArr.length) {
                break;
            }
            y9VarArr[i14] = new y6(context, 0);
            this.d[i14].setLayerNum(6660);
            if (i14 > 0) {
                this.d[i14].getImageReceiver().setCrossfadeDuration(1);
            }
            this.f4345b.addView(this.d[i14], gb1.i(-1, -1, 119));
            org.telegram.ui.Components.y9 y9Var = this.d[i14];
            if (i14 == 0) {
                f12 = 1.0f;
            }
            y9Var.setAlpha(f12);
            i14++;
            f7 = f10;
        }
        z90 z90Var = new z90(context, null);
        this.f4366s = z90Var;
        z90Var.setTextSize(1, 12.0f);
        z90Var.setGravity(17);
        org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
        z90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setOnClickListener(new v6(this, 0));
        gb1.c(textView, 0.05f, 1.25f);
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
        gb1.b(textView2);
        xa1 xa1Var = new xa1(this, context, 2);
        this.H = xa1Var;
        xa1Var.setOrientation(0);
        this.I = new bh.p[3];
        int i15 = 0;
        while (true) {
            bh.p[] pVarArr = this.I;
            if (i15 >= pVarArr.length) {
                break;
            }
            pVarArr[i15] = new bh.p(context, 2);
            if (i15 == 0) {
                this.I[i15].c(R.drawable.filled_gift_send, LocaleController.getString(R.string.Gift2ActionTransfer), false);
                this.I[i15].setOnClickListener(onClickListener2);
            } else if (i15 == 1) {
                this.I[i15].c(R.drawable.filled_crown_on, LocaleController.getString(R.string.Gift2ActionWear), false);
                this.I[i15].setOnClickListener(onClickListener3);
            } else if (i15 == i11) {
                this.I[i15].c(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                this.I[i15].setOnClickListener(onClickListener4);
            }
            this.I[i15].setBackground(org.telegram.ui.ActionBar.y6.a0(0, 285212671, 16, 16));
            gb1.c(this.I[i15], 0.075f, 1.5f);
            xa1 xa1Var2 = this.H;
            bh.p[] pVarArr2 = this.I;
            xa1Var2.addView(pVarArr2[i15], gb1.t(0, 56, 1.0f, 119, 0, 0, i15 != pVarArr2.length - 1 ? 11 : 0, 0));
            i15++;
            i11 = 2;
        }
        bh.p pVar = new bh.p(context, 2);
        this.J = pVar;
        pVar.c(R.drawable.filled_card_color, LocaleController.getString(R.string.WalletGiftApplyColor), false);
        pVar.setBackground(org.telegram.ui.ActionBar.y6.a0(0, 285212671, 16, 16));
        gb1.c(pVar, 0.075f, 1.5f);
        pVar.setVisibility(8);
        this.H.addView(pVar, 1, gb1.t(0, 56, 1.0f, 119, 0, 0, 11, 0));
        this.f4373x = new FrameLayout(context);
        int i16 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f4351f;
            if (i16 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i16] = new LinearLayout(context);
            this.f4351f[i16].setOrientation(1);
            if (i16 == 2) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.K = frameLayout;
                this.f4351f[i16].addView(frameLayout, gb1.u(-1, 144, 119));
                org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
                this.L = y9Var2;
                y9Var2.setRoundRadius(AndroidUtilities.dp(41.0f));
                frameLayout.addView(y9Var2, gb1.h(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.f4364r[i16] = new z90(context, null);
                this.f4364r[i16].setTextColor(-1);
                this.f4364r[i16].setTextSize(1, 20.0f);
                this.f4364r[i16].setTypeface(AndroidUtilities.bold());
                this.f4364r[i16].setSingleLine();
                z90 z90Var2 = this.f4364r[i16];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                z90Var2.setEllipsize(truncateAt);
                this.f4364r[i16].setGravity(17);
                frameLayout.addView(this.f4364r[i16], gb1.h(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.f4375y[i16] = new z90(context, null);
                this.f4375y[i16].setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23464j5, u6Var));
                this.f4375y[i16].setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.f7.H(this.f4375y[i16], org.telegram.ui.ActionBar.y6.gc, u6Var);
                this.f4375y[i16].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.f4375y[i16].setDisablePaddingsOffsetY(true);
                this.f4375y[i16].setSingleLine();
                this.f4375y[i16].setGravity(17);
                this.f4375y[i16].setEllipsize(truncateAt);
                frameLayout.addView(this.f4375y[i16], gb1.h(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i16 == 4) {
                z5 z5Var = new z5(context, u6Var);
                this.M = z5Var;
                this.f4351f[i16].addView(z5Var, gb1.r(-1, -2));
                View view = this.f4351f[i16];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams h = gb1.h(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i16] = h;
                addView(view, h);
                i16++;
                i10 = 0;
            } else {
                this.f4364r[i16] = new z90(context, null);
                if (i16 == 3) {
                    this.f4364r[i16].setTextColor(-1);
                } else {
                    this.f4364r[i16].setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23464j5, u6Var));
                }
                this.f4364r[i16].setTextSize(1, 20.0f);
                this.f4364r[i16].setTypeface(AndroidUtilities.bold());
                this.f4364r[i16].setGravity(17);
                this.f4351f[i16].addView(this.f4364r[i16], gb1.x(-1, -2, 17, 24, i16 == 3 ? 10 : i10, 24, 0));
                if (i16 == 0) {
                    this.f4351f[i16].addView(this.f4366s, gb1.x(-2, -2, 17, 0, 4, 0, 4));
                    this.f4351f[i16].addView(this.v, gb1.w(-2, 17, 0, 6, 0, 19.33f, 2));
                }
                if (i16 == 0) {
                    this.f4375y[i16] = new z90(context, null);
                    if (i16 == 3) {
                        this.f4375y[i16].setTextColor(org.telegram.ui.ActionBar.y6.o1(0.75f, -1));
                    } else {
                        this.f4375y[i16].setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23464j5, u6Var));
                    }
                    this.f4375y[i16].setTextSize(1, 14.0f);
                    this.f4375y[i16].setGravity(17);
                    org.telegram.ui.ActionBar.f7.H(this.f4375y[i16], org.telegram.ui.ActionBar.y6.gc, u6Var);
                    this.f4375y[i16].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f4375y[i16].setDisablePaddingsOffsetY(true);
                    this.f4373x.addView(this.f4375y[i16], gb1.i(-2, -2, 17));
                    this.f4373x.addView(this.O, gb1.e(-2.0f, 20.33f, 17));
                    LinearLayout linearLayout = this.f4351f[i16];
                    FrameLayout frameLayout2 = this.f4373x;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
                    LinearLayout.LayoutParams x9 = gb1.x(-1, -2, 17, 24, 0, 24, i16 == 3 ? 6 : i10);
                    layoutParamsArr2[i16] = x9;
                    linearLayout.addView(frameLayout2, x9);
                } else {
                    this.f4375y[i16] = new z90(context, null);
                    if (i16 == 3) {
                        this.f4375y[i16].setTextColor(org.telegram.ui.ActionBar.y6.o1(0.75f, -1));
                    } else {
                        this.f4375y[i16].setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23464j5, u6Var));
                    }
                    this.f4375y[i16].setTextSize(1, 14.0f);
                    this.f4375y[i16].setGravity(17);
                    org.telegram.ui.ActionBar.f7.H(this.f4375y[i16], org.telegram.ui.ActionBar.y6.gc, u6Var);
                    this.f4375y[i16].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f4375y[i16].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout2 = this.f4351f[i16];
                    z90 z90Var3 = this.f4375y[i16];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.E;
                    LinearLayout.LayoutParams x10 = gb1.x(-1, -2, 17, 24, 0, 24, i16 == 3 ? 6 : i10);
                    layoutParamsArr3[i16] = x10;
                    linearLayout2.addView(z90Var3, x10);
                }
                LinearLayout.LayoutParams layoutParams = this.E[i16];
                if (i16 == 3) {
                    f11 = 6.0f;
                } else {
                    f11 = (i16 == 1 ? 7.33f : this.f4346b0[i10] == null ? 9.0f : 5.66f) - 4.0f;
                }
                layoutParams.topMargin = AndroidUtilities.dp(f11);
                this.F[i16] = new zh.k0(context);
                this.F[i16].setVisibility(8);
                this.F[i16].setPadding(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f));
                if (i16 == 0) {
                    this.G = this.F[i16].getTextPaint();
                }
                this.f4351f[i16].addView(this.F[i16], gb1.x(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i16 == 0) {
                this.f4351f[i16].addView(this.H, gb1.x(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f4351f[i16];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            ViewGroup.LayoutParams h10 = gb1.h(-1, -2.0f, 119, 16.0f, i16 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f);
            layoutParamsArr4[i16] = h10;
            addView(view2, h10);
            i16++;
            i10 = 0;
        }
        addView(this.f4345b, gb1.h(160, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        r6 r6Var = new r6(context);
        this.f4347c = r6Var;
        addView(r6Var, gb1.h(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.P = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(f10), 620756991));
        imageView.setImageResource(R.drawable.msg_close);
        gb1.b(imageView);
        addView(imageView, gb1.h(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView.setOnClickListener(new w6(0, runnable));
        imageView.setVisibility(8);
        ImageView imageView2 = new ImageView(context);
        this.Q = imageView2;
        imageView2.setImageResource(R.drawable.filled_forge);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        gb1.b(imageView2);
        if (z1Var != null) {
            addView(imageView2, gb1.h(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView2.setOnClickListener(z1Var);
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.R = imageView3;
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView3.setImageResource(R.drawable.media_more);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        gb1.b(imageView3);
        addView(imageView3, gb1.h(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView3.setOnClickListener(onClickListener);
        imageView3.setVisibility(8);
        zh.h1 h1Var = new zh.h1(context);
        this.f4359n = h1Var;
        h1Var.b(LocaleController.getString(R.string.GiftCrafted), true);
        zh.j1 j1Var = h1Var.f53023a;
        if (j1Var.v == null) {
            td tdVar = new td(2, 12);
            j1Var.v = tdVar;
            tdVar.h = 5.0f;
        }
        Path path = j1Var.f53071f;
        float f13 = j1Var.f53074s;
        j1Var.f53075w = true;
        zh.j1.d(path, f13, true);
        h1Var.setScaleX(1.2f);
        h1Var.setScaleY(1.2f);
        addView(h1Var, gb1.h(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        h1Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f4374x0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f4374x0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4374x0 = ofFloat;
        ofFloat.addUpdateListener(new x6(this, 1));
        this.f4374x0.addListener(new z6(this, 4));
        this.f4374x0.setDuration(320L);
        this.f4374x0.setInterpolator(ds.f27587g);
        this.f4374x0.start();
    }

    public final int b(Canvas canvas, float f7, float f10, float f11, float f12) {
        int i10 = this.f4369u0;
        RadialGradient[] radialGradientArr = this.f4360n0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f4346b0;
        Matrix[] matrixArr = this.f4361o0;
        Paint[] paintArr = this.m0;
        int i11 = 0;
        if (i10 == 0) {
            if (this.f4370v0 > 0.0f && stargiftattributebackdropArr[2] != null) {
                paintArr[2].setAlpha((int) (this.f4344a0.a(1) * 255.0f));
                matrixArr[2].reset();
                matrixArr[2].postTranslate(f7, f10);
                radialGradientArr[2].setLocalMatrix(matrixArr[2]);
                canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[2]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[2];
                i11 = i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
            }
            if (this.f4370v0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) ((1.0f - this.f4370v0) * this.f4344a0.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f7, f10);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                return i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[1].getAlpha()), i11);
            }
            return i11;
        }
        if (this.f4370v0 < 1.0f && stargiftattributebackdropArr[1] != null) {
            paintArr[1].setAlpha((int) (this.f4344a0.a(1) * 255.0f));
            matrixArr[1].reset();
            matrixArr[1].postTranslate(f7, f10);
            radialGradientArr[1].setLocalMatrix(matrixArr[1]);
            canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[1]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[1];
            i11 = i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
        }
        if (this.f4370v0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.f4344a0.a(1) * 255.0f * this.f4370v0));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f7, f10);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[2];
            return i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[2].getAlpha()), i11);
        }
        return i11;
    }

    public final void c(Canvas canvas, float f7, float f10, float f11, float f12) {
        int i10;
        canvas.save();
        canvas.translate(f7, f10);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f4346b0;
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
        int f13 = i0.a.f(this.f4370v0, i10, i11);
        org.telegram.ui.Components.r5[] r5VarArr = this.f4368t0;
        r5VarArr[1].k(Integer.valueOf(f13));
        l1.a(canvas, 0, r5VarArr[1], f11, f12, this.f4344a0.a(1), this.f4372w0);
        canvas.restore();
    }

    public void d(c6 c6Var) {
        View[] viewArr;
        float f7;
        float f10;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        z90[] z90VarArr;
        int f11;
        float max;
        float a2;
        int i12;
        int i13;
        int i14;
        boolean z12;
        float f12;
        int i15;
        int i16;
        float f13;
        float f14;
        int i17;
        int i18;
        this.f4344a0 = c6Var;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            viewArr = this.f4351f;
            if (i20 >= viewArr.length) {
                break;
            }
            float a10 = c6Var.a(i20);
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
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f4346b0;
        if (stargiftattributebackdropArr[0] != null) {
            f7 = c6Var.a(2);
        } else {
            f7 = 0.0f;
        }
        if (stargiftattributebackdropArr[1] != null) {
            f10 = c6Var.a(1);
        } else {
            f10 = 0.0f;
        }
        float max2 = Math.max(f7, f10);
        ImageView imageView = this.P;
        imageView.setAlpha(max2);
        if ((stargiftattributebackdropArr[0] != null && c6Var.f4432c == 2) || (stargiftattributebackdropArr[1] != null && c6Var.f4432c == 1)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        if (stargiftattributebackdropArr[0] == null && !this.S) {
            z10 = false;
        } else {
            z10 = true;
        }
        float a11 = c6Var.a(0);
        int i21 = c6Var.f4432c;
        float lerp = AndroidUtilities.lerp(false, z10, a11);
        ImageView imageView2 = this.R;
        imageView2.setAlpha(lerp);
        if (z10 && i21 == 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView2.setVisibility(i11);
        if (stargiftattributebackdropArr[0] != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.T;
        int i22 = -1;
        org.telegram.ui.ActionBar.u6 u6Var = this.f4343a;
        if (bool == null || bool.booleanValue() != z11) {
            this.T = Boolean.valueOf(z11);
            if (z11) {
                imageView2.clearColorFilter();
                imageView2.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
            } else {
                org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.J5, u6Var, PorterDuff.Mode.SRC_IN);
                int i23 = org.telegram.ui.ActionBar.y6.f23448i6;
                org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i23, u6Var), 1, -1);
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i23);
                imageView2.setBackground(g02);
                org.telegram.ui.ActionBar.f7.k(imageView2, g02, null, N, u6Var);
            }
        }
        if (!this.f4353g0) {
            float lerp2 = AndroidUtilities.lerp(false, this.N, c6Var.a(0));
            TextView textView = this.O;
            textView.setAlpha(lerp2);
            if (this.N) {
                f13 = 1.0f;
            } else {
                f13 = 0.4f;
            }
            textView.setScaleX(AndroidUtilities.lerp(0.4f, f13, c6Var.a(0)));
            if (this.N) {
                f14 = 1.0f;
            } else {
                f14 = 0.4f;
            }
            textView.setScaleY(AndroidUtilities.lerp(0.4f, f14, c6Var.a(0)));
            if (this.N && i21 == 0) {
                i17 = 0;
            } else {
                i17 = 4;
            }
            textView.setVisibility(i17);
        }
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23464j5, u6Var);
        int i24 = 0;
        while (true) {
            z90VarArr = this.f4375y;
            if (i24 >= 2) {
                break;
            }
            z90 z90Var = this.f4364r[i24];
            if (stargiftattributebackdropArr[Math.min(1, i24)] == null) {
                i13 = w02;
            } else {
                i13 = i22;
            }
            z90Var.setTextColor(i13);
            z90 z90Var2 = z90VarArr[i24];
            if (i24 != 0 && i24 != 2) {
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
                i14 = i0.a.f(this.f4370v0, i15, i16);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i24];
                if (stargiftattributebackdrop3 == null) {
                    i14 = w02;
                } else {
                    i14 = stargiftattributebackdrop3.text_color | (-16777216);
                }
            }
            z90Var2.setTextColor(i14);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[i24];
            FrameLayout.LayoutParams[] layoutParamsArr = this.h;
            if (stargiftattributebackdrop4 != null) {
                if (AndroidUtilities.dp(184.0f) == layoutParamsArr[i24].topMargin && viewArr[i24].getPaddingBottom() == AndroidUtilities.dp(18.0f)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    viewArr[i24].setPadding(0, 0, 0, AndroidUtilities.dp(18.0f));
                    layoutParamsArr[i24].topMargin = AndroidUtilities.dp(184.0f);
                }
            } else {
                if (AndroidUtilities.dp(170.0f) == layoutParamsArr[i24].topMargin && viewArr[i24].getPaddingBottom() == AndroidUtilities.dp(3.0f)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    viewArr[i24].setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                    layoutParamsArr[i24].topMargin = AndroidUtilities.dp(170.0f);
                }
            }
            LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
            LinearLayout.LayoutParams layoutParams = layoutParamsArr2[i24];
            if (i24 == 1) {
                f12 = 7.33f;
            } else if (stargiftattributebackdropArr[0] == null) {
                f12 = 9.0f;
            } else {
                f12 = 5.66f;
            }
            layoutParams.topMargin = AndroidUtilities.dp(f12 - 4.0f);
            if (z12) {
                viewArr[i24].setLayoutParams(layoutParamsArr[i24]);
                if (i24 == 0) {
                    this.f4373x.setLayoutParams(layoutParamsArr2[i24]);
                } else {
                    z90VarArr[i24].setLayoutParams(layoutParamsArr2[i24]);
                }
            }
            i24++;
            i22 = -1;
        }
        int dp = AndroidUtilities.dp(24.0f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop5 == null) {
            f11 = 553648127;
        } else {
            f11 = i0.a.f(0.25f, stargiftattributebackdrop5.edge_color | (-16777216), stargiftattributebackdrop5.pattern_color | (-16777216));
        }
        this.v.setBackground(org.telegram.ui.ActionBar.y6.c0(dp, f11));
        z90 z90Var3 = z90VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            w02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        z90Var3.setTextColor(w02);
        org.telegram.ui.Components.y9[] y9VarArr = this.d;
        org.telegram.ui.Components.y9 y9Var = y9VarArr[0];
        c6 c6Var2 = this.f4344a0;
        if (c6Var2.b(0) && c6Var2.b(2)) {
            max = 1.0f;
        } else {
            max = Math.max(c6Var2.a(0), c6Var2.a(2));
        }
        y9Var.setAlpha(Math.max(max, this.f4344a0.a(3)));
        y9VarArr[1].setAlpha((1.0f - this.f4370v0) * c6Var.a(1));
        y9VarArr[2].setAlpha(c6Var.a(1) * this.f4370v0);
        float lerp3 = AndroidUtilities.lerp(1.0f, this.f4356j0, c6Var.a(2));
        FrameLayout frameLayout = this.f4345b;
        frameLayout.setScaleX(lerp3);
        frameLayout.setScaleY(AndroidUtilities.lerp(1.0f, this.f4356j0, c6Var.a(2)));
        frameLayout.setTranslationX(c6Var.a(2) * this.f4354h0);
        frameLayout.setTranslationY((c6Var.a(2) * this.f4355i0) + (c6Var.a(1) * AndroidUtilities.dp(16.0f)));
        View view2 = viewArr[2];
        int i25 = c6Var.f4431b;
        if (i25 == 2 && i21 == 2) {
            a2 = 0.0f;
        } else {
            if (i25 != 2) {
                i21 = i25;
            }
            a2 = (1.0f - c6Var.a(2)) * (-(viewArr[i21].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view2.setTranslationY(a2);
        if (this.f4352f0 && this.f4344a0.b(0)) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        zh.h1 h1Var = this.f4359n;
        h1Var.setVisibility(i12);
        h1Var.setAlpha(this.f4344a0.a(0));
        if (c6Var.a(4) <= 0.0f) {
            i19 = 8;
        }
        z5 z5Var = this.M;
        z5Var.setVisibility(i19);
        z5Var.setAlpha(c6Var.a(4));
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
        b7 b7Var;
        Canvas canvas2;
        r6 r6Var;
        float max2;
        bh.p pVar;
        float realHeight = getRealHeight();
        canvas.save();
        float f13 = 0.0f;
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float f14 = 2.0f;
        float width = getWidth() / 2.0f;
        float dp = AndroidUtilities.dp(80.0f) + AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), this.f4344a0.a(1));
        c6 c6Var = this.f4344a0;
        if ((c6Var.b(0) && c6Var.b(2)) || ((c6Var.b(2) && c6Var.b(3)) || (c6Var.b(3) && c6Var.b(0)))) {
            max = 1.0f;
        } else {
            max = Math.max(c6Var.a(0), Math.max(c6Var.a(2), c6Var.a(3)));
        }
        int i11 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.f4346b0;
        if (i11 > 0 && stargiftattributebackdropArr2[0] != null) {
            if (this.f4362p0 != null && this.f4344a0.a(2) >= 1.0f) {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            } else {
                Paint[] paintArr = this.m0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.f4361o0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, dp);
                this.f4360n0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            }
            if (this.f4362p0 != null && this.f4344a0.a(2) > 0.0f) {
                Paint paint = this.f4365r0;
                paint.setAlpha((int) (this.f4344a0.a(2) * 255.0f));
                Matrix matrix = this.f4363q0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.f4362p0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        } else {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        }
        if (this.f4344a0.a(1) > 0.0f) {
            f7 = width;
            f10 = dp;
            k(b(canvas, f7, f10, getWidth(), realHeight));
        } else {
            f7 = width;
            f10 = dp;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
        int[] iArr4 = this.C0;
        int[] iArr5 = this.B0;
        int[] iArr6 = this.A0;
        if (stargiftattributebackdrop != null) {
            int i12 = 0;
            while (i12 < iArr6.length) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                iArr5[i12] = stargiftattributebackdrop2.text_color | (-16777216);
                iArr6[i12] = i0.a.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i12] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
                i12++;
                f13 = f13;
                f14 = f14;
            }
        }
        float f15 = f13;
        float f16 = f14;
        r6 r6Var2 = this.f4347c;
        if (r6Var2.f5342s == null && r6Var2.v == null && r6Var2.f5343w == null) {
            b7Var = this;
            f12 = f7;
            f11 = f10;
            iArr = iArr5;
            iArr2 = iArr6;
            i10 = 1;
            r6Var = r6Var2;
            iArr3 = iArr4;
            canvas2 = canvas;
        } else {
            float width2 = getWidth();
            float f17 = f7;
            l6 l6Var = r6Var2.f5342s;
            float f18 = f10;
            float f19 = r6Var2.f5344x;
            int[] iArr7 = this.B0;
            int[] iArr8 = this.A0;
            int[] iArr9 = this.C0;
            f11 = f18;
            iArr = iArr5;
            iArr2 = iArr6;
            f12 = f17;
            i10 = 1;
            iArr3 = iArr4;
            b7Var = this;
            canvas2 = canvas;
            r6Var2.a(canvas2, l6Var, f19, width2, realHeight, iArr7, iArr8, iArr9);
            r6Var2.a(canvas2, r6Var2.v, r6Var2.f5345y, width2, realHeight, iArr7, iArr8, iArr9);
            r6Var2.a(canvas2, r6Var2.f5343w, r6Var2.E, width2, realHeight, iArr7, iArr8, iArr9);
            r6Var = r6Var2;
            b7Var.invalidate();
        }
        if (i11 > 0 && stargiftattributebackdropArr[0] != null) {
            int i13 = iArr3[iArr3.length / 2];
            c6 c6Var2 = b7Var.f4344a0;
            if (c6Var2.b(0) && c6Var2.b(3)) {
                max2 = 1.0f;
            } else {
                max2 = Math.max(c6Var2.a(0), c6Var2.a(3));
            }
            int i14 = (max2 > f15 ? 1 : (max2 == f15 ? 0 : -1));
            org.telegram.ui.Components.r5[] r5VarArr = b7Var.f4368t0;
            if (i14 > 0) {
                canvas2.save();
                canvas2.translate(f12, f11);
                r5VarArr[0].k(Integer.valueOf(i13));
                l1.a(canvas, 0, r5VarArr[0], b7Var.getWidth(), realHeight, max2, 1.0f);
                realHeight = realHeight;
                canvas.restore();
            }
            if (b7Var.f4344a0.a(2) > f15) {
                canvas.save();
                r5VarArr[0].k(Integer.valueOf(i13));
                float f20 = realHeight;
                RectF rectF = AndroidUtilities.rectTmp;
                LinearLayout[] linearLayoutArr = b7Var.f4351f;
                float x9 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = b7Var.K;
                float x10 = frameLayout.getX() + x9;
                org.telegram.ui.Components.y9 y9Var = b7Var.L;
                rectF.set(y9Var.getX() + x10, y9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), y9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + y9Var.getWidth(), y9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + y9Var.getHeight());
                l1.c(canvas, r5VarArr[0], b7Var.getWidth(), f20 * 0.7f, 1.0f, rectF, b7Var.f4344a0.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            int i15 = 0;
            while (true) {
                bh.p[] pVarArr = b7Var.I;
                if (i15 > pVarArr.length) {
                    break;
                }
                if (i15 < pVarArr.length) {
                    pVar = pVarArr[i15];
                } else {
                    pVar = b7Var.J;
                }
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.y6.E1(pVar.getBackground(), iArr10[Utilities.clamp(Math.round((((pVar.getWidth() / f16) + pVar.getX()) / b7Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    pVar.invalidate();
                }
                i15++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i16 = iArr11[iArr11.length / 2];
            int i17 = iArr12[iArr12.length / 2];
            TextView textView = b7Var.v;
            if (textView != null && b7Var.f4371w != i16) {
                b7Var.f4371w = i16;
                textView.setTextColor(i16);
                org.telegram.ui.ActionBar.y6.E1(textView.getBackground(), i17, false);
            }
            if (r6Var.f5342s != null || r6Var.v != null || r6Var.f5343w != null) {
                b7Var.f4375y[0].setTextColor(i16);
            }
            if (b7Var.f4344a0.a(2) > f15) {
                if (b7Var.f4377z0 == null) {
                    b7Var.f4377z0 = new td(i10, 12);
                }
                FrameLayout frameLayout2 = b7Var.f4345b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / f16) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / f16;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / f16) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / f16;
                float f21 = measuredHeight + scaleY;
                RectF rectF2 = b7Var.f4376y0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f21);
                b7Var.f4377z0.g(rectF2);
                b7Var.f4377z0.d();
                b7Var.f4377z0.a(canvas2, org.telegram.ui.ActionBar.y6.o1(b7Var.f4344a0.a(2), -1));
                b7Var.invalidate();
            }
        }
        if (b7Var.f4344a0.a(1) > f15) {
            b7Var.c(canvas2, f12, f11, b7Var.getWidth(), b7Var.getRealHeight());
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
        RadialGradient[] radialGradientArr = this.f4360n0;
        radialGradientArr[i10] = radialGradient;
        if (i10 == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.f4362p0 = radialGradient2;
            this.f4365r0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.f4361o0;
        if (matrixArr[i10] == null) {
            matrixArr[i10] = new Matrix();
        }
        this.m0[i10].setShader(radialGradientArr[i10]);
    }

    public final void f(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        bg.b bVar;
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
        xa1 xa1Var = this.H;
        z90[] z90VarArr = this.f4375y;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f4346b0;
        if (z15) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) ca.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) ca.l(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            z90VarArr[0].setTextSize(1, 13.0f);
            if (z13) {
                i12 = 0;
            }
            xa1Var.setVisibility(i12);
            bh.p[] pVarArr = this.I;
            pVarArr[2].setVisibility(0);
            if (z13) {
                bh.p pVar = pVarArr[1];
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
                pVar.c(i10, LocaleController.getString(i11), false);
            }
            float f7 = 1.0f;
            if (starGift.resell_amount != null) {
                this.N = true;
                boolean z16 = starGift.resale_ton_only;
                bg.b bVar2 = bg.b.f3981b;
                if (z16) {
                    bVar = bVar2;
                } else {
                    bVar = bg.b.f3980a;
                }
                bg.a resellAmount = starGift.getResellAmount(bVar);
                int i13 = R.string.GiftOnSale;
                if (resellAmount.f3978a == bVar2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                CharSequence formatSpannable = LocaleController.formatSpannable(i13, dd.R0("⭐️ " + ((Object) dd.I0(resellAmount.o(), 1.0f, ',')), z14), Float.valueOf(0.9f));
                TextView textView = this.O;
                textView.setText(formatSpannable);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(12.0f), i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                if (h7.h2(UserConfig.selectedAccount, DialogObject.getPeerDialogId(starGift.owner_id))) {
                    textView.setOnClickListener(new v6(this, 1));
                    gb1.b(textView);
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                }
            }
            if (z10) {
                pVarArr[0].setAlpha(1.0f);
                pVarArr[0].c(R.drawable.filled_gift_send, LocaleController.getString(R.string.Gift2ActionTransfer), false);
            } else {
                pVarArr[0].setAlpha(0.5f);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                spannableStringBuilder.setSpan(new zq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTransfer));
                pVarArr[0].c(R.drawable.filled_gift_send, spannableStringBuilder, false);
            }
            bh.p pVar2 = pVarArr[1];
            if (!z10 && !z11) {
                f7 = 0.5f;
            }
            pVar2.setAlpha(f7);
            if (z10) {
                ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                View.OnClickListener onClickListener = this.V;
                if (arrayList != null) {
                    pVarArr[2].c(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), false);
                    pVarArr[2].setOnClickListener(onClickListener);
                } else {
                    pVarArr[2].c(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), false);
                    pVarArr[2].setOnClickListener(onClickListener);
                }
            } else {
                pVarArr[2].c(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                pVarArr[2].setOnClickListener(this.U);
            }
            this.f4352f0 = starGift.crafted;
            this.f4359n.f53023a.e(stargiftattributebackdropArr[0], false, true);
        } else {
            stargiftattributebackdropArr[0] = null;
            z90VarArr[0].setTextSize(1, 14.0f);
            this.f4352f0 = false;
            xa1Var.setVisibility(8);
        }
        e(0, stargiftattributebackdropArr[0]);
        dd.Z0(this.d[0].getImageReceiver(), starGift, 160);
        this.e[0] = (TL_stars.starGiftAttributeModel) ca.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        d(this.f4344a0);
    }

    public final void g(int i10, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z10) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.f4367s0;
            if (stargiftattributepatternArr[i10] != stargiftattributepattern) {
                stargiftattributepatternArr[i10] = stargiftattributepattern;
                this.f4368t0[i10].i(stargiftattributepattern.document, z10);
            }
        }
    }

    public int getFinalHeight() {
        int dp;
        int measuredHeight;
        boolean d = this.f4344a0.d(0);
        float f7 = 10.0f;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f4346b0;
        LinearLayout[] linearLayoutArr = this.f4351f;
        if (d) {
            if (stargiftattributebackdropArr[0] != null) {
                f7 = 24.0f;
            }
            return linearLayoutArr[0].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f7);
        } else if (this.f4344a0.d(1)) {
            if (stargiftattributebackdropArr[1] != null) {
                f7 = 24.0f;
            }
            return linearLayoutArr[1].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f7);
        } else {
            if (this.f4344a0.d(2)) {
                dp = AndroidUtilities.dp(64.0f);
                measuredHeight = linearLayoutArr[2].getMeasuredHeight();
            } else if (this.f4344a0.d(3)) {
                dp = AndroidUtilities.dp(160.0f);
                measuredHeight = linearLayoutArr[3].getMeasuredHeight();
            } else if (!this.f4344a0.d(4)) {
                return 0;
            } else {
                z5 z5Var = this.M;
                if (z5Var.getMeasuredHeight() > 0) {
                    return z5Var.getMeasuredHeight();
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
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f4346b0;
        float f11 = 10.0f;
        if (stargiftattributebackdropArr[0] != null) {
            f7 = 24.0f;
        } else {
            f7 = 10.0f;
        }
        int dp2 = AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f7);
        LinearLayout[] linearLayoutArr = this.f4351f;
        float a2 = (this.f4344a0.a(0) * (linearLayoutArr[0].getMeasuredHeight() + dp2)) + 0.0f;
        if (stargiftattributebackdropArr[1] != null) {
            f10 = 24.0f;
        } else {
            f10 = 10.0f;
        }
        int dp3 = AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f10);
        float a10 = (this.f4344a0.a(2) * (linearLayoutArr[2].getMeasuredHeight() + AndroidUtilities.dp(64.0f))) + (this.f4344a0.a(1) * (linearLayoutArr[1].getMeasuredHeight() + dp3)) + a2;
        if (stargiftattributebackdropArr[0] != null) {
            f11 = 24.0f;
        }
        int dp4 = AndroidUtilities.dp(f11);
        float a11 = (this.f4344a0.a(3) * (linearLayoutArr[3].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + dp4)) + a10;
        z5 z5Var = this.M;
        if (z5Var.getMeasuredHeight() > 0) {
            dp = z5Var.getMeasuredHeight();
        } else {
            dp = AndroidUtilities.dp(550.0f);
        }
        return (this.f4344a0.a(4) * dp) + a11;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        int i10 = (this.f4370v0 > 0.5f ? 1 : (this.f4370v0 == 0.5f ? 0 : -1));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f4346b0;
        if (i10 > 0) {
            return stargiftattributebackdropArr[2];
        }
        return stargiftattributebackdropArr[1];
    }

    public org.telegram.ui.Components.y9 getUpgradeImageView() {
        int i10 = (this.f4370v0 > 0.5f ? 1 : (this.f4370v0 == 0.5f ? 0 : -1));
        org.telegram.ui.Components.y9[] y9VarArr = this.d;
        if (i10 > 0) {
            return y9VarArr[2];
        }
        return y9VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        int i10 = (this.f4370v0 > 0.5f ? 1 : (this.f4370v0 == 0.5f ? 0 : -1));
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        if (i10 > 0) {
            return stargiftattributemodelArr[2];
        }
        return stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.f4367s0[1];
    }

    public final void h(int i10, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence3, TLObject tLObject, Spannable spannable) {
        int i11;
        int i12;
        this.f4364r[i10].setText(charSequence);
        FrameLayout frameLayout = this.f4373x;
        z90[] z90VarArr = this.f4375y;
        z90 z90Var = this.f4366s;
        TextView textView = this.v;
        int i13 = 0;
        if (i10 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            z90Var.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                z90VarArr[i10].setVisibility(8);
            }
        } else if (i10 == 0 && !TextUtils.isEmpty(charSequence3)) {
            z90Var.setText(charSequence3);
            z90Var.setVisibility(0);
            textView.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                z90VarArr[i10].setVisibility(8);
            }
        } else {
            z90VarArr[i10].setText(charSequence2);
            if (i10 == 0) {
                if (TextUtils.isEmpty(charSequence2)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                frameLayout.setVisibility(i12);
            } else {
                z90 z90Var2 = z90VarArr[i10];
                if (TextUtils.isEmpty(charSequence2)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                z90Var2.setVisibility(i11);
            }
            z90Var.setVisibility(8);
            textView.setVisibility(8);
        }
        zh.k0[] k0VarArr = this.F;
        zh.k0 k0Var = k0VarArr[i10];
        if (k0Var != null) {
            if (TextUtils.isEmpty(spannable)) {
                i13 = 8;
            }
            k0Var.setVisibility(i13);
            k0VarArr[i10].setUser(tLObject);
            k0VarArr[i10].setMessage(spannable);
        }
    }

    public final void i(int i10, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i10, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z10) {
        int i10;
        xa1 xa1Var = this.H;
        xa1Var.setVisibility(0);
        bh.p[] pVarArr = this.I;
        pVarArr[0].setAlpha(1.0f);
        pVarArr[0].c(R.drawable.filled_gift_send, LocaleController.getString(R.string.Gift2ActionTransfer), false);
        pVarArr[0].setOnClickListener(onClickListener);
        if (onClickListener2 != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        bh.p pVar = this.J;
        pVar.setVisibility(i10);
        pVar.setOnClickListener(onClickListener2);
        pVarArr[1].c(R.drawable.filled_crown_on, LocaleController.getString(R.string.Gift2ActionWear), false);
        pVarArr[1].setOnClickListener(onClickListener3);
        ((LinearLayout.LayoutParams) pVarArr[1].getLayoutParams()).rightMargin = 0;
        setWalletDisplayed(z10);
        pVarArr[2].setVisibility(8);
        xa1Var.requestLayout();
    }

    public final void l() {
        z90[] z90VarArr;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        z90 z90Var;
        int i10;
        int i11;
        int i12;
        int i13;
        z90[] z90VarArr2 = this.f4364r;
        if (z90VarArr2 != null && (z90VarArr = this.f4375y) != null && (stargiftattributebackdropArr = this.f4346b0) != null) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23464j5, this.f4343a);
            for (int i14 = 0; i14 < 2; i14++) {
                z90 z90Var2 = z90VarArr2[i14];
                if (z90Var2 != null && z90VarArr[i14] != null) {
                    if (stargiftattributebackdropArr[Math.min(1, i14)] == null) {
                        i10 = w02;
                    } else {
                        i10 = -1;
                    }
                    z90Var2.setTextColor(i10);
                    z90 z90Var3 = z90VarArr[i14];
                    if (i14 != 0 && i14 != 2) {
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                        if (stargiftattributebackdrop == null) {
                            i12 = w02;
                        } else {
                            i12 = stargiftattributebackdrop.text_color | (-16777216);
                        }
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
                        if (stargiftattributebackdrop2 == null) {
                            i13 = w02;
                        } else {
                            i13 = (-16777216) | stargiftattributebackdrop2.text_color;
                        }
                        i11 = i0.a.f(this.f4370v0, i12, i13);
                    } else {
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i14];
                        if (stargiftattributebackdrop3 == null) {
                            i11 = w02;
                        } else {
                            i11 = (-16777216) | stargiftattributebackdrop3.text_color;
                        }
                    }
                    z90Var3.setTextColor(i11);
                }
            }
            if (z90VarArr.length > 2 && (z90Var = z90VarArr[2]) != null) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[0];
                if (stargiftattributebackdrop4 != null) {
                    w02 = stargiftattributebackdrop4.text_color | (-16777216);
                }
                z90Var.setTextColor(w02);
            }
        }
    }

    public final void m() {
        this.f4356j0 = AndroidUtilities.dpf2(33.33f) / AndroidUtilities.dpf2(160.0f);
        FrameLayout frameLayout = this.f4345b;
        z90[] z90VarArr = this.f4364r;
        this.f4354h0 = ((((Math.min(z90VarArr[2].getPaint().measureText(z90VarArr[2].getText().toString()), z90VarArr[2].getWidth()) + z90VarArr[2].getWidth()) / 2.0f) + (z90VarArr[2].getX() + (-frameLayout.getLeft()))) + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(126.67f) / 2.0f);
        this.f4355i0 = (AndroidUtilities.dp(124.0f) + (-frameLayout.getTop())) - (AndroidUtilities.dp(126.67f) / 2.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.r5[] r5VarArr = this.f4368t0;
        r5VarArr[0].a();
        r5VarArr[1].a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.r5[] r5VarArr = this.f4368t0;
        r5VarArr[0].b();
        r5VarArr[1].b();
        AndroidUtilities.cancelRunOnUIThread(this.f4358l0);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f4344a0.b(2)) {
            m();
            d(this.f4344a0);
        }
    }

    public void setPreviewAttributes(s1 s1Var) {
        c6 c6Var = this.f4344a0;
        if (c6Var != null && c6Var.f4432c == 1 && isAttachedToWindow()) {
            AndroidUtilities.cancelRunOnUIThread(this.f4358l0);
            ValueAnimator valueAnimator = this.f4357k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f4357k0 = null;
            }
            int i10 = 1 - this.f4369u0;
            this.f4369u0 = i10;
            org.telegram.ui.Components.y9[] y9VarArr = this.d;
            xj0 lottieAnimation = y9VarArr[2 - i10].getImageReceiver().getLottieAnimation();
            xj0 lottieAnimation2 = y9VarArr[this.f4369u0 + 1].getImageReceiver().getLottieAnimation();
            if (lottieAnimation2 != null && lottieAnimation != null) {
                lottieAnimation2.T(lottieAnimation.t(), false);
            }
            int i11 = this.f4369u0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = s1Var.f5384a;
            this.f4346b0[i11] = stargiftattributebackdrop;
            e(i11, stargiftattributebackdrop);
            g(1, s1Var.f5385b, true);
            int i12 = this.f4369u0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = s1Var.f5386c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
            stargiftattributemodelArr[i12] = stargiftattributemodel;
            dd.Y0(y9VarArr[i12].getImageReceiver(), stargiftattributemodelArr[this.f4369u0 + 1].document, 160);
            a();
            float f7 = this.f4369u0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
            this.f4357k0 = ofFloat;
            ofFloat.addUpdateListener(new x6(this, 0));
            this.f4357k0.addListener(new z6(this, 3));
            this.f4357k0.setDuration(320L);
            this.f4357k0.setInterpolator(ds.h);
            this.f4357k0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.f4348c0 = new a(ca.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.f4349d0 = new a(ca.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.f4350e0 = new a(ca.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.f4375y[1].setTextSize(1, 14.0f);
        this.H.setVisibility(8);
        this.f4370v0 = 0.0f;
        this.f4369u0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.f4349d0.c(), true);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        stargiftattributemodelArr[1] = (TL_stars.starGiftAttributeModel) this.f4348c0.c();
        org.telegram.ui.Components.y9[] y9VarArr = this.d;
        dd.Y0(y9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, 160);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.f4350e0.c();
        this.f4346b0[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.f4348c0.f4245f;
        dd.Y0(y9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, 160);
        u6 u6Var = this.f4358l0;
        AndroidUtilities.cancelRunOnUIThread(u6Var);
        AndroidUtilities.runOnUIThread(u6Var, 2500L);
        invalidate();
    }

    public void setResellPrice(bg.a aVar) {
        boolean z10;
        boolean k10 = aVar.k();
        this.N = !k10;
        z90[] z90VarArr = this.f4375y;
        TextView textView = this.O;
        if (!k10) {
            int i10 = R.string.GiftOnSale;
            if (aVar.f3978a == bg.b.f3981b) {
                z10 = true;
            } else {
                z10 = false;
            }
            textView.setText(LocaleController.formatSpannable(i10, dd.T0(z10, "⭐️ " + ((Object) dd.I0(aVar.o(), 1.0f, ',')), 0.9f, null, 0.0f, 1.0f)));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f4346b0[0];
            textView.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(12.0f), i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.f4353g0 = true;
            ViewPropertyAnimator duration = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            ds dsVar = ds.h;
            duration.setInterpolator(dsVar).setListener(new z6(this, 0)).start();
            z90VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(dsVar).start();
        } else {
            ViewPropertyAnimator duration2 = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            ds dsVar2 = ds.h;
            duration2.setInterpolator(dsVar2).setListener(new z6(this, 2)).setListener(new z6(this, 1)).start();
            z90VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(dsVar2).start();
        }
        boolean z11 = this.N;
        bh.p[] pVarArr = this.I;
        if (z11) {
            pVarArr[2].c(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), true);
        } else {
            pVarArr[2].c(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), true);
        }
        pVarArr[2].setOnClickListener(this.V);
    }

    public void setShowOptions(boolean z10) {
        this.S = z10;
        d(this.f4344a0);
    }

    public void setWalletCard(boolean z10) {
        int i10;
        int i11;
        bh.p pVar = this.I[1];
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
        pVar.c(i10, LocaleController.getString(i11), false);
    }

    public void setWalletDisplayed(boolean z10) {
        float f7;
        bh.p pVar = this.I[1];
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        pVar.setAlpha(f7);
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
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.p(tLObject);
        this.L.f(tLObject, j9Var);
        this.f4364r[2].setText(str2);
        this.f4375y[2].setText(str);
        m();
        d(this.f4344a0);
    }

    public void k(int i10) {
    }
}
