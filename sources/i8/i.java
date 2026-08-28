package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class i extends y5.a {
    public static final Parcelable.Creator<i> CREATOR = new c(5);
    public final int f10990a;

    public i(int i9) {
        this.f10990a = i9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f10990a);
        p8.r(parcel, q10);
    }
}
