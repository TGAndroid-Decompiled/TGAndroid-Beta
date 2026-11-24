package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class y4d extends b4 {
    public static final Parcelable.Creator<y4d> CREATOR = new d3d((byte) 11);
    public final int a;
    public final l5d b;

    public y4d(int i, l5d l5dVar) {
        this.a = i;
        this.b = l5dVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.k(parcel, 2, this.b, i);
        mve.s(parcel, r);
    }
}
