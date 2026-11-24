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
public final class hmc extends n5c implements gk7 {
    public static Typeface Y0;
    public float A0;
    public float B0;
    public pkb C0;
    public float D0;
    public View E;
    public u41 E0;
    public gw9 F;
    public u41 F0;
    public boolean G;
    public b G0;
    public t05 H0;
    public boolean I0;
    public View K0;
    public float L0;
    public float M0;
    public ValueAnimator N0;
    public xha P0;
    public yv8 Q0;
    public int R0;
    public flc S;
    public slc T;
    public FrameLayout U;
    public SpannableString U0;
    public TextView V;
    public boolean V0;
    public FrameLayout W;
    public boolean W0;
    public TextView X;
    public sm3 X0;
    public FrameLayout Y;
    public TextView Z;
    public l46 a0;
    public tlc b0;
    public boolean c0;
    public FrameLayout d0;
    public vlc e;
    public FrameLayout e0;
    public tlc f;
    public boolean g0;
    public int h;
    public vec h0;
    public FrameLayout i0;
    public zoc j0;
    public koc k0;
    public float m0;
    public wlc n;
    public ValueAnimator n0;
    public flc o0;
    public int p0;
    public boolean q0;
    public int r;
    public boolean r0;
    public boolean s;
    public vq1 s0;
    public dmc t0;
    public LinearLayout v0;
    public hn w0;
    public hn x0;
    public FrameLayout y;
    public qmc y0;
    public ylc z0;
    public final xia w = new xia(this, (byte) 15);
    public final os3 x = new os3(this, (byte) 3);
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
    public final q5c[] u0 = new q5c[2];
    public final qkc J0 = new qkc(this, (byte) 0);
    public final qkc O0 = new qkc(this, (byte) 1);
    public final CharSequence[] S0 = new CharSequence[2];
    public final HashSet T0 = new HashSet();

    public static void I0(Context context, int i, TL_wallet.walletTransaction wallettransaction, k8c k8cVar, i8c i8cVar, byte[] bArr, nk1 nk1Var, wjb wjbVar) {
        TL_wallet.nftItem nftitem;
        String str;
        cj7[] cj7VarArr;
        View[] viewArr;
        i8c i8cVar2;
        LinearLayout j0;
        if (context == null) {
            return;
        }
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        if (((walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) || (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnchainGift)) && (nftitem = wallettransaction.nft) != null) {
            TL_stars.StarGift starGift = nftitem.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                vqa vqaVar = new vqa(context, i, 0L, wjbVar, null);
                vqaVar.d3 = wallettransaction;
                dq7 c = dq7.c(wallettransaction);
                if (c != null) {
                    str = c.e();
                } else {
                    str = null;
                }
                vqaVar.a2.setStatusPill(str);
                vqaVar.m2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                vqaVar.show();
                return;
            }
        }
        boolean z = true;
        cj7[] cj7VarArr2 = new cj7[1];
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
        if (k8cVar == null && nk1Var == null && i2 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(2131232733).getPadding(rect);
            viewArr = viewArr2;
            ?? ilcVar = new ilc(context, wjbVar, arrayList, G, i, rect, viewArr);
            ilcVar.setPosition(i2);
            cj7VarArr = cj7VarArr2;
            ilcVar.setAdapter(new jlc(arrayList, context, wjbVar, rect, i, cj7VarArr2));
            i8cVar2 = i8cVar;
            j0 = ilcVar;
        } else {
            cj7VarArr = cj7VarArr2;
            viewArr = viewArr2;
            i8cVar2 = i8cVar;
            j0 = j0(context, i, wallettransaction, k8cVar, i8cVar, bArr, nk1Var, wjbVar, cj7VarArr, false);
        }
        cj7[] cj7VarArr3 = cj7VarArr;
        klc klcVar = new klc(context, j0, wjbVar, j0, viewArr, context);
        cj7VarArr3[0] = klcVar;
        if ((j0 instanceof wec) && i8cVar2 != null) {
            klcVar.n(new mhc(i8cVar2, wallettransaction, (byte) 10));
        }
        cj7 cj7Var = cj7VarArr3[0];
        if (k8cVar == null) {
            z = false;
        }
        cj7Var.v0(z);
        cj7 cj7Var2 = cj7VarArr3[0];
        cj7Var2.T0 = false;
        cj7Var2.show();
    }

    public static void K0(Context context, wjb wjbVar) {
        fx0 h = de9.h(1, wjbVar, context, false);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = gl.L(16.0f);
        int i = bkb.g5;
        Drawable b0 = bkb.b0(L, bkb.v0(i, wjbVar));
        vkb M = zkb.M(i);
        frameLayout.setBackground(b0);
        zkb.j(frameLayout, b0, M, null, wjbVar);
        frameLayout.setPadding(gl.L(36.0f), 0, gl.L(36.0f), gl.L(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, nme.c(-2.0f, -1));
        linearLayout.addView(new lnc(160, context, false), nme.t(160, 160, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(k96.M0(2131742853, null));
        zkb.X(textView, bkb.i5, wjbVar);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(gl.n1("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView m = ug8.m(linearLayout, textView, nme.t(-1, -2, 1, 0, 0, 0, 6), context);
        m.setText(k96.M0(2131742852, null));
        int i2 = bkb.y6;
        zkb.X(m, i2, wjbVar);
        m.setTextSize(1, 14.0f);
        m.setGravity(17);
        m.setLineSpacing(gl.L(1.0f), 1.0f);
        linearLayout.addView(m, nme.t(-1, -2, 1, 0, 0, 0, 24));
        amc amcVar = new amc(context, wjbVar);
        amcVar.setPadding(gl.L(0.0f), gl.L(8.0f), gl.L(0.0f), gl.L(8.0f));
        amcVar.a(2131232835, k96.M0(2131742756, null), k96.M0(2131742755, null));
        linearLayout.addView(amcVar, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        amc amcVar2 = new amc(context, wjbVar);
        amcVar2.setPadding(gl.L(0.0f), gl.L(8.0f), gl.L(0.0f), gl.L(8.0f));
        amcVar2.a(2131232833, k96.M0(2131742824, null), k96.M0(2131742823, null));
        linearLayout.addView(amcVar2, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        amc amcVar3 = new amc(context, wjbVar);
        amcVar3.setPadding(gl.L(0.0f), gl.L(8.0f), gl.L(0.0f), gl.L(8.0f));
        amcVar3.a(2131232837, k96.M0(2131742939, null), k96.M0(2131742938, null));
        linearLayout.addView(amcVar3, nme.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        u41 i3 = yjb.i(24, wjbVar, context, true);
        i3.setText(k96.M0(2131742857, null));
        linearLayout.addView(i3, nme.t(-1, 48, 1, 0, 0, 0, 0));
        ote.b(i3, 0.02f, 1.1f);
        l46 l46Var = new l46(context, null);
        zkb.X(l46Var, i2, wjbVar);
        l46Var.setTextSize(1, 13.0f);
        l46Var.setGravity(17);
        l46Var.setText(U0(k96.M0(2131742743, null), bkb.Wc, wjbVar, new vf1(context, (byte) 25)));
        linearLayout.addView(l46Var, nme.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        h.O = frameLayout;
        fx0[] fx0VarArr = {h};
        fx0VarArr[0].r0(true);
        fx0VarArr[0].K();
        i3.setOnClickListener(new f5(fx0VarArr, (byte) 9));
        fx0VarArr[0].show();
    }

    public static void L0(int i, wjb wjbVar, Context context) {
        c C = c.C(i);
        if (C.M()) {
            String x = C.x();
            if (TextUtils.isEmpty(x)) {
                return;
            }
            M0(context, i, x, true, null, wjbVar);
        }
    }

    public static void M0(Context context, final int i, String str, final boolean z, final gm8 gm8Var, final wjb wjbVar) {
        final fx0 fx0Var = new fx0(1, wjbVar, context, false);
        fx0Var.s0(-12207881);
        fx0Var.L(-12207881);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(new gmc());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, nme.f(-2.0f, -1, 55, gl.L(12.0f), gl.L(30.0f), gl.L(12.0f), gl.L(12.0f) + gl.n));
        fmc fmcVar = new fmc(context, str);
        if (!z) {
            fmcVar.b.setText(k96.M0(2131746307, null));
        }
        linearLayout.addView(fmcVar, nme.r(288, 302, 1));
        TextView textView = new TextView(context);
        textView.setText(k96.M0(2131742778, null));
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setLineSpacing(gl.L(1.0f), 1.0f);
        linearLayout.addView(textView, nme.t(-1, -2, 1, 24, 0, 24, 20));
        final u41 u41Var = new u41(null, context, true);
        u41Var.setRoundRadius(24);
        u41Var.setColor(-1);
        u41Var.setTextColor(-15556886);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z) {
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new cm2(2131232813, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) k96.M0(2131742937, null));
        } else {
            cm2 cm2Var = new cm2(2131231960, 0);
            cm2Var.c(gl.L(20.0f));
            spannableStringBuilder.append((CharSequence) "G");
            spannableStringBuilder.setSpan(cm2Var, 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) k96.M0(2131742754, null));
        }
        u41Var.setText(spannableStringBuilder);
        linearLayout.addView(u41Var, nme.t(-1, 48, 1, 0, 0, 0, 0));
        if (!z) {
            int i2 = 8;
            textView.setVisibility(8);
            if (gm8Var != null) {
                i2 = 0;
            }
            u41Var.setVisibility(i2);
        }
        View k = tb4.k(context, 2131231272);
        k.setPadding(gl.L(12.0f), gl.L(12.0f), gl.L(12.0f), gl.L(12.0f));
        k.setContentDescription(k96.M0(2131752029, null));
        ote.a(k);
        frameLayout.addView(k, nme.d(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
        fx0Var.O = frameLayout;
        fx0Var.x = true;
        fx0Var.v0 = false;
        fx0Var.w0 = false;
        fx0Var.L(-12207881);
        k.setOnClickListener(new dh(fx0Var, (byte) 7));
        fmcVar.f = new xt2(str, (byte) 7);
        fx0Var.show();
        fx0Var.x0(-12207881);
        gl.o3(fx0Var, -12207881, false, null);
        gl.i3(fx0Var, false);
        if (Build.VERSION.SDK_INT >= 29 && fx0Var.getWindow() != null) {
            fx0Var.getWindow().setNavigationBarContrastEnforced(false);
        }
        u41Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                boolean z2 = z;
                fx0 fx0Var2 = fx0Var;
                if (!z2) {
                    fx0Var2.dismiss();
                    gm8Var.run();
                    return;
                }
                u41 u41Var2 = u41Var;
                if (u41Var2.R) {
                    return;
                }
                u41Var2.setLoading(true);
                ukc ukcVar = new ukc(u41Var2, fx0Var2, wjbVar, (byte) 0);
                int i3 = i;
                c C = c.C(i3);
                C.x0(new t79(i3, ukcVar, C, (byte) 29));
            }
        });
    }

    public static SpannableStringBuilder U0(String str, int i, wjb wjbVar, Runnable runnable) {
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
            spannableStringBuilder.setSpan(new yf1(i, wjbVar, runnable), indexOf, i2 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void c1(q5c q5cVar, boolean z) {
        boolean canScrollVertically = q5cVar.canScrollVertically(-1);
        q5cVar.g3.O(z);
        q5cVar.b0();
        if (!canScrollVertically) {
            q5cVar.f3.g1(0, 0);
        }
    }

    public static Uri h1(String str) {
        Uri parse = Uri.parse(str.trim());
        if (parse.getScheme() == null) {
            Uri parse2 = Uri.parse("https://" + str.trim());
            if (v0(parse2.getHost())) {
                return parse2;
            }
        }
        return parse;
    }

    public static String i1(Uri uri) {
        if (v0(uri.getHost())) {
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

    public static android.widget.LinearLayout j0(final android.content.Context r38, int r39, org.telegram.tgnet.tl.TL_wallet.walletTransaction r40, defpackage.k8c r41, defpackage.i8c r42, byte[] r43, defpackage.nk1 r44, defpackage.wjb r45, defpackage.cj7[] r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmc.j0(android.content.Context, int, org.telegram.tgnet.tl.TL_wallet$walletTransaction, k8c, i8c, byte[], nk1, wjb, cj7[], boolean):android.widget.LinearLayout");
    }

    public static String m0(String str) {
        StringBuilder sb = new StringBuilder((str.length() / 4) + str.length());
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && i % 4 == 0) {
                sb.append(' ');
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static CharSequence n0(String str, Runnable runnable) {
        if (TextUtils.isEmpty(str)) {
            return k96.M0(2131742710, null);
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

    public static SpannableStringBuilder o0(int i, long j, wjb wjbVar) {
        BigDecimal stripTrailingZeros;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        cm2 cm2Var = new cm2(2131232824, 2);
        cm2Var.d = false;
        cm2Var.c(gl.L(16.0f));
        spannableStringBuilder.setSpan(cm2Var, 0, 1, 33);
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
            spannableStringBuilder.setSpan(new cm4(bkb.y6, wjbVar), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static Typeface r0(Context context) {
        Typeface typeface = Y0;
        if (typeface == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                fk.e();
                Typeface build = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
                Y0 = build;
                return build;
            }
            Typeface n1 = gl.n1("fonts/rmono.ttf");
            Y0 = n1;
            return n1;
        }
        return typeface;
    }

    public static boolean v0(String str) {
        if (str != null) {
            if ("t.me".equalsIgnoreCase(str) || "telegram.me".equalsIgnoreCase(str) || "telegram.dog".equalsIgnoreCase(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean w0(Uri uri) {
        String scheme = uri.getScheme();
        if (!"ton".equalsIgnoreCase(scheme) && !"tc".equalsIgnoreCase(scheme)) {
            if (("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) && v0(uri.getHost())) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 1 || (!"sendgrams".equalsIgnoreCase(pathSegments.get(0)) && i1(uri) == null)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void A0() {
        L0(this.currentAccount, getResourceProvider(), getParentActivity());
    }

    public final void B0() {
        c C = c.C(this.currentAccount);
        u41 u41Var = this.F0;
        if (u41Var.R) {
            return;
        }
        u41Var.setLoading(true);
        C.x0(new s91((Object) C, (Object) new nu9(this, C, (byte) 20), false, false, (byte) 3));
    }

    public final void C0(String str, c cVar, cs5 cs5Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        String str2;
        float f;
        if (currencyrate == null) {
            return;
        }
        a8 a8Var = new a8(2, this.resourceProvider, getParentActivity(), false, false);
        a8Var.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
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
        textView.setPadding(0, 0, gl.L(f), 0);
        a8Var.setChecked(equals);
        a8Var.setOnClickListener(new hu4(cVar, currencyrate, cs5Var, (byte) 26));
        linearLayout.addView(a8Var, nme.o(200, -2));
    }

    public final void D0(LinearLayout linearLayout, c cVar, cs5 cs5Var) {
        TL_wallet.currencyRate currencyrate;
        hmc hmcVar;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        c cVar2 = cVar;
        linearLayout2.removeAllViews();
        String g = cVar2.h.g();
        TL_wallet.currencyRates f = cVar2.h.f();
        if (f == null) {
            for (int i = 0; i < 3; i++) {
                pi4 pi4Var = new pi4(getParentActivity(), getResourceProvider());
                pi4Var.setIsSingleCell(true);
                pi4Var.setViewType(31);
                linearLayout2.addView(pi4Var, nme.o(200, -2));
            }
            return;
        }
        a43 a43Var = cVar2.h;
        a43Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        TL_wallet.currencyRates f2 = a43Var.f();
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
            currencyrate2 = a43.e();
        }
        arrayList2.add(currencyrate2);
        if (currencyrate != null) {
            arrayList2.add(currencyrate);
        }
        if (f2 != null && f2.rates != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(a43Var.g());
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) a.b.getSystemService("input_method");
                if (inputMethodManager != null) {
                    a43.b(linkedHashSet, inputMethodManager.getCurrentInputMethodSubtype());
                    for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                        for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                            a43.b(linkedHashSet, inputMethodSubtype);
                        }
                    }
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
            a43.a(linkedHashSet, na7.q1(a43Var.a).k4.S.f);
            a43.c(linkedHashSet, k96.D0().y);
            a43.c(linkedHashSet, k96.D0().z);
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
                C0(g, cVar2, cs5Var, linearLayout2, currencyrate7);
            }
            i4++;
            cVar2 = cVar;
        }
        if (!hashSet.isEmpty() && !f.rates.isEmpty()) {
            hmcVar = this;
            linearLayout2.addView(new j8(getParentActivity(), hmcVar.resourceProvider), nme.o(-1, 8));
        } else {
            hmcVar = this;
        }
        int i5 = 0;
        while (i5 < f.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f.rates.get(i5);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                hmcVar.C0(g, cVar, cs5Var, linearLayout2, currencyrate8);
            }
            i5++;
            hmcVar = this;
            linearLayout2 = linearLayout;
        }
    }

    public final void E0(String str) {
        Uri h1 = h1(str);
        String i1 = i1(h1);
        if (i1 != null) {
            int i = this.currentAccount;
            na7.q1(i).Y1().a(i1, null, new jq0(i, new tkc(this, (byte) 4), (byte) 6));
        } else if ((getParentActivity() instanceof LaunchActivity) && new a46((LaunchActivity) getParentActivity(), this.currentAccount, null, false).g(h1)) {
        } else {
            gl.c3(new qkc(this, (byte) 9));
        }
    }

    public final void F0() {
        t05 t05Var;
        q5c q5cVar = this.u0[1];
        if (this.f0 == 1 && q5cVar != null && q5cVar.H && (t05Var = this.H0) != null && !t05Var.i && !t05Var.g && t05Var.m == null && q5cVar.f3.M0() >= q5cVar.g3.E.size() - 3) {
            this.H0.e();
        }
    }

    public final void G0() {
        b bVar;
        q5c q5cVar = this.u0[0];
        if (q5cVar != null && q5cVar.H && (bVar = this.G0) != null && !bVar.k && !bVar.h && q5cVar.f3.M0() >= q5cVar.g3.E.size() - 3) {
            this.G0.h();
        }
    }

    public final CharSequence H0(int i) {
        hn hnVar;
        float f;
        CharSequence[] charSequenceArr = this.S0;
        if (charSequenceArr[i] == null) {
            charSequenceArr[i] = new SpannableString("l");
            if (i == 0) {
                hnVar = this.w0;
                f = 100.0f;
            } else {
                hnVar = this.x0;
                f = 50.0f;
            }
            u86 u86Var = new u86(gl.L(f), hnVar);
            u86Var.a(bkb.p1(0.45f, -1), bkb.p1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i];
            ((SpannableString) charSequence).setSpan(u86Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i];
    }

    public final void J0(TL_wallet.nftItem nftitem) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        TL_stars.StarGift starGift = nftitem.gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            vqa vqaVar = new vqa(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            vqaVar.a3 = nftitem;
            if (this.k0 != null) {
                vqaVar.b3 = new qlc(this, tL_starGiftUnique, nftitem);
                vqaVar.c3 = new rlc(this, nftitem);
            }
            vqaVar.m2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(vqaVar);
            return;
        }
        Activity parentActivity = getParentActivity();
        wjb resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int i6 = bkb.Z6;
            int v0 = bkb.v0(i6, resourceProvider);
            int i7 = bkb.F6;
            bkb.v0(i7, resourceProvider);
            fx0 fx0Var = new fx0(1, resourceProvider, (Context) parentActivity, false);
            fx0Var.b0 = i6;
            fx0Var.s0(v0);
            fx0Var.L(v0);
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.setFillViewport(true);
            scrollView.setVerticalScrollBarEnabled(false);
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.setPadding(gl.L(12.0f), gl.L(28.0f), gl.L(12.0f), gl.L(12.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            be0 be0Var = new be0(parentActivity);
            be0Var.setRoundRadius(gl.L(12.0f));
            be0Var.setContentDescription(nftitem.name);
            Drawable mutate = parentActivity.getResources().getDrawable(2131232841).mutate();
            int i8 = bkb.y6;
            zkb.x(be0Var, mutate, i8, resourceProvider, PorterDuff.Mode.SRC_IN);
            gl5 c = vk2.c(nftitem, false);
            if (c != null) {
                be0Var.m(c, "120_120", mutate, nftitem);
            } else {
                be0Var.setImageDrawable(mutate);
            }
            linearLayout.addView(be0Var, nme.r(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            if (TextUtils.isEmpty(nftitem.name)) {
                str = k96.M0(2131742933, null);
            } else {
                str = nftitem.name;
            }
            textView.setText(str);
            tb4.w(textView, i7, resourceProvider, 1, 17.0f);
            int i9 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, nme.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            zkb.X(textView2, i8, resourceProvider);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            if (TextUtils.isEmpty(nftitem.description)) {
                i = 8;
            } else {
                i = 0;
            }
            textView2.setVisibility(i);
            linearLayout.addView(textView2, nme.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, nme.k(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
            int i10 = 0;
            while (i10 < 2) {
                LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(i9);
                int L = gl.L(16.0f);
                int i11 = bkb.c6;
                int v02 = bkb.v0(i11, resourceProvider);
                int i12 = bkb.h6;
                int v03 = bkb.v0(i12, resourceProvider);
                ff0 i0 = bkb.i0(L, L, L, L, v02, v03, v03);
                vkb M = zkb.M(i11);
                vkb M2 = zkb.M(i12);
                linearLayout3.setBackground(i0);
                zkb.j(linearLayout3, i0, M, M2, resourceProvider);
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                if (i10 == 0) {
                    i2 = 2131742718;
                } else {
                    i2 = 2131742760;
                }
                String M0 = k96.M0(i2, null);
                linearLayout3.setContentDescription(M0);
                ImageView imageView = new ImageView(parentActivity);
                if (i10 == 0) {
                    i3 = 2131232854;
                } else {
                    i3 = 2131232845;
                }
                imageView.setImageResource(i3);
                imageView.setImportantForAccessibility(2);
                int i13 = bkb.F6;
                zkb.s(imageView, i13, resourceProvider, PorterDuff.Mode.SRC_IN);
                linearLayout3.addView(imageView, nme.o(24, 24));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText(M0);
                tb4.w(textView3, i13, resourceProvider, 1, 12.0f);
                textView3.setGravity(17);
                linearLayout3.addView(textView3, nme.k(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
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
                linearLayout2.addView(linearLayout3, nme.m(1.0f, 0, -1, i4, i5, 0));
                i10++;
                i9 = 17;
            }
            ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                mfb mfbVar = new mfb(parentActivity, resourceProvider);
                int L2 = gl.L(10.0f);
                int i14 = bkb.c6;
                ShapeDrawable b0 = bkb.b0(L2, bkb.v0(i14, resourceProvider));
                vkb M3 = zkb.M(i14);
                mfbVar.setBackground(b0);
                zkb.j(mfbVar, b0, M3, null, resourceProvider);
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i15 = 0;
                while (i15 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i15);
                    i15++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    mfbVar.f(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(mfbVar, nme.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            u41 u41Var = new u41(resourceProvider, parentActivity, true);
            u41Var.setRoundRadius(24);
            u41Var.setText(k96.M0(2131742819, null));
            linearLayout.addView(u41Var, nme.o(-1, 48));
            fx0Var.O = scrollView;
            fx0Var.T0 = false;
            linearLayout2.getChildAt(0).setOnClickListener(new vzb(fx0Var, nftitem, (byte) 13));
            linearLayout2.getChildAt(1).setOnClickListener(new bna(parentActivity, (byte) 25));
            u41Var.setOnClickListener(new bna(fx0Var, (byte) 26));
            fx0Var.show();
            fx0Var.L(v0);
            gl.o3(fx0Var, v0, false, null);
        }
    }

    public final void N0() {
        if (getParentActivity() != null && this.Q0 == null && this.P0 != null) {
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.Q0 = yv8.k(this, this.P0, new pb((byte) 14), new tkc(this, (byte) 3), new qkc(this, (byte) 7));
            }
        }
    }

    public final void O0(boolean z) {
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
            f1();
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
                this.n0.setInterpolator(s33.h);
                this.n0.addUpdateListener(new skc(this, (byte) 0));
                this.n0.addListener(new t7(this, f, (byte) 8));
                this.n0.start();
            } else {
                P0(f);
                this.s0.m(false);
            }
            if (this.a != null && this.r0 != Q0()) {
                b1(false);
            }
        }
    }

    public final void P0(float f) {
        this.m0 = f;
        this.i0.setAlpha(f);
        e1();
        int round = Math.round(gl.L(46.0f) * f);
        if (this.p0 != round) {
            this.p0 = round;
            d1(0);
            d1(1);
        }
    }

    public final boolean Q0() {
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

    public final void R0(long j) {
        if (this.a != null) {
            zoc zocVar = this.j0;
            if (zocVar != null) {
                zocVar.a();
            }
            if (this.M0 <= 0.0f && t0()) {
                int top = this.a.f3.m(this.h).getTop() - this.a.getPaddingTop();
                this.a.D0();
                if (top < 0) {
                    this.a.x0(0, top, s33.h);
                    return;
                }
                return;
            }
            this.a.D0();
            h0(true);
            qkc qkcVar = this.O0;
            gl.r(qkcVar);
            if (j > 0) {
                gl.d3(qkcVar, j + 260);
            }
        }
    }

    public final void S0() {
        this.I0 = false;
        zoc zocVar = this.j0;
        if (zocVar != null) {
            zocVar.b(false);
        }
        this.f0 = 0;
        vq1 vq1Var = this.s0;
        if (vq1Var != null) {
            vq1Var.setPosition(0);
        }
    }

    public final void T0() {
        this.s = false;
        va vaVar = this.a;
        if (vaVar != null) {
            vaVar.E2.b.remove(this.x);
            this.a.removeCallbacks(this.w);
        }
        vlc vlcVar = this.e;
        if (vlcVar != null) {
            vlcVar.setAdditionalTilt(0.0f);
        }
    }

    public final void V0() {
        boolean z;
        c C = c.C(this.currentAccount);
        g1();
        u41 u41Var = this.F0;
        if (C.M() && C.e()) {
            z = true;
        } else {
            z = false;
        }
        u41Var.setEnabled(z);
        if (!C.M()) {
            this.w0.setText(H0(0));
            this.x0.setText(H0(1));
            return;
        }
        long z2 = C.z();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.U0 == null) {
            this.U0 = new SpannableString("G");
            vlc vlcVar = this.e;
            vlcVar.getClass();
            qmc qmcVar = new qmc(vlcVar);
            this.y0 = qmcVar;
            SpannableString spannableString = this.U0;
            spannableString.setSpan(qmcVar, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.U0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) smc.e(z2));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) k96.M0(2131749341, null));
        ylc ylcVar = this.z0;
        ylc ylcVar2 = ylcVar;
        if (ylcVar == null) {
            ?? characterStyle = new CharacterStyle();
            characterStyle.a = -9577217;
            this.z0 = characterStyle;
            ylcVar2 = characterStyle;
        }
        spannableStringBuilder.setSpan(ylcVar2, length, spannableStringBuilder.length(), 33);
        this.w0.setText(spannableStringBuilder);
        CharSequence q = c.C(this.currentAccount).q(z2, false);
        boolean isEmpty = TextUtils.isEmpty(q);
        hn hnVar = this.x0;
        if (isEmpty) {
            hnVar.setText(H0(1));
        } else {
            hnVar.setText(q);
        }
        Y0(this.A0);
        t05 t05Var = this.H0;
        if (t05Var != null && !t05Var.h && !t05Var.i && t05Var.m == null) {
            t05Var.e();
        }
        String x = C.x();
        if (!TextUtils.isEmpty(x)) {
            this.e.setCardNumber(m0(x.toUpperCase()));
        }
    }

    public final void W0() {
        float[] fArr;
        float[] fArr2;
        float f;
        Rect rect = this.H;
        if (!rect.isEmpty() && this.E.isAttachedToWindow()) {
            vlc vlcVar = this.e;
            gw9 gw9Var = this.F;
            Matrix matrix = this.I;
            if (vlcVar.g(gw9Var, matrix)) {
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
                gw9 gw9Var2 = this.F;
                int[] iArr = this.P;
                gw9Var2.getLocationInWindow(iArr);
                View view = this.E;
                int[] iArr2 = this.O;
                view.getLocationInWindow(iArr2);
                this.e.i(this.A0, this.y.getWidth() / 0.7826087f);
                float f3 = iArr2[0] - iArr[0];
                float v = oo1.v(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
                for (int i4 = 0; i4 < 4; i4++) {
                    int i5 = i4 << 1;
                    float R1 = gl.R1(fArr2[i5], (fArr[i5] * 0.7826087f) + f3, this.A0);
                    float[] fArr3 = this.N;
                    fArr3[i5] = R1;
                    int i6 = i5 + 1;
                    fArr3[i6] = gl.R1(fArr2[i6], (fArr[i6] * 0.7826087f) + v, this.A0);
                }
                Matrix matrix2 = this.K;
                boolean polyToPoly = matrix2.setPolyToPoly(this.L, 0, this.N, 0, 4);
                Matrix matrix3 = this.J;
                if (polyToPoly && !matrix3.equals(matrix2)) {
                    matrix3.set(matrix2);
                    this.F.invalidate();
                }
                vlc vlcVar2 = this.e;
                Matrix matrix4 = vlcVar2.c;
                Matrix matrix5 = vlcVar2.e;
                Matrix matrix6 = vlcVar2.d;
                if (matrix.invert(matrix6)) {
                    matrix5.setConcat(matrix6, matrix3);
                    if (!vlcVar2.n || !matrix4.equals(matrix5)) {
                        matrix4.set(matrix5);
                        vlcVar2.n = true;
                        vlcVar2.O.invalidate();
                    }
                }
                float R12 = gl.R1(1.0f, 1.0952381f, this.A0);
                this.x0.setPivotX(0.0f);
                this.x0.setPivotY(0.0f);
                this.x0.setScaleX(R12);
                this.x0.setScaleY(R12);
            }
        }
    }

    public final void X0() {
        gw9 gw9Var;
        float i;
        boolean z;
        float f;
        vlc vlcVar;
        int i2;
        ?? r16;
        boolean z2;
        LinearLayout linearLayout;
        boolean z3;
        float min;
        float f2;
        float height;
        vlc vlcVar2;
        if (this.a != null && this.e != null && this.v0 != null && this.E != null && (gw9Var = this.F) != null && this.simpleActionBar != null) {
            gw9Var.bringToFront();
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
            a1();
            if (m != null) {
                f = Math.max(0.0f, (m.getHeight() / 2.0f) + gl.L(24.0f)) * this.A0;
            } else {
                f = 0.0f;
            }
            float R1 = gl.R1(1.0f, 0.8f, this.A0);
            this.e.setPivotX(vlcVar.getWidth() * 0.5f);
            this.e.setPivotY(0.0f);
            this.e.setScaleX(R1);
            this.e.setScaleY(R1);
            this.e.setAlpha(1.0f - Utilities.l(gl.x1(i, 0.75f, 1.0f)));
            vlc vlcVar3 = this.e;
            if (!z && (m == null || i >= 1.0f || m.getBottom() <= this.a.getPaddingTop() || m.getTop() >= this.a.getHeight() - this.a.getPaddingBottom())) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            vlcVar3.setVisibility(i2);
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
                float L = gl.L(4.0f) + this.simpleActionBar.getHeight() + (iArr2[r16] - iArr[r16]);
                float f5 = 1.0f - f3;
                if (z3) {
                    height = 0.0f;
                } else {
                    height = this.e.getHeight() * 0.35f;
                }
                float f6 = L - (f5 * height);
                if (z3) {
                    f6 = ls6.d(0.9f - f4, this.e.getHeight(), 2.0f, f6);
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
                        gl.r(this.O0);
                        ValueAnimator valueAnimator = this.N0;
                        if (valueAnimator != null) {
                            this.N0 = null;
                            valueAnimator.cancel();
                        }
                        this.L0 = 0.0f;
                        this.M0 = 0.0f;
                        X0();
                        return;
                    }
                    width = gl.R1(width, width2, l);
                    f6 = gl.R1(f6, y, l);
                    f4 = gl.R1(f4, 1.0f, l);
                    f3 = gl.R1(f3, 1.0f, l);
                }
                this.e.setPivotX(vlcVar2.getWidth() * 0.5f);
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
                gl.B2(this.v0);
                this.G = z2;
                if (z2) {
                    this.F.addView(this.v0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                    this.v0.layout(0, 0, rect.width(), rect.height());
                    W0();
                } else {
                    vlc vlcVar4 = this.e;
                    vlcVar4.i(0.0f, 0.0f);
                    LinearLayout linearLayout2 = vlcVar4.N;
                    gl.B2(linearLayout2);
                    linearLayout2.setScaleX(1.0f);
                    linearLayout2.setScaleY(1.0f);
                    linearLayout2.setRotationX(0.0f);
                    linearLayout2.setRotationY(0.0f);
                    linearLayout2.setTranslationX(0.0f);
                    linearLayout2.setTranslationY(0.0f);
                    pmc pmcVar = vlcVar4.P;
                    pmcVar.setScaleX(1.0f);
                    pmcVar.setScaleY(1.0f);
                    vlcVar4.F.addView(linearLayout2, vlcVar4.Q);
                    this.v0.layout(rect.left, rect.top, rect.right, rect.bottom);
                    this.e.getClass();
                    W0();
                }
                this.F.invalidate();
            }
            Y0(i);
            if (this.G) {
                W0();
            }
            float f7 = 1.0f - i;
            this.simpleActionBar.setTitlesAlpha(f7);
            if (this.simpleActionBar.getTitleTextView() != null) {
                this.simpleActionBar.getTitleTextView().setTranslationY((1.0f - f7) * (-gl.L(8.0f)));
            }
        }
    }

    @Override
    public final void Y(ArrayList arrayList, l5c l5cVar) {
        c C = c.C(this.currentAccount);
        g1();
        arrayList.add(c4c.m(this.S));
        this.h = arrayList.size();
        tlc tlcVar = this.f;
        c4c c4cVar = new c4c(-4);
        c4cVar.c = tlcVar;
        c4cVar.A = -1;
        c4cVar.e = true;
        arrayList.add(c4cVar);
        arrayList.add(c4c.m(this.C0));
        boolean Q0 = Q0();
        this.r0 = Q0;
        if (Q0) {
            String M0 = k96.M0(2131742756, null);
            String M02 = k96.M0(2131742755, null);
            int i = zlc.b;
            c4c K = c4c.K(zlc.class);
            K.k = 2131232835;
            K.m = M0;
            K.n = M02;
            arrayList.add(K);
            String M03 = k96.M0(2131742824, null);
            String M04 = k96.M0(2131742823, null);
            c4c K2 = c4c.K(zlc.class);
            K2.k = 2131232833;
            K2.m = M03;
            K2.n = M04;
            arrayList.add(K2);
            String M05 = k96.M0(2131742939, null);
            String M06 = k96.M0(2131742938, null);
            c4c K3 = c4c.K(zlc.class);
            K3.k = 2131232837;
            K3.m = M05;
            K3.n = M06;
            arrayList.add(K3);
            arrayList.add(c4c.m(this.b0));
        } else if (this.o0 != null) {
            if (this.V0 && !this.W0 && C.z() > 500000000) {
                arrayList.add(c4c.k(this.d0));
            }
            flc flcVar = this.o0;
            c4c c4cVar2 = new c4c(-3);
            c4cVar2.c = flcVar;
            c4cVar2.A = 0;
            c4cVar2.z = 1;
            arrayList.add(c4cVar2);
        }
        l46 l46Var = this.a0;
        if (l46Var != null) {
            this.c0 = false;
            l46Var.animate().cancel();
            this.a0.setAlpha(0.0f);
            this.a0.setVisibility(4);
        }
    }

    public final void Y0(float f) {
        int themedColor = getThemedColor(bkb.F6);
        this.w0.setTextColor(gl.b2(f, -1, themedColor));
        hn hnVar = this.x0;
        float[] fArr = this.e.b0;
        int i = -7868417;
        if (fArr != null) {
            i = bm2.f(fArr[8], znc.p(-7868417, 0, fArr), znc.p(-7868417, 3, fArr));
        }
        hnVar.setTextColor(gl.b2(f, i, bm2.o(themedColor, 143)));
        qmc qmcVar = this.y0;
        if (qmcVar != null) {
            qmcVar.y = gl.b2(f, -1, getThemedColor(bkb.Ei));
        }
        ylc ylcVar = this.z0;
        if (ylcVar != null) {
            float[] fArr2 = this.e.b0;
            int i2 = -9577217;
            if (fArr2 != null) {
                i2 = bm2.f(fArr2[8], znc.p(-9577217, 0, fArr2), znc.p(-9577217, 3, fArr2));
            }
            ylcVar.a = bm2.o(i2, Math.round((1.0f - f) * 255.0f));
        }
        this.w0.invalidate();
    }

    @Override
    public final CharSequence Z() {
        return k96.M0(2131742740, null);
    }

    public final void Z0(float[] fArr) {
        boolean z;
        float f;
        int n;
        if (this.E0 != null && this.F0 != null) {
            float f2 = znc.j(getThemedColor(bkb.Z6))[0];
            if (f2 < 0.6f) {
                z = true;
            } else {
                z = false;
            }
            int themedColor = getThemedColor(bkb.Ei);
            float f3 = 0.0f;
            if (fArr != null && fArr.length >= 18) {
                int[] iArr = new int[2];
                for (int i = 0; i < 2; i++) {
                    int i2 = i << 2;
                    float f4 = fArr[i2 + 10];
                    if (f4 < 0.0f) {
                        n = themedColor;
                    } else {
                        n = znc.n(themedColor, (int) f4, (int) fArr[i2 + 11]);
                    }
                    iArr[i] = n;
                }
                themedColor = bm2.f(fArr[8], iArr[0], iArr[1]);
            }
            if (z) {
                f3 = f2 + 0.25f;
                f = 1.0f;
            } else {
                f = f2 - 0.2f;
            }
            float[] j = znc.j(themedColor);
            float f5 = j[0];
            int i3 = -16777216;
            if (f5 < f3 || f5 > f) {
                themedColor = (themedColor & (-16777216)) | (znc.l(Math.max(f3, Math.min(f, f5)), j[1], j[2]) & 16777215);
            }
            if (themedColor != this.R0) {
                this.R0 = themedColor;
                if (bm2.h(themedColor) <= 0.550000011920929d) {
                    i3 = getThemedColor(bkb.Ii);
                }
                u41[] u41VarArr = {this.E0, this.F0};
                for (int i4 = 0; i4 < 2; i4++) {
                    u41 u41Var = u41VarArr[i4];
                    u41Var.setColor(themedColor);
                    u41Var.setTextColor(i3);
                }
            }
        }
    }

    @Override
    public final void a0(c4c c4cVar, View view) {
        t05 t05Var;
        Object obj = c4cVar.H;
        if (obj instanceof TL_wallet.nftItem) {
            J0((TL_wallet.nftItem) obj);
        } else if (c4cVar.d == -10001 && (t05Var = this.H0) != null) {
            t05Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            I0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) c4cVar.H, null, null, null, null, getResourceProvider());
        }
    }

    public final void a1() {
        va vaVar = this.a;
        if (vaVar != null && this.e != null) {
            float b = vaVar.E2.b(1);
            float min = Math.min(10.0f, this.a.E2.b(3) * 40.0f) + (-Math.min(10.0f, b * 40.0f));
            this.e.setAdditionalTilt(Math.max(0.0f, (this.A0 * 10.0f) + ((((float) Math.sqrt(Utilities.l(this.A0))) * 90.0f) - 10.0f)) + min);
            this.e.setUseGyroscope(1.0f - ((float) Math.pow(this.A0, 0.33000001311302185d)));
        }
    }

    @Override
    public final boolean b0(c4c c4cVar, View view) {
        koc kocVar;
        if ((view instanceof ync) && (kocVar = this.k0) != null) {
            kocVar.S((ync) view);
            return true;
        }
        return false;
    }

    public final void b1(boolean z) {
        boolean Q0 = Q0();
        va vaVar = this.a;
        q5c[] q5cVarArr = this.u0;
        if (vaVar != null && this.r0 != Q0) {
            this.r0 = Q0;
            vaVar.D0();
            for (q5c q5cVar : q5cVarArr) {
                if (q5cVar != null) {
                    q5cVar.D0();
                }
            }
            this.a.g3.O(false);
            this.a.f3.g1(0, 0);
            this.a.post(new qkc(this, (byte) 6));
        }
        if (!Q0) {
            for (q5c q5cVar2 : q5cVarArr) {
                if (q5cVar2 != null) {
                    c1(q5cVar2, z);
                }
            }
            flc flcVar = this.o0;
            if (flcVar != null) {
                flcVar.post(new qkc(this, (byte) 2));
                this.o0.post(new qkc(this, (byte) 3));
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        koc kocVar = this.k0;
        if ((kocVar == null || !kocVar.q0) && super.canBeginSlide()) {
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
        T0();
        dmc dmcVar = this.t0;
        if (dmcVar != null) {
            dmcVar.b(null);
        }
        this.f = null;
        this.T = null;
        this.S = null;
        this.o0 = null;
        this.s0 = null;
        q5c[] q5cVarArr = this.u0;
        q5cVarArr[0] = null;
        q5cVarArr[1] = null;
        t05 t05Var = this.H0;
        if (t05Var != null && !t05Var.a.isEmpty()) {
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
        koc kocVar = this.k0;
        if (kocVar != null) {
            kocVar.p();
        }
        this.k0 = null;
        View createView = super.createView(context);
        oa6 oa6Var = new oa6(this, context);
        oa6Var.addView(createView, nme.c(-1.0f, -1));
        this.fragmentView = oa6Var;
        zkb.h(bkb.Z6, getResourceProvider(), oa6Var);
        this.simpleActionBar.setClipChildren(false);
        this.simpleActionBar.setClipToPadding(false);
        wha t = this.simpleActionBar.t();
        xha a = t.a(2, 2131232683);
        this.P0 = a;
        a.setOnClickListener(new View.OnClickListener(this) {
            public final hmc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                hmc hmcVar = this.b;
                switch (b) {
                    case 0:
                        hmcVar.N0();
                        return;
                    case 1:
                        hmcVar.presentFragment(new p3c(6, null));
                        return;
                    case 2:
                        hmcVar.z0();
                        return;
                    case 3:
                        hmcVar.A0();
                        return;
                    default:
                        hmcVar.B0();
                        return;
                }
            }
        });
        xha a2 = t.a(1, 2131231247);
        a2.setOnClickListener(new hu4(this, context, a2, (byte) 25));
        flc flcVar = new flc(this, context, (byte) 1);
        this.S = flcVar;
        flcVar.setClipToPadding(false);
        this.S.setClipChildren(false);
        this.S.setPadding(gl.L(16.0f), 0, gl.L(16.0f), gl.L(4.0f));
        slc slcVar = new slc(this, context);
        this.T = slcVar;
        slcVar.setDefaultRadiusDp(22);
        this.T.setOnAnimatedHeightChangedListener(new qkc(this, (byte) 8));
        TextView textView = new TextView(context);
        this.V = textView;
        textView.setText(k96.M0(2131742699, null));
        this.U = k0(this.V, new qkc(this, (byte) 10));
        TextView textView2 = new TextView(context);
        this.X = textView2;
        this.W = k0(textView2, new qkc(this, (byte) 11));
        TextView textView3 = new TextView(context);
        this.Z = textView3;
        this.Y = k0(textView3, new qkc(this, (byte) 12));
        this.S.addView(this.T, nme.c(-2.0f, -1));
        l46 l46Var = new l46(context, null);
        this.a0 = l46Var;
        this.c0 = false;
        l46Var.setAlpha(0.0f);
        l46 l46Var2 = this.a0;
        int i = bkb.y6;
        zkb.X(l46Var2, i, this.resourceProvider);
        this.a0.setTextSize(1, 13.0f);
        this.a0.setGravity(17);
        this.a0.setText(U0(k96.M0(2131742743, null), bkb.Wc, this.resourceProvider, new vf1(context, (byte) 26)));
        this.a0.setVisibility(4);
        if (((FrameLayout) createView) != null) {
            ((FrameLayout) createView).addView(this.a0, nme.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        }
        tlc tlcVar = new tlc(this, context, (byte) 0);
        this.b0 = tlcVar;
        tlcVar.setImportantForAccessibility(2);
        this.d0 = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e0 = frameLayout;
        int i2 = bkb.c6;
        int themedColor = getThemedColor(i2);
        int themedColor2 = getThemedColor(i2);
        int i3 = bkb.h6;
        ff0 Z = bkb.Z(themedColor, bkb.v(themedColor2, getThemedColor(i3)), 16, 16);
        vkb M = zkb.M(i2);
        vkb p = zkb.p(i2, i3);
        wjb resourceProvider = getResourceProvider();
        frameLayout.setBackground(Z);
        zkb.j(frameLayout, Z, M, p, resourceProvider);
        this.d0.addView(this.e0, nme.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float N = gl.N(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{N, N, N, N, N, N, N, N}, null, null));
        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232842);
        this.e0.addView(imageView, nme.d(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        zkb.X(textView4, bkb.p7, this.resourceProvider);
        ir2.r(16.0f, 1, 2131742781, textView4, null);
        this.e0.addView(textView4, nme.d(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        this.e0.setOnClickListener(new View.OnClickListener(this) {
            public final hmc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                hmc hmcVar = this.b;
                switch (b) {
                    case 0:
                        hmcVar.N0();
                        return;
                    case 1:
                        hmcVar.presentFragment(new p3c(6, null));
                        return;
                    case 2:
                        hmcVar.z0();
                        return;
                    case 3:
                        hmcVar.A0();
                        return;
                    default:
                        hmcVar.B0();
                        return;
                }
            }
        });
        ote.b(this.e0, 0.02f, 1.2f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.y.setClipToPadding(false);
        this.simpleActionBar.addView(this.y, nme.d(-1, 56.0f, 3, 64.0f, 0.0f, 96.0f, 0.0f));
        View view = new View(context);
        this.E = view;
        this.y.addView(view, nme.e(1, 1, 19));
        this.G = false;
        this.H.setEmpty();
        this.J.reset();
        gw9 gw9Var = new gw9(this, context);
        this.F = gw9Var;
        gw9Var.setClipChildren(false);
        this.F.setClipToPadding(false);
        vlc vlcVar = new vlc(this, context);
        this.e = vlcVar;
        vlcVar.setDiamondOnCard(true);
        this.e.setCardOnClickListener(new View.OnClickListener(this) {
            public final hmc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                hmc hmcVar = this.b;
                switch (b) {
                    case 0:
                        hmcVar.N0();
                        return;
                    case 1:
                        hmcVar.presentFragment(new p3c(6, null));
                        return;
                    case 2:
                        hmcVar.z0();
                        return;
                    case 3:
                        hmcVar.A0();
                        return;
                    default:
                        hmcVar.B0();
                        return;
                }
            }
        });
        this.a.E2.b.add(this.x);
        tlc tlcVar2 = new tlc(this, context, (byte) 1);
        this.f = tlcVar2;
        tlcVar2.setImportantForAccessibility(2);
        wlc wlcVar = new wlc(this, context);
        this.n = wlcVar;
        wlcVar.setClipChildren(false);
        this.n.setClipToPadding(false);
        this.n.addView(this.e, nme.c(-2.0f, -1));
        oa6Var.addView(this.n, nme.c(-1.0f, -1));
        this.a.setClipChildren(false);
        this.a.setClipToPadding(false);
        this.v0 = this.e.getBalanceLayout();
        this.w0 = this.e.getBalanceView();
        this.x0 = this.e.getUsdBalanceView();
        this.e.setCardHolder(l7c.r(getUserConfig().f()).toUpperCase());
        this.D0 = 0.0f;
        pkb pkbVar = new pkb((byte) 24, context, this);
        this.C0 = pkbVar;
        pkbVar.setOrientation(0);
        this.C0.setPadding(gl.L(16.0f), 0, gl.L(16.0f), gl.L(12.0f));
        u41 u41Var = new u41(this.resourceProvider, context, true);
        u41Var.setRoundRadius(24);
        this.E0 = u41Var;
        u41Var.setText(k96.M0(2131742961, null));
        this.C0.addView(this.E0, nme.m(1.0f, 0, 48, 0, 4, 0));
        this.E0.setOnClickListener(new View.OnClickListener(this) {
            public final hmc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                hmc hmcVar = this.b;
                switch (b) {
                    case 0:
                        hmcVar.N0();
                        return;
                    case 1:
                        hmcVar.presentFragment(new p3c(6, null));
                        return;
                    case 2:
                        hmcVar.z0();
                        return;
                    case 3:
                        hmcVar.A0();
                        return;
                    default:
                        hmcVar.B0();
                        return;
                }
            }
        });
        u41 u41Var2 = new u41(this.resourceProvider, context, true);
        u41Var2.setRoundRadius(24);
        this.F0 = u41Var2;
        u41Var2.setText(k96.M0(2131742759, null));
        this.F0.setEnabled(c.C(this.currentAccount).e());
        this.F0.setOnClickListener(new View.OnClickListener(this) {
            public final hmc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                hmc hmcVar = this.b;
                switch (b) {
                    case 0:
                        hmcVar.N0();
                        return;
                    case 1:
                        hmcVar.presentFragment(new p3c(6, null));
                        return;
                    case 2:
                        hmcVar.z0();
                        return;
                    case 3:
                        hmcVar.A0();
                        return;
                    default:
                        hmcVar.B0();
                        return;
                }
            }
        });
        this.C0.addView(this.F0, nme.m(1.0f, 0, 48, 4, 0, 0));
        Z0(this.e.getStickerStyle());
        this.G0 = c.C(this.currentAccount).G();
        this.a.setDescendantFocusability(131072);
        koc kocVar2 = new koc(this, this.e, new v8b(this, oa6Var, (byte) 6), null);
        this.k0 = kocVar2;
        oa6Var.addView(kocVar2, nme.c(-1.0f, -1));
        this.l0 = "";
        this.o0 = new flc(this, context, (byte) 0);
        vq1 vq1Var = new vq1(this, context, this.resourceProvider, (byte) 9);
        this.s0 = vq1Var;
        vq1Var.setAllowDisallowInterceptTouch(false);
        this.s0.setAdapter(new bn0((byte) 10, context, this));
        this.glassEngine.c(this.s0);
        vec l = this.s0.l(-2, true);
        this.h0 = l;
        l.h(i, bkb.F6, i, i3, i2);
        dg0 baseSimpleGlass = getBaseSimpleGlass();
        nl0 l2 = nod.l(this.resourceProvider);
        vec vecVar = this.h0;
        il0 c = baseSimpleGlass.c.c(vecVar, null, false);
        c.p(l2);
        c.r(gl.L(20.0f));
        vecVar.setBlurredBackground(c);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.i0 = frameLayout3;
        frameLayout3.setTranslationZ(gl.L(20.0f));
        this.i0.setClipChildren(false);
        this.i0.setClipToPadding(false);
        zoc zocVar = new zoc(context, this.h0, this.resourceProvider, new tkc(this, (byte) 0), new tkc(this, (byte) 1), new tkc(this, (byte) 2));
        this.j0 = zocVar;
        zocVar.setClipChildren(false);
        zoc zocVar2 = this.j0;
        il0 c2 = baseSimpleGlass.c.c(zocVar2, null, false);
        c2.p(l2);
        c2.r(gl.L(20.0f));
        zocVar2.y = c2;
        zocVar2.invalidate();
        this.i0.addView(this.j0, nme.d(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.s0.setPosition(this.f0);
        f1();
        this.o0.addView(this.s0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        FrameLayout frameLayout4 = this.i0;
        koc kocVar3 = this.k0;
        if (kocVar3 != null) {
            childCount = viewGroup.indexOfChild(kocVar3);
        } else {
            childCount = viewGroup.getChildCount();
        }
        viewGroup.addView(frameLayout4, childCount, nme.e(-1, 40, 48));
        O0(this.g0);
        t05 t05Var2 = this.H0;
        if (t05Var2 != null) {
            this.k0.Y(t05Var2);
        }
        this.a.j(new vdb(this, (byte) 9));
        l5c l5cVar = this.a.g3;
        l5cVar.r = false;
        l5cVar.O(false);
        dmc dmcVar2 = new dmc(this);
        this.t0 = dmcVar2;
        dmcVar2.b(this.a);
        V0();
        this.G0.h();
        this.simpleActionBar.post(new qkc(this, (byte) 5));
        this.a.post(new qkc(this, (byte) 6));
        return this.fragmentView;
    }

    public final void d1(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        q5c q5cVar = this.u0[i];
        if (q5cVar != null) {
            va vaVar = this.a;
            if (vaVar != null) {
                i2 = vaVar.getPaddingTop();
            } else {
                i2 = 0;
            }
            int i6 = i2 + this.p0;
            if (i == 1) {
                i3 = gl.L(4.0f);
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
                i5 = gl.L(12.0f);
            } else {
                i5 = 0;
            }
            int i8 = i4 + i5;
            if (q5cVar.getPaddingTop() != i7 || q5cVar.getPaddingBottom() != i8) {
                boolean canScrollVertically = q5cVar.canScrollVertically(-1);
                if (i == 1) {
                    q5cVar.setPadding(gl.L(9.0f), i7, gl.L(9.0f), i8);
                } else {
                    q5cVar.setPadding(0, i7, 0, i8);
                }
                if (!canScrollVertically) {
                    q5cVar.f3.g1(0, 0);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        va vaVar;
        l5c l5cVar;
        if (i2 == this.currentAccount) {
            if (i == kk7.c4 && this.w0 != null) {
                V0();
                Iterator it = this.T0.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            } else if (i == kk7.z3) {
                g1();
            } else if (i == kk7.p0) {
                if (objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof TL_account.Password) {
                        this.V0 = true;
                        this.W0 = ((TL_account.Password) obj).has_password;
                        va vaVar2 = this.a;
                        if (vaVar2 != null && (l5cVar = vaVar2.g3) != null) {
                            l5cVar.O(true);
                            return;
                        }
                        return;
                    }
                }
                getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new hc((byte) 0), new n4b(this, (byte) 10));
            } else if (i == kk7.d4 && objArr.length > 0) {
                Object obj2 = objArr[0];
                b bVar = this.G0;
                if (obj2 == bVar && (vaVar = this.a) != null && vaVar.g3 != null) {
                    if (bVar.b.isEmpty()) {
                        b bVar2 = this.G0;
                        if (!bVar2.h) {
                            bVar2.h();
                        }
                    }
                    b1(true);
                }
            }
        }
    }

    public final void e1() {
        View view;
        boolean z;
        int i;
        flc flcVar;
        if (this.i0 != null) {
            boolean u0 = u0();
            if (this.q0 != u0 && (flcVar = this.o0) != null) {
                this.q0 = u0;
                flcVar.invalidate();
            }
            if (s0()) {
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
            pha phaVar = this.simpleActionBar;
            if (phaVar != null) {
                i2 = phaVar.getHeight();
            }
            if (z) {
                float y = this.a.getY() + view2.getY();
                float y2 = view.getY() + y + gl.L(2.0f);
                this.i0.setTranslationY(y2);
                float paddingTop = y + this.a.getPaddingTop() + gl.L(2.0f);
                float L = (gl.L(46.0f) + paddingTop) - Math.max(0.0f, y2 - paddingTop);
                float f = this.m0;
                i2 = Math.max(i2, Math.round(((1.0f - f) * i2) + (L * f)));
            }
            l0(this.S);
            l0(this.C0);
            l0(this.d0);
            View view3 = this.K0;
            if (view3 != null && view3.getLayoutParams().height != i2) {
                this.K0.getLayoutParams().height = i2;
                this.K0.requestLayout();
            }
        }
    }

    public final void f1() {
        zoc zocVar = this.j0;
        if (zocVar != null && this.s0 != null && zocVar.x != 0.0f) {
            zocVar.x = 0.0f;
            zocVar.c.setVisibility(8);
            zocVar.invalidate();
        }
    }

    public final void g1() {
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
        slc slcVar = this.T;
        FrameLayout frameLayout = this.U;
        Boolean bool = C.i;
        if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(C.j)) {
            z2 = true;
        } else {
            z2 = false;
        }
        slcVar.j(frameLayout, z2, z);
        long j = 0;
        if (!TextUtils.isEmpty(C.x())) {
            ArrayList arrayList = C.J;
            int size = arrayList.size();
            int i = 0;
            long j2 = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                x05 x05Var = (x05) obj;
                if (!x05Var.e) {
                    long j3 = x05Var.c;
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
            this.X.setText(p0(2131742818, j));
        }
        this.T.j(this.W, z3, z);
        long j4 = gta.v(this.currentAccount, true).m().amount;
        if (j4 > 500000000) {
            z4 = true;
        }
        if (z4) {
            this.Z.setText(p0(2131742856, j4));
        }
        this.T.j(this.Y, z4, z);
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void h0(boolean z) {
        float f;
        long j;
        s33 s33Var;
        gl.r(this.O0);
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
        X0();
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
            s33Var = new s33(0.05d, 0.7d, 0.1d, 1.0d);
        } else {
            s33Var = new s33(0.4d, 0.0d, 0.2d, 1.0d);
        }
        valueAnimator2.setInterpolator(s33Var);
        this.N0.addUpdateListener(new skc(this, (byte) 1));
        this.N0.addListener(new iab(this, (byte) 26));
        this.N0.start();
    }

    public final void i0() {
        pha phaVar;
        if (this.F != null && (phaVar = this.simpleActionBar) != null && (phaVar.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) this.simpleActionBar.getParent();
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (this.F.getParent() != this.simpleActionBar) {
                gl.B2(this.F);
                this.simpleActionBar.addView(this.F, nme.c(56.0f, -1));
            }
            this.F.bringToFront();
            this.F.post(new qkc(this, (byte) 6));
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final FrameLayout k0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(gl.L(16.0f), gl.L(14.0f), gl.L(16.0f), gl.L(14.0f));
        int i = bkb.h6;
        ff0 f0 = bkb.f0(getThemedColor(i), 2, -1);
        vkb M = zkb.M(i);
        wjb resourceProvider = getResourceProvider();
        frameLayout.setBackground(f0);
        zkb.j(frameLayout, f0, null, M, resourceProvider);
        zkb.X(textView, bkb.F6, getResourceProvider());
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(19);
        frameLayout.addView(textView, nme.d(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131230875);
        zkb.s(imageView, bkb.y6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, nme.e(-2, -2, 21));
        frameLayout.setOnClickListener(new nk3(runnable, (byte) 9));
        textView.setDuplicateParentStateEnabled(true);
        ote.b(textView, 0.02f, 1.2f);
        this.T.addView(frameLayout, nme.o(-1, -2));
        return frameLayout;
    }

    public final void l0(ViewGroup viewGroup) {
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
        yv8 yv8Var = this.Q0;
        if (yv8Var != null) {
            if (z) {
                yv8Var.e();
            }
            return false;
        }
        zoc zocVar = this.j0;
        if (zocVar != null && zocVar.E) {
            if (z) {
                zocVar.b(false);
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final void onBeginSlide() {
        dmc dmcVar = this.t0;
        if (dmcVar != null) {
            dmcVar.c();
        }
        va vaVar = this.a;
        if (vaVar != null) {
            vaVar.D0();
        }
        q5c q0 = q0();
        if (q0 != null) {
            q0.D0();
        }
        super.onBeginSlide();
    }

    @Override
    public final boolean onFragmentCreate() {
        Context context = a.b;
        if (jmc.k0.compareAndSet(false, true)) {
            jmc.l0.postRunnable(new vf1(context, (byte) 27));
        }
        getNotificationCenter().b(this, kk7.c4);
        getNotificationCenter().b(this, kk7.z3);
        getNotificationCenter().b(this, kk7.d4);
        getNotificationCenter().b(this, kk7.p0);
        c C = c.C(this.currentAccount);
        t05 A = C.A();
        this.H0 = A;
        qkc qkcVar = this.J0;
        ArrayList arrayList = A.d;
        if (!arrayList.contains(qkcVar)) {
            arrayList.add(qkcVar);
        }
        sm3 sm3Var = this.X0;
        if (sm3Var != null) {
            sm3Var.run();
        }
        int i = C.F;
        C.F = i + 1;
        HashSet hashSet = C.G;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i));
        if (isEmpty) {
            C.Z();
        }
        this.X0 = new sm3(C, i, (byte) 10);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new hc((byte) 0), new n4b(this, (byte) 10));
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        yv8 yv8Var = this.Q0;
        if (yv8Var != null) {
            yv8Var.g();
            gl.B2(this.Q0);
            this.Q0 = null;
        }
        gl.r(this.O0);
        ValueAnimator valueAnimator = this.N0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        koc kocVar = this.k0;
        if (kocVar != null) {
            kocVar.p();
        }
        vlc vlcVar = this.e;
        if (vlcVar != null) {
            vlcVar.setOnFrontContentPresented(null);
        }
        ValueAnimator valueAnimator2 = this.n0;
        if (valueAnimator2 != null) {
            this.n0 = null;
            valueAnimator2.cancel();
        }
        t05 t05Var = this.H0;
        if (t05Var != null) {
            t05Var.d.remove(this.J0);
        }
        T0();
        dmc dmcVar = this.t0;
        if (dmcVar != null) {
            dmcVar.b(null);
        }
        getNotificationCenter().n(this, kk7.c4);
        getNotificationCenter().n(this, kk7.z3);
        getNotificationCenter().n(this, kk7.d4);
        getNotificationCenter().n(this, kk7.p0);
        gl.B2(this.F);
        b bVar = this.G0;
        if (bVar != null) {
            bVar.a();
        }
        super.onFragmentDestroy();
        sm3 sm3Var = this.X0;
        if (sm3Var != null) {
            sm3Var.run();
            this.X0 = null;
        }
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        if (this.o0 != null) {
            d1(0);
            d1(1);
            this.o0.requestLayout();
        }
        l46 l46Var = this.a0;
        if (l46Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) l46Var.getLayoutParams();
            layoutParams.bottomMargin = gl.L(24.0f) + i4;
            this.a0.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        yv8 yv8Var = this.Q0;
        if (yv8Var != null) {
            yv8Var.g();
            gl.B2(this.Q0);
            this.Q0 = null;
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (i == 44 && getParentActivity() != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                N0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.U = gl.S2(k96.M0(2131746310, null));
            alertDialog$Builder.j(k96.M0(2131747107, null), new pkc(this));
            alertDialog$Builder.g(k96.M0(2131751760, null), null);
            int i2 = bkb.K5;
            alertDialog$Builder.l(2131624117, 72, bkb.w0(null, i2, false), null);
            alertDialog$Builder.m(i2, null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        pha phaVar = this.simpleActionBar;
        if (phaVar != null) {
            phaVar.post(new qkc(this, (byte) 5));
        }
        c.C(this.currentAccount).J();
        if (this.H0 != null && c.C(this.currentAccount).M()) {
            this.H0.d();
        }
        V0();
        if (this.a != null) {
            b1(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.w0 != null && this.x0 != null && this.e != null) {
                Y0(this.A0);
            }
            vlc vlcVar = this.e;
            if (vlcVar != null && this.E0 != null && this.F0 != null) {
                Z0(vlcVar.getStickerStyle());
            }
            l46 l46Var = this.a0;
            if (l46Var != null) {
                l46Var.invalidate();
            }
            TextView textView = this.X;
            if (textView != null) {
                textView.invalidate();
            }
            TextView textView2 = this.Z;
            if (textView2 != null) {
                textView2.invalidate();
            }
            slc slcVar = this.T;
            if (slcVar != null) {
                slcVar.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        pha phaVar = this.simpleActionBar;
        if (phaVar != null && phaVar.getParent() == view) {
            FrameLayout frameLayout = (FrameLayout) view;
            View view2 = new View(view.getContext());
            this.K0 = view2;
            view2.setOutlineProvider(null);
            this.K0.setTranslationZ(gl.L(20.0f));
            int indexOfChild = frameLayout.indexOfChild(this.simpleActionBar);
            FrameLayout frameLayout2 = this.i0;
            if (frameLayout2 != null && frameLayout2.getParent() == frameLayout) {
                indexOfChild = Math.min(indexOfChild, frameLayout.indexOfChild(this.i0));
            }
            frameLayout.addView(this.K0, indexOfChild, nme.e(-1, 0, 48));
            this.K0.setBackground(getBaseSimpleGlass().a(this.K0));
            this.simpleActionBar.setBackground(null);
        }
        pha phaVar2 = this.simpleActionBar;
        if (phaVar2 != null) {
            phaVar2.setOutlineProvider(null);
            this.simpleActionBar.setTranslationZ(gl.L(20.0f));
        }
        getBaseSimpleGlass().o = new vw0(this, (byte) 11);
    }

    public final CharSequence p0(int i, long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        cm2 cm2Var = new cm2(2131231959, 0);
        cm2Var.d = false;
        spannableStringBuilder.setSpan(cm2Var, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) c.s(j, false));
        spannableStringBuilder.setSpan(new cm4(bkb.Ei, getResourceProvider()), length2, spannableStringBuilder.length(), 33);
        return k96.V(null, null, i, spannableStringBuilder);
    }

    public final q5c q0() {
        View currentView;
        if (s0()) {
            vq1 vq1Var = this.s0;
            if (vq1Var == null) {
                currentView = null;
            } else {
                currentView = vq1Var.getCurrentView();
            }
            if (currentView instanceof q5c) {
                return (q5c) currentView;
            }
        }
        return null;
    }

    public final boolean s0() {
        flc flcVar;
        if (!this.r0 && (flcVar = this.o0) != null && flcVar.isAttachedToWindow()) {
            ViewParent parent = this.o0.getParent();
            va vaVar = this.a;
            if (parent == vaVar.f3.m(vaVar.g3.E.size() - 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean t0() {
        View m;
        va vaVar = this.a;
        if (vaVar != null && (m = vaVar.f3.m(this.h)) != null && this.B0 < 0.5f && m.getBottom() > this.a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public final boolean u0() {
        flc flcVar = this.o0;
        if (flcVar != null && this.a != null && (flcVar.getParent() instanceof View) && ((View) this.o0.getParent()).getTop() <= this.a.getPaddingTop()) {
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

    public final void x0(Context context, xha xhaVar, View view) {
        boolean z;
        c C = c.C(this.currentAccount);
        final cs5 J = cs5.J(this, view);
        J.b0(0.0f, -gl.L(48.0f));
        J.s = (short) 0;
        J.W(5);
        cs5 K = J.K();
        K.b(2131231243, k96.M0(2131742949, null), new en1(J, (byte) 0), false);
        K.j();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        exa exaVar = new exa(this, linearLayout, C, J, (byte) 28);
        K.q(scrollView, nme.o(-1, 350));
        J.b(2131232821, k96.M0(2131742905, null), new wbc(exaVar, J, K, (byte) 7), false);
        a8 z2 = J.z();
        a43 a43Var = C.h;
        String i = a43Var.i();
        boolean isEmpty = TextUtils.isEmpty(i);
        String str = i;
        if (isEmpty) {
            z2.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131748587, null));
            spannableStringBuilder.setSpan(new u86(gl.L(75.0f), z2.b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        z2.setSubtext(str);
        if (a43Var.f() != null) {
            z = true;
        } else {
            z = false;
        }
        final exa exaVar2 = new exa(C, new boolean[]{z}, z2, exaVar, (byte) 29);
        this.T0.add(exaVar2);
        exaVar.run();
        J.b(2131232839, k96.M0(2131747464, null), new Runnable(this) {
            public final hmc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                cs5 cs5Var = J;
                hmc hmcVar = this.b;
                hmcVar.getClass();
                switch (b) {
                    case 0:
                        cs5Var.u();
                        hmcVar.presentFragment(PasscodeActivity.m0());
                        return;
                    case 1:
                        cs5Var.u();
                        hmcVar.presentFragment(new toc());
                        return;
                    case 2:
                        cs5Var.u();
                        hmcVar.presentFragment(new n5c());
                        return;
                    default:
                        cs5Var.u();
                        hmc.K0(hmcVar.getParentActivity(), hmcVar.getResourceProvider());
                        return;
                }
            }
        }, false);
        J.b(2131232832, k96.M0(2131742836, null), new Runnable(this) {
            public final hmc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                cs5 cs5Var = J;
                hmc hmcVar = this.b;
                hmcVar.getClass();
                switch (b) {
                    case 0:
                        cs5Var.u();
                        hmcVar.presentFragment(PasscodeActivity.m0());
                        return;
                    case 1:
                        cs5Var.u();
                        hmcVar.presentFragment(new toc());
                        return;
                    case 2:
                        cs5Var.u();
                        hmcVar.presentFragment(new n5c());
                        return;
                    default:
                        cs5Var.u();
                        hmc.K0(hmcVar.getParentActivity(), hmcVar.getResourceProvider());
                        return;
                }
            }
        }, false);
        J.k(2131232812, k96.M0(2131742913, null), new Runnable(this) {
            public final hmc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                cs5 cs5Var = J;
                hmc hmcVar = this.b;
                hmcVar.getClass();
                switch (b) {
                    case 0:
                        cs5Var.u();
                        hmcVar.presentFragment(PasscodeActivity.m0());
                        return;
                    case 1:
                        cs5Var.u();
                        hmcVar.presentFragment(new toc());
                        return;
                    case 2:
                        cs5Var.u();
                        hmcVar.presentFragment(new n5c());
                        return;
                    default:
                        cs5Var.u();
                        hmc.K0(hmcVar.getParentActivity(), hmcVar.getResourceProvider());
                        return;
                }
            }
        }, !C.g.d.isEmpty());
        J.j();
        J.b(2131232825, k96.M0(2131742697, null), new Runnable(this) {
            public final hmc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                cs5 cs5Var = J;
                hmc hmcVar = this.b;
                hmcVar.getClass();
                switch (b) {
                    case 0:
                        cs5Var.u();
                        hmcVar.presentFragment(PasscodeActivity.m0());
                        return;
                    case 1:
                        cs5Var.u();
                        hmcVar.presentFragment(new toc());
                        return;
                    case 2:
                        cs5Var.u();
                        hmcVar.presentFragment(new n5c());
                        return;
                    default:
                        cs5Var.u();
                        hmc.K0(hmcVar.getParentActivity(), hmcVar.getResourceProvider());
                        return;
                }
            }
        }, false);
        zha simpleMenuOverlay = getSimpleMenuOverlay();
        if (simpleMenuOverlay != null) {
            simpleMenuOverlay.setOutlineProvider(null);
            simpleMenuOverlay.setTranslationZ(gl.L(20.0f));
            ViewGroup viewGroup = J.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                pha phaVar = this.simpleActionBar;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                zha menuOverlay = phaVar.getMenuOverlay();
                if (menuOverlay != null && xhaVar.getParent() == phaVar.d) {
                    menuOverlay.d(phaVar, xhaVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    J.p = new uw0(simpleMenuOverlay, (byte) 3);
                    simpleMenuOverlay.setOnClosed(new Runnable(this) {
                        public final hmc b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b = r3;
                            exa exaVar3 = exaVar2;
                            hmc hmcVar = this.b;
                            switch (b) {
                                case 0:
                                    hmcVar.T0.remove(exaVar3);
                                    return;
                                default:
                                    hmcVar.T0.remove(exaVar3);
                                    return;
                            }
                        }
                    });
                    return;
                }
            }
        }
        J.p = new Runnable(this) {
            public final hmc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                exa exaVar3 = exaVar2;
                hmc hmcVar = this.b;
                switch (b) {
                    case 0:
                        hmcVar.T0.remove(exaVar3);
                        return;
                    default:
                        hmcVar.T0.remove(exaVar3);
                        return;
                }
            }
        };
        J.a0();
    }

    public final void y0() {
        d01.t(getParentActivity(), c.C(this.currentAccount).j);
    }

    public final void z0() {
        L0(this.currentAccount, getResourceProvider(), getParentActivity());
    }
}
