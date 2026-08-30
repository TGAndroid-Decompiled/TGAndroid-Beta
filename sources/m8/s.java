package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class s extends c6.a {
    public static final Parcelable.Creator<s> CREATOR = new c(14);
    public final int f13853a;
    public final boolean f13854b;

    public s(int i10, boolean z4) {
        this.f13853a = i10;
        this.f13854b = z4;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13853a);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f13854b ? 1 : 0);
        f5.r(parcel, q10);
    }
}
