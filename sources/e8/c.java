package e8;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class c {
    public static final int f8906a = 0;

    static {
        c.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
