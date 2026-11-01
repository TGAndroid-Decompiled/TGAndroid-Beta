package m8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new g8.g(28);
    public final long f13027a;
    public final a[] f13028b;
    public final int f13029c;
    public final boolean d;

    public f(long j10, a[] aVarArr, int i10, boolean z10) {
        this.f13027a = j10;
        this.f13028b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f13029c = i10;
        } else {
            this.f13029c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 2, 8);
        parcel.writeLong(this.f13027a);
        h0.o(parcel, 3, this.f13028b, i10);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.f13029c);
        h0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        h0.r(parcel, q6);
    }
}
