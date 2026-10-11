package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new w.a(21);
    public final String f4504a;

    public o0(String str) {
        n6.m.h(str);
        this.f4504a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        return this.f4504a.equals(((o0) obj).f4504a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4504a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 1, this.f4504a);
        w7.d0.r(parcel, q6);
    }
}
