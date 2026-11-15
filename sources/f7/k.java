package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
import org.telegram.ui.ld0;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new t0(6);
    public final r f11210a;
    public final String f11211b;
    public final int f11212c;

    public k(int i7, int i10, String str) {
        try {
            this.f11210a = r.a(i7);
            this.f11211b = str;
            this.f11212c = i10;
        } catch (q e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!q6.m.k(this.f11210a, kVar.f11210a) || !q6.m.k(this.f11211b, kVar.f11211b) || !q6.m.k(Integer.valueOf(this.f11212c), Integer.valueOf(kVar.f11212c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11210a, this.f11211b, Integer.valueOf(this.f11212c)});
    }

    public final String toString() {
        ld0 ld0Var = new ld0(getClass().getSimpleName(), 10);
        String valueOf = String.valueOf(this.f11210a.f11241a);
        ld0 ld0Var2 = new ld0(9, false);
        ((ld0) ld0Var.f48977c).f48977c = ld0Var2;
        ld0Var.f48977c = ld0Var2;
        ld0Var2.f48976b = valueOf;
        ld0Var2.d = "errorCode";
        String str = this.f11211b;
        if (str != null) {
            ld0Var.L(str, "errorMessage");
        }
        return ld0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        int i10 = this.f11210a.f11241a;
        yb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        yb.l(parcel, 3, this.f11211b);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.f11212c);
        yb.s(parcel, r10);
    }
}
