package d6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.q8;
import java.util.ArrayList;

public final class c implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iZ = q8.z(parcel);
        ArrayList arrayListL = null;
        String strH = null;
        String strH2 = null;
        boolean zN = false;
        while (parcel.dataPosition() < iZ) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                arrayListL = q8.l(parcel, i10, v5.c.CREATOR);
            } else if (c10 == 2) {
                zN = q8.n(parcel, i10);
            } else if (c10 == 3) {
                strH = q8.h(parcel, i10);
            } else if (c10 != 4) {
                q8.y(parcel, i10);
            } else {
                strH2 = q8.h(parcel, i10);
            }
        }
        q8.m(parcel, iZ);
        return new a(arrayListL, zN, strH, strH2);
    }

    @Override
    public final Object[] newArray(int i10) {
        return new a[i10];
    }
}
