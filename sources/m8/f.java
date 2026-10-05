package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.g0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new j(29);
    public final long f16343a;
    public final a[] f16344b;
    public final int f16345c;
    public final boolean d;

    public f(long j3, a[] aVarArr, int i10, boolean z10) {
        this.f16343a = j3;
        this.f16344b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f16345c = i10;
        } else {
            this.f16345c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.f16343a);
        g0.o(parcel, 3, this.f16344b, i10);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.f16345c);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g0.r(parcel, q6);
    }
}
