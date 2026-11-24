package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u8d extends b4 {
    public static final Parcelable.Creator<u8d> CREATOR = new v6d((byte) 18);
    public final String a;

    public u8d(String str) {
        ite.h(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u8d)) {
            return false;
        }
        return this.a.equals(((u8d) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.s(parcel, r);
    }
}
