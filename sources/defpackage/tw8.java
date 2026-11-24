package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class tw8 extends b4 {
    public static final Parcelable.Creator<tw8> CREATOR = new lbd((byte) 2);
    public final rce a;
    public final String b;
    public final String c;
    public final String d;

    public tw8(String str, byte[] bArr, String str2, String str3) {
        ite.h(bArr);
        this.a = rce.o(bArr.length, bArr);
        ite.h(str);
        this.b = str;
        this.c = str2;
        ite.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tw8) {
            tw8 tw8Var = (tw8) obj;
            if (fse.a(this.a, tw8Var.a) && fse.a(this.b, tw8Var.b) && fse.a(this.c, tw8Var.c) && fse.a(this.d, tw8Var.d)) {
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
        StringBuilder p = wi8.p("PublicKeyCredentialUserEntity{\n id=", xpd.b(this.a.p()), ", \n name='");
        p.append(this.b);
        p.append("', \n icon='");
        p.append(this.c);
        p.append("', \n displayName='");
        return b10.j(p, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.c(parcel, 2, this.a.p());
        mve.l(parcel, 3, this.b);
        mve.l(parcel, 4, this.c);
        mve.l(parcel, 5, this.d);
        mve.s(parcel, r);
    }
}
