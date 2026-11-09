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
import org.telegram.messenger.v10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.xq;
public final class d6 extends FrameLayout {
    public final q5[] D;
    public final org.telegram.ui.Components.q5 E;
    public final r5 F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.j6 H;
    public final org.telegram.ui.Components.j6 I;
    public final dh0 J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final LinearLayout N;
    public zh.y0[] O;
    public final FrameLayout P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public fi.m3 T;
    public final int[] U;
    public final int[] V;
    public int W;
    public final org.telegram.ui.ActionBar.g6 f3654a;
    public long f3655a0;
    public final c6 f3656b;
    public TLRPC.Document f3657b0;
    public final ImageView f3658c;
    public String f3659c0;
    public final x5[] d;
    public ArrayList f3660d0;
    public final x5 f3661e;
    public x10 f3662e0;
    public final z5 f3663f;
    public v10 f3664f0;
    public Runnable f3665g0;
    public final w5 h;
    public boolean f3666h0;
    public boolean f3667i0;
    public boolean f3668j0;
    public Runnable f3669k0;
    public dh0 f3670l0;
    public SpannableStringBuilder m0;
    public final b6[] f3671n;
    public final xh.l f3672r;
    public boolean f3673s;
    public final LinearLayout f3674w;
    public final LinearLayout f3675x;
    public final q5[] f3676y;

    public d6(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        float f10;
        boolean z9;
        float f11;
        int i7;
        int i10 = 6;
        this.U = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.V = new int[]{org.telegram.ui.ActionBar.l6.r1(0.08f, -1), org.telegram.ui.ActionBar.l6.r1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.f3654a = g6Var;
        c6 c6Var = new c6();
        this.f3656b = c6Var;
        Drawable h = jg.g.h(context, 2131231111);
        h.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        c6Var.f3574g = h;
        setBackground(c6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        addView(frameLayout, c8.ha.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.f3658c = imageView;
        imageView.setImageResource(2131232502);
        imageView.setBackground(new t6(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.l6.r1(0.08f, -1)));
        frameLayout.addView(imageView, c8.ha.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new n5(this, 0));
        c8.ka.a(imageView);
        ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131232096);
        e10.setBackground(new t6(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.l6.r1(0.08f, -1)));
        frameLayout.addView(e10, c8.ha.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        boolean z10 = true;
        e10.setOnClickListener(new n5(this, 1));
        c8.ka.a(e10);
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(org.telegram.messenger.id.M0(2131749758, null));
        addView(textView, c8.ha.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        addView(frameLayout2, c8.ha.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.R = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, c8.ha.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.S = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, c8.ha.e(-1, -1, 119));
        xh.l lVar = new xh.l(context);
        this.f3672r = lVar;
        lVar.setGravity(17);
        lVar.setTextSize(1, 13.0f);
        lVar.setTextColor(-1);
        frameLayout2.addView(lVar, c8.ha.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f3674w = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(2, 320L);
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        xq xqVar = xq.h;
        layoutTransition.setInterpolator(2, xqVar);
        layoutTransition.setInterpolator(3, xqVar);
        layoutTransition.setInterpolator(0, xqVar);
        layoutTransition.setInterpolator(1, xqVar);
        layoutTransition.setInterpolator(4, xqVar);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f3675x = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, xqVar);
        layoutTransition2.setInterpolator(3, xqVar);
        layoutTransition2.setInterpolator(0, xqVar);
        layoutTransition2.setInterpolator(1, xqVar);
        layoutTransition2.setInterpolator(4, xqVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.f3676y = new q5[4];
        this.D = new q5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            LinearLayout linearLayout3 = this.f3674w;
            q5[] q5VarArr = this.f3676y;
            q5 q5Var = new q5(context);
            q5VarArr[i11] = q5Var;
            linearLayout3.addView(q5Var, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f3676y[i11].setOnClickListener(new n5(this, 2));
        }
        for (int i12 = 0; i12 < 4; i12++) {
            LinearLayout linearLayout4 = this.f3674w;
            q5[] q5VarArr2 = this.D;
            q5 q5Var2 = new q5(context);
            q5VarArr2[i12] = q5Var2;
            linearLayout4.addView(q5Var2, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.D[i12].setOnClickListener(new n5(this, 3));
        }
        this.f3671n = new b6[4];
        this.d = new x5[6];
        int i13 = 0;
        while (i13 < i10) {
            x5[] x5VarArr = this.d;
            if (i13 == 5) {
                z9 = z10;
            } else {
                z9 = false;
            }
            x5 x5Var = new x5(0, context, false);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new t6(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.l6.r1(0.08f, -1)));
            x5Var.addView(frameLayout5, c8.ha.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
            l9Var.setImageResource(2131231605);
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.45f;
            }
            l9Var.setAlpha(f11);
            if (z9) {
                i7 = 42;
            } else {
                i7 = 64;
            }
            frameLayout5.addView(l9Var, c8.ha.e(i7, z9 ? 42 : 64, 17));
            if (z9) {
                l9Var.setTranslationX(org.telegram.messenger.g0.L(-4.0f));
                y5 y5Var = new y5(context);
                x5Var.f5025c = y5Var;
                y5Var.f5075e = org.telegram.messenger.g0.L(37.0f);
                y5Var.f5072a.setStrokeWidth(org.telegram.messenger.g0.N(4.66f));
                frameLayout5.addView(y5Var, c8.ha.e(90, 90, 17));
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
                x5Var.f5024b = j6Var;
                j6Var.getDrawable().r(false, true);
                j6Var.setTypeface(org.telegram.messenger.g0.o());
                j6Var.setTextColor(-1);
                j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                j6Var.setGravity(17);
                j6Var.setText("0%");
                frameLayout5.addView(j6Var, c8.ha.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            x5VarArr[i13] = x5Var;
            i13++;
            i10 = 6;
            z10 = true;
        }
        this.f3661e = this.d[5];
        z5 z5Var = new z5(context);
        this.f3663f = z5Var;
        z5Var.setVisibility(8);
        z5Var.setAlpha(0.0f);
        addView(z5Var, c8.ha.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        w5 w5Var = new w5(context, this.d);
        this.h = w5Var;
        addView(w5Var, c8.ha.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q5 q5Var3 = new org.telegram.ui.Components.q5(context);
        this.E = q5Var3;
        q5Var3.setTextSize(1, 12.0f);
        q5Var3.setTypeface(org.telegram.messenger.g0.o());
        q5Var3.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.id.M0(2131749754, null), false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
        q5Var3.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        q5Var3.setGravity(17);
        q5Var3.setTextColor(-1);
        if (this.f3660d0 != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.25f;
        }
        q5Var3.setAlpha(f10);
        q5Var3.setBackground(new t6(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.l6.r1(0.08f, -1)));
        c8.ka.b(q5Var3, 0.02f, 1.2f);
        this.Q.addView(q5Var3, c8.ha.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        q5Var3.setOnClickListener(new r(8, this, g6Var));
        this.Q.addView(this.f3674w, c8.ha.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.Q.addView(this.f3675x, c8.ha.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.G = linearLayout5;
        linearLayout5.setOrientation(1);
        r5 r5Var = new r5();
        this.F = r5Var;
        linearLayout5.setBackground(r5Var);
        r5Var.a(org.telegram.ui.ActionBar.l6.r1(0.08f, -1), org.telegram.ui.ActionBar.l6.r1(0.08f, -1));
        c8.ka.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, c8.ha.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new n5(this, 4));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.H = j6Var2;
        j6Var2.setTypeface(org.telegram.messenger.g0.o());
        j6Var2.setGravity(17);
        j6Var2.setTextColor(org.telegram.ui.ActionBar.l6.r1(0.75f, -1));
        j6Var2.setText(org.telegram.messenger.id.M0(2131749797, null));
        j6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        linearLayout5.addView(j6Var2, c8.ha.s(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.I = j6Var3;
        j6Var3.getDrawable().r(true, false);
        j6Var3.setGravity(17);
        j6Var3.setTextColor(org.telegram.ui.ActionBar.l6.r1(0.75f, -1));
        j6Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749766, "0%")));
        j6Var3.setTextSize(org.telegram.messenger.g0.L(12.0f));
        linearLayout5.addView(j6Var3, c8.ha.s(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ?? imageView2 = new ImageView(context);
        this.J = imageView2;
        imageView2.setAutoRepeat(true);
        imageView2.f(2131624035, 30, 30, null);
        linearLayout6.addView((View) imageView2, c8.ha.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setGravity(17);
        textView2.setText(org.telegram.messenger.id.M0(2131749774, null));
        linearLayout6.addView(textView2, c8.ha.t(-2, -2, 17, 0, 0, 0, 0));
        this.R.addView(linearLayout6, c8.ha.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.l6.r1(0.5f, -1));
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setGravity(17);
        TextView i14 = org.telegram.ui.Cells.f1.i(this.R, textView3, c8.ha.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.L = i14;
        i14.setTextSize(1, 13.0f);
        i14.setTextColor(-1);
        i14.setTypeface(org.telegram.messenger.g0.o());
        i14.setGravity(17);
        i14.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        i14.setBackground(new t6(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.l6.r1(0.08f, -1)));
        TextView i15 = org.telegram.ui.Cells.f1.i(this.R, i14, c8.ha.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        i15.setTextSize(1, 13.0f);
        i15.setTextColor(org.telegram.ui.ActionBar.l6.r1(0.5f, -1));
        org.telegram.messenger.k5.m(i15, 17, null, 2131749775);
        TextView i16 = org.telegram.ui.Cells.f1.i(this.R, i15, c8.ha.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        i16.setText(org.telegram.messenger.id.M0(2131749788, null));
        i16.setTextColor(-505270);
        i16.setTextSize(1, 20.0f);
        i16.setTypeface(org.telegram.messenger.g0.o());
        i16.setGravity(17);
        TextView i17 = org.telegram.ui.Cells.f1.i(this.S, i16, c8.ha.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.M = i17;
        i17.setTextColor(-17253);
        i17.setTextSize(1, 13.0f);
        i17.setGravity(17);
        this.S.addView(i17, c8.ha.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.N = linearLayout7;
        linearLayout7.setOrientation(0);
        this.S.addView(linearLayout7, c8.ha.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.O = null;
        d(true);
    }

    public final void a(int i7, long j3, TLRPC.Document document, String str) {
        b6[] b6VarArr;
        float f10;
        this.W = i7;
        this.f3655a0 = j3;
        this.f3657b0 = document;
        this.f3659c0 = str;
        this.f3666h0 = false;
        this.f3668j0 = false;
        int i10 = 0;
        while (true) {
            b6VarArr = this.f3671n;
            if (i10 >= b6VarArr.length) {
                break;
            }
            b6 b6Var = b6VarArr[i10];
            if (b6Var != null) {
                org.telegram.messenger.g0.E2(b6Var);
            }
            i10++;
        }
        w5 w5Var = this.h;
        View[] viewArr = w5Var.f4961a;
        v5 v5Var = w5Var.H;
        if (v5Var != null) {
            v5Var.f4874e = true;
            v5Var.f4880l = false;
            v5Var.f4871a.H = null;
            w5Var.H = null;
        }
        ValueAnimator valueAnimator = w5Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            w5Var.G = null;
        }
        w5Var.F = -1;
        w5Var.E = 0.0f;
        w5Var.f4969w.clear();
        w5Var.f4970x.clear();
        w5Var.f4971y.clear();
        for (int i11 = 0; i11 < 6; i11++) {
            w5Var.D[i11] = 0.0f;
        }
        w5Var.removeAllViews();
        for (int i12 = 0; i12 < viewArr.length; i12++) {
            viewArr[i12].setAlpha(1.0f);
            viewArr[i12].setVisibility(0);
            w5Var.addView(viewArr[i12], c8.ha.e(108, 108, 17));
        }
        Matrix.setIdentityM(w5Var.f4963c, 0);
        w5Var.f4964e = 0.0f;
        w5Var.d = 0.0f;
        w5Var.f4965f = true;
        b6 b6Var2 = new b6(getContext());
        b6VarArr[0] = b6Var2;
        addView(b6Var2, c8.ha.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        b6 b6Var3 = new b6(getContext());
        b6VarArr[1] = b6Var3;
        addView(b6Var3, c8.ha.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        b6 b6Var4 = new b6(getContext());
        b6VarArr[2] = b6Var4;
        addView(b6Var4, c8.ha.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        b6 b6Var5 = new b6(getContext());
        b6VarArr[3] = b6Var5;
        addView(b6Var5, c8.ha.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i13 = 0; i13 < b6VarArr.length; i13++) {
            c8.ka.a(b6VarArr[i13]);
            b6VarArr[i13].setClickable(true);
            b6VarArr[i13].setOnClickListener(new n5(this, 5));
        }
        d(false);
        this.f3666h0 = false;
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
        if (this.f3673s) {
            f10 = 0.0f;
        } else if (this.f3660d0 != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.25f;
        }
        this.E.setAlpha(f10);
        z5 z5Var = this.f3663f;
        z5Var.setVisibility(8);
        z5Var.setAlpha(0.0f);
        String M0 = org.telegram.messenger.id.M0(2131749797, null);
        org.telegram.ui.Components.j6 j6Var = this.H;
        j6Var.setText(M0);
        j6Var.setTranslationY(0.0f);
        this.I.setAlpha(1.0f);
        org.telegram.messenger.w9.c(i7).j(j3, new o5(this, j3, j3, 0));
    }

    public final void b(q5 q5Var) {
        if (q5Var.d != null) {
            c(q5Var, org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(Math.round(q5Var.f4573f * 100.0f), "GiftCraftBackdropChance", q5Var.d.name)));
        } else if (q5Var.f4572e != null) {
            c(q5Var, org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(Math.round(q5Var.f4573f * 100.0f), "GiftCraftSymbolChance", q5Var.f4572e.name)));
        }
    }

    public final void c(q5 q5Var, SpannableStringBuilder spannableStringBuilder) {
        float f10;
        float f11;
        fi.m3 m3Var = this.T;
        View view = null;
        if (m3Var != null) {
            m3Var.f(true);
            this.T = null;
        }
        if (!this.f3666h0 && !this.f3668j0) {
            if (q5Var.getParent() instanceof View) {
                view = (View) q5Var.getParent();
            }
            if (view != null) {
                f10 = view.getX();
            } else {
                f10 = 0.0f;
            }
            float x10 = q5Var.getX() + f10;
            if (view != null) {
                f11 = view.getY();
            } else {
                f11 = 0.0f;
            }
            float y10 = q5Var.getY() + f11;
            fi.m3 m3Var2 = new fi.m3(getContext(), 3);
            this.T = m3Var2;
            m3Var2.r(true);
            this.T.u(spannableStringBuilder);
            fi.m3 m3Var3 = this.T;
            m3Var3.h = fi.m3.a(m3Var3.getText(), this.T.getTextPaint());
            fi.m3 m3Var4 = this.T;
            m3Var4.K = Layout.Alignment.ALIGN_CENTER;
            m3Var4.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
            addView(this.T, c8.ha.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            this.T.setTranslationY(y10 - org.telegram.messenger.g0.L(100.0f));
            this.T.p(0.0f, ((q5Var.getWidth() / 2.0f) + x10) - org.telegram.messenger.g0.L(2.0f));
            this.T.w();
        }
    }

    public final void d(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d6.d(boolean):void");
    }

    public TL_stars.StarGift getFirstGift() {
        TL_stars.StarGift starGift;
        int i7 = 0;
        while (true) {
            b6[] b6VarArr = this.f3671n;
            if (i7 >= b6VarArr.length) {
                return null;
            }
            b6 b6Var = b6VarArr[i7];
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
            i7++;
        }
    }

    public int getGiftsSelectedCount() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            b6[] b6VarArr = this.f3671n;
            if (i7 < b6VarArr.length) {
                b6 b6Var = b6VarArr[i7];
                if (b6Var != null) {
                    TL_stars.StarGift starGift = b6Var.h;
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
            b6[] b6VarArr = this.f3671n;
            if (i7 < b6VarArr.length) {
                b6 b6Var = b6VarArr[i7];
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

    public void setOnAddGift(v10 v10Var) {
        this.f3664f0 = v10Var;
    }

    public void setOnClose(Runnable runnable) {
        this.f3665g0 = runnable;
    }

    public void setOnCraft(x10 x10Var) {
        this.f3662e0 = x10Var;
    }
}
