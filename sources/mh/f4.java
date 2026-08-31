package mh;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.opengl.Matrix;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.yh;
public final class f4 extends FrameLayout {
    public final org.telegram.ui.Components.t5 B;
    public final v3 C;
    public final LinearLayout D;
    public final org.telegram.ui.Components.k6 E;
    public final org.telegram.ui.Components.k6 F;
    public final lj0 G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final LinearLayout K;
    public lh.x1[] L;
    public final FrameLayout M;
    public final FrameLayout N;
    public final FrameLayout O;
    public final FrameLayout P;
    public qh.f3 Q;
    public final int[] R;
    public final int[] S;
    public int T;
    public long U;
    public TLRPC.Document V;
    public String W;
    public final org.telegram.ui.ActionBar.g6 f14014a;
    public ArrayList f14015a0;
    public final e4 f14016b;
    public Utilities.Callback3 f14017b0;
    public final ImageView f14018c;
    public Utilities.Callback2 f14019c0;
    public final z3[] d;
    public Runnable f14020d0;
    public final z3 f14021e;
    public boolean f14022e0;
    public final b4 f14023f;
    public boolean f14024f0;
    public boolean f14025g0;
    public final y3 h;
    public Runnable f14026h0;
    public lj0 f14027i0;
    public SpannableStringBuilder f14028j0;
    public final d4[] f14029n;
    public final jh.s f14030r;
    public boolean f14031s;
    public final LinearLayout v;
    public final LinearLayout f14032w;
    public final u3[] f14033x;
    public final u3[] f14034y;

    public f4(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        float f10;
        boolean z4;
        float f11;
        int i10;
        this.R = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.S = new int[]{org.telegram.ui.ActionBar.k6.l1(0.08f, -1), org.telegram.ui.ActionBar.k6.l1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.f14014a = g6Var;
        e4 e4Var = new e4();
        this.f14016b = e4Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        e4Var.f13949g = mutate;
        setBackground(e4Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.M = frameLayout;
        addView(frameLayout, k7.c6.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.f14018c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new s4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.l1(0.08f, -1)));
        frameLayout.addView(imageView, k7.c6.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new s3(this, 0));
        k7.e6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setBackground(new s4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.l1(0.08f, -1)));
        frameLayout.addView(imageView2, k7.c6.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView2.setOnClickListener(new s3(this, 1));
        k7.e6.a(imageView2);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
        addView(textView, k7.c6.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.N = frameLayout2;
        addView(frameLayout2, k7.c6.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.O = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, k7.c6.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.P = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, k7.c6.e(-1, -1, 119));
        jh.s sVar = new jh.s(context);
        this.f14030r = sVar;
        sVar.setGravity(17);
        sVar.setTextSize(1, 13.0f);
        sVar.setTextColor(-1);
        frameLayout2.addView(sVar, k7.c6.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(2, 320L);
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        pr prVar = pr.h;
        layoutTransition.setInterpolator(2, prVar);
        layoutTransition.setInterpolator(3, prVar);
        layoutTransition.setInterpolator(0, prVar);
        layoutTransition.setInterpolator(1, prVar);
        layoutTransition.setInterpolator(4, prVar);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f14032w = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, prVar);
        layoutTransition2.setInterpolator(3, prVar);
        layoutTransition2.setInterpolator(0, prVar);
        layoutTransition2.setInterpolator(1, prVar);
        layoutTransition2.setInterpolator(4, prVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.f14033x = new u3[4];
        this.f14034y = new u3[4];
        for (int i11 = 0; i11 < 4; i11++) {
            LinearLayout linearLayout3 = this.v;
            u3[] u3VarArr = this.f14033x;
            u3 u3Var = new u3(context);
            u3VarArr[i11] = u3Var;
            linearLayout3.addView(u3Var, k7.c6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f14033x[i11].setOnClickListener(new s3(this, 2));
        }
        for (int i12 = 0; i12 < 4; i12++) {
            LinearLayout linearLayout4 = this.v;
            u3[] u3VarArr2 = this.f14034y;
            u3 u3Var2 = new u3(context);
            u3VarArr2[i12] = u3Var2;
            linearLayout4.addView(u3Var2, k7.c6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f14034y[i12].setOnClickListener(new s3(this, 3));
        }
        this.f14029n = new d4[4];
        this.d = new z3[6];
        int i13 = 0;
        for (int i14 = 6; i13 < i14; i14 = 6) {
            z3[] z3VarArr = this.d;
            if (i13 == 5) {
                z4 = true;
            } else {
                z4 = false;
            }
            ?? frameLayout5 = new FrameLayout(context);
            FrameLayout frameLayout6 = new FrameLayout(context);
            frameLayout6.setBackground(new s4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.l1(0.08f, -1)));
            frameLayout5.addView(frameLayout6, k7.c6.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            p9Var.setImageResource(R.drawable.large_forge);
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.45f;
            }
            p9Var.setAlpha(f11);
            if (z4) {
                i10 = 42;
            } else {
                i10 = 64;
            }
            frameLayout6.addView(p9Var, k7.c6.e(i10, z4 ? 42 : 64, 17));
            if (z4) {
                p9Var.setTranslationX(AndroidUtilities.dp(-4.0f));
                a4 a4Var = new a4(context);
                frameLayout5.f15142b = a4Var;
                a4Var.f13689e = AndroidUtilities.dp(37.0f);
                a4Var.f13686a.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                frameLayout6.addView(a4Var, k7.c6.e(90, 90, 17));
                org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
                frameLayout5.f15141a = k6Var;
                k6Var.getDrawable().o(false, true, false);
                k6Var.setTypeface(AndroidUtilities.bold());
                k6Var.setTextColor(-1);
                k6Var.setTextSize(AndroidUtilities.dp(14.0f));
                k6Var.setGravity(17);
                k6Var.setText("0%");
                frameLayout6.addView(k6Var, k7.c6.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            z3VarArr[i13] = frameLayout5;
            i13++;
        }
        this.f14021e = this.d[5];
        b4 b4Var = new b4(context);
        this.f14023f = b4Var;
        b4Var.setVisibility(8);
        b4Var.setAlpha(0.0f);
        addView(b4Var, k7.c6.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        y3 y3Var = new y3(context, this.d);
        this.h = y3Var;
        addView(y3Var, k7.c6.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(context);
        this.B = t5Var;
        t5Var.setTextSize(1, 12.0f);
        t5Var.setTypeface(AndroidUtilities.bold());
        t5Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        t5Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        t5Var.setGravity(17);
        t5Var.setTextColor(-1);
        if (this.f14015a0 != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.25f;
        }
        t5Var.setAlpha(f10);
        t5Var.setBackground(new s4(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.k6.l1(0.08f, -1)));
        k7.e6.b(t5Var, 0.02f, 1.2f);
        this.N.addView(t5Var, k7.c6.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        t5Var.setOnClickListener(new dg.n(23, this, g6Var));
        this.N.addView(this.v, k7.c6.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.N.addView(this.f14032w, k7.c6.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.D = linearLayout5;
        linearLayout5.setOrientation(1);
        v3 v3Var = new v3();
        this.C = v3Var;
        linearLayout5.setBackground(v3Var);
        v3Var.a(org.telegram.ui.ActionBar.k6.l1(0.08f, -1), org.telegram.ui.ActionBar.k6.l1(0.08f, -1));
        k7.e6.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, k7.c6.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new s3(this, 4));
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(context, false, false, false);
        this.E = k6Var2;
        k6Var2.setTypeface(AndroidUtilities.bold());
        k6Var2.setGravity(17);
        k6Var2.setTextColor(org.telegram.ui.ActionBar.k6.l1(0.75f, -1));
        k6Var2.setText(LocaleController.getString(R.string.GiftCraftButton));
        k6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout5.addView(k6Var2, k7.c6.r(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var3 = new org.telegram.ui.Components.k6(context, false, false, false);
        this.F = k6Var3;
        k6Var3.getDrawable().o(true, false, false);
        k6Var3.setGravity(17);
        k6Var3.setTextColor(org.telegram.ui.ActionBar.k6.l1(0.75f, -1));
        k6Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
        k6Var3.setTextSize(AndroidUtilities.dp(12.0f));
        linearLayout5.addView(k6Var3, k7.c6.r(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ?? imageView3 = new ImageView(context);
        this.G = imageView3;
        imageView3.setAutoRepeat(true);
        imageView3.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView((View) imageView3, k7.c6.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftCraftProgressTitle));
        linearLayout6.addView(textView2, k7.c6.t(-2, -2, 17, 0, 0, 0, 0));
        this.O.addView(linearLayout6, k7.c6.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.H = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.l1(0.5f, -1));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        TextView h = yh.h(this.O, textView3, k7.c6.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.I = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(-1);
        h.setTypeface(AndroidUtilities.bold());
        h.setGravity(17);
        h.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        h.setBackground(new s4(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.k6.l1(0.08f, -1)));
        TextView h9 = yh.h(this.O, h, k7.c6.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        h9.setTextSize(1, 13.0f);
        h9.setTextColor(org.telegram.ui.ActionBar.k6.l1(0.5f, -1));
        h9.setGravity(17);
        h9.setText(LocaleController.getString(R.string.GiftCraftProgressText));
        TextView h10 = yh.h(this.O, h9, k7.c6.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        h10.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
        h10.setTextColor(-505270);
        h10.setTextSize(1, 20.0f);
        h10.setTypeface(AndroidUtilities.bold());
        h10.setGravity(17);
        TextView h11 = yh.h(this.P, h10, k7.c6.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.J = h11;
        h11.setTextColor(-17253);
        h11.setTextSize(1, 13.0f);
        h11.setGravity(17);
        this.P.addView(h11, k7.c6.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.K = linearLayout7;
        linearLayout7.setOrientation(0);
        this.P.addView(linearLayout7, k7.c6.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.L = null;
        d(true);
    }

    public final void a(int i10, long j10, TLRPC.Document document, String str) {
        d4[] d4VarArr;
        float f10;
        this.T = i10;
        this.U = j10;
        this.V = document;
        this.W = str;
        this.f14022e0 = false;
        this.f14025g0 = false;
        int i11 = 0;
        while (true) {
            d4VarArr = this.f14029n;
            if (i11 >= d4VarArr.length) {
                break;
            }
            d4 d4Var = d4VarArr[i11];
            if (d4Var != null) {
                AndroidUtilities.removeFromParent(d4Var);
            }
            i11++;
        }
        y3 y3Var = this.h;
        View[] viewArr = y3Var.f15083a;
        x3 x3Var = y3Var.E;
        if (x3Var != null) {
            x3Var.f15038e = true;
            x3Var.f15044l = false;
            x3Var.f15035a.E = null;
            y3Var.E = null;
        }
        ValueAnimator valueAnimator = y3Var.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            y3Var.D = null;
        }
        y3Var.C = -1;
        y3Var.B = 0.0f;
        y3Var.v.clear();
        y3Var.f15091w.clear();
        y3Var.f15092x.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            y3Var.f15093y[i12] = 0.0f;
        }
        y3Var.removeAllViews();
        for (int i13 = 0; i13 < viewArr.length; i13++) {
            viewArr[i13].setAlpha(1.0f);
            viewArr[i13].setVisibility(0);
            y3Var.addView(viewArr[i13], k7.c6.e(108, 108, 17));
        }
        Matrix.setIdentityM(y3Var.f15085c, 0);
        y3Var.f15086e = 0.0f;
        y3Var.d = 0.0f;
        y3Var.f15087f = true;
        d4 d4Var2 = new d4(getContext());
        d4VarArr[0] = d4Var2;
        addView(d4Var2, k7.c6.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        d4 d4Var3 = new d4(getContext());
        d4VarArr[1] = d4Var3;
        addView(d4Var3, k7.c6.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        d4 d4Var4 = new d4(getContext());
        d4VarArr[2] = d4Var4;
        addView(d4Var4, k7.c6.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        d4 d4Var5 = new d4(getContext());
        d4VarArr[3] = d4Var5;
        addView(d4Var5, k7.c6.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i14 = 0; i14 < d4VarArr.length; i14++) {
            k7.e6.a(d4VarArr[i14]);
            d4VarArr[i14].setClickable(true);
            d4VarArr[i14].setOnClickListener(new s3(this, 5));
        }
        d(false);
        this.f14022e0 = false;
        FrameLayout frameLayout = this.N;
        frameLayout.animate().cancel();
        frameLayout.setAlpha(1.0f);
        LinearLayout linearLayout = this.D;
        linearLayout.animate().cancel();
        linearLayout.setAlpha(1.0f);
        FrameLayout frameLayout2 = this.O;
        frameLayout2.animate().cancel();
        frameLayout2.setAlpha(0.0f);
        FrameLayout frameLayout3 = this.P;
        frameLayout3.animate().cancel();
        frameLayout3.setAlpha(0.0f);
        FrameLayout frameLayout4 = this.M;
        frameLayout4.animate().cancel();
        frameLayout4.setAlpha(1.0f);
        if (this.f14031s) {
            f10 = 0.0f;
        } else if (this.f14015a0 != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.25f;
        }
        this.B.setAlpha(f10);
        b4 b4Var = this.f14023f;
        b4Var.setVisibility(8);
        b4Var.setAlpha(0.0f);
        String string = LocaleController.getString(R.string.GiftCraftButton);
        org.telegram.ui.Components.k6 k6Var = this.E;
        k6Var.setText(string);
        k6Var.setTranslationY(0.0f);
        this.F.setAlpha(1.0f);
        GiftAuctionController.getInstance(i10).requestAuctionUpgrades(j10, new t3(this, j10, j10, 0));
    }

    public final void b(u3 u3Var) {
        if (u3Var.d != null) {
            c(u3Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(u3Var.f14871f * 100.0f), u3Var.d.name)));
        } else if (u3Var.f14870e != null) {
            c(u3Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(u3Var.f14871f * 100.0f), u3Var.f14870e.name)));
        }
    }

    public final void c(u3 u3Var, SpannableStringBuilder spannableStringBuilder) {
        float f10;
        float f11;
        qh.f3 f3Var = this.Q;
        View view = null;
        if (f3Var != null) {
            f3Var.e(true);
            this.Q = null;
        }
        if (!this.f14022e0 && !this.f14025g0) {
            if (u3Var.getParent() instanceof View) {
                view = (View) u3Var.getParent();
            }
            if (view != null) {
                f10 = view.getX();
            } else {
                f10 = 0.0f;
            }
            float x10 = u3Var.getX() + f10;
            if (view != null) {
                f11 = view.getY();
            } else {
                f11 = 0.0f;
            }
            float y10 = u3Var.getY() + f11;
            qh.f3 f3Var2 = new qh.f3(getContext(), 3);
            this.Q = f3Var2;
            f3Var2.q(true);
            this.Q.t(spannableStringBuilder);
            qh.f3 f3Var3 = this.Q;
            f3Var3.h = qh.f3.a(f3Var3.getText(), this.Q.getTextPaint());
            qh.f3 f3Var4 = this.Q;
            f3Var4.H = Layout.Alignment.ALIGN_CENTER;
            f3Var4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            addView(this.Q, k7.c6.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            this.Q.setTranslationY(y10 - AndroidUtilities.dp(100.0f));
            this.Q.n(0.0f, ((u3Var.getWidth() / 2.0f) + x10) - AndroidUtilities.dp(2.0f));
            this.Q.v();
        }
    }

    public final void d(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: mh.f4.d(boolean):void");
    }

    public TL_stars.StarGift getFirstGift() {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            d4[] d4VarArr = this.f14029n;
            if (i10 >= d4VarArr.length) {
                return null;
            }
            d4 d4Var = d4VarArr[i10];
            if (d4Var != null) {
                TL_stars.StarGift starGift2 = d4Var.h;
                if (starGift2 != null) {
                    starGift = starGift2;
                } else {
                    starGift = null;
                }
                if (starGift != null) {
                    if (starGift2 == null) {
                        return null;
                    }
                    return starGift2;
                }
            }
            i10++;
        }
    }

    public int getGiftsSelectedCount() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            d4[] d4VarArr = this.f14029n;
            if (i10 < d4VarArr.length) {
                d4 d4Var = d4VarArr[i10];
                if (d4Var != null) {
                    TL_stars.StarGift starGift = d4Var.h;
                    if (starGift == null) {
                        starGift = null;
                    }
                    if (starGift != null) {
                        i11++;
                    }
                }
                i10++;
            } else {
                return i11;
            }
        }
    }

    public int getGiftsSuccessChance() {
        TL_stars.StarGift starGift;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            d4[] d4VarArr = this.f14029n;
            if (i10 < d4VarArr.length) {
                d4 d4Var = d4VarArr[i10];
                if (d4Var != null) {
                    TL_stars.StarGift starGift2 = d4Var.h;
                    if (starGift2 != null) {
                        starGift = starGift2;
                    } else {
                        starGift = null;
                    }
                    if (starGift != null) {
                        if (starGift2 == null) {
                            starGift2 = null;
                        }
                        i11 += starGift2.craft_chance_permille;
                    }
                }
                i10++;
            } else {
                return i11;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setOnAddGift(Utilities.Callback2<Utilities.Callback<TL_stars.StarGift>, Boolean> callback2) {
        this.f14019c0 = callback2;
    }

    public void setOnClose(Runnable runnable) {
        this.f14020d0 = runnable;
    }

    public void setOnCraft(Utilities.Callback3<ArrayList<TL_stars.StarGift>, Utilities.Callback2<TL_stars.StarGift, Runnable>, Runnable> callback3) {
        this.f14017b0 = callback3;
    }
}
