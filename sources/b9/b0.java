package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class b0 extends r6.a {
    public static final Parcelable.Creator<b0> CREATOR = new c(25);
    public final int f2941a;
    public final String f2942b;

    public b0(int i7, String str) {
        this.f2941a = i7;
        this.f2942b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f2941a);
        cc.l(parcel, 3, this.f2942b);
        cc.s(parcel, r10);
    }
}
