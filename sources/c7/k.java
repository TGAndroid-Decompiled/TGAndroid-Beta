package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m.h3;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r f4601a;
    public final String f4602b;
    public final int f4603c;

    public k(int i10, int i11, String str) {
        try {
            this.f4601a = r.a(i10);
            this.f4602b = str;
            this.f4603c = i11;
        } catch (q e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!n6.l.l(this.f4601a, kVar.f4601a) || !n6.l.l(this.f4602b, kVar.f4602b) || !n6.l.l(Integer.valueOf(this.f4603c), Integer.valueOf(kVar.f4603c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4601a, this.f4602b, Integer.valueOf(this.f4603c)});
    }

    public final String toString() {
        h3 h3Var = new h3(getClass().getSimpleName());
        String valueOf = String.valueOf(this.f4601a.f4631a);
        h3 h3Var2 = new h3(7, false);
        ((h3) h3Var.d).d = h3Var2;
        h3Var.d = h3Var2;
        h3Var2.f14851c = valueOf;
        h3Var2.f14850b = "errorCode";
        String str = this.f4602b;
        if (str != null) {
            h3Var.Y(str, "errorMessage");
        }
        return h3Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        int i11 = this.f4601a.f4631a;
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.f0.l(parcel, 3, this.f4602b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f4603c);
        w7.f0.r(parcel, q6);
    }
}
