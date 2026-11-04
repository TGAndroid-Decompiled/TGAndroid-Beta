package l6;

import android.os.Parcel;
import android.os.Parcelable;
import i7.p;
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR = new p(15);
    public final String f18052a;
    public final String f18053b;
    public final String f18054c;
    public final String d;
    public final String f18055e;
    public int f18056f;
    public final String h;

    public b(String str, String str2, String str3, String str4, String str5) {
        this.f18052a = str;
        this.f18053b = str2;
        this.f18054c = str3;
        this.d = str4;
        this.f18055e = str5;
        this.h = "fcm-25.1.3";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.f18052a);
        j8.a.m(parcel, 2, this.f18053b);
        j8.a.m(parcel, 3, this.f18054c);
        j8.a.m(parcel, 4, this.d);
        j8.a.m(parcel, 5, this.f18055e);
        int i10 = this.f18056f;
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(i10);
        j8.a.m(parcel, 7, this.h);
        j8.a.t(parcel, s6);
    }

    public b(String str, String str2, String str3, String str4, String str5, int i3, String str6) {
        this.f18052a = str;
        this.f18053b = str2;
        this.f18054c = str3;
        this.d = str4;
        this.f18055e = str5;
        this.f18056f = i3;
        this.h = str6;
    }
}
