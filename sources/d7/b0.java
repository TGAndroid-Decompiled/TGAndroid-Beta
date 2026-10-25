package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class b0 extends p6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(1);
    public final o7.s0 f8158a;
    public final String f8159b;
    public final String f8160c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        o6.l.h(bArr);
        this.f8158a = o7.s0.s(bArr.length, bArr);
        o6.l.h(str);
        this.f8159b = str;
        this.f8160c = str2;
        o6.l.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (o6.l.l(this.f8158a, b0Var.f8158a) && o6.l.l(this.f8159b, b0Var.f8159b) && o6.l.l(this.f8160c, b0Var.f8160c) && o6.l.l(this.d, b0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8158a, this.f8159b, this.f8160c, this.d});
    }

    public final String toString() {
        StringBuilder v = a1.g.v("PublicKeyCredentialUserEntity{\n id=", v6.b.c(this.f8158a.t()), ", \n name='");
        v.append(this.f8159b);
        v.append("', \n icon='");
        v.append(this.f8160c);
        v.append("', \n displayName='");
        return a1.g.s(v, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.c(parcel, 2, this.f8158a.t());
        df.l(parcel, 3, this.f8159b);
        df.l(parcel, 4, this.f8160c);
        df.l(parcel, 5, this.d);
        df.r(parcel, q5);
    }
}
