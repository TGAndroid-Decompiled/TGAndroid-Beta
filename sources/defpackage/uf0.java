package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class uf0 extends b4 {
    public static final Parcelable.Creator<uf0> CREATOR = new sje((byte) 15);
    public String a;
    public String b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.s(parcel, r);
    }
}
