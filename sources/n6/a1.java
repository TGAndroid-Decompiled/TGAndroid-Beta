package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class a1 extends z5.a {
    public static final Parcelable.Creator<a1> CREATOR = new h5.h(28);

    public final boolean f18331a;

    public a1(boolean z10) {
        this.f18331a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a1) && this.f18331a == ((a1) obj).f18331a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f18331a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f18331a ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
