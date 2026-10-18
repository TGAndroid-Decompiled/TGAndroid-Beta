package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m.g3;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r f4972a;
    public final String f4973b;
    public final int f4974c;

    public k(int i10, int i11, String str) {
        try {
            this.f4972a = r.a(i10);
            this.f4973b = str;
            this.f4974c = i11;
        } catch (q e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!n6.l.l(this.f4972a, kVar.f4972a) || !n6.l.l(this.f4973b, kVar.f4973b) || !n6.l.l(Integer.valueOf(this.f4974c), Integer.valueOf(kVar.f4974c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4972a, this.f4973b, Integer.valueOf(this.f4974c)});
    }

    public final String toString() {
        g3 g3Var = new g3(getClass().getSimpleName());
        String valueOf = String.valueOf(this.f4972a.f5002a);
        g3 g3Var2 = new g3(7, false);
        ((g3) g3Var.d).d = g3Var2;
        g3Var.d = g3Var2;
        g3Var2.f16204c = valueOf;
        g3Var2.f16203b = "errorCode";
        String str = this.f4973b;
        if (str != null) {
            g3Var.T(str, "errorMessage");
        }
        return g3Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        int i11 = this.f4972a.f5002a;
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.f0.l(parcel, 3, this.f4973b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.f4974c);
        w7.f0.r(parcel, q6);
    }
}
