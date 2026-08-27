package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import java.util.Locale;

public final class b1 extends z5.a {
    public static final Parcelable.Creator<b1> CREATOR = new c(26);

    public final String f12751a;

    public final int f12752b;

    public final int f12753c;

    public b1(String str, int i10, int i11) {
        this.f12751a = str;
        this.f12752b = i10;
        this.f12753c = i11;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (this.f12752b == b1Var.f12752b && this.f12753c == b1Var.f12753c && ((str = this.f12751a) == (obj2 = b1Var.f12751a) || (str != null && str.equals(obj2)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12751a, Integer.valueOf(this.f12752b), Integer.valueOf(this.f12753c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a9.p.p(com.google.android.recaptcha.internal.a.p("WebIconParcelable{", this.f12752b, "x", this.f12753c, " - "), this.f12751a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.f12751a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12752b);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f12753c);
        r8.r(parcel, iQ);
    }
}
