package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class q implements Parcelable.Creator {
    public final int f3910a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3910a) {
            case 0:
                return new s(parcel);
            case 1:
                return new r(parcel);
            default:
                return new i1(parcel);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f3910a) {
            case 0:
                return new s[i10];
            case 1:
                return new r[i10];
            default:
                return new i1[i10];
        }
    }
}
