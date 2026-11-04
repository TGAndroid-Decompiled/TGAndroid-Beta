package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class s extends q6.a {
    public static final Parcelable.Creator<s> CREATOR = new r0(28);
    public final String f9872a;

    public s(String str) {
        p6.m.g(str);
        this.f9872a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        return this.f9872a.equals(((s) obj).f9872a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9872a});
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("FidoAppIdExtension{appid='"), this.f9872a, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f9872a);
        j8.a.t(parcel, s6);
    }
}
