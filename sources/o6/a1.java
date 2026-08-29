package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class a1 extends a6.a {
    public static final Parcelable.Creator<a1> CREATOR = new i4.g(29);
    public final boolean f19355a;

    public a1(boolean z10) {
        this.f19355a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a1) || this.f19355a != ((a1) obj).f19355a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19355a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f19355a ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
