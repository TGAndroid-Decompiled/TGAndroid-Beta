package b5;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.reflect.Method;
import kotlin.jvm.internal.j;
public abstract class a {
    public static void a(Throwable th2, Throwable exception) {
        j.e(th2, "<this>");
        j.e(exception, "exception");
        if (th2 != exception) {
            Integer num = nd.a.f21563a;
            if (num != null && num.intValue() < 19) {
                Method method = md.a.f21057a;
                if (method != null) {
                    method.invoke(th2, exception);
                    return;
                }
                return;
            }
            th2.addSuppressed(exception);
        }
    }

    public static d b(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 != null) {
                bundle2.setClassLoader(a.class.getClassLoader());
                Parcelable parcelable = bundle2.getParcelable("a");
                if (parcelable instanceof ParcelImpl) {
                    return ((ParcelImpl) parcelable).f2804a;
                }
                throw new IllegalArgumentException("Invalid parcel");
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
