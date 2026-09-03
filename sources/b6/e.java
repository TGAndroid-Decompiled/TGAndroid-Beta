package b6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new w.a(27);
    public final o f1579a;
    public final boolean f1580b;
    public final boolean f1581c;
    public final int[] d;
    public final int e;
    public final int[] f1582f;

    public e(o oVar, boolean z4, boolean z10, int[] iArr, int i10, int[] iArr2) {
        this.f1579a = oVar;
        this.f1580b = z4;
        this.f1581c = z10;
        this.d = iArr;
        this.e = i10;
        this.f1582f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 1, this.f1579a, i10);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f1580b ? 1 : 0);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f1581c ? 1 : 0);
        f5.g(parcel, 4, this.d);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        f5.g(parcel, 6, this.f1582f);
        f5.r(parcel, q10);
    }
}
