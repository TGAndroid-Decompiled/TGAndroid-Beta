package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class sj2 extends b4 {
    public static final Parcelable.Creator<sj2> CREATOR = new f41((byte) 9);
    public final boolean a;

    public sj2(boolean z) {
        this.a = z;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        mve.s(parcel, r);
    }
}
