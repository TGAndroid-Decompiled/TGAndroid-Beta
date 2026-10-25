package b9;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class t {
    public static final int f3715a = 0;

    static {
        t.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
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
        throw new BadParcelableException(ic.a.i(dataAvail, "Parcel data not fully consumed, unread size: "));
    }
}
