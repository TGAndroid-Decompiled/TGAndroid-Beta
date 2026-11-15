package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.vision.e2;
public final class f extends r6.a implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f3004a;
    public final String f3005b;
    public final String f3006c;

    public f(String str, String str2, String str3) {
        q6.m.g(str);
        this.f3004a = str;
        q6.m.g(str2);
        this.f3005b = str2;
        q6.m.g(str3);
        this.f3006c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f3004a.equals(fVar.f3004a) && q6.m.k(fVar.f3005b, this.f3005b) && q6.m.k(fVar.f3006c, this.f3006c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3004a.hashCode();
    }

    public final String toString() {
        String str = this.f3004a;
        int i7 = 0;
        for (char c10 : str.toCharArray()) {
            i7 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i7;
        }
        return a8.p0.s(e2.n("Channel{token=", trim, ", nodeId=", this.f3005b, ", path="), this.f3006c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f3004a);
        yb.l(parcel, 3, this.f3005b);
        yb.l(parcel, 4, this.f3006c);
        yb.s(parcel, r10);
    }
}
