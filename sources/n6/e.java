package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(20);
    public final n f13842a;
    public final boolean f13843b;
    public final boolean f13844c;
    public final int[] d;
    public final int e;
    public final int[] f13845f;

    public e(n nVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f13842a = nVar;
        this.f13843b = z10;
        this.f13844c = z11;
        this.d = iArr;
        this.e = i10;
        this.f13845f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 1, this.f13842a, i10);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f13843b ? 1 : 0);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f13844c ? 1 : 0);
        w7.e0.g(parcel, 4, this.d);
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        w7.e0.g(parcel, 6, this.f13845f);
        w7.e0.r(parcel, q6);
    }
}
