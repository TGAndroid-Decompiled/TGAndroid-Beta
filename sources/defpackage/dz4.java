package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class dz4 extends b4 {
    public static final Parcelable.Creator<dz4> CREATOR = new t4d((byte) 16);
    public final boolean a;

    public dz4(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dz4) || this.a != ((dz4) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        jte.s(parcel, r);
    }
}
