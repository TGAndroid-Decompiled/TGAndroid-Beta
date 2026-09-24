package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n7.j1;
import n7.k1;
import n7.l1;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new w.a(25);
    public final String f4140a;
    public final String f4141b;
    public final n7.s0 f4142c;
    public final j d;
    public final i e;
    public final k f4143f;
    public final g h;
    public final String f4144n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        n7.s0 t10;
        boolean z10;
        if (bArr == null) {
            t10 = null;
        } else {
            t10 = n7.s0.t(bArr.length, bArr);
        }
        boolean z11 = false;
        if ((jVar != null && iVar == null && kVar == null) || ((jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null))) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.a("Must provide a response object.", z10);
        if (kVar != null || (str != null && t10 != null)) {
            z11 = true;
        }
        n6.l.a("Must provide id and rawId if not an error response.", z11);
        this.f4140a = str;
        this.f4141b = str2;
        this.f4142c = t10;
        this.d = jVar;
        this.e = iVar;
        this.f4143f = kVar;
        this.h = gVar;
        this.f4144n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (n6.l.l(this.f4140a, uVar.f4140a) && n6.l.l(this.f4141b, uVar.f4141b) && n6.l.l(this.f4142c, uVar.f4142c) && n6.l.l(this.d, uVar.d) && n6.l.l(this.e, uVar.e) && n6.l.l(this.f4143f, uVar.f4143f) && n6.l.l(this.h, uVar.h) && n6.l.l(this.f4144n, uVar.f4144n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4140a, this.f4141b, this.f4142c, this.e, this.d, this.f4143f, this.h, this.f4144n});
    }

    public final String toString() {
        byte[] u10;
        n7.s0 s0Var = this.f4142c;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        String c10 = u6.b.c(u10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f4143f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder x10 = a4.a.x("PublicKeyCredential{\n id='", this.f4140a, "', \n type='", this.f4141b, "', \n rawId=");
        a4.a.A(x10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        a4.a.A(x10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        x10.append(valueOf4);
        x10.append(", \n authenticatorAttachment='");
        x10.append(this.f4144n);
        x10.append("'}");
        return x10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        k1 k1Var = (k1) j1.f15351b.f15352a.f15328a;
        l1.f15355a.r0();
        throw null;
    }
}
