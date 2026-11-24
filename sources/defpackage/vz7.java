package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class vz7 extends b4 {
    public static final Parcelable.Creator<vz7> CREATOR = new t4d((byte) 13);
    public int a;
    public String b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        int i2 = this.a;
        jte.q(parcel, 2, 4);
        parcel.writeInt(i2);
        jte.l(parcel, 3, this.b);
        jte.s(parcel, r);
    }
}
