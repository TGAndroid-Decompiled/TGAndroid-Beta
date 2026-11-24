package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class lid {
    public static final int a = 0;

    static {
        lid.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
