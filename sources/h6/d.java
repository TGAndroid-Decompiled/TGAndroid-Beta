package h6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import f7.t0;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new t0(20);
    public final String f13591a;
    public final int f13592b;
    public final String f13593c;

    public d(String str, int i7, String str2) {
        this.f13591a = str;
        this.f13592b = i7;
        this.f13593c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f13591a);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f13592b);
        yb.l(parcel, 4, this.f13593c);
        yb.s(parcel, r10);
    }
}
