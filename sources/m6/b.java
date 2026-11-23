package m6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new e(1);
    public final String f20838a;
    public final String f20839b;
    public final String f20840c;
    public final String d;
    public final String f20841e;
    public int f20842f;
    public final String h;

    public b(String str, String str2, String str3, String str4, String str5) {
        this.f20838a = str;
        this.f20839b = str2;
        this.f20840c = str3;
        this.d = str4;
        this.f20841e = str5;
        this.h = "fcm-25.1.3";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.f20838a);
        cc.l(parcel, 2, this.f20839b);
        cc.l(parcel, 3, this.f20840c);
        cc.l(parcel, 4, this.d);
        cc.l(parcel, 5, this.f20841e);
        int i10 = this.f20842f;
        cc.q(parcel, 6, 4);
        parcel.writeInt(i10);
        cc.l(parcel, 7, this.h);
        cc.s(parcel, r10);
    }

    public b(String str, String str2, String str3, String str4, String str5, int i7, String str6) {
        this.f20838a = str;
        this.f20839b = str2;
        this.f20840c = str3;
        this.d = str4;
        this.f20841e = str5;
        this.f20842f = i7;
        this.h = str6;
    }
}
