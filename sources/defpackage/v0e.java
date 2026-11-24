package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0e extends b4 {
    public static final Parcelable.Creator<v0e> CREATOR = new urd((byte) 17);
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        int i2 = this.a;
        mve.q(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        mve.q(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.c;
        mve.q(parcel, 4, 4);
        parcel.writeInt(i4);
        boolean z = this.d;
        mve.q(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.e;
        mve.q(parcel, 6, 4);
        parcel.writeInt(z2 ? 1 : 0);
        float f = this.f;
        mve.q(parcel, 7, 4);
        parcel.writeFloat(f);
        mve.s(parcel, r);
    }
}
