package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class a0 extends y5.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(22);
    public final int f10942a;
    public final String f10943b;

    public a0(int i9, String str) {
        this.f10942a = i9;
        this.f10943b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f10942a);
        p8.l(parcel, 3, this.f10943b);
        p8.r(parcel, q10);
    }
}
