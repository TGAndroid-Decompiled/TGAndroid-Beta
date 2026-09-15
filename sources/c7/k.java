package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m.e3;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r f4108a;
    public final String f4109b;
    public final int f4110c;

    public k(int i10, int i11, String str) {
        try {
            this.f4108a = r.a(i10);
            this.f4109b = str;
            this.f4110c = i11;
        } catch (q e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!n6.l.l(this.f4108a, kVar.f4108a) || !n6.l.l(this.f4109b, kVar.f4109b) || !n6.l.l(Integer.valueOf(this.f4110c), Integer.valueOf(kVar.f4110c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4108a, this.f4109b, Integer.valueOf(this.f4110c)});
    }

    public final String toString() {
        e3 e3Var = new e3(getClass().getSimpleName());
        String valueOf = String.valueOf(this.f4108a.f4138a);
        e3 e3Var2 = new e3(6, false);
        ((e3) e3Var.d).d = e3Var2;
        e3Var.d = e3Var2;
        e3Var2.f14166c = valueOf;
        e3Var2.f14165b = "errorCode";
        String str = this.f4109b;
        if (str != null) {
            e3Var.Y(str, "errorMessage");
        }
        return e3Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        int i11 = this.f4108a.f4138a;
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.e0.l(parcel, 3, this.f4109b);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.f4110c);
        w7.e0.r(parcel, q6);
    }
}
