package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class f extends z5.a implements i8.b, i8.d {
    public static final Parcelable.Creator<f> CREATOR = new c(2);

    public final String f12780a;

    public final String f12781b;

    public final String f12782c;

    public f(String str, String str2, String str3) {
        y5.l.h(str);
        this.f12780a = str;
        y5.l.h(str2);
        this.f12781b = str2;
        y5.l.h(str3);
        this.f12782c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f12780a.equals(fVar.f12780a) && y5.l.l(fVar.f12781b, this.f12781b) && y5.l.l(fVar.f12782c, this.f12782c);
    }

    public final int hashCode() {
        return this.f12780a.hashCode();
    }

    public final String toString() {
        String str = this.f12780a;
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 += c10;
        }
        String strTrim = str.trim();
        int length = strTrim.length();
        if (length > 25) {
            strTrim = strTrim.substring(0, 10) + "..." + strTrim.substring(length - 10, length) + "::" + i10;
        }
        return a9.p.p(i0.a.p("Channel{token=", strTrim, ", nodeId=", this.f12781b, ", path="), this.f12782c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f12780a);
        r8.l(parcel, 3, this.f12781b);
        r8.l(parcel, 4, this.f12782c);
        r8.r(parcel, iQ);
    }
}
