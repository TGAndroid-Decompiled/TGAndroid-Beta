package b8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class l extends y5.a {
    public static final Parcelable.Creator<l> CREATOR = new w.a(28);
    public String f1640a;
    public String f1641b;
    public int f1642c;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f1640a);
        p8.l(parcel, 3, this.f1641b);
        int i10 = this.f1642c;
        p8.s(parcel, 4, 4);
        parcel.writeInt(i10);
        p8.r(parcel, q10);
    }
}
