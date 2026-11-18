package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(22);
    public final int f3078a;
    public final String f3079b;

    public y(int i7, String str) {
        this.f3078a = i7;
        this.f3079b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3078a);
        bc.l(parcel, 3, this.f3079b);
        bc.s(parcel, r10);
    }
}
