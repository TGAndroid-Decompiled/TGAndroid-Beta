package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class w0e extends b4 {
    public static final Parcelable.Creator<w0e> CREATOR = new t0e((byte) 11);
    public final int a;

    public w0e(int i) {
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
