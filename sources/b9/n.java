package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new c(11);
    public final int f3035a;
    public final b f3036b;

    public n(int i7, b bVar) {
        this.f3035a = i7;
        this.f3036b = bVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3035a);
        yb.k(parcel, 3, this.f3036b, i7);
        yb.s(parcel, r10);
    }
}
