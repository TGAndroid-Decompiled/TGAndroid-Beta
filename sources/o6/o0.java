package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class o0 extends a6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final boolean f19411a;

    public o0(boolean z10) {
        this.f19411a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0) || this.f19411a != ((o0) obj).f19411a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19411a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f19411a ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
