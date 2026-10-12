package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h0 extends o6.a {
    public static final Parcelable.Creator<h0> CREATOR = new r0(4);
    public final f0 f4587a;
    public final String f4588b;

    static {
        new h0("supported", null);
        new h0("not-supported", null);
    }

    public h0(String str, String str2) {
        n6.l.h(str);
        try {
            this.f4587a = f0.a(str);
            this.f4588b = str2;
        } catch (g0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (!n7.a.h(this.f4587a, h0Var.f4587a) || !n7.a.h(this.f4588b, h0Var.f4588b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4587a, this.f4588b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 2, this.f4587a.f4582a);
        w7.g0.l(parcel, 3, this.f4588b);
        w7.g0.r(parcel, q6);
    }
}
