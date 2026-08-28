package f7;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class r {
    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b(Parcel parcel, Parcelable parcelable, int i9) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i9);
            return;
        }
        parcel.writeInt(0);
    }
}
