package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class qe0 extends b4 {
    public static final Parcelable.Creator<qe0> CREATOR = new qyd((byte) 9);
    public int a;
    public String b;
    public String c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        int i2 = this.a;
        jte.q(parcel, 2, 4);
        parcel.writeInt(i2);
        jte.l(parcel, 3, this.b);
        jte.l(parcel, 4, this.c);
        jte.l(parcel, 5, this.d);
        jte.s(parcel, r);
    }
}
