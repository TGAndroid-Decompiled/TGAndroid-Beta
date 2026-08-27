package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class n0 extends z5.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0(0);

    public final int f12812a;

    public final f f12813b;

    public n0(int i10, f fVar) {
        this.f12812a = i10;
        this.f12813b = fVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12812a);
        r8.k(parcel, 3, this.f12813b, i10);
        r8.r(parcel, iQ);
    }
}
