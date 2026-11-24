package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class tle {
    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
            return;
        }
        parcel.writeInt(0);
    }
}
