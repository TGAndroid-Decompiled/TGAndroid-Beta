package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class i6f extends b4 {
    public static final Parcelable.Creator<i6f> CREATOR = new c0f((byte) 11);
    public final float a;
    public final int b;

    public i6f(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeFloat(this.a);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        jte.s(parcel, r);
    }
}
