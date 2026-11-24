package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class v35 implements jac {
    public final byte a = 2;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public v35(he heVar, jac jacVar, uk0 uk0Var, Context context, int i) {
        this.d = heVar;
        this.e = jacVar;
        this.f = uk0Var;
        this.c = context;
        this.b = i;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        t56 t56Var;
        w45 w45Var;
        boolean z;
        int i;
        ViewGroup viewGroup;
        final int i2;
        CharSequence V;
        int i3;
        int i4;
        String str;
        int i5;
        String M0;
        int i6;
        int i7;
        int i8;
        TL_wallet.tonConnectSession tonconnectsession;
        d S;
        byte b = this.a;
        int i9 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        int i10 = 0;
        switch (b) {
            case 0:
                Context context = (Context) obj6;
                c cVar = (c) obj5;
                ylb ylbVar = (ylb) obj4;
                final t56 t56Var2 = (t56) obj3;
                final s45 s45Var = (s45) obj;
                String str2 = (String) obj2;
                if (s45Var != null) {
                    int i11 = s45Var.c;
                    TL_wallet.tonConnectSession tonconnectsession2 = s45Var.a;
                    String str3 = s45Var.e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.G1 || gda.w || gda.B || z8c.t0 != i9) {
                            cVar.g.u(s45Var);
                            return;
                        }
                    }
                    if ("signData".equals(str3)) {
                        final w45 w45Var2 = c.C(i9).g;
                        try {
                            JSONObject jSONObject = new JSONObject(s45Var.k);
                            boolean equals = "text".equals(jSONObject.optString("type"));
                            mk7 mk7Var = new mk7(context, ylbVar, new View[0]);
                            mk7Var.E0(cmb.v0(cmb.Z6, ylbVar));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            LinearLayout linearLayout2 = new LinearLayout(context);
                            linearLayout2.setGravity(16);
                            ImageView k = td4.k(context, 2131231245);
                            k.setScaleType(ImageView.ScaleType.CENTER);
                            anb.s(k, cmb.F6, ylbVar, PorterDuff.Mode.SRC_IN);
                            int i12 = cmb.h6;
                            fg0 f0 = cmb.f0(cmb.v0(i12, ylbVar), 1, -1);
                            wmb M = anb.M(i12);
                            k.setBackground(f0);
                            anb.j(k, f0, null, M, ylbVar);
                            k.setContentDescription(jb6.M0(2131751978, null));
                            k.setOnClickListener(new tf3(s45Var, mk7Var, (byte) 19));
                            linearLayout2.addView(k, qoe.q(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            bf0 bf0Var = new bf0(context);
                            bf0Var.setRoundRadius(gm.L(22.0f));
                            TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                            if (webDocument != null) {
                                bf0Var.p(gn5.p(vuc.c(webDocument)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout2.addView(bf0Var, qoe.q(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout3 = new LinearLayout(context);
                            linearLayout3.setOrientation(1);
                            TextView v = w45.v(context, jb6.M0(2131742674, null), 18, ylbVar);
                            v.setTypeface(gm.o());
                            v.setGravity(3);
                            linearLayout3.addView(v, qoe.o(-1, -2));
                            TextView v2 = w45.v(context, gm.J0(tonconnectsession2.manifest.url, false), 14, ylbVar);
                            int i13 = cmb.y6;
                            anb.X(v2, i13, ylbVar);
                            v2.setGravity(3);
                            v2.setSingleLine(true);
                            v2.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout3.addView(v2, qoe.o(-1, -2));
                            linearLayout2.addView(linearLayout3, qoe.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout.addView(linearLayout2, qoe.o(-1, 56));
                            LinearLayout linearLayout4 = new LinearLayout(context);
                            linearLayout4.setOrientation(1);
                            linearLayout4.setPadding(gm.L(20.0f), gm.L(16.0f), gm.L(20.0f), gm.L(16.0f));
                            int L = gm.L(16.0f);
                            int i14 = cmb.c6;
                            ShapeDrawable b0 = cmb.b0(L, cmb.v0(i14, ylbVar));
                            wmb M2 = anb.M(i14);
                            linearLayout4.setBackground(b0);
                            anb.j(linearLayout4, b0, M2, null, ylbVar);
                            if (equals) {
                                M0 = jSONObject.optString("text");
                                i6 = 14;
                            } else {
                                M0 = jb6.M0(2131742866, null);
                                i6 = 16;
                            }
                            TextView v3 = w45.v(context, M0, i6, ylbVar);
                            v3.setGravity(3);
                            v3.setTextIsSelectable(equals);
                            if (equals) {
                                TextView v4 = w45.v(context, jb6.M0(2131742673, null), 14, ylbVar);
                                v4.setGravity(3);
                                v4.setTypeface(gm.o());
                                anb.X(v4, cmb.K6, ylbVar);
                                linearLayout4.addView(v4, qoe.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                v3.setTypeface(Typeface.MONOSPACE);
                                i7 = -2;
                                i8 = -1;
                            } else {
                                LinearLayout linearLayout5 = new LinearLayout(context);
                                linearLayout5.setGravity(16);
                                TextView v5 = w45.v(context, "!", 12, ylbVar);
                                v5.setTypeface(gm.o());
                                v5.setTextColor(-1);
                                int L2 = gm.L(8.0f);
                                int i15 = cmb.p7;
                                ShapeDrawable b02 = cmb.b0(L2, cmb.v0(i15, ylbVar));
                                wmb M3 = anb.M(i15);
                                v5.setBackground(b02);
                                anb.j(v5, b02, M3, null, ylbVar);
                                linearLayout5.addView(v5, qoe.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView v6 = w45.v(context, jb6.M0(2131742867, null), 14, ylbVar);
                                v6.setGravity(3);
                                v6.setTypeface(gm.o());
                                i7 = -2;
                                i8 = -1;
                                linearLayout5.addView(v6, qoe.o(-1, -2));
                                linearLayout4.addView(linearLayout5, qoe.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout4.addView(v3, qoe.o(i8, i7));
                            if (equals) {
                                v3.setOnClickListener(new jw4(jSONObject, mk7Var, ylbVar, (byte) 2));
                            }
                            lj3 lj3Var = new lj3(context, (byte) 1);
                            lj3Var.addView(linearLayout4);
                            linearLayout.addView(lj3Var, qoe.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            lk7 lk7Var = new lk7(context);
                            lk7Var.getContent().addView(linearLayout, qoe.c(-2.0f, -1));
                            mk7Var.D0(lk7Var);
                            LinearLayout i16 = hg9.i(context, 1);
                            if (equals) {
                                TextView v7 = w45.v(context, jb6.M0(2131742692, null), 14, ylbVar);
                                v7.setGravity(3);
                                anb.X(v7, i13, ylbVar);
                                i16.addView(v7, qoe.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout6 = new LinearLayout(context);
                            linearLayout6.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
                            b61 b61Var = new b61(ylbVar, context, true);
                            b61Var.setRoundRadius(24);
                            b61Var.e();
                            b61Var.setText(jb6.M0(2131752542, null));
                            b61 i17 = mlb.i(24, ylbVar, context, true);
                            i17.setText(jb6.M0(2131742675, null));
                            i17.setEnabled(false);
                            linearLayout6.addView(b61Var, qoe.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout6.addView(i17, qoe.m(1.0f, 0, 44, 6, 0, 0));
                            i16.addView(linearLayout6);
                            mk7Var.F0(i16);
                            mk7Var.z0 = new tu(s45Var, (byte) 1);
                            if4 if4Var = new if4(lj3Var, s45Var, i17, (byte) 13);
                            lj3Var.getViewTreeObserver().addOnScrollChangedListener(new be(if4Var, (byte) 1));
                            lj3Var.getViewTreeObserver().addOnGlobalLayoutListener(new c45(if4Var, (byte) 0));
                            final d45 d45Var = new d45(i17, b61Var, w45Var2, s45Var, mk7Var, ylbVar, if4Var);
                            i17.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    byte b2 = r2;
                                    d45 d45Var2 = d45Var;
                                    switch (b2) {
                                        case 0:
                                            d45Var2.a(Boolean.FALSE);
                                            return;
                                        default:
                                            d45Var2.a(Boolean.TRUE);
                                            return;
                                    }
                                }
                            });
                            b61Var.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    byte b2 = r2;
                                    d45 d45Var2 = d45Var;
                                    switch (b2) {
                                        case 0:
                                            d45Var2.a(Boolean.FALSE);
                                            return;
                                        default:
                                            d45Var2.a(Boolean.TRUE);
                                            return;
                                    }
                                }
                            });
                            final boolean[] zArr = {false};
                            final q45 q45Var = new q45(zArr, s45Var, mk7Var, (byte) 0);
                            s45Var.r = new qn4(mk7Var, (byte) 17);
                            mk7Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b2 = r6;
                                    t56 t56Var3 = t56Var2;
                                    s45 s45Var2 = s45Var;
                                    w45 w45Var3 = w45Var2;
                                    Runnable runnable = q45Var;
                                    boolean[] zArr2 = zArr;
                                    q45 q45Var2 = (q45) runnable;
                                    switch (b2) {
                                        case 0:
                                            zArr2[0] = true;
                                            gm.r(q45Var2);
                                            w45Var3.u(s45Var2);
                                            if (t56Var3 != null) {
                                                t56Var3.run();
                                                return;
                                            }
                                            return;
                                        default:
                                            zArr2[0] = true;
                                            gm.r(q45Var2);
                                            w45Var3.u(s45Var2);
                                            if (t56Var3 != null) {
                                                t56Var3.run();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            mk7Var.show();
                            gm.d3(q45Var, Math.max(0L, i11 - w45Var2.f.getCurrentTime()) * 1000);
                            return;
                        } catch (JSONException e) {
                            w45Var2.u(s45Var);
                            c41.c0(w45.h("display signing data", e));
                            return;
                        }
                    }
                    c C = c.C(i9);
                    w45 w45Var3 = C.g;
                    v45 v45Var = s45Var.f;
                    boolean equals2 = "signMessage".equals(str3);
                    final mk7 mk7Var2 = new mk7(context, ylbVar, new View[0]);
                    mk7Var2.E0(cmb.v0(cmb.Z6, ylbVar));
                    LinearLayout linearLayout7 = new LinearLayout(context);
                    linearLayout7.setOrientation(1);
                    bf0 bf0Var2 = new bf0(context);
                    bf0Var2.setRoundRadius(gm.L(38.0f));
                    TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                    if (webDocument2 != null) {
                        t56Var = t56Var2;
                        w45Var = w45Var3;
                        z = equals2;
                        bf0Var2.p(gn5.p(vuc.c(webDocument2)), "76_76", null, tonconnectsession2.manifest);
                    } else {
                        t56Var = t56Var2;
                        w45Var = w45Var3;
                        z = equals2;
                    }
                    linearLayout7.addView(bf0Var2, qoe.t(76, 76, 1, 0, 24, 0, 0));
                    if (z) {
                        i = 2131742879;
                    } else {
                        i = 2131742878;
                    }
                    TextView v8 = w45.v(context, jb6.V(null, null, i, tonconnectsession2.manifest.name), 20, ylbVar);
                    v8.setTypeface(gm.o());
                    linearLayout7.addView(v8, qoe.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                    String J0 = gm.J0(tonconnectsession2.manifest.url, false);
                    if (!TextUtils.isEmpty(J0)) {
                        linearLayout7.addView(w45.g(context, J0, ylbVar), qoe.t(-2, -2, 1, 36, 6, 36, 12));
                    }
                    soc socVar = new soc(context, 2131232828, 24);
                    socVar.getCardHolderView().setMaxLines(2);
                    socVar.getCardHolderView().setSingleLine(false);
                    List<u45> list = v45Var.b;
                    long j = v45Var.c;
                    socVar.setCardHolder(pqc.a0(((u45) list.get(0)).a));
                    socVar.getBalanceView().setText(w45.j(j));
                    socVar.getUsdBalanceView().setText(C.q(j, false));
                    linearLayout7.addView(socVar, qoe.o(-1, -2));
                    socVar.setCardOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            View[] viewPages;
                            View[] viewPages2;
                            byte b2 = r2;
                            mk7 mk7Var3 = mk7Var2;
                            switch (b2) {
                                case 0:
                                    hs1 hs1Var = mk7Var3.l1;
                                    if (1 < mk7Var3.m1.size() && 1 != hs1Var.getCurrentPosition()) {
                                        for (View view2 : hs1Var.getViewPages()) {
                                            if (view2 != null) {
                                                gm.t1(view2);
                                            }
                                        }
                                        hs1Var.E(1);
                                        return;
                                    }
                                    return;
                                default:
                                    hs1 hs1Var2 = mk7Var3.l1;
                                    if (mk7Var3.m1.size() > 0 && hs1Var2.getCurrentPosition() != 0) {
                                        for (View view3 : hs1Var2.getViewPages()) {
                                            if (view3 != null) {
                                                gm.t1(view3);
                                            }
                                        }
                                        hs1Var2.E(0);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    lk7 lk7Var2 = new lk7(context);
                    lk7Var2.getContent().addView(linearLayout7, qoe.c(-2.0f, -1));
                    mk7Var2.D0(lk7Var2);
                    ViewGroup i18 = hg9.i(context, 1);
                    LinearLayout i19 = hg9.i(context, 0);
                    i18.addView(i19, qoe.o(-1, 56));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(2131231244);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    int i20 = cmb.h6;
                    fg0 f02 = cmb.f0(cmb.v0(i20, ylbVar), 1, -1);
                    wmb M4 = anb.M(i20);
                    imageView.setBackground(f02);
                    anb.j(imageView, f02, null, M4, ylbVar);
                    int i21 = cmb.F6;
                    anb.s(imageView, i21, ylbVar, PorterDuff.Mode.SRC_IN);
                    rve.a(imageView);
                    i19.addView(imageView, qoe.q(48, 48, 0.0f, 19, 4, 0, 0, 0));
                    bf0 bf0Var3 = new bf0(context);
                    bf0Var3.setRoundRadius(gm.L(22.0f));
                    TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                    if (webDocument3 != null) {
                        viewGroup = i18;
                        bf0Var3.p(gn5.p(vuc.c(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                    } else {
                        viewGroup = i18;
                    }
                    i19.addView(bf0Var3, qoe.t(44, 44, 19, 12, 0, 11, 0));
                    LinearLayout linearLayout8 = new LinearLayout(context);
                    linearLayout8.setOrientation(1);
                    i19.addView(linearLayout8, qoe.q(0, 44, 1.0f, 23, 0, 0, 12, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(gm.o());
                    anb.X(textView, i21, ylbVar);
                    textView.setTextSize(1, 18.0f);
                    linearLayout8.addView(textView, qoe.o(-1, -2));
                    textView.setText(jb6.M0(2131742850, null));
                    if (!TextUtils.isEmpty(J0)) {
                        TextView textView2 = new TextView(context);
                        anb.X(textView2, cmb.y6, ylbVar);
                        i2 = 1;
                        textView2.setTextSize(1, 14.0f);
                        linearLayout8.addView(textView2, qoe.o(-1, -2));
                        textView2.setText(J0);
                    } else {
                        i2 = 1;
                    }
                    imageView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            View[] viewPages;
                            View[] viewPages2;
                            byte b2 = i2;
                            mk7 mk7Var3 = mk7Var2;
                            switch (b2) {
                                case 0:
                                    hs1 hs1Var = mk7Var3.l1;
                                    if (1 < mk7Var3.m1.size() && 1 != hs1Var.getCurrentPosition()) {
                                        for (View view2 : hs1Var.getViewPages()) {
                                            if (view2 != null) {
                                                gm.t1(view2);
                                            }
                                        }
                                        hs1Var.E(1);
                                        return;
                                    }
                                    return;
                                default:
                                    hs1 hs1Var2 = mk7Var3.l1;
                                    if (mk7Var3.m1.size() > 0 && hs1Var2.getCurrentPosition() != 0) {
                                        for (View view3 : hs1Var2.getViewPages()) {
                                            if (view3 != null) {
                                                gm.t1(view3);
                                            }
                                        }
                                        hs1Var2.E(0);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout9 = new LinearLayout(context);
                    linearLayout9.setOrientation(i2);
                    LinearLayout F = w45.F(context, jb6.M0(2131742714, null), ylbVar);
                    String C2 = w45.C(((u45) list.get(0)).a);
                    SpannableStringBuilder w = c.w(j, i2);
                    if (list.size() > i2) {
                        Integer valueOf = Integer.valueOf(list.size() - i2);
                        Object[] objArr = new Object[2];
                        objArr[0] = C2;
                        objArr[i2] = valueOf;
                        V = jb6.V(null, null, 2131742638, objArr);
                    } else {
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = C2;
                        V = jb6.V(null, null, 2131742639, objArr2);
                    }
                    F.addView(w45.b(context, w, V, null, null, ylbVar), qoe.o(-1, -2));
                    linearLayout9.addView(F, qoe.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                    LinearLayout F2 = w45.F(context, jb6.M0(2131742890, null), ylbVar);
                    for (u45 u45Var : list) {
                        if (u45Var.b != null && u45Var.d == null) {
                            i5 = 2131742836;
                            str = null;
                        } else {
                            str = null;
                            i5 = 2131742644;
                        }
                        F2.addView(w45.b(context, jb6.M0(i5, str), jb6.V(str, str, 2131742639, w45.C(u45Var.a)), w45.a(-u45Var.e), u45Var.d, ylbVar), qoe.o(-1, -2));
                    }
                    linearLayout9.addView(F2, qoe.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                    lj3 lj3Var2 = new lj3(context, (byte) 2);
                    lj3Var2.setFillViewport(false);
                    lj3Var2.addView(linearLayout9);
                    ViewGroup viewGroup2 = viewGroup;
                    viewGroup2.addView(lj3Var2, qoe.o(-1, -2));
                    lk7 lk7Var3 = new lk7(context);
                    lk7Var3.getContent().addView(viewGroup2, qoe.c(-2.0f, -1));
                    mk7Var2.D0(lk7Var3);
                    LinearLayout i22 = hg9.i(context, 1);
                    TextView v9 = w45.v(context, null, 14, ylbVar);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                    spannableStringBuilder.setSpan(new ta6(gm.L(80.0f), v9), 0, spannableStringBuilder.length(), 33);
                    v9.setText(jb6.V(null, null, 2131742802, spannableStringBuilder));
                    if (z) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    v9.setVisibility(i3);
                    anb.X(v9, cmb.y6, ylbVar);
                    i22.addView(v9, qoe.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                    LinearLayout linearLayout10 = new LinearLayout(context);
                    linearLayout10.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(16.0f));
                    b61 b61Var2 = new b61(ylbVar, context, true);
                    b61Var2.setRoundRadius(24);
                    b61Var2.e();
                    b61Var2.setText(jb6.M0(2131742826, null));
                    linearLayout10.addView(b61Var2, qoe.m(1.0f, 0, 44, 0, 6, 0));
                    b61 i23 = mlb.i(24, ylbVar, context, true);
                    if (z) {
                        i4 = 2131742675;
                    } else {
                        i4 = 2131742851;
                    }
                    i23.setText(jb6.M0(i4, null));
                    i23.setEnabled(false);
                    linearLayout10.addView(i23, qoe.m(1.0f, 0, 44, 6, 0, 0));
                    i22.addView(linearLayout10);
                    mk7Var2.F0(i22);
                    final boolean[] zArr2 = {false};
                    boolean[] zArr3 = {false};
                    final w45 w45Var4 = w45Var;
                    final z35 z35Var = new z35(s45Var, zArr3, i23, b61Var2, w45Var4, mk7Var2, zArr2, ylbVar);
                    i23.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            byte b2 = r2;
                            z35 z35Var2 = z35Var;
                            switch (b2) {
                                case 0:
                                    z35Var2.a(Boolean.FALSE);
                                    return;
                                default:
                                    z35Var2.a(Boolean.TRUE);
                                    return;
                            }
                        }
                    });
                    b61Var2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            byte b2 = r2;
                            z35 z35Var2 = z35Var;
                            switch (b2) {
                                case 0:
                                    z35Var2.a(Boolean.FALSE);
                                    return;
                                default:
                                    z35Var2.a(Boolean.TRUE);
                                    return;
                            }
                        }
                    });
                    final q45 q45Var2 = new q45(zArr2, s45Var, mk7Var2, (byte) 1);
                    long j2 = i11;
                    long j3 = v45Var.a;
                    if (j3 == 0) {
                        j3 = Long.MAX_VALUE;
                    }
                    s45Var.r = new qn4(mk7Var2, (byte) 17);
                    final t56 t56Var3 = t56Var;
                    mk7Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            byte b2 = r6;
                            t56 t56Var32 = t56Var3;
                            s45 s45Var2 = s45Var;
                            w45 w45Var32 = w45Var4;
                            Runnable runnable = q45Var2;
                            boolean[] zArr22 = zArr2;
                            q45 q45Var22 = (q45) runnable;
                            switch (b2) {
                                case 0:
                                    zArr22[0] = true;
                                    gm.r(q45Var22);
                                    w45Var32.u(s45Var2);
                                    if (t56Var32 != null) {
                                        t56Var32.run();
                                        return;
                                    }
                                    return;
                                default:
                                    zArr22[0] = true;
                                    gm.r(q45Var22);
                                    w45Var32.u(s45Var2);
                                    if (t56Var32 != null) {
                                        t56Var32.run();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    mk7Var2.show();
                    gm.d3(q45Var2, Math.max(0L, Math.min(j2, j3) - ConnectionsManager.getInstance(i9).getCurrentTime()) * 1000);
                    d82 d82Var = new d82(zArr2, s45Var, zArr3, i23, z, C, v9, mk7Var2, ylbVar);
                    WalletEngine2 walletEngine2 = w45Var4.b.b;
                    if (!s45Var.n && !w45Var4.i(s45Var) && w45Var4.A(s45Var) && walletEngine2 != null) {
                        if ("signMessage".equals(str3)) {
                            walletEngine2.previewSignMessage(v45Var, new iu(w45Var4, s45Var, d82Var, (byte) 20));
                            return;
                        } else {
                            walletEngine2.previewTonConnect(v45Var, new p(w45Var4, s45Var, d82Var, (byte) 21));
                            return;
                        }
                    }
                    d82Var.a(null, "Request expired, was processed, or the wallet changed");
                    return;
                } else if (str2 != null) {
                    c41.c0(str2);
                    return;
                } else {
                    return;
                }
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                k11 k11Var = (k11) obj5;
                oc7 oc7Var = (oc7) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str4 = LaunchActivity.C1;
                if (k11Var != null) {
                    k11Var.b();
                }
                if (user2 != null) {
                    oc7Var.c4(user2, false, false);
                    oc7Var.b3(user2, 0, true, null);
                }
                launchActivity.m0(i9, user.id, tL_error);
                return;
            case 2:
                a66 a66Var = (a66) obj6;
                String str5 = (String) obj5;
                String str6 = (String) obj4;
                String str7 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = a66Var.a;
                a66Var.h = -1;
                if (!a66Var.j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
                    if (tL_error2 != null) {
                        a66Var.c();
                        if (a66Var.a()) {
                            a66.d().g0(tL_error2, false);
                            return;
                        }
                        return;
                    }
                    if (tonconnectpending != null && (tonconnectsession = tonconnectpending.session) != null && !tonconnectsession.closed && !tonconnectsession.closing && !tonconnectsession.pending && str5.equals(tonconnectsession.dapp_client_id)) {
                        ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                        int size = arrayList.size();
                        while (true) {
                            if (i10 < size) {
                                TL_wallet.tonConnectRequest tonconnectrequest = arrayList.get(i10);
                                i10++;
                                TL_wallet.tonConnectRequest tonconnectrequest2 = tonconnectrequest;
                                if (str6.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.id && tonconnectrequest2.expires > ConnectionsManager.getInstance(a66Var.b).getCurrentTime()) {
                                    if (a66Var.a() && (S = LaunchActivity.S()) != null && S.getContext() != null) {
                                        a66Var.c();
                                        w45.q(a66Var.a, a66Var.b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, S.getResourceProvider(), new t56(a66Var, str7, (byte) 3));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    int i24 = this.b;
                    if (i24 < 10) {
                        i77 i77Var = new i77(a66Var, str5, str6, str7, i24, (byte) 19);
                        a66Var.i = i77Var;
                        gm.d3(i77Var, 500L);
                        return;
                    }
                    a66Var.c();
                    if (a66Var.a()) {
                        c41.c0(jb6.M0(2131742656, null));
                        return;
                    }
                    return;
                }
                a66Var.c();
                return;
            case 3:
                jac jacVar = (jac) obj4;
                uk0 uk0Var = (uk0) obj3;
                Context context2 = (Context) obj6;
                TL_account.passkeyRegistrationOptions passkeyregistrationoptions = (TL_account.passkeyRegistrationOptions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((he) obj5).dismiss();
                if (tL_error3 != null) {
                    jacVar.a(null, tL_error3.text);
                    return;
                }
                try {
                    try {
                        uk0Var.d(context2, new m23(new JSONObject(passkeyregistrationoptions.options.data).getJSONObject("publicKey").toString()), new ky7(new ro1(jacVar, context2, i9, (byte) 3)));
                        return;
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                        gm.c3(new d25(jacVar, e2, (byte) 2));
                        return;
                    }
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    jacVar.a(null, e3.getMessage());
                    return;
                }
            default:
                b61 b61Var3 = (b61) obj6;
                my0 my0Var = (my0) obj5;
                View view = (View) obj4;
                sm2 sm2Var = (sm2) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                b61Var3.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new c41(my0Var.F, my0Var.J0).f0("NO_TOKEN", false);
                        return;
                    }
                    int currentDatacenterId = ConnectionsManager.getInstance(i9).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i9).isTestBackend();
                    StringBuilder o = ts2.o("wear-auth: sending /token account=", i9, " dcId=", currentDatacenterId, " isTest=");
                    o.append(isTestBackend);
                    fc4.b(o.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] a = auc.a(sm2Var, queryParameter, currentDatacenterId, isTestBackend);
                        z3d z3dVar = new ua4(applicationContext, b05.c).i;
                        t2e t2eVar = new t2e(z3dVar, (String) sm2Var.e, "/tg-wear-auth/token", a);
                        z3dVar.b.d(0, t2eVar);
                        ydd.a(t2eVar, nf5.f).addOnSuccessListener(new uxb(sm2Var, b61Var3, (byte) 12)).addOnFailureListener(new ytc(b61Var3, (byte) 1));
                        my0Var.dismiss();
                        return;
                    } catch (Exception e4) {
                        fc4.g(e4, true);
                        new c41(my0Var.F, my0Var.J0).f0(e4.getMessage(), false);
                        return;
                    }
                }
                FrameLayout frameLayout = my0Var.F;
                if (tL_error4 != null) {
                    wi8.u(frameLayout, my0Var.J0, tL_error4, false);
                    return;
                } else {
                    new c41(frameLayout, my0Var.J0).f0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public v35(b61 b61Var, my0 my0Var, int i, View view, sm2 sm2Var) {
        this.c = b61Var;
        this.d = my0Var;
        this.b = i;
        this.e = view;
        this.f = sm2Var;
    }

    public v35(a66 a66Var, String str, String str2, String str3, int i) {
        this.c = a66Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i;
    }

    public v35(Context context, int i, c cVar, ylb ylbVar, t56 t56Var) {
        this.c = context;
        this.b = i;
        this.d = cVar;
        this.e = ylbVar;
        this.f = t56Var;
    }

    public v35(LaunchActivity launchActivity, k11 k11Var, oc7 oc7Var, int i, TLRPC.User user) {
        this.c = launchActivity;
        this.d = k11Var;
        this.e = oc7Var;
        this.b = i;
        this.f = user;
    }
}
