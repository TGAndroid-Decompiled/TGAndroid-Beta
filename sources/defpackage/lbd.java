package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class lbd extends c4 {
    public static final Parcelable.Creator<lbd> CREATOR = new m9d((byte) 18);
    public final String a;

    public lbd(String str) {
        xve.h(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lbd)) {
            return false;
        }
        return this.a.equals(((lbd) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.s(parcel, r);
    }
}
