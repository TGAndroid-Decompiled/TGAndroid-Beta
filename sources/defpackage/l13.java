package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public abstract class l13 {
    public static boolean a(String str, String str2) {
        if (str.length() >= str2.length() && str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length())) {
            return true;
        }
        return false;
    }

    public static String b(TreeSet treeSet) {
        ArrayList arrayList = new ArrayList(treeSet.size());
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!"gay".equalsIgnoreCase(str)) {
                arrayList.add(str);
            }
        }
        Collections.sort(arrayList);
        String str2 = "";
        for (int i = 0; i < arrayList.size(); i++) {
            String j = b10.j(new StringBuilder("'"), (String) arrayList.get(i), "'");
            if (i == 0) {
                str2 = j;
            } else if (i == arrayList.size() - 1) {
                str2 = jb6.a0(null, null, 2131751656, str2, j);
            } else {
                str2 = jb6.a0(null, null, 2131751658, str2, j);
            }
        }
        return str2;
    }

    public static String c(String str, TreeSet treeSet) {
        String str2 = null;
        if (a(str, "bot")) {
            return null;
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!TextUtils.isEmpty(str3) && a(str, str3) && (str2 == null || str3.length() > str2.length())) {
                str2 = str3;
            }
        }
        return str2;
    }

    public static CharSequence d(int i, String str, TreeSet treeSet, String str2, eh ehVar, ylb ylbVar) {
        String a0;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            upperCase.getClass();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -1970758171:
                    if (upperCase.equals("OWNER_USERNAMES_LIMIT_EXCEEDED")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1470066023:
                    if (upperCase.equals("PREMIUM_ACCOUNT_REQUIRED")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1089285943:
                    if (upperCase.equals("ADDITIONAL_USERNAME_SUFFIX_MISSING")) {
                        c = 2;
                        break;
                    }
                    break;
                case 288843630:
                    if (upperCase.equals("USERNAME_INVALID")) {
                        c = 3;
                        break;
                    }
                    break;
                case 460390132:
                    if (upperCase.equals("USERNAME_PURCHASE_AVAILABLE")) {
                        c = 4;
                        break;
                    }
                    break;
                case 533175271:
                    if (upperCase.equals("USERNAME_OCCUPIED")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1110046033:
                    if (upperCase.equals("BOT_USERNAMES_LIMIT_EXCEEDED")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return jb6.a0(null, null, 2131751662, Integer.valueOf(oc7.r1(i).l4.R.f()), b(treeSet));
                case 1:
                    String c2 = c(str, treeSet);
                    if (c2 == null) {
                        a0 = jb6.M0(2131751660, null);
                    } else {
                        a0 = jb6.a0(null, null, 2131751661, c2);
                    }
                    return gm.M2(a0, cmb.Wc, ylbVar, ehVar, false);
                case 2:
                    return jb6.a0(null, null, 2131751659, b(treeSet));
                case 3:
                    return jb6.M0(2131743343, null);
                case 4:
                case 5:
                    return jb6.M0(2131743345, null);
                case 6:
                    return jb6.M0(2131751665, null);
            }
        }
        return null;
    }

    public static void e(Context context, int i, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z, qac qacVar, ylb ylbVar, c41 c41Var) {
        String str;
        int[] iArr;
        su3 su3Var;
        CharSequence M2;
        c41 c41Var2;
        String r;
        if (!user.bot_can_manage_bots) {
            if (c41Var == null) {
                d S = LaunchActivity.S();
                if (S == null) {
                    qacVar.a(null);
                    return;
                }
                c41Var2 = c41.b0(S);
            } else {
                c41Var2 = c41Var;
            }
            if (!TextUtils.isEmpty(m9c.p(user))) {
                r = "@" + m9c.p(user);
            } else {
                r = m9c.r(user);
            }
            c41Var2.Q(2131624012, 36, gm.L2(cmb.v0(cmb.wj, ylbVar), jb6.a0(null, null, 2131751667, r))).j();
            qacVar.a(null);
            return;
        }
        TreeSet treeSet = new TreeSet();
        Set<String> set = oc7.r1(i).l4.m0.f;
        if (set != null) {
            for (String str2 : set) {
                if (!TextUtils.isEmpty(str2)) {
                    treeSet.add(str2.toLowerCase(Locale.US));
                }
            }
        }
        treeSet.remove("bot");
        my0 h = hg9.h(1, ylbVar, context, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        h.O = linearLayout;
        bf0 bf0Var = new bf0(context);
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.q(user);
        bf0Var.f(user, pc0Var);
        bf0Var.setRoundRadius(gm.L(40.0f));
        linearLayout.addView(bf0Var, qoe.t(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(gm.o());
        int i2 = cmb.F6;
        anb.X(textView, i2, ylbVar);
        ts2.q(20.0f, 1, 2131751668, textView, null);
        textView.setGravity(17);
        linearLayout.addView(textView, qoe.t(-1, -2, 55, 16, 0, 16, 5));
        TextView textView2 = new TextView(context);
        anb.X(textView2, i2, ylbVar);
        textView2.setTextSize(1, 14.0f);
        String a0 = jb6.a0(null, null, 2131751669, m9c.r(user));
        int i3 = cmb.Wc;
        textView2.setText(gm.M2(a0, i3, ylbVar, null, true));
        textView2.setGravity(17);
        linearLayout.addView(textView2, qoe.t(-1, -2, 55, 16, 0, 16, 22));
        su3 su3Var2 = new su3(context, jb6.M0(2131751671, null), false, false, -1, ylbVar);
        su3Var2.d.setImeOptions(5);
        int L = gm.L(16.0f);
        int i4 = cmb.c6;
        ShapeDrawable b0 = cmb.b0(L, cmb.v0(i4, ylbVar));
        wmb M = anb.M(i4);
        su3Var2.setBackground(b0);
        anb.j(su3Var2, b0, M, null, ylbVar);
        su3Var2.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(su3Var2, qoe.t(-1, -2, 55, 12, 0, 12, 0));
        njb njbVar = new njb(context, ylbVar);
        njbVar.setText(jb6.M0(2131751670, null));
        linearLayout.addView(njbVar, qoe.t(-1, -2, 55, 9, 0, 9, 0));
        su3 su3Var3 = new su3(context, jb6.M0(2131751666, null), false, false, 32, ylbVar);
        LinearLayout i5 = hg9.i(context, 0);
        su3Var3.removeView(su3Var3.d);
        anb.A(su3Var3.d, cmb.G6, ylbVar);
        su3Var3.d.setPadding(0, gm.L(15.0f), gm.L(63.0f), gm.L(15.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 17.0f);
        textView3.setText("@");
        anb.X(textView3, i2, ylbVar);
        textView3.setGravity(17);
        textView3.setPadding(0, gm.L(15.0f), 0, gm.L(15.0f));
        i5.addView(textView3, qoe.k(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        i5.addView(su3Var3.d, qoe.q(0, -1, 119.0f, 1, 0, 0, 0, 0));
        su3Var3.addView(i5, qoe.c(-1.0f, -1));
        Drawable b02 = cmb.b0(gm.L(16.0f), cmb.v0(i4, ylbVar));
        wmb M3 = anb.M(i4);
        su3Var3.setBackground(b02);
        anb.j(su3Var3, b02, M3, null, ylbVar);
        su3Var3.d.setImeOptions(6);
        su3Var3.d.setInputType(145);
        su3Var3.d.setSingleLine(true);
        String str3 = tL_requestPeerTypeCreateBot.suggested_username;
        if (str3 != null) {
            str3 = str3.trim();
        }
        su3Var3.setText(str3);
        linearLayout.addView(su3Var3, qoe.t(-1, -2, 55, 12, 0, 12, 0));
        su3Var2.d.setOnEditorActionListener(new j(su3Var3, (byte) 11));
        njb njbVar2 = new njb(context, ylbVar);
        linearLayout.addView(njbVar2, qoe.t(-1, -2, 55, 9, 0, 9, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        String str4 = str3;
        linearLayout2.setPadding(gm.L(12.0f), gm.L(12.0f), gm.L(12.0f), gm.L(12.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout.addView(linearLayout2, qoe.o(-1, -2));
        b61 b61Var = new b61(ylbVar, context, true);
        b61Var.setRoundRadius(24);
        b61Var.e();
        b61Var.setColor(cmb.p1(0.1f, cmb.v0(i2, ylbVar)));
        if (b61Var.getBackground() != null) {
            Drawable background = b61Var.getBackground();
            wmb K = anb.K(0.1f, i2);
            b61Var.setBackground(background);
            str = null;
            anb.j(b61Var, background, K, null, ylbVar);
        } else {
            str = null;
        }
        b61Var.setText(jb6.M0(2131752542, str));
        linearLayout2.addView(b61Var, qoe.q(0, 48, 119.0f, 1, 0, 0, 5, 0));
        b61 i6 = mlb.i(24, ylbVar, context, true);
        i6.setText(jb6.M0(2131751678, null));
        linearLayout2.addView(i6, qoe.q(0, 48, 119.0f, 1, 5, 0, 0, 0));
        h.T0 = false;
        h.Q0 = true;
        h.r = true;
        h.t0(cmb.Z6);
        h.J();
        new WeakReference(h);
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        String[] strArr = new String[1];
        int[] iArr2 = {-1};
        int[] iArr3 = {-1};
        int[] iArr4 = new int[1];
        Runnable[] runnableArr = new Runnable[1];
        int[] iArr5 = {4};
        eh ehVar = new eh(h, i, (byte) 29);
        String b = b(treeSet);
        if (TextUtils.isEmpty(b)) {
            M2 = jb6.M0(2131751663, null);
            iArr = iArr5;
            su3Var = su3Var2;
        } else {
            iArr = iArr5;
            su3Var = su3Var2;
            M2 = gm.M2(jb6.a0(null, null, 2131751657, b), i3, ylbVar, ehVar, false);
        }
        pz2 pz2Var = new pz2(njbVar2, M2, ylbVar, (byte) 1);
        up6 up6Var = new up6(iArr4, runnableArr, iArr3, i, (byte) 19);
        mv2 mv2Var = new mv2(su3Var3, treeSet, (byte) 11);
        h13 h13Var = new h13(zArr2, iArr2, up6Var, strArr, i6, su3Var3, treeSet, pz2Var, njbVar2, ylbVar, iArr4, runnableArr, iArr3, i, ehVar, h);
        pz2Var.run();
        i13 i13Var = new i13(zArr2, iArr2, su3Var3, treeSet, strArr, h13Var, su3Var, iArr, up6Var, i6, z, i, user, zArr, qacVar, h, ehVar, ylbVar, njbVar2, context);
        su3Var3.d.addTextChangedListener(new j13(mv2Var, h13Var));
        mv2Var.run();
        if (!TextUtils.isEmpty(str4)) {
            h13Var.run();
        }
        su3Var3.d.setOnEditorActionListener(new j(i13Var, (byte) 12));
        b61Var.setOnClickListener(new di(h, (byte) 5));
        i6.setEnabled(false);
        i6.setOnClickListener(new k81(i13Var, (byte) 23));
        h.setOnDismissListener(new g13(zArr2, up6Var, zArr, qacVar, iArr2, i));
        h.show();
    }
}
