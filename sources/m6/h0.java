package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class h0 extends y5.a {
    public static final Parcelable.Creator<h0> CREATOR = new r0(4);
    public final f0 f17526a;
    public final String f17527b;

    static {
        new h0("supported", null);
        new h0("not-supported", null);
    }

    public h0(String str, String str2) {
        x5.l.h(str);
        try {
            this.f17526a = f0.a(str);
            this.f17527b = str2;
        } catch (g0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (!x6.a.h(this.f17526a, h0Var.f17526a) || !x6.a.h(this.f17527b, h0Var.f17527b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17526a, this.f17527b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f17526a.f17520a);
        p8.l(parcel, 3, this.f17527b);
        p8.r(parcel, q10);
    }
}
