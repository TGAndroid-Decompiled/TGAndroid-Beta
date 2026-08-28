package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class j extends y5.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);
    public final int f10992a;
    public final boolean f10993b;
    public final boolean f10994c;
    public final boolean d;
    public final boolean f10995e;

    public j(int i9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f10992a = i9;
        this.f10993b = z10;
        this.f10994c = z11;
        this.d = z12;
        this.f10995e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f10992a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f10993b ? 1 : 0);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f10994c ? 1 : 0);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.f10995e ? 1 : 0);
        p8.r(parcel, q10);
    }
}
