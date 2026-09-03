package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class s0 extends c6.a {
    public static final Parcelable.Creator<s0> CREATOR = new o0(4);
    public final int f13839a;

    public s0(int i10) {
        this.f13839a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13839a);
        f5.r(parcel, q10);
    }
}
