package a8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new w.a(4);
    public final long f135a;
    public final a[] f136b;
    public final int f137c;
    public final boolean d;

    public g(long j10, a[] aVarArr, int i10, boolean z4) {
        this.f135a = j10;
        this.f136b = aVarArr;
        this.d = z4;
        if (z4) {
            this.f137c = i10;
        } else {
            this.f137c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 8);
        parcel.writeLong(this.f135a);
        f5.o(parcel, 3, this.f136b, i10);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.f137c);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f5.r(parcel, q10);
    }
}
