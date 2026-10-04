package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n7.j1;
import n7.k1;
import n7.l1;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new w.a(25);
    public final String f4478a;
    public final String f4479b;
    public final n7.s0 f4480c;
    public final j d;
    public final i f4481e;
    public final k f4482f;
    public final g h;
    public final String f4483n;

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
        this.f4478a = str;
        this.f4479b = str2;
        this.f4480c = t10;
        this.d = jVar;
        this.f4481e = iVar;
        this.f4482f = kVar;
        this.h = gVar;
        this.f4483n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (n6.l.l(this.f4478a, uVar.f4478a) && n6.l.l(this.f4479b, uVar.f4479b) && n6.l.l(this.f4480c, uVar.f4480c) && n6.l.l(this.d, uVar.d) && n6.l.l(this.f4481e, uVar.f4481e) && n6.l.l(this.f4482f, uVar.f4482f) && n6.l.l(this.h, uVar.h) && n6.l.l(this.f4483n, uVar.f4483n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4478a, this.f4479b, this.f4480c, this.f4481e, this.d, this.f4482f, this.h, this.f4483n});
    }

    public final String toString() {
        byte[] u10;
        n7.s0 s0Var = this.f4480c;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        String c10 = u6.b.c(u10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.f4481e);
        String valueOf3 = String.valueOf(this.f4482f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder x10 = a4.a.x("PublicKeyCredential{\n id='", this.f4478a, "', \n type='", this.f4479b, "', \n rawId=");
        a4.a.A(x10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        a4.a.A(x10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        x10.append(valueOf4);
        x10.append(", \n authenticatorAttachment='");
        x10.append(this.f4483n);
        x10.append("'}");
        return x10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        k1 k1Var = (k1) j1.f16800b.f16801a.f16775a;
        l1.f16806a.q();
        throw null;
    }
}
