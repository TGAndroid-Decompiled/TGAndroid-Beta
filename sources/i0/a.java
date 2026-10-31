package i0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import b2.w;
import b2.x;
import c3.k0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.u1;
import v7.t6;
public abstract class a {
    public static String A(int i10) {
        switch (i10) {
            case 1:
                return "IDLE";
            case 2:
                return "STARTING";
            case 3:
                return "RECORDING";
            case 4:
                return "PAUSING";
            case 5:
                return "PREVIEWING";
            case 6:
                return "RESUMING";
            case 7:
                return "FINISHING";
            case 8:
                return "COMPLETED";
            case 9:
                return "ERROR";
            case 10:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static int a(int i10, int i11, int i12, int i13) {
        return i10 | i11 | i12 | 128 | i13;
    }

    public static boolean b(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            if (!z10 || i11 != 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static double c(double d, double d10, double d11) {
        return (Math.cos(d) * d10) + d11;
    }

    public static int d(float f7, int i10, int i11) {
        return Math.max(i11, i10 - i0.L(f7));
    }

    public static int e(int i10, int i11, int i12, int i13) {
        return ((i10 - i11) * i12) + i13;
    }

    public static Drawable f(Context context, int i10) {
        return context.getResources().getDrawable(i10).mutate();
    }

    public static Object g(int i10, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i10);
    }

    public static Object h(HashMap hashMap, Uri uri, Uri uri2) {
        t6.p(hashMap.containsKey(uri));
        return hashMap.get(uri2);
    }

    public static String i(int i10, String str) {
        return str + i10;
    }

    public static String j(int i10, String str, String str2) {
        return str + i10 + str2;
    }

    public static String k(long j10, char c10, StringBuilder sb2) {
        sb2.append(cd.E(j10, c10));
        return sb2.toString();
    }

    public static StringBuilder l(int i10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder m(String str, int i10, String str2, int i11, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
        return sb2;
    }

    public static HashMap n(Class cls, ma.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static Map o(HashMap hashMap) {
        return DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void p(int i10, StringBuilder sb2) {
        sb2.append(i10);
        f8.b(sb2.toString());
    }

    public static void q(long j10, StringBuilder sb2) {
        sb2.append(j10);
        f8.b(sb2.toString());
    }

    public static void r(w wVar, k0 k0Var) {
        k0Var.b(new x(wVar));
    }

    public static void s(String str, int i10, AlertDialog$Builder alertDialog$Builder, u1 u1Var) {
        alertDialog$Builder.h(cd.L0(i10, str), u1Var);
        alertDialog$Builder.p();
    }

    public static void t(StringBuilder sb2, int i10, String str, int i11, String str2) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
    }

    public static int u(int i10, int i11, int i12, int i13) {
        return ((i10 - i11) / i12) + i13;
    }

    public static Object v(int i10, ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - i10);
    }

    public static void w(String str, int i10, AlertDialog$Builder alertDialog$Builder, u1 u1Var) {
        alertDialog$Builder.k(cd.L0(i10, str), u1Var);
        alertDialog$Builder.p();
    }

    public static void x(n2.g gVar, n2.g gVar2) {
        if (gVar != gVar2) {
            if (gVar2 != null) {
                gVar2.b(null);
            }
            if (gVar != null) {
                gVar.a(null);
            }
        }
    }

    public static String y(int i10) {
        switch (i10) {
            case 1:
                return "IDLE";
            case 2:
                return "STARTING";
            case 3:
                return "RECORDING";
            case 4:
                return "PAUSING";
            case 5:
                return "PREVIEWING";
            case 6:
                return "RESUMING";
            case 7:
                return "FINISHING";
            case 8:
                return "COMPLETED";
            case 9:
                return "ERROR";
            case 10:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static String z(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return "null";
                    }
                    return "ERROR";
                }
                return "CANCELLED";
            }
            return "AUDIO_REMOVED";
        }
        return "TRIMMED";
    }
}
