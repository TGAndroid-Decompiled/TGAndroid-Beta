package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends q6.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);
    public final int f206a;
    public final boolean f207b;
    public final boolean f208c;
    public final boolean d;
    public final boolean f209e;

    public j(int i3, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f206a = i3;
        this.f207b = z10;
        this.f208c = z11;
        this.d = z12;
        this.f209e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f206a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f207b ? 1 : 0);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f208c ? 1 : 0);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.f209e ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
