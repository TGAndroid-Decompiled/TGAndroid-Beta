package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h0 extends o6.a {
    public static final Parcelable.Creator<h0> CREATOR = new r0(4);
    public final f0 f4096a;
    public final String f4097b;

    static {
        new h0("supported", null);
        new h0("not-supported", null);
    }

    public h0(String str, String str2) {
        n6.l.h(str);
        try {
            this.f4096a = f0.a(str);
            this.f4097b = str2;
        } catch (g0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (!n7.a.h(this.f4096a, h0Var.f4096a) || !n7.a.h(this.f4097b, h0Var.f4097b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4096a, this.f4097b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f4096a.f4091a);
        w7.f0.l(parcel, 3, this.f4097b);
        w7.f0.r(parcel, q6);
    }
}
