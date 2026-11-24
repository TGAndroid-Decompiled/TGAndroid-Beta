package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
public abstract class pjd {
    public static final o94 a;
    public static final o94[] b;

    static {
        o94 o94Var = new o94("register", -1, 1L, true);
        a = o94Var;
        b = new o94[]{o94Var, new o94("unregister", -1, 1L, true)};
    }

    public static Parcelable a(String str, Bundle bundle) {
        ClassLoader classLoader = pjd.class.getClassLoader();
        ite.h(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void b(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable a2 = a("MapOptions", bundle);
            if (a2 != null) {
                c(bundle2, "MapOptions", a2);
            }
            Parcelable a3 = a("StreetViewPanoramaOptions", bundle);
            if (a3 != null) {
                c(bundle2, "StreetViewPanoramaOptions", a3);
            }
            Parcelable a4 = a("camera", bundle);
            if (a4 != null) {
                c(bundle2, "camera", a4);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    public static void c(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = pjd.class.getClassLoader();
        ite.h(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
