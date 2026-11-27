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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class g45 implements icc {
    public final byte a = 0;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public g45(id idVar, icc iccVar, vj0 vj0Var, Context context, int i) {
        this.d = idVar;
        this.e = iccVar;
        this.f = vj0Var;
        this.c = context;
        this.b = i;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        w45 w45Var;
        int i;
        a55 a55Var;
        int i2;
        ViewGroup viewGroup;
        final int i3;
        CharSequence V;
        int i4;
        int i5;
        String str;
        int i6;
        String M0;
        int i7;
        int i8;
        int i9;
        TL_wallet.tonConnectSession tonconnectsession;
        e S;
        byte b = this.a;
        int i10 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        int i11 = 0;
        switch (b) {
            case 0:
                Context context = (Context) obj6;
                c cVar = (c) obj5;
                vnb vnbVar = (vnb) obj4;
                final w56 w56Var = (w56) obj3;
                final w45 w45Var2 = (w45) obj;
                String str2 = (String) obj2;
                if (w45Var2 != null) {
                    int i12 = w45Var2.c;
                    TL_wallet.tonConnectSession tonconnectsession2 = w45Var2.a;
                    String str3 = w45Var2.e;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed() || !LaunchActivity.G1 || xea.w || xea.B || yac.t0 != i10) {
                            cVar.g.u(w45Var2);
                            return;
                        }
                    }
                    if ("signData".equals(str3)) {
                        final a55 a55Var2 = c.C(i10).g;
                        try {
                            JSONObject jSONObject = new JSONObject(w45Var2.k);
                            boolean equals = "text".equals(jSONObject.optString("type"));
                            tk7 tk7Var = new tk7(context, vnbVar, new View[0]);
                            tk7Var.F0(aob.v0(aob.a7, vnbVar));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            LinearLayout linearLayout2 = new LinearLayout(context);
                            linearLayout2.setGravity(16);
                            ImageView k = qd4.k(context, 2131231244);
                            k.setScaleType(ImageView.ScaleType.CENTER);
                            yob.s(k, aob.G6, vnbVar, PorterDuff.Mode.SRC_IN);
                            int i13 = aob.i6;
                            hf0 f0 = aob.f0(aob.v0(i13, vnbVar), 1, -1);
                            uob M = yob.M(i13);
                            k.setBackground(f0);
                            yob.j(k, f0, null, M, vnbVar);
                            k.setContentDescription(ob6.M0(2131752006, null));
                            k.setOnClickListener(new je3(w45Var2, tk7Var, (byte) 22));
                            linearLayout2.addView(k, tre.q(48, 48, 0.0f, 16, 4, 0, 12, 0));
                            de0 de0Var = new de0(context);
                            de0Var.setRoundRadius(hl.L(22.0f));
                            TLRPC.WebDocument webDocument = tonconnectsession2.manifest.icon;
                            if (webDocument != null) {
                                de0Var.p(jn5.p(jxc.c(webDocument)), "44_44", null, tonconnectsession2.manifest);
                            }
                            linearLayout2.addView(de0Var, tre.q(44, 44, 0.0f, 16, 0, 0, 12, 0));
                            LinearLayout linearLayout3 = new LinearLayout(context);
                            linearLayout3.setOrientation(1);
                            TextView v = a55.v(context, ob6.M0(2131742642, null), 18, vnbVar);
                            v.setTypeface(hl.o());
                            v.setGravity(3);
                            linearLayout3.addView(v, tre.o(-1, -2));
                            TextView v2 = a55.v(context, hl.J0(tonconnectsession2.manifest.url, false), 14, vnbVar);
                            int i14 = aob.z6;
                            yob.X(v2, i14, vnbVar);
                            v2.setGravity(3);
                            v2.setSingleLine(true);
                            v2.setEllipsize(TextUtils.TruncateAt.END);
                            linearLayout3.addView(v2, tre.o(-1, -2));
                            linearLayout2.addView(linearLayout3, tre.m(1.0f, 0, -2, 0, 16, 0));
                            linearLayout.addView(linearLayout2, tre.o(-1, 56));
                            LinearLayout linearLayout4 = new LinearLayout(context);
                            linearLayout4.setOrientation(1);
                            linearLayout4.setPadding(hl.L(20.0f), hl.L(16.0f), hl.L(20.0f), hl.L(16.0f));
                            int L = hl.L(16.0f);
                            int i15 = aob.d6;
                            ShapeDrawable b0 = aob.b0(L, aob.v0(i15, vnbVar));
                            uob M2 = yob.M(i15);
                            linearLayout4.setBackground(b0);
                            yob.j(linearLayout4, b0, M2, null, vnbVar);
                            if (equals) {
                                M0 = jSONObject.optString("text");
                                i7 = 14;
                            } else {
                                M0 = ob6.M0(2131742834, null);
                                i7 = 16;
                            }
                            TextView v3 = a55.v(context, M0, i7, vnbVar);
                            v3.setGravity(3);
                            v3.setTextIsSelectable(equals);
                            if (equals) {
                                TextView v4 = a55.v(context, ob6.M0(2131742641, null), 14, vnbVar);
                                v4.setGravity(3);
                                v4.setTypeface(hl.o());
                                yob.X(v4, aob.L6, vnbVar);
                                linearLayout4.addView(v4, tre.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
                                v3.setTypeface(Typeface.MONOSPACE);
                                i8 = -1;
                                i9 = -2;
                            } else {
                                LinearLayout linearLayout5 = new LinearLayout(context);
                                linearLayout5.setGravity(16);
                                TextView v5 = a55.v(context, "!", 12, vnbVar);
                                v5.setTypeface(hl.o());
                                v5.setTextColor(-1);
                                int L2 = hl.L(8.0f);
                                int i16 = aob.q7;
                                ShapeDrawable b02 = aob.b0(L2, aob.v0(i16, vnbVar));
                                uob M3 = yob.M(i16);
                                v5.setBackground(b02);
                                yob.j(v5, b02, M3, null, vnbVar);
                                linearLayout5.addView(v5, tre.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
                                TextView v6 = a55.v(context, ob6.M0(2131742835, null), 14, vnbVar);
                                v6.setGravity(3);
                                v6.setTypeface(hl.o());
                                i8 = -1;
                                i9 = -2;
                                linearLayout5.addView(v6, tre.o(-1, -2));
                                linearLayout4.addView(linearLayout5, tre.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                            }
                            linearLayout4.addView(v3, tre.o(i8, i9));
                            if (equals) {
                                v3.setOnClickListener(new lw4(jSONObject, tk7Var, vnbVar, (byte) 3));
                            }
                            ti3 ti3Var = new ti3(context, (byte) 1);
                            ti3Var.addView(linearLayout4);
                            linearLayout.addView(ti3Var, tre.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                            sk7 sk7Var = new sk7(context);
                            sk7Var.getContent().addView(linearLayout, tre.c(-2.0f, -1));
                            tk7Var.E0(sk7Var);
                            LinearLayout j = uh9.j(context, 1);
                            if (equals) {
                                TextView v7 = a55.v(context, ob6.M0(2131742660, null), 14, vnbVar);
                                v7.setGravity(3);
                                yob.X(v7, i14, vnbVar);
                                j.addView(v7, tre.k(36.0f, 12.0f, 36.0f, 0.0f, -1, -2));
                            }
                            LinearLayout linearLayout6 = new LinearLayout(context);
                            linearLayout6.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
                            c51 c51Var = new c51(vnbVar, context, true);
                            c51Var.setRoundRadius(24);
                            c51Var.e();
                            c51Var.setText(ob6.M0(2131752570, null));
                            c51 i17 = xnb.i(24, vnbVar, context, true);
                            i17.setText(ob6.M0(2131742643, null));
                            i17.setEnabled(false);
                            linearLayout6.addView(c51Var, tre.m(1.0f, 0, 44, 0, 6, 0));
                            linearLayout6.addView(i17, tre.m(1.0f, 0, 44, 6, 0, 0));
                            j.addView(linearLayout6);
                            tk7Var.G0(j);
                            tk7Var.z0 = new ut(w45Var2, (byte) 1);
                            re4 re4Var = new re4(ti3Var, w45Var2, i17, (byte) 17);
                            ti3Var.getViewTreeObserver().addOnScrollChangedListener(new cd(re4Var, (byte) 1));
                            ti3Var.getViewTreeObserver().addOnGlobalLayoutListener(new l45(re4Var, (byte) 0));
                            final m45 m45Var = new m45(i17, c51Var, a55Var2, w45Var2, tk7Var, vnbVar, re4Var);
                            i17.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    byte b2 = r2;
                                    m45 m45Var2 = m45Var;
                                    switch (b2) {
                                        case 0:
                                            m45Var2.a(Boolean.FALSE);
                                            return;
                                        default:
                                            m45Var2.a(Boolean.TRUE);
                                            return;
                                    }
                                }
                            });
                            c51Var.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    byte b2 = r2;
                                    m45 m45Var2 = m45Var;
                                    switch (b2) {
                                        case 0:
                                            m45Var2.a(Boolean.FALSE);
                                            return;
                                        default:
                                            m45Var2.a(Boolean.TRUE);
                                            return;
                                    }
                                }
                            });
                            final boolean[] zArr = {false};
                            final u45 u45Var = new u45(zArr, w45Var2, tk7Var, (byte) 0);
                            w45Var2.r = new rj4(tk7Var, (byte) 24);
                            tk7Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b2 = r6;
                                    w56 w56Var2 = w56Var;
                                    w45 w45Var3 = w45Var2;
                                    a55 a55Var3 = a55Var2;
                                    Runnable runnable = u45Var;
                                    boolean[] zArr2 = zArr;
                                    u45 u45Var2 = (u45) runnable;
                                    switch (b2) {
                                        case 0:
                                            zArr2[0] = true;
                                            hl.r(u45Var2);
                                            a55Var3.u(w45Var3);
                                            if (w56Var2 != null) {
                                                w56Var2.run();
                                                return;
                                            }
                                            return;
                                        default:
                                            zArr2[0] = true;
                                            hl.r(u45Var2);
                                            a55Var3.u(w45Var3);
                                            if (w56Var2 != null) {
                                                w56Var2.run();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            tk7Var.show();
                            hl.d3(u45Var, Math.max(0L, i12 - a55Var2.f.getCurrentTime()) * 1000);
                            return;
                        } catch (JSONException e) {
                            a55Var2.u(w45Var2);
                            d31.c0(a55.h("display signing data", e));
                            return;
                        }
                    }
                    c C = c.C(i10);
                    a55 a55Var3 = C.g;
                    z45 z45Var = w45Var2.f;
                    boolean equals2 = "signMessage".equals(str3);
                    final tk7 tk7Var2 = new tk7(context, vnbVar, new View[0]);
                    tk7Var2.F0(aob.v0(aob.a7, vnbVar));
                    LinearLayout linearLayout7 = new LinearLayout(context);
                    linearLayout7.setOrientation(1);
                    de0 de0Var2 = new de0(context);
                    de0Var2.setRoundRadius(hl.L(38.0f));
                    TLRPC.WebDocument webDocument2 = tonconnectsession2.manifest.icon;
                    if (webDocument2 != null) {
                        w45Var = w45Var2;
                        i = i10;
                        a55Var = a55Var3;
                        de0Var2.p(jn5.p(jxc.c(webDocument2)), "76_76", null, tonconnectsession2.manifest);
                    } else {
                        w45Var = w45Var2;
                        i = i10;
                        a55Var = a55Var3;
                    }
                    linearLayout7.addView(de0Var2, tre.t(76, 76, 1, 0, 24, 0, 0));
                    if (equals2) {
                        i2 = 2131742847;
                    } else {
                        i2 = 2131742846;
                    }
                    TextView v8 = a55.v(context, ob6.V(null, null, i2, tonconnectsession2.manifest.name), 20, vnbVar);
                    v8.setTypeface(hl.o());
                    linearLayout7.addView(v8, tre.k(24.0f, 12.0f, 24.0f, 0.0f, -1, -2));
                    String J0 = hl.J0(tonconnectsession2.manifest.url, false);
                    if (!TextUtils.isEmpty(J0)) {
                        linearLayout7.addView(a55.g(context, J0, vnbVar), tre.t(-2, -2, 1, 36, 6, 36, 12));
                    }
                    frc frcVar = new frc(context, 2131232834, 24);
                    frcVar.getCardHolderView().setMaxLines(2);
                    frcVar.getCardHolderView().setSingleLine(false);
                    List<y45> list = z45Var.b;
                    long j2 = z45Var.c;
                    frcVar.setCardHolder(atc.Z(((y45) list.get(0)).a));
                    frcVar.getBalanceView().setText(a55.j(j2));
                    frcVar.getUsdBalanceView().setText(C.q(j2, false));
                    linearLayout7.addView(frcVar, tre.o(-1, -2));
                    frcVar.setCardOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            View[] viewPages;
                            View[] viewPages2;
                            byte b2 = r2;
                            tk7 tk7Var3 = tk7Var2;
                            switch (b2) {
                                case 0:
                                    ir1 ir1Var = tk7Var3.l1;
                                    if (1 < tk7Var3.m1.size() && 1 != ir1Var.getCurrentPosition()) {
                                        for (View view2 : ir1Var.getViewPages()) {
                                            if (view2 != null) {
                                                hl.t1(view2);
                                            }
                                        }
                                        ir1Var.F(1);
                                        return;
                                    }
                                    return;
                                default:
                                    ir1 ir1Var2 = tk7Var3.l1;
                                    if (tk7Var3.m1.size() > 0 && ir1Var2.getCurrentPosition() != 0) {
                                        for (View view3 : ir1Var2.getViewPages()) {
                                            if (view3 != null) {
                                                hl.t1(view3);
                                            }
                                        }
                                        ir1Var2.F(0);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    sk7 sk7Var2 = new sk7(context);
                    sk7Var2.getContent().addView(linearLayout7, tre.c(-2.0f, -1));
                    tk7Var2.E0(sk7Var2);
                    ViewGroup j3 = uh9.j(context, 1);
                    LinearLayout j4 = uh9.j(context, 0);
                    j3.addView(j4, tre.o(-1, 56));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(2131231243);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    int i18 = aob.i6;
                    hf0 f02 = aob.f0(aob.v0(i18, vnbVar), 1, -1);
                    uob M4 = yob.M(i18);
                    imageView.setBackground(f02);
                    yob.j(imageView, f02, null, M4, vnbVar);
                    int i19 = aob.G6;
                    yob.s(imageView, i19, vnbVar, PorterDuff.Mode.SRC_IN);
                    iye.a(imageView);
                    j4.addView(imageView, tre.q(48, 48, 0.0f, 19, 4, 0, 0, 0));
                    de0 de0Var3 = new de0(context);
                    de0Var3.setRoundRadius(hl.L(22.0f));
                    TLRPC.WebDocument webDocument3 = tonconnectsession2.manifest.icon;
                    if (webDocument3 != null) {
                        viewGroup = j3;
                        de0Var3.p(jn5.p(jxc.c(webDocument3)), "44_44", null, tonconnectsession2.manifest);
                    } else {
                        viewGroup = j3;
                    }
                    j4.addView(de0Var3, tre.t(44, 44, 19, 12, 0, 11, 0));
                    LinearLayout linearLayout8 = new LinearLayout(context);
                    linearLayout8.setOrientation(1);
                    j4.addView(linearLayout8, tre.q(0, 44, 1.0f, 23, 0, 0, 12, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(hl.o());
                    yob.X(textView, i19, vnbVar);
                    textView.setTextSize(1, 18.0f);
                    linearLayout8.addView(textView, tre.o(-1, -2));
                    textView.setText(ob6.M0(2131742818, null));
                    if (!TextUtils.isEmpty(J0)) {
                        TextView textView2 = new TextView(context);
                        yob.X(textView2, aob.z6, vnbVar);
                        i3 = 1;
                        textView2.setTextSize(1, 14.0f);
                        linearLayout8.addView(textView2, tre.o(-1, -2));
                        textView2.setText(J0);
                    } else {
                        i3 = 1;
                    }
                    imageView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            View[] viewPages;
                            View[] viewPages2;
                            byte b2 = i3;
                            tk7 tk7Var3 = tk7Var2;
                            switch (b2) {
                                case 0:
                                    ir1 ir1Var = tk7Var3.l1;
                                    if (1 < tk7Var3.m1.size() && 1 != ir1Var.getCurrentPosition()) {
                                        for (View view2 : ir1Var.getViewPages()) {
                                            if (view2 != null) {
                                                hl.t1(view2);
                                            }
                                        }
                                        ir1Var.F(1);
                                        return;
                                    }
                                    return;
                                default:
                                    ir1 ir1Var2 = tk7Var3.l1;
                                    if (tk7Var3.m1.size() > 0 && ir1Var2.getCurrentPosition() != 0) {
                                        for (View view3 : ir1Var2.getViewPages()) {
                                            if (view3 != null) {
                                                hl.t1(view3);
                                            }
                                        }
                                        ir1Var2.F(0);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout9 = new LinearLayout(context);
                    linearLayout9.setOrientation(i3);
                    LinearLayout F = a55.F(context, ob6.M0(2131742682, null), vnbVar);
                    String C2 = a55.C(((y45) list.get(0)).a);
                    SpannableStringBuilder w = c.w(j2, i3);
                    if (list.size() > i3) {
                        Integer valueOf = Integer.valueOf(list.size() - i3);
                        Object[] objArr = new Object[2];
                        objArr[0] = C2;
                        objArr[i3] = valueOf;
                        V = ob6.V(null, null, 2131742606, objArr);
                    } else {
                        Object[] objArr2 = new Object[i3];
                        objArr2[0] = C2;
                        V = ob6.V(null, null, 2131742607, objArr2);
                    }
                    F.addView(a55.b(context, w, V, null, null, vnbVar), tre.o(-1, -2));
                    linearLayout9.addView(F, tre.k(12.0f, 4.0f, 12.0f, 6.0f, -1, -2));
                    LinearLayout F2 = a55.F(context, ob6.M0(2131742858, null), vnbVar);
                    for (y45 y45Var : list) {
                        if (y45Var.b != null && y45Var.d == null) {
                            i6 = 2131742804;
                            str = null;
                        } else {
                            str = null;
                            i6 = 2131742612;
                        }
                        F2.addView(a55.b(context, ob6.M0(i6, str), ob6.V(str, str, 2131742607, a55.C(y45Var.a)), a55.a(-y45Var.e), y45Var.d, vnbVar), tre.o(-1, -2));
                    }
                    linearLayout9.addView(F2, tre.k(12.0f, 6.0f, 12.0f, 12.0f, -1, -2));
                    ti3 ti3Var2 = new ti3(context, (byte) 2);
                    ti3Var2.setFillViewport(false);
                    ti3Var2.addView(linearLayout9);
                    ViewGroup viewGroup2 = viewGroup;
                    viewGroup2.addView(ti3Var2, tre.o(-1, -2));
                    sk7 sk7Var3 = new sk7(context);
                    sk7Var3.getContent().addView(viewGroup2, tre.c(-2.0f, -1));
                    tk7Var2.E0(sk7Var3);
                    LinearLayout j5 = uh9.j(context, 1);
                    TextView v9 = a55.v(context, null, 14, vnbVar);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                    spannableStringBuilder.setSpan(new ya6(hl.L(80.0f), v9), 0, spannableStringBuilder.length(), 33);
                    v9.setText(ob6.V(null, null, 2131742770, spannableStringBuilder));
                    if (equals2) {
                        i4 = 8;
                    } else {
                        i4 = 0;
                    }
                    v9.setVisibility(i4);
                    yob.X(v9, aob.z6, vnbVar);
                    j5.addView(v9, tre.k(20.0f, 16.0f, 20.0f, 16.0f, -1, -2));
                    LinearLayout linearLayout10 = new LinearLayout(context);
                    linearLayout10.setPadding(hl.L(16.0f), 0, hl.L(16.0f), hl.L(16.0f));
                    c51 c51Var2 = new c51(vnbVar, context, true);
                    c51Var2.setRoundRadius(24);
                    c51Var2.e();
                    c51Var2.setText(ob6.M0(2131742794, null));
                    linearLayout10.addView(c51Var2, tre.m(1.0f, 0, 44, 0, 6, 0));
                    c51 i20 = xnb.i(24, vnbVar, context, true);
                    if (equals2) {
                        i5 = 2131742643;
                    } else {
                        i5 = 2131742819;
                    }
                    i20.setText(ob6.M0(i5, null));
                    i20.setEnabled(false);
                    linearLayout10.addView(i20, tre.m(1.0f, 0, 44, 6, 0, 0));
                    j5.addView(linearLayout10);
                    tk7Var2.G0(j5);
                    final boolean[] zArr2 = {false};
                    boolean[] zArr3 = {false};
                    final w45 w45Var3 = w45Var;
                    final a55 a55Var4 = a55Var;
                    final i45 i45Var = new i45(w45Var3, zArr3, i20, c51Var2, a55Var4, tk7Var2, zArr2, vnbVar);
                    i20.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            byte b2 = r2;
                            i45 i45Var2 = i45Var;
                            switch (b2) {
                                case 0:
                                    i45Var2.a(Boolean.FALSE);
                                    return;
                                default:
                                    i45Var2.a(Boolean.TRUE);
                                    return;
                            }
                        }
                    });
                    c51Var2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            byte b2 = r2;
                            i45 i45Var2 = i45Var;
                            switch (b2) {
                                case 0:
                                    i45Var2.a(Boolean.FALSE);
                                    return;
                                default:
                                    i45Var2.a(Boolean.TRUE);
                                    return;
                            }
                        }
                    });
                    final u45 u45Var2 = new u45(zArr2, w45Var3, tk7Var2, (byte) 1);
                    long j6 = i12;
                    long j7 = z45Var.a;
                    if (j7 == 0) {
                        j7 = Long.MAX_VALUE;
                    }
                    w45Var3.r = new rj4(tk7Var2, (byte) 24);
                    tk7Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            byte b2 = r6;
                            w56 w56Var2 = w56Var;
                            w45 w45Var32 = w45Var3;
                            a55 a55Var32 = a55Var4;
                            Runnable runnable = u45Var2;
                            boolean[] zArr22 = zArr2;
                            u45 u45Var22 = (u45) runnable;
                            switch (b2) {
                                case 0:
                                    zArr22[0] = true;
                                    hl.r(u45Var22);
                                    a55Var32.u(w45Var32);
                                    if (w56Var2 != null) {
                                        w56Var2.run();
                                        return;
                                    }
                                    return;
                                default:
                                    zArr22[0] = true;
                                    hl.r(u45Var22);
                                    a55Var32.u(w45Var32);
                                    if (w56Var2 != null) {
                                        w56Var2.run();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    tk7Var2.show();
                    hl.d3(u45Var2, Math.max(0L, Math.min(j6, j7) - ConnectionsManager.getInstance(i).getCurrentTime()) * 1000);
                    j72 j72Var = new j72(zArr2, w45Var3, zArr3, i20, equals2, C, v9, tk7Var2, vnbVar);
                    WalletEngine2 walletEngine2 = a55Var4.b.b;
                    if (!w45Var3.n && !a55Var4.i(w45Var3) && a55Var4.A(w45Var3) && walletEngine2 != null) {
                        if ("signMessage".equals(str3)) {
                            walletEngine2.previewSignMessage(z45Var, new gt(a55Var4, w45Var3, j72Var, (byte) 21));
                            return;
                        } else {
                            walletEngine2.previewTonConnect(z45Var, new p(a55Var4, w45Var3, j72Var, (byte) 21));
                            return;
                        }
                    }
                    j72Var.a(null, "Request expired, was processed, or the wallet changed");
                    return;
                } else if (str2 != null) {
                    d31.c0(str2);
                    return;
                } else {
                    return;
                }
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                l01 l01Var = (l01) obj5;
                uc7 uc7Var = (uc7) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str4 = LaunchActivity.C1;
                if (l01Var != null) {
                    l01Var.b();
                }
                if (user2 != null) {
                    uc7Var.i4(user2, false, false);
                    uc7Var.f3(user2, 0, true, null);
                }
                launchActivity.m0(i10, user.id, tL_error);
                return;
            case 2:
                e66 e66Var = (e66) obj6;
                String str5 = (String) obj5;
                String str6 = (String) obj4;
                String str7 = (String) obj3;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity2 = e66Var.a;
                e66Var.h = -1;
                if (!e66Var.j && !launchActivity2.isFinishing() && !launchActivity2.isDestroyed()) {
                    if (tL_error2 != null) {
                        e66Var.c();
                        if (e66Var.a()) {
                            e66.d().g0(tL_error2, false);
                            return;
                        }
                        return;
                    }
                    if (tonconnectpending != null && (tonconnectsession = tonconnectpending.session) != null && !tonconnectsession.closed && !tonconnectsession.closing && !tonconnectsession.pending && str5.equals(tonconnectsession.dapp_client_id)) {
                        ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                        int size = arrayList.size();
                        while (true) {
                            if (i11 < size) {
                                TL_wallet.tonConnectRequest tonconnectrequest = arrayList.get(i11);
                                i11++;
                                TL_wallet.tonConnectRequest tonconnectrequest2 = tonconnectrequest;
                                if (str6.equals(tonconnectrequest2.trace_id) && tonconnectrequest2.session_id == tonconnectpending.session.id && tonconnectrequest2.expires > ConnectionsManager.getInstance(e66Var.b).getCurrentTime()) {
                                    if (e66Var.a() && (S = LaunchActivity.S()) != null && S.getContext() != null) {
                                        e66Var.c();
                                        a55.q(e66Var.a, e66Var.b, tonconnectrequest2.session_id, tonconnectrequest2.msg_id, S.getResourceProvider(), new w56(e66Var, str7, (byte) 3));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    int i21 = this.b;
                    if (i21 < 10) {
                        l77 l77Var = new l77(e66Var, str5, str6, str7, i21, (byte) 19);
                        e66Var.i = l77Var;
                        hl.d3(l77Var, 500L);
                        return;
                    }
                    e66Var.c();
                    if (e66Var.a()) {
                        d31.c0(ob6.M0(2131742624, null));
                        return;
                    }
                    return;
                }
                e66Var.c();
                return;
            case 3:
                icc iccVar = (icc) obj4;
                vj0 vj0Var = (vj0) obj3;
                Context context2 = (Context) obj6;
                TL_account.passkeyRegistrationOptions passkeyregistrationoptions = (TL_account.passkeyRegistrationOptions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((id) obj5).dismiss();
                if (tL_error3 != null) {
                    iccVar.a(null, tL_error3.text);
                    return;
                }
                try {
                    try {
                        vj0Var.c(context2, new t13(new JSONObject(passkeyregistrationoptions.options.data).getJSONObject("publicKey").toString()), new pz7(new pn1(iccVar, context2, i10, (byte) 3)));
                        return;
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                        hl.c3(new h25(iccVar, e2, (byte) 2));
                        return;
                    }
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    iccVar.a(null, e3.getMessage());
                    return;
                }
            default:
                c51 c51Var3 = (c51) obj6;
                nx0 nx0Var = (nx0) obj5;
                View view = (View) obj4;
                am2 am2Var = (am2) obj3;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                c51Var3.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new d31(nx0Var.F, nx0Var.J0).f0("NO_TOKEN", false);
                        return;
                    }
                    int currentDatacenterId = ConnectionsManager.getInstance(i10).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
                    StringBuilder p = bs2.p("wear-auth: sending /token account=", i10, " dcId=", currentDatacenterId, " isTest=");
                    p.append(isTestBackend);
                    cc4.b(p.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] a = nwc.a(am2Var, queryParameter, currentDatacenterId, isTestBackend);
                        o6d o6dVar = new qa4(applicationContext, g05.c).i;
                        g5e g5eVar = new g5e(o6dVar, (String) am2Var.e, "/tg-wear-auth/token", a);
                        o6dVar.b.d(0, g5eVar);
                        pgd.a(g5eVar, qf5.f).addOnSuccessListener(new yw9(am2Var, c51Var3, (byte) 27)).addOnFailureListener(new lwc(c51Var3, (byte) 1));
                        nx0Var.dismiss();
                        return;
                    } catch (Exception e4) {
                        cc4.g(e4, true);
                        new d31(nx0Var.F, nx0Var.J0).f0(e4.getMessage(), false);
                        return;
                    }
                }
                FrameLayout frameLayout = nx0Var.F;
                if (tL_error4 != null) {
                    ik8.u(frameLayout, nx0Var.J0, tL_error4, false);
                    return;
                } else {
                    new d31(frameLayout, nx0Var.J0).f0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public g45(c51 c51Var, nx0 nx0Var, int i, View view, am2 am2Var) {
        this.c = c51Var;
        this.d = nx0Var;
        this.b = i;
        this.e = view;
        this.f = am2Var;
    }

    public g45(e66 e66Var, String str, String str2, String str3, int i) {
        this.c = e66Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i;
    }

    public g45(Context context, int i, c cVar, vnb vnbVar, w56 w56Var) {
        this.c = context;
        this.b = i;
        this.d = cVar;
        this.e = vnbVar;
        this.f = w56Var;
    }

    public g45(LaunchActivity launchActivity, l01 l01Var, uc7 uc7Var, int i, TLRPC.User user) {
        this.c = launchActivity;
        this.d = l01Var;
        this.e = uc7Var;
        this.b = i;
        this.f = user;
    }
}
