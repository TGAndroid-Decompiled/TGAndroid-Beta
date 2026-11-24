package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class sf0 extends b4 {
    public static final Parcelable.Creator<sf0> CREATOR = new sje((byte) 2);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.l(parcel, 4, this.c);
        mve.l(parcel, 5, this.d);
        mve.l(parcel, 6, this.e);
        mve.l(parcel, 7, this.f);
        mve.l(parcel, 8, this.h);
        mve.s(parcel, r);
    }
}
