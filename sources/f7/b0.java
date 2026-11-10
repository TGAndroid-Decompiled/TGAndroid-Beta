package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class b0 extends r6.a {
    public static final Parcelable.Creator<b0> CREATOR = new db.k(19);
    public final q7.s0 f11358a;
    public final String f11359b;
    public final String f11360c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        q6.m.g(bArr);
        this.f11358a = q7.s0.o(bArr.length, bArr);
        q6.m.g(str);
        this.f11359b = str;
        this.f11360c = str2;
        q6.m.g(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (q6.m.k(this.f11358a, b0Var.f11358a) && q6.m.k(this.f11359b, b0Var.f11359b) && q6.m.k(this.f11360c, b0Var.f11360c) && q6.m.k(this.d, b0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11358a, this.f11359b, this.f11360c, this.d});
    }

    public final String toString() {
        StringBuilder u10 = a8.p0.u("PublicKeyCredentialUserEntity{\n id=", x6.b.c(this.f11358a.p()), ", \n name='");
        u10.append(this.f11359b);
        u10.append("', \n icon='");
        u10.append(this.f11360c);
        u10.append("', \n displayName='");
        return a8.p0.s(u10, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.c(parcel, 2, this.f11358a.p());
        xb.l(parcel, 3, this.f11359b);
        xb.l(parcel, 4, this.f11360c);
        xb.l(parcel, 5, this.d);
        xb.s(parcel, r10);
    }
}
