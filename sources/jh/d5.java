package jh;

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
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.ua1;
public class d5 extends FrameLayout {
    public final LinearLayout.LayoutParams[] A;
    public final ih.x0[] B;
    public final TextPaint C;
    public final ua1 D;
    public final bg.d1[] E;
    public final FrameLayout F;
    public final org.telegram.ui.Components.t9 G;
    public final g4 H;
    public boolean I;
    public final TextView J;
    public final ImageView K;
    public final ImageView L;
    public final ImageView M;
    public final View.OnClickListener N;
    public final View.OnClickListener O;
    public final View.OnClickListener P;
    public a5.d Q;
    public final TL_stars.starGiftAttributeBackdrop[] R;
    public com.google.android.gms.common.api.internal.r S;
    public com.google.android.gms.common.api.internal.r T;
    public com.google.android.gms.common.api.internal.r U;
    public boolean V;
    public boolean W;
    public final org.telegram.ui.ActionBar.c6 f11905a;
    public float f11906a0;
    public final FrameLayout f11907b;
    public float f11908b0;
    public final v4 f11909c;
    public float f11910c0;
    public final org.telegram.ui.Components.t9[] d;
    public ValueAnimator f11911d0;
    public final TL_stars.starGiftAttributeModel[] f11912e;
    public final o f11913e0;
    public final LinearLayout[] f11914f;
    public final Paint[] f11915f0;
    public final RadialGradient[] f11916g0;
    public final FrameLayout.LayoutParams[] h;
    public final Matrix[] f11917h0;
    public RadialGradient f11918i0;
    public final Matrix f11919j0;
    public final Paint f11920k0;
    public final TL_stars.starGiftAttributePattern[] f11921l0;
    public final org.telegram.ui.Components.n5[] m0;
    public final ih.z1 f11922n;
    public int f11923n0;
    public float f11924o0;
    public float f11925p0;
    public ValueAnimator f11926q0;
    public final y80[] f11927r;
    public final RectF f11928r0;
    public final y80 f11929s;
    public va f11930s0;
    public final int[] f11931t0;
    public final int[] f11932u0;
    public final TextView v;
    public final int[] f11933v0;
    public int f11934w;
    public final FrameLayout f11935x;
    public final y80[] f11936y;

    public d5(Context context, org.telegram.ui.ActionBar.c6 c6Var, Runnable runnable, View.OnClickListener onClickListener, l1 l1Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f9;
        this.d = new org.telegram.ui.Components.t9[5];
        this.f11912e = new TL_stars.starGiftAttributeModel[3];
        this.f11914f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.f11927r = new y80[5];
        this.f11936y = new y80[5];
        this.A = new LinearLayout.LayoutParams[5];
        this.B = new ih.x0[5];
        this.Q = new a5.d(0, 0);
        this.R = new TL_stars.starGiftAttributeBackdrop[3];
        this.f11913e0 = new o(this, 10);
        this.f11915f0 = new Paint[3];
        this.f11916g0 = new RadialGradient[3];
        this.f11917h0 = new Matrix[3];
        this.f11919j0 = new Matrix();
        this.f11920k0 = new Paint(1);
        this.f11921l0 = new TL_stars.starGiftAttributePattern[2];
        this.m0 = new org.telegram.ui.Components.n5[2];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f11915f0;
            if (i10 >= paintArr.length) {
                break;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.n5[] n5VarArr = this.m0;
            if (i11 >= n5VarArr.length) {
                break;
            }
            n5VarArr[i11] = new org.telegram.ui.Components.n5(AndroidUtilities.dp(28.0f), this);
            i11++;
        }
        this.f11925p0 = 1.0f;
        this.f11928r0 = new RectF();
        this.f11931t0 = new int[12];
        this.f11932u0 = new int[12];
        this.f11933v0 = new int[12];
        this.f11905a = c6Var;
        this.N = onClickListener4;
        this.O = onClickListener5;
        this.P = onClickListener6;
        setWillNotDraw(false);
        this.f11907b = new FrameLayout(context);
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.t9[] t9VarArr = this.d;
            float f10 = 0.0f;
            if (i12 >= t9VarArr.length) {
                break;
            }
            t9VarArr[i12] = new a5(context, 0);
            this.d[i12].setLayerNum(6660);
            if (i12 > 0) {
                this.d[i12].getImageReceiver().setCrossfadeDuration(1);
            }
            this.f11907b.addView(this.d[i12], i7.f6.e(-1, -1, 119));
            org.telegram.ui.Components.t9 t9Var = this.d[i12];
            if (i12 == 0) {
                f10 = 1.0f;
            }
            t9Var.setAlpha(f10);
            i12++;
        }
        y80 y80Var = new y80(context, null);
        this.f11929s = y80Var;
        y80Var.setTextSize(1, 12.0f);
        y80Var.setGravity(17);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        y80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setOnClickListener(new y4(this, 0));
        i7.h6.b(textView, 0.05f, 1.25f);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setLinkTextColor(-1);
        textView.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        TextView textView2 = new TextView(context);
        this.J = textView2;
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.4f);
        textView2.setScaleY(0.4f);
        textView2.setVisibility(8);
        textView2.setGravity(17);
        i7.h6.a(textView2);
        ua1 ua1Var = new ua1(this, context, 3);
        this.D = ua1Var;
        ua1Var.setOrientation(0);
        this.E = new bg.d1[3];
        int i13 = 0;
        while (true) {
            bg.d1[] d1VarArr = this.E;
            if (i13 >= d1VarArr.length) {
                break;
            }
            bg.d1 d1Var = new bg.d1(context, 3);
            ImageView imageView = new ImageView(context);
            d1Var.f2146b = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            d1Var.addView(imageView, i7.f6.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
            TextView textView3 = new TextView(context);
            d1Var.f2147c = textView3;
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextSize(1, 12.0f);
            textView3.setTextColor(-1);
            textView3.setGravity(17);
            d1Var.addView(textView3, i7.f6.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
            d1VarArr[i13] = d1Var;
            if (i13 == 0) {
                this.E[i13].b(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
                this.E[i13].setOnClickListener(onClickListener2);
            } else if (i13 == 1) {
                this.E[i13].b(R.drawable.filled_crown_on, LocaleController.getString(R.string.Gift2ActionWear), false);
                this.E[i13].setOnClickListener(onClickListener3);
            } else if (i13 == 2) {
                this.E[i13].b(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                this.E[i13].setOnClickListener(onClickListener4);
            }
            this.E[i13].setBackground(org.telegram.ui.ActionBar.g6.Z(0, 285212671, 16, 16));
            i7.h6.b(this.E[i13], 0.075f, 1.5f);
            ua1 ua1Var2 = this.D;
            bg.d1[] d1VarArr2 = this.E;
            ua1Var2.addView(d1VarArr2[i13], i7.f6.p(0, 56, 1.0f, 119, 0, 0, i13 != d1VarArr2.length - 1 ? 11 : 0, 0));
            i13++;
        }
        this.f11935x = new FrameLayout(context);
        int i14 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f11914f;
            if (i14 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i14] = new LinearLayout(context);
            this.f11914f[i14].setOrientation(1);
            if (i14 == 2) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.F = frameLayout;
                this.f11914f[i14].addView(frameLayout, i7.f6.q(-1, 144, 119));
                org.telegram.ui.Components.t9 t9Var2 = new org.telegram.ui.Components.t9(context);
                this.G = t9Var2;
                t9Var2.setRoundRadius(AndroidUtilities.dp(41.0f));
                frameLayout.addView(t9Var2, i7.f6.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.f11927r[i14] = new y80(context, null);
                this.f11927r[i14].setTextColor(-1);
                this.f11927r[i14].setTextSize(1, 20.0f);
                this.f11927r[i14].setTypeface(AndroidUtilities.bold());
                this.f11927r[i14].setSingleLine();
                y80 y80Var2 = this.f11927r[i14];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                y80Var2.setEllipsize(truncateAt);
                this.f11927r[i14].setGravity(17);
                frameLayout.addView(this.f11927r[i14], i7.f6.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.f11936y[i14] = new y80(context, null);
                this.f11936y[i14].setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var));
                this.f11936y[i14].setTextSize(1, 14.0f);
                this.f11936y[i14].setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
                this.f11936y[i14].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.f11936y[i14].setDisablePaddingsOffsetY(true);
                this.f11936y[i14].setSingleLine();
                this.f11936y[i14].setGravity(17);
                this.f11936y[i14].setEllipsize(truncateAt);
                frameLayout.addView(this.f11936y[i14], i7.f6.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i14 == 4) {
                g4 g4Var = new g4(context, c6Var);
                this.H = g4Var;
                this.f11914f[i14].addView(g4Var, i7.f6.n(-1, -2));
                View view = this.f11914f[i14];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = i7.f6.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i14] = d;
                addView(view, d);
                i14++;
            } else {
                this.f11927r[i14] = new y80(context, null);
                this.f11927r[i14].setTextColor(i14 == 3 ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var));
                this.f11927r[i14].setTextSize(1, 20.0f);
                this.f11927r[i14].setTypeface(AndroidUtilities.bold());
                this.f11927r[i14].setGravity(17);
                this.f11914f[i14].addView(this.f11927r[i14], i7.f6.t(-1, -2, 17, 24, i14 == 3 ? 10 : 0, 24, 0));
                if (i14 == 0) {
                    this.f11914f[i14].addView(this.f11929s, i7.f6.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f11914f[i14].addView(this.v, i7.f6.s(-2, 17, 0, 6, 0, 19.33f, 2));
                }
                if (i14 == 0) {
                    this.f11936y[i14] = new y80(context, null);
                    this.f11936y[i14].setTextColor(i14 == 3 ? org.telegram.ui.ActionBar.g6.l1(0.75f, -1) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var));
                    this.f11936y[i14].setTextSize(1, 14.0f);
                    this.f11936y[i14].setGravity(17);
                    this.f11936y[i14].setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
                    this.f11936y[i14].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f11936y[i14].setDisablePaddingsOffsetY(true);
                    this.f11935x.addView(this.f11936y[i14], i7.f6.e(-2, -2, 17));
                    this.f11935x.addView(this.J, i7.f6.a(-2.0f, 20.33f, 17));
                    LinearLayout linearLayout = this.f11914f[i14];
                    FrameLayout frameLayout2 = this.f11935x;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.A;
                    LinearLayout.LayoutParams t10 = i7.f6.t(-1, -2, 17, 24, 0, 24, i14 == 3 ? 6 : 0);
                    layoutParamsArr2[i14] = t10;
                    linearLayout.addView(frameLayout2, t10);
                } else {
                    this.f11936y[i14] = new y80(context, null);
                    this.f11936y[i14].setTextColor(i14 == 3 ? org.telegram.ui.ActionBar.g6.l1(0.75f, -1) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var));
                    this.f11936y[i14].setTextSize(1, 14.0f);
                    this.f11936y[i14].setGravity(17);
                    this.f11936y[i14].setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
                    this.f11936y[i14].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f11936y[i14].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout2 = this.f11914f[i14];
                    y80 y80Var3 = this.f11936y[i14];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.A;
                    LinearLayout.LayoutParams t11 = i7.f6.t(-1, -2, 17, 24, 0, 24, i14 == 3 ? 6 : 0);
                    layoutParamsArr3[i14] = t11;
                    linearLayout2.addView(y80Var3, t11);
                }
                LinearLayout.LayoutParams layoutParams = this.A[i14];
                if (i14 == 3) {
                    f9 = 6.0f;
                } else {
                    f9 = (i14 == 1 ? 7.33f : this.R[0] == null ? 9.0f : 5.66f) - 4.0f;
                }
                layoutParams.topMargin = AndroidUtilities.dp(f9);
                this.B[i14] = new ih.x0(context);
                this.B[i14].setVisibility(8);
                this.B[i14].setPadding(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f));
                if (i14 == 0) {
                    this.C = this.B[i14].getTextPaint();
                }
                this.f11914f[i14].addView(this.B[i14], i7.f6.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i14 == 0) {
                this.f11914f[i14].addView(this.D, i7.f6.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f11914f[i14];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            ViewGroup.LayoutParams d10 = i7.f6.d(-1, -2.0f, 119, 16.0f, i14 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f);
            layoutParamsArr4[i14] = d10;
            addView(view2, d10);
            i14++;
        }
        addView(this.f11907b, i7.f6.d(160, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        v4 v4Var = new v4(context);
        this.f11909c = v4Var;
        addView(v4Var, i7.f6.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.K = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(28.0f), 620756991));
        imageView2.setImageResource(R.drawable.msg_close);
        i7.h6.a(imageView2);
        addView(imageView2, i7.f6.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView2.setOnClickListener(new gg.u(2, runnable));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.L = imageView3;
        imageView3.setImageResource(R.drawable.filled_forge);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        i7.h6.a(imageView3);
        if (l1Var != null) {
            addView(imageView3, i7.f6.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView3.setOnClickListener(l1Var);
        }
        imageView3.setVisibility(8);
        ImageView imageView4 = new ImageView(context);
        this.M = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView4.setImageResource(R.drawable.media_more);
        imageView4.setScaleType(scaleType);
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        i7.h6.a(imageView4);
        addView(imageView4, i7.f6.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView4.setOnClickListener(onClickListener);
        imageView4.setVisibility(8);
        ih.z1 z1Var = new ih.z1(context);
        this.f11922n = z1Var;
        z1Var.b(LocaleController.getString(R.string.GiftCrafted), true);
        ih.b2 b2Var = z1Var.f9557a;
        if (b2Var.f9035f == null) {
            va vaVar = new va(2, 12);
            b2Var.f9035f = vaVar;
            vaVar.h = 5.0f;
        }
        Path path = b2Var.f9033c;
        float f11 = b2Var.f9034e;
        b2Var.f9036g = true;
        ih.b2.c(path, f11, true);
        z1Var.setScaleX(1.2f);
        z1Var.setScaleY(1.2f);
        addView(z1Var, i7.f6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        z1Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f11926q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11926q0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11926q0 = ofFloat;
        ofFloat.addUpdateListener(new z4(this, 1));
        this.f11926q0.addListener(new b5(this, 4));
        this.f11926q0.setDuration(320L);
        this.f11926q0.setInterpolator(jr.f29801g);
        this.f11926q0.start();
    }

    public final int b(Canvas canvas, float f9, float f10, float f11, float f12) {
        int i10 = this.f11923n0;
        RadialGradient[] radialGradientArr = this.f11916g0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.R;
        Matrix[] matrixArr = this.f11917h0;
        Paint[] paintArr = this.f11915f0;
        int i11 = 0;
        if (i10 == 0) {
            if (this.f11924o0 > 0.0f && stargiftattributebackdropArr[2] != null) {
                paintArr[2].setAlpha((int) (this.Q.a(1) * 255.0f));
                matrixArr[2].reset();
                matrixArr[2].postTranslate(f9, f10);
                radialGradientArr[2].setLocalMatrix(matrixArr[2]);
                canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[2]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[2];
                i11 = i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
            }
            if (this.f11924o0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) ((1.0f - this.f11924o0) * this.Q.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f9, f10);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                return i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[1].getAlpha()), i11);
            }
            return i11;
        }
        if (this.f11924o0 < 1.0f && stargiftattributebackdropArr[1] != null) {
            paintArr[1].setAlpha((int) (this.Q.a(1) * 255.0f));
            matrixArr[1].reset();
            matrixArr[1].postTranslate(f9, f10);
            radialGradientArr[1].setLocalMatrix(matrixArr[1]);
            canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[1]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[1];
            i11 = i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
        }
        if (this.f11924o0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.Q.a(1) * 255.0f * this.f11924o0));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f9, f10);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[2];
            return i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[2].getAlpha()), i11);
        }
        return i11;
    }

    public final void c(Canvas canvas, float f9, float f10, float f11, float f12) {
        int i10;
        canvas.save();
        canvas.translate(f9, f10);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.R;
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
        int d = i0.a.d(this.f11924o0, i10, i11);
        org.telegram.ui.Components.n5[] n5VarArr = this.m0;
        n5VarArr[1].k(Integer.valueOf(d));
        x0.a(canvas, 0, n5VarArr[1], f11, f12, this.Q.a(1), this.f11925p0);
        canvas.restore();
    }

    public void d(a5.d dVar) {
        View[] viewArr;
        float f9;
        float f10;
        int i10;
        boolean z10;
        int i11;
        y80[] y80VarArr;
        int d;
        float max;
        float a2;
        int i12;
        int i13;
        int i14;
        boolean z11;
        float f11;
        int i15;
        int i16;
        float f12;
        float f13;
        int i17;
        int i18;
        this.Q = dVar;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            viewArr = this.f11914f;
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
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.R;
        if (stargiftattributebackdropArr[0] != null) {
            f9 = dVar.a(2);
        } else {
            f9 = 0.0f;
        }
        if (stargiftattributebackdropArr[1] != null) {
            f10 = dVar.a(1);
        } else {
            f10 = 0.0f;
        }
        float max2 = Math.max(f9, f10);
        ImageView imageView = this.K;
        imageView.setAlpha(max2);
        if ((stargiftattributebackdropArr[0] != null && dVar.f163b == 2) || (stargiftattributebackdropArr[1] != null && dVar.f163b == 1)) {
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
        float a11 = dVar.a(0);
        int i21 = dVar.f163b;
        float lerp = AndroidUtilities.lerp(false, z10, a11);
        ImageView imageView2 = this.M;
        imageView2.setAlpha(lerp);
        if (stargiftattributebackdropArr[0] != null && i21 == 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView2.setVisibility(i11);
        if (!this.W) {
            float lerp2 = AndroidUtilities.lerp(false, this.I, dVar.a(0));
            TextView textView = this.J;
            textView.setAlpha(lerp2);
            if (this.I) {
                f12 = 1.0f;
            } else {
                f12 = 0.4f;
            }
            textView.setScaleX(AndroidUtilities.lerp(0.4f, f12, dVar.a(0)));
            if (this.I) {
                f13 = 1.0f;
            } else {
                f13 = 0.4f;
            }
            textView.setScaleY(AndroidUtilities.lerp(0.4f, f13, dVar.a(0)));
            if (this.I && i21 == 0) {
                i17 = 0;
            } else {
                i17 = 4;
            }
            textView.setVisibility(i17);
        }
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, this.f11905a);
        int i22 = 0;
        while (true) {
            y80VarArr = this.f11936y;
            if (i22 >= 2) {
                break;
            }
            y80 y80Var = this.f11927r[i22];
            if (stargiftattributebackdropArr[Math.min(1, i22)] == null) {
                i13 = v02;
            } else {
                i13 = -1;
            }
            y80Var.setTextColor(i13);
            y80 y80Var2 = y80VarArr[i22];
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
                i14 = i0.a.d(this.f11924o0, i15, i16);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i22];
                if (stargiftattributebackdrop3 == null) {
                    i14 = v02;
                } else {
                    i14 = stargiftattributebackdrop3.text_color | (-16777216);
                }
            }
            y80Var2.setTextColor(i14);
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
            LinearLayout.LayoutParams[] layoutParamsArr2 = this.A;
            LinearLayout.LayoutParams layoutParams = layoutParamsArr2[i22];
            if (i22 == 1) {
                f11 = 7.33f;
            } else if (stargiftattributebackdropArr[0] == null) {
                f11 = 9.0f;
            } else {
                f11 = 5.66f;
            }
            layoutParams.topMargin = AndroidUtilities.dp(f11 - 4.0f);
            if (z11) {
                viewArr[i22].setLayoutParams(layoutParamsArr[i22]);
                if (i22 == 0) {
                    this.f11935x.setLayoutParams(layoutParamsArr2[i22]);
                } else {
                    y80VarArr[i22].setLayoutParams(layoutParamsArr2[i22]);
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
        this.v.setBackground(org.telegram.ui.ActionBar.g6.b0(dp, d));
        y80 y80Var3 = y80VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            v02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        y80Var3.setTextColor(v02);
        org.telegram.ui.Components.t9[] t9VarArr = this.d;
        org.telegram.ui.Components.t9 t9Var = t9VarArr[0];
        a5.d dVar2 = this.Q;
        if (dVar2.b(0) && dVar2.b(2)) {
            max = 1.0f;
        } else {
            max = Math.max(dVar2.a(0), dVar2.a(2));
        }
        t9Var.setAlpha(Math.max(max, this.Q.a(3)));
        t9VarArr[1].setAlpha((1.0f - this.f11924o0) * dVar.a(1));
        t9VarArr[2].setAlpha(dVar.a(1) * this.f11924o0);
        float lerp3 = AndroidUtilities.lerp(1.0f, this.f11910c0, dVar.a(2));
        FrameLayout frameLayout = this.f11907b;
        frameLayout.setScaleX(lerp3);
        frameLayout.setScaleY(AndroidUtilities.lerp(1.0f, this.f11910c0, dVar.a(2)));
        frameLayout.setTranslationX(dVar.a(2) * this.f11906a0);
        frameLayout.setTranslationY((dVar.a(2) * this.f11908b0) + (dVar.a(1) * AndroidUtilities.dp(16.0f)));
        View view2 = viewArr[2];
        int i23 = dVar.f162a;
        if (i23 == 2 && i21 == 2) {
            a2 = 0.0f;
        } else {
            if (i23 != 2) {
                i21 = i23;
            }
            a2 = (1.0f - dVar.a(2)) * (-(viewArr[i21].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view2.setTranslationY(a2);
        if (this.V && this.Q.b(0)) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        ih.z1 z1Var = this.f11922n;
        z1Var.setVisibility(i12);
        z1Var.setAlpha(this.Q.a(0));
        if (dVar.a(4) <= 0.0f) {
            i19 = 8;
        }
        g4 g4Var = this.H;
        g4Var.setVisibility(i19);
        g4Var.setAlpha(dVar.a(4));
        invalidate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float max;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        float f9;
        float f10;
        float f11;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        float f12;
        d5 d5Var;
        Canvas canvas2;
        v4 v4Var;
        float max2;
        float realHeight = getRealHeight();
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float width = getWidth() / 2.0f;
        float dp = AndroidUtilities.dp(80.0f) + AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), this.Q.a(1));
        a5.d dVar = this.Q;
        if ((dVar.b(0) && dVar.b(2)) || ((dVar.b(2) && dVar.b(3)) || (dVar.b(3) && dVar.b(0)))) {
            max = 1.0f;
        } else {
            max = Math.max(dVar.a(0), Math.max(dVar.a(2), dVar.a(3)));
        }
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.R;
        int i10 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
        if (i10 > 0 && stargiftattributebackdropArr2[0] != null) {
            if (this.f11918i0 != null && this.Q.a(2) >= 1.0f) {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            } else {
                Paint[] paintArr = this.f11915f0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.f11917h0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, dp);
                this.f11916g0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            }
            if (this.f11918i0 != null && this.Q.a(2) > 0.0f) {
                Paint paint = this.f11920k0;
                paint.setAlpha((int) (this.Q.a(2) * 255.0f));
                Matrix matrix = this.f11919j0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.f11918i0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        } else {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        }
        if (this.Q.a(1) > 0.0f) {
            f9 = width;
            f10 = dp;
            j(b(canvas, f9, f10, getWidth(), realHeight));
        } else {
            f9 = width;
            f10 = dp;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
        int[] iArr4 = this.f11933v0;
        int[] iArr5 = this.f11932u0;
        int[] iArr6 = this.f11931t0;
        if (stargiftattributebackdrop != null) {
            for (int i11 = 0; i11 < iArr6.length; i11++) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                iArr5[i11] = stargiftattributebackdrop2.text_color | (-16777216);
                iArr6[i11] = i0.a.d(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i11] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
            }
        }
        v4 v4Var2 = this.f11909c;
        if (v4Var2.f12959s == null && v4Var2.v == null && v4Var2.f12960w == null) {
            d5Var = this;
            f12 = f9;
            f11 = f10;
            iArr3 = iArr4;
            iArr = iArr5;
            iArr2 = iArr6;
            v4Var = v4Var2;
            canvas2 = canvas;
        } else {
            float width2 = getWidth();
            float f13 = f9;
            p4 p4Var = v4Var2.f12959s;
            float f14 = f10;
            float f15 = v4Var2.f12961x;
            int[] iArr7 = this.f11932u0;
            int[] iArr8 = this.f11931t0;
            int[] iArr9 = this.f11933v0;
            f11 = f14;
            iArr = iArr5;
            iArr2 = iArr6;
            iArr3 = iArr4;
            f12 = f13;
            d5Var = this;
            canvas2 = canvas;
            v4Var2.a(canvas2, p4Var, f15, width2, realHeight, iArr7, iArr8, iArr9);
            v4Var2.a(canvas2, v4Var2.v, v4Var2.f12962y, width2, realHeight, iArr7, iArr8, iArr9);
            v4Var2.a(canvas2, v4Var2.f12960w, v4Var2.A, width2, realHeight, iArr7, iArr8, iArr9);
            v4Var = v4Var2;
            d5Var.invalidate();
        }
        if (i10 > 0 && stargiftattributebackdropArr[0] != null) {
            int i12 = iArr3[iArr3.length / 2];
            a5.d dVar2 = d5Var.Q;
            if (dVar2.b(0) && dVar2.b(3)) {
                max2 = 1.0f;
            } else {
                max2 = Math.max(dVar2.a(0), dVar2.a(3));
            }
            org.telegram.ui.Components.n5[] n5VarArr = d5Var.m0;
            if (max2 > 0.0f) {
                canvas2.save();
                canvas2.translate(f12, f11);
                n5VarArr[0].k(Integer.valueOf(i12));
                x0.a(canvas, 0, n5VarArr[0], d5Var.getWidth(), realHeight, max2, 1.0f);
                realHeight = realHeight;
                canvas.restore();
            }
            if (d5Var.Q.a(2) > 0.0f) {
                canvas.save();
                n5VarArr[0].k(Integer.valueOf(i12));
                float f16 = realHeight;
                RectF rectF = AndroidUtilities.rectTmp;
                LinearLayout[] linearLayoutArr = d5Var.f11914f;
                float x4 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = d5Var.F;
                float x10 = frameLayout.getX() + x4;
                org.telegram.ui.Components.t9 t9Var = d5Var.G;
                rectF.set(t9Var.getX() + x10, t9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), t9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + t9Var.getWidth(), t9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + t9Var.getHeight());
                x0.c(canvas, n5VarArr[0], d5Var.getWidth(), f16 * 0.7f, 1.0f, rectF, d5Var.Q.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            bg.d1[] d1VarArr = d5Var.E;
            int length = d1VarArr.length;
            int i13 = 0;
            while (i13 < length) {
                bg.d1 d1Var = d1VarArr[i13];
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.g6.B1(d1Var.getBackground(), iArr10[Utilities.clamp(Math.round((((d1Var.getWidth() / 2.0f) + d1Var.getX()) / d5Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    d1Var.invalidate();
                }
                i13++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i14 = iArr11[iArr11.length / 2];
            int i15 = iArr12[iArr12.length / 2];
            TextView textView = d5Var.v;
            if (textView != null && d5Var.f11934w != i14) {
                d5Var.f11934w = i14;
                textView.setTextColor(i14);
                org.telegram.ui.ActionBar.g6.B1(textView.getBackground(), i15, false);
            }
            if (v4Var.f12959s != null || v4Var.v != null || v4Var.f12960w != null) {
                d5Var.f11936y[0].setTextColor(i14);
            }
            if (d5Var.Q.a(2) > 0.0f) {
                if (d5Var.f11930s0 == null) {
                    d5Var.f11930s0 = new va(1, 12);
                }
                FrameLayout frameLayout2 = d5Var.f11907b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / 2.0f) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / 2.0f;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / 2.0f) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / 2.0f;
                float f17 = measuredHeight + scaleY;
                RectF rectF2 = d5Var.f11928r0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f17);
                d5Var.f11930s0.g(rectF2);
                d5Var.f11930s0.d();
                d5Var.f11930s0.a(canvas2, org.telegram.ui.ActionBar.g6.l1(d5Var.Q.a(2), -1));
                d5Var.invalidate();
            }
        }
        if (d5Var.Q.a(1) > 0.0f) {
            d5Var.c(canvas2, f12, f11, d5Var.getWidth(), d5Var.getRealHeight());
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
        RadialGradient[] radialGradientArr = this.f11916g0;
        radialGradientArr[i10] = radialGradient;
        if (i10 == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.f11918i0 = radialGradient2;
            this.f11920k0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.f11917h0;
        if (matrixArr[i10] == null) {
            matrixArr[i10] = new Matrix();
        }
        this.f11915f0[i10].setShader(radialGradientArr[i10]);
    }

    public final void f(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        kf.b bVar;
        boolean z14;
        int i10;
        int i11;
        this.I = false;
        if (!z10 && !z11) {
            z13 = false;
        } else {
            z13 = true;
        }
        boolean z15 = starGift instanceof TL_stars.TL_starGiftUnique;
        int i12 = 8;
        ua1 ua1Var = this.D;
        y80[] y80VarArr = this.f11936y;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.R;
        if (z15) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) s7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) s7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            y80VarArr[0].setTextSize(1, 13.0f);
            if (z13) {
                i12 = 0;
            }
            ua1Var.setVisibility(i12);
            bg.d1[] d1VarArr = this.E;
            if (z13) {
                bg.d1 d1Var = d1VarArr[1];
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
                d1Var.b(i10, LocaleController.getString(i11), false);
            }
            float f9 = 1.0f;
            if (starGift.resell_amount != null) {
                this.I = true;
                boolean z16 = starGift.resale_ton_only;
                kf.b bVar2 = kf.b.f13636b;
                if (z16) {
                    bVar = bVar2;
                } else {
                    bVar = kf.b.f13635a;
                }
                kf.a resellAmount = starGift.getResellAmount(bVar);
                int i13 = R.string.GiftOnSale;
                if (resellAmount.f13633a == bVar2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                CharSequence formatSpannable = LocaleController.formatSpannable(i13, ia.S0("⭐️ " + ((Object) ia.J0(resellAmount.o(), 1.0f, ',')), z14), Float.valueOf(0.9f));
                TextView textView = this.J;
                textView.setText(formatSpannable);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(12.0f), i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                if (h5.N1(UserConfig.selectedAccount, DialogObject.getPeerDialogId(starGift.owner_id))) {
                    textView.setOnClickListener(new y4(this, 1));
                    i7.h6.a(textView);
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                }
            }
            if (z10) {
                d1VarArr[0].setAlpha(1.0f);
                d1VarArr[0].b(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
            } else {
                d1VarArr[0].setAlpha(0.5f);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                spannableStringBuilder.setSpan(new iq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTransfer));
                d1VarArr[0].b(R.drawable.filled_gift_transfer, spannableStringBuilder, false);
            }
            bg.d1 d1Var2 = d1VarArr[1];
            if (!z10 && !z11) {
                f9 = 0.5f;
            }
            d1Var2.setAlpha(f9);
            if (z10) {
                ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                View.OnClickListener onClickListener = this.O;
                if (arrayList != null) {
                    d1VarArr[2].b(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), false);
                    d1VarArr[2].setOnClickListener(onClickListener);
                } else {
                    d1VarArr[2].b(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), false);
                    d1VarArr[2].setOnClickListener(onClickListener);
                }
            } else {
                d1VarArr[2].b(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                d1VarArr[2].setOnClickListener(this.N);
            }
            this.V = starGift.crafted;
            this.f11922n.f9557a.d(stargiftattributebackdropArr[0], false, true);
        } else {
            stargiftattributebackdropArr[0] = null;
            y80VarArr[0].setTextSize(1, 14.0f);
            this.V = false;
            ua1Var.setVisibility(8);
        }
        e(0, stargiftattributebackdropArr[0]);
        ia.a1(this.d[0].getImageReceiver(), starGift, 160);
        this.f11912e[0] = (TL_stars.starGiftAttributeModel) s7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        d(this.Q);
    }

    public final void g(int i10, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z10) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.f11921l0;
            if (stargiftattributepatternArr[i10] != stargiftattributepattern) {
                stargiftattributepatternArr[i10] = stargiftattributepattern;
                this.m0[i10].i(stargiftattributepattern.document, z10);
            }
        }
    }

    public int getFinalHeight() {
        int dp;
        int measuredHeight;
        boolean d = this.Q.d(0);
        float f9 = 10.0f;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.R;
        LinearLayout[] linearLayoutArr = this.f11914f;
        if (d) {
            if (stargiftattributebackdropArr[0] != null) {
                f9 = 24.0f;
            }
            return linearLayoutArr[0].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f9);
        } else if (this.Q.d(1)) {
            if (stargiftattributebackdropArr[1] != null) {
                f9 = 24.0f;
            }
            return linearLayoutArr[1].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f9);
        } else {
            if (this.Q.d(2)) {
                dp = AndroidUtilities.dp(64.0f);
                measuredHeight = linearLayoutArr[2].getMeasuredHeight();
            } else if (this.Q.d(3)) {
                dp = AndroidUtilities.dp(160.0f);
                measuredHeight = linearLayoutArr[3].getMeasuredHeight();
            } else if (!this.Q.d(4)) {
                return 0;
            } else {
                g4 g4Var = this.H;
                if (g4Var.getMeasuredHeight() > 0) {
                    return g4Var.getMeasuredHeight();
                }
                return AndroidUtilities.dp(550.0f);
            }
            return measuredHeight + dp;
        }
    }

    public float getRealHeight() {
        float f9;
        float f10;
        int dp;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.R;
        float f11 = 10.0f;
        if (stargiftattributebackdropArr[0] != null) {
            f9 = 24.0f;
        } else {
            f9 = 10.0f;
        }
        int dp2 = AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f9);
        LinearLayout[] linearLayoutArr = this.f11914f;
        float a2 = (this.Q.a(0) * (linearLayoutArr[0].getMeasuredHeight() + dp2)) + 0.0f;
        if (stargiftattributebackdropArr[1] != null) {
            f10 = 24.0f;
        } else {
            f10 = 10.0f;
        }
        int dp3 = AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f10);
        float a10 = (this.Q.a(2) * (linearLayoutArr[2].getMeasuredHeight() + AndroidUtilities.dp(64.0f))) + (this.Q.a(1) * (linearLayoutArr[1].getMeasuredHeight() + dp3)) + a2;
        if (stargiftattributebackdropArr[0] != null) {
            f11 = 24.0f;
        }
        int dp4 = AndroidUtilities.dp(f11);
        float a11 = (this.Q.a(3) * (linearLayoutArr[3].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + dp4)) + a10;
        g4 g4Var = this.H;
        if (g4Var.getMeasuredHeight() > 0) {
            dp = g4Var.getMeasuredHeight();
        } else {
            dp = AndroidUtilities.dp(550.0f);
        }
        return (this.Q.a(4) * dp) + a11;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        float f9 = this.f11924o0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.R;
        if (f9 > 0.5f) {
            return stargiftattributebackdropArr[2];
        }
        return stargiftattributebackdropArr[1];
    }

    public org.telegram.ui.Components.t9 getUpgradeImageView() {
        float f9 = this.f11924o0;
        org.telegram.ui.Components.t9[] t9VarArr = this.d;
        if (f9 > 0.5f) {
            return t9VarArr[2];
        }
        return t9VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        float f9 = this.f11924o0;
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.f11912e;
        if (f9 > 0.5f) {
            return stargiftattributemodelArr[2];
        }
        return stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.f11921l0[1];
    }

    public final void h(int i10, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence3, TLObject tLObject, Spannable spannable) {
        int i11;
        int i12;
        this.f11927r[i10].setText(charSequence);
        FrameLayout frameLayout = this.f11935x;
        y80[] y80VarArr = this.f11936y;
        y80 y80Var = this.f11929s;
        TextView textView = this.v;
        int i13 = 0;
        if (i10 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            y80Var.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                y80VarArr[i10].setVisibility(8);
            }
        } else if (i10 == 0 && !TextUtils.isEmpty(charSequence3)) {
            y80Var.setText(charSequence3);
            y80Var.setVisibility(0);
            textView.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                y80VarArr[i10].setVisibility(8);
            }
        } else {
            y80VarArr[i10].setText(charSequence2);
            if (i10 == 0) {
                if (TextUtils.isEmpty(charSequence2)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                frameLayout.setVisibility(i12);
            } else {
                y80 y80Var2 = y80VarArr[i10];
                if (TextUtils.isEmpty(charSequence2)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                y80Var2.setVisibility(i11);
            }
            y80Var.setVisibility(8);
            textView.setVisibility(8);
        }
        ih.x0[] x0VarArr = this.B;
        ih.x0 x0Var = x0VarArr[i10];
        if (x0Var != null) {
            if (TextUtils.isEmpty(spannable)) {
                i13 = 8;
            }
            x0Var.setVisibility(i13);
            x0VarArr[i10].setUser(tLObject);
            x0VarArr[i10].setMessage(spannable);
        }
    }

    public final void i(int i10, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i10, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void k() {
        this.f11910c0 = AndroidUtilities.dpf2(33.33f) / AndroidUtilities.dpf2(160.0f);
        FrameLayout frameLayout = this.f11907b;
        y80[] y80VarArr = this.f11927r;
        this.f11906a0 = ((((Math.min(y80VarArr[2].getPaint().measureText(y80VarArr[2].getText().toString()), y80VarArr[2].getWidth()) + y80VarArr[2].getWidth()) / 2.0f) + (y80VarArr[2].getX() + (-frameLayout.getLeft()))) + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(126.67f) / 2.0f);
        this.f11908b0 = (AndroidUtilities.dp(124.0f) + (-frameLayout.getTop())) - (AndroidUtilities.dp(126.67f) / 2.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.n5[] n5VarArr = this.m0;
        n5VarArr[0].a();
        n5VarArr[1].a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.n5[] n5VarArr = this.m0;
        n5VarArr[0].b();
        n5VarArr[1].b();
        AndroidUtilities.cancelRunOnUIThread(this.f11913e0);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Q.b(2)) {
            k();
            d(this.Q);
        }
    }

    public void setPreviewAttributes(f1 f1Var) {
        a5.d dVar = this.Q;
        if (dVar != null && dVar.f163b == 1 && isAttachedToWindow()) {
            AndroidUtilities.cancelRunOnUIThread(this.f11913e0);
            ValueAnimator valueAnimator = this.f11911d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f11911d0 = null;
            }
            int i10 = 1 - this.f11923n0;
            this.f11923n0 = i10;
            org.telegram.ui.Components.t9[] t9VarArr = this.d;
            xi0 lottieAnimation = t9VarArr[2 - i10].getImageReceiver().getLottieAnimation();
            xi0 lottieAnimation2 = t9VarArr[this.f11923n0 + 1].getImageReceiver().getLottieAnimation();
            if (lottieAnimation2 != null && lottieAnimation != null) {
                lottieAnimation2.Q(lottieAnimation.r(), false);
            }
            int i11 = this.f11923n0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = f1Var.f12043a;
            this.R[i11] = stargiftattributebackdrop;
            e(i11, stargiftattributebackdrop);
            g(1, f1Var.f12044b, true);
            int i12 = this.f11923n0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = f1Var.f12045c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.f11912e;
            stargiftattributemodelArr[i12] = stargiftattributemodel;
            ia.Z0(t9VarArr[i12].getImageReceiver(), stargiftattributemodelArr[this.f11923n0 + 1].document, 160);
            a();
            float f9 = this.f11923n0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f9, f9);
            this.f11911d0 = ofFloat;
            ofFloat.addUpdateListener(new z4(this, 0));
            this.f11911d0.addListener(new b5(this, 3));
            this.f11911d0.setDuration(320L);
            this.f11911d0.setInterpolator(jr.h);
            this.f11911d0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.S = new com.google.android.gms.common.api.internal.r(s7.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.T = new com.google.android.gms.common.api.internal.r(s7.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.U = new com.google.android.gms.common.api.internal.r(s7.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.f11936y[1].setTextSize(1, 14.0f);
        this.D.setVisibility(8);
        this.f11924o0 = 0.0f;
        this.f11923n0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.T.c(), true);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.f11912e;
        stargiftattributemodelArr[1] = (TL_stars.starGiftAttributeModel) this.S.c();
        org.telegram.ui.Components.t9[] t9VarArr = this.d;
        ia.Z0(t9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, 160);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.U.c();
        this.R[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.S.f3911f;
        ia.Z0(t9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, 160);
        o oVar = this.f11913e0;
        AndroidUtilities.cancelRunOnUIThread(oVar);
        AndroidUtilities.runOnUIThread(oVar, 2500L);
        invalidate();
    }

    public void setResellPrice(kf.a aVar) {
        boolean z10;
        boolean k9 = aVar.k();
        this.I = !k9;
        y80[] y80VarArr = this.f11936y;
        TextView textView = this.J;
        if (!k9) {
            int i10 = R.string.GiftOnSale;
            if (aVar.f13633a == kf.b.f13636b) {
                z10 = true;
            } else {
                z10 = false;
            }
            textView.setText(LocaleController.formatSpannable(i10, ia.U0(z10, "⭐️ " + ((Object) ia.J0(aVar.o(), 1.0f, ',')), 0.9f, null, 0.0f, 1.0f)));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.R[0];
            textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(12.0f), i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.W = true;
            ViewPropertyAnimator duration = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            jr jrVar = jr.h;
            duration.setInterpolator(jrVar).setListener(new b5(this, 0)).start();
            y80VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(jrVar).start();
        } else {
            ViewPropertyAnimator duration2 = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            jr jrVar2 = jr.h;
            duration2.setInterpolator(jrVar2).setListener(new b5(this, 2)).setListener(new b5(this, 1)).start();
            y80VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(jrVar2).start();
        }
        boolean z11 = this.I;
        bg.d1[] d1VarArr = this.E;
        if (z11) {
            d1VarArr[2].b(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), true);
        } else {
            d1VarArr[2].b(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), true);
        }
        d1VarArr[2].setOnClickListener(this.O);
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
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.p(tLObject);
        this.G.e(tLObject, e9Var);
        this.f11927r[2].setText(str2);
        this.f11936y[2].setText(str);
        k();
        d(this.Q);
    }

    public void j(int i10) {
    }
}
