package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ik6 extends b4 {
    public static final Parcelable.Creator<ik6> CREATOR = new t0e((byte) 22);
    public final String a;

    public ik6(String str) {
        ite.i(str, "json must not be null");
        this.a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.s(parcel, r);
    }
}
