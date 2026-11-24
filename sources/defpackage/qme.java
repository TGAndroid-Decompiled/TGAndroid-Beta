package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class qme extends b4 {
    public static final Parcelable.Creator<qme> CREATOR = new rhe((byte) 14);
    public final int a;
    public final float b;
    public final int c;

    public qme(int i, int i2, float f, int i3) {
        if (i == 1) {
            this.a = i2;
            this.b = f;
            this.c = i3;
            return;
        }
        w26.j("Unknown language.");
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(1);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 4, 4);
        parcel.writeFloat(this.b);
        jte.q(parcel, 5, 4);
        parcel.writeInt(this.c);
        jte.s(parcel, r);
    }
}
