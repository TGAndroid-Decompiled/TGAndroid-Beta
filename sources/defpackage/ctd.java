package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ctd extends b4 {
    public static final Parcelable.Creator<ctd> CREATOR = new urd((byte) 3);
    public final int a;
    public final rad b;

    public ctd(int i, rad radVar) {
        this.a = i;
        this.b = radVar;
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
