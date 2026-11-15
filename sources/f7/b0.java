package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
public final class b0 extends r6.a {
    public static final Parcelable.Creator<b0> CREATOR = new db.k(19);
    public final q7.s0 f11167a;
    public final String f11168b;
    public final String f11169c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        q6.m.g(bArr);
        this.f11167a = q7.s0.o(bArr.length, bArr);
        q6.m.g(str);
        this.f11168b = str;
        this.f11169c = str2;
        q6.m.g(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (q6.m.k(this.f11167a, b0Var.f11167a) && q6.m.k(this.f11168b, b0Var.f11168b) && q6.m.k(this.f11169c, b0Var.f11169c) && q6.m.k(this.d, b0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11167a, this.f11168b, this.f11169c, this.d});
    }

    public final String toString() {
        StringBuilder u10 = a8.p0.u("PublicKeyCredentialUserEntity{\n id=", x6.b.c(this.f11167a.p()), ", \n name='");
        u10.append(this.f11168b);
        u10.append("', \n icon='");
        u10.append(this.f11169c);
        u10.append("', \n displayName='");
        return a8.p0.s(u10, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.c(parcel, 2, this.f11167a.p());
        yb.l(parcel, 3, this.f11168b);
        yb.l(parcel, 4, this.f11169c);
        yb.l(parcel, 5, this.d);
        yb.s(parcel, r10);
    }
}
