package l8;

import android.os.Bundle;
import android.os.Parcelable;
import q6.m;
public abstract class c {
    public static Parcelable a(String str, Bundle bundle) {
        ClassLoader classLoader = c.class.getClassLoader();
        m.g(classLoader);
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
            Parcelable a10 = a("MapOptions", bundle);
            if (a10 != null) {
                c(bundle2, "MapOptions", a10);
            }
            Parcelable a11 = a("StreetViewPanoramaOptions", bundle);
            if (a11 != null) {
                c(bundle2, "StreetViewPanoramaOptions", a11);
            }
            Parcelable a12 = a("camera", bundle);
            if (a12 != null) {
                c(bundle2, "camera", a12);
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
        ClassLoader classLoader = c.class.getClassLoader();
        m.g(classLoader);
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
