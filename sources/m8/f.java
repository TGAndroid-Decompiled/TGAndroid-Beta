package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.g0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new j(29);
    public final long f15711a;
    public final a[] f15712b;
    public final int f15713c;
    public final boolean d;

    public f(long j10, a[] aVarArr, int i10, boolean z10) {
        this.f15711a = j10;
        this.f15712b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f15713c = i10;
        } else {
            this.f15713c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.f15711a);
        g0.o(parcel, 3, this.f15712b, i10);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.f15713c);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g0.r(parcel, q6);
    }
}
