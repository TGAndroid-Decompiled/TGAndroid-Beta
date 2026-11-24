package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class s6d extends b4 {
    public static final Parcelable.Creator<s6d> CREATOR = new t4d((byte) 18);
    public final String a;

    public s6d(String str) {
        fre.h(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s6d)) {
            return false;
        }
        return this.a.equals(((s6d) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.s(parcel, r);
    }
}
