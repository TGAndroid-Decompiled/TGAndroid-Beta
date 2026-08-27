package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class u0 extends z5.a {
    public static final Parcelable.Creator<u0> CREATOR = new o0(6);

    public final int f12841a;

    public final int f12842b;

    public u0(int i10, int i11) {
        this.f12841a = i10;
        this.f12842b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12841a);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f12842b);
        r8.r(parcel, iQ);
    }
}
