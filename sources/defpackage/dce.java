package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class dce extends b4 {
    public static final Parcelable.Creator<dce> CREATOR = new qyd((byte) 29);
    public final String a;
    public final String b;
    public final float c;
    public final int d;

    public dce(float f, int i, String str, String str2) {
        this.b = str2;
        this.c = f;
        this.a = str;
        this.d = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.b);
        jte.q(parcel, 3, 4);
        parcel.writeFloat(this.c);
        jte.l(parcel, 4, this.a);
        jte.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        jte.s(parcel, r);
    }
}
