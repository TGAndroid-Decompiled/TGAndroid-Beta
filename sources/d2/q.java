package d2;

import android.os.Parcel;
import android.os.Parcelable;
public final class q implements Parcelable.Creator {
    public final int f8286a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f8286a) {
            case 0:
                return new s(parcel);
            case 1:
                return new r(parcel);
            default:
                return new h1(parcel);
        }
    }

    @Override
    public final Object[] newArray(int i3) {
        switch (this.f8286a) {
            case 0:
                return new s[i3];
            case 1:
                return new r[i3];
            default:
                return new h1[i3];
        }
    }
}
