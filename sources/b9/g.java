package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new c(3);
    public final int f3009a;

    public g(int i7) {
        this.f3009a = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3009a);
        yb.s(parcel, r10);
    }
}
