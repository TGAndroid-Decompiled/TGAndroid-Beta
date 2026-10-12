package m8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new h(1);
    public final int f16033a;
    public final boolean f16034b;

    public i(int i10, boolean z10) {
        this.f16033a = i10;
        this.f16034b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 2, 4);
        parcel.writeInt(this.f16033a);
        c0.s(parcel, 3, 4);
        parcel.writeInt(this.f16034b ? 1 : 0);
        c0.r(parcel, q6);
    }
}
