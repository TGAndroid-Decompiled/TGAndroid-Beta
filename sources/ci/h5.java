package ci;

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
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.xq;
public final class h5 extends FrameLayout {
    public final w4[] E;
    public final org.telegram.ui.Components.o5 F;
    public final x4 G;
    public final LinearLayout H;
    public final org.telegram.ui.Components.h6 I;
    public final org.telegram.ui.Components.h6 J;
    public final fh0 K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final LinearLayout O;
    public ai.q2[] P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public final FrameLayout T;
    public gi.l3 U;
    public final int[] V;
    public final int[] W;
    public final org.telegram.ui.ActionBar.e6 f5217a;
    public int f5218a0;
    public final g5 f5219b;
    public long f5220b0;
    public final ImageView f5221c;
    public TLRPC.Document f5222c0;
    public final ai.c0[] d;
    public String f5223d0;
    public final ai.c0 f5224e;
    public ArrayList f5225e0;
    public final d5 f5226f;
    public p10 f5227f0;
    public n10 f5228g0;
    public final b5 h;
    public Runnable f5229h0;
    public boolean f5230i0;
    public boolean f5231j0;
    public boolean f5232k0;
    public Runnable f5233l0;
    public fh0 m0;
    public final f5[] f5234n;
    public SpannableStringBuilder f5235n0;
    public final yh.l f5236r;
    public boolean f5237s;
    public final LinearLayout f5238w;
    public final LinearLayout f5239x;
    public final w4[] f5240y;

    public h5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        float f10;
        int i3;
        float f11;
        int i10;
        int i11 = 6;
        this.V = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.W = new int[]{org.telegram.ui.ActionBar.k6.r1(0.08f, -1), org.telegram.ui.ActionBar.k6.r1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.f5217a = e6Var;
        g5 g5Var = new g5();
        this.f5219b = g5Var;
        Drawable g7 = k2.p1.g(context, 2131231111);
        g7.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        g5Var.f5172g = g7;
        setBackground(g5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        addView(frameLayout, mf.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.f5221c = imageView;
        imageView.setImageResource(2131232502);
        imageView.setBackground(new v5(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.k6.r1(0.08f, -1)));
        frameLayout.addView(imageView, mf.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new u4(this, 0));
        pf.a(imageView);
        ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131232096);
        e10.setBackground(new v5(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.k6.r1(0.08f, -1)));
        frameLayout.addView(e10, mf.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        int i12 = 1;
        e10.setOnClickListener(new u4(this, 1));
        pf.a(e10);
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(bd.M0(2131749766, null));
        addView(textView, mf.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        addView(frameLayout2, mf.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.S = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, mf.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.T = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, mf.e(-1, -1, 119));
        yh.l lVar = new yh.l(context);
        this.f5236r = lVar;
        lVar.setGravity(17);
        lVar.setTextSize(1, 13.0f);
        lVar.setTextColor(-1);
        frameLayout2.addView(lVar, mf.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f5238w = linearLayout;
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
        this.f5239x = linearLayout2;
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
        this.f5240y = new w4[4];
        this.E = new w4[4];
        for (int i13 = 0; i13 < 4; i13++) {
            LinearLayout linearLayout3 = this.f5238w;
            w4[] w4VarArr = this.f5240y;
            w4 w4Var = new w4(context);
            w4VarArr[i13] = w4Var;
            linearLayout3.addView(w4Var, mf.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f5240y[i13].setOnClickListener(new u4(this, 2));
        }
        for (int i14 = 0; i14 < 4; i14++) {
            LinearLayout linearLayout4 = this.f5238w;
            w4[] w4VarArr2 = this.E;
            w4 w4Var2 = new w4(context);
            w4VarArr2[i14] = w4Var2;
            linearLayout4.addView(w4Var2, mf.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.E[i14].setOnClickListener(new u4(this, 3));
        }
        this.f5234n = new f5[4];
        this.d = new ai.c0[6];
        int i15 = 0;
        while (i15 < i11) {
            ai.c0[] c0VarArr = this.d;
            if (i15 == 5) {
                i3 = i12;
            } else {
                i3 = 0;
            }
            ai.c0 c0Var = new ai.c0(i12, context, false);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new v5(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.k6.r1(0.08f, -1)));
            c0Var.addView(frameLayout5, mf.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            k9Var.setImageResource(2131231605);
            if (i3 != 0) {
                f11 = 1.0f;
            } else {
                f11 = 0.45f;
            }
            k9Var.setAlpha(f11);
            if (i3 != 0) {
                i10 = 42;
            } else {
                i10 = 64;
            }
            frameLayout5.addView(k9Var, mf.e(i10, i3 != 0 ? 42 : 64, 17));
            if (i3 != 0) {
                k9Var.setTranslationX(org.telegram.messenger.g0.L(-4.0f));
                c5 c5Var = new c5(context);
                c0Var.f537c = c5Var;
                c5Var.f4916e = org.telegram.messenger.g0.L(37.0f);
                c5Var.f4913a.setStrokeWidth(org.telegram.messenger.g0.N(4.66f));
                frameLayout5.addView(c5Var, mf.e(90, 90, 17));
                org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
                c0Var.f536b = h6Var;
                h6Var.getDrawable().r(false, true);
                h6Var.setTypeface(org.telegram.messenger.g0.o());
                h6Var.setTextColor(-1);
                h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                h6Var.setGravity(17);
                h6Var.setText("0%");
                frameLayout5.addView(h6Var, mf.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            c0VarArr[i15] = c0Var;
            i15++;
            i11 = 6;
            i12 = 1;
        }
        this.f5224e = this.d[5];
        d5 d5Var = new d5(context);
        this.f5226f = d5Var;
        d5Var.setVisibility(8);
        d5Var.setAlpha(0.0f);
        addView(d5Var, mf.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        b5 b5Var = new b5(context, this.d);
        this.h = b5Var;
        addView(b5Var, mf.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(context);
        this.F = o5Var;
        o5Var.setTextSize(1, 12.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        o5Var.setText(org.telegram.messenger.g0.I2(bd.M0(2131749762, null), false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
        o5Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        o5Var.setGravity(17);
        o5Var.setTextColor(-1);
        if (this.f5225e0 != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.25f;
        }
        o5Var.setAlpha(f10);
        o5Var.setBackground(new v5(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.k6.r1(0.08f, -1)));
        pf.b(o5Var, 0.02f, 1.2f);
        this.R.addView(o5Var, mf.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        o5Var.setOnClickListener(new ai.d(13, this, e6Var));
        this.R.addView(this.f5238w, mf.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.R.addView(this.f5239x, mf.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.H = linearLayout5;
        linearLayout5.setOrientation(1);
        x4 x4Var = new x4();
        this.G = x4Var;
        linearLayout5.setBackground(x4Var);
        x4Var.a(org.telegram.ui.ActionBar.k6.r1(0.08f, -1), org.telegram.ui.ActionBar.k6.r1(0.08f, -1));
        pf.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, mf.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new u4(this, 4));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.I = h6Var2;
        h6Var2.setTypeface(org.telegram.messenger.g0.o());
        h6Var2.setGravity(17);
        h6Var2.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.75f, -1));
        h6Var2.setText(bd.M0(2131749805, null));
        h6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        linearLayout5.addView(h6Var2, mf.s(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.J = h6Var3;
        h6Var3.getDrawable().r(true, false);
        h6Var3.setGravity(17);
        h6Var3.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.75f, -1));
        h6Var3.setText(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749774, "0%")));
        h6Var3.setTextSize(org.telegram.messenger.g0.L(12.0f));
        linearLayout5.addView(h6Var3, mf.s(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ?? imageView2 = new ImageView(context);
        this.K = imageView2;
        imageView2.setAutoRepeat(true);
        imageView2.f(2131624035, 30, 30, null);
        linearLayout6.addView((View) imageView2, mf.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setGravity(17);
        textView2.setText(bd.M0(2131749782, null));
        linearLayout6.addView(textView2, mf.t(-2, -2, 17, 0, 0, 0, 0));
        this.S.addView(linearLayout6, mf.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.5f, -1));
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setGravity(17);
        TextView m10 = org.telegram.ui.Cells.f1.m(this.S, textView3, mf.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.M = m10;
        m10.setTextSize(1, 13.0f);
        m10.setTextColor(-1);
        m10.setTypeface(org.telegram.messenger.g0.o());
        m10.setGravity(17);
        m10.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        m10.setBackground(new v5(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.k6.r1(0.08f, -1)));
        TextView m11 = org.telegram.ui.Cells.f1.m(this.S, m10, mf.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        m11.setTextSize(1, 13.0f);
        m11.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.5f, -1));
        org.telegram.messenger.k5.m(m11, 17, null, 2131749783);
        TextView m12 = org.telegram.ui.Cells.f1.m(this.S, m11, mf.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        m12.setText(bd.M0(2131749796, null));
        m12.setTextColor(-505270);
        m12.setTextSize(1, 20.0f);
        m12.setTypeface(org.telegram.messenger.g0.o());
        m12.setGravity(17);
        TextView m13 = org.telegram.ui.Cells.f1.m(this.T, m12, mf.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.N = m13;
        m13.setTextColor(-17253);
        m13.setTextSize(1, 13.0f);
        m13.setGravity(17);
        this.T.addView(m13, mf.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.O = linearLayout7;
        linearLayout7.setOrientation(0);
        this.T.addView(linearLayout7, mf.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.P = null;
        d(true);
    }

    public final void a(int i3, long j10, TLRPC.Document document, String str) {
        f5[] f5VarArr;
        float f10;
        this.f5218a0 = i3;
        this.f5220b0 = j10;
        this.f5222c0 = document;
        this.f5223d0 = str;
        this.f5230i0 = false;
        this.f5232k0 = false;
        int i10 = 0;
        while (true) {
            f5VarArr = this.f5234n;
            if (i10 >= f5VarArr.length) {
                break;
            }
            f5 f5Var = f5VarArr[i10];
            if (f5Var != null) {
                org.telegram.messenger.g0.E2(f5Var);
            }
            i10++;
        }
        b5 b5Var = this.h;
        View[] viewArr = b5Var.f4865a;
        a5 a5Var = b5Var.I;
        if (a5Var != null) {
            a5Var.f4819e = true;
            a5Var.f4825l = false;
            a5Var.f4816a.I = null;
            b5Var.I = null;
        }
        ValueAnimator valueAnimator = b5Var.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            b5Var.H = null;
        }
        b5Var.G = -1;
        b5Var.F = 0.0f;
        b5Var.f4873w.clear();
        b5Var.f4874x.clear();
        b5Var.f4875y.clear();
        for (int i11 = 0; i11 < 6; i11++) {
            b5Var.E[i11] = 0.0f;
        }
        b5Var.removeAllViews();
        for (int i12 = 0; i12 < viewArr.length; i12++) {
            viewArr[i12].setAlpha(1.0f);
            viewArr[i12].setVisibility(0);
            b5Var.addView(viewArr[i12], mf.e(108, 108, 17));
        }
        Matrix.setIdentityM(b5Var.f4867c, 0);
        b5Var.f4868e = 0.0f;
        b5Var.d = 0.0f;
        b5Var.f4869f = true;
        f5 f5Var2 = new f5(getContext());
        f5VarArr[0] = f5Var2;
        addView(f5Var2, mf.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        f5 f5Var3 = new f5(getContext());
        f5VarArr[1] = f5Var3;
        addView(f5Var3, mf.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        f5 f5Var4 = new f5(getContext());
        f5VarArr[2] = f5Var4;
        addView(f5Var4, mf.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        f5 f5Var5 = new f5(getContext());
        f5VarArr[3] = f5Var5;
        addView(f5Var5, mf.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i13 = 0; i13 < f5VarArr.length; i13++) {
            pf.a(f5VarArr[i13]);
            f5VarArr[i13].setClickable(true);
            f5VarArr[i13].setOnClickListener(new u4(this, 5));
        }
        d(false);
        this.f5230i0 = false;
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
        if (this.f5237s) {
            f10 = 0.0f;
        } else if (this.f5225e0 != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.25f;
        }
        this.F.setAlpha(f10);
        d5 d5Var = this.f5226f;
        d5Var.setVisibility(8);
        d5Var.setAlpha(0.0f);
        String M0 = bd.M0(2131749805, null);
        org.telegram.ui.Components.h6 h6Var = this.I;
        h6Var.setText(M0);
        h6Var.setTranslationY(0.0f);
        this.J.setAlpha(1.0f);
        org.telegram.messenger.q9.c(i3).j(j10, new v4(this, j10, j10, 0));
    }

    public final void b(w4 w4Var) {
        if (w4Var.d != null) {
            c(w4Var, org.telegram.messenger.g0.X2(bd.G(Math.round(w4Var.f6246f * 100.0f), "GiftCraftBackdropChance", w4Var.d.name)));
        } else if (w4Var.f6245e != null) {
            c(w4Var, org.telegram.messenger.g0.X2(bd.G(Math.round(w4Var.f6246f * 100.0f), "GiftCraftSymbolChance", w4Var.f6245e.name)));
        }
    }

    public final void c(w4 w4Var, SpannableStringBuilder spannableStringBuilder) {
        float f10;
        float f11;
        gi.l3 l3Var = this.U;
        View view = null;
        if (l3Var != null) {
            l3Var.f(true);
            this.U = null;
        }
        if (!this.f5230i0 && !this.f5232k0) {
            if (w4Var.getParent() instanceof View) {
                view = (View) w4Var.getParent();
            }
            if (view != null) {
                f10 = view.getX();
            } else {
                f10 = 0.0f;
            }
            float x10 = w4Var.getX() + f10;
            if (view != null) {
                f11 = view.getY();
            } else {
                f11 = 0.0f;
            }
            float y9 = w4Var.getY() + f11;
            gi.l3 l3Var2 = new gi.l3(getContext(), 3);
            this.U = l3Var2;
            l3Var2.r(true);
            this.U.u(spannableStringBuilder);
            gi.l3 l3Var3 = this.U;
            l3Var3.h = gi.l3.a(l3Var3.getText(), this.U.getTextPaint());
            gi.l3 l3Var4 = this.U;
            l3Var4.L = Layout.Alignment.ALIGN_CENTER;
            l3Var4.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
            addView(this.U, mf.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            this.U.setTranslationY(y9 - org.telegram.messenger.g0.L(100.0f));
            this.U.p(0.0f, ((w4Var.getWidth() / 2.0f) + x10) - org.telegram.messenger.g0.L(2.0f));
            this.U.w();
        }
    }

    public final void d(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: ci.h5.d(boolean):void");
    }

    public TL_stars.StarGift getFirstGift() {
        TL_stars.StarGift starGift;
        int i3 = 0;
        while (true) {
            f5[] f5VarArr = this.f5234n;
            if (i3 >= f5VarArr.length) {
                return null;
            }
            f5 f5Var = f5VarArr[i3];
            if (f5Var != null) {
                TL_stars.StarGift starGift2 = f5Var.h;
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
            i3++;
        }
    }

    public int getGiftsSelectedCount() {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            f5[] f5VarArr = this.f5234n;
            if (i3 < f5VarArr.length) {
                f5 f5Var = f5VarArr[i3];
                if (f5Var != null) {
                    TL_stars.StarGift starGift = f5Var.h;
                    if (starGift == null) {
                        starGift = null;
                    }
                    if (starGift != null) {
                        i10++;
                    }
                }
                i3++;
            } else {
                return i10;
            }
        }
    }

    public int getGiftsSuccessChance() {
        TL_stars.StarGift starGift;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            f5[] f5VarArr = this.f5234n;
            if (i3 < f5VarArr.length) {
                f5 f5Var = f5VarArr[i3];
                if (f5Var != null) {
                    TL_stars.StarGift starGift2 = f5Var.h;
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
                i3++;
            } else {
                return i10;
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    public void setOnAddGift(n10 n10Var) {
        this.f5228g0 = n10Var;
    }

    public void setOnClose(Runnable runnable) {
        this.f5229h0 = runnable;
    }

    public void setOnCraft(p10 p10Var) {
        this.f5227f0 = p10Var;
    }
}
