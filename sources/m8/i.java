package m8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new h(1);
    public final int f16808a;
    public final boolean f16809b;

    public i(int i10, boolean z10) {
        this.f16808a = i10;
        this.f16809b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f16808a);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f16809b ? 1 : 0);
        f0.r(parcel, q6);
    }
}
