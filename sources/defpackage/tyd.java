package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class tyd extends b4 {
    public static final Parcelable.Creator<tyd> CREATOR = new urd((byte) 27);
    public final int a;
    public final bbe b;

    public tyd(int i, bbe bbeVar) {
        this.a = i;
        this.b = bbeVar;
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
