package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class nbe extends b4 {
    public static final Parcelable.Creator<nbe> CREATOR = new t0e((byte) 14);
    public final int a;
    public final pgd b;

    public nbe(int i, pgd pgdVar) {
        this.a = i;
        this.b = pgdVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.k(parcel, 3, this.b, i);
        mve.s(parcel, r);
    }
}
