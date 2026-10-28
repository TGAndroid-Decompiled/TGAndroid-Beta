package o6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new n4.x(18);
    public final n f19104a;
    public final boolean f19105b;
    public final boolean f19106c;
    public final int[] d;
    public final int e;
    public final int[] f19107f;

    public e(n nVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f19104a = nVar;
        this.f19105b = z10;
        this.f19106c = z11;
        this.d = iArr;
        this.e = i10;
        this.f19107f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.f19104a, i10);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f19105b ? 1 : 0);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f19106c ? 1 : 0);
        df.g(parcel, 4, this.d);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        df.g(parcel, 6, this.f19107f);
        df.r(parcel, q5);
    }
}
