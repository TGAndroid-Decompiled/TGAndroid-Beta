package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.vision.e2;
public final class f extends r6.a implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f3001a;
    public final String f3002b;
    public final String f3003c;

    public f(String str, String str2, String str3) {
        q6.m.g(str);
        this.f3001a = str;
        q6.m.g(str2);
        this.f3002b = str2;
        q6.m.g(str3);
        this.f3003c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f3001a.equals(fVar.f3001a) && q6.m.k(fVar.f3002b, this.f3002b) && q6.m.k(fVar.f3003c, this.f3003c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3001a.hashCode();
    }

    public final String toString() {
        String str = this.f3001a;
        int i7 = 0;
        for (char c10 : str.toCharArray()) {
            i7 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i7;
        }
        return a8.p0.s(e2.n("Channel{token=", trim, ", nodeId=", this.f3002b, ", path="), this.f3003c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f3001a);
        yb.l(parcel, 3, this.f3002b);
        yb.l(parcel, 4, this.f3003c);
        yb.s(parcel, r10);
    }
}
