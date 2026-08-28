package n5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import m6.r0;
public final class c0 extends y5.a {
    public static final Parcelable.Creator<c0> CREATOR = new r0(26);
    public final int f18484a;

    public c0(int i9) {
        this.f18484a = i9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f18484a);
        p8.r(parcel, q10);
    }
}
