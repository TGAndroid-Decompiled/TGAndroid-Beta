package f6;

import android.os.Parcel;
import android.os.Parcelable;
import b9.e;
import j7.g5;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new e(17);
    public final boolean f6111a;
    public final int f6112b;

    public a(int i10, boolean z4) {
        this.f6111a = z4;
        this.f6112b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f6111a ? 1 : 0);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f6112b);
        g5.r(parcel, q10);
    }
}
