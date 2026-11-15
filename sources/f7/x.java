package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new db.k(16);
    public final a0 f11273a;
    public final o f11274b;

    public x(String str, int i7) {
        q6.m.g(str);
        try {
            this.f11273a = a0.a(str);
            try {
                this.f11274b = o.a(i7);
            } catch (n e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (z e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.f11273a.equals(xVar.f11273a) || !this.f11274b.equals(xVar.f11274b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11273a, this.f11274b});
    }

    public final String toString() {
        return r.b.l("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f11273a), ", \n algorithm=", String.valueOf(this.f11274b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        this.f11273a.getClass();
        yb.l(parcel, 2, "public-key");
        yb.i(parcel, 3, Integer.valueOf(this.f11274b.f11222a.a()));
        yb.s(parcel, r10);
    }
}
