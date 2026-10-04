package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h0 extends o6.a {
    public static final Parcelable.Creator<h0> CREATOR = new r0(4);
    public final f0 f4430a;
    public final String f4431b;

    static {
        new h0("supported", null);
        new h0("not-supported", null);
    }

    public h0(String str, String str2) {
        n6.l.h(str);
        try {
            this.f4430a = f0.a(str);
            this.f4431b = str2;
        } catch (g0 e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (!n7.a.h(this.f4430a, h0Var.f4430a) || !n7.a.h(this.f4431b, h0Var.f4431b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4430a, this.f4431b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 2, this.f4430a.f4424a);
        w7.g0.l(parcel, 3, this.f4431b);
        w7.g0.r(parcel, q6);
    }
}
