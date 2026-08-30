package kh;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.widget.LinearLayout;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.qc;
public abstract class a2 {
    public static void A(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
        sQLiteDatabase.executeFast(str3).stepThis().dispose();
    }

    public static void B(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
        sQLiteDatabase.executeFast(str3).stepThis().dispose();
        sQLiteDatabase.executeFast(str4).stepThis().dispose();
    }

    public static void C(int i10, AlertDialog$Builder alertDialog$Builder, org.telegram.ui.ActionBar.c2 c2Var) {
        alertDialog$Builder.k(LocaleController.getString(i10), c2Var);
        alertDialog$Builder.o();
    }

    public static void D(o3.i iVar, o3.i iVar2) {
        if (iVar != iVar2) {
            if (iVar2 != null) {
                iVar2.d(null);
            }
            if (iVar != null) {
                iVar.c(null);
            }
        }
    }

    public static double a(double d, double d10, double d11) {
        return (Math.cos(d) * d10) + d11;
    }

    public static float b(float f10, float f11, float f12, float f13) {
        return ((f10 + f11) / f12) + f13;
    }

    public static int c(float f10, int i10, int i11) {
        return Math.max(i11, i10 - AndroidUtilities.dp(f10));
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return ((i10 - i11) / i12) + i13;
    }

    public static int e(int i10, int i11, String str) {
        return (str.hashCode() + i10) * i11;
    }

    public static int f(Float f10, float f11) {
        return AndroidUtilities.dp(f10.floatValue() * f11);
    }

    public static Bundle g(long j10, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(str, j10);
        return bundle;
    }

    public static LinearLayout h(Activity activity, int i10) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(i10);
        return linearLayout;
    }

    public static Object i(int i10, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i10);
    }

    public static String j(int i10, String str) {
        return str + i10;
    }

    public static String k(int i10, String str, String str2) {
        return str + i10 + str2;
    }

    public static String l(long j10, char c3, StringBuilder sb) {
        sb.append(LocaleController.formatNumber(j10, c3));
        return sb.toString();
    }

    public static StringBuilder m(int i10, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i10);
        sb.append(str2);
        return sb;
    }

    public static UnsupportedOperationException n(Parcel parcel) {
        t7.a.b(parcel);
        return new UnsupportedOperationException();
    }

    public static HashMap o(Class cls, l7.e0 e0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, e0Var);
        return hashMap;
    }

    public static HashMap p(Class cls, n7.s sVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, sVar);
        return hashMap;
    }

    public static l7.e0 q(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new l7.e0(i10);
    }

    public static n7.s r(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new n7.s(i10);
    }

    public static u9.c s(int i10, q5.g0 g0Var) {
        Map unmodifiableMap;
        n7.s sVar = new n7.s(i10);
        if (((HashMap) g0Var.f42807c) == null) {
            g0Var.f42807c = new HashMap();
        }
        ((HashMap) g0Var.f42807c).put(n7.w.class, sVar);
        String str = (String) g0Var.f42806b;
        if (((HashMap) g0Var.f42807c) == null) {
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            unmodifiableMap = DesugarCollections.unmodifiableMap(new HashMap((HashMap) g0Var.f42807c));
        }
        return new u9.c(str, unmodifiableMap);
    }

    public static void t(int i10, StringBuilder sb) {
        sb.append(i10);
        FileLog.d(sb.toString());
    }

    public static void u(int i10, AlertDialog$Builder alertDialog$Builder, org.telegram.ui.ActionBar.c2 c2Var) {
        alertDialog$Builder.h(LocaleController.getString(i10), c2Var);
        alertDialog$Builder.o();
    }

    public static void v(int i10, qc qcVar, int i11, int i12) {
        qcVar.Q(i11, i12, LocaleController.getString(i10)).j();
    }

    public static void w(StringBuilder sb, int i10, String str, int i11, String str2) {
        sb.append(i10);
        sb.append(str);
        sb.append(i11);
        sb.append(str2);
    }

    public static void x(StringBuilder sb, long j10) {
        sb.append(j10);
        FileLog.d(sb.toString());
    }

    public static void y(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
    }

    public static void z(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
    }
}
