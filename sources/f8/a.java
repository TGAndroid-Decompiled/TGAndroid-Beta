package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new b9.e(20);
    public int f6161a;
    public String[] f6162b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        int i11 = this.f6161a;
        g5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g5.m(parcel, 3, this.f6162b);
        g5.r(parcel, q10);
    }
}
