package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class t9d extends c4 {
    public static final Parcelable.Creator<t9d> CREATOR = new ced((byte) 16);
    public final String a;

    public t9d(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t9d)) {
            return false;
        }
        return qd1.d(this.a, ((t9d) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.s(parcel, r);
    }
}
