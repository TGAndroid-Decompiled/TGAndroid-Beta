package m6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new e(1);
    public final String f20844a;
    public final String f20845b;
    public final String f20846c;
    public final String d;
    public final String f20847e;
    public int f20848f;
    public final String h;

    public b(String str, String str2, String str3, String str4, String str5) {
        this.f20844a = str;
        this.f20845b = str2;
        this.f20846c = str3;
        this.d = str4;
        this.f20847e = str5;
        this.h = "fcm-25.1.3";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f20844a);
        bc.l(parcel, 2, this.f20845b);
        bc.l(parcel, 3, this.f20846c);
        bc.l(parcel, 4, this.d);
        bc.l(parcel, 5, this.f20847e);
        int i10 = this.f20848f;
        bc.q(parcel, 6, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 7, this.h);
        bc.s(parcel, r10);
    }

    public b(String str, String str2, String str3, String str4, String str5, int i7, String str6) {
        this.f20844a = str;
        this.f20845b = str2;
        this.f20846c = str3;
        this.d = str4;
        this.f20847e = str5;
        this.f20848f = i7;
        this.h = str6;
    }
}
