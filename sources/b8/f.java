package b8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class f extends y5.a {
    public static final Parcelable.Creator<f> CREATOR = new w.a(22);
    public int f1624a;
    public String f1625b;
    public String f1626c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.f1624a;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i10);
        p8.l(parcel, 3, this.f1625b);
        p8.l(parcel, 4, this.f1626c);
        p8.l(parcel, 5, this.d);
        p8.r(parcel, q10);
    }
}
