package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.i(17);
    public final n f13563a;
    public final boolean f13564b;
    public final boolean f13565c;
    public final int[] d;
    public final int e;
    public final int[] f13566f;

    public e(n nVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f13563a = nVar;
        this.f13564b = z10;
        this.f13565c = z11;
        this.d = iArr;
        this.e = i10;
        this.f13566f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.k(parcel, 1, this.f13563a, i10);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f13564b ? 1 : 0);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.f13565c ? 1 : 0);
        w7.h0.g(parcel, 4, this.d);
        w7.h0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        w7.h0.g(parcel, 6, this.f13566f);
        w7.h0.r(parcel, q6);
    }
}
