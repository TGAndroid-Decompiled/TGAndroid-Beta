package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class myb extends b4 {
    public static final Parcelable.Creator<myb> CREATOR = new t4d((byte) 25);
    public int a;
    public String b;
    public String c;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        int i2 = this.a;
        jte.q(parcel, 1, 4);
        parcel.writeInt(i2);
        jte.l(parcel, 2, this.b);
        jte.l(parcel, 3, this.c);
        jte.s(parcel, r);
    }
}
