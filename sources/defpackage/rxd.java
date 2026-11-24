package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class rxd extends b4 {
    public static final Parcelable.Creator<rxd> CREATOR = new urd((byte) 24);
    public final int a;
    public final nrd b;

    public rxd(int i, nrd nrdVar) {
        this.a = i;
        this.b = nrdVar;
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
