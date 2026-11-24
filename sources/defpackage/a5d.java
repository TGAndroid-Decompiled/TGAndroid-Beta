package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class a5d extends b4 {
    public static final Parcelable.Creator<a5d> CREATOR = new j9d((byte) 16);
    public final String a;

    public a5d(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a5d)) {
            return false;
        }
        return id1.d(this.a, ((a5d) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.s(parcel, r);
    }
}
