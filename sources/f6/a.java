package f6;

import android.os.Parcel;
import android.os.Parcelable;
import b9.e;
import j7.f5;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new e(17);
    public final boolean f5992a;
    public final int f5993b;

    public a(int i10, boolean z4) {
        this.f5992a = z4;
        this.f5993b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f5992a ? 1 : 0);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f5993b);
        f5.r(parcel, q10);
    }
}
