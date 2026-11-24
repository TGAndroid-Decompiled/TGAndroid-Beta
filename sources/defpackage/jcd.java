package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class jcd extends b4 {
    public static final Parcelable.Creator<jcd> CREATOR = new lbd((byte) 7);
    public final String a;

    public jcd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jcd)) {
            return false;
        }
        return fse.a(this.a, ((jcd) obj).a);
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
