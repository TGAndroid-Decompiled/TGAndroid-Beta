package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(20);
    public final n f16631a;
    public final boolean f16632b;
    public final boolean f16633c;
    public final int[] d;
    public final int f16634e;
    public final int[] f16635f;

    public e(n nVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f16631a = nVar;
        this.f16632b = z10;
        this.f16633c = z11;
        this.d = iArr;
        this.f16634e = i10;
        this.f16635f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.k(parcel, 1, this.f16631a, i10);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f16632b ? 1 : 0);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f16633c ? 1 : 0);
        w7.d0.g(parcel, 4, this.d);
        w7.d0.s(parcel, 5, 4);
        parcel.writeInt(this.f16634e);
        w7.d0.g(parcel, 6, this.f16635f);
        w7.d0.r(parcel, q6);
    }
}
