package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class s extends r6.a {
    public static final Parcelable.Creator<s> CREATOR = new t0(13);
    public final String f11555a;

    public s(String str) {
        q6.m.h(str);
        this.f11555a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        return this.f11555a.equals(((s) obj).f11555a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11555a});
    }

    public final String toString() {
        return a8.p0.s(new StringBuilder("FidoAppIdExtension{appid='"), this.f11555a, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f11555a);
        cc.s(parcel, r10);
    }
}
