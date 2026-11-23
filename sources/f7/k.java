package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
import org.telegram.ui.Components.i61;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new t0(6);
    public final r f11521a;
    public final String f11522b;
    public final int f11523c;

    public k(int i7, int i10, String str) {
        try {
            this.f11521a = r.a(i7);
            this.f11522b = str;
            this.f11523c = i10;
        } catch (q e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!q6.m.l(this.f11521a, kVar.f11521a) || !q6.m.l(this.f11522b, kVar.f11522b) || !q6.m.l(Integer.valueOf(this.f11523c), Integer.valueOf(kVar.f11523c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11521a, this.f11522b, Integer.valueOf(this.f11523c)});
    }

    public final String toString() {
        i61 i61Var = new i61(getClass().getSimpleName());
        String valueOf = String.valueOf(this.f11521a.f11552a);
        i61 i61Var2 = new i61(11, false);
        ((i61) i61Var.d).d = i61Var2;
        i61Var.d = i61Var2;
        i61Var2.f35959c = valueOf;
        i61Var2.f35958b = "errorCode";
        String str = this.f11522b;
        if (str != null) {
            i61Var.R(str, "errorMessage");
        }
        return i61Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.f11521a.f11552a;
        cc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        cc.l(parcel, 3, this.f11522b);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.f11523c);
        cc.s(parcel, r10);
    }
}
