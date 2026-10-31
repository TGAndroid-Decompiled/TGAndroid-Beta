package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class b0 extends o6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(0);
    public final n7.s0 f3962a;
    public final String f3963b;
    public final String f3964c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        n6.l.g(bArr);
        this.f3962a = n7.s0.s(bArr.length, bArr);
        n6.l.g(str);
        this.f3963b = str;
        this.f3964c = str2;
        n6.l.g(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (n6.l.k(this.f3962a, b0Var.f3962a) && n6.l.k(this.f3963b, b0Var.f3963b) && n6.l.k(this.f3964c, b0Var.f3964c) && n6.l.k(this.d, b0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3962a, this.f3963b, this.f3964c, this.d});
    }

    public final String toString() {
        StringBuilder u10 = a1.g.u("PublicKeyCredentialUserEntity{\n id=", u6.b.c(this.f3962a.t()), ", \n name='");
        u10.append(this.f3963b);
        u10.append("', \n icon='");
        u10.append(this.f3964c);
        u10.append("', \n displayName='");
        return a1.g.r(u10, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.c(parcel, 2, this.f3962a.t());
        w7.h0.l(parcel, 3, this.f3963b);
        w7.h0.l(parcel, 4, this.f3964c);
        w7.h0.l(parcel, 5, this.d);
        w7.h0.r(parcel, q6);
    }
}
