package b5;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import gd.i;
import gd.j;
public abstract class a {
    public static d a(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 != null) {
                bundle2.setClassLoader(a.class.getClassLoader());
                Parcelable parcelable = bundle2.getParcelable("a");
                if (parcelable instanceof ParcelImpl) {
                    return ((ParcelImpl) parcelable).f2833a;
                }
                throw new IllegalArgumentException("Invalid parcel");
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static gd.c b(rd.a aVar) {
        gd.d[] dVarArr = gd.d.f13473a;
        j jVar = j.f13484a;
        ?? obj = new Object();
        obj.f13479a = aVar;
        obj.f13480b = jVar;
        return obj;
    }

    public static i c(rd.a initializer) {
        kotlin.jvm.internal.j.e(initializer, "initializer");
        return new i(initializer);
    }
}
