package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class y1d extends b4 {
    public static final Parcelable.Creator<y1d> CREATOR = new hx6((byte) 21);
    public final String a;

    public y1d(String str) {
        str.getClass();
        this.a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.s(parcel, r);
    }
}
