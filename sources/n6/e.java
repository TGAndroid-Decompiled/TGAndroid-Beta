package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.i(17);
    public final n f13564a;
    public final boolean f13565b;
    public final boolean f13566c;
    public final int[] d;
    public final int e;
    public final int[] f13567f;

    public e(n nVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f13564a = nVar;
        this.f13565b = z10;
        this.f13566c = z11;
        this.d = iArr;
        this.e = i10;
        this.f13567f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.k(parcel, 1, this.f13564a, i10);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f13565b ? 1 : 0);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.f13566c ? 1 : 0);
        w7.h0.g(parcel, 4, this.d);
        w7.h0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        w7.h0.g(parcel, 6, this.f13567f);
        w7.h0.r(parcel, q6);
    }
}
