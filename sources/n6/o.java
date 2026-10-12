package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new m8.h(17);
    public final int f16448a;
    public final boolean f16449b;
    public final boolean f16450c;
    public final int d;
    public final int f16451e;

    public o(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.f16448a = i10;
        this.f16449b = z10;
        this.f16450c = z11;
        this.d = i11;
        this.f16451e = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 1, 4);
        parcel.writeInt(this.f16448a);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f16449b ? 1 : 0);
        w7.c0.s(parcel, 3, 4);
        parcel.writeInt(this.f16450c ? 1 : 0);
        w7.c0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.c0.s(parcel, 5, 4);
        parcel.writeInt(this.f16451e);
        w7.c0.r(parcel, q6);
    }
}
