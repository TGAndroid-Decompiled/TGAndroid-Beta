package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new w.a(21);
    public final String f4455a;

    public o0(String str) {
        n6.l.h(str);
        this.f4455a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        return this.f4455a.equals(((o0) obj).f4455a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4455a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 1, this.f4455a);
        w7.g0.r(parcel, q6);
    }
}
