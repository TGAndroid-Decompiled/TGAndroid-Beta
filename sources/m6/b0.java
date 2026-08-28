package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class b0 extends y5.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(0);
    public final x6.s0 f17496a;
    public final String f17497b;
    public final String f17498c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        x5.l.h(bArr);
        this.f17496a = x6.s0.t(bArr.length, bArr);
        x5.l.h(str);
        this.f17497b = str;
        this.f17498c = str2;
        x5.l.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (x5.l.l(this.f17496a, b0Var.f17496a) && x5.l.l(this.f17497b, b0Var.f17497b) && x5.l.l(this.f17498c, b0Var.f17498c) && x5.l.l(this.d, b0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17496a, this.f17497b, this.f17498c, this.d});
    }

    public final String toString() {
        StringBuilder t10 = aa.d.t("PublicKeyCredentialUserEntity{\n id=", e6.b.c(this.f17496a.u()), ", \n name='");
        t10.append(this.f17497b);
        t10.append("', \n icon='");
        t10.append(this.f17498c);
        t10.append("', \n displayName='");
        return aa.d.r(t10, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.c(parcel, 2, this.f17496a.u());
        p8.l(parcel, 3, this.f17497b);
        p8.l(parcel, 4, this.f17498c);
        p8.l(parcel, 5, this.d);
        p8.r(parcel, q10);
    }
}
