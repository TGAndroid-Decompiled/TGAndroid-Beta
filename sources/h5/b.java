package h5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import x5.l;
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new h(3);
    public final boolean f9837a;
    public final String f9838b;

    public b(String str, boolean z10) {
        if (z10) {
            l.h(str);
        }
        this.f9837a = z10;
        this.f9838b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f9837a == bVar.f9837a && l.l(this.f9838b, bVar.f9838b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9837a), this.f9838b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f9837a ? 1 : 0);
        p8.l(parcel, 2, this.f9838b);
        p8.r(parcel, q10);
    }
}
