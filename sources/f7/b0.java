package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class b0 extends r6.a {
    public static final Parcelable.Creator<b0> CREATOR = new db.k(19);
    public final q7.s0 f11479a;
    public final String f11480b;
    public final String f11481c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        q6.m.h(bArr);
        this.f11479a = q7.s0.o(bArr.length, bArr);
        q6.m.h(str);
        this.f11480b = str;
        this.f11481c = str2;
        q6.m.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (q6.m.l(this.f11479a, b0Var.f11479a) && q6.m.l(this.f11480b, b0Var.f11480b) && q6.m.l(this.f11481c, b0Var.f11481c) && q6.m.l(this.d, b0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11479a, this.f11480b, this.f11481c, this.d});
    }

    public final String toString() {
        StringBuilder u10 = a8.p0.u("PublicKeyCredentialUserEntity{\n id=", x6.b.c(this.f11479a.p()), ", \n name='");
        u10.append(this.f11480b);
        u10.append("', \n icon='");
        u10.append(this.f11481c);
        u10.append("', \n displayName='");
        return a8.p0.s(u10, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.c(parcel, 2, this.f11479a.p());
        cc.l(parcel, 3, this.f11480b);
        cc.l(parcel, 4, this.f11481c);
        cc.l(parcel, 5, this.d);
        cc.s(parcel, r10);
    }
}
