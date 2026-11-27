package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ys2 extends c4 {
    public static final Parcelable.Creator<ys2> CREATOR = new ime((byte) 24);
    public final an9 a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public ys2(an9 an9Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = an9Var;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 1, this.a, i);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        bye.g(parcel, 4, this.d);
        bye.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        bye.g(parcel, 6, this.f);
        bye.s(parcel, r);
    }
}
