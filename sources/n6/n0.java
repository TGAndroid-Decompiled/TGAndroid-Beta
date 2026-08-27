package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class n0 extends z5.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0(0);

    public final boolean f18385a;

    public n0(boolean z10) {
        this.f18385a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n0) && this.f18385a == ((n0) obj).f18385a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f18385a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f18385a ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
