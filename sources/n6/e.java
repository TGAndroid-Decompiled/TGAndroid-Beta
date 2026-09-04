package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(20);
    public final n f16514a;
    public final boolean f16515b;
    public final boolean f16516c;
    public final int[] d;
    public final int f16517e;
    public final int[] f16518f;

    public e(n nVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f16514a = nVar;
        this.f16515b = z10;
        this.f16516c = z11;
        this.d = iArr;
        this.f16517e = i10;
        this.f16518f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 1, this.f16514a, i10);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f16515b ? 1 : 0);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f16516c ? 1 : 0);
        w7.e0.g(parcel, 4, this.d);
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(this.f16517e);
        w7.e0.g(parcel, 6, this.f16518f);
        w7.e0.r(parcel, q6);
    }
}
