package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public abstract class yq4 {
    public static void a(Activity activity, int i, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, ylb ylbVar) {
        int i2;
        int i3;
        String str2;
        String o;
        String e;
        String str3;
        String str4;
        rh rhVar;
        int i4;
        String o2;
        my0 my0Var = new my0(1, ylbVar, (Context) activity, false);
        my0Var.L(cmb.g5);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = gm.L(80.0f);
        int i5 = cmb.Ei;
        ShapeDrawable K = cmb.K(L, cmb.v0(i5, ylbVar));
        wmb M = anb.M(i5);
        frameLayout.setBackground(K);
        anb.j(frameLayout, K, M, null, ylbVar);
        linearLayout.addView(frameLayout, qoe.t(80, 80, 1, 0, 16, 0, 16));
        ?? imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (i == 0) {
            i2 = 70;
            i3 = 2131624031;
        } else {
            i2 = 78;
            i3 = 2131624030;
        }
        imageView.f(i3, i2, i2, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i == 0) {
            imageView.setScaleX(0.86f);
            imageView.setScaleY(0.86f);
        } else {
            imageView.setTranslationY(gm.L(2.0f));
        }
        frameLayout.addView((View) imageView, qoe.r(-1, -1, 17));
        if (tLObject instanceof TLRPC.User) {
            str2 = m9c.r((TLRPC.User) tLObject);
        } else if (!(tLObject instanceof TLRPC.Chat)) {
            str2 = "";
        } else {
            str2 = ((TLRPC.Chat) tLObject).title;
        }
        String e2 = cj0.h().e(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        String str5 = str2;
        String e3 = cj0.h().e(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i == 0) {
            String a0 = jb6.a0(null, null, 2131750445, b10.h("@", str));
            String Q = jb6.Q(tL_collectibleInfo.purchase_date);
            if (TextUtils.isEmpty(e2)) {
                o2 = "";
            } else {
                o2 = kt6.o("(", e2, ")");
            }
            str3 = jb6.a0(null, null, 2131750447, Q, e3, o2);
            e = kt6.p(oc7.r1(z8c.t0).N2, "/", str, new StringBuilder());
            str4 = a0;
        } else if (i == 1) {
            r58 f = r58.f();
            String a02 = jb6.a0(null, null, 2131750449, f.e("+" + str));
            String Q2 = jb6.Q((long) tL_collectibleInfo.purchase_date);
            if (TextUtils.isEmpty(e2)) {
                o = "";
            } else {
                o = kt6.o("(", e2, ")");
            }
            String a03 = jb6.a0(null, null, 2131750450, Q2, e3, o);
            r58 f2 = r58.f();
            e = f2.e("+" + str);
            str3 = a03;
            str4 = a02;
        } else {
            return;
        }
        if (e != null) {
            rhVar = new rh(e, i, my0Var, ylbVar);
        } else {
            rhVar = null;
        }
        SpannableStringBuilder N2 = gm.N2(str4, -1, 0, rhVar, null);
        SpannableString spannableString = new SpannableString("TON");
        pn2 pn2Var = new pn2(2131231960, 0);
        pn2Var.d = false;
        pn2Var.F = gm.L(13.0f);
        spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
        SpannableStringBuilder G2 = gm.G2(gm.S2(str3), spannableString, "TON");
        l66 l66Var = new l66(activity, null);
        l66Var.setTypeface(gm.o());
        l66Var.setGravity(17);
        int i6 = cmb.i5;
        anb.X(l66Var, i6, ylbVar);
        anb.G(l66Var, cmb.n6, ylbVar);
        l66Var.setTextSize(1, 16.0f);
        l66Var.setText(N2);
        linearLayout.addView(l66Var, qoe.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L2 = gm.L(28.0f);
        int L3 = gm.L(28.0f);
        int i7 = cmb.Si;
        ShapeDrawable c0 = cmb.c0(L2, L3, cmb.v0(i7, ylbVar));
        wmb M2 = anb.M(i7);
        frameLayout2.setBackground(c0);
        anb.j(frameLayout2, c0, M2, null, ylbVar);
        bf0 bf0Var = new bf0(activity);
        bf0Var.setRoundRadius(gm.L(28.0f));
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.k(tLObject);
        bf0Var.f(tLObject, pc0Var);
        frameLayout2.addView(bf0Var, qoe.e(28, 28, 51));
        TextView textView = new TextView(activity);
        anb.X(textView, i6, ylbVar);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setText(gw3.m(str5, textView.getPaint().getFontMetricsInt(), false, null, 0));
        frameLayout2.addView(textView, qoe.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout2, qoe.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        anb.X(textView2, i6, ylbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(G2);
        linearLayout.addView(textView2, qoe.t(-1, -2, 1, 32, 0, 32, 19));
        b61 b61Var = new b61(ylbVar, activity, true);
        b61Var.setRoundRadius(24);
        b61Var.i(jb6.M0(2131750446, null), false, true);
        b61Var.setOnClickListener(new tf3(activity, tL_collectibleInfo, (byte) 13));
        linearLayout.addView(b61Var, qoe.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (rhVar != null) {
            b61 b61Var2 = new b61(ylbVar, activity, true);
            b61Var2.setRoundRadius(24);
            b61Var2.e();
            if (i == 0) {
                i4 = 2131750448;
            } else {
                i4 = 2131750451;
            }
            b61Var2.i(jb6.M0(i4, null), false, true);
            b61Var2.setOnClickListener(new tf3(rhVar, my0Var, (byte) 14));
            linearLayout.addView(b61Var2, qoe.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
        }
        my0Var.O = linearLayout;
        my0Var.show();
    }
}
