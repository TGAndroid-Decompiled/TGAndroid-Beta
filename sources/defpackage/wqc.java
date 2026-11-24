package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class wqc extends b4 {
    public static final Parcelable.Creator<wqc> CREATOR = new e2f((byte) 9);
    public String a;
    public String b;
    public qpb c;
    public s8c d;
    public s8c e;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.k(parcel, 4, this.c, i);
        mve.k(parcel, 5, this.d, i);
        mve.k(parcel, 6, this.e, i);
        mve.s(parcel, r);
    }
}
