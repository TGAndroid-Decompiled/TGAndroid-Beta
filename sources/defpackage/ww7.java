package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
public abstract class ww7 {
    public static final ju6 a = new ju6((byte) 5);

    public static defpackage.tn2 a(defpackage.age r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww7.a(age, boolean):tn2");
    }

    public static bcc b(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 != null) {
                bundle2.setClassLoader(ww7.class.getClassLoader());
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
