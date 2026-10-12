package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(20);
    public final o f16381a;
    public final boolean f16382b;
    public final boolean f16383c;
    public final int[] d;
    public final int f16384e;
    public final int[] f16385f;

    public e(o oVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f16381a = oVar;
        this.f16382b = z10;
        this.f16383c = z11;
        this.d = iArr;
        this.f16384e = i10;
        this.f16385f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.k(parcel, 1, this.f16381a, i10);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f16382b ? 1 : 0);
        w7.c0.s(parcel, 3, 4);
        parcel.writeInt(this.f16383c ? 1 : 0);
        w7.c0.g(parcel, 4, this.d);
        w7.c0.s(parcel, 5, 4);
        parcel.writeInt(this.f16384e);
        w7.c0.g(parcel, 6, this.f16385f);
        w7.c0.r(parcel, q6);
    }
}
