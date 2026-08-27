package c8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class h extends z5.a {
    public static final Parcelable.Creator<h> CREATOR = new o(5);

    public String f2535a;

    public String f2536b;

    public String f2537c;
    public String d;

    public String f2538e;

    public String f2539f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f2535a);
        r8.l(parcel, 3, this.f2536b);
        r8.l(parcel, 4, this.f2537c);
        r8.l(parcel, 5, this.d);
        r8.l(parcel, 6, this.f2538e);
        r8.l(parcel, 7, this.f2539f);
        r8.l(parcel, 8, this.h);
        r8.r(parcel, iQ);
    }
}
