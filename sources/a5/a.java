package a5;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
public abstract class a {
    public static d a(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 != null) {
                bundle2.setClassLoader(a.class.getClassLoader());
                Parcelable parcelable = bundle2.getParcelable("a");
                if (parcelable instanceof ParcelImpl) {
                    return ((ParcelImpl) parcelable).f2316a;
                }
                throw new IllegalArgumentException("Invalid parcel");
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }
}
