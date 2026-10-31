package m8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new g8.g(28);
    public final long f13026a;
    public final a[] f13027b;
    public final int f13028c;
    public final boolean d;

    public f(long j10, a[] aVarArr, int i10, boolean z10) {
        this.f13026a = j10;
        this.f13027b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f13028c = i10;
        } else {
            this.f13028c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 2, 8);
        parcel.writeLong(this.f13026a);
        h0.o(parcel, 3, this.f13027b, i10);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.f13028c);
        h0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        h0.r(parcel, q6);
    }
}
