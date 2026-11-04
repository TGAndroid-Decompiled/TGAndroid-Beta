package o8;

import android.os.Parcel;
import android.os.Parcelable;
public final class h extends q6.a {
    public static final Parcelable.Creator<h> CREATOR = new n8.g(7);
    public final int f20939a;
    public final boolean f20940b;

    public h(int i3, boolean z10) {
        this.f20939a = i3;
        this.f20940b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f20939a);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f20940b ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
