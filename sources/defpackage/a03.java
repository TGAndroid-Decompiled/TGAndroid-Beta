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
public abstract class a03 {
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
            String j = b00.j(new StringBuilder("'"), (String) arrayList.get(i), "'");
            if (i == 0) {
                str2 = j;
            } else if (i == arrayList.size() - 1) {
                str2 = k96.a0(null, null, 2131751707, str2, j);
            } else {
                str2 = k96.a0(null, null, 2131751709, str2, j);
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

    public static CharSequence d(int i, String str, TreeSet treeSet, String str2, eg egVar, wjb wjbVar) {
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
                    return k96.a0(null, null, 2131751713, Integer.valueOf(na7.q1(i).k4.R.f()), b(treeSet));
                case 1:
                    String c2 = c(str, treeSet);
                    if (c2 == null) {
                        a0 = k96.M0(2131751711, null);
                    } else {
                        a0 = k96.a0(null, null, 2131751712, c2);
                    }
                    return gl.N2(a0, bkb.Wc, wjbVar, egVar, false);
                case 2:
                    return k96.a0(null, null, 2131751710, b(treeSet));
                case 3:
                    return k96.M0(2131743417, null);
                case 4:
                case 5:
                    return k96.M0(2131743419, null);
                case 6:
                    return k96.M0(2131751716, null);
            }
        }
        return null;
    }

    public static void e(Context context, int i, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z, p8c p8cVar, wjb wjbVar, u21 u21Var) {
        String str;
        int[] iArr;
        it3 it3Var;
        Object N2;
        u21 u21Var2;
        String q;
        if (!user.bot_can_manage_bots) {
            if (u21Var == null) {
                d S = LaunchActivity.S();
                if (S == null) {
                    p8cVar.a(null);
                    return;
                }
                u21Var2 = u21.b0(S);
            } else {
                u21Var2 = u21Var;
            }
            if (!TextUtils.isEmpty(l7c.o(user))) {
                q = "@" + l7c.o(user);
            } else {
                q = l7c.q(user);
            }
            u21Var2.Q(2131624012, 36, gl.M2(bkb.v0(bkb.wj, wjbVar), k96.a0(null, null, 2131751718, q))).j();
            p8cVar.a(null);
            return;
        }
        TreeSet treeSet = new TreeSet();
        Set<String> set = na7.q1(i).k4.m0.f;
        if (set != null) {
            for (String str2 : set) {
                if (!TextUtils.isEmpty(str2)) {
                    treeSet.add(str2.toLowerCase(Locale.US));
                }
            }
        }
        treeSet.remove("bot");
        fx0 h = de9.h(1, wjbVar, context, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        h.O = linearLayout;
        be0 be0Var = new be0(context);
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.q(user);
        be0Var.f(user, pb0Var);
        be0Var.setRoundRadius(gl.L(40.0f));
        linearLayout.addView(be0Var, nme.t(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(gl.o());
        int i2 = bkb.F6;
        zkb.X(textView, i2, wjbVar);
        ir2.r(20.0f, 1, 2131751719, textView, null);
        textView.setGravity(17);
        linearLayout.addView(textView, nme.t(-1, -2, 55, 16, 0, 16, 5));
        TextView textView2 = new TextView(context);
        zkb.X(textView2, i2, wjbVar);
        textView2.setTextSize(1, 14.0f);
        String a0 = k96.a0(null, null, 2131751720, l7c.q(user));
        int i3 = bkb.Wc;
        textView2.setText(gl.N2(a0, i3, wjbVar, null, true));
        textView2.setGravity(17);
        linearLayout.addView(textView2, nme.t(-1, -2, 55, 16, 0, 16, 22));
        it3 it3Var2 = new it3(context, k96.M0(2131751722, null), false, false, -1, wjbVar);
        it3Var2.d.setImeOptions(5);
        int L = gl.L(16.0f);
        int i4 = bkb.c6;
        ShapeDrawable b0 = bkb.b0(L, bkb.v0(i4, wjbVar));
        vkb M = zkb.M(i4);
        it3Var2.setBackground(b0);
        zkb.j(it3Var2, b0, M, null, wjbVar);
        it3Var2.setText(tL_requestPeerTypeCreateBot.suggested_name);
        linearLayout.addView(it3Var2, nme.t(-1, -2, 55, 12, 0, 12, 0));
        mhb mhbVar = new mhb(context, wjbVar);
        mhbVar.setText(k96.M0(2131751721, null));
        linearLayout.addView(mhbVar, nme.t(-1, -2, 55, 9, 0, 9, 0));
        it3 it3Var3 = new it3(context, k96.M0(2131751717, null), false, false, 32, wjbVar);
        LinearLayout j = de9.j(context, 0);
        it3Var3.removeView(it3Var3.d);
        zkb.A(it3Var3.d, bkb.G6, wjbVar);
        it3Var3.d.setPadding(0, gl.L(15.0f), gl.L(63.0f), gl.L(15.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 17.0f);
        textView3.setText("@");
        zkb.X(textView3, i2, wjbVar);
        textView3.setGravity(17);
        textView3.setPadding(0, gl.L(15.0f), 0, gl.L(15.0f));
        j.addView(textView3, nme.k(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        j.addView(it3Var3.d, nme.q(0, -1, 119.0f, 1, 0, 0, 0, 0));
        it3Var3.addView(j, nme.c(-1.0f, -1));
        Drawable b02 = bkb.b0(gl.L(16.0f), bkb.v0(i4, wjbVar));
        vkb M2 = zkb.M(i4);
        it3Var3.setBackground(b02);
        zkb.j(it3Var3, b02, M2, null, wjbVar);
        it3Var3.d.setImeOptions(6);
        it3Var3.d.setInputType(145);
        it3Var3.d.setSingleLine(true);
        String str3 = tL_requestPeerTypeCreateBot.suggested_username;
        if (str3 != null) {
            str3 = str3.trim();
        }
        it3Var3.setText(str3);
        linearLayout.addView(it3Var3, nme.t(-1, -2, 55, 12, 0, 12, 0));
        it3Var2.d.setOnEditorActionListener(new j(it3Var3, (byte) 10));
        mhb mhbVar2 = new mhb(context, wjbVar);
        linearLayout.addView(mhbVar2, nme.t(-1, -2, 55, 9, 0, 9, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        String str4 = str3;
        linearLayout2.setPadding(gl.L(12.0f), gl.L(12.0f), gl.L(12.0f), gl.L(12.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout.addView(linearLayout2, nme.o(-1, -2));
        u41 u41Var = new u41(wjbVar, context, true);
        u41Var.setRoundRadius(24);
        u41Var.e();
        u41Var.setColor(bkb.p1(0.1f, bkb.v0(i2, wjbVar)));
        if (u41Var.getBackground() != null) {
            Drawable background = u41Var.getBackground();
            vkb K = zkb.K(0.1f, i2);
            u41Var.setBackground(background);
            str = null;
            zkb.j(u41Var, background, K, null, wjbVar);
        } else {
            str = null;
        }
        u41Var.setText(k96.M0(2131752577, str));
        linearLayout2.addView(u41Var, nme.q(0, 48, 119.0f, 1, 0, 0, 5, 0));
        u41 i5 = yjb.i(24, wjbVar, context, true);
        i5.setText(k96.M0(2131751729, null));
        linearLayout2.addView(i5, nme.q(0, 48, 119.0f, 1, 5, 0, 0, 0));
        h.T0 = false;
        h.Q0 = true;
        h.r = true;
        h.t0(bkb.Z6);
        h.K();
        new WeakReference(h);
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        String[] strArr = new String[1];
        int[] iArr2 = {-1};
        int[] iArr3 = {-1};
        int[] iArr4 = new int[1];
        Runnable[] runnableArr = new Runnable[1];
        int[] iArr5 = {4};
        eg egVar = new eg(h, i, (byte) 28);
        String b = b(treeSet);
        if (TextUtils.isEmpty(b)) {
            N2 = k96.M0(2131751714, null);
            iArr = iArr5;
            it3Var = it3Var2;
        } else {
            iArr = iArr5;
            it3Var = it3Var2;
            N2 = gl.N2(k96.a0(null, null, 2131751708, b), i3, wjbVar, egVar, false);
        }
        jn1 jn1Var = new jn1(mhbVar2, N2, wjbVar, (byte) 29);
        tn6 tn6Var = new tn6(iArr4, runnableArr, iArr3, i, (byte) 19);
        gu2 gu2Var = new gu2(it3Var3, treeSet, (byte) 10);
        wz2 wz2Var = new wz2(zArr2, iArr2, tn6Var, strArr, i5, it3Var3, treeSet, jn1Var, mhbVar2, wjbVar, iArr4, runnableArr, iArr3, i, egVar, h);
        jn1Var.run();
        xz2 xz2Var = new xz2(zArr2, iArr2, it3Var3, treeSet, strArr, wz2Var, it3Var, iArr, tn6Var, i5, z, i, user, zArr, p8cVar, h, egVar, wjbVar, mhbVar2, context);
        it3Var3.d.addTextChangedListener(new yz2(gu2Var, wz2Var));
        gu2Var.run();
        if (!TextUtils.isEmpty(str4)) {
            wz2Var.run();
        }
        it3Var3.d.setOnEditorActionListener(new j(xz2Var, (byte) 11));
        u41Var.setOnClickListener(new dh(h, (byte) 5));
        i5.setEnabled(false);
        i5.setOnClickListener(new x91(xz2Var, (byte) 20));
        h.setOnDismissListener(new vz2(zArr2, tn6Var, zArr, p8cVar, iArr2, i));
        h.show();
    }
}
