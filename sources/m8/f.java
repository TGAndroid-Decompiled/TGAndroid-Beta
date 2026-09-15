package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.e0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new j(29);
    public final long f14745a;
    public final a[] f14746b;
    public final int f14747c;
    public final boolean d;

    public f(long j3, a[] aVarArr, int i10, boolean z10) {
        this.f14745a = j3;
        this.f14746b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f14747c = i10;
        } else {
            this.f14747c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 2, 8);
        parcel.writeLong(this.f14745a);
        e0.o(parcel, 3, this.f14746b, i10);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.f14747c);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        e0.r(parcel, q6);
    }
}
