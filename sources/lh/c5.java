package lh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mr;
import org.telegram.ui.pb1;
public class c5 extends FrameLayout {
    public final LinearLayout.LayoutParams[] B;
    public final kh.w0[] C;
    public final TextPaint D;
    public final pb1 E;
    public final ah.e[] F;
    public final FrameLayout G;
    public final org.telegram.ui.Components.p9 H;
    public final f4 I;
    public boolean J;
    public final TextView K;
    public final ImageView L;
    public final ImageView M;
    public final ImageView N;
    public final View.OnClickListener O;
    public final View.OnClickListener P;
    public final View.OnClickListener Q;
    public c5.d R;
    public final TL_stars.starGiftAttributeBackdrop[] S;
    public com.google.android.gms.common.api.internal.r T;
    public com.google.android.gms.common.api.internal.r U;
    public com.google.android.gms.common.api.internal.r V;
    public boolean W;
    public final org.telegram.ui.ActionBar.f6 f12197a;
    public boolean f12198a0;
    public final FrameLayout f12199b;
    public float f12200b0;
    public final u4 f12201c;
    public float f12202c0;
    public final org.telegram.ui.Components.p9[] d;
    public float f12203d0;
    public final TL_stars.starGiftAttributeModel[] e;
    public ValueAnimator f12204e0;
    public final LinearLayout[] f12205f;
    public final b f12206f0;
    public final Paint[] f12207g0;
    public final FrameLayout.LayoutParams[] h;
    public final RadialGradient[] f12208h0;
    public final Matrix[] f12209i0;
    public RadialGradient f12210j0;
    public final Matrix f12211k0;
    public final Paint f12212l0;
    public final TL_stars.starGiftAttributePattern[] m0;
    public final kh.y1 f12213n;
    public final org.telegram.ui.Components.j5[] f12214n0;
    public int f12215o0;
    public float f12216p0;
    public float f12217q0;
    public final f90[] f12218r;
    public ValueAnimator f12219r0;
    public final f90 f12220s;
    public final RectF f12221s0;
    public wa f12222t0;
    public final int[] f12223u0;
    public final TextView v;
    public final int[] f12224v0;
    public int f12225w;
    public final int[] f12226w0;
    public final FrameLayout f12227x;
    public final f90[] f12228y;

    public c5(Context context, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable, View.OnClickListener onClickListener, l1 l1Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f10;
        this.d = new org.telegram.ui.Components.p9[5];
        this.e = new TL_stars.starGiftAttributeModel[3];
        this.f12205f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.f12218r = new f90[5];
        this.f12228y = new f90[5];
        this.B = new LinearLayout.LayoutParams[5];
        this.C = new kh.w0[5];
        this.R = new c5.d(0, 0);
        this.S = new TL_stars.starGiftAttributeBackdrop[3];
        this.f12206f0 = new b(this, 11);
        this.f12207g0 = new Paint[3];
        this.f12208h0 = new RadialGradient[3];
        this.f12209i0 = new Matrix[3];
        this.f12211k0 = new Matrix();
        this.f12212l0 = new Paint(1);
        this.m0 = new TL_stars.starGiftAttributePattern[2];
        this.f12214n0 = new org.telegram.ui.Components.j5[2];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f12207g0;
            if (i10 >= paintArr.length) {
                break;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.j5[] j5VarArr = this.f12214n0;
            if (i11 >= j5VarArr.length) {
                break;
            }
            j5VarArr[i11] = new org.telegram.ui.Components.j5(AndroidUtilities.dp(28.0f), this);
            i11++;
        }
        this.f12217q0 = 1.0f;
        this.f12221s0 = new RectF();
        this.f12223u0 = new int[12];
        this.f12224v0 = new int[12];
        this.f12226w0 = new int[12];
        this.f12197a = f6Var;
        this.O = onClickListener4;
        this.P = onClickListener5;
        this.Q = onClickListener6;
        setWillNotDraw(false);
        this.f12199b = new FrameLayout(context);
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.p9[] p9VarArr = this.d;
            float f11 = 0.0f;
            if (i12 >= p9VarArr.length) {
                break;
            }
            p9VarArr[i12] = new z4(context, 0);
            this.d[i12].setLayerNum(6660);
            if (i12 > 0) {
                this.d[i12].getImageReceiver().setCrossfadeDuration(1);
            }
            this.f12199b.addView(this.d[i12], k7.b6.e(-1, -1, 119));
            org.telegram.ui.Components.p9 p9Var = this.d[i12];
            if (i12 == 0) {
                f11 = 1.0f;
            }
            p9Var.setAlpha(f11);
            i12++;
        }
        f90 f90Var = new f90(context, null);
        this.f12220s = f90Var;
        f90Var.setTextSize(1, 12.0f);
        f90Var.setGravity(17);
        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19941gc, f6Var));
        f90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setOnClickListener(new x4(this, 0));
        k7.d6.b(textView, 0.05f, 1.25f);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setLinkTextColor(-1);
        textView.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        TextView textView2 = new TextView(context);
        this.K = textView2;
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.4f);
        textView2.setScaleY(0.4f);
        textView2.setVisibility(8);
        textView2.setGravity(17);
        k7.d6.a(textView2);
        pb1 pb1Var = new pb1(this, context, 3);
        this.E = pb1Var;
        pb1Var.setOrientation(0);
        this.F = new ah.e[3];
        int i13 = 0;
        while (true) {
            ah.e[] eVarArr = this.F;
            if (i13 >= eVarArr.length) {
                break;
            }
            ah.e eVar = new ah.e(context, 4);
            ImageView imageView = new ImageView(context);
            eVar.f212b = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            eVar.addView(imageView, k7.b6.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
            TextView textView3 = new TextView(context);
            eVar.f213c = textView3;
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextSize(1, 12.0f);
            textView3.setTextColor(-1);
            textView3.setGravity(17);
            eVar.addView(textView3, k7.b6.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
            eVarArr[i13] = eVar;
            if (i13 == 0) {
                this.F[i13].b(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
                this.F[i13].setOnClickListener(onClickListener2);
            } else if (i13 == 1) {
                this.F[i13].b(R.drawable.filled_crown_on, LocaleController.getString(R.string.Gift2ActionWear), false);
                this.F[i13].setOnClickListener(onClickListener3);
            } else if (i13 == 2) {
                this.F[i13].b(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                this.F[i13].setOnClickListener(onClickListener4);
            }
            this.F[i13].setBackground(org.telegram.ui.ActionBar.j6.Z(0, 285212671, 16, 16));
            k7.d6.b(this.F[i13], 0.075f, 1.5f);
            pb1 pb1Var2 = this.E;
            ah.e[] eVarArr2 = this.F;
            pb1Var2.addView(eVarArr2[i13], k7.b6.p(0, 56, 1.0f, 119, 0, 0, i13 != eVarArr2.length - 1 ? 11 : 0, 0));
            i13++;
        }
        this.f12227x = new FrameLayout(context);
        int i14 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f12205f;
            if (i14 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i14] = new LinearLayout(context);
            this.f12205f[i14].setOrientation(1);
            if (i14 == 2) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.G = frameLayout;
                this.f12205f[i14].addView(frameLayout, k7.b6.q(-1, 144, 119));
                org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
                this.H = p9Var2;
                p9Var2.setRoundRadius(AndroidUtilities.dp(41.0f));
                frameLayout.addView(p9Var2, k7.b6.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.f12218r[i14] = new f90(context, null);
                this.f12218r[i14].setTextColor(-1);
                this.f12218r[i14].setTextSize(1, 20.0f);
                this.f12218r[i14].setTypeface(AndroidUtilities.bold());
                this.f12218r[i14].setSingleLine();
                f90 f90Var2 = this.f12218r[i14];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                f90Var2.setEllipsize(truncateAt);
                this.f12218r[i14].setGravity(17);
                frameLayout.addView(this.f12218r[i14], k7.b6.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.f12228y[i14] = new f90(context, null);
                this.f12228y[i14].setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19987j5, f6Var));
                this.f12228y[i14].setTextSize(1, 14.0f);
                this.f12228y[i14].setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19941gc, f6Var));
                this.f12228y[i14].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.f12228y[i14].setDisablePaddingsOffsetY(true);
                this.f12228y[i14].setSingleLine();
                this.f12228y[i14].setGravity(17);
                this.f12228y[i14].setEllipsize(truncateAt);
                frameLayout.addView(this.f12228y[i14], k7.b6.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i14 == 4) {
                f4 f4Var = new f4(context, f6Var);
                this.I = f4Var;
                this.f12205f[i14].addView(f4Var, k7.b6.n(-1, -2));
                View view = this.f12205f[i14];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = k7.b6.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i14] = d;
                addView(view, d);
                i14++;
            } else {
                this.f12218r[i14] = new f90(context, null);
                this.f12218r[i14].setTextColor(i14 == 3 ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19987j5, f6Var));
                this.f12218r[i14].setTextSize(1, 20.0f);
                this.f12218r[i14].setTypeface(AndroidUtilities.bold());
                this.f12218r[i14].setGravity(17);
                this.f12205f[i14].addView(this.f12218r[i14], k7.b6.t(-1, -2, 17, 24, i14 == 3 ? 10 : 0, 24, 0));
                if (i14 == 0) {
                    this.f12205f[i14].addView(this.f12220s, k7.b6.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f12205f[i14].addView(this.v, k7.b6.s(-2, 17, 0, 6, 0, 19.33f, 2));
                }
                if (i14 == 0) {
                    this.f12228y[i14] = new f90(context, null);
                    this.f12228y[i14].setTextColor(i14 == 3 ? org.telegram.ui.ActionBar.j6.l1(0.75f, -1) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19987j5, f6Var));
                    this.f12228y[i14].setTextSize(1, 14.0f);
                    this.f12228y[i14].setGravity(17);
                    this.f12228y[i14].setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19941gc, f6Var));
                    this.f12228y[i14].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f12228y[i14].setDisablePaddingsOffsetY(true);
                    this.f12227x.addView(this.f12228y[i14], k7.b6.e(-2, -2, 17));
                    this.f12227x.addView(this.K, k7.b6.a(-2.0f, 20.33f, 17));
                    LinearLayout linearLayout = this.f12205f[i14];
                    FrameLayout frameLayout2 = this.f12227x;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.B;
                    LinearLayout.LayoutParams t6 = k7.b6.t(-1, -2, 17, 24, 0, 24, i14 == 3 ? 6 : 0);
                    layoutParamsArr2[i14] = t6;
                    linearLayout.addView(frameLayout2, t6);
                } else {
                    this.f12228y[i14] = new f90(context, null);
                    this.f12228y[i14].setTextColor(i14 == 3 ? org.telegram.ui.ActionBar.j6.l1(0.75f, -1) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19987j5, f6Var));
                    this.f12228y[i14].setTextSize(1, 14.0f);
                    this.f12228y[i14].setGravity(17);
                    this.f12228y[i14].setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19941gc, f6Var));
                    this.f12228y[i14].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f12228y[i14].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout2 = this.f12205f[i14];
                    f90 f90Var3 = this.f12228y[i14];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.B;
                    LinearLayout.LayoutParams t9 = k7.b6.t(-1, -2, 17, 24, 0, 24, i14 == 3 ? 6 : 0);
                    layoutParamsArr3[i14] = t9;
                    linearLayout2.addView(f90Var3, t9);
                }
                LinearLayout.LayoutParams layoutParams = this.B[i14];
                if (i14 == 3) {
                    f10 = 6.0f;
                } else {
                    f10 = (i14 == 1 ? 7.33f : this.S[0] == null ? 9.0f : 5.66f) - 4.0f;
                }
                layoutParams.topMargin = AndroidUtilities.dp(f10);
                this.C[i14] = new kh.w0(context);
                this.C[i14].setVisibility(8);
                this.C[i14].setPadding(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f));
                if (i14 == 0) {
                    this.D = this.C[i14].getTextPaint();
                }
                this.f12205f[i14].addView(this.C[i14], k7.b6.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i14 == 0) {
                this.f12205f[i14].addView(this.E, k7.b6.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f12205f[i14];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            ViewGroup.LayoutParams d10 = k7.b6.d(-1, -2.0f, 119, 16.0f, i14 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f);
            layoutParamsArr4[i14] = d10;
            addView(view2, d10);
            i14++;
        }
        addView(this.f12199b, k7.b6.d(160, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        u4 u4Var = new u4(context);
        this.f12201c = u4Var;
        addView(u4Var, k7.b6.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.L = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(28.0f), 620756991));
        imageView2.setImageResource(R.drawable.msg_close);
        k7.d6.a(imageView2);
        addView(imageView2, k7.b6.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView2.setOnClickListener(new ig.u(2, runnable));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.M = imageView3;
        imageView3.setImageResource(R.drawable.filled_forge);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        k7.d6.a(imageView3);
        if (l1Var != null) {
            addView(imageView3, k7.b6.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView3.setOnClickListener(l1Var);
        }
        imageView3.setVisibility(8);
        ImageView imageView4 = new ImageView(context);
        this.N = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView4.setImageResource(R.drawable.media_more);
        imageView4.setScaleType(scaleType);
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        k7.d6.a(imageView4);
        addView(imageView4, k7.b6.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView4.setOnClickListener(onClickListener);
        imageView4.setVisibility(8);
        kh.y1 y1Var = new kh.y1(context);
        this.f12213n = y1Var;
        y1Var.b(LocaleController.getString(R.string.GiftCrafted), true);
        kh.a2 a2Var = y1Var.f11067a;
        if (a2Var.f10572f == null) {
            wa waVar = new wa(2, 12);
            a2Var.f10572f = waVar;
            waVar.h = 5.0f;
        }
        Path path = a2Var.f10571c;
        float f12 = a2Var.e;
        a2Var.f10573g = true;
        kh.a2.c(path, f12, true);
        y1Var.setScaleX(1.2f);
        y1Var.setScaleY(1.2f);
        addView(y1Var, k7.b6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        y1Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f12219r0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12219r0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f12219r0 = ofFloat;
        ofFloat.addUpdateListener(new y4(this, 1));
        this.f12219r0.addListener(new a5(this, 4));
        this.f12219r0.setDuration(320L);
        this.f12219r0.setInterpolator(mr.f27123g);
        this.f12219r0.start();
    }

    public final int b(Canvas canvas, float f10, float f11, float f12, float f13) {
        int i10 = this.f12215o0;
        RadialGradient[] radialGradientArr = this.f12208h0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.S;
        Matrix[] matrixArr = this.f12209i0;
        Paint[] paintArr = this.f12207g0;
        int i11 = 0;
        if (i10 == 0) {
            if (this.f12216p0 > 0.0f && stargiftattributebackdropArr[2] != null) {
                paintArr[2].setAlpha((int) (this.R.a(1) * 255.0f));
                matrixArr[2].reset();
                matrixArr[2].postTranslate(f10, f11);
                radialGradientArr[2].setLocalMatrix(matrixArr[2]);
                canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[2]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[2];
                i11 = i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
            }
            if (this.f12216p0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) ((1.0f - this.f12216p0) * this.R.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f10, f11);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                return i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[1].getAlpha()), i11);
            }
            return i11;
        }
        if (this.f12216p0 < 1.0f && stargiftattributebackdropArr[1] != null) {
            paintArr[1].setAlpha((int) (this.R.a(1) * 255.0f));
            matrixArr[1].reset();
            matrixArr[1].postTranslate(f10, f11);
            radialGradientArr[1].setLocalMatrix(matrixArr[1]);
            canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[1]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[1];
            i11 = i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
        }
        if (this.f12216p0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.R.a(1) * 255.0f * this.f12216p0));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f10, f11);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[2];
            return i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[2].getAlpha()), i11);
        }
        return i11;
    }

    public final void c(Canvas canvas, float f10, float f11, float f12, float f13) {
        int i10;
        canvas.save();
        canvas.translate(f10, f11);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.S;
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
        int d = i0.a.d(this.f12216p0, i10, i11);
        org.telegram.ui.Components.j5[] j5VarArr = this.f12214n0;
        j5VarArr[1].k(Integer.valueOf(d));
        x0.a(canvas, 0, j5VarArr[1], f12, f13, this.R.a(1), this.f12217q0);
        canvas.restore();
    }

    public void d(c5.d dVar) {
        View[] viewArr;
        float f10;
        float f11;
        int i10;
        boolean z4;
        int i11;
        f90[] f90VarArr;
        int d;
        float max;
        float a2;
        int i12;
        int i13;
        int i14;
        boolean z10;
        float f12;
        int i15;
        int i16;
        float f13;
        float f14;
        int i17;
        int i18;
        this.R = dVar;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            viewArr = this.f12205f;
            if (i20 >= viewArr.length) {
                break;
            }
            float a10 = dVar.a(i20);
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
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.S;
        if (stargiftattributebackdropArr[0] != null) {
            f10 = dVar.a(2);
        } else {
            f10 = 0.0f;
        }
        if (stargiftattributebackdropArr[1] != null) {
            f11 = dVar.a(1);
        } else {
            f11 = 0.0f;
        }
        float max2 = Math.max(f10, f11);
        ImageView imageView = this.L;
        imageView.setAlpha(max2);
        if ((stargiftattributebackdropArr[0] != null && dVar.f2106b == 2) || (stargiftattributebackdropArr[1] != null && dVar.f2106b == 1)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        if (stargiftattributebackdropArr[0] != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        float a11 = dVar.a(0);
        int i21 = dVar.f2106b;
        float lerp = AndroidUtilities.lerp(false, z4, a11);
        ImageView imageView2 = this.N;
        imageView2.setAlpha(lerp);
        if (stargiftattributebackdropArr[0] != null && i21 == 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView2.setVisibility(i11);
        if (!this.f12198a0) {
            float lerp2 = AndroidUtilities.lerp(false, this.J, dVar.a(0));
            TextView textView = this.K;
            textView.setAlpha(lerp2);
            if (this.J) {
                f13 = 1.0f;
            } else {
                f13 = 0.4f;
            }
            textView.setScaleX(AndroidUtilities.lerp(0.4f, f13, dVar.a(0)));
            if (this.J) {
                f14 = 1.0f;
            } else {
                f14 = 0.4f;
            }
            textView.setScaleY(AndroidUtilities.lerp(0.4f, f14, dVar.a(0)));
            if (this.J && i21 == 0) {
                i17 = 0;
            } else {
                i17 = 4;
            }
            textView.setVisibility(i17);
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19987j5, this.f12197a);
        int i22 = 0;
        while (true) {
            f90VarArr = this.f12228y;
            if (i22 >= 2) {
                break;
            }
            f90 f90Var = this.f12218r[i22];
            if (stargiftattributebackdropArr[Math.min(1, i22)] == null) {
                i13 = v02;
            } else {
                i13 = -1;
            }
            f90Var.setTextColor(i13);
            f90 f90Var2 = f90VarArr[i22];
            if (i22 != 0 && i22 != 2) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                if (stargiftattributebackdrop == null) {
                    i15 = v02;
                } else {
                    i15 = stargiftattributebackdrop.text_color | (-16777216);
                }
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
                if (stargiftattributebackdrop2 == null) {
                    i16 = v02;
                } else {
                    i16 = stargiftattributebackdrop2.text_color | (-16777216);
                }
                i14 = i0.a.d(this.f12216p0, i15, i16);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i22];
                if (stargiftattributebackdrop3 == null) {
                    i14 = v02;
                } else {
                    i14 = stargiftattributebackdrop3.text_color | (-16777216);
                }
            }
            f90Var2.setTextColor(i14);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[i22];
            FrameLayout.LayoutParams[] layoutParamsArr = this.h;
            if (stargiftattributebackdrop4 != null) {
                if (AndroidUtilities.dp(184.0f) == layoutParamsArr[i22].topMargin && viewArr[i22].getPaddingBottom() == AndroidUtilities.dp(18.0f)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    viewArr[i22].setPadding(0, 0, 0, AndroidUtilities.dp(18.0f));
                    layoutParamsArr[i22].topMargin = AndroidUtilities.dp(184.0f);
                }
            } else {
                if (AndroidUtilities.dp(170.0f) == layoutParamsArr[i22].topMargin && viewArr[i22].getPaddingBottom() == AndroidUtilities.dp(3.0f)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    viewArr[i22].setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                    layoutParamsArr[i22].topMargin = AndroidUtilities.dp(170.0f);
                }
            }
            LinearLayout.LayoutParams[] layoutParamsArr2 = this.B;
            LinearLayout.LayoutParams layoutParams = layoutParamsArr2[i22];
            if (i22 == 1) {
                f12 = 7.33f;
            } else if (stargiftattributebackdropArr[0] == null) {
                f12 = 9.0f;
            } else {
                f12 = 5.66f;
            }
            layoutParams.topMargin = AndroidUtilities.dp(f12 - 4.0f);
            if (z10) {
                viewArr[i22].setLayoutParams(layoutParamsArr[i22]);
                if (i22 == 0) {
                    this.f12227x.setLayoutParams(layoutParamsArr2[i22]);
                } else {
                    f90VarArr[i22].setLayoutParams(layoutParamsArr2[i22]);
                }
            }
            i22++;
        }
        int dp = AndroidUtilities.dp(24.0f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop5 == null) {
            d = 553648127;
        } else {
            d = i0.a.d(0.25f, stargiftattributebackdrop5.edge_color | (-16777216), stargiftattributebackdrop5.pattern_color | (-16777216));
        }
        this.v.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, d));
        f90 f90Var3 = f90VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            v02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        f90Var3.setTextColor(v02);
        org.telegram.ui.Components.p9[] p9VarArr = this.d;
        org.telegram.ui.Components.p9 p9Var = p9VarArr[0];
        c5.d dVar2 = this.R;
        if (dVar2.b(0) && dVar2.b(2)) {
            max = 1.0f;
        } else {
            max = Math.max(dVar2.a(0), dVar2.a(2));
        }
        p9Var.setAlpha(Math.max(max, this.R.a(3)));
        p9VarArr[1].setAlpha((1.0f - this.f12216p0) * dVar.a(1));
        p9VarArr[2].setAlpha(dVar.a(1) * this.f12216p0);
        float lerp3 = AndroidUtilities.lerp(1.0f, this.f12203d0, dVar.a(2));
        FrameLayout frameLayout = this.f12199b;
        frameLayout.setScaleX(lerp3);
        frameLayout.setScaleY(AndroidUtilities.lerp(1.0f, this.f12203d0, dVar.a(2)));
        frameLayout.setTranslationX(dVar.a(2) * this.f12200b0);
        frameLayout.setTranslationY((dVar.a(2) * this.f12202c0) + (dVar.a(1) * AndroidUtilities.dp(16.0f)));
        View view2 = viewArr[2];
        int i23 = dVar.f2105a;
        if (i23 == 2 && i21 == 2) {
            a2 = 0.0f;
        } else {
            if (i23 != 2) {
                i21 = i23;
            }
            a2 = (1.0f - dVar.a(2)) * (-(viewArr[i21].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view2.setTranslationY(a2);
        if (this.W && this.R.b(0)) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        kh.y1 y1Var = this.f12213n;
        y1Var.setVisibility(i12);
        y1Var.setAlpha(this.R.a(0));
        if (dVar.a(4) <= 0.0f) {
            i19 = 8;
        }
        f4 f4Var = this.I;
        f4Var.setVisibility(i19);
        f4Var.setAlpha(dVar.a(4));
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
        int[] iArr3;
        float f13;
        c5 c5Var;
        Canvas canvas2;
        u4 u4Var;
        float max2;
        float realHeight = getRealHeight();
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float width = getWidth() / 2.0f;
        float dp = AndroidUtilities.dp(80.0f) + AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), this.R.a(1));
        c5.d dVar = this.R;
        if ((dVar.b(0) && dVar.b(2)) || ((dVar.b(2) && dVar.b(3)) || (dVar.b(3) && dVar.b(0)))) {
            max = 1.0f;
        } else {
            max = Math.max(dVar.a(0), Math.max(dVar.a(2), dVar.a(3)));
        }
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.S;
        int i10 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
        if (i10 > 0 && stargiftattributebackdropArr2[0] != null) {
            if (this.f12210j0 != null && this.R.a(2) >= 1.0f) {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            } else {
                Paint[] paintArr = this.f12207g0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.f12209i0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, dp);
                this.f12208h0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            }
            if (this.f12210j0 != null && this.R.a(2) > 0.0f) {
                Paint paint = this.f12212l0;
                paint.setAlpha((int) (this.R.a(2) * 255.0f));
                Matrix matrix = this.f12211k0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.f12210j0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        } else {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        }
        if (this.R.a(1) > 0.0f) {
            f10 = width;
            f11 = dp;
            j(b(canvas, f10, f11, getWidth(), realHeight));
        } else {
            f10 = width;
            f11 = dp;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
        int[] iArr4 = this.f12226w0;
        int[] iArr5 = this.f12224v0;
        int[] iArr6 = this.f12223u0;
        if (stargiftattributebackdrop != null) {
            for (int i11 = 0; i11 < iArr6.length; i11++) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                iArr5[i11] = stargiftattributebackdrop2.text_color | (-16777216);
                iArr6[i11] = i0.a.d(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i11] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
            }
        }
        u4 u4Var2 = this.f12201c;
        if (u4Var2.f13189s == null && u4Var2.v == null && u4Var2.f13190w == null) {
            c5Var = this;
            f13 = f10;
            f12 = f11;
            iArr3 = iArr4;
            iArr = iArr5;
            iArr2 = iArr6;
            u4Var = u4Var2;
            canvas2 = canvas;
        } else {
            float width2 = getWidth();
            float f14 = f10;
            o4 o4Var = u4Var2.f13189s;
            float f15 = f11;
            float f16 = u4Var2.f13191x;
            int[] iArr7 = this.f12224v0;
            int[] iArr8 = this.f12223u0;
            int[] iArr9 = this.f12226w0;
            f12 = f15;
            iArr = iArr5;
            iArr2 = iArr6;
            iArr3 = iArr4;
            f13 = f14;
            c5Var = this;
            canvas2 = canvas;
            u4Var2.a(canvas2, o4Var, f16, width2, realHeight, iArr7, iArr8, iArr9);
            u4Var2.a(canvas2, u4Var2.v, u4Var2.f13192y, width2, realHeight, iArr7, iArr8, iArr9);
            u4Var2.a(canvas2, u4Var2.f13190w, u4Var2.B, width2, realHeight, iArr7, iArr8, iArr9);
            u4Var = u4Var2;
            c5Var.invalidate();
        }
        if (i10 > 0 && stargiftattributebackdropArr[0] != null) {
            int i12 = iArr3[iArr3.length / 2];
            c5.d dVar2 = c5Var.R;
            if (dVar2.b(0) && dVar2.b(3)) {
                max2 = 1.0f;
            } else {
                max2 = Math.max(dVar2.a(0), dVar2.a(3));
            }
            org.telegram.ui.Components.j5[] j5VarArr = c5Var.f12214n0;
            if (max2 > 0.0f) {
                canvas2.save();
                canvas2.translate(f13, f12);
                j5VarArr[0].k(Integer.valueOf(i12));
                x0.a(canvas, 0, j5VarArr[0], c5Var.getWidth(), realHeight, max2, 1.0f);
                realHeight = realHeight;
                canvas.restore();
            }
            if (c5Var.R.a(2) > 0.0f) {
                canvas.save();
                j5VarArr[0].k(Integer.valueOf(i12));
                float f17 = realHeight;
                RectF rectF = AndroidUtilities.rectTmp;
                LinearLayout[] linearLayoutArr = c5Var.f12205f;
                float x10 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = c5Var.G;
                float x11 = frameLayout.getX() + x10;
                org.telegram.ui.Components.p9 p9Var = c5Var.H;
                rectF.set(p9Var.getX() + x11, p9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), p9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + p9Var.getWidth(), p9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + p9Var.getHeight());
                x0.c(canvas, j5VarArr[0], c5Var.getWidth(), f17 * 0.7f, 1.0f, rectF, c5Var.R.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            ah.e[] eVarArr = c5Var.F;
            int length = eVarArr.length;
            int i13 = 0;
            while (i13 < length) {
                ah.e eVar = eVarArr[i13];
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.j6.B1(eVar.getBackground(), iArr10[Utilities.clamp(Math.round((((eVar.getWidth() / 2.0f) + eVar.getX()) / c5Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    eVar.invalidate();
                }
                i13++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i14 = iArr11[iArr11.length / 2];
            int i15 = iArr12[iArr12.length / 2];
            TextView textView = c5Var.v;
            if (textView != null && c5Var.f12225w != i14) {
                c5Var.f12225w = i14;
                textView.setTextColor(i14);
                org.telegram.ui.ActionBar.j6.B1(textView.getBackground(), i15, false);
            }
            if (u4Var.f13189s != null || u4Var.v != null || u4Var.f13190w != null) {
                c5Var.f12228y[0].setTextColor(i14);
            }
            if (c5Var.R.a(2) > 0.0f) {
                if (c5Var.f12222t0 == null) {
                    c5Var.f12222t0 = new wa(1, 12);
                }
                FrameLayout frameLayout2 = c5Var.f12199b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / 2.0f) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / 2.0f;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / 2.0f) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / 2.0f;
                float f18 = measuredHeight + scaleY;
                RectF rectF2 = c5Var.f12221s0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f18);
                c5Var.f12222t0.g(rectF2);
                c5Var.f12222t0.d();
                c5Var.f12222t0.a(canvas2, org.telegram.ui.ActionBar.j6.l1(c5Var.R.a(2), -1));
                c5Var.invalidate();
            }
        }
        if (c5Var.R.a(1) > 0.0f) {
            c5Var.c(canvas2, f13, f12, c5Var.getWidth(), c5Var.getRealHeight());
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
        RadialGradient[] radialGradientArr = this.f12208h0;
        radialGradientArr[i10] = radialGradient;
        if (i10 == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.f12210j0 = radialGradient2;
            this.f12212l0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.f12209i0;
        if (matrixArr[i10] == null) {
            matrixArr[i10] = new Matrix();
        }
        this.f12207g0[i10].setShader(radialGradientArr[i10]);
    }

    public final void f(TL_stars.StarGift starGift, boolean z4, boolean z10, boolean z11) {
        boolean z12;
        lf.b bVar;
        boolean z13;
        int i10;
        int i11;
        this.J = false;
        if (!z4 && !z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        boolean z14 = starGift instanceof TL_stars.TL_starGiftUnique;
        int i12 = 8;
        pb1 pb1Var = this.E;
        f90[] f90VarArr = this.f12228y;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.S;
        if (z14) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) t7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) t7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            f90VarArr[0].setTextSize(1, 13.0f);
            if (z12) {
                i12 = 0;
            }
            pb1Var.setVisibility(i12);
            ah.e[] eVarArr = this.F;
            if (z12) {
                ah.e eVar = eVarArr[1];
                if (z11) {
                    i10 = R.drawable.filled_crown_off;
                } else {
                    i10 = R.drawable.filled_crown_on;
                }
                if (z11) {
                    i11 = R.string.Gift2ActionWearOff;
                } else {
                    i11 = R.string.Gift2ActionWear;
                }
                eVar.b(i10, LocaleController.getString(i11), false);
            }
            float f10 = 1.0f;
            if (starGift.resell_amount != null) {
                this.J = true;
                boolean z15 = starGift.resale_ton_only;
                lf.b bVar2 = lf.b.f12057b;
                if (z15) {
                    bVar = bVar2;
                } else {
                    bVar = lf.b.f12056a;
                }
                lf.a resellAmount = starGift.getResellAmount(bVar);
                int i13 = R.string.GiftOnSale;
                if (resellAmount.f12054a == bVar2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                CharSequence formatSpannable = LocaleController.formatSpannable(i13, ja.S0("⭐️ " + ((Object) ja.J0(resellAmount.o(), 1.0f, ',')), z13), Float.valueOf(0.9f));
                TextView textView = this.K;
                textView.setText(formatSpannable);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                if (g5.N1(UserConfig.selectedAccount, DialogObject.getPeerDialogId(starGift.owner_id))) {
                    textView.setOnClickListener(new x4(this, 1));
                    k7.d6.a(textView);
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                }
            }
            if (z4) {
                eVarArr[0].setAlpha(1.0f);
                eVarArr[0].b(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
            } else {
                eVarArr[0].setAlpha(0.5f);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                spannableStringBuilder.setSpan(new lq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTransfer));
                eVarArr[0].b(R.drawable.filled_gift_transfer, spannableStringBuilder, false);
            }
            ah.e eVar2 = eVarArr[1];
            if (!z4 && !z10) {
                f10 = 0.5f;
            }
            eVar2.setAlpha(f10);
            if (z4) {
                ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                View.OnClickListener onClickListener = this.P;
                if (arrayList != null) {
                    eVarArr[2].b(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), false);
                    eVarArr[2].setOnClickListener(onClickListener);
                } else {
                    eVarArr[2].b(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), false);
                    eVarArr[2].setOnClickListener(onClickListener);
                }
            } else {
                eVarArr[2].b(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                eVarArr[2].setOnClickListener(this.O);
            }
            this.W = starGift.crafted;
            this.f12213n.f11067a.d(stargiftattributebackdropArr[0], false, true);
        } else {
            stargiftattributebackdropArr[0] = null;
            f90VarArr[0].setTextSize(1, 14.0f);
            this.W = false;
            pb1Var.setVisibility(8);
        }
        e(0, stargiftattributebackdropArr[0]);
        ja.a1(this.d[0].getImageReceiver(), starGift, 160);
        this.e[0] = (TL_stars.starGiftAttributeModel) t7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        d(this.R);
    }

    public final void g(int i10, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z4) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.m0;
            if (stargiftattributepatternArr[i10] != stargiftattributepattern) {
                stargiftattributepatternArr[i10] = stargiftattributepattern;
                this.f12214n0[i10].i(stargiftattributepattern.document, z4);
            }
        }
    }

    public int getFinalHeight() {
        int dp;
        int measuredHeight;
        boolean d = this.R.d(0);
        float f10 = 10.0f;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.S;
        LinearLayout[] linearLayoutArr = this.f12205f;
        if (d) {
            if (stargiftattributebackdropArr[0] != null) {
                f10 = 24.0f;
            }
            return linearLayoutArr[0].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f10);
        } else if (this.R.d(1)) {
            if (stargiftattributebackdropArr[1] != null) {
                f10 = 24.0f;
            }
            return linearLayoutArr[1].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f10);
        } else {
            if (this.R.d(2)) {
                dp = AndroidUtilities.dp(64.0f);
                measuredHeight = linearLayoutArr[2].getMeasuredHeight();
            } else if (this.R.d(3)) {
                dp = AndroidUtilities.dp(160.0f);
                measuredHeight = linearLayoutArr[3].getMeasuredHeight();
            } else if (!this.R.d(4)) {
                return 0;
            } else {
                f4 f4Var = this.I;
                if (f4Var.getMeasuredHeight() > 0) {
                    return f4Var.getMeasuredHeight();
                }
                return AndroidUtilities.dp(550.0f);
            }
            return measuredHeight + dp;
        }
    }

    public float getRealHeight() {
        float f10;
        float f11;
        int dp;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.S;
        float f12 = 10.0f;
        if (stargiftattributebackdropArr[0] != null) {
            f10 = 24.0f;
        } else {
            f10 = 10.0f;
        }
        int dp2 = AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f10);
        LinearLayout[] linearLayoutArr = this.f12205f;
        float a2 = (this.R.a(0) * (linearLayoutArr[0].getMeasuredHeight() + dp2)) + 0.0f;
        if (stargiftattributebackdropArr[1] != null) {
            f11 = 24.0f;
        } else {
            f11 = 10.0f;
        }
        int dp3 = AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f11);
        float a10 = (this.R.a(2) * (linearLayoutArr[2].getMeasuredHeight() + AndroidUtilities.dp(64.0f))) + (this.R.a(1) * (linearLayoutArr[1].getMeasuredHeight() + dp3)) + a2;
        if (stargiftattributebackdropArr[0] != null) {
            f12 = 24.0f;
        }
        int dp4 = AndroidUtilities.dp(f12);
        float a11 = (this.R.a(3) * (linearLayoutArr[3].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + dp4)) + a10;
        f4 f4Var = this.I;
        if (f4Var.getMeasuredHeight() > 0) {
            dp = f4Var.getMeasuredHeight();
        } else {
            dp = AndroidUtilities.dp(550.0f);
        }
        return (this.R.a(4) * dp) + a11;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        float f10 = this.f12216p0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.S;
        if (f10 > 0.5f) {
            return stargiftattributebackdropArr[2];
        }
        return stargiftattributebackdropArr[1];
    }

    public org.telegram.ui.Components.p9 getUpgradeImageView() {
        float f10 = this.f12216p0;
        org.telegram.ui.Components.p9[] p9VarArr = this.d;
        if (f10 > 0.5f) {
            return p9VarArr[2];
        }
        return p9VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        float f10 = this.f12216p0;
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        if (f10 > 0.5f) {
            return stargiftattributemodelArr[2];
        }
        return stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.m0[1];
    }

    public final void h(int i10, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence3, TLObject tLObject, Spannable spannable) {
        int i11;
        int i12;
        this.f12218r[i10].setText(charSequence);
        FrameLayout frameLayout = this.f12227x;
        f90[] f90VarArr = this.f12228y;
        f90 f90Var = this.f12220s;
        TextView textView = this.v;
        int i13 = 0;
        if (i10 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            f90Var.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                f90VarArr[i10].setVisibility(8);
            }
        } else if (i10 == 0 && !TextUtils.isEmpty(charSequence3)) {
            f90Var.setText(charSequence3);
            f90Var.setVisibility(0);
            textView.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                f90VarArr[i10].setVisibility(8);
            }
        } else {
            f90VarArr[i10].setText(charSequence2);
            if (i10 == 0) {
                if (TextUtils.isEmpty(charSequence2)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                frameLayout.setVisibility(i12);
            } else {
                f90 f90Var2 = f90VarArr[i10];
                if (TextUtils.isEmpty(charSequence2)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                f90Var2.setVisibility(i11);
            }
            f90Var.setVisibility(8);
            textView.setVisibility(8);
        }
        kh.w0[] w0VarArr = this.C;
        kh.w0 w0Var = w0VarArr[i10];
        if (w0Var != null) {
            if (TextUtils.isEmpty(spannable)) {
                i13 = 8;
            }
            w0Var.setVisibility(i13);
            w0VarArr[i10].setUser(tLObject);
            w0VarArr[i10].setMessage(spannable);
        }
    }

    public final void i(int i10, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i10, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void k() {
        this.f12203d0 = AndroidUtilities.dpf2(33.33f) / AndroidUtilities.dpf2(160.0f);
        FrameLayout frameLayout = this.f12199b;
        f90[] f90VarArr = this.f12218r;
        this.f12200b0 = ((((Math.min(f90VarArr[2].getPaint().measureText(f90VarArr[2].getText().toString()), f90VarArr[2].getWidth()) + f90VarArr[2].getWidth()) / 2.0f) + (f90VarArr[2].getX() + (-frameLayout.getLeft()))) + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(126.67f) / 2.0f);
        this.f12202c0 = (AndroidUtilities.dp(124.0f) + (-frameLayout.getTop())) - (AndroidUtilities.dp(126.67f) / 2.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.j5[] j5VarArr = this.f12214n0;
        j5VarArr[0].a();
        j5VarArr[1].a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.j5[] j5VarArr = this.f12214n0;
        j5VarArr[0].b();
        j5VarArr[1].b();
        AndroidUtilities.cancelRunOnUIThread(this.f12206f0);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.R.b(2)) {
            k();
            d(this.R);
        }
    }

    public void setPreviewAttributes(f1 f1Var) {
        c5.d dVar = this.R;
        if (dVar != null && dVar.f2106b == 1 && isAttachedToWindow()) {
            AndroidUtilities.cancelRunOnUIThread(this.f12206f0);
            ValueAnimator valueAnimator = this.f12204e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f12204e0 = null;
            }
            int i10 = 1 - this.f12215o0;
            this.f12215o0 = i10;
            org.telegram.ui.Components.p9[] p9VarArr = this.d;
            gj0 lottieAnimation = p9VarArr[2 - i10].getImageReceiver().getLottieAnimation();
            gj0 lottieAnimation2 = p9VarArr[this.f12215o0 + 1].getImageReceiver().getLottieAnimation();
            if (lottieAnimation2 != null && lottieAnimation != null) {
                lottieAnimation2.Q(lottieAnimation.r(), false);
            }
            int i11 = this.f12215o0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = f1Var.f12377a;
            this.S[i11] = stargiftattributebackdrop;
            e(i11, stargiftattributebackdrop);
            g(1, f1Var.f12378b, true);
            int i12 = this.f12215o0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = f1Var.f12379c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
            stargiftattributemodelArr[i12] = stargiftattributemodel;
            ja.Z0(p9VarArr[i12].getImageReceiver(), stargiftattributemodelArr[this.f12215o0 + 1].document, 160);
            a();
            float f10 = this.f12215o0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f10, f10);
            this.f12204e0 = ofFloat;
            ofFloat.addUpdateListener(new y4(this, 0));
            this.f12204e0.addListener(new a5(this, 3));
            this.f12204e0.setDuration(320L);
            this.f12204e0.setInterpolator(mr.h);
            this.f12204e0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.T = new com.google.android.gms.common.api.internal.r(t7.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.U = new com.google.android.gms.common.api.internal.r(t7.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.V = new com.google.android.gms.common.api.internal.r(t7.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.f12228y[1].setTextSize(1, 14.0f);
        this.E.setVisibility(8);
        this.f12216p0 = 0.0f;
        this.f12215o0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.U.c(), true);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        stargiftattributemodelArr[1] = (TL_stars.starGiftAttributeModel) this.T.c();
        org.telegram.ui.Components.p9[] p9VarArr = this.d;
        ja.Z0(p9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, 160);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.V.c();
        this.S[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.T.f2847f;
        ja.Z0(p9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, 160);
        b bVar = this.f12206f0;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        AndroidUtilities.runOnUIThread(bVar, 2500L);
        invalidate();
    }

    public void setResellPrice(lf.a aVar) {
        boolean z4;
        boolean k10 = aVar.k();
        this.J = !k10;
        f90[] f90VarArr = this.f12228y;
        TextView textView = this.K;
        if (!k10) {
            int i10 = R.string.GiftOnSale;
            if (aVar.f12054a == lf.b.f12057b) {
                z4 = true;
            } else {
                z4 = false;
            }
            textView.setText(LocaleController.formatSpannable(i10, ja.U0(z4, "⭐️ " + ((Object) ja.J0(aVar.o(), 1.0f, ',')), 0.9f, null, 0.0f, 1.0f)));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.S[0];
            textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.f12198a0 = true;
            ViewPropertyAnimator duration = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            mr mrVar = mr.h;
            duration.setInterpolator(mrVar).setListener(new a5(this, 0)).start();
            f90VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(mrVar).start();
        } else {
            ViewPropertyAnimator duration2 = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            mr mrVar2 = mr.h;
            duration2.setInterpolator(mrVar2).setListener(new a5(this, 2)).setListener(new a5(this, 1)).start();
            f90VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(mrVar2).start();
        }
        boolean z10 = this.J;
        ah.e[] eVarArr = this.F;
        if (z10) {
            eVarArr[2].b(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), true);
        } else {
            eVarArr[2].b(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), true);
        }
        eVarArr[2].setOnClickListener(this.P);
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
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.p(tLObject);
        this.H.e(tLObject, z8Var);
        this.f12218r[2].setText(str2);
        this.f12228y[2].setText(str);
        k();
        d(this.R);
    }

    public void j(int i10) {
    }
}
