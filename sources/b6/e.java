package b6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new w.a(27);
    public final o f1568a;
    public final boolean f1569b;
    public final boolean f1570c;
    public final int[] d;
    public final int e;
    public final int[] f1571f;

    public e(o oVar, boolean z4, boolean z10, int[] iArr, int i10, int[] iArr2) {
        this.f1568a = oVar;
        this.f1569b = z4;
        this.f1570c = z10;
        this.d = iArr;
        this.e = i10;
        this.f1571f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 1, this.f1568a, i10);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f1569b ? 1 : 0);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f1570c ? 1 : 0);
        f5.g(parcel, 4, this.d);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        f5.g(parcel, 6, this.f1571f);
        f5.r(parcel, q10);
    }
}
