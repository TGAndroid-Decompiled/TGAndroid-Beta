package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
public abstract class cy7 {
    public static final nu6 a = new nu6((byte) 5);

    public static defpackage.an2 a(defpackage.qie r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy7.a(qie, boolean):an2");
    }

    public static aec b(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 != null) {
                bundle2.setClassLoader(cy7.class.getClassLoader());
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
