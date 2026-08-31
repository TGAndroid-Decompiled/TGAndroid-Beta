package b6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new w.a(27);
    public final o f1695a;
    public final boolean f1696b;
    public final boolean f1697c;
    public final int[] d;
    public final int f1698e;
    public final int[] f1699f;

    public e(o oVar, boolean z4, boolean z10, int[] iArr, int i10, int[] iArr2) {
        this.f1695a = oVar;
        this.f1696b = z4;
        this.f1697c = z10;
        this.d = iArr;
        this.f1698e = i10;
        this.f1699f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 1, this.f1695a, i10);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f1696b ? 1 : 0);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f1697c ? 1 : 0);
        g5.g(parcel, 4, this.d);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.f1698e);
        g5.g(parcel, 6, this.f1699f);
        g5.r(parcel, q10);
    }
}
