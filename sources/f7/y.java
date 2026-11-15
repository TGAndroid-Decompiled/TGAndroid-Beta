package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new db.k(17);
    public final String f11276a;
    public final String f11277b;
    public final String f11278c;

    public y(String str, String str2, String str3) {
        q6.m.g(str);
        this.f11276a = str;
        q6.m.g(str2);
        this.f11277b = str2;
        this.f11278c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!q6.m.k(this.f11276a, yVar.f11276a) || !q6.m.k(this.f11277b, yVar.f11277b) || !q6.m.k(this.f11278c, yVar.f11278c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11276a, this.f11277b, this.f11278c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f11276a);
        sb2.append("', \n name='");
        sb2.append(this.f11277b);
        sb2.append("', \n icon='");
        return a8.p0.s(sb2, this.f11278c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f11276a);
        yb.l(parcel, 3, this.f11277b);
        yb.l(parcel, 4, this.f11278c);
        yb.s(parcel, r10);
    }
}
