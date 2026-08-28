package e2;

import android.os.Bundle;
import android.os.Parcel;
import h7.e0;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public abstract class c {
    public static float A(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) / f12) + f13;
    }

    public static float B(float f10, float f11, float f12, float f13) {
        return ((f10 * f11) + f12) * f13;
    }

    public static float C(float f10, float f11, float f12, float f13) {
        return f10 * f11 * f12 * f13;
    }

    public static int D(String str) {
        if (str != null) {
            if (str.equals("GET")) {
                return 1;
            }
            if (str.equals("PUT")) {
                return 2;
            }
            if (str.equals("POST")) {
                return 3;
            }
            if (str.equals("DELETE")) {
                return 4;
            }
            if (str.equals("HEAD")) {
                return 5;
            }
            if (str.equals("OPTIONS")) {
                return 6;
            }
            if (str.equals("TRACE")) {
                return 7;
            }
            if (str.equals("CONNECT")) {
                return 8;
            }
            if (str.equals("PATCH")) {
                return 9;
            }
            if (str.equals("PROPFIND")) {
                return 10;
            }
            if (str.equals("PROPPATCH")) {
                return 11;
            }
            if (str.equals("MKCOL")) {
                return 12;
            }
            if (str.equals("MOVE")) {
                return 13;
            }
            if (str.equals("COPY")) {
                return 14;
            }
            if (str.equals("LOCK")) {
                return 15;
            }
            if (str.equals("UNLOCK")) {
                return 16;
            }
            throw new IllegalArgumentException("No enum constant fi.iki.elonen.NanoHTTPD.Method.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }

    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return D(str);
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public static int b(int i9, int i10, int i11) {
        return i9 | i10 | i11 | 128;
    }

    public static int c(int i9) {
        int i10 = 1;
        if (i9 != 1) {
            i10 = 2;
            if (i9 != 2) {
                i10 = 3;
                if (i9 != 3) {
                    if (i9 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i10;
    }

    public static float d(float f10, float f11, float f12, float f13) {
        return (f12 - (f10 * f11)) / f13;
    }

    public static int e(int i9, int i10, int i11, int i12) {
        return ((i9 - i10) * i11) + i12;
    }

    public static int f(Float f10, float f11) {
        return AndroidUtilities.dp(f10.floatValue() * f11);
    }

    public static Bundle g(long j10, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(str, j10);
        return bundle;
    }

    public static f7.e h(int i9, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new f7.e(i9);
    }

    public static g7.a i(int i9, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new g7.a(i9);
    }

    public static e0 j(int i9, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new e0(i9);
    }

    public static Object k(int i9, ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - i9);
    }

    public static String l(int i9, String str, int i10) {
        return i9 + str + i10;
    }

    public static String m(String str, int i9, int i10) {
        return str.substring(i10, str.length() - i9);
    }

    public static StringBuilder n(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder o(String str, int i9, String str2, int i10, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i9);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        return sb2;
    }

    public static UnsupportedOperationException p(Parcel parcel) {
        p7.a.b(parcel);
        return new UnsupportedOperationException();
    }

    public static HashMap q(Class cls, f7.e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, eVar);
        return hashMap;
    }

    public static HashMap r(Class cls, g7.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static HashMap s(Class cls, e0 e0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, e0Var);
        return hashMap;
    }

    public static void t(int i9, String str, String str2) {
        d5.a.K(str2, str + i9);
    }

    public static void u(HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static boolean v(Object obj) {
        if (obj != null) {
            return true;
        }
        return false;
    }

    public static boolean w(String str) {
        return new File(str).exists();
    }

    public static float x(float f10, float f11, float f12, float f13) {
        return (f10 * f11 * f12) + f13;
    }

    public static float y(float f10, float f11, float f12, float f13) {
        return ((f10 * f11) + f12) / f13;
    }

    public static float z(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }
}
