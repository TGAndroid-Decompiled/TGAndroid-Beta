package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class x6d extends b4 {
    public static final Parcelable.Creator<x6d> CREATOR = new lbd((byte) 15);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String h;
    public String n;
    public String r;
    public boolean s;
    public String w;

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
        mve.l(parcel, 9, this.n);
        mve.l(parcel, 10, this.r);
        boolean z = this.s;
        mve.q(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        mve.l(parcel, 12, this.w);
        mve.s(parcel, r);
    }
}
