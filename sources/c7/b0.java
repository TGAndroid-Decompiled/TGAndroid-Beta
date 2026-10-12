package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class b0 extends o6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(0);
    public final n7.s0 f4448a;
    public final String f4449b;
    public final String f4450c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        n6.m.h(bArr);
        this.f4448a = n7.s0.t(bArr.length, bArr);
        n6.m.h(str);
        this.f4449b = str;
        this.f4450c = str2;
        n6.m.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (n6.m.l(this.f4448a, b0Var.f4448a) && n6.m.l(this.f4449b, b0Var.f4449b) && n6.m.l(this.f4450c, b0Var.f4450c) && n6.m.l(this.d, b0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4448a, this.f4449b, this.f4450c, this.d});
    }

    public final String toString() {
        StringBuilder w10 = a1.g.w("PublicKeyCredentialUserEntity{\n id=", u6.b.c(this.f4448a.u()), ", \n name='");
        w10.append(this.f4449b);
        w10.append("', \n icon='");
        w10.append(this.f4450c);
        w10.append("', \n displayName='");
        return a1.g.t(w10, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.c(parcel, 2, this.f4448a.u());
        w7.c0.l(parcel, 3, this.f4449b);
        w7.c0.l(parcel, 4, this.f4450c);
        w7.c0.l(parcel, 5, this.d);
        w7.c0.r(parcel, q6);
    }
}
