package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
public final class b0 extends r6.a {
    public static final Parcelable.Creator<b0> CREATOR = new db.k(19);
    public final q7.s0 f11353a;
    public final String f11354b;
    public final String f11355c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        q6.m.g(bArr);
        this.f11353a = q7.s0.o(bArr.length, bArr);
        q6.m.g(str);
        this.f11354b = str;
        this.f11355c = str2;
        q6.m.g(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (q6.m.k(this.f11353a, b0Var.f11353a) && q6.m.k(this.f11354b, b0Var.f11354b) && q6.m.k(this.f11355c, b0Var.f11355c) && q6.m.k(this.d, b0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11353a, this.f11354b, this.f11355c, this.d});
    }

    public final String toString() {
        StringBuilder u10 = a8.p0.u("PublicKeyCredentialUserEntity{\n id=", x6.b.c(this.f11353a.p()), ", \n name='");
        u10.append(this.f11354b);
        u10.append("', \n icon='");
        u10.append(this.f11355c);
        u10.append("', \n displayName='");
        return a8.p0.s(u10, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.c(parcel, 2, this.f11353a.p());
        wb.l(parcel, 3, this.f11354b);
        wb.l(parcel, 4, this.f11355c);
        wb.l(parcel, 5, this.d);
        wb.s(parcel, r10);
    }
}
