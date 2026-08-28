package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class s extends y5.a {
    public static final Parcelable.Creator<s> CREATOR = new r0(24);
    public final String f17571a;

    public s(String str) {
        x5.l.h(str);
        this.f17571a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        return this.f17571a.equals(((s) obj).f17571a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17571a});
    }

    public final String toString() {
        return aa.d.r(new StringBuilder("FidoAppIdExtension{appid='"), this.f17571a, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f17571a);
        p8.r(parcel, q10);
    }
}
