package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class u6d extends b4 {
    public static final Parcelable.Creator<u6d> CREATOR = new lbd((byte) 13);
    public final String a;

    public u6d(String str) {
        this.a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.s(parcel, r);
    }
}
