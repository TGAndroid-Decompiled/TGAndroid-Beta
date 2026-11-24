package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class dbd {
    public static final int a = 0;

    static {
        dbd.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
