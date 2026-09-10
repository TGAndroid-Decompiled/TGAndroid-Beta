package d6;

import android.os.Parcel;
import android.os.Parcelable;
import c7.r0;
import w7.e0;
public final class a0 extends o6.a {
    public static final Parcelable.Creator<a0> CREATOR = new r0(26);
    public final boolean f6292a;

    public a0(boolean z10) {
        this.f6292a = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f6292a ? 1 : 0);
        e0.r(parcel, q6);
    }
}
