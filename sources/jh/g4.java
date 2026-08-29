package jh;

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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.th;
public final class g4 extends FrameLayout {
    public final org.telegram.ui.Components.x5 A;
    public final w3 B;
    public final LinearLayout C;
    public final org.telegram.ui.Components.o6 D;
    public final org.telegram.ui.Components.o6 E;
    public final aj0 F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final LinearLayout J;
    public ih.y1[] K;
    public final FrameLayout L;
    public final FrameLayout M;
    public final FrameLayout N;
    public final FrameLayout O;
    public nh.t3 P;
    public final int[] Q;
    public final int[] R;
    public int S;
    public long T;
    public TLRPC.Document U;
    public String V;
    public ArrayList W;
    public final org.telegram.ui.ActionBar.c6 f12098a;
    public Utilities.Callback3 f12099a0;
    public final f4 f12100b;
    public Utilities.Callback2 f12101b0;
    public final ImageView f12102c;
    public Runnable f12103c0;
    public final a4[] d;
    public boolean f12104d0;
    public final a4 f12105e;
    public boolean f12106e0;
    public final c4 f12107f;
    public boolean f12108f0;
    public Runnable f12109g0;
    public final z3 h;
    public aj0 f12110h0;
    public SpannableStringBuilder f12111i0;
    public final e4[] f12112n;
    public final gh.s f12113r;
    public boolean f12114s;
    public final LinearLayout v;
    public final LinearLayout f12115w;
    public final v3[] f12116x;
    public final v3[] f12117y;

    public g4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        float f9;
        boolean z10;
        float f10;
        int i10;
        this.Q = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.R = new int[]{org.telegram.ui.ActionBar.g6.l1(0.08f, -1), org.telegram.ui.ActionBar.g6.l1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.f12098a = c6Var;
        f4 f4Var = new f4();
        this.f12100b = f4Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        f4Var.f12062g = mutate;
        setBackground(f4Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        addView(frameLayout, i7.f6.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.f12102c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new t4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.l1(0.08f, -1)));
        frameLayout.addView(imageView, i7.f6.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new t3(this, 0));
        i7.h6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setBackground(new t4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.l1(0.08f, -1)));
        frameLayout.addView(imageView2, i7.f6.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView2.setOnClickListener(new t3(this, 1));
        i7.h6.a(imageView2);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
        addView(textView, i7.f6.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        addView(frameLayout2, i7.f6.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.N = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, i7.f6.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.O = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, i7.f6.e(-1, -1, 119));
        gh.s sVar = new gh.s(context);
        this.f12113r = sVar;
        sVar.setGravity(17);
        sVar.setTextSize(1, 13.0f);
        sVar.setTextColor(-1);
        frameLayout2.addView(sVar, i7.f6.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(2, 320L);
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        jr jrVar = jr.h;
        layoutTransition.setInterpolator(2, jrVar);
        layoutTransition.setInterpolator(3, jrVar);
        layoutTransition.setInterpolator(0, jrVar);
        layoutTransition.setInterpolator(1, jrVar);
        layoutTransition.setInterpolator(4, jrVar);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f12115w = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, jrVar);
        layoutTransition2.setInterpolator(3, jrVar);
        layoutTransition2.setInterpolator(0, jrVar);
        layoutTransition2.setInterpolator(1, jrVar);
        layoutTransition2.setInterpolator(4, jrVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.f12116x = new v3[4];
        this.f12117y = new v3[4];
        for (int i11 = 0; i11 < 4; i11++) {
            LinearLayout linearLayout3 = this.v;
            v3[] v3VarArr = this.f12116x;
            v3 v3Var = new v3(context);
            v3VarArr[i11] = v3Var;
            linearLayout3.addView(v3Var, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f12116x[i11].setOnClickListener(new t3(this, 2));
        }
        for (int i12 = 0; i12 < 4; i12++) {
            LinearLayout linearLayout4 = this.v;
            v3[] v3VarArr2 = this.f12117y;
            v3 v3Var2 = new v3(context);
            v3VarArr2[i12] = v3Var2;
            linearLayout4.addView(v3Var2, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f12117y[i12].setOnClickListener(new t3(this, 3));
        }
        this.f12112n = new e4[4];
        this.d = new a4[6];
        int i13 = 0;
        for (int i14 = 6; i13 < i14; i14 = 6) {
            a4[] a4VarArr = this.d;
            if (i13 == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            ?? frameLayout5 = new FrameLayout(context);
            FrameLayout frameLayout6 = new FrameLayout(context);
            frameLayout6.setBackground(new t4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.l1(0.08f, -1)));
            frameLayout5.addView(frameLayout6, i7.f6.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
            t9Var.setImageResource(R.drawable.large_forge);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.45f;
            }
            t9Var.setAlpha(f10);
            if (z10) {
                i10 = 42;
            } else {
                i10 = 64;
            }
            frameLayout6.addView(t9Var, i7.f6.e(i10, z10 ? 42 : 64, 17));
            if (z10) {
                t9Var.setTranslationX(AndroidUtilities.dp(-4.0f));
                b4 b4Var = new b4(context);
                frameLayout5.f11722b = b4Var;
                b4Var.f11796e = AndroidUtilities.dp(37.0f);
                b4Var.f11793a.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                frameLayout6.addView(b4Var, i7.f6.e(90, 90, 17));
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
                frameLayout5.f11721a = o6Var;
                o6Var.getDrawable().o(false, true, false);
                o6Var.setTypeface(AndroidUtilities.bold());
                o6Var.setTextColor(-1);
                o6Var.setTextSize(AndroidUtilities.dp(14.0f));
                o6Var.setGravity(17);
                o6Var.setText("0%");
                frameLayout6.addView(o6Var, i7.f6.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            a4VarArr[i13] = frameLayout5;
            i13++;
        }
        this.f12105e = this.d[5];
        c4 c4Var = new c4(context);
        this.f12107f = c4Var;
        c4Var.setVisibility(8);
        c4Var.setAlpha(0.0f);
        addView(c4Var, i7.f6.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        z3 z3Var = new z3(context, this.d);
        this.h = z3Var;
        addView(z3Var, i7.f6.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.A = x5Var;
        x5Var.setTextSize(1, 12.0f);
        x5Var.setTypeface(AndroidUtilities.bold());
        x5Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        x5Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        x5Var.setGravity(17);
        x5Var.setTextColor(-1);
        if (this.W != null) {
            f9 = 1.0f;
        } else {
            f9 = 0.25f;
        }
        x5Var.setAlpha(f9);
        x5Var.setBackground(new t4(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.l1(0.08f, -1)));
        i7.h6.b(x5Var, 0.02f, 1.2f);
        this.M.addView(x5Var, i7.f6.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        x5Var.setOnClickListener(new ag.n(23, this, c6Var));
        this.M.addView(this.v, i7.f6.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.M.addView(this.f12115w, i7.f6.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.C = linearLayout5;
        linearLayout5.setOrientation(1);
        w3 w3Var = new w3();
        this.B = w3Var;
        linearLayout5.setBackground(w3Var);
        w3Var.a(org.telegram.ui.ActionBar.g6.l1(0.08f, -1), org.telegram.ui.ActionBar.g6.l1(0.08f, -1));
        i7.h6.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, i7.f6.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new t3(this, 4));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.D = o6Var2;
        o6Var2.setTypeface(AndroidUtilities.bold());
        o6Var2.setGravity(17);
        o6Var2.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.75f, -1));
        o6Var2.setText(LocaleController.getString(R.string.GiftCraftButton));
        o6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout5.addView(o6Var2, i7.f6.r(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var3 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.E = o6Var3;
        o6Var3.getDrawable().o(true, false, false);
        o6Var3.setGravity(17);
        o6Var3.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.75f, -1));
        o6Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
        o6Var3.setTextSize(AndroidUtilities.dp(12.0f));
        linearLayout5.addView(o6Var3, i7.f6.r(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ?? imageView3 = new ImageView(context);
        this.F = imageView3;
        imageView3.setAutoRepeat(true);
        imageView3.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView((View) imageView3, i7.f6.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftCraftProgressTitle));
        linearLayout6.addView(textView2, i7.f6.t(-2, -2, 17, 0, 0, 0, 0));
        this.N.addView(linearLayout6, i7.f6.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.G = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.5f, -1));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        TextView h = th.h(this.N, textView3, i7.f6.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.H = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(-1);
        h.setTypeface(AndroidUtilities.bold());
        h.setGravity(17);
        h.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        h.setBackground(new t4(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.l1(0.08f, -1)));
        TextView h10 = th.h(this.N, h, i7.f6.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        h10.setTextSize(1, 13.0f);
        h10.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.5f, -1));
        h10.setGravity(17);
        h10.setText(LocaleController.getString(R.string.GiftCraftProgressText));
        TextView h11 = th.h(this.N, h10, i7.f6.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        h11.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
        h11.setTextColor(-505270);
        h11.setTextSize(1, 20.0f);
        h11.setTypeface(AndroidUtilities.bold());
        h11.setGravity(17);
        TextView h12 = th.h(this.O, h11, i7.f6.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.I = h12;
        h12.setTextColor(-17253);
        h12.setTextSize(1, 13.0f);
        h12.setGravity(17);
        this.O.addView(h12, i7.f6.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.J = linearLayout7;
        linearLayout7.setOrientation(0);
        this.O.addView(linearLayout7, i7.f6.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.K = null;
        d(true);
    }

    public final void a(int i10, long j10, TLRPC.Document document, String str) {
        e4[] e4VarArr;
        float f9;
        this.S = i10;
        this.T = j10;
        this.U = document;
        this.V = str;
        this.f12104d0 = false;
        this.f12108f0 = false;
        int i11 = 0;
        while (true) {
            e4VarArr = this.f12112n;
            if (i11 >= e4VarArr.length) {
                break;
            }
            e4 e4Var = e4VarArr[i11];
            if (e4Var != null) {
                AndroidUtilities.removeFromParent(e4Var);
            }
            i11++;
        }
        z3 z3Var = this.h;
        View[] viewArr = z3Var.f13158a;
        y3 y3Var = z3Var.D;
        if (y3Var != null) {
            y3Var.f13117e = true;
            y3Var.f13123l = false;
            y3Var.f13114a.D = null;
            z3Var.D = null;
        }
        ValueAnimator valueAnimator = z3Var.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            z3Var.C = null;
        }
        z3Var.B = -1;
        z3Var.A = 0.0f;
        z3Var.v.clear();
        z3Var.f13166w.clear();
        z3Var.f13167x.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            z3Var.f13168y[i12] = 0.0f;
        }
        z3Var.removeAllViews();
        for (int i13 = 0; i13 < viewArr.length; i13++) {
            viewArr[i13].setAlpha(1.0f);
            viewArr[i13].setVisibility(0);
            z3Var.addView(viewArr[i13], i7.f6.e(108, 108, 17));
        }
        Matrix.setIdentityM(z3Var.f13160c, 0);
        z3Var.f13161e = 0.0f;
        z3Var.d = 0.0f;
        z3Var.f13162f = true;
        e4 e4Var2 = new e4(getContext());
        e4VarArr[0] = e4Var2;
        addView(e4Var2, i7.f6.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        e4 e4Var3 = new e4(getContext());
        e4VarArr[1] = e4Var3;
        addView(e4Var3, i7.f6.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        e4 e4Var4 = new e4(getContext());
        e4VarArr[2] = e4Var4;
        addView(e4Var4, i7.f6.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        e4 e4Var5 = new e4(getContext());
        e4VarArr[3] = e4Var5;
        addView(e4Var5, i7.f6.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i14 = 0; i14 < e4VarArr.length; i14++) {
            i7.h6.a(e4VarArr[i14]);
            e4VarArr[i14].setClickable(true);
            e4VarArr[i14].setOnClickListener(new t3(this, 5));
        }
        d(false);
        this.f12104d0 = false;
        FrameLayout frameLayout = this.M;
        frameLayout.animate().cancel();
        frameLayout.setAlpha(1.0f);
        LinearLayout linearLayout = this.C;
        linearLayout.animate().cancel();
        linearLayout.setAlpha(1.0f);
        FrameLayout frameLayout2 = this.N;
        frameLayout2.animate().cancel();
        frameLayout2.setAlpha(0.0f);
        FrameLayout frameLayout3 = this.O;
        frameLayout3.animate().cancel();
        frameLayout3.setAlpha(0.0f);
        FrameLayout frameLayout4 = this.L;
        frameLayout4.animate().cancel();
        frameLayout4.setAlpha(1.0f);
        if (this.f12114s) {
            f9 = 0.0f;
        } else if (this.W != null) {
            f9 = 1.0f;
        } else {
            f9 = 0.25f;
        }
        this.A.setAlpha(f9);
        c4 c4Var = this.f12107f;
        c4Var.setVisibility(8);
        c4Var.setAlpha(0.0f);
        String string = LocaleController.getString(R.string.GiftCraftButton);
        org.telegram.ui.Components.o6 o6Var = this.D;
        o6Var.setText(string);
        o6Var.setTranslationY(0.0f);
        this.E.setAlpha(1.0f);
        GiftAuctionController.getInstance(i10).requestAuctionUpgrades(j10, new u3(this, j10, j10, 0));
    }

    public final void b(v3 v3Var) {
        if (v3Var.d != null) {
            c(v3Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(v3Var.f12951f * 100.0f), v3Var.d.name)));
        } else if (v3Var.f12950e != null) {
            c(v3Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(v3Var.f12951f * 100.0f), v3Var.f12950e.name)));
        }
    }

    public final void c(v3 v3Var, SpannableStringBuilder spannableStringBuilder) {
        float f9;
        float f10;
        nh.t3 t3Var = this.P;
        View view = null;
        if (t3Var != null) {
            t3Var.e(true);
            this.P = null;
        }
        if (!this.f12104d0 && !this.f12108f0) {
            if (v3Var.getParent() instanceof View) {
                view = (View) v3Var.getParent();
            }
            if (view != null) {
                f9 = view.getX();
            } else {
                f9 = 0.0f;
            }
            float x4 = v3Var.getX() + f9;
            if (view != null) {
                f10 = view.getY();
            } else {
                f10 = 0.0f;
            }
            float y8 = v3Var.getY() + f10;
            nh.t3 t3Var2 = new nh.t3(getContext(), 3);
            this.P = t3Var2;
            t3Var2.q(true);
            this.P.t(spannableStringBuilder);
            nh.t3 t3Var3 = this.P;
            t3Var3.h = nh.t3.a(t3Var3.getText(), this.P.getTextPaint());
            nh.t3 t3Var4 = this.P;
            t3Var4.G = Layout.Alignment.ALIGN_CENTER;
            t3Var4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            addView(this.P, i7.f6.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            this.P.setTranslationY(y8 - AndroidUtilities.dp(100.0f));
            this.P.n(0.0f, ((v3Var.getWidth() / 2.0f) + x4) - AndroidUtilities.dp(2.0f));
            this.P.v();
        }
    }

    public final void d(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: jh.g4.d(boolean):void");
    }

    public TL_stars.StarGift getFirstGift() {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            e4[] e4VarArr = this.f12112n;
            if (i10 >= e4VarArr.length) {
                return null;
            }
            e4 e4Var = e4VarArr[i10];
            if (e4Var != null) {
                TL_stars.StarGift starGift2 = e4Var.h;
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
            e4[] e4VarArr = this.f12112n;
            if (i10 < e4VarArr.length) {
                e4 e4Var = e4VarArr[i10];
                if (e4Var != null) {
                    TL_stars.StarGift starGift = e4Var.h;
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
            e4[] e4VarArr = this.f12112n;
            if (i10 < e4VarArr.length) {
                e4 e4Var = e4VarArr[i10];
                if (e4Var != null) {
                    TL_stars.StarGift starGift2 = e4Var.h;
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
        this.f12101b0 = callback2;
    }

    public void setOnClose(Runnable runnable) {
        this.f12103c0 = runnable;
    }

    public void setOnCraft(Utilities.Callback3<ArrayList<TL_stars.StarGift>, Utilities.Callback2<TL_stars.StarGift, Runnable>, Runnable> callback3) {
        this.f12099a0 = callback3;
    }
}
