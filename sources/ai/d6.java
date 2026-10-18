package ai;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.xj0;
public final class d6 extends FrameLayout {
    public final org.telegram.ui.Components.z5 E;
    public final s5 F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.q6 H;
    public final org.telegram.ui.Components.q6 I;
    public final xj0 J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final LinearLayout N;
    public yh.g1[] O;
    public final FrameLayout P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public ei.x3 T;
    public final int[] U;
    public final int[] V;
    public int W;
    public final org.telegram.ui.ActionBar.d6 f1141a;
    public long f1142a0;
    public final c6 f1143b;
    public TLRPC.Document f1144b0;
    public final ImageView f1145c;
    public String f1146c0;
    public final x5[] d;
    public ArrayList f1147d0;
    public final x5 e;
    public Utilities.Callback3 f1148e0;
    public final z5 f1149f;
    public Utilities.Callback2 f1150f0;
    public Runnable f1151g0;
    public final w5 h;
    public boolean f1152h0;
    public boolean f1153i0;
    public boolean f1154j0;
    public Runnable f1155k0;
    public xj0 f1156l0;
    public SpannableStringBuilder m0;
    public final b6[] f1157n;
    public final wh.n f1158r;
    public boolean f1159s;
    public final LinearLayout v;
    public final LinearLayout f1160w;
    public final r5[] f1161x;
    public final r5[] f1162y;

    public d6(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        float f7;
        boolean z10;
        float f10;
        int i10;
        int i11 = 6;
        this.U = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.V = new int[]{org.telegram.ui.ActionBar.h6.m1(0.08f, -1), org.telegram.ui.ActionBar.h6.m1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.f1141a = d6Var;
        c6 c6Var = new c6();
        this.f1143b = c6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        c6Var.f1075g = mutate;
        setBackground(c6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        addView(frameLayout, w7.z5.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.f1145c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new t6(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.m1(0.08f, -1)));
        frameLayout.addView(imageView, w7.z5.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new o5(this, 0));
        w7.b6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setBackground(new t6(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.m1(0.08f, -1)));
        frameLayout.addView(imageView2, w7.z5.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        boolean z11 = true;
        imageView2.setOnClickListener(new o5(this, 1));
        w7.b6.a(imageView2);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
        addView(textView, w7.z5.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        addView(frameLayout2, w7.z5.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.R = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, w7.z5.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.S = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, w7.z5.e(-1, -1, 119));
        wh.n nVar = new wh.n(context);
        this.f1158r = nVar;
        nVar.setGravity(17);
        nVar.setTextSize(1, 13.0f);
        nVar.setTextColor(-1);
        frameLayout2.addView(nVar, w7.z5.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(2, 320L);
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        bs bsVar = bs.h;
        layoutTransition.setInterpolator(2, bsVar);
        layoutTransition.setInterpolator(3, bsVar);
        layoutTransition.setInterpolator(0, bsVar);
        layoutTransition.setInterpolator(1, bsVar);
        layoutTransition.setInterpolator(4, bsVar);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f1160w = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, bsVar);
        layoutTransition2.setInterpolator(3, bsVar);
        layoutTransition2.setInterpolator(0, bsVar);
        layoutTransition2.setInterpolator(1, bsVar);
        layoutTransition2.setInterpolator(4, bsVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.f1161x = new r5[4];
        this.f1162y = new r5[4];
        for (int i12 = 0; i12 < 4; i12++) {
            LinearLayout linearLayout3 = this.v;
            r5[] r5VarArr = this.f1161x;
            r5 r5Var = new r5(context);
            r5VarArr[i12] = r5Var;
            linearLayout3.addView(r5Var, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f1161x[i12].setOnClickListener(new o5(this, 2));
        }
        for (int i13 = 0; i13 < 4; i13++) {
            LinearLayout linearLayout4 = this.v;
            r5[] r5VarArr2 = this.f1162y;
            r5 r5Var2 = new r5(context);
            r5VarArr2[i13] = r5Var2;
            linearLayout4.addView(r5Var2, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f1162y[i13].setOnClickListener(new o5(this, 3));
        }
        this.f1157n = new b6[4];
        this.d = new x5[6];
        int i14 = 0;
        while (i14 < i11) {
            x5[] x5VarArr = this.d;
            if (i14 == 5) {
                z10 = z11;
            } else {
                z10 = false;
            }
            ?? frameLayout5 = new FrameLayout(context);
            FrameLayout frameLayout6 = new FrameLayout(context);
            frameLayout6.setBackground(new t6(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.m1(0.08f, -1)));
            frameLayout5.addView(frameLayout6, w7.z5.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
            w9Var.setImageResource(R.drawable.large_forge);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.45f;
            }
            w9Var.setAlpha(f10);
            if (z10) {
                i10 = 42;
            } else {
                i10 = 64;
            }
            frameLayout6.addView(w9Var, w7.z5.e(i10, z10 ? 42 : 64, 17));
            if (z10) {
                w9Var.setTranslationX(AndroidUtilities.dp(-4.0f));
                y5 y5Var = new y5(context);
                frameLayout5.f2435b = y5Var;
                y5Var.e = AndroidUtilities.dp(37.0f);
                y5Var.f2479a.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                frameLayout6.addView(y5Var, w7.z5.e(90, 90, 17));
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, false, false);
                frameLayout5.f2434a = q6Var;
                q6Var.getDrawable().r(false, true);
                q6Var.setTypeface(AndroidUtilities.bold());
                q6Var.setTextColor(-1);
                q6Var.setTextSize(AndroidUtilities.dp(14.0f));
                q6Var.setGravity(17);
                q6Var.setText("0%");
                frameLayout6.addView(q6Var, w7.z5.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            x5VarArr[i14] = frameLayout5;
            i14++;
            i11 = 6;
            z11 = true;
        }
        this.e = this.d[5];
        z5 z5Var = new z5(context);
        this.f1149f = z5Var;
        z5Var.setVisibility(8);
        z5Var.setAlpha(0.0f);
        addView(z5Var, w7.z5.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        w5 w5Var = new w5(context, this.d);
        this.h = w5Var;
        addView(w5Var, w7.z5.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.z5 z5Var2 = new org.telegram.ui.Components.z5(context);
        this.E = z5Var2;
        z5Var2.setTextSize(1, 12.0f);
        z5Var2.setTypeface(AndroidUtilities.bold());
        z5Var2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        z5Var2.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        z5Var2.setGravity(17);
        z5Var2.setTextColor(-1);
        if (this.f1147d0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        z5Var2.setAlpha(f7);
        z5Var2.setBackground(new t6(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.h6.m1(0.08f, -1)));
        w7.b6.b(z5Var2, 0.02f, 1.2f);
        this.Q.addView(z5Var2, w7.z5.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        z5Var2.setOnClickListener(new p(8, this, d6Var));
        this.Q.addView(this.v, w7.z5.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.Q.addView(this.f1160w, w7.z5.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.G = linearLayout5;
        linearLayout5.setOrientation(1);
        s5 s5Var = new s5();
        this.F = s5Var;
        linearLayout5.setBackground(s5Var);
        s5Var.a(org.telegram.ui.ActionBar.h6.m1(0.08f, -1), org.telegram.ui.ActionBar.h6.m1(0.08f, -1));
        w7.b6.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, w7.z5.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new o5(this, 4));
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(context, false, false, false);
        this.H = q6Var2;
        q6Var2.setTypeface(AndroidUtilities.bold());
        q6Var2.setGravity(17);
        q6Var2.setTextColor(org.telegram.ui.ActionBar.h6.m1(0.75f, -1));
        q6Var2.setText(LocaleController.getString(R.string.GiftCraftButton));
        q6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout5.addView(q6Var2, w7.z5.r(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var3 = new org.telegram.ui.Components.q6(context, false, false, false);
        this.I = q6Var3;
        q6Var3.getDrawable().r(true, false);
        q6Var3.setGravity(17);
        q6Var3.setTextColor(org.telegram.ui.ActionBar.h6.m1(0.75f, -1));
        q6Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
        q6Var3.setTextSize(AndroidUtilities.dp(12.0f));
        linearLayout5.addView(q6Var3, w7.z5.r(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ?? imageView3 = new ImageView(context);
        this.J = imageView3;
        imageView3.setAutoRepeat(true);
        imageView3.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView((View) imageView3, w7.z5.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftCraftProgressTitle));
        linearLayout6.addView(textView2, w7.z5.t(-2, -2, 17, 0, 0, 0, 0));
        this.R.addView(linearLayout6, w7.z5.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.m1(0.5f, -1));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        TextView j10 = org.telegram.ui.Cells.c1.j(this.R, textView3, w7.z5.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.L = j10;
        j10.setTextSize(1, 13.0f);
        j10.setTextColor(-1);
        j10.setTypeface(AndroidUtilities.bold());
        j10.setGravity(17);
        j10.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        j10.setBackground(new t6(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.h6.m1(0.08f, -1)));
        TextView j11 = org.telegram.ui.Cells.c1.j(this.R, j10, w7.z5.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        j11.setTextSize(1, 13.0f);
        j11.setTextColor(org.telegram.ui.ActionBar.h6.m1(0.5f, -1));
        j11.setGravity(17);
        j11.setText(LocaleController.getString(R.string.GiftCraftProgressText));
        TextView j12 = org.telegram.ui.Cells.c1.j(this.R, j11, w7.z5.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        j12.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
        j12.setTextColor(-505270);
        j12.setTextSize(1, 20.0f);
        j12.setTypeface(AndroidUtilities.bold());
        j12.setGravity(17);
        TextView j13 = org.telegram.ui.Cells.c1.j(this.S, j12, w7.z5.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.M = j13;
        j13.setTextColor(-17253);
        j13.setTextSize(1, 13.0f);
        j13.setGravity(17);
        this.S.addView(j13, w7.z5.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.N = linearLayout7;
        linearLayout7.setOrientation(0);
        this.S.addView(linearLayout7, w7.z5.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.O = null;
        d(true);
    }

    public final void a(int i10, long j10, TLRPC.Document document, String str) {
        b6[] b6VarArr;
        float f7;
        this.W = i10;
        this.f1142a0 = j10;
        this.f1144b0 = document;
        this.f1146c0 = str;
        this.f1152h0 = false;
        this.f1154j0 = false;
        int i11 = 0;
        while (true) {
            b6VarArr = this.f1157n;
            if (i11 >= b6VarArr.length) {
                break;
            }
            b6 b6Var = b6VarArr[i11];
            if (b6Var != null) {
                AndroidUtilities.removeFromParent(b6Var);
            }
            i11++;
        }
        w5 w5Var = this.h;
        View[] viewArr = w5Var.f2365a;
        v5 v5Var = w5Var.H;
        if (v5Var != null) {
            v5Var.e = true;
            v5Var.f2305l = false;
            v5Var.f2297a.H = null;
            w5Var.H = null;
        }
        ValueAnimator valueAnimator = w5Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            w5Var.G = null;
        }
        w5Var.F = -1;
        w5Var.E = 0.0f;
        w5Var.v.clear();
        w5Var.f2372w.clear();
        w5Var.f2373x.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            w5Var.f2374y[i12] = 0.0f;
        }
        w5Var.removeAllViews();
        for (int i13 = 0; i13 < viewArr.length; i13++) {
            viewArr[i13].setAlpha(1.0f);
            viewArr[i13].setVisibility(0);
            w5Var.addView(viewArr[i13], w7.z5.e(108, 108, 17));
        }
        Matrix.setIdentityM(w5Var.f2367c, 0);
        w5Var.e = 0.0f;
        w5Var.d = 0.0f;
        w5Var.f2368f = true;
        b6 b6Var2 = new b6(getContext());
        b6VarArr[0] = b6Var2;
        addView(b6Var2, w7.z5.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        b6 b6Var3 = new b6(getContext());
        b6VarArr[1] = b6Var3;
        addView(b6Var3, w7.z5.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        b6 b6Var4 = new b6(getContext());
        b6VarArr[2] = b6Var4;
        addView(b6Var4, w7.z5.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        b6 b6Var5 = new b6(getContext());
        b6VarArr[3] = b6Var5;
        addView(b6Var5, w7.z5.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i14 = 0; i14 < b6VarArr.length; i14++) {
            w7.b6.a(b6VarArr[i14]);
            b6VarArr[i14].setClickable(true);
            b6VarArr[i14].setOnClickListener(new o5(this, 5));
        }
        d(false);
        this.f1152h0 = false;
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
        if (this.f1159s) {
            f7 = 0.0f;
        } else if (this.f1147d0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        this.E.setAlpha(f7);
        z5 z5Var = this.f1149f;
        z5Var.setVisibility(8);
        z5Var.setAlpha(0.0f);
        String string = LocaleController.getString(R.string.GiftCraftButton);
        org.telegram.ui.Components.q6 q6Var = this.H;
        q6Var.setText(string);
        q6Var.setTranslationY(0.0f);
        this.I.setAlpha(1.0f);
        GiftAuctionController.getInstance(i10).requestAuctionUpgrades(j10, new p5(this, j10, j10, 0));
    }

    public final void b(r5 r5Var) {
        if (r5Var.d != null) {
            c(r5Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(r5Var.f2106f * 100.0f), r5Var.d.name)));
        } else if (r5Var.e != null) {
            c(r5Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(r5Var.f2106f * 100.0f), r5Var.e.name)));
        }
    }

    public final void c(r5 r5Var, SpannableStringBuilder spannableStringBuilder) {
        float f7;
        float f10;
        ei.x3 x3Var = this.T;
        View view = null;
        if (x3Var != null) {
            x3Var.e(true);
            this.T = null;
        }
        if (!this.f1152h0 && !this.f1154j0) {
            if (r5Var.getParent() instanceof View) {
                view = (View) r5Var.getParent();
            }
            if (view != null) {
                f7 = view.getX();
            } else {
                f7 = 0.0f;
            }
            float x10 = r5Var.getX() + f7;
            if (view != null) {
                f10 = view.getY();
            } else {
                f10 = 0.0f;
            }
            float y3 = r5Var.getY() + f10;
            ei.x3 x3Var2 = new ei.x3(getContext(), 3);
            this.T = x3Var2;
            x3Var2.p(true);
            this.T.s(spannableStringBuilder);
            ei.x3 x3Var3 = this.T;
            x3Var3.h = ei.x3.a(x3Var3.getText(), this.T.getTextPaint());
            ei.x3 x3Var4 = this.T;
            x3Var4.K = Layout.Alignment.ALIGN_CENTER;
            x3Var4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            addView(this.T, w7.z5.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            this.T.setTranslationY(y3 - AndroidUtilities.dp(100.0f));
            this.T.m(0.0f, ((r5Var.getWidth() / 2.0f) + x10) - AndroidUtilities.dp(2.0f));
            this.T.u();
        }
    }

    public final void d(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: ai.d6.d(boolean):void");
    }

    public TL_stars.StarGift getFirstGift() {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            b6[] b6VarArr = this.f1157n;
            if (i10 >= b6VarArr.length) {
                return null;
            }
            b6 b6Var = b6VarArr[i10];
            if (b6Var != null) {
                TL_stars.StarGift starGift2 = b6Var.h;
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
            b6[] b6VarArr = this.f1157n;
            if (i10 < b6VarArr.length) {
                b6 b6Var = b6VarArr[i10];
                if (b6Var != null) {
                    TL_stars.StarGift starGift = b6Var.h;
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
            b6[] b6VarArr = this.f1157n;
            if (i10 < b6VarArr.length) {
                b6 b6Var = b6VarArr[i10];
                if (b6Var != null) {
                    TL_stars.StarGift starGift2 = b6Var.h;
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
        this.f1150f0 = callback2;
    }

    public void setOnClose(Runnable runnable) {
        this.f1151g0 = runnable;
    }

    public void setOnCraft(Utilities.Callback3<ArrayList<TL_stars.StarGift>, Utilities.Callback2<TL_stars.StarGift, Runnable>, Runnable> callback3) {
        this.f1148e0 = callback3;
    }
}
