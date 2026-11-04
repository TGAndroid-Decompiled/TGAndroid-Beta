package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class b0 extends q6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(4);
    public final p7.t0 f9796a;
    public final String f9797b;
    public final String f9798c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        p6.m.g(bArr);
        this.f9796a = p7.t0.o(bArr.length, bArr);
        p6.m.g(str);
        this.f9797b = str;
        this.f9798c = str2;
        p6.m.g(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (p6.m.k(this.f9796a, b0Var.f9796a) && p6.m.k(this.f9797b, b0Var.f9797b) && p6.m.k(this.f9798c, b0Var.f9798c) && p6.m.k(this.d, b0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9796a, this.f9797b, this.f9798c, this.d});
    }

    public final String toString() {
        StringBuilder u10 = a1.g.u("PublicKeyCredentialUserEntity{\n id=", w6.b.c(this.f9796a.p()), ", \n name='");
        u10.append(this.f9797b);
        u10.append("', \n icon='");
        u10.append(this.f9798c);
        u10.append("', \n displayName='");
        return a1.g.s(u10, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.d(parcel, 2, this.f9796a.p());
        j8.a.m(parcel, 3, this.f9797b);
        j8.a.m(parcel, 4, this.f9798c);
        j8.a.m(parcel, 5, this.d);
        j8.a.t(parcel, s6);
    }
}
