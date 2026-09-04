package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n7.j1;
import n7.k1;
import n7.l1;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new w.a(25);
    public final String f4671a;
    public final String f4672b;
    public final n7.s0 f4673c;
    public final j d;
    public final i f4674e;
    public final k f4675f;
    public final g h;
    public final String f4676n;

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
        this.f4671a = str;
        this.f4672b = str2;
        this.f4673c = t10;
        this.d = jVar;
        this.f4674e = iVar;
        this.f4675f = kVar;
        this.h = gVar;
        this.f4676n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (n6.l.l(this.f4671a, uVar.f4671a) && n6.l.l(this.f4672b, uVar.f4672b) && n6.l.l(this.f4673c, uVar.f4673c) && n6.l.l(this.d, uVar.d) && n6.l.l(this.f4674e, uVar.f4674e) && n6.l.l(this.f4675f, uVar.f4675f) && n6.l.l(this.h, uVar.h) && n6.l.l(this.f4676n, uVar.f4676n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4671a, this.f4672b, this.f4673c, this.f4674e, this.d, this.f4675f, this.h, this.f4676n});
    }

    public final String toString() {
        byte[] u10;
        n7.s0 s0Var = this.f4673c;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        String c10 = u6.b.c(u10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.f4674e);
        String valueOf3 = String.valueOf(this.f4675f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder w10 = a4.a.w("PublicKeyCredential{\n id='", this.f4671a, "', \n type='", this.f4672b, "', \n rawId=");
        a4.a.z(w10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        a4.a.z(w10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        w10.append(valueOf4);
        w10.append(", \n authenticatorAttachment='");
        w10.append(this.f4676n);
        w10.append("'}");
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        k1 k1Var = (k1) j1.f16652b.f16653a.f16627a;
        l1.f16658a.a();
        throw null;
    }
}
