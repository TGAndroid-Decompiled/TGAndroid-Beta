package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new b9.e(20);
    public int f6037a;
    public String[] f6038b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.f6037a;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f5.m(parcel, 3, this.f6038b);
        f5.r(parcel, q10);
    }
}
