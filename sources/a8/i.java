package a8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class i extends c6.a {
    public static final Parcelable.Creator<i> CREATOR = new w.a(6);
    public final int f139a;
    public final boolean f140b;

    public i(int i10, boolean z4) {
        this.f139a = i10;
        this.f140b = z4;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f139a);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f140b ? 1 : 0);
        f5.r(parcel, q10);
    }
}
