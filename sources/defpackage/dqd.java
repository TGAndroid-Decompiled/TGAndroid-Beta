package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class dqd extends b4 {
    public static final Parcelable.Creator<dqd> CREATOR = new rpd((byte) 1);
    public final int a;
    public final int b;

    public dqd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        jte.s(parcel, r);
    }
}
