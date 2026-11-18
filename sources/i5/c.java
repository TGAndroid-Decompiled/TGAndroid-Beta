package i5;

import ab.c0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.l41;
import v4.f1;
import v4.q0;
public abstract class c {
    public static void A(jg.m mVar, int i7, ArrayList arrayList) {
        arrayList.add(new jg.k(mVar, i7));
    }

    public static boolean B(String str, String str2, String str3) {
        return str3.contains(str + str2);
    }

    public static int C(int i7, int i10, int i11, int i12) {
        return Math.max(i12, Math.min(Math.max(i7, i10), i11));
    }

    public static int D(int i7, int i10, int i11, int i12) {
        return Math.max(i12, Math.min(Math.min(i7, i10), i11));
    }

    public static int a(int i7, int i10, int i11, int i12) {
        return i7 | i10 | i11 | 128 | i12;
    }

    public static boolean b(int i7, boolean z10) {
        int i10 = i7 & 7;
        if (i10 != 4) {
            if (!z10 || i10 != 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static double c(double d, double d2, double d10) {
        return (Math.cos(d) * d2) + d10;
    }

    public static int d(float f10, int i7, int i10) {
        return Math.max(i10, i7 - g0.L(f10));
    }

    public static int e(int i7, int i10, int i11, int i12) {
        return ((i7 - i10) / i11) + i12;
    }

    public static int f(int i7, int i10, ArrayList arrayList) {
        return i10 - (arrayList.size() + i7);
    }

    public static Drawable g(Context context, int i7) {
        return context.getResources().getDrawable(i7).mutate();
    }

    public static Object h(int i7, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i7);
    }

    public static String i(int i7, String str) {
        return str + i7;
    }

    public static String j(int i7, String str, String str2) {
        return str + i7 + str2;
    }

    public static String k(int i7, String str, StringBuilder sb2) {
        sb2.append(gd.M0(i7, str));
        return sb2.toString();
    }

    public static String l(long j3, char c10, StringBuilder sb2) {
        sb2.append(gd.E(j3, c10));
        return sb2.toString();
    }

    public static StringBuilder m(int i7, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i7);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder n(String str, int i7, String str2, int i10, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i7);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        return sb2;
    }

    public static HashMap o(Class cls, qa.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static Map p(HashMap hashMap) {
        return DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static kj0 q(View view, View view2, int i7, int i10) {
        view.setLayoutParams(new q0(i7, i10));
        return new f1(view2);
    }

    public static void r(float f10, int i7, int i10, TextView textView, String str) {
        textView.setTextSize(i7, f10);
        textView.setText(gd.M0(i10, str));
    }

    public static void s(int i7, String str, ArrayList arrayList) {
        arrayList.add(l41.u(gd.M0(i7, str)));
    }

    public static void t(int i7, StringBuilder sb2) {
        sb2.append(i7);
        a8.b(sb2.toString());
    }

    public static void u(int i7, HashMap hashMap, String str, int i10, String str2) {
        hashMap.put(Integer.valueOf(i7), str);
        hashMap.put(Integer.valueOf(i10), str2);
    }

    public static void v(long j3, StringBuilder sb2) {
        sb2.append(j3);
        a8.b(sb2.toString());
    }

    public static void w(c0 c0Var) {
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(c0Var);
    }

    public static void x(TextView textView, int i7, float f10) {
        textView.setTextSize(i7, f10);
        textView.setTypeface(g0.o());
    }

    public static void y(String str, int i7, AlertDialog$Builder alertDialog$Builder, r1 r1Var) {
        alertDialog$Builder.h(gd.M0(i7, str), r1Var);
        alertDialog$Builder.p();
    }

    public static void z(StringBuilder sb2, int i7, String str, int i10, String str2) {
        sb2.append(i7);
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
    }
}
