package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class wf0 extends b4 {
    public static final Parcelable.Creator<wf0> CREATOR = new sje((byte) 27);
    public String a;
    public String b;
    public int c;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        int i2 = this.c;
        mve.q(parcel, 4, 4);
        parcel.writeInt(i2);
        mve.s(parcel, r);
    }
}
