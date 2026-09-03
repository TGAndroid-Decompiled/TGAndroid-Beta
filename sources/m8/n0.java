package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class n0 extends c6.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0(0);
    public final int f13553a;
    public final f f13554b;

    public n0(int i10, f fVar) {
        this.f13553a = i10;
        this.f13554b = fVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13553a);
        g5.k(parcel, 3, this.f13554b, i10);
        g5.r(parcel, q10);
    }
}
