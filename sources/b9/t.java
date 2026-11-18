package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class t extends r6.a {
    public static final Parcelable.Creator<t> CREATOR = new c(17);
    public final int f3056a;
    public final String f3057b;

    public t(int i7, String str) {
        this.f3056a = i7;
        this.f3057b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3056a);
        bc.l(parcel, 3, this.f3057b);
        bc.s(parcel, r10);
    }
}
