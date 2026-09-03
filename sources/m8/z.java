package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class z extends c6.a {
    public static final Parcelable.Creator<z> CREATOR = new c(21);
    public final int f13599a;
    public final m f13600b;

    public z(int i10, m mVar) {
        this.f13599a = i10;
        this.f13600b = mVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13599a);
        g5.k(parcel, 3, this.f13600b, i10);
        g5.r(parcel, q10);
    }
}
