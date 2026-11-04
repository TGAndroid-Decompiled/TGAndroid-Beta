package b8;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class we {
    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }
}
