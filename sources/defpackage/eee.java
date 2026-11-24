package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class eee extends b4 {
    public static final Parcelable.Creator<eee> CREATOR = new t0e((byte) 29);
    public final String a;
    public final String b;
    public final float c;
    public final int d;

    public eee(float f, int i, String str, String str2) {
        this.b = str2;
        this.c = f;
        this.a = str;
        this.d = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.b);
        mve.q(parcel, 3, 4);
        parcel.writeFloat(this.c);
        mve.l(parcel, 4, this.a);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        mve.s(parcel, r);
    }
}
