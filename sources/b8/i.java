package b8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class i extends y5.a {
    public static final Parcelable.Creator<i> CREATOR = new w.a(27);
    public int f1634a;
    public String f1635b;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.f1634a;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i10);
        p8.l(parcel, 3, this.f1635b);
        p8.r(parcel, q10);
    }
}
