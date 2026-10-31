package i8;

import android.os.Bundle;
import android.os.Parcelable;
import java.lang.reflect.Method;
import kotlin.jvm.internal.i;
import n6.l;
public abstract class d {
    public static void a(Throwable th2, Throwable exception) {
        i.e(th2, "<this>");
        i.e(exception, "exception");
        if (th2 != exception) {
            Integer num = hd.a.f7650a;
            if (num != null && num.intValue() < 19) {
                Method method = gd.a.f7469a;
                if (method != null) {
                    method.invoke(th2, exception);
                    return;
                }
                return;
            }
            th2.addSuppressed(exception);
        }
    }

    public static Parcelable b(String str, Bundle bundle) {
        ClassLoader classLoader = d.class.getClassLoader();
        l.g(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void c(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable b10 = b("MapOptions", bundle);
            if (b10 != null) {
                d(bundle2, "MapOptions", b10);
            }
            Parcelable b11 = b("StreetViewPanoramaOptions", bundle);
            if (b11 != null) {
                d(bundle2, "StreetViewPanoramaOptions", b11);
            }
            Parcelable b12 = b("camera", bundle);
            if (b12 != null) {
                d(bundle2, "camera", b12);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    public static void d(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = d.class.getClassLoader();
        l.g(classLoader);
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
