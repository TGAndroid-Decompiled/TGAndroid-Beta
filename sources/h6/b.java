package h6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import f7.t0;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new t0(19);
    public final int f14220a;
    public final int f14221b;
    public final int f14222c;

    public b(int i7, int i10, int i11) {
        this.f14220a = i7;
        this.f14221b = i10;
        this.f14222c = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f14220a);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f14221b);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.f14222c);
        xb.s(parcel, r10);
    }
}
