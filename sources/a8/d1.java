package a8;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class d1 {
    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b(Parcel parcel, Parcelable parcelable, int i10) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i10);
            return;
        }
        parcel.writeInt(0);
    }
}
