package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.g0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new j(29);
    public final long f16338a;
    public final a[] f16339b;
    public final int f16340c;
    public final boolean d;

    public f(long j3, a[] aVarArr, int i10, boolean z10) {
        this.f16338a = j3;
        this.f16339b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f16340c = i10;
        } else {
            this.f16340c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.f16338a);
        g0.o(parcel, 3, this.f16339b, i10);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.f16340c);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g0.r(parcel, q6);
    }
}
