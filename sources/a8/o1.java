package a8;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class o1 {
    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b(Parcel parcel, Parcelable parcelable, int i7) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i7);
            return;
        }
        parcel.writeInt(0);
    }
}
