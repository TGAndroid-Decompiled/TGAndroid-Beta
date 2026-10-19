package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class b0 extends o6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(0);
    public final n7.s0 f4932a;
    public final String f4933b;
    public final String f4934c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        n6.l.h(bArr);
        this.f4932a = n7.s0.s(bArr.length, bArr);
        n6.l.h(str);
        this.f4933b = str;
        this.f4934c = str2;
        n6.l.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (n6.l.l(this.f4932a, b0Var.f4932a) && n6.l.l(this.f4933b, b0Var.f4933b) && n6.l.l(this.f4934c, b0Var.f4934c) && n6.l.l(this.d, b0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4932a, this.f4933b, this.f4934c, this.d});
    }

    public final String toString() {
        StringBuilder v = a1.g.v("PublicKeyCredentialUserEntity{\n id=", u6.b.c(this.f4932a.t()), ", \n name='");
        v.append(this.f4933b);
        v.append("', \n icon='");
        v.append(this.f4934c);
        v.append("', \n displayName='");
        return a1.g.s(v, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.c(parcel, 2, this.f4932a.t());
        w7.f0.l(parcel, 3, this.f4933b);
        w7.f0.l(parcel, 4, this.f4934c);
        w7.f0.l(parcel, 5, this.d);
        w7.f0.r(parcel, q6);
    }
}
