package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new j(29);
    public final long f16803a;
    public final a[] f16804b;
    public final int f16805c;
    public final boolean d;

    public f(long j10, a[] aVarArr, int i10, boolean z10) {
        this.f16803a = j10;
        this.f16804b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f16805c = i10;
        } else {
            this.f16805c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 2, 8);
        parcel.writeLong(this.f16803a);
        f0.o(parcel, 3, this.f16804b, i10);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f16805c);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f0.r(parcel, q6);
    }
}
