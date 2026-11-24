package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class qt2 extends b4 {
    public static final Parcelable.Creator<qt2> CREATOR = new sje((byte) 24);
    public final ol9 a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public qt2(ol9 ol9Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = ol9Var;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        mve.g(parcel, 4, this.d);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        mve.g(parcel, 6, this.f);
        mve.s(parcel, r);
    }
}
