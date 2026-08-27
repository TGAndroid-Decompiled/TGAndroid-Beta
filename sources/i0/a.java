package i0;

import android.os.Parcel;
import d5.z;
import i7.e0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import k7.s;
import m3.w;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.i6;

public abstract class a {
    public static void A(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
    }

    public static int B(int i10, int i11, int i12, int i13) {
        return ((i10 - i11) / i12) + i13;
    }

    public static void C(int i10, AlertDialog$Builder alertDialog$Builder, a2 a2Var) {
        alertDialog$Builder.k(LocaleController.getString(i10), a2Var);
        alertDialog$Builder.o();
    }

    public static void D(l3.f fVar, l3.f fVar2) {
        if (fVar == fVar2) {
            return;
        }
        if (fVar2 != null) {
            fVar2.e(null);
        }
        if (fVar != null) {
            fVar.h(null);
        }
    }

    public static void a(w wVar, z zVar, int i10) {
        wVar.d(i10, zVar);
    }

    public static double b(double d, double d10, double d11) {
        return (Math.cos(d) * d10) + d11;
    }

    public static float c(float f10, float f11, float f12, float f13) {
        return ((f10 + f11) / f12) + f13;
    }

    public static int d(float f10, int i10, int i11) {
        return Math.max(i11, i10 - AndroidUtilities.dp(f10));
    }

    public static int e(int i10, int i11, int i12, int i13) {
        return ((i10 - i11) * i12) + i13;
    }

    public static int f(int i10, int i11, int i12, ArrayList arrayList) {
        arrayList.add(Integer.valueOf(i10));
        return i11 + i12;
    }

    public static int g(int i10, int i11, String str) {
        return (str.hashCode() + i10) * i11;
    }

    public static e0 h(int i10, HashMap map) {
        DesugarCollections.unmodifiableMap(new HashMap(map));
        return new e0(i10);
    }

    public static Object i(int i10, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i10);
    }

    public static Object j(int i10, List list) {
        return list.get(list.size() - i10);
    }

    public static String k(int i10, String str) {
        return str + i10;
    }

    public static String l(int i10, String str, String str2) {
        return str + i10 + str2;
    }

    public static String m(long j10, char c10, StringBuilder sb2) {
        sb2.append(LocaleController.formatNumber(j10, c10));
        return sb2.toString();
    }

    public static String n(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static StringBuilder o(int i10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder p(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static UnsupportedOperationException q(Parcel parcel) {
        q7.a.b(parcel);
        return new UnsupportedOperationException();
    }

    public static HashMap r(Class cls, e0 e0Var) {
        HashMap map = new HashMap();
        map.put(cls, e0Var);
        return map;
    }

    public static HashMap s(Class cls, s sVar) {
        HashMap map = new HashMap();
        map.put(cls, sVar);
        return map;
    }

    public static s t(int i10, HashMap map) {
        DesugarCollections.unmodifiableMap(new HashMap(map));
        return new s(i10);
    }

    public static r9.c u(int i10, i6 i6Var) {
        s sVar = new s(i10);
        if (((HashMap) i6Var.f38985c) == null) {
            i6Var.f38985c = new HashMap();
        }
        ((HashMap) i6Var.f38985c).put(k7.w.class, sVar);
        return new r9.c((String) i6Var.f38984b, ((HashMap) i6Var.f38985c) == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap((HashMap) i6Var.f38985c)));
    }

    public static void v(int i10, StringBuilder sb2) {
        sb2.append(i10);
        FileLog.d(sb2.toString());
    }

    public static void w(int i10, AlertDialog$Builder alertDialog$Builder, a2 a2Var) {
        alertDialog$Builder.h(LocaleController.getString(i10), a2Var);
        alertDialog$Builder.o();
    }

    public static void x(StringBuilder sb2, int i10, String str, int i11, String str2) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
    }

    public static void y(StringBuilder sb2, long j10) {
        sb2.append(j10);
        FileLog.d(sb2.toString());
    }

    public static void z(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }
}
