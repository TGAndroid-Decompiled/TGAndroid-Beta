package m6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new e(1);
    public final String f20480a;
    public final String f20481b;
    public final String f20482c;
    public final String d;
    public final String f20483e;
    public int f20484f;
    public final String h;

    public b(String str, String str2, String str3, String str4, String str5) {
        this.f20480a = str;
        this.f20481b = str2;
        this.f20482c = str3;
        this.d = str4;
        this.f20483e = str5;
        this.h = "fcm-25.1.3";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.f20480a);
        yb.l(parcel, 2, this.f20481b);
        yb.l(parcel, 3, this.f20482c);
        yb.l(parcel, 4, this.d);
        yb.l(parcel, 5, this.f20483e);
        int i10 = this.f20484f;
        yb.q(parcel, 6, 4);
        parcel.writeInt(i10);
        yb.l(parcel, 7, this.h);
        yb.s(parcel, r10);
    }

    public b(String str, String str2, String str3, String str4, String str5, int i7, String str6) {
        this.f20480a = str;
        this.f20481b = str2;
        this.f20482c = str3;
        this.d = str4;
        this.f20483e = str5;
        this.f20484f = i7;
        this.h = str6;
    }
}
