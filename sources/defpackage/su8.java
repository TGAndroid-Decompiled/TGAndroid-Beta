package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class su8 extends b4 {
    public static final Parcelable.Creator<su8> CREATOR = new j9d((byte) 2);
    public final qae a;
    public final String b;
    public final String c;
    public final String d;

    public su8(String str, byte[] bArr, String str2, String str3) {
        fre.h(bArr);
        this.a = qae.o(bArr.length, bArr);
        fre.h(str);
        this.b = str;
        this.c = str2;
        fre.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof su8) {
            su8 su8Var = (su8) obj;
            if (cqe.a(this.a, su8Var.a) && cqe.a(this.b, su8Var.b) && cqe.a(this.c, su8Var.c) && cqe.a(this.d, su8Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder p = ug8.p("PublicKeyCredentialUserEntity{\n id=", und.b(this.a.p()), ", \n name='");
        p.append(this.b);
        p.append("', \n icon='");
        p.append(this.c);
        p.append("', \n displayName='");
        return b00.j(p, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.c(parcel, 2, this.a.p());
        jte.l(parcel, 3, this.b);
        jte.l(parcel, 4, this.c);
        jte.l(parcel, 5, this.d);
        jte.s(parcel, r);
    }
}
