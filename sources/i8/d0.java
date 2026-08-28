package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class d0 extends y5.a {
    public static final Parcelable.Creator<d0> CREATOR = new c(25);
    public final int f10960a;
    public final String f10961b;

    public d0(int i9, String str) {
        this.f10960a = i9;
        this.f10961b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f10960a);
        p8.l(parcel, 3, this.f10961b);
        p8.r(parcel, q10);
    }
}
