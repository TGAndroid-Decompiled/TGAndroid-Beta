package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
public final class f extends r6.a implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f2998a;
    public final String f2999b;
    public final String f3000c;

    public f(String str, String str2, String str3) {
        q6.m.h(str);
        this.f2998a = str;
        q6.m.h(str2);
        this.f2999b = str2;
        q6.m.h(str3);
        this.f3000c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f2998a.equals(fVar.f2998a) && q6.m.l(fVar.f2999b, this.f2999b) && q6.m.l(fVar.f3000c, this.f3000c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2998a.hashCode();
    }

    public final String toString() {
        String str = this.f2998a;
        int i7 = 0;
        for (char c10 : str.toCharArray()) {
            i7 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i7;
        }
        return a8.p0.s(e2.n("Channel{token=", trim, ", nodeId=", this.f2999b, ", path="), this.f3000c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f2998a);
        bc.l(parcel, 3, this.f2999b);
        bc.l(parcel, 4, this.f3000c);
        bc.s(parcel, r10);
    }
}
