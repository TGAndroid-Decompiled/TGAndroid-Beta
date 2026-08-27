package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class t extends z5.a {
    public static final Parcelable.Creator<t> CREATOR = new o0(1);

    public final boolean f18409a;

    public t(boolean z10) {
        this.f18409a = z10;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t) && this.f18409a == ((t) obj).f18409a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f18409a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f18409a ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
