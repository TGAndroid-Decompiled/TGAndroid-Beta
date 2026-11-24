package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class zre extends b4 {
    public static final Parcelable.Creator<zre> CREATOR = new rhe((byte) 5);
    public int a;
    public boolean b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        int i2 = this.a;
        jte.q(parcel, 2, 4);
        parcel.writeInt(i2);
        boolean z = this.b;
        jte.q(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        jte.s(parcel, r);
    }
}
