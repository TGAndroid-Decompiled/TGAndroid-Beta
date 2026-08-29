package k8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class c1 extends a6.a {
    public static final Parcelable.Creator<c1> CREATOR = new c(26);
    public final String f13479a;
    public final int f13480b;
    public final int f13481c;

    public c1(String str, int i10, int i11) {
        this.f13479a = str;
        this.f13480b = i10;
        this.f13481c = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (this.f13480b == c1Var.f13480b && this.f13481c == c1Var.f13481c && ((str2 = this.f13479a) == (str = c1Var.f13479a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13479a, Integer.valueOf(this.f13480b), Integer.valueOf(this.f13481c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a4.w.q(com.google.android.recaptcha.internal.a.o("WebIconParcelable{", this.f13480b, "x", this.f13481c, " - "), this.f13479a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 1, this.f13479a);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13480b);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f13481c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
