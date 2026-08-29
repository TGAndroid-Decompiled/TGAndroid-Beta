package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h0 extends a6.a {
    public static final Parcelable.Creator<h0> CREATOR = new n0(16);
    public final f0 f19386a;
    public final String f19387b;

    static {
        new h0("supported", null);
        new h0("not-supported", null);
    }

    public h0(String str, String str2) {
        z5.l.h(str);
        try {
            this.f19386a = f0.a(str);
            this.f19387b = str2;
        } catch (g0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (!z6.a.h(this.f19386a, h0Var.f19386a) || !z6.a.h(this.f19387b, h0Var.f19387b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19386a, this.f19387b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f19386a.f19380a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f19387b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
