package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new j7.b(19);
    public final boolean f17353a;
    public final boolean f17354b;
    public final boolean f17355c;
    public final boolean d;
    public final boolean f17356e;
    public final boolean f17357f;

    public f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f17353a = z10;
        this.f17354b = z11;
        this.f17355c = z12;
        this.d = z13;
        this.f17356e = z14;
        this.f17357f = z15;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f17353a ? 1 : 0);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f17354b ? 1 : 0);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f17355c ? 1 : 0);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f17356e ? 1 : 0);
        bc.q(parcel, 6, 4);
        parcel.writeInt(this.f17357f ? 1 : 0);
        bc.s(parcel, r10);
    }
}
