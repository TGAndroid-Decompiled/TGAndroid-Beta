package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class h0 extends z5.a {
    public static final Parcelable.Creator<h0> CREATOR = new o0(15);

    public final f0 f18362a;

    public final String f18363b;

    static {
        new h0("supported", null);
        new h0("not-supported", null);
    }

    public h0(String str, String str2) {
        y5.l.h(str);
        try {
            this.f18362a = f0.a(str);
            this.f18363b = str2;
        } catch (g0 e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return y6.a.h(this.f18362a, h0Var.f18362a) && y6.a.h(this.f18363b, h0Var.f18363b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18362a, this.f18363b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f18362a.f18356a);
        r8.l(parcel, 3, this.f18363b);
        r8.r(parcel, iQ);
    }
}
