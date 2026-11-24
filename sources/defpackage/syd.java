package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class syd extends b4 {
    public static final Parcelable.Creator<syd> CREATOR = new rpd((byte) 17);
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        int i2 = this.a;
        jte.q(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        jte.q(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.c;
        jte.q(parcel, 4, 4);
        parcel.writeInt(i4);
        boolean z = this.d;
        jte.q(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.e;
        jte.q(parcel, 6, 4);
        parcel.writeInt(z2 ? 1 : 0);
        float f = this.f;
        jte.q(parcel, 7, 4);
        parcel.writeFloat(f);
        jte.s(parcel, r);
    }
}
