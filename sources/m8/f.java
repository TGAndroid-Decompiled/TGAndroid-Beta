package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new j(29);
    public final long f14986a;
    public final a[] f14987b;
    public final int f14988c;
    public final boolean d;

    public f(long j3, a[] aVarArr, int i10, boolean z10) {
        this.f14986a = j3;
        this.f14987b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f14988c = i10;
        } else {
            this.f14988c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 2, 8);
        parcel.writeLong(this.f14986a);
        f0.o(parcel, 3, this.f14987b, i10);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f14988c);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f0.r(parcel, q6);
    }
}
