package o4;

import android.os.Parcel;
import android.os.Parcelable;
public final class s implements Parcelable.Creator {
    public final int f18935a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f18935a) {
            case 0:
                return new u(parcel);
            default:
                return new t(parcel);
        }
    }

    @Override
    public final Object[] newArray(int i9) {
        switch (this.f18935a) {
            case 0:
                return new u[i9];
            default:
                return new t[i9];
        }
    }
}
