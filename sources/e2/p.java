package e2;

import android.os.Parcel;
import android.os.Parcelable;
public final class p implements Parcelable.Creator {
    public final int f10461a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10461a) {
            case 0:
                return new r(parcel);
            case 1:
                return new q(parcel);
            default:
                return new f1(parcel);
        }
    }

    @Override
    public final Object[] newArray(int i7) {
        switch (this.f10461a) {
            case 0:
                return new r[i7];
            case 1:
                return new q[i7];
            default:
                return new f1[i7];
        }
    }
}
