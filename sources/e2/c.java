package e2;

import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
public abstract class c {
    public static float A(float f10, float f11, float f12, float f13) {
        return (f10 * f11) + f12 + f13;
    }

    public static int B(String str) {
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
            return B(str);
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public static int b(int i10, int i11, int i12) {
        return i10 | i11 | i12 | 128;
    }

    public static int c(int i10) {
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    if (i10 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i11;
    }

    public static float d(float f10, float f11, float f12, float f13) {
        return (f12 - (f10 * f11)) / f13;
    }

    public static int e(int i10, int i11, int i12, int i13) {
        return ((i10 - i11) * i12) + i13;
    }

    public static j7.e f(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new j7.e(i10);
    }

    public static Object g(int i10, ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - i10);
    }

    public static String h(int i10, String str, int i11) {
        return i10 + str + i11;
    }

    public static String i(long j10, String str, String str2) {
        return str + j10 + str2;
    }

    public static String j(String str, int i10, int i11) {
        return str.substring(i11, str.length() - i10);
    }

    public static String k(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static StringBuilder l(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder m(String str, int i10, String str2, int i11, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i10);
        sb.append(str2);
        sb.append(i11);
        sb.append(str3);
        return sb;
    }

    public static HashMap n(Class cls, j7.e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, eVar);
        return hashMap;
    }

    public static HashMap o(Class cls, k7.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static k7.a p(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new k7.a(i10);
    }

    public static void q(int i10, String str, String str2) {
        h5.a.K(str2, str + i10);
    }

    public static void r(HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static boolean s(Object obj) {
        if (obj != null) {
            return true;
        }
        return false;
    }

    public static boolean t(String str) {
        return new File(str).exists();
    }

    public static float u(float f10, float f11, float f12, float f13) {
        return (f10 * f11 * f12) + f13;
    }

    public static float v(float f10, float f11, float f12, float f13) {
        return ((f10 * f11) + f12) / f13;
    }

    public static float w(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static float x(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) / f12) + f13;
    }

    public static float y(float f10, float f11, float f12, float f13) {
        return ((f10 * f11) + f12) * f13;
    }

    public static float z(float f10, float f11, float f12, float f13) {
        return f10 * f11 * f12 * f13;
    }
}
