package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class te0 extends b4 {
    public static final Parcelable.Creator<te0> CREATOR = new rhe((byte) 21);
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
