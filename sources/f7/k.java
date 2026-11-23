package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
import org.telegram.ui.md0;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new t0(6);
    public final r f11522a;
    public final String f11523b;
    public final int f11524c;

    public k(int i7, int i10, String str) {
        try {
            this.f11522a = r.a(i7);
            this.f11523b = str;
            this.f11524c = i10;
        } catch (q e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!q6.m.l(this.f11522a, kVar.f11522a) || !q6.m.l(this.f11523b, kVar.f11523b) || !q6.m.l(Integer.valueOf(this.f11524c), Integer.valueOf(kVar.f11524c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11522a, this.f11523b, Integer.valueOf(this.f11524c)});
    }

    public final String toString() {
        md0 md0Var = new md0(getClass().getSimpleName(), 10);
        String valueOf = String.valueOf(this.f11522a.f11553a);
        md0 md0Var2 = new md0(9, false);
        ((md0) md0Var.f49831c).f49831c = md0Var2;
        md0Var.f49831c = md0Var2;
        md0Var2.f49830b = valueOf;
        md0Var2.d = "errorCode";
        String str = this.f11523b;
        if (str != null) {
            md0Var.L(str, "errorMessage");
        }
        return md0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.f11522a.f11553a;
        cc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        cc.l(parcel, 3, this.f11523b);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.f11524c);
        cc.s(parcel, r10);
    }
}
