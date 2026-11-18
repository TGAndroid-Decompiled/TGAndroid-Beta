package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);
    public final int f3014a;
    public final boolean f3015b;
    public final boolean f3016c;
    public final boolean d;
    public final boolean f3017e;

    public j(int i7, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f3014a = i7;
        this.f3015b = z10;
        this.f3016c = z11;
        this.d = z12;
        this.f3017e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f3014a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3015b ? 1 : 0);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f3016c ? 1 : 0);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f3017e ? 1 : 0);
        bc.s(parcel, r10);
    }
}
