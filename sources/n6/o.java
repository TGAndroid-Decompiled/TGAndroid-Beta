package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new m8.h(17);
    public final int f16781a;
    public final boolean f16782b;
    public final boolean f16783c;
    public final int d;
    public final int f16784e;

    public o(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.f16781a = i10;
        this.f16782b = z10;
        this.f16783c = z11;
        this.d = i11;
        this.f16784e = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f16781a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f16782b ? 1 : 0);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f16783c ? 1 : 0);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.d0.s(parcel, 5, 4);
        parcel.writeInt(this.f16784e);
        w7.d0.r(parcel, q6);
    }
}
