package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class i0 extends z5.a {
    public static final Parcelable.Creator<i0> CREATOR = new o0(17);

    public final boolean f18368a;

    public i0(boolean z10) {
        this.f18368a = z10;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i0) && this.f18368a == ((i0) obj).f18368a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f18368a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f18368a ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
