package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class f extends r6.a implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f3046a;
    public final String f3047b;
    public final String f3048c;

    public f(String str, String str2, String str3) {
        q6.m.g(str);
        this.f3046a = str;
        q6.m.g(str2);
        this.f3047b = str2;
        q6.m.g(str3);
        this.f3048c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f3046a.equals(fVar.f3046a) && q6.m.k(fVar.f3047b, this.f3047b) && q6.m.k(fVar.f3048c, this.f3048c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3046a.hashCode();
    }

    public final String toString() {
        String str = this.f3046a;
        int i7 = 0;
        for (char c10 : str.toCharArray()) {
            i7 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i7;
        }
        return a8.p0.s(com.google.android.recaptcha.internal.a.n("Channel{token=", trim, ", nodeId=", this.f3047b, ", path="), this.f3048c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f3046a);
        wb.l(parcel, 3, this.f3047b);
        wb.l(parcel, 4, this.f3048c);
        wb.s(parcel, r10);
    }
}
