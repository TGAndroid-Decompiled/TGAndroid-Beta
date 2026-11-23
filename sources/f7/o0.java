package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class o0 extends r6.a {
    public static final Parcelable.Creator<o0> CREATOR = new db.k(10);
    public final String f11534a;

    public o0(String str) {
        q6.m.h(str);
        this.f11534a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        return this.f11534a.equals(((o0) obj).f11534a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11534a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.f11534a);
        cc.s(parcel, r10);
    }
}
