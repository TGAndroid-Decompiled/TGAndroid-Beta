package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
public final class h0 extends r6.a {
    public static final Parcelable.Creator<h0> CREATOR = new db.k(23);
    public final f0 f11384a;
    public final String f11385b;

    static {
        new h0("supported", null);
        new h0("not-supported", null);
    }

    public h0(String str, String str2) {
        q6.m.g(str);
        try {
            this.f11384a = f0.a(str);
            this.f11385b = str2;
        } catch (g0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (!q7.a.h(this.f11384a, h0Var.f11384a) || !q7.a.h(this.f11385b, h0Var.f11385b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11384a, this.f11385b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f11384a.f11378a);
        wb.l(parcel, 3, this.f11385b);
        wb.s(parcel, r10);
    }
}
