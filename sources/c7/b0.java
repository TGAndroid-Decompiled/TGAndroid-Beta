package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class b0 extends o6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(0);
    public final n7.s0 f4068a;
    public final String f4069b;
    public final String f4070c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        n6.l.h(bArr);
        this.f4068a = n7.s0.t(bArr.length, bArr);
        n6.l.h(str);
        this.f4069b = str;
        this.f4070c = str2;
        n6.l.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (n6.l.l(this.f4068a, b0Var.f4068a) && n6.l.l(this.f4069b, b0Var.f4069b) && n6.l.l(this.f4070c, b0Var.f4070c) && n6.l.l(this.d, b0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4068a, this.f4069b, this.f4070c, this.d});
    }

    public final String toString() {
        StringBuilder v = a4.a.v("PublicKeyCredentialUserEntity{\n id=", u6.b.c(this.f4068a.u()), ", \n name='");
        v.append(this.f4069b);
        v.append("', \n icon='");
        v.append(this.f4070c);
        v.append("', \n displayName='");
        return a4.a.s(v, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.c(parcel, 2, this.f4068a.u());
        w7.f0.l(parcel, 3, this.f4069b);
        w7.f0.l(parcel, 4, this.f4070c);
        w7.f0.l(parcel, 5, this.d);
        w7.f0.r(parcel, q6);
    }
}
