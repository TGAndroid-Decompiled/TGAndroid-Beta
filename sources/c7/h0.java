package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h0 extends o6.a {
    public static final Parcelable.Creator<h0> CREATOR = new r0(4);
    public final f0 f4623a;
    public final String f4624b;

    static {
        new h0("supported", null);
        new h0("not-supported", null);
    }

    public h0(String str, String str2) {
        n6.l.h(str);
        try {
            this.f4623a = f0.a(str);
            this.f4624b = str2;
        } catch (g0 e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (!n7.a.h(this.f4623a, h0Var.f4623a) || !n7.a.h(this.f4624b, h0Var.f4624b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4623a, this.f4624b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f4623a.f4617a);
        w7.e0.l(parcel, 3, this.f4624b);
        w7.e0.r(parcel, q6);
    }
}
