package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(20);
    public final n f15248a;
    public final boolean f15249b;
    public final boolean f15250c;
    public final int[] d;
    public final int e;
    public final int[] f15251f;

    public e(n nVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f15248a = nVar;
        this.f15249b = z10;
        this.f15250c = z11;
        this.d = iArr;
        this.e = i10;
        this.f15251f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 1, this.f15248a, i10);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f15249b ? 1 : 0);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f15250c ? 1 : 0);
        w7.f0.g(parcel, 4, this.d);
        w7.f0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        w7.f0.g(parcel, 6, this.f15251f);
        w7.f0.r(parcel, q6);
    }
}
