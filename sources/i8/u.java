package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class u extends y5.a {
    public static final Parcelable.Creator<u> CREATOR = new c(16);
    public final int f11039a;
    public final boolean f11040b;

    public u(int i9, boolean z10) {
        this.f11039a = i9;
        this.f11040b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11039a);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f11040b ? 1 : 0);
        p8.r(parcel, q10);
    }
}
