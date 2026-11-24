package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class v4d extends b4 {
    public static final Parcelable.Creator<v4d> CREATOR = new j9d((byte) 15);
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
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        jte.l(parcel, 4, this.c);
        jte.l(parcel, 5, this.d);
        jte.l(parcel, 6, this.e);
        jte.l(parcel, 7, this.f);
        jte.l(parcel, 8, this.h);
        jte.l(parcel, 9, this.n);
        jte.l(parcel, 10, this.r);
        boolean z = this.s;
        jte.q(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        jte.l(parcel, 12, this.w);
        jte.s(parcel, r);
    }
}
