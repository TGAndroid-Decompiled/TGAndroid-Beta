package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class zid {
    public static final int a = 0;

    static {
        zid.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
