package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class b0 extends o6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(0);
    public final n7.s0 f4620a;
    public final String f4621b;
    public final String f4622c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        n6.l.h(bArr);
        this.f4620a = n7.s0.t(bArr.length, bArr);
        n6.l.h(str);
        this.f4621b = str;
        this.f4622c = str2;
        n6.l.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (n6.l.l(this.f4620a, b0Var.f4620a) && n6.l.l(this.f4621b, b0Var.f4621b) && n6.l.l(this.f4622c, b0Var.f4622c) && n6.l.l(this.d, b0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4620a, this.f4621b, this.f4622c, this.d});
    }

    public final String toString() {
        StringBuilder v = a4.a.v("PublicKeyCredentialUserEntity{\n id=", u6.b.c(this.f4620a.u()), ", \n name='");
        v.append(this.f4621b);
        v.append("', \n icon='");
        v.append(this.f4622c);
        v.append("', \n displayName='");
        return a4.a.s(v, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.c(parcel, 2, this.f4620a.u());
        w7.e0.l(parcel, 3, this.f4621b);
        w7.e0.l(parcel, 4, this.f4622c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.r(parcel, q6);
    }
}
