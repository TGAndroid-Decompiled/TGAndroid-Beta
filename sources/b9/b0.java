package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class b0 extends r6.a {
    public static final Parcelable.Creator<b0> CREATOR = new c(25);
    public final int f3018a;
    public final String f3019b;

    public b0(int i7, String str) {
        this.f3018a = i7;
        this.f3019b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f3018a);
        xb.l(parcel, 3, this.f3019b);
        xb.s(parcel, r10);
    }
}
