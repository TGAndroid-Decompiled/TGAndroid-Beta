package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.Wallet.b;
import org.telegram.ui.Wallet.c;
public final class goc extends n7c implements jm7 {
    public static Typeface Y0;
    public float A0;
    public float B0;
    public qmb C0;
    public float D0;
    public View E;
    public b61 E0;
    public qw9 F;
    public b61 F0;
    public boolean G;
    public b G0;
    public t25 H0;
    public boolean I0;
    public View K0;
    public float L0;
    public float M0;
    public ValueAnimator N0;
    public zja P0;
    public zx8 Q0;
    public int R0;
    public enc S;
    public rnc T;
    public FrameLayout U;
    public SpannableString U0;
    public TextView V;
    public boolean V0;
    public FrameLayout W;
    public boolean W0;
    public TextView X;
    public bm3 X0;
    public FrameLayout Y;
    public TextView Z;
    public l66 a0;
    public snc b0;
    public boolean c0;
    public FrameLayout d0;
    public unc e;
    public FrameLayout e0;
    public snc f;
    public boolean g0;
    public int h;
    public vgc h0;
    public FrameLayout i0;
    public brc j0;
    public mqc k0;
    public float m0;
    public vnc n;
    public ValueAnimator n0;
    public enc o0;
    public int p0;
    public boolean q0;
    public int r;
    public boolean r0;
    public boolean s;
    public hs1 s0;
    public coc t0;
    public LinearLayout v0;
    public io w0;
    public io x0;
    public FrameLayout y;
    public qoc y0;
    public xnc z0;
    public final zka w = new zka(this, (byte) 15);
    public final yt3 x = new yt3(this, (byte) 3);
    public final Rect H = new Rect();
    public final Matrix I = new Matrix();
    public final Matrix J = new Matrix();
    public final Matrix K = new Matrix();
    public final float[] L = new float[8];
    public final float[] M = new float[8];
    public final float[] N = new float[8];
    public final int[] O = new int[2];
    public final int[] P = new int[2];
    public final int[] Q = new int[2];
    public final int[] R = new int[2];
    public int f0 = 0;
    public String l0 = "";
    public final q7c[] u0 = new q7c[2];
    public final pmc J0 = new pmc(this, (byte) 0);
    public final pmc O0 = new pmc(this, (byte) 1);
    public final CharSequence[] S0 = new CharSequence[2];
    public final HashSet T0 = new HashSet();

    public static void J0(Context context, int i, TL_wallet.walletTransaction wallettransaction, lac lacVar, jac jacVar, byte[] bArr, vl1 vl1Var, ylb ylbVar) {
        TL_wallet.nftItem nftitem;
        String str;
        el7[] el7VarArr;
        View[] viewArr;
        jac jacVar2;
        LinearLayout k0;
        if (context == null) {
            return;
        }
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        if (((walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) || (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnchainGift)) && (nftitem = wallettransaction.nft) != null) {
            TL_stars.StarGift starGift = nftitem.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                wsa wsaVar = new wsa(context, i, 0L, ylbVar, null);
                wsaVar.d3 = wallettransaction;
                gs7 c = gs7.c(wallettransaction);
                if (c != null) {
                    str = c.e();
                } else {
                    str = null;
                }
                wsaVar.a2.setStatusPill(str);
                wsaVar.m2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                wsaVar.show();
                return;
            }
        }
        boolean z = true;
        el7[] el7VarArr2 = new el7[1];
        View[] viewArr2 = new View[1];
        b G = c.C(i).G();
        ArrayList arrayList = new ArrayList(G.c);
        int i2 = 0;
        while (true) {
            if (i2 < arrayList.size()) {
                if (arrayList.get(i2) == wallettransaction || c.t0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i2))) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (lacVar == null && vl1Var == null && i2 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(2131232745).getPadding(rect);
            viewArr = viewArr2;
            ?? hncVar = new hnc(context, ylbVar, arrayList, G, i, rect, viewArr);
            hncVar.setPosition(i2);
            el7VarArr = el7VarArr2;
            hncVar.setAdapter(new inc(arrayList, context, ylbVar, rect, i, el7VarArr2));
            jacVar2 = jacVar;
            k0 = hncVar;
        } else {
            el7VarArr = el7VarArr2;
            viewArr = viewArr2;
            jacVar2 = jacVar;
            k0 = k0(context, i, wallettransaction, lacVar, jacVar, bArr, vl1Var, ylbVar, el7VarArr, false);
        }
        el7[] el7VarArr3 = el7VarArr;
        jnc jncVar = new jnc(context, k0, ylbVar, k0, viewArr, context);
        el7VarArr3[0] = jncVar;
        if ((k0 instanceof wgc) && jacVar2 != null) {
            jncVar.n(new qhc(jacVar2, wallettransaction, (byte) 12));
        }
        el7 el7Var = el7VarArr3[0];
        if (lacVar == null) {
            z = false;
        }
        el7Var.v0(z);
        el7 el7Var2 = el7VarArr3[0];
        el7Var2.T0 = false;
        el7Var2.show();
    }

    public static void L0(Context context, ylb ylbVar) {
        my0 h = hg9.h(1, ylbVar, context, false);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = gm.L(16.0f);
        int i = cmb.g5;
        Drawable b0 = cmb.b0(L, cmb.v0(i, ylbVar));
        wmb M = anb.M(i);
        frameLayout.setBackground(b0);
        anb.j(frameLayout, b0, M, null, ylbVar);
        frameLayout.setPadding(gm.L(36.0f), 0, gm.L(36.0f), gm.L(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, qoe.c(-2.0f, -1));
        linearLayout.addView(new npc(160, context, false), qoe.t(160, 160, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(jb6.M0(2131742779, null));
        anb.X(textView, cmb.i5, ylbVar);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(gm.n1("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView m = wi8.m(linearLayout, textView, qoe.t(-1, -2, 1, 0, 0, 0, 6), context);
        m.setText(jb6.M0(2131742778, null));
        int i2 = cmb.y6;
        anb.X(m, i2, ylbVar);
        m.setTextSize(1, 14.0f);
        m.setGravity(17);
        m.setLineSpacing(gm.L(1.0f), 1.0f);
        linearLayout.addView(m, qoe.t(-1, -2, 1, 0, 0, 0, 24));
        znc zncVar = new znc(context, ylbVar);
        zncVar.setPadding(gm.L(0.0f), gm.L(8.0f), gm.L(0.0f), gm.L(8.0f));
        zncVar.a(2131232848, jb6.M0(2131742682, null), jb6.M0(2131742681, null));
        linearLayout.addView(zncVar, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        znc zncVar2 = new znc(context, ylbVar);
        zncVar2.setPadding(gm.L(0.0f), gm.L(8.0f), gm.L(0.0f), gm.L(8.0f));
        zncVar2.a(2131232846, jb6.M0(2131742750, null), jb6.M0(2131742749, null));
        linearLayout.addView(zncVar2, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        znc zncVar3 = new znc(context, ylbVar);
        zncVar3.setPadding(gm.L(0.0f), gm.L(8.0f), gm.L(0.0f), gm.L(8.0f));
        zncVar3.a(2131232850, jb6.M0(2131742865, null), jb6.M0(2131742864, null));
        linearLayout.addView(zncVar3, qoe.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        b61 i3 = mlb.i(24, ylbVar, context, true);
        i3.setText(jb6.M0(2131742783, null));
        linearLayout.addView(i3, qoe.t(-1, 48, 1, 0, 0, 0, 0));
        rve.b(i3, 0.02f, 1.1f);
        l66 l66Var = new l66(context, null);
        anb.X(l66Var, i2, ylbVar);
        l66Var.setTextSize(1, 13.0f);
        l66Var.setGravity(17);
        l66Var.setText(V0(jb6.M0(2131742669, null), cmb.Wc, ylbVar, new dh1(context, (byte) 25)));
        linearLayout.addView(l66Var, qoe.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        h.O = frameLayout;
        my0[] my0VarArr = {h};
        my0VarArr[0].r0(true);
        my0VarArr[0].J();
        i3.setOnClickListener(new f5(my0VarArr, (byte) 9));
        my0VarArr[0].show();
    }

    public static void M0(int i, ylb ylbVar, Context context) {
        c C = c.C(i);
        if (C.M()) {
            String x = C.x();
            if (TextUtils.isEmpty(x)) {
                return;
            }
            N0(context, i, x, true, null, ylbVar);
        }
    }

    public static void N0(Context context, final int i, String str, final boolean z, final ak8 ak8Var, final ylb ylbVar) {
        int i2;
        final my0 my0Var = new my0(1, ylbVar, context, false);
        my0Var.s0(-12207881);
        my0Var.K(-12207881);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(new foc());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, qoe.f(-2.0f, -1, 55, gm.L(12.0f), gm.L(30.0f), gm.L(12.0f), gm.L(12.0f) + gm.n));
        eoc eocVar = new eoc(context, str);
        if (!z) {
            eocVar.b.setText(jb6.M0(2131746233, null));
        }
        linearLayout.addView(eocVar, qoe.r(288, 302, 1));
        TextView textView = new TextView(context);
        textView.setText(jb6.M0(2131742704, null));
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setLineSpacing(gm.L(1.0f), 1.0f);
        linearLayout.addView(textView, qoe.t(-1, -2, 1, 24, 0, 24, 20));
        final b61 b61Var = new b61(null, context, true);
        b61Var.setRoundRadius(24);
        b61Var.setColor(-1);
        b61Var.setTextColor(-15556886);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z) {
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new pn2(2131232826, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) jb6.M0(2131742863, null));
        } else {
            pn2 pn2Var = new pn2(2131231961, 0);
            pn2Var.c(gm.L(20.0f));
            spannableStringBuilder.append((CharSequence) "G");
            spannableStringBuilder.setSpan(pn2Var, 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) jb6.M0(2131742680, null));
        }
        b61Var.setText(spannableStringBuilder);
        linearLayout.addView(b61Var, qoe.t(-1, 48, 1, 0, 0, 0, 0));
        if (!z) {
            textView.setVisibility(8);
            if (ak8Var != null) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            b61Var.setVisibility(i2);
        }
        View k = td4.k(context, 2131231273);
        k.setPadding(gm.L(12.0f), gm.L(12.0f), gm.L(12.0f), gm.L(12.0f));
        k.setContentDescription(jb6.M0(2131751978, null));
        rve.a(k);
        frameLayout.addView(k, qoe.d(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
        my0Var.O = frameLayout;
        my0Var.x = true;
        my0Var.v0 = false;
        my0Var.w0 = false;
        my0Var.K(-12207881);
        k.setOnClickListener(new di(my0Var, (byte) 7));
        eocVar.f = new iv2(str, (byte) 8);
        my0Var.show();
        my0Var.x0(-12207881);
        gm.o3(my0Var, -12207881, false, null);
        gm.i3(my0Var, false);
        if (Build.VERSION.SDK_INT >= 29 && my0Var.getWindow() != null) {
            my0Var.getWindow().setNavigationBarContrastEnforced(false);
        }
        b61Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                boolean z2 = z;
                my0 my0Var2 = my0Var;
                if (!z2) {
                    my0Var2.dismiss();
                    ak8Var.run();
                    return;
                }
                b61 b61Var2 = b61Var;
                if (b61Var2.R) {
                    return;
                }
                b61Var2.setLoading(true);
                tmc tmcVar = new tmc(b61Var2, my0Var2, ylbVar, (byte) 0);
                int i3 = i;
                c C = c.C(i3);
                C.x0(new v99(i3, tmcVar, C, (byte) 29));
            }
        });
    }

    public static SpannableStringBuilder V0(String str, int i, ylb ylbVar, Runnable runnable) {
        int i2;
        int i3;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf >= 0 && indexOf2 >= 0 && (i3 = indexOf2 - indexOf) > 2) {
            i2 = i3 - 2;
        } else {
            indexOf = -1;
            i2 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new gh1(i, ylbVar, runnable), indexOf, i2 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void d1(q7c q7cVar, boolean z) {
        boolean canScrollVertically = q7cVar.canScrollVertically(-1);
        q7cVar.g3.O(z);
        q7cVar.b0();
        if (!canScrollVertically) {
            q7cVar.f3.g1(0, 0);
        }
    }

    public static Uri i1(String str) {
        Uri parse = Uri.parse(str.trim());
        if (parse.getScheme() == null) {
            Uri parse2 = Uri.parse("https://" + str.trim());
            if (w0(parse2.getHost())) {
                return parse2;
            }
        }
        return parse;
    }

    public static String j1(Uri uri) {
        if (w0(uri.getHost())) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 1) {
                String str = pathSegments.get(0);
                if (!"sendgrams".equalsIgnoreCase(str) && str.matches("[a-zA-Z][a-zA-Z0-9_]{3,31}")) {
                    return str;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static android.widget.LinearLayout k0(final android.content.Context r38, int r39, org.telegram.tgnet.tl.TL_wallet.walletTransaction r40, defpackage.lac r41, defpackage.jac r42, byte[] r43, defpackage.vl1 r44, defpackage.ylb r45, defpackage.el7[] r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.goc.k0(android.content.Context, int, org.telegram.tgnet.tl.TL_wallet$walletTransaction, lac, jac, byte[], vl1, ylb, el7[], boolean):android.widget.LinearLayout");
    }

    public static String n0(String str) {
        StringBuilder sb = new StringBuilder((str.length() / 4) + str.length());
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && i % 4 == 0) {
                sb.append(' ');
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static CharSequence o0(String str, Runnable runnable) {
        if (TextUtils.isEmpty(str)) {
            return jb6.M0(2131742636, null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        while (true) {
            char c = '\n';
            if (i < str.length()) {
                if (i > 0 && i % 4 == 0) {
                    if (i % 16 != 0) {
                        c = ' ';
                    }
                    spannableStringBuilder.append(c);
                    spannableStringBuilder.length();
                }
                spannableStringBuilder.append(str.charAt(i));
                if (i % 4 == 3) {
                    spannableStringBuilder.length();
                }
                i++;
            } else {
                spannableStringBuilder.setSpan(new q1((Object) str, runnable, (byte) 10), 0, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        }
    }

    public static SpannableStringBuilder p0(int i, long j, ylb ylbVar) {
        BigDecimal stripTrailingZeros;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        pn2 pn2Var = new pn2(2131232837, 2);
        pn2Var.d = false;
        pn2Var.c(gm.L(16.0f));
        spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j).movePointLeft(9);
        if (movePointLeft.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = movePointLeft.stripTrailingZeros();
        }
        spannableStringBuilder.append((CharSequence) stripTrailingZeros.toPlainString());
        CharSequence q = c.C(i).q(j, true);
        if (!TextUtils.isEmpty(q)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(q);
            spannableStringBuilder.setSpan(new do4(cmb.y6, ylbVar), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static Typeface s0(Context context) {
        Typeface typeface = Y0;
        if (typeface == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                fl.e();
                Typeface build = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
                Y0 = build;
                return build;
            }
            Typeface n1 = gm.n1("fonts/rmono.ttf");
            Y0 = n1;
            return n1;
        }
        return typeface;
    }

    public static boolean w0(String str) {
        if (str != null) {
            if ("t.me".equalsIgnoreCase(str) || "telegram.me".equalsIgnoreCase(str) || "telegram.dog".equalsIgnoreCase(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean x0(Uri uri) {
        String scheme = uri.getScheme();
        if (!"ton".equalsIgnoreCase(scheme) && !"tc".equalsIgnoreCase(scheme)) {
            if (("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) && w0(uri.getHost())) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 1 || (!"sendgrams".equalsIgnoreCase(pathSegments.get(0)) && j1(uri) == null)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void A0() {
        M0(this.currentAccount, getResourceProvider(), getParentActivity());
    }

    public final void B0() {
        M0(this.currentAccount, getResourceProvider(), getParentActivity());
    }

    public final void C0() {
        c C = c.C(this.currentAccount);
        b61 b61Var = this.F0;
        if (b61Var.R) {
            return;
        }
        b61Var.setLoading(true);
        C.x0(new bb1((Object) C, (Object) new ts9(this, C, (byte) 21), false, false, (byte) 3));
    }

    public final void D0(String str, c cVar, bu5 bu5Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        String str2;
        float f;
        if (currencyrate == null) {
            return;
        }
        a8 a8Var = new a8(2, this.resourceProvider, getParentActivity(), false, false);
        a8Var.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        a8Var.setText(currencyrate.currency);
        if (!TextUtils.isEmpty(currencyrate.translatedTitle)) {
            str2 = currencyrate.translatedTitle;
        } else {
            str2 = currencyrate.title;
        }
        a8Var.setSubtext(str2);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        TextView textView = a8Var.b;
        if (equals) {
            f = 42.0f;
        } else {
            f = 0.0f;
        }
        textView.setPadding(0, 0, gm.L(f), 0);
        a8Var.setChecked(equals);
        a8Var.setOnClickListener(new jw4(cVar, currencyrate, bu5Var, (byte) 26));
        linearLayout.addView(a8Var, qoe.o(200, -2));
    }

    public final void E0(LinearLayout linearLayout, c cVar, bu5 bu5Var) {
        TL_wallet.currencyRate currencyrate;
        goc gocVar;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        c cVar2 = cVar;
        linearLayout2.removeAllViews();
        String g = cVar2.h.g();
        TL_wallet.currencyRates f = cVar2.h.f();
        if (f == null) {
            for (int i = 0; i < 3; i++) {
                tk4 tk4Var = new tk4(getParentActivity(), getResourceProvider());
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(31);
                linearLayout2.addView(tk4Var, qoe.o(200, -2));
            }
            return;
        }
        l53 l53Var = cVar2.h;
        l53Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        TL_wallet.currencyRates f2 = l53Var.f();
        TL_wallet.currencyRate currencyrate2 = null;
        if (f2 != null && (arrayList = f2.rates) != null) {
            int size = arrayList.size();
            currencyrate = null;
            int i2 = 0;
            while (i2 < size) {
                TL_wallet.currencyRate currencyrate3 = arrayList.get(i2);
                i2++;
                TL_wallet.currencyRate currencyrate4 = currencyrate3;
                if (currencyrate4 != null) {
                    if (TextUtils.equals(currencyrate4.currency, "USD")) {
                        currencyrate2 = currencyrate4;
                    } else if (TextUtils.equals(currencyrate4.currency, "EUR")) {
                        currencyrate = currencyrate4;
                    }
                }
            }
        } else {
            currencyrate = null;
        }
        if (currencyrate2 == null) {
            currencyrate2 = l53.e();
        }
        arrayList2.add(currencyrate2);
        if (currencyrate != null) {
            arrayList2.add(currencyrate);
        }
        if (f2 != null && f2.rates != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(l53Var.g());
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) a.b.getSystemService("input_method");
                if (inputMethodManager != null) {
                    l53.b(linkedHashSet, inputMethodManager.getCurrentInputMethodSubtype());
                    for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                        for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                            l53.b(linkedHashSet, inputMethodSubtype);
                        }
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
            l53.a(linkedHashSet, oc7.r1(l53Var.a).l4.S.f);
            l53.c(linkedHashSet, jb6.D0().y);
            l53.c(linkedHashSet, jb6.D0().z);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!TextUtils.equals(str, "USD") && !TextUtils.equals(str, "EUR")) {
                    ArrayList<TL_wallet.currencyRate> arrayList3 = f2.rates;
                    int size2 = arrayList3.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size2) {
                            TL_wallet.currencyRate currencyrate5 = arrayList3.get(i3);
                            i3++;
                            TL_wallet.currencyRate currencyrate6 = currencyrate5;
                            if (currencyrate6 != null && TextUtils.equals(currencyrate6.currency, str)) {
                                arrayList2.add(currencyrate6);
                                break;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        int i4 = 0;
        while (i4 < arrayList2.size()) {
            TL_wallet.currencyRate currencyrate7 = (TL_wallet.currencyRate) arrayList2.get(i4);
            if (currencyrate7 != null && hashSet.add(currencyrate7.currency)) {
                D0(g, cVar2, bu5Var, linearLayout2, currencyrate7);
            }
            i4++;
            cVar2 = cVar;
        }
        if (!hashSet.isEmpty() && !f.rates.isEmpty()) {
            gocVar = this;
            linearLayout2.addView(new j8(getParentActivity(), gocVar.resourceProvider), qoe.o(-1, 8));
        } else {
            gocVar = this;
        }
        int i5 = 0;
        while (i5 < f.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f.rates.get(i5);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                gocVar.D0(g, cVar, bu5Var, linearLayout2, currencyrate8);
            }
            i5++;
            gocVar = this;
            linearLayout2 = linearLayout;
        }
    }

    public final void F0(String str) {
        Uri i1 = i1(str);
        String j1 = j1(i1);
        if (j1 != null) {
            int i = this.currentAccount;
            oc7.r1(i).Z1().a(j1, null, new jr0(i, new smc(this, (byte) 4), (byte) 6));
        } else if ((getParentActivity() instanceof LaunchActivity) && new a66((LaunchActivity) getParentActivity(), this.currentAccount, null, false).g(i1)) {
        } else {
            gm.c3(new pmc(this, (byte) 9));
        }
    }

    public final void G0() {
        t25 t25Var;
        q7c q7cVar = this.u0[1];
        if (this.f0 == 1 && q7cVar != null && q7cVar.H && (t25Var = this.H0) != null && !t25Var.i && !t25Var.g && t25Var.m == null && q7cVar.f3.M0() >= q7cVar.g3.E.size() - 3) {
            this.H0.e();
        }
    }

    public final void H0() {
        b bVar;
        q7c q7cVar = this.u0[0];
        if (q7cVar != null && q7cVar.H && (bVar = this.G0) != null && !bVar.k && !bVar.h && q7cVar.f3.M0() >= q7cVar.g3.E.size() - 3) {
            this.G0.h();
        }
    }

    public final CharSequence I0(int i) {
        io ioVar;
        float f;
        CharSequence[] charSequenceArr = this.S0;
        if (charSequenceArr[i] == null) {
            charSequenceArr[i] = new SpannableString("l");
            if (i == 0) {
                ioVar = this.w0;
                f = 100.0f;
            } else {
                ioVar = this.x0;
                f = 50.0f;
            }
            ta6 ta6Var = new ta6(gm.L(f), ioVar);
            ta6Var.a(cmb.p1(0.45f, -1), cmb.p1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i];
            ((SpannableString) charSequence).setSpan(ta6Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i];
    }

    public final void K0(TL_wallet.nftItem nftitem) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        TL_stars.StarGift starGift = nftitem.gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            wsa wsaVar = new wsa(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            wsaVar.a3 = nftitem;
            if (this.k0 != null) {
                wsaVar.b3 = new pnc(this, tL_starGiftUnique, nftitem);
                wsaVar.c3 = new qnc(this, nftitem);
            }
            wsaVar.m2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(wsaVar);
            return;
        }
        Activity parentActivity = getParentActivity();
        ylb resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int i6 = cmb.Z6;
            int v0 = cmb.v0(i6, resourceProvider);
            int i7 = cmb.F6;
            cmb.v0(i7, resourceProvider);
            my0 my0Var = new my0(1, resourceProvider, (Context) parentActivity, false);
            my0Var.b0 = i6;
            my0Var.s0(v0);
            my0Var.K(v0);
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.setFillViewport(true);
            scrollView.setVerticalScrollBarEnabled(false);
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.setPadding(gm.L(12.0f), gm.L(28.0f), gm.L(12.0f), gm.L(12.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            bf0 bf0Var = new bf0(parentActivity);
            bf0Var.setRoundRadius(gm.L(12.0f));
            bf0Var.setContentDescription(nftitem.name);
            Drawable mutate = parentActivity.getResources().getDrawable(2131232854).mutate();
            int i8 = cmb.y6;
            anb.x(bf0Var, mutate, i8, resourceProvider, PorterDuff.Mode.SRC_IN);
            gn5 c = hm2.c(nftitem, false);
            if (c != null) {
                bf0Var.m(c, "120_120", mutate, nftitem);
            } else {
                bf0Var.setImageDrawable(mutate);
            }
            linearLayout.addView(bf0Var, qoe.r(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            if (TextUtils.isEmpty(nftitem.name)) {
                str = jb6.M0(2131742859, null);
            } else {
                str = nftitem.name;
            }
            textView.setText(str);
            td4.x(textView, i7, resourceProvider, 1, 17.0f);
            int i9 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, qoe.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            anb.X(textView2, i8, resourceProvider);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            if (TextUtils.isEmpty(nftitem.description)) {
                i = 8;
            } else {
                i = 0;
            }
            textView2.setVisibility(i);
            linearLayout.addView(textView2, qoe.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, qoe.k(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
            int i10 = 0;
            while (i10 < 2) {
                LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(i9);
                int L = gm.L(16.0f);
                int i11 = cmb.c6;
                int v02 = cmb.v0(i11, resourceProvider);
                int i12 = cmb.h6;
                int v03 = cmb.v0(i12, resourceProvider);
                fg0 i0 = cmb.i0(L, L, L, L, v02, v03, v03);
                wmb M = anb.M(i11);
                wmb M2 = anb.M(i12);
                linearLayout3.setBackground(i0);
                anb.j(linearLayout3, i0, M, M2, resourceProvider);
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                if (i10 == 0) {
                    i2 = 2131742644;
                } else {
                    i2 = 2131742686;
                }
                String M0 = jb6.M0(i2, null);
                linearLayout3.setContentDescription(M0);
                ImageView imageView = new ImageView(parentActivity);
                if (i10 == 0) {
                    i3 = 2131232867;
                } else {
                    i3 = 2131232858;
                }
                imageView.setImageResource(i3);
                imageView.setImportantForAccessibility(2);
                int i13 = cmb.F6;
                anb.s(imageView, i13, resourceProvider, PorterDuff.Mode.SRC_IN);
                linearLayout3.addView(imageView, qoe.o(24, 24));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText(M0);
                td4.x(textView3, i13, resourceProvider, 1, 12.0f);
                textView3.setGravity(17);
                linearLayout3.addView(textView3, qoe.k(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
                if (i10 == 0) {
                    i4 = 0;
                } else {
                    i4 = 4;
                }
                if (i10 == 0) {
                    i5 = 4;
                } else {
                    i5 = 0;
                }
                linearLayout2.addView(linearLayout3, qoe.m(1.0f, 0, -1, i4, i5, 0));
                i10++;
                i9 = 17;
            }
            ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                mhb mhbVar = new mhb(parentActivity, resourceProvider);
                int L2 = gm.L(10.0f);
                int i14 = cmb.c6;
                ShapeDrawable b0 = cmb.b0(L2, cmb.v0(i14, resourceProvider));
                wmb M3 = anb.M(i14);
                mhbVar.setBackground(b0);
                anb.j(mhbVar, b0, M3, null, resourceProvider);
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i15 = 0;
                while (i15 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i15);
                    i15++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    mhbVar.f(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(mhbVar, qoe.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            b61 b61Var = new b61(resourceProvider, parentActivity, true);
            b61Var.setRoundRadius(24);
            b61Var.setText(jb6.M0(2131742745, null));
            linearLayout.addView(b61Var, qoe.o(-1, 48));
            my0Var.O = scrollView;
            my0Var.T0 = false;
            linearLayout2.getChildAt(0).setOnClickListener(new fyb(my0Var, nftitem, (byte) 14));
            linearLayout2.getChildAt(1).setOnClickListener(new oha(parentActivity, (byte) 28));
            b61Var.setOnClickListener(new oha(my0Var, (byte) 29));
            my0Var.show();
            my0Var.K(v0);
            gm.o3(my0Var, v0, false, null);
        }
    }

    public final void O0() {
        if (getParentActivity() != null && this.Q0 == null && this.P0 != null) {
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.Q0 = zx8.k(this, this.P0, new pb((byte) 14), new smc(this, (byte) 3), new pmc(this, (byte) 7));
            }
        }
    }

    public final void P0(boolean z) {
        float f;
        boolean z2;
        this.g0 = z;
        if (!z) {
            this.f0 = 0;
        }
        if (this.s0 != null && this.i0 != null) {
            if (!z) {
                this.j0.b(false);
                this.s0.setPosition(0);
            }
            g1();
            ValueAnimator valueAnimator = this.n0;
            if (valueAnimator != null) {
                this.n0 = null;
                valueAnimator.cancel();
            }
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (this.o0.isAttachedToWindow() && this.o0.isLaidOut()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                this.s0.m(false);
            }
            if (z2 && this.m0 != f) {
                this.i0.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m0, f);
                this.n0 = ofFloat;
                ofFloat.setDuration(250L);
                this.n0.setInterpolator(d53.h);
                this.n0.addUpdateListener(new rmc(this, (byte) 0));
                this.n0.addListener(new t7(this, f, (byte) 8));
                this.n0.start();
            } else {
                Q0(f);
                this.s0.m(false);
            }
            if (this.a != null && this.r0 != R0()) {
                c1(false);
            }
        }
    }

    public final void Q0(float f) {
        this.m0 = f;
        this.i0.setAlpha(f);
        f1();
        int round = Math.round(gm.L(46.0f) * f);
        if (this.p0 != round) {
            this.p0 = round;
            e1(0);
            e1(1);
        }
    }

    public final boolean R0() {
        b bVar;
        if (!this.g0 && (bVar = this.G0) != null && bVar.c.isEmpty()) {
            b bVar2 = this.G0;
            if (!bVar2.k && bVar2.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void S0(long j) {
        if (this.a != null) {
            brc brcVar = this.j0;
            if (brcVar != null) {
                brcVar.a();
            }
            if (this.M0 <= 0.0f && u0()) {
                int top = this.a.f3.m(this.h).getTop() - this.a.getPaddingTop();
                this.a.D0();
                if (top < 0) {
                    this.a.x0(0, top, d53.h);
                    return;
                }
                return;
            }
            this.a.D0();
            i0(true);
            pmc pmcVar = this.O0;
            gm.r(pmcVar);
            if (j > 0) {
                gm.d3(pmcVar, j + 260);
            }
        }
    }

    public final void T0() {
        this.I0 = false;
        brc brcVar = this.j0;
        if (brcVar != null) {
            brcVar.b(false);
        }
        this.f0 = 0;
        hs1 hs1Var = this.s0;
        if (hs1Var != null) {
            hs1Var.setPosition(0);
        }
    }

    public final void U0() {
        this.s = false;
        va vaVar = this.a;
        if (vaVar != null) {
            vaVar.E2.b.remove(this.x);
            this.a.removeCallbacks(this.w);
        }
        unc uncVar = this.e;
        if (uncVar != null) {
            uncVar.setAdditionalTilt(0.0f);
        }
    }

    public final void W0() {
        boolean z;
        c C = c.C(this.currentAccount);
        h1();
        b61 b61Var = this.F0;
        if (C.M() && C.e()) {
            z = true;
        } else {
            z = false;
        }
        b61Var.setEnabled(z);
        if (!C.M()) {
            this.w0.setText(I0(0));
            this.x0.setText(I0(1));
            return;
        }
        long z2 = C.z();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.U0 == null) {
            this.U0 = new SpannableString("G");
            unc uncVar = this.e;
            uncVar.getClass();
            qoc qocVar = new qoc(uncVar);
            this.y0 = qocVar;
            SpannableString spannableString = this.U0;
            spannableString.setSpan(qocVar, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.U0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) soc.e(z2));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) jb6.M0(2131749290, null));
        xnc xncVar = this.z0;
        xnc xncVar2 = xncVar;
        if (xncVar == null) {
            ?? characterStyle = new CharacterStyle();
            characterStyle.a = -9577217;
            this.z0 = characterStyle;
            xncVar2 = characterStyle;
        }
        spannableStringBuilder.setSpan(xncVar2, length, spannableStringBuilder.length(), 33);
        this.w0.setText(spannableStringBuilder);
        CharSequence q = c.C(this.currentAccount).q(z2, false);
        boolean isEmpty = TextUtils.isEmpty(q);
        io ioVar = this.x0;
        if (isEmpty) {
            ioVar.setText(I0(1));
        } else {
            ioVar.setText(q);
        }
        Z0(this.A0);
        t25 t25Var = this.H0;
        if (t25Var != null && !t25Var.h && !t25Var.i && t25Var.m == null) {
            t25Var.e();
        }
        String x = C.x();
        if (!TextUtils.isEmpty(x)) {
            this.e.setCardNumber(n0(x.toUpperCase()));
        }
    }

    public final void X0() {
        float[] fArr;
        float[] fArr2;
        float f;
        Rect rect = this.H;
        if (!rect.isEmpty() && this.E.isAttachedToWindow()) {
            unc uncVar = this.e;
            qw9 qw9Var = this.F;
            Matrix matrix = this.I;
            if (uncVar.g(qw9Var, matrix)) {
                float width = rect.width();
                float height = rect.height();
                int i = 0;
                while (true) {
                    fArr = this.L;
                    fArr2 = this.M;
                    float f2 = 0.0f;
                    if (i >= 4) {
                        break;
                    }
                    if (i != 1 && i != 2) {
                        f = 0.0f;
                    } else {
                        f = width;
                    }
                    if (i >= 2) {
                        f2 = height;
                    }
                    int i2 = i << 1;
                    fArr[i2] = f;
                    int i3 = i2 + 1;
                    fArr[i3] = f2;
                    fArr2[i2] = rect.left + f;
                    fArr2[i3] = rect.top + f2;
                    i++;
                }
                matrix.mapPoints(fArr2);
                qw9 qw9Var2 = this.F;
                int[] iArr = this.P;
                qw9Var2.getLocationInWindow(iArr);
                View view = this.E;
                int[] iArr2 = this.O;
                view.getLocationInWindow(iArr2);
                this.e.i(this.A0, this.y.getWidth() / 0.7826087f);
                float f3 = iArr2[0] - iArr[0];
                float v = aq1.v(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
                for (int i4 = 0; i4 < 4; i4++) {
                    int i5 = i4 << 1;
                    float R1 = gm.R1(fArr2[i5], (fArr[i5] * 0.7826087f) + f3, this.A0);
                    float[] fArr3 = this.N;
                    fArr3[i5] = R1;
                    int i6 = i5 + 1;
                    fArr3[i6] = gm.R1(fArr2[i6], (fArr[i6] * 0.7826087f) + v, this.A0);
                }
                Matrix matrix2 = this.K;
                boolean polyToPoly = matrix2.setPolyToPoly(this.L, 0, this.N, 0, 4);
                Matrix matrix3 = this.J;
                if (polyToPoly && !matrix3.equals(matrix2)) {
                    matrix3.set(matrix2);
                    this.F.invalidate();
                }
                unc uncVar2 = this.e;
                Matrix matrix4 = uncVar2.c;
                Matrix matrix5 = uncVar2.e;
                Matrix matrix6 = uncVar2.d;
                if (matrix.invert(matrix6)) {
                    matrix5.setConcat(matrix6, matrix3);
                    if (!uncVar2.n || !matrix4.equals(matrix5)) {
                        matrix4.set(matrix5);
                        uncVar2.n = true;
                        uncVar2.O.invalidate();
                    }
                }
                float R12 = gm.R1(1.0f, 1.0952381f, this.A0);
                this.x0.setPivotX(0.0f);
                this.x0.setPivotY(0.0f);
                this.x0.setScaleX(R12);
                this.x0.setScaleY(R12);
            }
        }
    }

    public final void Y0() {
        qw9 qw9Var;
        float i;
        boolean z;
        float f;
        unc uncVar;
        int i2;
        ?? r16;
        boolean z2;
        LinearLayout linearLayout;
        boolean z3;
        float min;
        float f2;
        float height;
        unc uncVar2;
        if (this.a != null && this.e != null && this.v0 != null && this.E != null && (qw9Var = this.F) != null && this.simpleActionBar != null) {
            qw9Var.bringToFront();
            View m = this.a.f3.m(this.h);
            va vaVar = this.a;
            if (m == null) {
                if (vaVar.f3.K0() > this.h) {
                    i = 1.0f;
                } else {
                    i = 0.0f;
                }
            } else {
                i = Utilities.i((vaVar.getPaddingTop() - m.getTop()) / m.getHeight(), 1.0f, 0.0f);
            }
            this.B0 = i;
            int i3 = (this.M0 > 0.0f ? 1 : (this.M0 == 0.0f ? 0 : -1));
            if (i3 <= 0 && this.L0 <= 0.0f) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (i3 > 0) {
                    i = 0.0f;
                } else {
                    i = (1.0f - this.L0) * i;
                }
            }
            this.A0 = i;
            b1();
            if (m != null) {
                f = Math.max(0.0f, (m.getHeight() / 2.0f) + gm.L(24.0f)) * this.A0;
            } else {
                f = 0.0f;
            }
            float R1 = gm.R1(1.0f, 0.8f, this.A0);
            this.e.setPivotX(uncVar.getWidth() * 0.5f);
            this.e.setPivotY(0.0f);
            this.e.setScaleX(R1);
            this.e.setScaleY(R1);
            this.e.setAlpha(1.0f - Utilities.l(gm.x1(i, 0.75f, 1.0f)));
            unc uncVar3 = this.e;
            if (!z && (m == null || i >= 1.0f || m.getBottom() <= this.a.getPaddingTop() || m.getTop() >= this.a.getHeight() - this.a.getPaddingBottom())) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            uncVar3.setVisibility(i2);
            int[] iArr = this.R;
            int[] iArr2 = this.Q;
            if (m != null) {
                this.a.getLocationInWindow(iArr2);
                this.n.getLocationInWindow(iArr);
                r16 = 1;
                this.e.setTranslationX(((this.f.getWidth() - this.e.getWidth()) / 2.0f) + this.f.getX() + m.getX() + (iArr2[0] - iArr[0]));
                this.e.setTranslationY(this.f.getY() + m.getY() + (iArr2[1] - iArr[1]) + f);
            } else {
                r16 = 1;
            }
            if (z) {
                if (this.M0 == 0.0f) {
                    z3 = r16;
                } else {
                    z3 = false;
                }
                float f3 = this.L0;
                if (z3) {
                    min = 0.3f * f3;
                    f2 = 0.6f;
                } else {
                    min = Math.min(1.0f, 1.8f * f3) * 0.06f;
                    f2 = 0.84f;
                }
                float f4 = min + f2;
                this.simpleActionBar.getLocationInWindow(iArr2);
                this.n.getLocationInWindow(iArr);
                float L = gm.L(4.0f) + this.simpleActionBar.getHeight() + (iArr2[r16] - iArr[r16]);
                float f5 = 1.0f - f3;
                if (z3) {
                    height = 0.0f;
                } else {
                    height = this.e.getHeight() * 0.35f;
                }
                float f6 = L - (f5 * height);
                if (z3) {
                    f6 = kt6.d(0.9f - f4, this.e.getHeight(), 2.0f, f6);
                }
                float width = (this.n.getWidth() - this.e.getWidth()) / 2.0f;
                if (!z3) {
                    f3 = Math.min(1.0f, f3 * 2.0f);
                }
                if (m != null) {
                    this.a.getLocationInWindow(iArr2);
                    float width2 = ((this.f.getWidth() - this.e.getWidth()) / 2.0f) + this.f.getX() + m.getX() + (iArr2[0] - iArr[0]);
                    float y = this.f.getY() + m.getY() + (iArr2[r16] - iArr[r16]);
                    float l = Utilities.l(1.0f - ((f6 - y) / (this.e.getHeight() * 0.5f)));
                    if (l >= 1.0f) {
                        gm.r(this.O0);
                        ValueAnimator valueAnimator = this.N0;
                        if (valueAnimator != null) {
                            this.N0 = null;
                            valueAnimator.cancel();
                        }
                        this.L0 = 0.0f;
                        this.M0 = 0.0f;
                        Y0();
                        return;
                    }
                    width = gm.R1(width, width2, l);
                    f6 = gm.R1(f6, y, l);
                    f4 = gm.R1(f4, 1.0f, l);
                    f3 = gm.R1(f3, 1.0f, l);
                }
                this.e.setPivotX(uncVar2.getWidth() * 0.5f);
                this.e.setPivotY(0.0f);
                this.e.setScaleX(f4);
                this.e.setScaleY(f4);
                this.e.setTranslationX(width);
                this.e.setTranslationY(f6);
                this.e.setAlpha(f3);
            }
            if (i > 0.0f) {
                z2 = r16;
            } else {
                z2 = false;
            }
            if (this.G != z2 && (linearLayout = this.v0) != null) {
                Rect rect = this.H;
                if (z2) {
                    if (linearLayout.getWidth() != 0 && this.v0.getHeight() != 0) {
                        rect.set(this.v0.getLeft(), this.v0.getTop(), this.v0.getRight(), this.v0.getBottom());
                    }
                }
                this.e.setOnFrontContentPresented(null);
                gm.B2(this.v0);
                this.G = z2;
                if (z2) {
                    this.F.addView(this.v0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                    this.v0.layout(0, 0, rect.width(), rect.height());
                    X0();
                } else {
                    unc uncVar4 = this.e;
                    uncVar4.i(0.0f, 0.0f);
                    LinearLayout linearLayout2 = uncVar4.N;
                    gm.B2(linearLayout2);
                    linearLayout2.setScaleX(1.0f);
                    linearLayout2.setScaleY(1.0f);
                    linearLayout2.setRotationX(0.0f);
                    linearLayout2.setRotationY(0.0f);
                    linearLayout2.setTranslationX(0.0f);
                    linearLayout2.setTranslationY(0.0f);
                    poc pocVar = uncVar4.P;
                    pocVar.setScaleX(1.0f);
                    pocVar.setScaleY(1.0f);
                    uncVar4.F.addView(linearLayout2, uncVar4.Q);
                    this.v0.layout(rect.left, rect.top, rect.right, rect.bottom);
                    this.e.getClass();
                    X0();
                }
                this.F.invalidate();
            }
            Z0(i);
            if (this.G) {
                X0();
            }
            float f7 = 1.0f - i;
            this.simpleActionBar.setTitlesAlpha(f7);
            if (this.simpleActionBar.getTitleTextView() != null) {
                this.simpleActionBar.getTitleTextView().setTranslationY((1.0f - f7) * (-gm.L(8.0f)));
            }
        }
    }

    @Override
    public final void Z(ArrayList arrayList, l7c l7cVar) {
        c C = c.C(this.currentAccount);
        h1();
        arrayList.add(c6c.m(this.S));
        this.h = arrayList.size();
        snc sncVar = this.f;
        c6c c6cVar = new c6c(-4);
        c6cVar.c = sncVar;
        c6cVar.A = -1;
        c6cVar.e = true;
        arrayList.add(c6cVar);
        arrayList.add(c6c.m(this.C0));
        boolean R0 = R0();
        this.r0 = R0;
        if (R0) {
            String M0 = jb6.M0(2131742682, null);
            String M02 = jb6.M0(2131742681, null);
            int i = ync.b;
            c6c K = c6c.K(ync.class);
            K.k = 2131232848;
            K.m = M0;
            K.n = M02;
            arrayList.add(K);
            String M03 = jb6.M0(2131742750, null);
            String M04 = jb6.M0(2131742749, null);
            c6c K2 = c6c.K(ync.class);
            K2.k = 2131232846;
            K2.m = M03;
            K2.n = M04;
            arrayList.add(K2);
            String M05 = jb6.M0(2131742865, null);
            String M06 = jb6.M0(2131742864, null);
            c6c K3 = c6c.K(ync.class);
            K3.k = 2131232850;
            K3.m = M05;
            K3.n = M06;
            arrayList.add(K3);
            arrayList.add(c6c.m(this.b0));
        } else if (this.o0 != null) {
            if (this.V0 && !this.W0 && C.z() > 500000000) {
                arrayList.add(c6c.k(this.d0));
            }
            enc encVar = this.o0;
            c6c c6cVar2 = new c6c(-3);
            c6cVar2.c = encVar;
            c6cVar2.A = 0;
            c6cVar2.z = 1;
            arrayList.add(c6cVar2);
        }
        l66 l66Var = this.a0;
        if (l66Var != null) {
            this.c0 = false;
            l66Var.animate().cancel();
            this.a0.setAlpha(0.0f);
            this.a0.setVisibility(4);
        }
    }

    public final void Z0(float f) {
        int themedColor = getThemedColor(cmb.F6);
        this.w0.setTextColor(gm.b2(f, -1, themedColor));
        io ioVar = this.x0;
        float[] fArr = this.e.b0;
        int i = -7868417;
        if (fArr != null) {
            i = on2.f(fArr[8], bqc.p(-7868417, 0, fArr), bqc.p(-7868417, 3, fArr));
        }
        ioVar.setTextColor(gm.b2(f, i, on2.p(themedColor, 143)));
        qoc qocVar = this.y0;
        if (qocVar != null) {
            qocVar.y = gm.b2(f, -1, getThemedColor(cmb.Ei));
        }
        xnc xncVar = this.z0;
        if (xncVar != null) {
            float[] fArr2 = this.e.b0;
            int i2 = -9577217;
            if (fArr2 != null) {
                i2 = on2.f(fArr2[8], bqc.p(-9577217, 0, fArr2), bqc.p(-9577217, 3, fArr2));
            }
            xncVar.a = on2.p(i2, Math.round((1.0f - f) * 255.0f));
        }
        this.w0.invalidate();
    }

    @Override
    public final CharSequence a0() {
        return jb6.M0(2131742666, null);
    }

    public final void a1(float[] fArr) {
        boolean z;
        float f;
        int n;
        if (this.E0 != null && this.F0 != null) {
            float f2 = bqc.j(getThemedColor(cmb.Z6))[0];
            if (f2 < 0.6f) {
                z = true;
            } else {
                z = false;
            }
            int themedColor = getThemedColor(cmb.Ei);
            float f3 = 0.0f;
            if (fArr != null && fArr.length >= 18) {
                int[] iArr = new int[2];
                for (int i = 0; i < 2; i++) {
                    int i2 = i << 2;
                    float f4 = fArr[i2 + 10];
                    if (f4 < 0.0f) {
                        n = themedColor;
                    } else {
                        n = bqc.n(themedColor, (int) f4, (int) fArr[i2 + 11]);
                    }
                    iArr[i] = n;
                }
                themedColor = on2.f(fArr[8], iArr[0], iArr[1]);
            }
            if (z) {
                f3 = f2 + 0.25f;
                f = 1.0f;
            } else {
                f = f2 - 0.2f;
            }
            float[] j = bqc.j(themedColor);
            float f5 = j[0];
            int i3 = -16777216;
            if (f5 < f3 || f5 > f) {
                themedColor = (themedColor & (-16777216)) | (bqc.l(Math.max(f3, Math.min(f, f5)), j[1], j[2]) & 16777215);
            }
            if (themedColor != this.R0) {
                this.R0 = themedColor;
                if (on2.h(themedColor) <= 0.550000011920929d) {
                    i3 = getThemedColor(cmb.Ii);
                }
                b61[] b61VarArr = {this.E0, this.F0};
                for (int i4 = 0; i4 < 2; i4++) {
                    b61 b61Var = b61VarArr[i4];
                    b61Var.setColor(themedColor);
                    b61Var.setTextColor(i3);
                }
            }
        }
    }

    @Override
    public final void b0(c6c c6cVar, View view) {
        t25 t25Var;
        Object obj = c6cVar.H;
        if (obj instanceof TL_wallet.nftItem) {
            K0((TL_wallet.nftItem) obj);
        } else if (c6cVar.d == -10001 && (t25Var = this.H0) != null) {
            t25Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            J0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) c6cVar.H, null, null, null, null, getResourceProvider());
        }
    }

    public final void b1() {
        va vaVar = this.a;
        if (vaVar != null && this.e != null) {
            float b = vaVar.E2.b(1);
            float min = Math.min(10.0f, this.a.E2.b(3) * 40.0f) + (-Math.min(10.0f, b * 40.0f));
            this.e.setAdditionalTilt(Math.max(0.0f, (this.A0 * 10.0f) + ((((float) Math.sqrt(Utilities.l(this.A0))) * 90.0f) - 10.0f)) + min);
            this.e.setUseGyroscope(1.0f - ((float) Math.pow(this.A0, 0.33000001311302185d)));
        }
    }

    @Override
    public final boolean c0(c6c c6cVar, View view) {
        mqc mqcVar;
        if ((view instanceof aqc) && (mqcVar = this.k0) != null) {
            mqcVar.S((aqc) view);
            return true;
        }
        return false;
    }

    public final void c1(boolean z) {
        boolean R0 = R0();
        va vaVar = this.a;
        q7c[] q7cVarArr = this.u0;
        if (vaVar != null && this.r0 != R0) {
            this.r0 = R0;
            vaVar.D0();
            for (q7c q7cVar : q7cVarArr) {
                if (q7cVar != null) {
                    q7cVar.D0();
                }
            }
            this.a.g3.O(false);
            this.a.f3.g1(0, 0);
            this.a.post(new pmc(this, (byte) 6));
        }
        if (!R0) {
            for (q7c q7cVar2 : q7cVarArr) {
                if (q7cVar2 != null) {
                    d1(q7cVar2, z);
                }
            }
            enc encVar = this.o0;
            if (encVar != null) {
                encVar.post(new pmc(this, (byte) 2));
                this.o0.post(new pmc(this, (byte) 3));
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        mqc mqcVar = this.k0;
        if ((mqcVar == null || !mqcVar.q0) && super.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        boolean z;
        int childCount;
        ValueAnimator valueAnimator = this.n0;
        if (valueAnimator != null) {
            this.n0 = null;
            valueAnimator.cancel();
        }
        U0();
        coc cocVar = this.t0;
        if (cocVar != null) {
            cocVar.b(null);
        }
        this.f = null;
        this.T = null;
        this.S = null;
        this.o0 = null;
        this.s0 = null;
        q7c[] q7cVarArr = this.u0;
        q7cVarArr[0] = null;
        q7cVarArr[1] = null;
        t25 t25Var = this.H0;
        if (t25Var != null && !t25Var.a.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        this.g0 = z;
        if (!z) {
            this.f0 = 0;
        } else if (this.I0) {
            this.f0 = 1;
        }
        mqc mqcVar = this.k0;
        if (mqcVar != null) {
            mqcVar.p();
        }
        this.k0 = null;
        View createView = super.createView(context);
        nc6 nc6Var = new nc6(this, context);
        nc6Var.addView(createView, qoe.c(-1.0f, -1));
        this.fragmentView = nc6Var;
        anb.h(cmb.Z6, getResourceProvider(), nc6Var);
        this.simpleActionBar.setClipChildren(false);
        this.simpleActionBar.setClipToPadding(false);
        yja t = this.simpleActionBar.t();
        zja a = t.a(2, 2131232695);
        this.P0 = a;
        a.setOnClickListener(new View.OnClickListener(this) {
            public final goc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                goc gocVar = this.b;
                switch (b) {
                    case 0:
                        gocVar.O0();
                        return;
                    case 1:
                        gocVar.presentFragment(new p5c(6, null));
                        return;
                    case 2:
                        gocVar.A0();
                        return;
                    case 3:
                        gocVar.B0();
                        return;
                    default:
                        gocVar.C0();
                        return;
                }
            }
        });
        zja a2 = t.a(1, 2131231248);
        a2.setOnClickListener(new jw4(this, context, a2, (byte) 25));
        enc encVar = new enc(this, context, (byte) 1);
        this.S = encVar;
        encVar.setClipToPadding(false);
        this.S.setClipChildren(false);
        this.S.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(4.0f));
        rnc rncVar = new rnc(this, context);
        this.T = rncVar;
        rncVar.setDefaultRadiusDp(22);
        this.T.setOnAnimatedHeightChangedListener(new pmc(this, (byte) 8));
        TextView textView = new TextView(context);
        this.V = textView;
        textView.setText(jb6.M0(2131742625, null));
        this.U = l0(this.V, new pmc(this, (byte) 10));
        TextView textView2 = new TextView(context);
        this.X = textView2;
        this.W = l0(textView2, new pmc(this, (byte) 11));
        TextView textView3 = new TextView(context);
        this.Z = textView3;
        this.Y = l0(textView3, new pmc(this, (byte) 12));
        this.S.addView(this.T, qoe.c(-2.0f, -1));
        l66 l66Var = new l66(context, null);
        this.a0 = l66Var;
        this.c0 = false;
        l66Var.setAlpha(0.0f);
        l66 l66Var2 = this.a0;
        int i = cmb.y6;
        anb.X(l66Var2, i, this.resourceProvider);
        this.a0.setTextSize(1, 13.0f);
        this.a0.setGravity(17);
        this.a0.setText(V0(jb6.M0(2131742669, null), cmb.Wc, this.resourceProvider, new dh1(context, (byte) 26)));
        this.a0.setVisibility(4);
        if (((FrameLayout) createView) != null) {
            ((FrameLayout) createView).addView(this.a0, qoe.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        }
        snc sncVar = new snc(this, context, (byte) 0);
        this.b0 = sncVar;
        sncVar.setImportantForAccessibility(2);
        this.d0 = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e0 = frameLayout;
        int i2 = cmb.c6;
        int themedColor = getThemedColor(i2);
        int themedColor2 = getThemedColor(i2);
        int i3 = cmb.h6;
        fg0 Z = cmb.Z(themedColor, cmb.v(themedColor2, getThemedColor(i3)), 16, 16);
        wmb M = anb.M(i2);
        wmb p = anb.p(i2, i3);
        ylb resourceProvider = getResourceProvider();
        frameLayout.setBackground(Z);
        anb.j(frameLayout, Z, M, p, resourceProvider);
        this.d0.addView(this.e0, qoe.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float N = gm.N(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{N, N, N, N, N, N, N, N}, null, null));
        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232855);
        this.e0.addView(imageView, qoe.d(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        anb.X(textView4, cmb.p7, this.resourceProvider);
        ts2.q(16.0f, 1, 2131742707, textView4, null);
        this.e0.addView(textView4, qoe.d(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        this.e0.setOnClickListener(new View.OnClickListener(this) {
            public final goc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                goc gocVar = this.b;
                switch (b) {
                    case 0:
                        gocVar.O0();
                        return;
                    case 1:
                        gocVar.presentFragment(new p5c(6, null));
                        return;
                    case 2:
                        gocVar.A0();
                        return;
                    case 3:
                        gocVar.B0();
                        return;
                    default:
                        gocVar.C0();
                        return;
                }
            }
        });
        rve.b(this.e0, 0.02f, 1.2f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.y.setClipToPadding(false);
        this.simpleActionBar.addView(this.y, qoe.d(-1, 56.0f, 3, 64.0f, 0.0f, 96.0f, 0.0f));
        View view = new View(context);
        this.E = view;
        this.y.addView(view, qoe.e(1, 1, 19));
        this.G = false;
        this.H.setEmpty();
        this.J.reset();
        qw9 qw9Var = new qw9(this, context);
        this.F = qw9Var;
        qw9Var.setClipChildren(false);
        this.F.setClipToPadding(false);
        unc uncVar = new unc(this, context);
        this.e = uncVar;
        uncVar.setDiamondOnCard(true);
        this.e.setCardOnClickListener(new View.OnClickListener(this) {
            public final goc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                goc gocVar = this.b;
                switch (b) {
                    case 0:
                        gocVar.O0();
                        return;
                    case 1:
                        gocVar.presentFragment(new p5c(6, null));
                        return;
                    case 2:
                        gocVar.A0();
                        return;
                    case 3:
                        gocVar.B0();
                        return;
                    default:
                        gocVar.C0();
                        return;
                }
            }
        });
        this.a.E2.b.add(this.x);
        snc sncVar2 = new snc(this, context, (byte) 1);
        this.f = sncVar2;
        sncVar2.setImportantForAccessibility(2);
        vnc vncVar = new vnc(this, context);
        this.n = vncVar;
        vncVar.setClipChildren(false);
        this.n.setClipToPadding(false);
        this.n.addView(this.e, qoe.c(-2.0f, -1));
        nc6Var.addView(this.n, qoe.c(-1.0f, -1));
        this.a.setClipChildren(false);
        this.a.setClipToPadding(false);
        this.v0 = this.e.getBalanceLayout();
        this.w0 = this.e.getBalanceView();
        this.x0 = this.e.getUsdBalanceView();
        this.e.setCardHolder(m9c.r(getUserConfig().f()).toUpperCase());
        this.D0 = 0.0f;
        qmb qmbVar = new qmb((byte) 24, context, this);
        this.C0 = qmbVar;
        qmbVar.setOrientation(0);
        this.C0.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(12.0f));
        b61 b61Var = new b61(this.resourceProvider, context, true);
        b61Var.setRoundRadius(24);
        this.E0 = b61Var;
        b61Var.setText(jb6.M0(2131742887, null));
        this.C0.addView(this.E0, qoe.m(1.0f, 0, 48, 0, 4, 0));
        this.E0.setOnClickListener(new View.OnClickListener(this) {
            public final goc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                goc gocVar = this.b;
                switch (b) {
                    case 0:
                        gocVar.O0();
                        return;
                    case 1:
                        gocVar.presentFragment(new p5c(6, null));
                        return;
                    case 2:
                        gocVar.A0();
                        return;
                    case 3:
                        gocVar.B0();
                        return;
                    default:
                        gocVar.C0();
                        return;
                }
            }
        });
        b61 b61Var2 = new b61(this.resourceProvider, context, true);
        b61Var2.setRoundRadius(24);
        this.F0 = b61Var2;
        b61Var2.setText(jb6.M0(2131742685, null));
        this.F0.setEnabled(c.C(this.currentAccount).e());
        this.F0.setOnClickListener(new View.OnClickListener(this) {
            public final goc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                goc gocVar = this.b;
                switch (b) {
                    case 0:
                        gocVar.O0();
                        return;
                    case 1:
                        gocVar.presentFragment(new p5c(6, null));
                        return;
                    case 2:
                        gocVar.A0();
                        return;
                    case 3:
                        gocVar.B0();
                        return;
                    default:
                        gocVar.C0();
                        return;
                }
            }
        });
        this.C0.addView(this.F0, qoe.m(1.0f, 0, 48, 4, 0, 0));
        a1(this.e.getStickerStyle());
        this.G0 = c.C(this.currentAccount).G();
        this.a.setDescendantFocusability(131072);
        mqc mqcVar2 = new mqc(this, this.e, new xab(this, nc6Var, (byte) 6), null);
        this.k0 = mqcVar2;
        nc6Var.addView(mqcVar2, qoe.c(-1.0f, -1));
        this.l0 = "";
        this.o0 = new enc(this, context, (byte) 0);
        hs1 hs1Var = new hs1(this, context, this.resourceProvider, (byte) 9);
        this.s0 = hs1Var;
        hs1Var.setAllowDisallowInterceptTouch(false);
        this.s0.setAdapter(new bo0((byte) 10, context, this));
        this.glassEngine.c(this.s0);
        vgc l = this.s0.l(-2, true);
        this.h0 = l;
        l.h(i, cmb.F6, i, i3, i2);
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        nm0 l2 = qqd.l(this.resourceProvider);
        vgc vgcVar = this.h0;
        im0 c = baseSimpleGlass.c.c(vgcVar, null, false);
        c.p(l2);
        c.r(gm.L(20.0f));
        vgcVar.setBlurredBackground(c);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.i0 = frameLayout3;
        frameLayout3.setTranslationZ(gm.L(20.0f));
        this.i0.setClipChildren(false);
        this.i0.setClipToPadding(false);
        brc brcVar = new brc(context, this.h0, this.resourceProvider, new smc(this, (byte) 0), new smc(this, (byte) 1), new smc(this, (byte) 2));
        this.j0 = brcVar;
        brcVar.setClipChildren(false);
        brc brcVar2 = this.j0;
        im0 c2 = baseSimpleGlass.c.c(brcVar2, null, false);
        c2.p(l2);
        c2.r(gm.L(20.0f));
        brcVar2.y = c2;
        brcVar2.invalidate();
        this.i0.addView(this.j0, qoe.d(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.s0.setPosition(this.f0);
        g1();
        this.o0.addView(this.s0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        FrameLayout frameLayout4 = this.i0;
        mqc mqcVar3 = this.k0;
        if (mqcVar3 != null) {
            childCount = viewGroup.indexOfChild(mqcVar3);
        } else {
            childCount = viewGroup.getChildCount();
        }
        viewGroup.addView(frameLayout4, childCount, qoe.e(-1, 40, 48));
        P0(this.g0);
        t25 t25Var2 = this.H0;
        if (t25Var2 != null) {
            this.k0.Y(t25Var2);
        }
        this.a.j(new k2b(this, (byte) 10));
        l7c l7cVar = this.a.g3;
        l7cVar.r = false;
        l7cVar.O(false);
        coc cocVar2 = new coc(this);
        this.t0 = cocVar2;
        cocVar2.b(this.a);
        W0();
        this.G0.h();
        this.simpleActionBar.post(new pmc(this, (byte) 5));
        this.a.post(new pmc(this, (byte) 6));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        va vaVar;
        l7c l7cVar;
        if (i2 == this.currentAccount) {
            if (i == nm7.e4 && this.w0 != null) {
                W0();
                Iterator it = this.T0.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            } else if (i == nm7.A3) {
                h1();
            } else if (i == nm7.q0) {
                if (objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof TL_account.Password) {
                        this.V0 = true;
                        this.W0 = ((TL_account.Password) obj).has_password;
                        va vaVar2 = this.a;
                        if (vaVar2 != null && (l7cVar = vaVar2.g3) != null) {
                            l7cVar.O(true);
                            return;
                        }
                        return;
                    }
                }
                getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new kc((byte) 0), new o6b(this, (byte) 10));
            } else if (i == nm7.f4 && objArr.length > 0) {
                Object obj2 = objArr[0];
                b bVar = this.G0;
                if (obj2 == bVar && (vaVar = this.a) != null && vaVar.g3 != null) {
                    if (bVar.b.isEmpty()) {
                        b bVar2 = this.G0;
                        if (!bVar2.h) {
                            bVar2.h();
                        }
                    }
                    c1(true);
                }
            }
        }
    }

    public final void e1(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        q7c q7cVar = this.u0[i];
        if (q7cVar != null) {
            va vaVar = this.a;
            if (vaVar != null) {
                i2 = vaVar.getPaddingTop();
            } else {
                i2 = 0;
            }
            int i6 = i2 + this.p0;
            if (i == 1) {
                i3 = gm.L(4.0f);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            va vaVar2 = this.a;
            if (vaVar2 != null) {
                i4 = vaVar2.getPaddingBottom();
            } else {
                i4 = 0;
            }
            if (i == 1) {
                i5 = gm.L(12.0f);
            } else {
                i5 = 0;
            }
            int i8 = i4 + i5;
            if (q7cVar.getPaddingTop() != i7 || q7cVar.getPaddingBottom() != i8) {
                boolean canScrollVertically = q7cVar.canScrollVertically(-1);
                if (i == 1) {
                    q7cVar.setPadding(gm.L(9.0f), i7, gm.L(9.0f), i8);
                } else {
                    q7cVar.setPadding(0, i7, 0, i8);
                }
                if (!canScrollVertically) {
                    q7cVar.f3.g1(0, 0);
                }
            }
        }
    }

    public final void f1() {
        View view;
        boolean z;
        int i;
        enc encVar;
        if (this.i0 != null) {
            boolean v0 = v0();
            if (this.q0 != v0 && (encVar = this.o0) != null) {
                this.q0 = v0;
                encVar.invalidate();
            }
            if (t0()) {
                view = (View) this.o0.getParent();
            } else {
                view = null;
            }
            int i2 = 0;
            if (view != null && (this.m0 > 0.0f || this.n0 != null)) {
                z = true;
            } else {
                z = false;
            }
            FrameLayout frameLayout = this.i0;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            frameLayout.setVisibility(i);
            View view2 = (View) this.a.getParent();
            rja rjaVar = this.simpleActionBar;
            if (rjaVar != null) {
                i2 = rjaVar.getHeight();
            }
            if (z) {
                float y = this.a.getY() + view2.getY();
                float y2 = view.getY() + y + gm.L(2.0f);
                this.i0.setTranslationY(y2);
                float paddingTop = y + this.a.getPaddingTop() + gm.L(2.0f);
                float L = (gm.L(46.0f) + paddingTop) - Math.max(0.0f, y2 - paddingTop);
                float f = this.m0;
                i2 = Math.max(i2, Math.round(((1.0f - f) * i2) + (L * f)));
            }
            m0(this.S);
            m0(this.C0);
            m0(this.d0);
            View view3 = this.K0;
            if (view3 != null && view3.getLayoutParams().height != i2) {
                this.K0.getLayoutParams().height = i2;
                this.K0.requestLayout();
            }
        }
    }

    public final void g1() {
        brc brcVar = this.j0;
        if (brcVar != null && this.s0 != null && brcVar.x != 0.0f) {
            brcVar.x = 0.0f;
            brcVar.c.setVisibility(8);
            brcVar.invalidate();
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void h1() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.T == null) {
            return;
        }
        c C = c.C(this.currentAccount);
        boolean z4 = false;
        if (this.T.isAttachedToWindow() && this.T.isLaidOut()) {
            z = true;
        } else {
            z = false;
        }
        rnc rncVar = this.T;
        FrameLayout frameLayout = this.U;
        Boolean bool = C.i;
        if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(C.j)) {
            z2 = true;
        } else {
            z2 = false;
        }
        rncVar.j(frameLayout, z2, z);
        long j = 0;
        if (!TextUtils.isEmpty(C.x())) {
            ArrayList arrayList = C.J;
            int size = arrayList.size();
            int i = 0;
            long j2 = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                x25 x25Var = (x25) obj;
                if (!x25Var.e) {
                    long j3 = x25Var.c;
                    if (j3 >= 0) {
                        j2 += j3;
                    }
                }
            }
            j = j2;
        }
        if (j > 500000000) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.X.setText(q0(2131742744, j));
        }
        this.T.j(this.W, z3, z);
        long j4 = jva.v(this.currentAccount, true).m().amount;
        if (j4 > 500000000) {
            z4 = true;
        }
        if (z4) {
            this.Z.setText(q0(2131742782, j4));
        }
        this.T.j(this.Y, z4, z);
    }

    public final void i0(boolean z) {
        float f;
        long j;
        d53 d53Var;
        gm.r(this.O0);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (this.M0 == f) {
            return;
        }
        this.M0 = f;
        ValueAnimator valueAnimator = this.N0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Y0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L0, f);
        this.N0 = ofFloat;
        if (z) {
            j = 260;
        } else {
            j = 120;
        }
        ofFloat.setDuration(j);
        ValueAnimator valueAnimator2 = this.N0;
        if (z) {
            d53Var = new d53(0.05d, 0.7d, 0.1d, 1.0d);
        } else {
            d53Var = new d53(0.4d, 0.0d, 0.2d, 1.0d);
        }
        valueAnimator2.setInterpolator(d53Var);
        this.N0.addUpdateListener(new rmc(this, (byte) 1));
        this.N0.addListener(new q7b(this, (byte) 28));
        this.N0.start();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        rja rjaVar;
        if (this.F != null && (rjaVar = this.simpleActionBar) != null && (rjaVar.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) this.simpleActionBar.getParent();
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (this.F.getParent() != this.simpleActionBar) {
                gm.B2(this.F);
                this.simpleActionBar.addView(this.F, qoe.c(56.0f, -1));
            }
            this.F.bringToFront();
            this.F.post(new pmc(this, (byte) 6));
        }
    }

    public final FrameLayout l0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(gm.L(16.0f), gm.L(14.0f), gm.L(16.0f), gm.L(14.0f));
        int i = cmb.h6;
        fg0 f0 = cmb.f0(getThemedColor(i), 2, -1);
        wmb M = anb.M(i);
        ylb resourceProvider = getResourceProvider();
        frameLayout.setBackground(f0);
        anb.j(frameLayout, f0, null, M, resourceProvider);
        anb.X(textView, cmb.F6, getResourceProvider());
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(19);
        frameLayout.addView(textView, qoe.d(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131230876);
        anb.s(imageView, cmb.y6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, qoe.e(-2, -2, 21));
        frameLayout.setOnClickListener(new xl3(runnable, (byte) 9));
        textView.setDuplicateParentStateEnabled(true);
        rve.b(textView, 0.02f, 1.2f);
        this.T.addView(frameLayout, qoe.o(-1, -2));
        return frameLayout;
    }

    public final void m0(ViewGroup viewGroup) {
        float f;
        if (viewGroup != null) {
            float f2 = 0.0f;
            ViewGroup viewGroup2 = viewGroup;
            while (true) {
                if (viewGroup2 == 0) {
                    break;
                } else if (viewGroup2 != this.a) {
                    f2 += viewGroup2.getY();
                    if (viewGroup2.getParent() instanceof View) {
                        viewGroup2 = (View) viewGroup2.getParent();
                    } else {
                        viewGroup2 = 0;
                    }
                } else if (viewGroup.getHeight() > 0) {
                    f = Utilities.l(((f2 + viewGroup.getHeight()) - this.a.getPaddingTop()) / viewGroup.getHeight());
                }
            }
            f = 1.0f;
            if (viewGroup.getAlpha() != f) {
                viewGroup.setAlpha(f);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        zx8 zx8Var = this.Q0;
        if (zx8Var != null) {
            if (z) {
                zx8Var.e();
            }
            return false;
        }
        brc brcVar = this.j0;
        if (brcVar != null && brcVar.E) {
            if (z) {
                brcVar.b(false);
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final void onBeginSlide() {
        coc cocVar = this.t0;
        if (cocVar != null) {
            cocVar.c();
        }
        va vaVar = this.a;
        if (vaVar != null) {
            vaVar.D0();
        }
        q7c r0 = r0();
        if (r0 != null) {
            r0.D0();
        }
        super.onBeginSlide();
    }

    @Override
    public final boolean onFragmentCreate() {
        Context context = a.b;
        if (ioc.k0.compareAndSet(false, true)) {
            ioc.l0.postRunnable(new dh1(context, (byte) 27));
        }
        getNotificationCenter().b(this, nm7.e4);
        getNotificationCenter().b(this, nm7.A3);
        getNotificationCenter().b(this, nm7.f4);
        getNotificationCenter().b(this, nm7.q0);
        c C = c.C(this.currentAccount);
        t25 A = C.A();
        this.H0 = A;
        pmc pmcVar = this.J0;
        ArrayList arrayList = A.d;
        if (!arrayList.contains(pmcVar)) {
            arrayList.add(pmcVar);
        }
        bm3 bm3Var = this.X0;
        if (bm3Var != null) {
            bm3Var.run();
        }
        int i = C.F;
        C.F = i + 1;
        HashSet hashSet = C.G;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i));
        if (isEmpty) {
            C.Z();
        }
        this.X0 = new bm3(C, i, (byte) 12);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new kc((byte) 0), new o6b(this, (byte) 10));
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        zx8 zx8Var = this.Q0;
        if (zx8Var != null) {
            zx8Var.g();
            gm.B2(this.Q0);
            this.Q0 = null;
        }
        gm.r(this.O0);
        ValueAnimator valueAnimator = this.N0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        mqc mqcVar = this.k0;
        if (mqcVar != null) {
            mqcVar.p();
        }
        unc uncVar = this.e;
        if (uncVar != null) {
            uncVar.setOnFrontContentPresented(null);
        }
        ValueAnimator valueAnimator2 = this.n0;
        if (valueAnimator2 != null) {
            this.n0 = null;
            valueAnimator2.cancel();
        }
        t25 t25Var = this.H0;
        if (t25Var != null) {
            t25Var.d.remove(this.J0);
        }
        U0();
        coc cocVar = this.t0;
        if (cocVar != null) {
            cocVar.b(null);
        }
        getNotificationCenter().n(this, nm7.e4);
        getNotificationCenter().n(this, nm7.A3);
        getNotificationCenter().n(this, nm7.f4);
        getNotificationCenter().n(this, nm7.q0);
        gm.B2(this.F);
        b bVar = this.G0;
        if (bVar != null) {
            bVar.a();
        }
        super.onFragmentDestroy();
        bm3 bm3Var = this.X0;
        if (bm3Var != null) {
            bm3Var.run();
            this.X0 = null;
        }
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        if (this.o0 != null) {
            e1(0);
            e1(1);
            this.o0.requestLayout();
        }
        l66 l66Var = this.a0;
        if (l66Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) l66Var.getLayoutParams();
            layoutParams.bottomMargin = gm.L(24.0f) + i4;
            this.a0.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        zx8 zx8Var = this.Q0;
        if (zx8Var != null) {
            zx8Var.g();
            gm.B2(this.Q0);
            this.Q0 = null;
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (i == 44 && getParentActivity() != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                O0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.U = gm.S2(jb6.M0(2131746236, null));
            alertDialog$Builder.j(jb6.M0(2131747033, null), new omc(this));
            alertDialog$Builder.g(jb6.M0(2131751709, null), null);
            int i2 = cmb.K5;
            alertDialog$Builder.l(2131624117, 72, cmb.w0(null, i2, false), null);
            alertDialog$Builder.m(i2, null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null) {
            rjaVar.post(new pmc(this, (byte) 5));
        }
        c.C(this.currentAccount).J();
        if (this.H0 != null && c.C(this.currentAccount).M()) {
            this.H0.d();
        }
        W0();
        if (this.a != null) {
            c1(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.w0 != null && this.x0 != null && this.e != null) {
                Z0(this.A0);
            }
            unc uncVar = this.e;
            if (uncVar != null && this.E0 != null && this.F0 != null) {
                a1(uncVar.getStickerStyle());
            }
            l66 l66Var = this.a0;
            if (l66Var != null) {
                l66Var.invalidate();
            }
            TextView textView = this.X;
            if (textView != null) {
                textView.invalidate();
            }
            TextView textView2 = this.Z;
            if (textView2 != null) {
                textView2.invalidate();
            }
            rnc rncVar = this.T;
            if (rncVar != null) {
                rncVar.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null && rjaVar.getParent() == view) {
            FrameLayout frameLayout = (FrameLayout) view;
            View view2 = new View(view.getContext());
            this.K0 = view2;
            view2.setOutlineProvider(null);
            this.K0.setTranslationZ(gm.L(20.0f));
            int indexOfChild = frameLayout.indexOfChild(this.simpleActionBar);
            FrameLayout frameLayout2 = this.i0;
            if (frameLayout2 != null && frameLayout2.getParent() == frameLayout) {
                indexOfChild = Math.min(indexOfChild, frameLayout.indexOfChild(this.i0));
            }
            frameLayout.addView(this.K0, indexOfChild, qoe.e(-1, 0, 48));
            this.K0.setBackground(getBaseSimpleGlass().a(this.K0));
            this.simpleActionBar.setBackground(null);
        }
        rja rjaVar2 = this.simpleActionBar;
        if (rjaVar2 != null) {
            rjaVar2.setOutlineProvider(null);
            this.simpleActionBar.setTranslationZ(gm.L(20.0f));
        }
        getBaseSimpleGlass().o = new ms0(this, (byte) 12);
    }

    public final CharSequence q0(int i, long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        pn2 pn2Var = new pn2(2131231960, 0);
        pn2Var.d = false;
        spannableStringBuilder.setSpan(pn2Var, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) c.s(j, false));
        spannableStringBuilder.setSpan(new do4(cmb.Ei, getResourceProvider()), length2, spannableStringBuilder.length(), 33);
        return jb6.V(null, null, i, spannableStringBuilder);
    }

    public final q7c r0() {
        View currentView;
        if (t0()) {
            hs1 hs1Var = this.s0;
            if (hs1Var == null) {
                currentView = null;
            } else {
                currentView = hs1Var.getCurrentView();
            }
            if (currentView instanceof q7c) {
                return (q7c) currentView;
            }
        }
        return null;
    }

    public final boolean t0() {
        enc encVar;
        if (!this.r0 && (encVar = this.o0) != null && encVar.isAttachedToWindow()) {
            ViewParent parent = this.o0.getParent();
            va vaVar = this.a;
            if (parent == vaVar.f3.m(vaVar.g3.E.size() - 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean u0() {
        View m;
        va vaVar = this.a;
        if (vaVar != null && (m = vaVar.f3.m(this.h)) != null && this.B0 < 0.5f && m.getBottom() > this.a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        enc encVar = this.o0;
        if (encVar != null && this.a != null && (encVar.getParent() instanceof View) && ((View) this.o0.getParent()).getTop() <= this.a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public final void y0(Context context, zja zjaVar, View view) {
        boolean z;
        c C = c.C(this.currentAccount);
        final bu5 J = bu5.J(this, view);
        J.b0(0.0f, -gm.L(48.0f));
        J.s = (short) 0;
        J.W(5);
        bu5 K = J.K();
        K.b(2131231244, jb6.M0(2131742875, null), new bo1(J, (byte) 0), false);
        K.j();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        hza hzaVar = new hza(this, linearLayout, C, J, (byte) 28);
        K.q(scrollView, qoe.o(-1, 350));
        J.b(2131232834, jb6.M0(2131742831, null), new gcc(hzaVar, J, K, (byte) 10), false);
        a8 z2 = J.z();
        l53 l53Var = C.h;
        String i = l53Var.i();
        boolean isEmpty = TextUtils.isEmpty(i);
        String str = i;
        if (isEmpty) {
            z2.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131748536, null));
            spannableStringBuilder.setSpan(new ta6(gm.L(75.0f), z2.b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        z2.setSubtext(str);
        if (l53Var.f() != null) {
            z = true;
        } else {
            z = false;
        }
        final hza hzaVar2 = new hza(C, new boolean[]{z}, z2, hzaVar, (byte) 29);
        this.T0.add(hzaVar2);
        hzaVar.run();
        J.b(2131232852, jb6.M0(2131747390, null), new Runnable(this) {
            public final goc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                bu5 bu5Var = J;
                goc gocVar = this.b;
                gocVar.getClass();
                switch (b) {
                    case 0:
                        bu5Var.u();
                        gocVar.presentFragment(PasscodeActivity.n0());
                        return;
                    case 1:
                        bu5Var.u();
                        gocVar.presentFragment(new vqc());
                        return;
                    case 2:
                        bu5Var.u();
                        gocVar.presentFragment(new n7c());
                        return;
                    default:
                        bu5Var.u();
                        goc.L0(gocVar.getParentActivity(), gocVar.getResourceProvider());
                        return;
                }
            }
        }, false);
        J.b(2131232845, jb6.M0(2131742762, null), new Runnable(this) {
            public final goc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                bu5 bu5Var = J;
                goc gocVar = this.b;
                gocVar.getClass();
                switch (b) {
                    case 0:
                        bu5Var.u();
                        gocVar.presentFragment(PasscodeActivity.n0());
                        return;
                    case 1:
                        bu5Var.u();
                        gocVar.presentFragment(new vqc());
                        return;
                    case 2:
                        bu5Var.u();
                        gocVar.presentFragment(new n7c());
                        return;
                    default:
                        bu5Var.u();
                        goc.L0(gocVar.getParentActivity(), gocVar.getResourceProvider());
                        return;
                }
            }
        }, false);
        J.k(2131232825, jb6.M0(2131742839, null), new Runnable(this) {
            public final goc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                bu5 bu5Var = J;
                goc gocVar = this.b;
                gocVar.getClass();
                switch (b) {
                    case 0:
                        bu5Var.u();
                        gocVar.presentFragment(PasscodeActivity.n0());
                        return;
                    case 1:
                        bu5Var.u();
                        gocVar.presentFragment(new vqc());
                        return;
                    case 2:
                        bu5Var.u();
                        gocVar.presentFragment(new n7c());
                        return;
                    default:
                        bu5Var.u();
                        goc.L0(gocVar.getParentActivity(), gocVar.getResourceProvider());
                        return;
                }
            }
        }, !C.g.d.isEmpty());
        J.j();
        J.b(2131232838, jb6.M0(2131742623, null), new Runnable(this) {
            public final goc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                bu5 bu5Var = J;
                goc gocVar = this.b;
                gocVar.getClass();
                switch (b) {
                    case 0:
                        bu5Var.u();
                        gocVar.presentFragment(PasscodeActivity.n0());
                        return;
                    case 1:
                        bu5Var.u();
                        gocVar.presentFragment(new vqc());
                        return;
                    case 2:
                        bu5Var.u();
                        gocVar.presentFragment(new n7c());
                        return;
                    default:
                        bu5Var.u();
                        goc.L0(gocVar.getParentActivity(), gocVar.getResourceProvider());
                        return;
                }
            }
        }, false);
        bka simpleMenuOverlay = getSimpleMenuOverlay();
        if (simpleMenuOverlay != null) {
            simpleMenuOverlay.setOutlineProvider(null);
            simpleMenuOverlay.setTranslationZ(gm.L(20.0f));
            ViewGroup viewGroup = J.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                rja rjaVar = this.simpleActionBar;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                bka menuOverlay = rjaVar.getMenuOverlay();
                if (menuOverlay != null && zjaVar.getParent() == rjaVar.d) {
                    menuOverlay.e(rjaVar, zjaVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    J.p = new cy0(simpleMenuOverlay, (byte) 3);
                    simpleMenuOverlay.setOnClosed(new Runnable(this) {
                        public final goc b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b = r3;
                            hza hzaVar3 = hzaVar2;
                            goc gocVar = this.b;
                            switch (b) {
                                case 0:
                                    gocVar.T0.remove(hzaVar3);
                                    return;
                                default:
                                    gocVar.T0.remove(hzaVar3);
                                    return;
                            }
                        }
                    });
                    return;
                }
            }
        }
        J.p = new Runnable(this) {
            public final goc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                hza hzaVar3 = hzaVar2;
                goc gocVar = this.b;
                switch (b) {
                    case 0:
                        gocVar.T0.remove(hzaVar3);
                        return;
                    default:
                        gocVar.T0.remove(hzaVar3);
                        return;
                }
            }
        };
        J.a0();
    }

    public final void z0() {
        l11.u(getParentActivity(), c.C(this.currentAccount).j);
    }
}
