package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class vde extends b4 {
    public static final Parcelable.Creator<vde> CREATOR = new t0e((byte) 18);
    public final int a;

    public vde(int i) {
        this.a = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.s(parcel, r);
    }
}
