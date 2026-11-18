package m6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new e(1);
    public final String f20841a;
    public final String f20842b;
    public final String f20843c;
    public final String d;
    public final String f20844e;
    public int f20845f;
    public final String h;

    public b(String str, String str2, String str3, String str4, String str5) {
        this.f20841a = str;
        this.f20842b = str2;
        this.f20843c = str3;
        this.d = str4;
        this.f20844e = str5;
        this.h = "fcm-25.1.3";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f20841a);
        bc.l(parcel, 2, this.f20842b);
        bc.l(parcel, 3, this.f20843c);
        bc.l(parcel, 4, this.d);
        bc.l(parcel, 5, this.f20844e);
        int i10 = this.f20845f;
        bc.q(parcel, 6, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 7, this.h);
        bc.s(parcel, r10);
    }

    public b(String str, String str2, String str3, String str4, String str5, int i7, String str6) {
        this.f20841a = str;
        this.f20842b = str2;
        this.f20843c = str3;
        this.d = str4;
        this.f20844e = str5;
        this.f20845f = i7;
        this.h = str6;
    }
}
