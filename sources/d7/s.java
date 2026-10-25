package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class s extends p6.a {
    public static final Parcelable.Creator<s> CREATOR = new r0(25);
    public final String f8229a;

    public s(String str) {
        o6.l.h(str);
        this.f8229a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        return this.f8229a.equals(((s) obj).f8229a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8229a});
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("FidoAppIdExtension{appid='"), this.f8229a, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f8229a);
        df.r(parcel, q5);
    }
}
