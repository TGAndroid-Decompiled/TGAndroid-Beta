package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class h extends y5.a {
    public static final Parcelable.Creator<h> CREATOR = new c(4);
    public final int f10989a;

    public h(int i9) {
        this.f10989a = i9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f10989a);
        p8.r(parcel, q10);
    }
}
