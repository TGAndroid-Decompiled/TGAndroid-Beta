package c8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class c extends z5.a {
    public static final Parcelable.Creator<c> CREATOR = new o(2);

    public String f2509a;

    public String f2510b;

    public String f2511c;
    public String d;

    public String f2512e;

    public b f2513f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f2509a);
        r8.l(parcel, 3, this.f2510b);
        r8.l(parcel, 4, this.f2511c);
        r8.l(parcel, 5, this.d);
        r8.l(parcel, 6, this.f2512e);
        r8.k(parcel, 7, this.f2513f, i10);
        r8.k(parcel, 8, this.h, i10);
        r8.r(parcel, iQ);
    }
}
