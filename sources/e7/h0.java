package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h0 extends q6.a {
    public static final Parcelable.Creator<h0> CREATOR = new r0(8);
    public final f0 f9827a;
    public final String f9828b;

    static {
        new h0("supported", null);
        new h0("not-supported", null);
    }

    public h0(String str, String str2) {
        p6.m.g(str);
        try {
            this.f9827a = f0.a(str);
            this.f9828b = str2;
        } catch (g0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (!p7.a.h(this.f9827a, h0Var.f9827a) || !p7.a.h(this.f9828b, h0Var.f9828b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9827a, this.f9828b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f9827a.f9821a);
        j8.a.m(parcel, 3, this.f9828b);
        j8.a.t(parcel, s6);
    }
}
