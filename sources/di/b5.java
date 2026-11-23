package di;

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
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.messenger.r10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rh0;
public final class b5 extends FrameLayout {
    public final q4[] E;
    public final org.telegram.ui.Components.x5 F;
    public final r4 G;
    public final LinearLayout H;
    public final org.telegram.ui.Components.o6 I;
    public final org.telegram.ui.Components.o6 J;
    public final rh0 K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final LinearLayout O;
    public bi.i3[] P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public final FrameLayout T;
    public hi.l3 U;
    public final int[] V;
    public final int[] W;
    public final org.telegram.ui.ActionBar.h6 f8521a;
    public int f8522a0;
    public final a5 f8523b;
    public long f8524b0;
    public final ImageView f8525c;
    public TLRPC.Document f8526c0;
    public final ai.g0[] d;
    public String f8527d0;
    public final ai.g0 f8528e;
    public ArrayList f8529e0;
    public final x4 f8530f;
    public t10 f8531f0;
    public r10 f8532g0;
    public final v4 h;
    public Runnable f8533h0;
    public boolean f8534i0;
    public boolean f8535j0;
    public boolean f8536k0;
    public Runnable f8537l0;
    public rh0 m0;
    public final z4[] f8538n;
    public SpannableStringBuilder f8539n0;
    public final xh.l f8540r;
    public boolean f8541s;
    public final LinearLayout f8542w;
    public final LinearLayout f8543x;
    public final q4[] f8544y;

    public b5(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        float f10;
        boolean z10;
        float f11;
        int i7;
        this.V = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.W = new int[]{org.telegram.ui.ActionBar.m6.r1(0.08f, -1), org.telegram.ui.ActionBar.m6.r1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.f8521a = h6Var;
        a5 a5Var = new a5();
        this.f8523b = a5Var;
        Drawable g10 = i5.c.g(context, 2131231111);
        g10.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        a5Var.f8474g = g10;
        setBackground(a5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        addView(frameLayout, c8.na.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.f8525c = imageView;
        imageView.setImageResource(2131232504);
        imageView.setBackground(new p5(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.m6.r1(0.08f, -1)));
        frameLayout.addView(imageView, c8.na.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new o4(this, 0));
        c8.sa.a(imageView);
        ImageView e10 = o10.e(context, 2131232098);
        e10.setBackground(new p5(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.m6.r1(0.08f, -1)));
        frameLayout.addView(e10, c8.na.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        e10.setOnClickListener(new o4(this, 1));
        c8.sa.a(e10);
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(hd.N0(2131749741, null));
        addView(textView, c8.na.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        addView(frameLayout2, c8.na.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.S = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, c8.na.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.T = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, c8.na.e(-1, -1, 119));
        xh.l lVar = new xh.l(context);
        this.f8540r = lVar;
        lVar.setGravity(17);
        lVar.setTextSize(1, 13.0f);
        lVar.setTextColor(-1);
        frameLayout2.addView(lVar, c8.na.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f8542w = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(2, 320L);
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        nr nrVar = nr.h;
        layoutTransition.setInterpolator(2, nrVar);
        layoutTransition.setInterpolator(3, nrVar);
        layoutTransition.setInterpolator(0, nrVar);
        layoutTransition.setInterpolator(1, nrVar);
        layoutTransition.setInterpolator(4, nrVar);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f8543x = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, nrVar);
        layoutTransition2.setInterpolator(3, nrVar);
        layoutTransition2.setInterpolator(0, nrVar);
        layoutTransition2.setInterpolator(1, nrVar);
        layoutTransition2.setInterpolator(4, nrVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.f8544y = new q4[4];
        this.E = new q4[4];
        for (int i10 = 0; i10 < 4; i10++) {
            LinearLayout linearLayout3 = this.f8542w;
            q4[] q4VarArr = this.f8544y;
            q4 q4Var = new q4(context);
            q4VarArr[i10] = q4Var;
            linearLayout3.addView(q4Var, c8.na.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f8544y[i10].setOnClickListener(new o4(this, 2));
        }
        for (int i11 = 0; i11 < 4; i11++) {
            LinearLayout linearLayout4 = this.f8542w;
            q4[] q4VarArr2 = this.E;
            q4 q4Var2 = new q4(context);
            q4VarArr2[i11] = q4Var2;
            linearLayout4.addView(q4Var2, c8.na.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.E[i11].setOnClickListener(new o4(this, 3));
        }
        this.f8538n = new z4[4];
        this.d = new ai.g0[6];
        int i12 = 0;
        for (int i13 = 6; i12 < i13; i13 = 6) {
            ai.g0[] g0VarArr = this.d;
            if (i12 == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            ai.g0 g0Var = new ai.g0(5, context, false);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new p5(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.m6.r1(0.08f, -1)));
            g0Var.addView(frameLayout5, c8.na.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
            q9Var.setImageResource(2131231606);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.45f;
            }
            q9Var.setAlpha(f11);
            if (z10) {
                i7 = 42;
            } else {
                i7 = 64;
            }
            frameLayout5.addView(q9Var, c8.na.e(i7, z10 ? 42 : 64, 17));
            if (z10) {
                q9Var.setTranslationX(org.telegram.messenger.g0.L(-4.0f));
                w4 w4Var = new w4(context);
                g0Var.f1200c = w4Var;
                w4Var.f9952e = org.telegram.messenger.g0.L(37.0f);
                w4Var.f9949a.setStrokeWidth(org.telegram.messenger.g0.N(4.66f));
                frameLayout5.addView(w4Var, c8.na.e(90, 90, 17));
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
                g0Var.f1199b = o6Var;
                o6Var.getDrawable().r(false, true);
                o6Var.setTypeface(org.telegram.messenger.g0.o());
                o6Var.setTextColor(-1);
                o6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                o6Var.setGravity(17);
                o6Var.setText("0%");
                frameLayout5.addView(o6Var, c8.na.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            g0VarArr[i12] = g0Var;
            i12++;
        }
        this.f8528e = this.d[5];
        x4 x4Var = new x4(context);
        this.f8530f = x4Var;
        x4Var.setVisibility(8);
        x4Var.setAlpha(0.0f);
        addView(x4Var, c8.na.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        v4 v4Var = new v4(context, this.d);
        this.h = v4Var;
        addView(v4Var, c8.na.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.F = x5Var;
        x5Var.setTextSize(1, 12.0f);
        x5Var.setTypeface(org.telegram.messenger.g0.o());
        x5Var.setText(org.telegram.messenger.g0.I2(hd.N0(2131749737, null), false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
        x5Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        x5Var.setGravity(17);
        x5Var.setTextColor(-1);
        if (this.f8529e0 != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.25f;
        }
        x5Var.setAlpha(f10);
        x5Var.setBackground(new p5(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.m6.r1(0.08f, -1)));
        c8.sa.b(x5Var, 0.02f, 1.2f);
        this.R.addView(x5Var, c8.na.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        x5Var.setOnClickListener(new ai.o2(16, this, h6Var));
        this.R.addView(this.f8542w, c8.na.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.R.addView(this.f8543x, c8.na.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.H = linearLayout5;
        linearLayout5.setOrientation(1);
        r4 r4Var = new r4();
        this.G = r4Var;
        linearLayout5.setBackground(r4Var);
        r4Var.a(org.telegram.ui.ActionBar.m6.r1(0.08f, -1), org.telegram.ui.ActionBar.m6.r1(0.08f, -1));
        c8.sa.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, c8.na.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new o4(this, 4));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.I = o6Var2;
        o6Var2.setTypeface(org.telegram.messenger.g0.o());
        o6Var2.setGravity(17);
        o6Var2.setTextColor(org.telegram.ui.ActionBar.m6.r1(0.75f, -1));
        o6Var2.setText(hd.N0(2131749780, null));
        o6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        linearLayout5.addView(o6Var2, c8.na.s(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var3 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.J = o6Var3;
        o6Var3.getDrawable().r(true, false);
        o6Var3.setGravity(17);
        o6Var3.setTextColor(org.telegram.ui.ActionBar.m6.r1(0.75f, -1));
        o6Var3.setText(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749749, "0%")));
        o6Var3.setTextSize(org.telegram.messenger.g0.L(12.0f));
        linearLayout5.addView(o6Var3, c8.na.s(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ?? imageView2 = new ImageView(context);
        this.K = imageView2;
        imageView2.setAutoRepeat(true);
        imageView2.f(2131624036, 30, 30, null);
        linearLayout6.addView((View) imageView2, c8.na.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setGravity(17);
        textView2.setText(hd.N0(2131749757, null));
        linearLayout6.addView(textView2, c8.na.t(-2, -2, 17, 0, 0, 0, 0));
        this.S.addView(linearLayout6, c8.na.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.m6.r1(0.5f, -1));
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setGravity(17);
        TextView m10 = org.telegram.ui.Cells.c0.m(this.S, textView3, c8.na.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.M = m10;
        m10.setTextSize(1, 13.0f);
        m10.setTextColor(-1);
        m10.setTypeface(org.telegram.messenger.g0.o());
        m10.setGravity(17);
        m10.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        m10.setBackground(new p5(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.m6.r1(0.08f, -1)));
        TextView m11 = org.telegram.ui.Cells.c0.m(this.S, m10, c8.na.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        m11.setTextSize(1, 13.0f);
        m11.setTextColor(org.telegram.ui.ActionBar.m6.r1(0.5f, -1));
        org.telegram.messenger.f3.k(m11, 17, null, 2131749758);
        TextView m12 = org.telegram.ui.Cells.c0.m(this.S, m11, c8.na.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        m12.setText(hd.N0(2131749771, null));
        m12.setTextColor(-505270);
        m12.setTextSize(1, 20.0f);
        m12.setTypeface(org.telegram.messenger.g0.o());
        m12.setGravity(17);
        TextView m13 = org.telegram.ui.Cells.c0.m(this.T, m12, c8.na.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.N = m13;
        m13.setTextColor(-17253);
        m13.setTextSize(1, 13.0f);
        m13.setGravity(17);
        this.T.addView(m13, c8.na.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.O = linearLayout7;
        linearLayout7.setOrientation(0);
        this.T.addView(linearLayout7, c8.na.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.P = null;
        d(true);
    }

    public final void a(int i7, long j3, TLRPC.Document document, String str) {
        z4[] z4VarArr;
        float f10;
        this.f8522a0 = i7;
        this.f8524b0 = j3;
        this.f8526c0 = document;
        this.f8527d0 = str;
        this.f8534i0 = false;
        this.f8536k0 = false;
        int i10 = 0;
        while (true) {
            z4VarArr = this.f8538n;
            if (i10 >= z4VarArr.length) {
                break;
            }
            z4 z4Var = z4VarArr[i10];
            if (z4Var != null) {
                org.telegram.messenger.g0.E2(z4Var);
            }
            i10++;
        }
        v4 v4Var = this.h;
        View[] viewArr = v4Var.f9911a;
        u4 u4Var = v4Var.I;
        if (u4Var != null) {
            u4Var.f9856e = true;
            u4Var.f9862l = false;
            u4Var.f9853a.I = null;
            v4Var.I = null;
        }
        ValueAnimator valueAnimator = v4Var.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            v4Var.H = null;
        }
        v4Var.G = -1;
        v4Var.F = 0.0f;
        v4Var.f9919w.clear();
        v4Var.f9920x.clear();
        v4Var.f9921y.clear();
        for (int i11 = 0; i11 < 6; i11++) {
            v4Var.E[i11] = 0.0f;
        }
        v4Var.removeAllViews();
        for (int i12 = 0; i12 < viewArr.length; i12++) {
            viewArr[i12].setAlpha(1.0f);
            viewArr[i12].setVisibility(0);
            v4Var.addView(viewArr[i12], c8.na.e(108, 108, 17));
        }
        Matrix.setIdentityM(v4Var.f9913c, 0);
        v4Var.f9914e = 0.0f;
        v4Var.d = 0.0f;
        v4Var.f9915f = true;
        z4 z4Var2 = new z4(getContext());
        z4VarArr[0] = z4Var2;
        addView(z4Var2, c8.na.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        z4 z4Var3 = new z4(getContext());
        z4VarArr[1] = z4Var3;
        addView(z4Var3, c8.na.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        z4 z4Var4 = new z4(getContext());
        z4VarArr[2] = z4Var4;
        addView(z4Var4, c8.na.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        z4 z4Var5 = new z4(getContext());
        z4VarArr[3] = z4Var5;
        addView(z4Var5, c8.na.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i13 = 0; i13 < z4VarArr.length; i13++) {
            c8.sa.a(z4VarArr[i13]);
            z4VarArr[i13].setClickable(true);
            z4VarArr[i13].setOnClickListener(new o4(this, 5));
        }
        d(false);
        this.f8534i0 = false;
        FrameLayout frameLayout = this.R;
        frameLayout.animate().cancel();
        frameLayout.setAlpha(1.0f);
        LinearLayout linearLayout = this.H;
        linearLayout.animate().cancel();
        linearLayout.setAlpha(1.0f);
        FrameLayout frameLayout2 = this.S;
        frameLayout2.animate().cancel();
        frameLayout2.setAlpha(0.0f);
        FrameLayout frameLayout3 = this.T;
        frameLayout3.animate().cancel();
        frameLayout3.setAlpha(0.0f);
        FrameLayout frameLayout4 = this.Q;
        frameLayout4.animate().cancel();
        frameLayout4.setAlpha(1.0f);
        if (this.f8541s) {
            f10 = 0.0f;
        } else if (this.f8529e0 != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.25f;
        }
        this.F.setAlpha(f10);
        x4 x4Var = this.f8530f;
        x4Var.setVisibility(8);
        x4Var.setAlpha(0.0f);
        String N0 = hd.N0(2131749780, null);
        org.telegram.ui.Components.o6 o6Var = this.I;
        o6Var.setText(N0);
        o6Var.setTranslationY(0.0f);
        this.J.setAlpha(1.0f);
        org.telegram.messenger.v9.c(i7).j(j3, new p4(this, j3, j3, 0));
    }

    public final void b(q4 q4Var) {
        if (q4Var.d != null) {
            c(q4Var, org.telegram.messenger.g0.W2(hd.G(Math.round(q4Var.f9571f * 100.0f), "GiftCraftBackdropChance", q4Var.d.name)));
        } else if (q4Var.f9570e != null) {
            c(q4Var, org.telegram.messenger.g0.W2(hd.G(Math.round(q4Var.f9571f * 100.0f), "GiftCraftSymbolChance", q4Var.f9570e.name)));
        }
    }

    public final void c(q4 q4Var, SpannableStringBuilder spannableStringBuilder) {
        float f10;
        float f11;
        hi.l3 l3Var = this.U;
        View view = null;
        if (l3Var != null) {
            l3Var.f(true);
            this.U = null;
        }
        if (!this.f8534i0 && !this.f8536k0) {
            if (q4Var.getParent() instanceof View) {
                view = (View) q4Var.getParent();
            }
            if (view != null) {
                f10 = view.getX();
            } else {
                f10 = 0.0f;
            }
            float x10 = q4Var.getX() + f10;
            if (view != null) {
                f11 = view.getY();
            } else {
                f11 = 0.0f;
            }
            float y10 = q4Var.getY() + f11;
            hi.l3 l3Var2 = new hi.l3(getContext(), 3);
            this.U = l3Var2;
            l3Var2.r(true);
            this.U.v(spannableStringBuilder);
            hi.l3 l3Var3 = this.U;
            l3Var3.h = hi.l3.a(l3Var3.getText(), this.U.getTextPaint());
            hi.l3 l3Var4 = this.U;
            l3Var4.L = Layout.Alignment.ALIGN_CENTER;
            l3Var4.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
            addView(this.U, c8.na.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            this.U.setTranslationY(y10 - org.telegram.messenger.g0.L(100.0f));
            this.U.p(0.0f, ((q4Var.getWidth() / 2.0f) + x10) - org.telegram.messenger.g0.L(2.0f));
            this.U.x();
        }
    }

    public final void d(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: di.b5.d(boolean):void");
    }

    public TL_stars.StarGift getFirstGift() {
        TL_stars.StarGift starGift;
        int i7 = 0;
        while (true) {
            z4[] z4VarArr = this.f8538n;
            if (i7 >= z4VarArr.length) {
                return null;
            }
            z4 z4Var = z4VarArr[i7];
            if (z4Var != null) {
                TL_stars.StarGift starGift2 = z4Var.h;
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
            i7++;
        }
    }

    public int getGiftsSelectedCount() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            z4[] z4VarArr = this.f8538n;
            if (i7 < z4VarArr.length) {
                z4 z4Var = z4VarArr[i7];
                if (z4Var != null) {
                    TL_stars.StarGift starGift = z4Var.h;
                    if (starGift == null) {
                        starGift = null;
                    }
                    if (starGift != null) {
                        i10++;
                    }
                }
                i7++;
            } else {
                return i10;
            }
        }
    }

    public int getGiftsSuccessChance() {
        TL_stars.StarGift starGift;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            z4[] z4VarArr = this.f8538n;
            if (i7 < z4VarArr.length) {
                z4 z4Var = z4VarArr[i7];
                if (z4Var != null) {
                    TL_stars.StarGift starGift2 = z4Var.h;
                    if (starGift2 != null) {
                        starGift = starGift2;
                    } else {
                        starGift = null;
                    }
                    if (starGift != null) {
                        if (starGift2 == null) {
                            starGift2 = null;
                        }
                        i10 += starGift2.craft_chance_permille;
                    }
                }
                i7++;
            } else {
                return i10;
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setOnAddGift(r10 r10Var) {
        this.f8532g0 = r10Var;
    }

    public void setOnClose(Runnable runnable) {
        this.f8533h0 = runnable;
    }

    public void setOnCraft(t10 t10Var) {
        this.f8531f0 = t10Var;
    }
}
