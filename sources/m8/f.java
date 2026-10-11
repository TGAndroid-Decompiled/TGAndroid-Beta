package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.d0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new j(29);
    public final long f16341a;
    public final a[] f16342b;
    public final int f16343c;
    public final boolean d;

    public f(long j3, a[] aVarArr, int i10, boolean z10) {
        this.f16341a = j3;
        this.f16342b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f16343c = i10;
        } else {
            this.f16343c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 2, 8);
        parcel.writeLong(this.f16341a);
        d0.o(parcel, 3, this.f16342b, i10);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.f16343c);
        d0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        d0.r(parcel, q6);
    }
}
