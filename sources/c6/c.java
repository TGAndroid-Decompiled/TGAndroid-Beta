package c6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.o8;
import java.util.ArrayList;
public final class c implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int z10 = o8.z(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z11 = false;
        while (parcel.dataPosition() < z10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            o8.y(parcel, readInt);
                        } else {
                            str2 = o8.h(parcel, readInt);
                        }
                    } else {
                        str = o8.h(parcel, readInt);
                    }
                } else {
                    z11 = o8.n(parcel, readInt);
                }
            } else {
                arrayList = o8.l(parcel, readInt, u5.c.CREATOR);
            }
        }
        o8.m(parcel, z10);
        return new a(arrayList, z11, str, str2);
    }

    @Override
    public final Object[] newArray(int i9) {
        return new a[i9];
    }
}
