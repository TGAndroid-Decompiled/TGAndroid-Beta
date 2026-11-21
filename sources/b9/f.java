package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
public final class f extends r6.a implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String f3011a;
    public final String f3012b;
    public final String f3013c;

    public f(String str, String str2, String str3) {
        q6.m.h(str);
        this.f3011a = str;
        q6.m.h(str2);
        this.f3012b = str2;
        q6.m.h(str3);
        this.f3013c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f3011a.equals(fVar.f3011a) && q6.m.l(fVar.f3012b, this.f3012b) && q6.m.l(fVar.f3013c, this.f3013c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3011a.hashCode();
    }

    public final String toString() {
        String str = this.f3011a;
        int i7 = 0;
        for (char c10 : str.toCharArray()) {
            i7 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i7;
        }
        return a8.p0.s(e2.n("Channel{token=", trim, ", nodeId=", this.f3012b, ", path="), this.f3013c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f3011a);
        bc.l(parcel, 3, this.f3012b);
        bc.l(parcel, 4, this.f3013c);
        bc.s(parcel, r10);
    }
}
