package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import java.util.Locale;
public final class b1 extends c6.a {
    public static final Parcelable.Creator<b1> CREATOR = new c(26);
    public final String f13490a;
    public final int f13491b;
    public final int f13492c;

    public b1(String str, int i10, int i11) {
        this.f13490a = str;
        this.f13491b = i10;
        this.f13492c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (this.f13491b == b1Var.f13491b && this.f13492c == b1Var.f13492c && ((str2 = this.f13490a) == (str = b1Var.f13490a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13490a, Integer.valueOf(this.f13491b), Integer.valueOf(this.f13492c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return android.support.v4.media.a.r(e2.c.m("WebIconParcelable{", this.f13491b, "x", this.f13492c, " - "), this.f13490a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.f13490a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13491b);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f13492c);
        g5.r(parcel, q10);
    }
}
