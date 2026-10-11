package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n7.j1;
import n7.k1;
import n7.l1;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new w.a(25);
    public final String f4527a;
    public final String f4528b;
    public final n7.s0 f4529c;
    public final j d;
    public final i f4530e;
    public final k f4531f;
    public final g h;
    public final String f4532n;

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
        n6.m.a("Must provide a response object.", z10);
        if (kVar != null || (str != null && t10 != null)) {
            z11 = true;
        }
        n6.m.a("Must provide id and rawId if not an error response.", z11);
        this.f4527a = str;
        this.f4528b = str2;
        this.f4529c = t10;
        this.d = jVar;
        this.f4530e = iVar;
        this.f4531f = kVar;
        this.h = gVar;
        this.f4532n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (n6.m.l(this.f4527a, uVar.f4527a) && n6.m.l(this.f4528b, uVar.f4528b) && n6.m.l(this.f4529c, uVar.f4529c) && n6.m.l(this.d, uVar.d) && n6.m.l(this.f4530e, uVar.f4530e) && n6.m.l(this.f4531f, uVar.f4531f) && n6.m.l(this.h, uVar.h) && n6.m.l(this.f4532n, uVar.f4532n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4527a, this.f4528b, this.f4529c, this.f4530e, this.d, this.f4531f, this.h, this.f4532n});
    }

    public final String toString() {
        byte[] u10;
        n7.s0 s0Var = this.f4529c;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        String c10 = u6.b.c(u10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.f4530e);
        String valueOf3 = String.valueOf(this.f4531f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder x10 = a1.g.x("PublicKeyCredential{\n id='", this.f4527a, "', \n type='", this.f4528b, "', \n rawId=");
        a1.g.A(x10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        a1.g.A(x10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        x10.append(valueOf4);
        x10.append(", \n authenticatorAttachment='");
        x10.append(this.f4532n);
        x10.append("'}");
        return x10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        k1 k1Var = (k1) j1.f16818b.f16819a.f16793a;
        l1.f16824a.b();
        throw null;
    }
}
