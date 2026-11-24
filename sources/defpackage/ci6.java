package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ci6 extends b4 {
    public static final Parcelable.Creator<ci6> CREATOR = new sje((byte) 10);
    public String a;
    public di6 b;
    public qpb c;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.k(parcel, 3, this.b, i);
        mve.k(parcel, 5, this.c, i);
        mve.s(parcel, r);
    }
}
