package b5;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import m.n2;
public abstract class a {
    public static android.content.res.ColorStateList a(android.content.Context r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: b5.a.a(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static Drawable b(Context context, int i7) {
        return n2.d().g(context, i7);
    }

    public static d c(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 != null) {
                bundle2.setClassLoader(a.class.getClassLoader());
                Parcelable parcelable = bundle2.getParcelable("a");
                if (parcelable instanceof ParcelImpl) {
                    return ((ParcelImpl) parcelable).f2884a;
                }
                throw new IllegalArgumentException("Invalid parcel");
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
