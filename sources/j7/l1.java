package j7;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.tc;
public abstract class l1 {
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

    public static void C(int i10, AlertDialog$Builder alertDialog$Builder, org.telegram.ui.ActionBar.b2 b2Var) {
        alertDialog$Builder.k(LocaleController.getString(i10), b2Var);
        alertDialog$Builder.o();
    }

    public static void D(n3.e eVar, n3.e eVar2) {
        if (eVar != eVar2) {
            if (eVar2 != null) {
                eVar2.l(null);
            }
            if (eVar != null) {
                eVar.p(null);
            }
        }
    }

    public static void a(o3.w wVar, f5.w wVar2, int i10) {
        wVar.d(i10, wVar2);
    }

    public static double b(double d, double d10, double d11) {
        return (Math.cos(d) * d10) + d11;
    }

    public static float c(float f9, float f10, float f11, float f12) {
        return ((f9 + f10) / f11) + f12;
    }

    public static int d(float f9, int i10, int i11) {
        return Math.max(i11, i10 - AndroidUtilities.dp(f9));
    }

    public static int e(int i10, int i11, int i12, int i13) {
        return ((i10 - i11) / i12) + i13;
    }

    public static int f(int i10, int i11, String str) {
        return (str.hashCode() + i10) * i11;
    }

    public static Bundle g(long j10, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(str, j10);
        return bundle;
    }

    public static e0 h(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
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

    public static String m(long j10, char c3, StringBuilder sb2) {
        sb2.append(LocaleController.formatNumber(j10, c3));
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

    public static UnsupportedOperationException p(Parcel parcel) {
        r7.a.b(parcel);
        return new UnsupportedOperationException();
    }

    public static HashMap q(Class cls, l7.s sVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, sVar);
        return hashMap;
    }

    public static l7.s r(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new l7.s(i10);
    }

    public static s9.c s(int i10, oc.i iVar) {
        Map unmodifiableMap;
        l7.s sVar = new l7.s(i10);
        if (((HashMap) iVar.f19484c) == null) {
            iVar.f19484c = new HashMap();
        }
        ((HashMap) iVar.f19484c).put(l7.w.class, sVar);
        String str = (String) iVar.f19483b;
        if (((HashMap) iVar.f19484c) == null) {
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            unmodifiableMap = DesugarCollections.unmodifiableMap(new HashMap((HashMap) iVar.f19484c));
        }
        return new s9.c(str, unmodifiableMap);
    }

    public static void t(int i10, StringBuilder sb2) {
        sb2.append(i10);
        FileLog.d(sb2.toString());
    }

    public static void u(int i10, AlertDialog$Builder alertDialog$Builder, org.telegram.ui.ActionBar.b2 b2Var) {
        alertDialog$Builder.h(LocaleController.getString(i10), b2Var);
        alertDialog$Builder.o();
    }

    public static void v(int i10, tc tcVar, int i11, int i12) {
        tcVar.Q(i11, i12, LocaleController.getString(i10)).j();
    }

    public static void w(StringBuilder sb2, int i10, String str, int i11, String str2) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
    }

    public static void x(StringBuilder sb2, long j10) {
        sb2.append(j10);
        FileLog.d(sb2.toString());
    }

    public static void y(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
    }

    public static void z(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
    }
}
