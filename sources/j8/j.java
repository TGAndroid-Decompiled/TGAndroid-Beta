package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class j extends z5.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);

    public final int f12793a;

    public final boolean f12794b;

    public final boolean f12795c;
    public final boolean d;

    public final boolean f12796e;

    public j(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f12793a = i10;
        this.f12794b = z10;
        this.f12795c = z11;
        this.d = z12;
        this.f12796e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f12793a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12794b ? 1 : 0);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f12795c ? 1 : 0);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.f12796e ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
