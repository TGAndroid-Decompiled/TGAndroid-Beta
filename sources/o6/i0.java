package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class i0 extends a6.a {
    public static final Parcelable.Creator<i0> CREATOR = new n0(18);
    public final boolean f19392a;

    public i0(boolean z10) {
        this.f19392a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0) || this.f19392a != ((i0) obj).f19392a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19392a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f19392a ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
