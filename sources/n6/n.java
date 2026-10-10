package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new m8.h(17);
    public final int f16700a;
    public final boolean f16701b;
    public final boolean f16702c;
    public final int d;
    public final int f16703e;

    public n(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.f16700a = i10;
        this.f16701b = z10;
        this.f16702c = z11;
        this.d = i11;
        this.f16703e = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f16700a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f16701b ? 1 : 0);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f16702c ? 1 : 0);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.d0.s(parcel, 5, 4);
        parcel.writeInt(this.f16703e);
        w7.d0.r(parcel, q6);
    }
}
