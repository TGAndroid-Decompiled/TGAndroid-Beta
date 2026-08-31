package a8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new w.a(4);
    public final long f148a;
    public final a[] f149b;
    public final int f150c;
    public final boolean d;

    public g(long j10, a[] aVarArr, int i10, boolean z4) {
        this.f148a = j10;
        this.f149b = aVarArr;
        this.d = z4;
        if (z4) {
            this.f150c = i10;
        } else {
            this.f150c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 8);
        parcel.writeLong(this.f148a);
        g5.o(parcel, 3, this.f149b, i10);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.f150c);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g5.r(parcel, q10);
    }
}
