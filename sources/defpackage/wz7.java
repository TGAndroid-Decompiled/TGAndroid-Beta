package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class wz7 extends b4 {
    public static final Parcelable.Creator<wz7> CREATOR = new t4d((byte) 15);
    public int a;
    public Bundle b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        int i2 = this.a;
        jte.q(parcel, 2, 4);
        parcel.writeInt(i2);
        jte.b(parcel, 3, this.b);
        jte.s(parcel, r);
    }
}
