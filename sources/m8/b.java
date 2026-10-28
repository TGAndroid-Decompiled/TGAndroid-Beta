package m8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import h8.j;
import java.util.Arrays;
import o6.l;
public final class b extends p6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(23);
    public String f18363a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return l.l(this.f18363a, ((b) obj).f18363a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18363a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f18363a);
        df.r(parcel, q5);
    }
}
