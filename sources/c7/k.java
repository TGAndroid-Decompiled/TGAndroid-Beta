package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m.f3;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r f4490a;
    public final String f4491b;
    public final int f4492c;

    public k(int i10, int i11, String str) {
        try {
            this.f4490a = r.a(i10);
            this.f4491b = str;
            this.f4492c = i11;
        } catch (q e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!n6.m.l(this.f4490a, kVar.f4490a) || !n6.m.l(this.f4491b, kVar.f4491b) || !n6.m.l(Integer.valueOf(this.f4492c), Integer.valueOf(kVar.f4492c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4490a, this.f4491b, Integer.valueOf(this.f4492c)});
    }

    public final String toString() {
        f3 f3Var = new f3(getClass().getSimpleName());
        String valueOf = String.valueOf(this.f4490a.f4521a);
        f3 f3Var2 = new f3(7, false);
        ((f3) f3Var.d).d = f3Var2;
        f3Var.d = f3Var2;
        f3Var2.f15424c = valueOf;
        f3Var2.f15423b = "errorCode";
        String str = this.f4491b;
        if (str != null) {
            f3Var.Z(str, "errorMessage");
        }
        return f3Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        int i11 = this.f4490a.f4521a;
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.c0.l(parcel, 3, this.f4491b);
        w7.c0.s(parcel, 4, 4);
        parcel.writeInt(this.f4492c);
        w7.c0.r(parcel, q6);
    }
}
