package bi;

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
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
public final class z5 extends FrameLayout {
    public final org.telegram.ui.Components.b6 E;
    public final o5 F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.s6 H;
    public final org.telegram.ui.Components.s6 I;
    public final bk0 J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final LinearLayout N;
    public zh.g1[] O;
    public final FrameLayout P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public fi.v3 T;
    public final int[] U;
    public final int[] V;
    public int W;
    public final org.telegram.ui.ActionBar.u6 f5828a;
    public long f5829a0;
    public final y5 f5830b;
    public TLRPC.Document f5831b0;
    public final ImageView f5832c;
    public String f5833c0;
    public final t5[] d;
    public ArrayList f5834d0;
    public final t5 e;
    public Utilities.Callback3 f5835e0;
    public final v5 f5836f;
    public Utilities.Callback2 f5837f0;
    public Runnable f5838g0;
    public final s5 h;
    public boolean f5839h0;
    public boolean f5840i0;
    public boolean f5841j0;
    public Runnable f5842k0;
    public bk0 f5843l0;
    public SpannableStringBuilder m0;
    public final x5[] f5844n;
    public final xh.n f5845r;
    public boolean f5846s;
    public final LinearLayout v;
    public final LinearLayout f5847w;
    public final n5[] f5848x;
    public final n5[] f5849y;

    public z5(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        float f7;
        boolean z10;
        float f10;
        int i10;
        int i11 = 6;
        this.U = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.V = new int[]{org.telegram.ui.ActionBar.y6.o1(0.08f, -1), org.telegram.ui.ActionBar.y6.o1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.f5828a = u6Var;
        y5 y5Var = new y5();
        this.f5830b = y5Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        y5Var.f5763g = mutate;
        setBackground(y5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        addView(frameLayout, kb1.i(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.f5832c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new p6(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.y6.o1(0.08f, -1)));
        frameLayout.addView(imageView, kb1.h(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new k5(this, 0));
        kb1.b(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setBackground(new p6(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.y6.o1(0.08f, -1)));
        frameLayout.addView(imageView2, kb1.h(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        boolean z11 = true;
        imageView2.setOnClickListener(new k5(this, 1));
        kb1.b(imageView2);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
        addView(textView, kb1.h(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        addView(frameLayout2, kb1.i(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.R = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, kb1.i(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.S = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, kb1.i(-1, -1, 119));
        xh.n nVar = new xh.n(context);
        this.f5845r = nVar;
        nVar.setGravity(17);
        nVar.setTextSize(1, 13.0f);
        nVar.setTextColor(-1);
        frameLayout2.addView(nVar, kb1.h(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(2, 320L);
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        ds dsVar = ds.h;
        layoutTransition.setInterpolator(2, dsVar);
        layoutTransition.setInterpolator(3, dsVar);
        layoutTransition.setInterpolator(0, dsVar);
        layoutTransition.setInterpolator(1, dsVar);
        layoutTransition.setInterpolator(4, dsVar);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f5847w = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, dsVar);
        layoutTransition2.setInterpolator(3, dsVar);
        layoutTransition2.setInterpolator(0, dsVar);
        layoutTransition2.setInterpolator(1, dsVar);
        layoutTransition2.setInterpolator(4, dsVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.f5848x = new n5[4];
        this.f5849y = new n5[4];
        for (int i12 = 0; i12 < 4; i12++) {
            LinearLayout linearLayout3 = this.v;
            n5[] n5VarArr = this.f5848x;
            n5 n5Var = new n5(context);
            n5VarArr[i12] = n5Var;
            linearLayout3.addView(n5Var, kb1.o(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f5848x[i12].setOnClickListener(new k5(this, 2));
        }
        for (int i13 = 0; i13 < 4; i13++) {
            LinearLayout linearLayout4 = this.v;
            n5[] n5VarArr2 = this.f5849y;
            n5 n5Var2 = new n5(context);
            n5VarArr2[i13] = n5Var2;
            linearLayout4.addView(n5Var2, kb1.o(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f5849y[i13].setOnClickListener(new k5(this, 3));
        }
        this.f5844n = new x5[4];
        this.d = new t5[6];
        int i14 = 0;
        while (i14 < i11) {
            t5[] t5VarArr = this.d;
            if (i14 == 5) {
                z10 = z11;
            } else {
                z10 = false;
            }
            ?? frameLayout5 = new FrameLayout(context);
            FrameLayout frameLayout6 = new FrameLayout(context);
            frameLayout6.setBackground(new p6(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.y6.o1(0.08f, -1)));
            frameLayout5.addView(frameLayout6, kb1.h(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
            y9Var.setImageResource(R.drawable.large_forge);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.45f;
            }
            y9Var.setAlpha(f10);
            if (z10) {
                i10 = 42;
            } else {
                i10 = 64;
            }
            frameLayout6.addView(y9Var, kb1.i(i10, z10 ? 42 : 64, 17));
            if (z10) {
                y9Var.setTranslationX(AndroidUtilities.dp(-4.0f));
                u5 u5Var = new u5(context);
                frameLayout5.f5452b = u5Var;
                u5Var.e = AndroidUtilities.dp(37.0f);
                u5Var.f5514a.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                frameLayout6.addView(u5Var, kb1.i(90, 90, 17));
                org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
                frameLayout5.f5451a = s6Var;
                s6Var.getDrawable().r(false, true);
                s6Var.setTypeface(AndroidUtilities.bold());
                s6Var.setTextColor(-1);
                s6Var.setTextSize(AndroidUtilities.dp(14.0f));
                s6Var.setGravity(17);
                s6Var.setText("0%");
                frameLayout6.addView(s6Var, kb1.h(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            t5VarArr[i14] = frameLayout5;
            i14++;
            i11 = 6;
            z11 = true;
        }
        this.e = this.d[5];
        v5 v5Var = new v5(context);
        this.f5836f = v5Var;
        v5Var.setVisibility(8);
        v5Var.setAlpha(0.0f);
        addView(v5Var, kb1.h(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        s5 s5Var = new s5(context, this.d);
        this.h = s5Var;
        addView(s5Var, kb1.h(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(context);
        this.E = b6Var;
        b6Var.setTextSize(1, 12.0f);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        b6Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        b6Var.setGravity(17);
        b6Var.setTextColor(-1);
        if (this.f5834d0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        b6Var.setAlpha(f7);
        b6Var.setBackground(new p6(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.y6.o1(0.08f, -1)));
        kb1.c(b6Var, 0.02f, 1.2f);
        this.Q.addView(b6Var, kb1.h(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        b6Var.setOnClickListener(new q(8, this, u6Var));
        this.Q.addView(this.v, kb1.h(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.Q.addView(this.f5847w, kb1.h(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.G = linearLayout5;
        linearLayout5.setOrientation(1);
        o5 o5Var = new o5();
        this.F = o5Var;
        linearLayout5.setBackground(o5Var);
        o5Var.a(org.telegram.ui.ActionBar.y6.o1(0.08f, -1), org.telegram.ui.ActionBar.y6.o1(0.08f, -1));
        kb1.c(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, kb1.h(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new k5(this, 4));
        org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(context, false, false, false);
        this.H = s6Var2;
        s6Var2.setTypeface(AndroidUtilities.bold());
        s6Var2.setGravity(17);
        s6Var2.setTextColor(org.telegram.ui.ActionBar.y6.o1(0.75f, -1));
        s6Var2.setText(LocaleController.getString(R.string.GiftCraftButton));
        s6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout5.addView(s6Var2, kb1.v(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var3 = new org.telegram.ui.Components.s6(context, false, false, false);
        this.I = s6Var3;
        s6Var3.getDrawable().r(true, false);
        s6Var3.setGravity(17);
        s6Var3.setTextColor(org.telegram.ui.ActionBar.y6.o1(0.75f, -1));
        s6Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
        s6Var3.setTextSize(AndroidUtilities.dp(12.0f));
        linearLayout5.addView(s6Var3, kb1.v(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ?? imageView3 = new ImageView(context);
        this.J = imageView3;
        imageView3.setAutoRepeat(true);
        imageView3.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView((View) imageView3, kb1.x(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftCraftProgressTitle));
        linearLayout6.addView(textView2, kb1.x(-2, -2, 17, 0, 0, 0, 0));
        this.R.addView(linearLayout6, kb1.h(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.y6.o1(0.5f, -1));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        TextView k10 = org.telegram.ui.d3.k(this.R, textView3, kb1.h(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.L = k10;
        k10.setTextSize(1, 13.0f);
        k10.setTextColor(-1);
        k10.setTypeface(AndroidUtilities.bold());
        k10.setGravity(17);
        k10.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        k10.setBackground(new p6(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.y6.o1(0.08f, -1)));
        TextView k11 = org.telegram.ui.d3.k(this.R, k10, kb1.h(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        k11.setTextSize(1, 13.0f);
        k11.setTextColor(org.telegram.ui.ActionBar.y6.o1(0.5f, -1));
        k11.setGravity(17);
        k11.setText(LocaleController.getString(R.string.GiftCraftProgressText));
        TextView k12 = org.telegram.ui.d3.k(this.R, k11, kb1.h(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        k12.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
        k12.setTextColor(-505270);
        k12.setTextSize(1, 20.0f);
        k12.setTypeface(AndroidUtilities.bold());
        k12.setGravity(17);
        TextView k13 = org.telegram.ui.d3.k(this.S, k12, kb1.h(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.M = k13;
        k13.setTextColor(-17253);
        k13.setTextSize(1, 13.0f);
        k13.setGravity(17);
        this.S.addView(k13, kb1.h(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.N = linearLayout7;
        linearLayout7.setOrientation(0);
        this.S.addView(linearLayout7, kb1.h(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.O = null;
        d(true);
    }

    public final void a(int i10, long j10, TLRPC.Document document, String str) {
        x5[] x5VarArr;
        float f7;
        this.W = i10;
        this.f5829a0 = j10;
        this.f5831b0 = document;
        this.f5833c0 = str;
        this.f5839h0 = false;
        this.f5841j0 = false;
        int i11 = 0;
        while (true) {
            x5VarArr = this.f5844n;
            if (i11 >= x5VarArr.length) {
                break;
            }
            x5 x5Var = x5VarArr[i11];
            if (x5Var != null) {
                AndroidUtilities.removeFromParent(x5Var);
            }
            i11++;
        }
        s5 s5Var = this.h;
        View[] viewArr = s5Var.f5397a;
        r5 r5Var = s5Var.H;
        if (r5Var != null) {
            r5Var.e = true;
            r5Var.f5335l = false;
            r5Var.f5327a.H = null;
            s5Var.H = null;
        }
        ValueAnimator valueAnimator = s5Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            s5Var.G = null;
        }
        s5Var.F = -1;
        s5Var.E = 0.0f;
        s5Var.v.clear();
        s5Var.f5404w.clear();
        s5Var.f5405x.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            s5Var.f5406y[i12] = 0.0f;
        }
        s5Var.removeAllViews();
        for (int i13 = 0; i13 < viewArr.length; i13++) {
            viewArr[i13].setAlpha(1.0f);
            viewArr[i13].setVisibility(0);
            s5Var.addView(viewArr[i13], kb1.i(108, 108, 17));
        }
        Matrix.setIdentityM(s5Var.f5399c, 0);
        s5Var.e = 0.0f;
        s5Var.d = 0.0f;
        s5Var.f5400f = true;
        x5 x5Var2 = new x5(getContext());
        x5VarArr[0] = x5Var2;
        addView(x5Var2, kb1.h(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        x5 x5Var3 = new x5(getContext());
        x5VarArr[1] = x5Var3;
        addView(x5Var3, kb1.h(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        x5 x5Var4 = new x5(getContext());
        x5VarArr[2] = x5Var4;
        addView(x5Var4, kb1.h(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        x5 x5Var5 = new x5(getContext());
        x5VarArr[3] = x5Var5;
        addView(x5Var5, kb1.h(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i14 = 0; i14 < x5VarArr.length; i14++) {
            kb1.b(x5VarArr[i14]);
            x5VarArr[i14].setClickable(true);
            x5VarArr[i14].setOnClickListener(new k5(this, 5));
        }
        d(false);
        this.f5839h0 = false;
        FrameLayout frameLayout = this.Q;
        frameLayout.animate().cancel();
        frameLayout.setAlpha(1.0f);
        LinearLayout linearLayout = this.G;
        linearLayout.animate().cancel();
        linearLayout.setAlpha(1.0f);
        FrameLayout frameLayout2 = this.R;
        frameLayout2.animate().cancel();
        frameLayout2.setAlpha(0.0f);
        FrameLayout frameLayout3 = this.S;
        frameLayout3.animate().cancel();
        frameLayout3.setAlpha(0.0f);
        FrameLayout frameLayout4 = this.P;
        frameLayout4.animate().cancel();
        frameLayout4.setAlpha(1.0f);
        if (this.f5846s) {
            f7 = 0.0f;
        } else if (this.f5834d0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        this.E.setAlpha(f7);
        v5 v5Var = this.f5836f;
        v5Var.setVisibility(8);
        v5Var.setAlpha(0.0f);
        String string = LocaleController.getString(R.string.GiftCraftButton);
        org.telegram.ui.Components.s6 s6Var = this.H;
        s6Var.setText(string);
        s6Var.setTranslationY(0.0f);
        this.I.setAlpha(1.0f);
        GiftAuctionController.getInstance(i10).requestAuctionUpgrades(j10, new l5(this, j10, j10, 0));
    }

    public final void b(n5 n5Var) {
        if (n5Var.d != null) {
            c(n5Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(n5Var.f5130f * 100.0f), n5Var.d.name)));
        } else if (n5Var.e != null) {
            c(n5Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(n5Var.f5130f * 100.0f), n5Var.e.name)));
        }
    }

    public final void c(n5 n5Var, SpannableStringBuilder spannableStringBuilder) {
        float f7;
        float f10;
        fi.v3 v3Var = this.T;
        View view = null;
        if (v3Var != null) {
            v3Var.e(true);
            this.T = null;
        }
        if (!this.f5839h0 && !this.f5841j0) {
            if (n5Var.getParent() instanceof View) {
                view = (View) n5Var.getParent();
            }
            if (view != null) {
                f7 = view.getX();
            } else {
                f7 = 0.0f;
            }
            float x9 = n5Var.getX() + f7;
            if (view != null) {
                f10 = view.getY();
            } else {
                f10 = 0.0f;
            }
            float y3 = n5Var.getY() + f10;
            fi.v3 v3Var2 = new fi.v3(getContext(), 3);
            this.T = v3Var2;
            v3Var2.p(true);
            this.T.s(spannableStringBuilder);
            fi.v3 v3Var3 = this.T;
            v3Var3.h = fi.v3.a(v3Var3.getText(), this.T.getTextPaint());
            fi.v3 v3Var4 = this.T;
            v3Var4.K = Layout.Alignment.ALIGN_CENTER;
            v3Var4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            addView(this.T, kb1.h(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            this.T.setTranslationY(y3 - AndroidUtilities.dp(100.0f));
            this.T.m(0.0f, ((n5Var.getWidth() / 2.0f) + x9) - AndroidUtilities.dp(2.0f));
            this.T.u();
        }
    }

    public final void d(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: bi.z5.d(boolean):void");
    }

    public TL_stars.StarGift getFirstGift() {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            x5[] x5VarArr = this.f5844n;
            if (i10 >= x5VarArr.length) {
                return null;
            }
            x5 x5Var = x5VarArr[i10];
            if (x5Var != null) {
                TL_stars.StarGift starGift2 = x5Var.h;
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
            x5[] x5VarArr = this.f5844n;
            if (i10 < x5VarArr.length) {
                x5 x5Var = x5VarArr[i10];
                if (x5Var != null) {
                    TL_stars.StarGift starGift = x5Var.h;
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
            x5[] x5VarArr = this.f5844n;
            if (i10 < x5VarArr.length) {
                x5 x5Var = x5VarArr[i10];
                if (x5Var != null) {
                    TL_stars.StarGift starGift2 = x5Var.h;
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
        this.f5837f0 = callback2;
    }

    public void setOnClose(Runnable runnable) {
        this.f5838g0 = runnable;
    }

    public void setOnCraft(Utilities.Callback3<ArrayList<TL_stars.StarGift>, Utilities.Callback2<TL_stars.StarGift, Runnable>, Runnable> callback3) {
        this.f5835e0 = callback3;
    }
}
