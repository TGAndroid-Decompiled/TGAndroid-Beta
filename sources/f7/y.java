package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new db.k(17);
    public final String f11467a;
    public final String f11468b;
    public final String f11469c;

    public y(String str, String str2, String str3) {
        q6.m.g(str);
        this.f11467a = str;
        q6.m.g(str2);
        this.f11468b = str2;
        this.f11469c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!q6.m.k(this.f11467a, yVar.f11467a) || !q6.m.k(this.f11468b, yVar.f11468b) || !q6.m.k(this.f11469c, yVar.f11469c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11467a, this.f11468b, this.f11469c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f11467a);
        sb2.append("', \n name='");
        sb2.append(this.f11468b);
        sb2.append("', \n icon='");
        return a8.p0.s(sb2, this.f11469c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f11467a);
        xb.l(parcel, 3, this.f11468b);
        xb.l(parcel, 4, this.f11469c);
        xb.s(parcel, r10);
    }
}
