package e6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class c implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int A = ce.b.A(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < A) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 != 1) {
                if (c3 != 2) {
                    if (c3 != 3) {
                        if (c3 != 4) {
                            ce.b.z(parcel, readInt);
                        } else {
                            str2 = ce.b.i(parcel, readInt);
                        }
                    } else {
                        str = ce.b.i(parcel, readInt);
                    }
                } else {
                    z10 = ce.b.o(parcel, readInt);
                }
            } else {
                arrayList = ce.b.m(parcel, readInt, w5.c.CREATOR);
            }
        }
        ce.b.n(parcel, A);
        return new a(arrayList, z10, str, str2);
    }

    @Override
    public final Object[] newArray(int i10) {
        return new a[i10];
    }
}
