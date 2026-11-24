package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class k59 extends b4 {
    public static final Parcelable.Creator<k59> CREATOR = new xff((byte) 10);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public int f;
    public final String h;

    public k59(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.h = "fcm-25.1.3";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.l(parcel, 2, this.b);
        jte.l(parcel, 3, this.c);
        jte.l(parcel, 4, this.d);
        jte.l(parcel, 5, this.e);
        int i2 = this.f;
        jte.q(parcel, 6, 4);
        parcel.writeInt(i2);
        jte.l(parcel, 7, this.h);
        jte.s(parcel, r);
    }

    public k59(String str, String str2, String str3, String str4, String str5, int i, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.h = str6;
    }
}
