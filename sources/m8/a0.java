package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class a0 extends c6.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(22);
    public final int f13753a;
    public final String f13754b;

    public a0(int i10, String str) {
        this.f13753a = i10;
        this.f13754b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13753a);
        f5.l(parcel, 3, this.f13754b);
        f5.r(parcel, q10);
    }
}
