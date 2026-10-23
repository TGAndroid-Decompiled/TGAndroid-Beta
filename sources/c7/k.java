package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m.g3;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r f4974a;
    public final String f4975b;
    public final int f4976c;

    public k(int i10, int i11, String str) {
        try {
            this.f4974a = r.a(i10);
            this.f4975b = str;
            this.f4976c = i11;
        } catch (q e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!n6.l.l(this.f4974a, kVar.f4974a) || !n6.l.l(this.f4975b, kVar.f4975b) || !n6.l.l(Integer.valueOf(this.f4976c), Integer.valueOf(kVar.f4976c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4974a, this.f4975b, Integer.valueOf(this.f4976c)});
    }

    public final String toString() {
        g3 g3Var = new g3(getClass().getSimpleName());
        String valueOf = String.valueOf(this.f4974a.f5004a);
        g3 g3Var2 = new g3(7, false);
        ((g3) g3Var.d).d = g3Var2;
        g3Var.d = g3Var2;
        g3Var2.f16266c = valueOf;
        g3Var2.f16265b = "errorCode";
        String str = this.f4975b;
        if (str != null) {
            g3Var.Y(str, "errorMessage");
        }
        return g3Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        int i11 = this.f4974a.f5004a;
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.f0.l(parcel, 3, this.f4975b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f4976c);
        w7.f0.r(parcel, q6);
    }
}
