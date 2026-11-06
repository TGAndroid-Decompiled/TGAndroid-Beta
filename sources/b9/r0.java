package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class r0 extends r6.a {
    public static final Parcelable.Creator<r0> CREATOR = new n0(4);
    public final int f3098a;

    public r0(int i7) {
        this.f3098a = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f3098a);
        xb.s(parcel, r10);
    }
}
