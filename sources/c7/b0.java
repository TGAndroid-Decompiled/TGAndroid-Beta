package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class b0 extends o6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(0);
    public final n7.t0 f4069a;
    public final String f4070b;
    public final String f4071c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        n6.l.h(bArr);
        this.f4069a = n7.t0.t(bArr.length, bArr);
        n6.l.h(str);
        this.f4070b = str;
        this.f4071c = str2;
        n6.l.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (n6.l.l(this.f4069a, b0Var.f4069a) && n6.l.l(this.f4070b, b0Var.f4070b) && n6.l.l(this.f4071c, b0Var.f4071c) && n6.l.l(this.d, b0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4069a, this.f4070b, this.f4071c, this.d});
    }

    public final String toString() {
        StringBuilder v = a4.a.v("PublicKeyCredentialUserEntity{\n id=", u6.b.c(this.f4069a.u()), ", \n name='");
        v.append(this.f4070b);
        v.append("', \n icon='");
        v.append(this.f4071c);
        v.append("', \n displayName='");
        return a4.a.s(v, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.c(parcel, 2, this.f4069a.u());
        w7.e0.l(parcel, 3, this.f4070b);
        w7.e0.l(parcel, 4, this.f4071c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.r(parcel, q6);
    }
}
