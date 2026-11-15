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
import org.telegram.messenger.i20;
import org.telegram.messenger.s10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;
public final class y4 extends FrameLayout {
    public final n4[] E;
    public final org.telegram.ui.Components.o5 F;
    public final o4 G;
    public final LinearLayout H;
    public final org.telegram.ui.Components.h6 I;
    public final org.telegram.ui.Components.h6 J;
    public final fh0 K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final LinearLayout O;
    public bi.i2[] P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public final FrameLayout T;
    public hi.l3 U;
    public final int[] V;
    public final int[] W;
    public final org.telegram.ui.ActionBar.e6 f9769a;
    public int f9770a0;
    public final x4 f9771b;
    public long f9772b0;
    public final ImageView f9773c;
    public TLRPC.Document f9774c0;
    public final ai.j0[] d;
    public String f9775d0;
    public final ai.j0 f9776e;
    public ArrayList f9777e0;
    public final u4 f9778f;
    public u10 f9779f0;
    public s10 f9780g0;
    public final s4 h;
    public Runnable f9781h0;
    public boolean f9782i0;
    public boolean f9783j0;
    public boolean f9784k0;
    public Runnable f9785l0;
    public fh0 m0;
    public final w4[] f9786n;
    public SpannableStringBuilder f9787n0;
    public final xh.l f9788r;
    public boolean f9789s;
    public final LinearLayout f9790w;
    public final LinearLayout f9791x;
    public final n4[] f9792y;

    public y4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        float f10;
        boolean z10;
        float f11;
        int i7;
        int i10 = 6;
        this.V = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.W = new int[]{org.telegram.ui.ActionBar.j6.r1(0.08f, -1), org.telegram.ui.ActionBar.j6.r1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.f9769a = e6Var;
        x4 x4Var = new x4();
        this.f9771b = x4Var;
        Drawable g10 = i5.c.g(context, 2131231111);
        g10.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        x4Var.f9728g = g10;
        setBackground(x4Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        addView(frameLayout, c8.ja.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.f9773c = imageView;
        imageView.setImageResource(2131232503);
        imageView.setBackground(new m5(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.j6.r1(0.08f, -1)));
        frameLayout.addView(imageView, c8.ja.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new l4(this, 0));
        c8.na.a(imageView);
        ImageView e10 = i20.e(context, 2131232097);
        e10.setBackground(new m5(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.j6.r1(0.08f, -1)));
        frameLayout.addView(e10, c8.ja.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        boolean z11 = true;
        e10.setOnClickListener(new l4(this, 1));
        c8.na.a(e10);
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(hd.M0(2131749758, null));
        addView(textView, c8.ja.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        addView(frameLayout2, c8.ja.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.S = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, c8.ja.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.T = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, c8.ja.e(-1, -1, 119));
        xh.l lVar = new xh.l(context);
        this.f9788r = lVar;
        lVar.setGravity(17);
        lVar.setTextSize(1, 13.0f);
        lVar.setTextColor(-1);
        frameLayout2.addView(lVar, c8.ja.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f9790w = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(2, 320L);
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        int i11 = 4;
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
        this.f9791x = linearLayout2;
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
        this.f9792y = new n4[4];
        this.E = new n4[4];
        for (int i12 = 0; i12 < 4; i12++) {
            LinearLayout linearLayout3 = this.f9790w;
            n4[] n4VarArr = this.f9792y;
            n4 n4Var = new n4(context);
            n4VarArr[i12] = n4Var;
            linearLayout3.addView(n4Var, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f9792y[i12].setOnClickListener(new l4(this, 2));
        }
        for (int i13 = 0; i13 < 4; i13++) {
            LinearLayout linearLayout4 = this.f9790w;
            n4[] n4VarArr2 = this.E;
            n4 n4Var2 = new n4(context);
            n4VarArr2[i13] = n4Var2;
            linearLayout4.addView(n4Var2, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.E[i13].setOnClickListener(new l4(this, 3));
        }
        this.f9786n = new w4[4];
        this.d = new ai.j0[6];
        int i14 = 0;
        while (i14 < i10) {
            ai.j0[] j0VarArr = this.d;
            if (i14 == 5) {
                z10 = z11;
            } else {
                z10 = false;
            }
            ai.j0 j0Var = new ai.j0(i11, context, false);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new m5(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.j6.r1(0.08f, -1)));
            j0Var.addView(frameLayout5, c8.ja.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
            i9Var.setImageResource(2131231605);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.45f;
            }
            i9Var.setAlpha(f11);
            if (z10) {
                i7 = 42;
            } else {
                i7 = 64;
            }
            frameLayout5.addView(i9Var, c8.ja.e(i7, z10 ? 42 : 64, 17));
            if (z10) {
                i9Var.setTranslationX(org.telegram.messenger.g0.L(-4.0f));
                t4 t4Var = new t4(context);
                j0Var.f1266c = t4Var;
                t4Var.f9469e = org.telegram.messenger.g0.L(37.0f);
                t4Var.f9466a.setStrokeWidth(org.telegram.messenger.g0.N(4.66f));
                frameLayout5.addView(t4Var, c8.ja.e(90, 90, 17));
                org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
                j0Var.f1265b = h6Var;
                h6Var.getDrawable().r(false, true);
                h6Var.setTypeface(org.telegram.messenger.g0.o());
                h6Var.setTextColor(-1);
                h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                h6Var.setGravity(17);
                h6Var.setText("0%");
                frameLayout5.addView(h6Var, c8.ja.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            j0VarArr[i14] = j0Var;
            i14++;
            i10 = 6;
            i11 = 4;
            z11 = true;
        }
        this.f9776e = this.d[5];
        u4 u4Var = new u4(context);
        this.f9778f = u4Var;
        u4Var.setVisibility(8);
        u4Var.setAlpha(0.0f);
        addView(u4Var, c8.ja.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        s4 s4Var = new s4(context, this.d);
        this.h = s4Var;
        addView(s4Var, c8.ja.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(context);
        this.F = o5Var;
        o5Var.setTextSize(1, 12.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        o5Var.setText(org.telegram.messenger.g0.I2(hd.M0(2131749754, null), false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
        o5Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        o5Var.setGravity(17);
        o5Var.setTextColor(-1);
        if (this.f9777e0 != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.25f;
        }
        o5Var.setAlpha(f10);
        o5Var.setBackground(new m5(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.j6.r1(0.08f, -1)));
        c8.na.b(o5Var, 0.02f, 1.2f);
        this.R.addView(o5Var, c8.ja.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        o5Var.setOnClickListener(new ai.t2(15, this, e6Var));
        this.R.addView(this.f9790w, c8.ja.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.R.addView(this.f9791x, c8.ja.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.H = linearLayout5;
        linearLayout5.setOrientation(1);
        o4 o4Var = new o4();
        this.G = o4Var;
        linearLayout5.setBackground(o4Var);
        o4Var.a(org.telegram.ui.ActionBar.j6.r1(0.08f, -1), org.telegram.ui.ActionBar.j6.r1(0.08f, -1));
        c8.na.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, c8.ja.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new l4(this, 4));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.I = h6Var2;
        h6Var2.setTypeface(org.telegram.messenger.g0.o());
        h6Var2.setGravity(17);
        h6Var2.setTextColor(org.telegram.ui.ActionBar.j6.r1(0.75f, -1));
        h6Var2.setText(hd.M0(2131749797, null));
        h6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        linearLayout5.addView(h6Var2, c8.ja.s(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.J = h6Var3;
        h6Var3.getDrawable().r(true, false);
        h6Var3.setGravity(17);
        h6Var3.setTextColor(org.telegram.ui.ActionBar.j6.r1(0.75f, -1));
        h6Var3.setText(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749766, "0%")));
        h6Var3.setTextSize(org.telegram.messenger.g0.L(12.0f));
        linearLayout5.addView(h6Var3, c8.ja.s(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ?? imageView2 = new ImageView(context);
        this.K = imageView2;
        imageView2.setAutoRepeat(true);
        imageView2.f(2131624036, 30, 30, null);
        linearLayout6.addView((View) imageView2, c8.ja.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setGravity(17);
        textView2.setText(hd.M0(2131749774, null));
        linearLayout6.addView(textView2, c8.ja.t(-2, -2, 17, 0, 0, 0, 0));
        this.S.addView(linearLayout6, c8.ja.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.r1(0.5f, -1));
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setGravity(17);
        TextView k10 = org.telegram.ui.Cells.y0.k(this.S, textView3, c8.ja.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.M = k10;
        k10.setTextSize(1, 13.0f);
        k10.setTextColor(-1);
        k10.setTypeface(org.telegram.messenger.g0.o());
        k10.setGravity(17);
        k10.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        k10.setBackground(new m5(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.j6.r1(0.08f, -1)));
        TextView k11 = org.telegram.ui.Cells.y0.k(this.S, k10, c8.ja.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        k11.setTextSize(1, 13.0f);
        k11.setTextColor(org.telegram.ui.ActionBar.j6.r1(0.5f, -1));
        org.telegram.messenger.k5.l(k11, 17, null, 2131749775);
        TextView k12 = org.telegram.ui.Cells.y0.k(this.S, k11, c8.ja.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        k12.setText(hd.M0(2131749788, null));
        k12.setTextColor(-505270);
        k12.setTextSize(1, 20.0f);
        k12.setTypeface(org.telegram.messenger.g0.o());
        k12.setGravity(17);
        TextView k13 = org.telegram.ui.Cells.y0.k(this.T, k12, c8.ja.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.N = k13;
        k13.setTextColor(-17253);
        k13.setTextSize(1, 13.0f);
        k13.setGravity(17);
        this.T.addView(k13, c8.ja.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.O = linearLayout7;
        linearLayout7.setOrientation(0);
        this.T.addView(linearLayout7, c8.ja.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.P = null;
        d(true);
    }

    public final void a(int i7, long j3, TLRPC.Document document, String str) {
        w4[] w4VarArr;
        float f10;
        this.f9770a0 = i7;
        this.f9772b0 = j3;
        this.f9774c0 = document;
        this.f9775d0 = str;
        this.f9782i0 = false;
        this.f9784k0 = false;
        int i10 = 0;
        while (true) {
            w4VarArr = this.f9786n;
            if (i10 >= w4VarArr.length) {
                break;
            }
            w4 w4Var = w4VarArr[i10];
            if (w4Var != null) {
                org.telegram.messenger.g0.E2(w4Var);
            }
            i10++;
        }
        s4 s4Var = this.h;
        View[] viewArr = s4Var.f9384a;
        r4 r4Var = s4Var.I;
        if (r4Var != null) {
            r4Var.f9328e = true;
            r4Var.f9334l = false;
            r4Var.f9325a.I = null;
            s4Var.I = null;
        }
        ValueAnimator valueAnimator = s4Var.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            s4Var.H = null;
        }
        s4Var.G = -1;
        s4Var.F = 0.0f;
        s4Var.f9392w.clear();
        s4Var.f9393x.clear();
        s4Var.f9394y.clear();
        for (int i11 = 0; i11 < 6; i11++) {
            s4Var.E[i11] = 0.0f;
        }
        s4Var.removeAllViews();
        for (int i12 = 0; i12 < viewArr.length; i12++) {
            viewArr[i12].setAlpha(1.0f);
            viewArr[i12].setVisibility(0);
            s4Var.addView(viewArr[i12], c8.ja.e(108, 108, 17));
        }
        Matrix.setIdentityM(s4Var.f9386c, 0);
        s4Var.f9387e = 0.0f;
        s4Var.d = 0.0f;
        s4Var.f9388f = true;
        w4 w4Var2 = new w4(getContext());
        w4VarArr[0] = w4Var2;
        addView(w4Var2, c8.ja.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        w4 w4Var3 = new w4(getContext());
        w4VarArr[1] = w4Var3;
        addView(w4Var3, c8.ja.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        w4 w4Var4 = new w4(getContext());
        w4VarArr[2] = w4Var4;
        addView(w4Var4, c8.ja.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        w4 w4Var5 = new w4(getContext());
        w4VarArr[3] = w4Var5;
        addView(w4Var5, c8.ja.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i13 = 0; i13 < w4VarArr.length; i13++) {
            c8.na.a(w4VarArr[i13]);
            w4VarArr[i13].setClickable(true);
            w4VarArr[i13].setOnClickListener(new l4(this, 5));
        }
        d(false);
        this.f9782i0 = false;
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
        if (this.f9789s) {
            f10 = 0.0f;
        } else if (this.f9777e0 != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.25f;
        }
        this.F.setAlpha(f10);
        u4 u4Var = this.f9778f;
        u4Var.setVisibility(8);
        u4Var.setAlpha(0.0f);
        String M0 = hd.M0(2131749797, null);
        org.telegram.ui.Components.h6 h6Var = this.I;
        h6Var.setText(M0);
        h6Var.setTranslationY(0.0f);
        this.J.setAlpha(1.0f);
        org.telegram.messenger.v9.c(i7).j(j3, new m4(this, j3, j3, 0));
    }

    public final void b(n4 n4Var) {
        if (n4Var.d != null) {
            c(n4Var, org.telegram.messenger.g0.X2(hd.G(Math.round(n4Var.f9106f * 100.0f), "GiftCraftBackdropChance", n4Var.d.name)));
        } else if (n4Var.f9105e != null) {
            c(n4Var, org.telegram.messenger.g0.X2(hd.G(Math.round(n4Var.f9106f * 100.0f), "GiftCraftSymbolChance", n4Var.f9105e.name)));
        }
    }

    public final void c(n4 n4Var, SpannableStringBuilder spannableStringBuilder) {
        float f10;
        float f11;
        hi.l3 l3Var = this.U;
        View view = null;
        if (l3Var != null) {
            l3Var.f(true);
            this.U = null;
        }
        if (!this.f9782i0 && !this.f9784k0) {
            if (n4Var.getParent() instanceof View) {
                view = (View) n4Var.getParent();
            }
            if (view != null) {
                f10 = view.getX();
            } else {
                f10 = 0.0f;
            }
            float x10 = n4Var.getX() + f10;
            if (view != null) {
                f11 = view.getY();
            } else {
                f11 = 0.0f;
            }
            float y10 = n4Var.getY() + f11;
            hi.l3 l3Var2 = new hi.l3(getContext(), 3);
            this.U = l3Var2;
            l3Var2.r(true);
            this.U.u(spannableStringBuilder);
            hi.l3 l3Var3 = this.U;
            l3Var3.h = hi.l3.a(l3Var3.getText(), this.U.getTextPaint());
            hi.l3 l3Var4 = this.U;
            l3Var4.L = Layout.Alignment.ALIGN_CENTER;
            l3Var4.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
            addView(this.U, c8.ja.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            this.U.setTranslationY(y10 - org.telegram.messenger.g0.L(100.0f));
            this.U.p(0.0f, ((n4Var.getWidth() / 2.0f) + x10) - org.telegram.messenger.g0.L(2.0f));
            this.U.w();
        }
    }

    public final void d(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: di.y4.d(boolean):void");
    }

    public TL_stars.StarGift getFirstGift() {
        TL_stars.StarGift starGift;
        int i7 = 0;
        while (true) {
            w4[] w4VarArr = this.f9786n;
            if (i7 >= w4VarArr.length) {
                return null;
            }
            w4 w4Var = w4VarArr[i7];
            if (w4Var != null) {
                TL_stars.StarGift starGift2 = w4Var.h;
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
            w4[] w4VarArr = this.f9786n;
            if (i7 < w4VarArr.length) {
                w4 w4Var = w4VarArr[i7];
                if (w4Var != null) {
                    TL_stars.StarGift starGift = w4Var.h;
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
            w4[] w4VarArr = this.f9786n;
            if (i7 < w4VarArr.length) {
                w4 w4Var = w4VarArr[i7];
                if (w4Var != null) {
                    TL_stars.StarGift starGift2 = w4Var.h;
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

    public void setOnAddGift(s10 s10Var) {
        this.f9780g0 = s10Var;
    }

    public void setOnClose(Runnable runnable) {
        this.f9781h0 = runnable;
    }

    public void setOnCraft(u10 u10Var) {
        this.f9779f0 = u10Var;
    }
}
