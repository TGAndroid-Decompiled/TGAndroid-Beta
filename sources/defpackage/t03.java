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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public abstract class t03 {
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
            String k = c00.k(new StringBuilder("'"), (String) arrayList.get(i), "'");
            if (i == 0) {
                str2 = k;
            } else if (i == arrayList.size() - 1) {
                str2 = ob6.a0(null, null, 2131751684, str2, k);
            } else {
                str2 = ob6.a0(null, null, 2131751686, str2, k);
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

    public static CharSequence d(int i, String str, TreeSet treeSet, String str2, zd zdVar, vnb vnbVar) {
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
                    return ob6.a0(null, null, 2131751690, Integer.valueOf(uc7.s1(i).l4.Y.f()), b(treeSet));
                case 1:
                    String c2 = c(str, treeSet);
                    if (c2 == null) {
                        a0 = ob6.M0(2131751688, null);
                    } else {
                        a0 = ob6.a0(null, null, 2131751689, c2);
                    }
                    return hl.M2(a0, aob.Xc, vnbVar, zdVar, false);
                case 2:
                    return ob6.a0(null, null, 2131751687, b(treeSet));
                case 3:
                    return ob6.M0(2131743311, null);
                case 4:
                case 5:
                    return ob6.M0(2131743313, null);
                case 6:
                    return ob6.M0(2131751693, null);
            }
        }
        return null;
    }

    public static void e(Context context, int i, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z, pcc pccVar, vnb vnbVar, d31 d31Var) {
        String str;
        int[] iArr;
        zt3 zt3Var;
        Object M2;
        d31 d31Var2;
        String r;
        if (!user.bot_can_manage_bots) {
            if (d31Var == null) {
                e S = LaunchActivity.S();
                if (S == null) {
                    pccVar.a(null);
                    return;
                }
                d31Var2 = d31.b0(S);
            } else {
                d31Var2 = d31Var;
            }
            if (!TextUtils.isEmpty(lbc.p(user))) {
                r = "@" + lbc.p(user);
            } else {
                r = lbc.r(user);
            }
            d31Var2.Q(2131624012, 36, hl.L2(aob.v0(aob.xj, vnbVar), ob6.a0(null, null, 2131751695, r))).j();
            pccVar.a(null);
            return;
        }
        TreeSet treeSet = new TreeSet();
        Set<String> set = uc7.s1(i).l4.u0.f;
        if (set != null) {
            for (String str2 : set) {
                if (!TextUtils.isEmpty(str2)) {
                    treeSet.add(str2.toLowerCase(Locale.US));
                }
            }
        }
        treeSet.remove("bot");
        nx0 h = uh9.h(1, vnbVar, context, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        h.O = linearLayout;
        de0 de0Var = new de0(context);
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.q(user);
        de0Var.f(user, rb0Var);
        de0Var.setRoundRadius(hl.L(40.0f));
        linearLayout.addView(de0Var, tre.t(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(hl.o());
        int i2 = aob.G6;
        yob.X(textView, i2, vnbVar);
        bs2.r(20.0f, 1, 2131751696, textView, null);
        textView.setGravity(17);
        linearLayout.addView(textView, tre.t(-1, -2, 55, 16, 0, 16, 5));
        TextView textView2 = new TextView(context);
        yob.X(textView2, i2, vnbVar);
        textView2.setTextSize(1, 14.0f);
        String a0 = ob6.a0(null, null, 2131751697, lbc.r(user));
        int i3 = aob.Xc;
        textView2.setText(hl.M2(a0, i3, vnbVar, null, true));
        textView2.setGravity(17);
        linearLayout.addView(textView2, tre.t(-1, -2, 55, 16, 0, 16, 22));
        zt3 zt3Var2 = new zt3(context, ob6.M0(2131751699, null), false, false, -1, vnbVar);
        zt3Var2.d.setImeOptions(5);
        int L = hl.L(16.0f);
        int i4 = aob.d6;
        ShapeDrawable b0 = aob.b0(L, aob.v0(i4, vnbVar));
        uob M = yob.M(i4);
        zt3Var2.setBackground(b0);
        yob.j(zt3Var2, b0, M, null, vnbVar);
        zt3Var2.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(zt3Var2, tre.t(-1, -2, 55, 12, 0, 12, 0));
        ilb ilbVar = new ilb(context, vnbVar);
        ilbVar.setText(ob6.M0(2131751698, null));
        linearLayout.addView(ilbVar, tre.t(-1, -2, 55, 9, 0, 9, 0));
        zt3 zt3Var3 = new zt3(context, ob6.M0(2131751694, null), false, false, 32, vnbVar);
        LinearLayout j = uh9.j(context, 0);
        zt3Var3.removeView(zt3Var3.d);
        yob.A(zt3Var3.d, aob.H6, vnbVar);
        zt3Var3.d.setPadding(0, hl.L(15.0f), hl.L(63.0f), hl.L(15.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 17.0f);
        textView3.setText("@");
        yob.X(textView3, i2, vnbVar);
        textView3.setGravity(17);
        textView3.setPadding(0, hl.L(15.0f), 0, hl.L(15.0f));
        j.addView(textView3, tre.k(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        j.addView(zt3Var3.d, tre.q(0, -1, 119.0f, 1, 0, 0, 0, 0));
        zt3Var3.addView(j, tre.c(-1.0f, -1));
        Drawable b02 = aob.b0(hl.L(16.0f), aob.v0(i4, vnbVar));
        uob M3 = yob.M(i4);
        zt3Var3.setBackground(b02);
        yob.j(zt3Var3, b02, M3, null, vnbVar);
        zt3Var3.d.setImeOptions(6);
        zt3Var3.d.setInputType(145);
        zt3Var3.d.setSingleLine(true);
        String str3 = tL_requestPeerTypeCreateBot.suggested_username;
        if (str3 != null) {
            str3 = str3.trim();
        }
        zt3Var3.setText(str3);
        linearLayout.addView(zt3Var3, tre.t(-1, -2, 55, 12, 0, 12, 0));
        zt3Var2.d.setOnEditorActionListener(new j(zt3Var3, (byte) 10));
        ilb ilbVar2 = new ilb(context, vnbVar);
        linearLayout.addView(ilbVar2, tre.t(-1, -2, 55, 9, 0, 9, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        String str4 = str3;
        linearLayout2.setPadding(hl.L(12.0f), hl.L(12.0f), hl.L(12.0f), hl.L(12.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout.addView(linearLayout2, tre.o(-1, -2));
        c51 c51Var = new c51(vnbVar, context, true);
        c51Var.setRoundRadius(24);
        c51Var.e();
        c51Var.setColor(aob.p1(0.1f, aob.v0(i2, vnbVar)));
        if (c51Var.getBackground() != null) {
            Drawable background = c51Var.getBackground();
            uob K = yob.K(0.1f, i2);
            c51Var.setBackground(background);
            str = null;
            yob.j(c51Var, background, K, null, vnbVar);
        } else {
            str = null;
        }
        c51Var.setText(ob6.M0(2131752570, str));
        linearLayout2.addView(c51Var, tre.q(0, 48, 119.0f, 1, 0, 0, 5, 0));
        c51 i5 = xnb.i(24, vnbVar, context, true);
        i5.setText(ob6.M0(2131751706, null));
        linearLayout2.addView(i5, tre.q(0, 48, 119.0f, 1, 5, 0, 0, 0));
        h.T0 = false;
        h.Q0 = true;
        h.r = true;
        h.t0(aob.a7);
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
        zd zdVar = new zd(h, i, (byte) 29);
        String b = b(treeSet);
        if (TextUtils.isEmpty(b)) {
            M2 = ob6.M0(2131751691, null);
            iArr = iArr5;
            zt3Var = zt3Var2;
        } else {
            iArr = iArr5;
            zt3Var = zt3Var2;
            M2 = hl.M2(ob6.a0(null, null, 2131751685, b), i3, vnbVar, zdVar, false);
        }
        cv2 cv2Var = new cv2(ilbVar2, M2, vnbVar, (byte) 3);
        gp6 gp6Var = new gp6(iArr4, runnableArr, iArr3, i, (byte) 19);
        bv2 bv2Var = new bv2(zt3Var3, treeSet, (byte) 9);
        p03 p03Var = new p03(zArr2, iArr2, gp6Var, strArr, i5, zt3Var3, treeSet, cv2Var, ilbVar2, vnbVar, iArr4, runnableArr, iArr3, i, zdVar, h);
        cv2Var.run();
        q03 q03Var = new q03(zArr2, iArr2, zt3Var3, treeSet, strArr, p03Var, zt3Var, iArr, gp6Var, i5, z, i, user, zArr, pccVar, h, zdVar, vnbVar, ilbVar2, context);
        zt3Var3.d.addTextChangedListener(new r03(bv2Var, p03Var));
        bv2Var.run();
        if (!TextUtils.isEmpty(str4)) {
            p03Var.run();
        }
        zt3Var3.d.setOnEditorActionListener(new j(q03Var, (byte) 11));
        c51Var.setOnClickListener(new rg(h, (byte) 5));
        i5.setEnabled(false);
        i5.setOnClickListener(new r81(q03Var, (byte) 22));
        h.setOnDismissListener(new o03(zArr2, gp6Var, zArr, pccVar, iArr2, i));
        h.show();
    }
}
