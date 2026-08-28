package b8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class a extends y5.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(17);
    public int f1595a;
    public String[] f1596b;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.f1595a;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i10);
        p8.m(parcel, 3, this.f1596b);
        p8.r(parcel, q10);
    }
}
