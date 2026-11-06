package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new j7.b(19);
    public final boolean f16587a;
    public final boolean f16588b;
    public final boolean f16589c;
    public final boolean d;
    public final boolean f16590e;
    public final boolean f16591f;

    public f(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f16587a = z9;
        this.f16588b = z10;
        this.f16589c = z11;
        this.d = z12;
        this.f16590e = z13;
        this.f16591f = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f16587a ? 1 : 0);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f16588b ? 1 : 0);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f16589c ? 1 : 0);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.f16590e ? 1 : 0);
        xb.q(parcel, 6, 4);
        parcel.writeInt(this.f16591f ? 1 : 0);
        xb.s(parcel, r10);
    }
}
