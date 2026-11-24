package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class u0e extends b4 {
    public static final Parcelable.Creator<u0e> CREATOR = new t0e((byte) 8);
    public final String a;

    public u0e(String str) {
        this.a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.s(parcel, r);
    }
}
