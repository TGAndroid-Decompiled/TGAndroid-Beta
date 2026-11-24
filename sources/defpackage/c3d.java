package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class c3d extends b4 {
    public static final Parcelable.Creator<c3d> CREATOR = new b1d((byte) 12);
    public final int a;
    public final ds2 b;
    public final l3d c;

    public c3d(int i, ds2 ds2Var, l3d l3dVar) {
        this.a = i;
        this.b = ds2Var;
        this.c = l3dVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.k(parcel, 2, this.b, i);
        jte.k(parcel, 3, this.c, i);
        jte.s(parcel, r);
    }
}
