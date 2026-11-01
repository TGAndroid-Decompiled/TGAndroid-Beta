package g8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new g(0);
    public final boolean f7456a;
    public final boolean f7457b;
    public final boolean f7458c;
    public final boolean d;
    public final boolean e;
    public final boolean f7459f;

    public f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f7456a = z10;
        this.f7457b = z11;
        this.f7458c = z12;
        this.d = z13;
        this.e = z14;
        this.f7459f = z15;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.f7456a ? 1 : 0);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f7457b ? 1 : 0);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.f7458c ? 1 : 0);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        h0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        h0.s(parcel, 6, 4);
        parcel.writeInt(this.f7459f ? 1 : 0);
        h0.r(parcel, q6);
    }
}
