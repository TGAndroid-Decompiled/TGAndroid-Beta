package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class w2d extends b4 {
    public static final Parcelable.Creator<w2d> CREATOR = new b1d((byte) 11);
    public final int a;
    public final j3d b;

    public w2d(int i, j3d j3dVar) {
        this.a = i;
        this.b = j3dVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.k(parcel, 2, this.b, i);
        jte.s(parcel, r);
    }
}
