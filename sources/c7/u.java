package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n7.i1;
import n7.j1;
import n7.k1;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new w.a(25);
    public final String f4528a;
    public final String f4529b;
    public final n7.s0 f4530c;
    public final j d;
    public final i f4531e;
    public final k f4532f;
    public final g h;
    public final String f4533n;

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
        this.f4528a = str;
        this.f4529b = str2;
        this.f4530c = t10;
        this.d = jVar;
        this.f4531e = iVar;
        this.f4532f = kVar;
        this.h = gVar;
        this.f4533n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (n6.l.l(this.f4528a, uVar.f4528a) && n6.l.l(this.f4529b, uVar.f4529b) && n6.l.l(this.f4530c, uVar.f4530c) && n6.l.l(this.d, uVar.d) && n6.l.l(this.f4531e, uVar.f4531e) && n6.l.l(this.f4532f, uVar.f4532f) && n6.l.l(this.h, uVar.h) && n6.l.l(this.f4533n, uVar.f4533n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4528a, this.f4529b, this.f4530c, this.f4531e, this.d, this.f4532f, this.h, this.f4533n});
    }

    public final String toString() {
        byte[] u10;
        n7.s0 s0Var = this.f4530c;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        String c10 = u6.b.c(u10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.f4531e);
        String valueOf3 = String.valueOf(this.f4532f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder x10 = a1.g.x("PublicKeyCredential{\n id='", this.f4528a, "', \n type='", this.f4529b, "', \n rawId=");
        a1.g.A(x10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        a1.g.A(x10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        x10.append(valueOf4);
        x10.append(", \n authenticatorAttachment='");
        x10.append(this.f4533n);
        x10.append("'}");
        return x10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        j1 j1Var = (j1) i1.f16767b.f16768a.f16752a;
        k1.f16778a.b();
        throw null;
    }
}
