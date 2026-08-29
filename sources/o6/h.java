package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h extends a6.a {
    public static final Parcelable.Creator<h> CREATOR = new n0(24);
    public final boolean f19385a;

    public h(boolean z10) {
        this.f19385a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h) || this.f19385a != ((h) obj).f19385a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19385a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f19385a ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
