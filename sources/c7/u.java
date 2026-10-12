package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n7.j1;
import n7.k1;
import n7.l1;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new w.a(25);
    public final String f4526a;
    public final String f4527b;
    public final n7.s0 f4528c;
    public final j d;
    public final i f4529e;
    public final k f4530f;
    public final g h;
    public final String f4531n;

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
        this.f4526a = str;
        this.f4527b = str2;
        this.f4528c = t10;
        this.d = jVar;
        this.f4529e = iVar;
        this.f4530f = kVar;
        this.h = gVar;
        this.f4531n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (n6.m.l(this.f4526a, uVar.f4526a) && n6.m.l(this.f4527b, uVar.f4527b) && n6.m.l(this.f4528c, uVar.f4528c) && n6.m.l(this.d, uVar.d) && n6.m.l(this.f4529e, uVar.f4529e) && n6.m.l(this.f4530f, uVar.f4530f) && n6.m.l(this.h, uVar.h) && n6.m.l(this.f4531n, uVar.f4531n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4526a, this.f4527b, this.f4528c, this.f4529e, this.d, this.f4530f, this.h, this.f4531n});
    }

    public final String toString() {
        byte[] u10;
        n7.s0 s0Var = this.f4528c;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        String c10 = u6.b.c(u10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.f4529e);
        String valueOf3 = String.valueOf(this.f4530f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder x10 = a1.g.x("PublicKeyCredential{\n id='", this.f4526a, "', \n type='", this.f4527b, "', \n rawId=");
        a1.g.A(x10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        a1.g.A(x10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        x10.append(valueOf4);
        x10.append(", \n authenticatorAttachment='");
        x10.append(this.f4531n);
        x10.append("'}");
        return x10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        k1 k1Var = (k1) j1.f16521b.f16522a.f16496a;
        l1.f16527a.j();
        throw null;
    }
}
