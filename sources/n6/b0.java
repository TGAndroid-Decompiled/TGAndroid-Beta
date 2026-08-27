package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class b0 extends z5.a {
    public static final Parcelable.Creator<b0> CREATOR = new o0(11);

    public final y6.s0 f18332a;

    public final String f18333b;

    public final String f18334c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        y5.l.h(bArr);
        this.f18332a = y6.s0.t(bArr.length, bArr);
        y5.l.h(str);
        this.f18333b = str;
        this.f18334c = str2;
        y5.l.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return y5.l.l(this.f18332a, b0Var.f18332a) && y5.l.l(this.f18333b, b0Var.f18333b) && y5.l.l(this.f18334c, b0Var.f18334c) && y5.l.l(this.d, b0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18332a, this.f18333b, this.f18334c, this.d});
    }

    public final String toString() {
        StringBuilder sbR = a9.p.r("PublicKeyCredentialUserEntity{\n id=", f6.b.c(this.f18332a.u()), ", \n name='");
        sbR.append(this.f18333b);
        sbR.append("', \n icon='");
        sbR.append(this.f18334c);
        sbR.append("', \n displayName='");
        return a9.p.p(sbR, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.c(parcel, 2, this.f18332a.u());
        r8.l(parcel, 3, this.f18333b);
        r8.l(parcel, 4, this.f18334c);
        r8.l(parcel, 5, this.d);
        r8.r(parcel, iQ);
    }
}
