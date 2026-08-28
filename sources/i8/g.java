package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class g extends y5.a {
    public static final Parcelable.Creator<g> CREATOR = new c(3);
    public final int f10985a;

    public g(int i9) {
        this.f10985a = i9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f10985a);
        p8.r(parcel, q10);
    }
}
