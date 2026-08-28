package j3;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import f2.a1;
import f2.q1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Components.ik0;
public abstract class r0 {
    public static void A(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static void B(of.m mVar, int i9, ArrayList arrayList) {
        arrayList.add(new of.k(mVar, i9));
    }

    public static float C(float f10, float f11, float f12, float f13) {
        return f13 - ((f10 - f11) * f12);
    }

    public static void D(l3.e eVar, l3.e eVar2) {
        if (eVar != eVar2) {
            if (eVar2 != null) {
                eVar2.p(null);
            }
            if (eVar != null) {
                eVar.k(null);
            }
        }
    }

    public static void a(m3.w wVar, d5.y yVar, int i9) {
        wVar.d(i9, yVar);
    }

    public static double b(double d, double d9, double d10) {
        return (Math.cos(d) * d9) + d10;
    }

    public static float c(float f10, float f11, float f12, float f13) {
        return ((f10 + f11) / f12) + f13;
    }

    public static int d(int i9, int i10, int i11, int i12) {
        return ((i9 - i10) / i11) + i12;
    }

    public static int e(int i9, int i10, int i11, ArrayList arrayList) {
        arrayList.add(Integer.valueOf(i9));
        return i10 + i11;
    }

    public static int f(int i9, int i10, String str) {
        return (str.hashCode() + i9) * i10;
    }

    public static int g(int i9, int i10, ArrayList arrayList) {
        return i10 - (arrayList.size() + i9);
    }

    public static TextView h(LinearLayout linearLayout, TextView textView, LinearLayout.LayoutParams layoutParams, Context context) {
        linearLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static j7.s i(int i9, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new j7.s(i9);
    }

    public static Object j(int i9, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i9);
    }

    public static Object k(int i9, List list) {
        return list.get(list.size() - i9);
    }

    public static String l(int i9, String str) {
        return str + i9;
    }

    public static String m(int i9, String str, String str2) {
        return str + i9 + str2;
    }

    public static String n(long j10, char c10, StringBuilder sb2) {
        sb2.append(LocaleController.formatNumber(j10, c10));
        return sb2.toString();
    }

    public static String o(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static StringBuilder p(int i9, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i9);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder q(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static HashMap r(Class cls, j7.s sVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, sVar);
        return hashMap;
    }

    public static ik0 s(View view, View view2, int i9, int i10) {
        view.setLayoutParams(new a1(i9, i10));
        return new q1(view2);
    }

    public static q9.c t(int i9, e3 e3Var) {
        Map unmodifiableMap;
        j7.s sVar = new j7.s(i9);
        if (((HashMap) e3Var.f24287c) == null) {
            e3Var.f24287c = new HashMap();
        }
        ((HashMap) e3Var.f24287c).put(j7.w.class, sVar);
        String str = (String) e3Var.f24286b;
        if (((HashMap) e3Var.f24287c) == null) {
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            unmodifiableMap = DesugarCollections.unmodifiableMap(new HashMap((HashMap) e3Var.f24287c));
        }
        return new q9.c(str, unmodifiableMap);
    }

    public static void u(float f10, int i9, TextView textView) {
        textView.setTextSize(i9, f10);
        textView.setTypeface(AndroidUtilities.bold());
    }

    public static void v(int i9, AlertDialog$Builder alertDialog$Builder, b2 b2Var) {
        alertDialog$Builder.h(LocaleController.getString(i9), b2Var);
        alertDialog$Builder.o();
    }

    public static void w(int i9, boolean[] zArr, boolean z10, TextView textView, int i10) {
        textView.setTextColor(f6.w0(zArr, i9, z10));
        textView.setGravity(i10);
    }

    public static void x(String str, StringBuilder sb2) {
        sb2.append(str);
        FileLog.d(sb2.toString());
    }

    public static void y(StringBuilder sb2, int i9, String str, int i10, String str2) {
        sb2.append(i9);
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
    }

    public static void z(StringBuilder sb2, long j10) {
        sb2.append(j10);
        FileLog.d(sb2.toString());
    }
}
