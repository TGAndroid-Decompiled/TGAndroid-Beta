package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class h0 extends r6.a {
    public static final Parcelable.Creator<h0> CREATOR = new db.k(23);
    public final f0 f11509a;
    public final String f11510b;

    static {
        new h0("supported", null);
        new h0("not-supported", null);
    }

    public h0(String str, String str2) {
        q6.m.h(str);
        try {
            this.f11509a = f0.a(str);
            this.f11510b = str2;
        } catch (g0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (!q7.a.h(this.f11509a, h0Var.f11509a) || !q7.a.h(this.f11510b, h0Var.f11510b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11509a, this.f11510b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f11509a.f11503a);
        cc.l(parcel, 3, this.f11510b);
        cc.s(parcel, r10);
    }
}
