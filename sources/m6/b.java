package m6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new e(1);
    public final String f19883a;
    public final String f19884b;
    public final String f19885c;
    public final String d;
    public final String f19886e;
    public int f19887f;
    public final String h;

    public b(String str, String str2, String str3, String str4, String str5) {
        this.f19883a = str;
        this.f19884b = str2;
        this.f19885c = str3;
        this.d = str4;
        this.f19886e = str5;
        this.h = "fcm-25.1.3";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f19883a);
        xb.l(parcel, 2, this.f19884b);
        xb.l(parcel, 3, this.f19885c);
        xb.l(parcel, 4, this.d);
        xb.l(parcel, 5, this.f19886e);
        int i10 = this.f19887f;
        xb.q(parcel, 6, 4);
        parcel.writeInt(i10);
        xb.l(parcel, 7, this.h);
        xb.s(parcel, r10);
    }

    public b(String str, String str2, String str3, String str4, String str5, int i7, String str6) {
        this.f19883a = str;
        this.f19884b = str2;
        this.f19885c = str3;
        this.d = str4;
        this.f19886e = str5;
        this.f19887f = i7;
        this.h = str6;
    }
}
