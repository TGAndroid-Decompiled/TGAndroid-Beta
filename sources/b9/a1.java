package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends r6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f2936a;
    public final int f2937b;
    public final int f2938c;

    public a1(String str, int i7, int i10) {
        this.f2936a = str;
        this.f2937b = i7;
        this.f2938c = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f2937b == a1Var.f2937b && this.f2938c == a1Var.f2938c && ((str2 = this.f2936a) == (str = a1Var.f2936a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2936a, Integer.valueOf(this.f2937b), Integer.valueOf(this.f2938c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a8.p0.s(i5.c.n("WebIconParcelable{", this.f2937b, "x", this.f2938c, " - "), this.f2936a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.f2936a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f2937b);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f2938c);
        cc.s(parcel, r10);
    }
}
