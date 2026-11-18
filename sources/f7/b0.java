package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class b0 extends r6.a {
    public static final Parcelable.Creator<b0> CREATOR = new db.k(19);
    public final q7.s0 f11484a;
    public final String f11485b;
    public final String f11486c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        q6.m.h(bArr);
        this.f11484a = q7.s0.o(bArr.length, bArr);
        q6.m.h(str);
        this.f11485b = str;
        this.f11486c = str2;
        q6.m.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (q6.m.l(this.f11484a, b0Var.f11484a) && q6.m.l(this.f11485b, b0Var.f11485b) && q6.m.l(this.f11486c, b0Var.f11486c) && q6.m.l(this.d, b0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11484a, this.f11485b, this.f11486c, this.d});
    }

    public final String toString() {
        StringBuilder u10 = a8.p0.u("PublicKeyCredentialUserEntity{\n id=", x6.b.c(this.f11484a.p()), ", \n name='");
        u10.append(this.f11485b);
        u10.append("', \n icon='");
        u10.append(this.f11486c);
        u10.append("', \n displayName='");
        return a8.p0.s(u10, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.c(parcel, 2, this.f11484a.p());
        bc.l(parcel, 3, this.f11485b);
        bc.l(parcel, 4, this.f11486c);
        bc.l(parcel, 5, this.d);
        bc.s(parcel, r10);
    }
}
