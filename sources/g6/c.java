package g6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.l0;
import java.util.ArrayList;
public final class c implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int z4 = l0.z(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < z4) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 != 1) {
                if (c3 != 2) {
                    if (c3 != 3) {
                        if (c3 != 4) {
                            l0.y(parcel, readInt);
                        } else {
                            str2 = l0.h(parcel, readInt);
                        }
                    } else {
                        str = l0.h(parcel, readInt);
                    }
                } else {
                    z10 = l0.n(parcel, readInt);
                }
            } else {
                arrayList = l0.l(parcel, readInt, y5.c.CREATOR);
            }
        }
        l0.m(parcel, z4);
        return new a(arrayList, z10, str, str2);
    }

    @Override
    public final Object[] newArray(int i10) {
        return new a[i10];
    }
}
