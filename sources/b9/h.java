package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new c(4);
    public final int f3008a;

    public h(int i7) {
        this.f3008a = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3008a);
        yb.s(parcel, r10);
    }
}
