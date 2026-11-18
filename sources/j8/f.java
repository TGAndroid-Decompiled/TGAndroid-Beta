package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new j7.b(19);
    public final boolean f17325a;
    public final boolean f17326b;
    public final boolean f17327c;
    public final boolean d;
    public final boolean f17328e;
    public final boolean f17329f;

    public f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f17325a = z10;
        this.f17326b = z11;
        this.f17327c = z12;
        this.d = z13;
        this.f17328e = z14;
        this.f17329f = z15;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f17325a ? 1 : 0);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f17326b ? 1 : 0);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f17327c ? 1 : 0);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f17328e ? 1 : 0);
        bc.q(parcel, 6, 4);
        parcel.writeInt(this.f17329f ? 1 : 0);
        bc.s(parcel, r10);
    }
}
