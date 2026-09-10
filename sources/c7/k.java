package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m.e3;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r f4527a;
    public final String f4528b;
    public final int f4529c;

    public k(int i10, int i11, String str) {
        try {
            this.f4527a = r.a(i10);
            this.f4528b = str;
            this.f4529c = i11;
        } catch (q e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!n6.l.l(this.f4527a, kVar.f4527a) || !n6.l.l(this.f4528b, kVar.f4528b) || !n6.l.l(Integer.valueOf(this.f4529c), Integer.valueOf(kVar.f4529c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4527a, this.f4528b, Integer.valueOf(this.f4529c)});
    }

    public final String toString() {
        e3 e3Var = new e3(getClass().getSimpleName(), 7);
        String valueOf = String.valueOf(this.f4527a.f4557a);
        e3 e3Var2 = new e3(6, false);
        ((e3) e3Var.d).d = e3Var2;
        e3Var.d = e3Var2;
        e3Var2.f13002c = valueOf;
        e3Var2.f13001b = "errorCode";
        String str = this.f4528b;
        if (str != null) {
            e3Var.Y(str, "errorMessage");
        }
        return e3Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        int i11 = this.f4527a.f4557a;
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.e0.l(parcel, 3, this.f4528b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f4529c);
        w7.e0.r(parcel, q6);
    }
}
