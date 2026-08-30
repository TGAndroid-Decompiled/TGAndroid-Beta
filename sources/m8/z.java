package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class z extends c6.a {
    public static final Parcelable.Creator<z> CREATOR = new c(21);
    public final int f13881a;
    public final m f13882b;

    public z(int i10, m mVar) {
        this.f13881a = i10;
        this.f13882b = mVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13881a);
        f5.k(parcel, 3, this.f13882b, i10);
        f5.r(parcel, q10);
    }
}
