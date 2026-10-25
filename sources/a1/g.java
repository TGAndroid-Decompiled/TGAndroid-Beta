package a1;

import a8.e0;
import a8.z;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.i0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.i;
import m1.j;
import n4.s;
public abstract class g {
    public static void A(int i10, ArrayList arrayList) {
        arrayList.remove(arrayList.size() - i10);
    }

    public static void B(Object obj) {
        if (obj == null) {
            return;
        }
        throw new ClassCastException();
    }

    public static float C(float f7, float f10, float f11, float f12) {
        return ((f7 * f10) / f11) + f12;
    }

    public static String D(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static int E(String str) {
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

    public static final void a(int i10, View view, ViewGroup container) {
        i.e(view, "view");
        i.e(container, "container");
        if (i0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int c10 = j.c(i10);
        ViewGroup viewGroup = null;
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 == 3) {
                        if (i0.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (i0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                view.setVisibility(8);
                return;
            }
            if (i0.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup == null) {
                if (i0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        ViewParent parent2 = view.getParent();
        if (parent2 instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent2;
        }
        if (viewGroup != null) {
            if (i0.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
            }
            viewGroup.removeView(view);
        }
    }

    public static int b(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return E(str);
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public static float c(float f7, float f10, float f11, float f12) {
        return ((f7 / f10) * f11) + f12;
    }

    public static int d(int i10, int i11, int i12) {
        return androidx.datastore.preferences.protobuf.j.y(i10) + i11 + i12;
    }

    public static int e(int i10, int i11, int i12, int i13) {
        return androidx.datastore.preferences.protobuf.j.z(i10) + i11 + i12 + i13;
    }

    public static int f(int i10, int i11, String str) {
        return (str.hashCode() + i10) * i11;
    }

    public static z g(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new z(i10);
    }

    public static Bundle h(long j10, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(str, j10);
        return bundle;
    }

    public static Bundle i(String str, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z10);
        return bundle;
    }

    public static ClassCastException j(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String k(int i10, int i11, String str) {
        return i10 + str + i11;
    }

    public static String l(int i10, int i11, String str, String str2) {
        return str + i10 + str2 + i11;
    }

    public static String m(int i10, String str) {
        return i10 + str;
    }

    public static String n(int i10, String str, StringBuilder sb2) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    public static String o(long j10, String str) {
        return str + j10;
    }

    public static String p(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String q(String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String r(StringBuilder sb2, long j10, String str) {
        sb2.append(j10);
        sb2.append(str);
        return sb2.toString();
    }

    public static String s(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder t(long j10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j10);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder u(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder v(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder w(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static HashMap x(Class cls, z zVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, zVar);
        return hashMap;
    }

    public static ka.c y(int i10, s sVar) {
        Map unmodifiableMap;
        z zVar = new z(i10);
        if (((HashMap) sVar.f18697c) == null) {
            sVar.f18697c = new HashMap();
        }
        ((HashMap) sVar.f18697c).put(e0.class, zVar);
        String str = (String) sVar.f18696b;
        if (((HashMap) sVar.f18697c) == null) {
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            unmodifiableMap = DesugarCollections.unmodifiableMap(new HashMap((HashMap) sVar.f18697c));
        }
        return new ka.c(str, unmodifiableMap);
    }

    public static void z(int i10, String str, String str2) {
        e2.a.l(str2, str + i10);
    }
}
