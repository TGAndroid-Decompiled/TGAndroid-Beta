package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class p7d extends b4 {
    public static final Parcelable.Creator<p7d> CREATOR = new v6d((byte) 11);
    public final long a;

    public p7d(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p7d) || this.a != ((p7d) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 8);
        parcel.writeLong(this.a);
        mve.s(parcel, r);
    }
}
