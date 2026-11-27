package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class qqe extends c4 {
    public static final Parcelable.Creator<qqe> CREATOR = new g3e((byte) 4);
    public final String a;
    public final int b;
    public final int c;

    public qqe(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && qqe.class == obj.getClass()) {
            qqe qqeVar = (qqe) obj;
            if (this.b == qqeVar.b && this.c == qqeVar.c && ((str2 = this.a) == (str = qqeVar.a) || (str2 != null && str2.equals(str)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return c00.k(bs2.p("WebIconParcelable{", this.b, "x", this.c, " - "), this.a, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        bye.s(parcel, r);
    }
}
