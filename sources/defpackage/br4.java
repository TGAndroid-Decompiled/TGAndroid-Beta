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
public abstract class br4 {
    public static void a(Activity activity, int i, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, vnb vnbVar) {
        int i2;
        int i3;
        String str2;
        String y;
        String e;
        String str3;
        String str4;
        lg lgVar;
        int i4;
        String y2;
        nx0 nx0Var = new nx0(1, vnbVar, (Context) activity, false);
        nx0Var.L(aob.h5);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = hl.L(80.0f);
        int i5 = aob.Fi;
        ShapeDrawable K = aob.K(L, aob.v0(i5, vnbVar));
        uob M = yob.M(i5);
        frameLayout.setBackground(K);
        yob.j(frameLayout, K, M, null, vnbVar);
        linearLayout.addView(frameLayout, tre.t(80, 80, 1, 0, 16, 0, 16));
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
            imageView.setTranslationY(hl.L(2.0f));
        }
        frameLayout.addView((View) imageView, tre.r(-1, -1, 17));
        if (tLObject instanceof TLRPC.User) {
            str2 = lbc.r((TLRPC.User) tLObject);
        } else if (!(tLObject instanceof TLRPC.Chat)) {
            str2 = "";
        } else {
            str2 = ((TLRPC.Chat) tLObject).title;
        }
        String e2 = di0.h().e(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        String str5 = str2;
        String e3 = di0.h().e(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i == 0) {
            String a0 = ob6.a0(null, null, 2131750473, c00.i("@", str));
            String Q = ob6.Q(tL_collectibleInfo.purchase_date);
            if (TextUtils.isEmpty(e2)) {
                y2 = "";
            } else {
                y2 = qd4.y("(", e2, ")");
            }
            str3 = ob6.a0(null, null, 2131750475, Q, e3, y2);
            e = qu6.o(uc7.s1(yac.t0).N2, "/", str, new StringBuilder());
            str4 = a0;
        } else if (i == 1) {
            f78 f = f78.f();
            String a02 = ob6.a0(null, null, 2131750477, f.e("+" + str));
            String Q2 = ob6.Q((long) tL_collectibleInfo.purchase_date);
            if (TextUtils.isEmpty(e2)) {
                y = "";
            } else {
                y = qd4.y("(", e2, ")");
            }
            String a03 = ob6.a0(null, null, 2131750478, Q2, e3, y);
            f78 f2 = f78.f();
            e = f2.e("+" + str);
            str3 = a03;
            str4 = a02;
        } else {
            return;
        }
        if (e != null) {
            lgVar = new lg(e, i, nx0Var, vnbVar);
        } else {
            lgVar = null;
        }
        SpannableStringBuilder N2 = hl.N2(str4, -1, 0, lgVar, null);
        SpannableString spannableString = new SpannableString("TON");
        wm2 wm2Var = new wm2(2131231959, 0);
        wm2Var.d = false;
        wm2Var.F = hl.L(13.0f);
        spannableString.setSpan(wm2Var, 0, spannableString.length(), 33);
        SpannableStringBuilder G2 = hl.G2(hl.S2(str3), spannableString, "TON");
        p66 p66Var = new p66(activity, null);
        p66Var.setTypeface(hl.o());
        p66Var.setGravity(17);
        int i6 = aob.j5;
        yob.X(p66Var, i6, vnbVar);
        yob.G(p66Var, aob.o6, vnbVar);
        p66Var.setTextSize(1, 16.0f);
        p66Var.setText(N2);
        linearLayout.addView(p66Var, tre.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L2 = hl.L(28.0f);
        int L3 = hl.L(28.0f);
        int i7 = aob.Ti;
        ShapeDrawable c0 = aob.c0(L2, L3, aob.v0(i7, vnbVar));
        uob M2 = yob.M(i7);
        frameLayout2.setBackground(c0);
        yob.j(frameLayout2, c0, M2, null, vnbVar);
        de0 de0Var = new de0(activity);
        de0Var.setRoundRadius(hl.L(28.0f));
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.k(tLObject);
        de0Var.f(tLObject, rb0Var);
        frameLayout2.addView(de0Var, tre.e(28, 28, 51));
        TextView textView = new TextView(activity);
        yob.X(textView, i6, vnbVar);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setText(pv3.m(str5, textView.getPaint().getFontMetricsInt(), false, null, 0));
        frameLayout2.addView(textView, tre.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout2, tre.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        yob.X(textView2, i6, vnbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(G2);
        linearLayout.addView(textView2, tre.t(-1, -2, 1, 32, 0, 32, 19));
        c51 c51Var = new c51(vnbVar, activity, true);
        c51Var.setRoundRadius(24);
        c51Var.i(ob6.M0(2131750474, null), false, true);
        c51Var.setOnClickListener(new je3(activity, tL_collectibleInfo, (byte) 15));
        linearLayout.addView(c51Var, tre.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (lgVar != null) {
            c51 c51Var2 = new c51(vnbVar, activity, true);
            c51Var2.setRoundRadius(24);
            c51Var2.e();
            if (i == 0) {
                i4 = 2131750476;
            } else {
                i4 = 2131750479;
            }
            c51Var2.i(ob6.M0(i4, null), false, true);
            c51Var2.setOnClickListener(new je3(lgVar, nx0Var, (byte) 16));
            linearLayout.addView(c51Var2, tre.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
        }
        nx0Var.O = linearLayout;
        nx0Var.show();
    }
}
