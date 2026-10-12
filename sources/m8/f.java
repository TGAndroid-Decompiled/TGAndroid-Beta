package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.c0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new j(29);
    public final long f16028a;
    public final a[] f16029b;
    public final int f16030c;
    public final boolean d;

    public f(long j3, a[] aVarArr, int i10, boolean z10) {
        this.f16028a = j3;
        this.f16029b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f16030c = i10;
        } else {
            this.f16030c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 2, 8);
        parcel.writeLong(this.f16028a);
        c0.o(parcel, 3, this.f16029b, i10);
        c0.s(parcel, 4, 4);
        parcel.writeInt(this.f16030c);
        c0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        c0.r(parcel, q6);
    }
}
