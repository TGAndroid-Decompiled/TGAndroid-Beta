package hh;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.opengl.Matrix;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Map;
import j$.util.Map$Entry$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ri0;

public final class g4 extends FrameLayout {
    public final org.telegram.ui.Components.s5 A;
    public final w3 B;
    public final LinearLayout C;
    public final org.telegram.ui.Components.j6 D;
    public final org.telegram.ui.Components.j6 E;
    public final ri0 F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final LinearLayout J;
    public gh.b2[] K;
    public final FrameLayout L;
    public final FrameLayout M;
    public final FrameLayout N;
    public final FrameLayout O;
    public lh.w3 P;
    public final int[] Q;
    public final int[] R;
    public int S;
    public long T;
    public TLRPC.Document U;
    public String V;
    public ArrayList W;

    public final org.telegram.ui.ActionBar.c6 f9301a;

    public Utilities.Callback3 f9302a0;

    public final f4 f9303b;

    public Utilities.Callback2 f9304b0;

    public final ImageView f9305c;

    public Runnable f9306c0;
    public final a4[] d;

    public boolean f9307d0;

    public final a4 f9308e;

    public boolean f9309e0;

    public final c4 f9310f;

    public boolean f9311f0;

    public Runnable f9312g0;
    public final z3 h;

    public ri0 f9313h0;

    public SpannableStringBuilder f9314i0;

    public final e4[] f9315n;

    public final eh.s f9316r;

    public boolean f9317s;
    public final LinearLayout v;

    public final LinearLayout f9318w;

    public final v3[] f9319x;

    public final v3[] f9320y;

    public g4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.Q = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.R = new int[]{org.telegram.ui.ActionBar.g6.l1(0.08f, -1), org.telegram.ui.ActionBar.g6.l1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.f9301a = c6Var;
        f4 f4Var = new f4();
        this.f9303b = f4Var;
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        f4Var.f9255g = drawableMutate;
        setBackground(f4Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        addView(frameLayout, h7.z5.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.f9305c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new u4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.l1(0.08f, -1)));
        frameLayout.addView(imageView, h7.z5.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new t3(this, 0));
        h7.b6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setBackground(new u4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.l1(0.08f, -1)));
        frameLayout.addView(imageView2, h7.z5.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView2.setOnClickListener(new t3(this, 1));
        h7.b6.a(imageView2);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
        addView(textView, h7.z5.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        addView(frameLayout2, h7.z5.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.N = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, h7.z5.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.O = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, h7.z5.e(-1, -1, 119));
        eh.s sVar = new eh.s(context);
        this.f9316r = sVar;
        sVar.setGravity(17);
        sVar.setTextSize(1, 13.0f);
        sVar.setTextColor(-1);
        frameLayout2.addView(sVar, h7.z5.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        int i10 = 2;
        layoutTransition.setDuration(2, 320L);
        int i11 = 3;
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        er erVar = er.h;
        layoutTransition.setInterpolator(2, erVar);
        layoutTransition.setInterpolator(3, erVar);
        layoutTransition.setInterpolator(0, erVar);
        layoutTransition.setInterpolator(1, erVar);
        layoutTransition.setInterpolator(4, erVar);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f9318w = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, erVar);
        layoutTransition2.setInterpolator(3, erVar);
        layoutTransition2.setInterpolator(0, erVar);
        layoutTransition2.setInterpolator(1, erVar);
        layoutTransition2.setInterpolator(4, erVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.f9319x = new v3[4];
        this.f9320y = new v3[4];
        for (int i12 = 0; i12 < 4; i12++) {
            LinearLayout linearLayout3 = this.v;
            v3[] v3VarArr = this.f9319x;
            v3 v3Var = new v3(context);
            v3VarArr[i12] = v3Var;
            linearLayout3.addView(v3Var, h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f9319x[i12].setOnClickListener(new t3(this, i10));
        }
        for (int i13 = 0; i13 < 4; i13++) {
            LinearLayout linearLayout4 = this.v;
            v3[] v3VarArr2 = this.f9320y;
            v3 v3Var2 = new v3(context);
            v3VarArr2[i13] = v3Var2;
            linearLayout4.addView(v3Var2, h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f9320y[i13].setOnClickListener(new t3(this, i11));
        }
        this.f9315n = new e4[4];
        this.d = new a4[6];
        int i14 = 0;
        for (int i15 = 6; i14 < i15; i15 = 6) {
            a4[] a4VarArr = this.d;
            boolean z10 = i14 == 5;
            a4 a4Var = new a4(context);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new u4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.l1(0.08f, -1)));
            a4Var.addView(frameLayout5, h7.z5.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
            n9Var.setImageResource(R.drawable.large_forge);
            n9Var.setAlpha(z10 ? 1.0f : 0.45f);
            frameLayout5.addView(n9Var, h7.z5.e(z10 ? 42 : 64, z10 ? 42 : 64, 17));
            if (z10) {
                n9Var.setTranslationX(AndroidUtilities.dp(-4.0f));
                b4 b4Var = new b4(context);
                a4Var.f8951b = b4Var;
                b4Var.f9003e = AndroidUtilities.dp(37.0f);
                b4Var.f9000a.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                frameLayout5.addView(b4Var, h7.z5.e(90, 90, 17));
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
                a4Var.f8950a = j6Var;
                j6Var.getDrawable().o(false, true, false);
                j6Var.setTypeface(AndroidUtilities.bold());
                j6Var.setTextColor(-1);
                j6Var.setTextSize(AndroidUtilities.dp(14.0f));
                j6Var.setGravity(17);
                j6Var.setText("0%");
                frameLayout5.addView(j6Var, h7.z5.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            a4VarArr[i14] = a4Var;
            i14++;
        }
        this.f9308e = this.d[5];
        c4 c4Var = new c4(context);
        this.f9310f = c4Var;
        c4Var.setVisibility(8);
        c4Var.setAlpha(0.0f);
        addView(c4Var, h7.z5.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        z3 z3Var = new z3(context, this.d);
        this.h = z3Var;
        addView(z3Var, h7.z5.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(context);
        this.A = s5Var;
        s5Var.setTextSize(1, 12.0f);
        s5Var.setTypeface(AndroidUtilities.bold());
        s5Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        s5Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        s5Var.setGravity(17);
        s5Var.setTextColor(-1);
        s5Var.setAlpha(this.W != null ? 1.0f : 0.25f);
        s5Var.setBackground(new u4(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.l1(0.08f, -1)));
        h7.b6.b(s5Var, 0.02f, 1.2f);
        this.M.addView(s5Var, h7.z5.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        s5Var.setOnClickListener(new ag.q0(20, this, c6Var));
        this.M.addView(this.v, h7.z5.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.M.addView(this.f9318w, h7.z5.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.C = linearLayout5;
        linearLayout5.setOrientation(1);
        w3 w3Var = new w3();
        this.B = w3Var;
        linearLayout5.setBackground(w3Var);
        w3Var.a(org.telegram.ui.ActionBar.g6.l1(0.08f, -1), org.telegram.ui.ActionBar.g6.l1(0.08f, -1));
        h7.b6.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, h7.z5.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new t3(this, 4));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.D = j6Var2;
        j6Var2.setTypeface(AndroidUtilities.bold());
        j6Var2.setGravity(17);
        j6Var2.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.75f, -1));
        j6Var2.setText(LocaleController.getString(R.string.GiftCraftButton));
        j6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout5.addView(j6Var2, h7.z5.r(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.E = j6Var3;
        j6Var3.getDrawable().o(true, false, false);
        j6Var3.setGravity(17);
        j6Var3.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.75f, -1));
        j6Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
        j6Var3.setTextSize(AndroidUtilities.dp(12.0f));
        linearLayout5.addView(j6Var3, h7.z5.r(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ri0 ri0Var = new ri0(context);
        this.F = ri0Var;
        ri0Var.setAutoRepeat(true);
        ri0Var.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView(ri0Var, h7.z5.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftCraftProgressTitle));
        linearLayout6.addView(textView2, h7.z5.t(-2, -2, 17, 0, 0, 0, 0));
        this.N.addView(linearLayout6, h7.z5.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.G = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.5f, -1));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        TextView textViewH = org.telegram.ui.Cells.pa.h(this.N, textView3, h7.z5.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.H = textViewH;
        textViewH.setTextSize(1, 13.0f);
        textViewH.setTextColor(-1);
        textViewH.setTypeface(AndroidUtilities.bold());
        textViewH.setGravity(17);
        textViewH.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        textViewH.setBackground(new u4(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.l1(0.08f, -1)));
        TextView textViewH2 = org.telegram.ui.Cells.pa.h(this.N, textViewH, h7.z5.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        textViewH2.setTextSize(1, 13.0f);
        textViewH2.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.5f, -1));
        textViewH2.setGravity(17);
        textViewH2.setText(LocaleController.getString(R.string.GiftCraftProgressText));
        TextView textViewH3 = org.telegram.ui.Cells.pa.h(this.N, textViewH2, h7.z5.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        textViewH3.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
        textViewH3.setTextColor(-505270);
        textViewH3.setTextSize(1, 20.0f);
        textViewH3.setTypeface(AndroidUtilities.bold());
        textViewH3.setGravity(17);
        TextView textViewH4 = org.telegram.ui.Cells.pa.h(this.O, textViewH3, h7.z5.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.I = textViewH4;
        textViewH4.setTextColor(-17253);
        textViewH4.setTextSize(1, 13.0f);
        textViewH4.setGravity(17);
        this.O.addView(textViewH4, h7.z5.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.J = linearLayout7;
        linearLayout7.setOrientation(0);
        this.O.addView(linearLayout7, h7.z5.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.K = null;
        d(true);
    }

    public final void a(int i10, long j10, TLRPC.Document document, String str) {
        e4[] e4VarArr;
        this.S = i10;
        this.T = j10;
        this.U = document;
        this.V = str;
        this.f9307d0 = false;
        this.f9311f0 = false;
        int i11 = 0;
        while (true) {
            e4VarArr = this.f9315n;
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
        View[] viewArr = z3Var.f10410a;
        y3 y3Var = z3Var.D;
        if (y3Var != null) {
            y3Var.f10370e = true;
            y3Var.f10376l = false;
            y3Var.f10367a.D = null;
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
        z3Var.f10418w.clear();
        z3Var.f10419x.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            z3Var.f10420y[i12] = 0.0f;
        }
        z3Var.removeAllViews();
        for (int i13 = 0; i13 < viewArr.length; i13++) {
            viewArr[i13].setAlpha(1.0f);
            viewArr[i13].setVisibility(0);
            z3Var.addView(viewArr[i13], h7.z5.e(108, 108, 17));
        }
        Matrix.setIdentityM(z3Var.f10412c, 0);
        z3Var.f10413e = 0.0f;
        z3Var.d = 0.0f;
        z3Var.f10414f = true;
        e4 e4Var2 = new e4(getContext());
        e4VarArr[0] = e4Var2;
        addView(e4Var2, h7.z5.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        e4 e4Var3 = new e4(getContext());
        e4VarArr[1] = e4Var3;
        addView(e4Var3, h7.z5.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        e4 e4Var4 = new e4(getContext());
        e4VarArr[2] = e4Var4;
        addView(e4Var4, h7.z5.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        e4 e4Var5 = new e4(getContext());
        e4VarArr[3] = e4Var5;
        addView(e4Var5, h7.z5.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i14 = 0; i14 < e4VarArr.length; i14++) {
            h7.b6.a(e4VarArr[i14]);
            e4VarArr[i14].setClickable(true);
            e4VarArr[i14].setOnClickListener(new t3(this, 5));
        }
        d(false);
        this.f9307d0 = false;
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
        this.A.setAlpha(this.f9317s ? 0.0f : this.W != null ? 1.0f : 0.25f);
        c4 c4Var = this.f9310f;
        c4Var.setVisibility(8);
        c4Var.setAlpha(0.0f);
        String string = LocaleController.getString(R.string.GiftCraftButton);
        org.telegram.ui.Components.j6 j6Var = this.D;
        j6Var.setText(string);
        j6Var.setTranslationY(0.0f);
        this.E.setAlpha(1.0f);
        GiftAuctionController.getInstance(i10).requestAuctionUpgrades(j10, new u3(this, j10, j10, 0));
    }

    public final void b(v3 v3Var) {
        if (v3Var.d != null) {
            c(v3Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(v3Var.f10210f * 100.0f), v3Var.d.name)));
        } else if (v3Var.f10209e != null) {
            c(v3Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(v3Var.f10210f * 100.0f), v3Var.f10209e.name)));
        }
    }

    public final void c(v3 v3Var, SpannableStringBuilder spannableStringBuilder) {
        lh.w3 w3Var = this.P;
        if (w3Var != null) {
            w3Var.e(true);
            this.P = null;
        }
        if (this.f9307d0 || this.f9311f0) {
            return;
        }
        View view = v3Var.getParent() instanceof View ? (View) v3Var.getParent() : null;
        float x8 = v3Var.getX() + (view != null ? view.getX() : 0.0f);
        float y10 = v3Var.getY() + (view != null ? view.getY() : 0.0f);
        lh.w3 w3Var2 = new lh.w3(getContext(), 3);
        this.P = w3Var2;
        w3Var2.q(true);
        this.P.t(spannableStringBuilder);
        lh.w3 w3Var3 = this.P;
        w3Var3.h = lh.w3.a(w3Var3.getText(), this.P.getTextPaint());
        lh.w3 w3Var4 = this.P;
        w3Var4.G = Layout.Alignment.ALIGN_CENTER;
        w3Var4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(this.P, h7.z5.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.P.setTranslationY(y10 - AndroidUtilities.dp(100.0f));
        this.P.n(0.0f, ((v3Var.getWidth() / 2.0f) + x8) - AndroidUtilities.dp(2.0f));
        this.P.v();
    }

    public final void d(boolean z10) {
        e4[] e4VarArr;
        HashMap map;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        v3[] v3VarArr;
        TL_stars.starGiftAttributePattern stargiftattributepattern;
        LinearLayout linearLayout;
        TL_stars.StarGift starGift;
        int giftsSelectedCount = getGiftsSelectedCount();
        float giftsSuccessChance = getGiftsSuccessChance() / 10.0f;
        a4 a4Var = this.f9308e;
        org.telegram.ui.Components.j6 j6Var = a4Var.f8950a;
        if (j6Var != null) {
            j6Var.c(Math.round(giftsSuccessChance) + "%", z10, true);
            b4 b4Var = a4Var.f8951b;
            float f10 = giftsSuccessChance / 100.0f;
            b4Var.d = f10;
            if (!z10) {
                b4Var.f9001b.d(f10, true);
            }
            b4Var.invalidate();
        }
        org.telegram.ui.Components.j6 j6Var2 = this.E;
        if (giftsSelectedCount <= 0) {
            if (this.f9314i0 == null) {
                this.f9314i0 = new SpannableStringBuilder("+");
                cq cqVar = new cq(R.drawable.filled_add_album, 0);
                cqVar.setScale(0.65f, 0.65f);
                SpannableStringBuilder spannableStringBuilder = this.f9314i0;
                spannableStringBuilder.setSpan(cqVar, 0, spannableStringBuilder.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.GiftCraftButtonEmpty));
            AndroidUtilities.replaceMultipleCharSequence("+", spannableStringBuilder2, this.f9314i0);
            j6Var2.setText(spannableStringBuilder2);
        } else {
            j6Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, nh.k.G0(getGiftsSuccessChance()))));
        }
        int i10 = (giftsSelectedCount == 0 ? 0 : giftsSelectedCount < 4 ? 1 : 2) * 2;
        int[] iArr = this.R;
        int i11 = i10 + 1;
        this.B.a(iArr[i10], iArr[i11]);
        int[] iArr2 = this.Q;
        this.f9303b.a(iArr2[i10], iArr2[i11]);
        this.f9310f.a(iArr[i11], iArr[i10]);
        if (this.U != null) {
            TL_stars.StarGift firstGift = getFirstGift();
            eh.s sVar = this.f9316r;
            if (firstGift != null) {
                SpannableString spannableString = new SpannableString("x");
                spannableString.setSpan(new org.telegram.ui.Components.t5(this.U, sVar.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
                sVar.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftText1)), "\n", spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftText2, this.V, LocaleController.formatNumber(firstGift.num, ',')))));
            } else {
                SpannableString spannableString2 = new SpannableString("x");
                spannableString2.setSpan(new org.telegram.ui.Components.t5(this.U, sVar.getPaint().getFontMetricsInt()), 0, spannableString2.length(), 33);
                sVar.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftTextEmpty1)), "\n", spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftTextEmpty2, this.V))));
            }
        }
        int[][] iArr3 = MessagesController.getInstance(this.S).stargiftsCraftAttributesPermilles;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            e4VarArr = this.f9315n;
            if (i12 >= e4VarArr.length) {
                break;
            }
            e4 e4Var = e4VarArr[i12];
            if (e4Var != null) {
                TL_stars.StarGift starGift2 = e4Var.h;
                if ((starGift2 != null ? starGift2 : null) != null) {
                    i13++;
                    TL_stars.StarGift starGift3 = starGift2 != null ? starGift2 : null;
                    TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) u7.l(starGift3.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) u7.l(starGift3.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    map2.put(Integer.valueOf(stargiftattributebackdrop2.backdrop_id), Integer.valueOf(((Integer) Map.EL.getOrDefault(map2, Integer.valueOf(stargiftattributebackdrop2.backdrop_id), 0)).intValue() + 1));
                    map3.put(Long.valueOf(stargiftattributepattern2.document.f22386id), Integer.valueOf(((Integer) Map.EL.getOrDefault(map3, Long.valueOf(stargiftattributepattern2.document.f22386id), 0)).intValue() + 1));
                }
            }
            i12++;
        }
        boolean zIsEmpty = map2.isEmpty();
        v3[] v3VarArr2 = this.f9319x;
        if (zIsEmpty) {
            v3 v3Var = v3VarArr2[0];
            v3Var.a(null);
            v3Var.c(0.0f, true);
            arrayList.add(v3Var);
            for (int i14 = 1; i14 < 4; i14++) {
                v3VarArr2[i14].setVisibility(8);
            }
            map = map3;
        } else {
            ArrayList arrayList2 = new ArrayList(map2.entrySet());
            Collections.sort(arrayList2, Map$Entry$CC.comparingByValue());
            int i15 = 0;
            int i16 = 0;
            for (int size = arrayList2.size(); i15 < size; size = size) {
                Object obj = arrayList2.get(i15);
                i15++;
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                int iIntValue = ((Integer) entry.getKey()).intValue();
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                int i17 = 0;
                while (true) {
                    if (i17 >= e4VarArr.length) {
                        stargiftattributebackdrop = null;
                        break;
                    }
                    e4 e4Var2 = e4VarArr[i17];
                    if (e4Var2 != null) {
                        TL_stars.StarGift starGift4 = e4Var2.h;
                        if ((starGift4 != null ? starGift4 : null) != null) {
                            if (starGift4 == null) {
                                starGift4 = null;
                            }
                            stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u7.l(starGift4.attributes, TL_stars.starGiftAttributeBackdrop.class);
                            if (stargiftattributebackdrop.backdrop_id == iIntValue) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i17++;
                }
                if (stargiftattributebackdrop != null) {
                    v3 v3Var2 = v3VarArr2[i16];
                    v3Var2.a(stargiftattributebackdrop);
                    int[] iArr4 = iArr3[Utilities.clamp(i13 - 1, iArr3.length - 1, 0)];
                    v3Var2.c(iArr4[Utilities.clamp(iIntValue2 - 1, iArr4.length - 1, 0)] / 1000.0f, true);
                    arrayList.add(v3Var2);
                    i16++;
                }
                map3 = map3;
            }
            map = map3;
            for (int i18 = i16; i18 < 4; i18++) {
                v3VarArr2[i18].setVisibility(8);
            }
        }
        boolean zIsEmpty2 = map.isEmpty();
        v3[] v3VarArr3 = this.f9320y;
        if (zIsEmpty2) {
            v3 v3Var3 = v3VarArr3[0];
            v3Var3.b(null);
            v3Var3.c(0.0f, true);
            arrayList.add(v3Var3);
            for (int i19 = 1; i19 < 4; i19++) {
                v3VarArr3[i19].setVisibility(8);
            }
        } else {
            ArrayList arrayList3 = new ArrayList(map.entrySet());
            Collections.sort(arrayList3, Map$Entry$CC.comparingByValue());
            int size2 = arrayList3.size();
            int i20 = 0;
            int i21 = 0;
            while (i21 < size2) {
                Object obj2 = arrayList3.get(i21);
                i21++;
                java.util.Map.Entry entry2 = (java.util.Map.Entry) obj2;
                long jLongValue = ((Long) entry2.getKey()).longValue();
                int iIntValue3 = ((Integer) entry2.getValue()).intValue();
                int i22 = 0;
                while (true) {
                    if (i22 >= e4VarArr.length) {
                        v3VarArr = v3VarArr3;
                        stargiftattributepattern = null;
                        break;
                    }
                    e4 e4Var3 = e4VarArr[i22];
                    if (e4Var3 == null) {
                        v3VarArr = v3VarArr3;
                    } else {
                        TL_stars.StarGift starGift5 = e4Var3.h;
                        if ((starGift5 != null ? starGift5 : null) == null) {
                            v3VarArr = v3VarArr3;
                        } else {
                            if (starGift5 == null) {
                                starGift5 = null;
                            }
                            TL_stars.starGiftAttributePattern stargiftattributepattern3 = (TL_stars.starGiftAttributePattern) u7.l(starGift5.attributes, TL_stars.starGiftAttributePattern.class);
                            if (stargiftattributepattern3 != null) {
                                v3VarArr = v3VarArr3;
                                if (stargiftattributepattern3.document.f22386id == jLongValue) {
                                    stargiftattributepattern = stargiftattributepattern3;
                                    break;
                                }
                            } else {
                                v3VarArr = v3VarArr3;
                            }
                        }
                    }
                    i22++;
                    v3VarArr3 = v3VarArr;
                }
                if (stargiftattributepattern != null) {
                    int i23 = i20 + 1;
                    v3 v3Var4 = v3VarArr[i20];
                    v3Var4.b(stargiftattributepattern);
                    int[] iArr5 = iArr3[Utilities.clamp(i13 - 1, iArr3.length - 1, 0)];
                    v3Var4.c(iArr5[Utilities.clamp(iIntValue3 - 1, iArr5.length - 1, 0)] / 1000.0f, true);
                    arrayList.add(v3Var4);
                    i20 = i23;
                }
                v3VarArr3 = v3VarArr;
            }
            v3[] v3VarArr4 = v3VarArr3;
            while (i20 < 4) {
                v3VarArr4[i20].setVisibility(8);
                i20++;
            }
        }
        this.f9317s = arrayList.size() > 5;
        int i24 = 0;
        while (true) {
            int size3 = arrayList.size();
            linearLayout = this.f9318w;
            if (i24 >= size3) {
                break;
            }
            v3 v3Var5 = (v3) arrayList.get(i24);
            if (!this.f9317s || i24 < arrayList.size() / 2.0f) {
                linearLayout = this.v;
            }
            if (v3Var5.getParent() != linearLayout) {
                ViewParent parent = v3Var5.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                    boolean z11 = layoutTransition != null;
                    if (z11) {
                        layoutTransition.disableTransitionType(3);
                    }
                    viewGroup.removeView(v3Var5);
                    if (z11) {
                        layoutTransition.enableTransitionType(3);
                    }
                    v3Var5.animate().cancel();
                    v3Var5.clearAnimation();
                    v3Var5.setTranslationX(0.0f);
                    v3Var5.setTranslationY(0.0f);
                    v3Var5.setTranslationZ(0.0f);
                    v3Var5.setAlpha(0.0f);
                    v3Var5.setScaleX(1.0f);
                    v3Var5.setScaleY(1.0f);
                    v3Var5.setRotation(0.0f);
                    v3Var5.setRotationX(0.0f);
                    v3Var5.setRotationY(0.0f);
                }
                linearLayout.addView(v3Var5, h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            }
            v3Var5.setVisibility(0);
            i24++;
        }
        linearLayout.animate().alpha(this.f9317s ? 1.0f : 0.0f);
        this.A.animate().alpha(this.f9317s ? 0.0f : this.W != null ? 1.0f : 0.25f);
        boolean z12 = true;
        for (int i25 = 0; i25 < e4VarArr.length; i25++) {
            e4 e4Var4 = e4VarArr[i25];
            if (e4Var4 != null) {
                TL_stars.StarGift starGift6 = e4Var4.h;
                if (starGift6 == null) {
                    starGift6 = null;
                }
                if (starGift6 != null) {
                    if (z12) {
                        int i26 = i25 + 1;
                        while (true) {
                            if (i26 < e4VarArr.length) {
                                e4 e4Var5 = e4VarArr[i26];
                                if (e4Var5 != null) {
                                    starGift = e4Var5.h;
                                    if ((starGift != null ? starGift : null) != null) {
                                        if (starGift == null) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                i26++;
                            }
                            starGift = null;
                            break;
                        }
                        e4 e4Var6 = e4VarArr[i25];
                        boolean z13 = (starGift == null || TextUtils.isEmpty(starGift.gift_address)) ? false : true;
                        ImageView imageView = e4Var6.f9170f;
                        imageView.setScaleX(0.8f);
                        imageView.setScaleY(0.8f);
                        e4Var6.f9171n = z13;
                        imageView.setImageResource(z13 ? R.drawable.mini_replace2 : R.drawable.msg_close);
                    } else {
                        ImageView imageView2 = e4Var4.f9170f;
                        imageView2.setScaleX(0.8f);
                        imageView2.setScaleY(0.8f);
                        e4Var4.f9171n = false;
                        imageView2.setImageResource(R.drawable.msg_close);
                    }
                    z12 = false;
                }
            }
        }
    }

    public TL_stars.StarGift getFirstGift() {
        int i10 = 0;
        while (true) {
            e4[] e4VarArr = this.f9315n;
            if (i10 >= e4VarArr.length) {
                return null;
            }
            e4 e4Var = e4VarArr[i10];
            if (e4Var != null) {
                TL_stars.StarGift starGift = e4Var.h;
                if ((starGift != null ? starGift : null) != null) {
                    if (starGift != null) {
                        return starGift;
                    }
                    return null;
                }
            }
            i10++;
        }
    }

    public int getGiftsSelectedCount() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            e4[] e4VarArr = this.f9315n;
            if (i10 >= e4VarArr.length) {
                return i11;
            }
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
        }
    }

    public int getGiftsSuccessChance() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            e4[] e4VarArr = this.f9315n;
            if (i10 >= e4VarArr.length) {
                return i11;
            }
            e4 e4Var = e4VarArr[i10];
            if (e4Var != null) {
                TL_stars.StarGift starGift = e4Var.h;
                if ((starGift != null ? starGift : null) != null) {
                    if (starGift == null) {
                        starGift = null;
                    }
                    i11 += starGift.craft_chance_permille;
                }
            }
            i10++;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setOnAddGift(Utilities.Callback2<Utilities.Callback<TL_stars.StarGift>, Boolean> callback2) {
        this.f9304b0 = callback2;
    }

    public void setOnClose(Runnable runnable) {
        this.f9306c0 = runnable;
    }

    public void setOnCraft(Utilities.Callback3<ArrayList<TL_stars.StarGift>, Utilities.Callback2<TL_stars.StarGift, Runnable>, Runnable> callback3) {
        this.f9302a0 = callback3;
    }
}
