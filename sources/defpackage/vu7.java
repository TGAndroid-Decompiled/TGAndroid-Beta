package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
public abstract class vu7 {
    public static final is6 a = new is6((byte) 5);

    public static defpackage.gm2 a(defpackage.zde r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu7.a(zde, boolean):gm2");
    }

    public static aac b(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 != null) {
                bundle2.setClassLoader(vu7.class.getClassLoader());
                Parcelable parcelable = bundle2.getParcelable("a");
                if (parcelable instanceof ParcelImpl) {
                    return ((ParcelImpl) parcelable).a;
                }
                throw new IllegalArgumentException("Invalid parcel");
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
