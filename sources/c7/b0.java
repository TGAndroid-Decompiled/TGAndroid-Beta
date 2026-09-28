package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class b0 extends o6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(0);
    public final n7.s0 f4066a;
    public final String f4067b;
    public final String f4068c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        n6.l.h(bArr);
        this.f4066a = n7.s0.t(bArr.length, bArr);
        n6.l.h(str);
        this.f4067b = str;
        this.f4068c = str2;
        n6.l.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (n6.l.l(this.f4066a, b0Var.f4066a) && n6.l.l(this.f4067b, b0Var.f4067b) && n6.l.l(this.f4068c, b0Var.f4068c) && n6.l.l(this.d, b0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4066a, this.f4067b, this.f4068c, this.d});
    }

    public final String toString() {
        StringBuilder w10 = a4.a.w("PublicKeyCredentialUserEntity{\n id=", u6.b.c(this.f4066a.u()), ", \n name='");
        w10.append(this.f4067b);
        w10.append("', \n icon='");
        w10.append(this.f4068c);
        w10.append("', \n displayName='");
        return a4.a.t(w10, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.c(parcel, 2, this.f4066a.u());
        w7.f0.l(parcel, 3, this.f4067b);
        w7.f0.l(parcel, 4, this.f4068c);
        w7.f0.l(parcel, 5, this.d);
        w7.f0.r(parcel, q6);
    }
}
