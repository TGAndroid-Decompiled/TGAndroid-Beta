package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(22);
    public final int f3090a;
    public final String f3091b;

    public y(int i7, String str) {
        this.f3090a = i7;
        this.f3091b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3090a);
        bc.l(parcel, 3, this.f3091b);
        bc.s(parcel, r10);
    }
}
