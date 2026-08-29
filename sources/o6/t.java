package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class t extends a6.a {
    public static final Parcelable.Creator<t> CREATOR = new n0(2);
    public final boolean f19433a;

    public t(boolean z10) {
        this.f19433a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t) || this.f19433a != ((t) obj).f19433a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19433a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f19433a ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
