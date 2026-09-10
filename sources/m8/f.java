package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.e0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new j(29);
    public final long f13587a;
    public final a[] f13588b;
    public final int f13589c;
    public final boolean d;

    public f(long j3, a[] aVarArr, int i10, boolean z10) {
        this.f13587a = j3;
        this.f13588b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f13589c = i10;
        } else {
            this.f13589c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 2, 8);
        parcel.writeLong(this.f13587a);
        e0.o(parcel, 3, this.f13588b, i10);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.f13589c);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        e0.r(parcel, q6);
    }
}
