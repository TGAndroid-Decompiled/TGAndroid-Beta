package h8;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import k2.p1;
public abstract class a {
    public static final int f14352a = 0;

    static {
        a.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException(p1.i(dataAvail, "Parcel data not fully consumed, unread size: "));
    }
}
