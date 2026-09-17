package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class n0 extends o6.a {
    public static final Parcelable.Creator<n0> CREATOR = new w.a(19);
    public final boolean f4646a;

    public n0(boolean z10) {
        this.f4646a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0) || this.f4646a != ((n0) obj).f4646a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4646a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f4646a ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
