package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class h0 extends r6.a {
    public static final Parcelable.Creator<h0> CREATOR = new db.k(23);
    public final f0 f11389a;
    public final String f11390b;

    static {
        new h0("supported", null);
        new h0("not-supported", null);
    }

    public h0(String str, String str2) {
        q6.m.g(str);
        try {
            this.f11389a = f0.a(str);
            this.f11390b = str2;
        } catch (g0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (!q7.a.h(this.f11389a, h0Var.f11389a) || !q7.a.h(this.f11390b, h0Var.f11390b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11389a, this.f11390b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f11389a.f11383a);
        xb.l(parcel, 3, this.f11390b);
        xb.s(parcel, r10);
    }
}
