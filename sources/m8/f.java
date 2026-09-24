package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new j(29);
    public final long f14955a;
    public final a[] f14956b;
    public final int f14957c;
    public final boolean d;

    public f(long j3, a[] aVarArr, int i10, boolean z10) {
        this.f14955a = j3;
        this.f14956b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f14957c = i10;
        } else {
            this.f14957c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 2, 8);
        parcel.writeLong(this.f14955a);
        f0.o(parcel, 3, this.f14956b, i10);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f14957c);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f0.r(parcel, q6);
    }
}
