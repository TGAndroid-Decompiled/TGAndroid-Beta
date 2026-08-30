package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import java.util.Locale;
public final class b1 extends c6.a {
    public static final Parcelable.Creator<b1> CREATOR = new c(26);
    public final String f13778a;
    public final int f13779b;
    public final int f13780c;

    public b1(String str, int i10, int i11) {
        this.f13778a = str;
        this.f13779b = i10;
        this.f13780c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (this.f13779b == b1Var.f13779b && this.f13780c == b1Var.f13780c && ((str2 = this.f13778a) == (str = b1Var.f13778a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13778a, Integer.valueOf(this.f13779b), Integer.valueOf(this.f13780c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return android.support.v4.media.a.r(e2.c.m("WebIconParcelable{", this.f13779b, "x", this.f13780c, " - "), this.f13778a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.f13778a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13779b);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f13780c);
        f5.r(parcel, q10);
    }
}
