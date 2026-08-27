package h5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class d extends z5.a {
    public static final Parcelable.Creator<d> CREATOR = new h(4);

    public final boolean f8272a;

    public d(boolean z10) {
        this.f8272a = z10;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && this.f8272a == ((d) obj).f8272a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8272a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f8272a ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
