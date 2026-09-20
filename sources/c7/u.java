package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n7.i1;
import n7.j1;
import n7.k1;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new w.a(25);
    public final String f4149a;
    public final String f4150b;
    public final n7.s0 f4151c;
    public final j d;
    public final i e;
    public final k f4152f;
    public final g h;
    public final String f4153n;

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
        this.f4149a = str;
        this.f4150b = str2;
        this.f4151c = t10;
        this.d = jVar;
        this.e = iVar;
        this.f4152f = kVar;
        this.h = gVar;
        this.f4153n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (n6.l.l(this.f4149a, uVar.f4149a) && n6.l.l(this.f4150b, uVar.f4150b) && n6.l.l(this.f4151c, uVar.f4151c) && n6.l.l(this.d, uVar.d) && n6.l.l(this.e, uVar.e) && n6.l.l(this.f4152f, uVar.f4152f) && n6.l.l(this.h, uVar.h) && n6.l.l(this.f4153n, uVar.f4153n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4149a, this.f4150b, this.f4151c, this.e, this.d, this.f4152f, this.h, this.f4153n});
    }

    public final String toString() {
        byte[] u10;
        n7.s0 s0Var = this.f4151c;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        String c10 = u6.b.c(u10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f4152f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder w10 = a4.a.w("PublicKeyCredential{\n id='", this.f4149a, "', \n type='", this.f4150b, "', \n rawId=");
        a4.a.z(w10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        a4.a.z(w10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        w10.append(valueOf4);
        w10.append(", \n authenticatorAttachment='");
        w10.append(this.f4153n);
        w10.append("'}");
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        j1 j1Var = (j1) i1.f15353b.f15354a.f15339a;
        k1.f15362a.q0();
        throw null;
    }
}
