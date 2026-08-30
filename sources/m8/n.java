package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class n extends c6.a {
    public static final Parcelable.Creator<n> CREATOR = new c(9);
    public final int f13833a;
    public final int f13834b;

    public n(int i10, int i11) {
        this.f13833a = i10;
        this.f13834b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13833a);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f13834b);
        f5.r(parcel, q10);
    }
}
