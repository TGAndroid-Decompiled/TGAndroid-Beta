package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import java.util.Locale;
public final class a1 extends r6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String f3013a;
    public final int f3014b;
    public final int f3015c;

    public a1(String str, int i7, int i10) {
        this.f3013a = str;
        this.f3014b = i7;
        this.f3015c = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f3014b == a1Var.f3014b && this.f3015c == a1Var.f3015c && ((str2 = this.f3013a) == (str = a1Var.f3013a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3013a, Integer.valueOf(this.f3014b), Integer.valueOf(this.f3015c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a8.p0.s(jg.g.o("WebIconParcelable{", this.f3014b, "x", this.f3015c, " - "), this.f3013a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f3013a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f3014b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f3015c);
        xb.s(parcel, r10);
    }
}
