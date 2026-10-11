package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class b0 extends o6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(0);
    public final n7.s0 f4449a;
    public final String f4450b;
    public final String f4451c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        n6.m.h(bArr);
        this.f4449a = n7.s0.t(bArr.length, bArr);
        n6.m.h(str);
        this.f4450b = str;
        this.f4451c = str2;
        n6.m.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (n6.m.l(this.f4449a, b0Var.f4449a) && n6.m.l(this.f4450b, b0Var.f4450b) && n6.m.l(this.f4451c, b0Var.f4451c) && n6.m.l(this.d, b0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4449a, this.f4450b, this.f4451c, this.d});
    }

    public final String toString() {
        StringBuilder w10 = a1.g.w("PublicKeyCredentialUserEntity{\n id=", u6.b.c(this.f4449a.u()), ", \n name='");
        w10.append(this.f4450b);
        w10.append("', \n icon='");
        w10.append(this.f4451c);
        w10.append("', \n displayName='");
        return a1.g.t(w10, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.c(parcel, 2, this.f4449a.u());
        w7.d0.l(parcel, 3, this.f4450b);
        w7.d0.l(parcel, 4, this.f4451c);
        w7.d0.l(parcel, 5, this.d);
        w7.d0.r(parcel, q6);
    }
}
