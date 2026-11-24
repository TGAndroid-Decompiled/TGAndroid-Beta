package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class we0 extends b4 {
    public static final Parcelable.Creator<we0> CREATOR = new rhe((byte) 27);
    public String a;
    public String b;
    public int c;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        int i2 = this.c;
        jte.q(parcel, 4, 4);
        parcel.writeInt(i2);
        jte.s(parcel, r);
    }
}
