package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h0 extends p6.a {
    public static final Parcelable.Creator<h0> CREATOR = new r0(5);
    public final f0 f8186a;
    public final String f8187b;

    static {
        new h0("supported", null);
        new h0("not-supported", null);
    }

    public h0(String str, String str2) {
        o6.l.h(str);
        try {
            this.f8186a = f0.a(str);
            this.f8187b = str2;
        } catch (g0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (!o7.a.h(this.f8186a, h0Var.f8186a) || !o7.a.h(this.f8187b, h0Var.f8187b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8186a, this.f8187b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f8186a.f8181a);
        df.l(parcel, 3, this.f8187b);
        df.r(parcel, q5);
    }
}
