package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class ake {
    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }
}
