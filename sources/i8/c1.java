package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import java.util.Locale;
public final class c1 extends y5.a {
    public static final Parcelable.Creator<c1> CREATOR = new c(26);
    public final String f10956a;
    public final int f10957b;
    public final int f10958c;

    public c1(String str, int i9, int i10) {
        this.f10956a = str;
        this.f10957b = i9;
        this.f10958c = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (this.f10957b == c1Var.f10957b && this.f10958c == c1Var.f10958c && ((str2 = this.f10956a) == (str = c1Var.f10956a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10956a, Integer.valueOf(this.f10957b), Integer.valueOf(this.f10958c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return aa.d.r(e2.c.o("WebIconParcelable{", this.f10957b, "x", this.f10958c, " - "), this.f10956a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.f10956a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f10957b);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f10958c);
        p8.r(parcel, q10);
    }
}
