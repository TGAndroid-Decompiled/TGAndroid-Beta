package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.d0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new j(29);
    public final long f16281a;
    public final a[] f16282b;
    public final int f16283c;
    public final boolean d;

    public f(long j3, a[] aVarArr, int i10, boolean z10) {
        this.f16281a = j3;
        this.f16282b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f16283c = i10;
        } else {
            this.f16283c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 2, 8);
        parcel.writeLong(this.f16281a);
        d0.o(parcel, 3, this.f16282b, i10);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.f16283c);
        d0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        d0.r(parcel, q6);
    }
}
