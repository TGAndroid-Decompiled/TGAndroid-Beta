package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class z extends y5.a {
    public static final Parcelable.Creator<z> CREATOR = new c(21);
    public final int f11060a;
    public final m f11061b;

    public z(int i9, m mVar) {
        this.f11060a = i9;
        this.f11061b = mVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11060a);
        p8.k(parcel, 3, this.f11061b, i9);
        p8.r(parcel, q10);
    }
}
