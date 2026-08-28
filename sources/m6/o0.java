package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class o0 extends y5.a {
    public static final Parcelable.Creator<o0> CREATOR = new h5.h(21);
    public final String f17551a;

    public o0(String str) {
        x5.l.h(str);
        this.f17551a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        return this.f17551a.equals(((o0) obj).f17551a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17551a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.f17551a);
        p8.r(parcel, q10);
    }
}
