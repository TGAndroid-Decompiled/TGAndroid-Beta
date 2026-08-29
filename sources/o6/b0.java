package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class b0 extends a6.a {
    public static final Parcelable.Creator<b0> CREATOR = new n0(12);
    public final z6.s0 f19356a;
    public final String f19357b;
    public final String f19358c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        z5.l.h(bArr);
        this.f19356a = z6.s0.t(bArr.length, bArr);
        z5.l.h(str);
        this.f19357b = str;
        this.f19358c = str2;
        z5.l.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (z5.l.l(this.f19356a, b0Var.f19356a) && z5.l.l(this.f19357b, b0Var.f19357b) && z5.l.l(this.f19358c, b0Var.f19358c) && z5.l.l(this.d, b0Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19356a, this.f19357b, this.f19358c, this.d});
    }

    public final String toString() {
        StringBuilder s10 = a4.w.s("PublicKeyCredentialUserEntity{\n id=", g6.b.c(this.f19356a.u()), ", \n name='");
        s10.append(this.f19357b);
        s10.append("', \n icon='");
        s10.append(this.f19358c);
        s10.append("', \n displayName='");
        return a4.w.q(s10, this.d, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.c(parcel, 2, this.f19356a.u());
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f19357b);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.f19358c);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.d);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
