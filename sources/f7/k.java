package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import org.telegram.ui.md0;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new t0(6);
    public final r f11559a;
    public final String f11560b;
    public final int f11561c;

    public k(int i7, int i10, String str) {
        try {
            this.f11559a = r.a(i7);
            this.f11560b = str;
            this.f11561c = i10;
        } catch (q e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!q6.m.l(this.f11559a, kVar.f11559a) || !q6.m.l(this.f11560b, kVar.f11560b) || !q6.m.l(Integer.valueOf(this.f11561c), Integer.valueOf(kVar.f11561c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11559a, this.f11560b, Integer.valueOf(this.f11561c)});
    }

    public final String toString() {
        md0 md0Var = new md0(getClass().getSimpleName(), 10);
        String valueOf = String.valueOf(this.f11559a.f11590a);
        md0 md0Var2 = new md0(9, false);
        ((md0) md0Var.f49858c).f49858c = md0Var2;
        md0Var.f49858c = md0Var2;
        md0Var2.f49857b = valueOf;
        md0Var2.d = "errorCode";
        String str = this.f11560b;
        if (str != null) {
            md0Var.L(str, "errorMessage");
        }
        return md0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f11559a.f11590a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 3, this.f11560b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f11561c);
        bc.s(parcel, r10);
    }
}
