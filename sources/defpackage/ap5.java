package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ap5 extends b4 {
    public static final Parcelable.Creator<ap5> CREATOR = new c0f((byte) 8);
    public String a;
    public String b;
    public int c;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        int i2 = this.c;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            i2 = 0;
        }
        jte.q(parcel, 4, 4);
        parcel.writeInt(i2);
        jte.s(parcel, r);
    }
}
