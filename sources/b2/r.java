package b2;

import android.os.Parcel;
import android.os.Parcelable;
public final class r implements Parcelable.Creator {
    public final int f3361a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3361a) {
            case 0:
                return new t(parcel);
            case 1:
                return new s(parcel);
            default:
                return new j1(parcel);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f3361a) {
            case 0:
                return new t[i10];
            case 1:
                return new s[i10];
            default:
                return new j1[i10];
        }
    }
}
