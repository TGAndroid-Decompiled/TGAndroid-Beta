package jg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.yi0;
public abstract class g {
    public static boolean A(String str, String str2, String str3) {
        return str3.contains(str + str2);
    }

    public static int B(int i7, int i10, int i11, int i12) {
        return Math.max(i12, Math.min(Math.min(i7, i10), i11));
    }

    public static void C(String str, int i7, AlertDialog$Builder alertDialog$Builder, org.telegram.ui.ActionBar.r1 r1Var) {
        alertDialog$Builder.k(id.M0(i7, str), r1Var);
        alertDialog$Builder.p();
    }

    public static int D(int i7, int i10, int i11, int i12) {
        return ((i7 - i10) / i11) + i12;
    }

    public static String E(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        return "null";
                    }
                    return "FROSTED_FILTERED";
                }
                return "FROSTED_GLASS";
            }
            return "GLASS";
        }
        return "BLURRED";
    }

    public static boolean a(int i7) {
        if (i7 != 0) {
            if (i7 != 3 && i7 != 4) {
                return false;
            }
            return true;
        }
        throw null;
    }

    public static int b(int i7, int i10, int i11, int i12) {
        return i7 | i10 | i11 | 128 | i12;
    }

    public static boolean c(int i7, boolean z9) {
        int i10 = i7 & 7;
        if (i10 != 4) {
            if (!z9 || i10 != 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static double d(double d, double d2, double d10) {
        return (Math.cos(d) * d2) + d10;
    }

    public static int e(float f10, int i7, int i10) {
        return Math.max(i10, i7 - org.telegram.messenger.g0.L(f10));
    }

    public static int f(int i7, int i10, int i11, int i12) {
        return Math.max(i12, Math.min(Math.max(i7, i10), i11));
    }

    public static int g(int i7, int i10, ArrayList arrayList) {
        return i10 - (arrayList.size() + i7);
    }

    public static Drawable h(Context context, int i7) {
        return context.getResources().getDrawable(i7).mutate();
    }

    public static Object i(int i7, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i7);
    }

    public static String j(int i7, String str) {
        return str + i7;
    }

    public static String k(int i7, String str, String str2) {
        return str + i7 + str2;
    }

    public static String l(int i7, String str, StringBuilder sb2) {
        sb2.append(id.M0(i7, str));
        return sb2.toString();
    }

    public static String m(long j3, char c10, StringBuilder sb2) {
        sb2.append(id.E(j3, c10));
        return sb2.toString();
    }

    public static StringBuilder n(int i7, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i7);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder o(String str, int i7, String str2, int i10, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i7);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        return sb2;
    }

    public static HashMap p(Class cls, qa.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static Map q(HashMap hashMap) {
        return DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static yi0 r(View view, View view2, int i7, int i10) {
        view.setLayoutParams(new v4.o0(i7, i10));
        return new v4.d1(view2);
    }

    public static void s(int i7, StringBuilder sb2) {
        sb2.append(i7);
        a8.b(sb2.toString());
    }

    public static void t(int i7, HashMap hashMap, String str, int i10, String str2) {
        hashMap.put(Integer.valueOf(i7), str);
        hashMap.put(Integer.valueOf(i10), str2);
    }

    public static void u(long j3, StringBuilder sb2) {
        sb2.append(j3);
        a8.b(sb2.toString());
    }

    public static void v(TextView textView, int i7, float f10, String str, int i10) {
        textView.setTextSize(i7, f10);
        textView.setText(id.M0(i10, str));
    }

    public static void w(String str, int i7, AlertDialog$Builder alertDialog$Builder, org.telegram.ui.ActionBar.r1 r1Var) {
        alertDialog$Builder.h(id.M0(i7, str), r1Var);
        alertDialog$Builder.p();
    }

    public static void x(StringBuilder sb2, int i7, String str, int i10, String str2) {
        sb2.append(i7);
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
    }

    public static void y(n nVar, int i7, ArrayList arrayList) {
        arrayList.add(new l(nVar, i7));
    }

    public static void z(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
    }
}
