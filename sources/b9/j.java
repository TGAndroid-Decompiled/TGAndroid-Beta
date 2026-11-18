package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);
    public final int f3013a;
    public final boolean f3014b;
    public final boolean f3015c;
    public final boolean d;
    public final boolean f3016e;

    public j(int i7, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f3013a = i7;
        this.f3014b = z10;
        this.f3015c = z11;
        this.d = z12;
        this.f3016e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f3013a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3014b ? 1 : 0);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f3015c ? 1 : 0);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f3016e ? 1 : 0);
        bc.s(parcel, r10);
    }
}
