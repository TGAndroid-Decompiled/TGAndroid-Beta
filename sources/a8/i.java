package a8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class i extends c6.a {
    public static final Parcelable.Creator<i> CREATOR = new w.a(6);
    public final int f152a;
    public final boolean f153b;

    public i(int i10, boolean z4) {
        this.f152a = i10;
        this.f153b = z4;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f152a);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f153b ? 1 : 0);
        g5.r(parcel, q10);
    }
}
