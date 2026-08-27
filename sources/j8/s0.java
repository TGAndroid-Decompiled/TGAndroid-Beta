package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class s0 extends z5.a {
    public static final Parcelable.Creator<s0> CREATOR = new o0(4);

    public final int f12832a;

    public s0(int i10) {
        this.f12832a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12832a);
        r8.r(parcel, iQ);
    }
}
