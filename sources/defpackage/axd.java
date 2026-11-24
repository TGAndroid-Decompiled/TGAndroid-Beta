package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class axd extends b4 {
    public static final Parcelable.Creator<axd> CREATOR = new rpd((byte) 28);
    public final int a;
    public final String b;

    public axd(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.l(parcel, 3, this.b);
        jte.s(parcel, r);
    }
}
