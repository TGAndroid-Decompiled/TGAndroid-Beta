package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class s extends r6.a {
    public static final Parcelable.Creator<s> CREATOR = new c(16);
    public final int f3099a;
    public final boolean f3100b;

    public s(int i7, boolean z9) {
        this.f3099a = i7;
        this.f3100b = z9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f3099a);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f3100b ? 1 : 0);
        xb.s(parcel, r10);
    }
}
