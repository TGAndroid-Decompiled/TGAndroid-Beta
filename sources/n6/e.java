package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(20);
    public final n f16667a;
    public final boolean f16668b;
    public final boolean f16669c;
    public final int[] d;
    public final int f16670e;
    public final int[] f16671f;

    public e(n nVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f16667a = nVar;
        this.f16668b = z10;
        this.f16669c = z11;
        this.d = iArr;
        this.f16670e = i10;
        this.f16671f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.k(parcel, 1, this.f16667a, i10);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f16668b ? 1 : 0);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f16669c ? 1 : 0);
        w7.g0.g(parcel, 4, this.d);
        w7.g0.s(parcel, 5, 4);
        parcel.writeInt(this.f16670e);
        w7.g0.g(parcel, 6, this.f16671f);
        w7.g0.r(parcel, q6);
    }
}
