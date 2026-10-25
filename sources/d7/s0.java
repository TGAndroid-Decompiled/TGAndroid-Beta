package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class s0 extends p6.a {
    public static final Parcelable.Creator<s0> CREATOR = new r0(3);
    public final String f8230a;

    public s0(String str) {
        this.f8230a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s0)) {
            return false;
        }
        return o6.l.l(this.f8230a, ((s0) obj).f8230a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8230a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f8230a);
        df.r(parcel, q5);
    }
}
