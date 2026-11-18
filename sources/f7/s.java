package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class s extends r6.a {
    public static final Parcelable.Creator<s> CREATOR = new t0(13);
    public final String f11560a;

    public s(String str) {
        q6.m.h(str);
        this.f11560a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        return this.f11560a.equals(((s) obj).f11560a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11560a});
    }

    public final String toString() {
        return a8.p0.s(new StringBuilder("FidoAppIdExtension{appid='"), this.f11560a, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f11560a);
        bc.s(parcel, r10);
    }
}
