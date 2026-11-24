package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class gpd {
    public static final int a = 0;

    static {
        gpd.class.getClassLoader();
    }

    public static void a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
