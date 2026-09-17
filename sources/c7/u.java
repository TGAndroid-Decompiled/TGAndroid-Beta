package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n7.j1;
import n7.k1;
import n7.l1;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new w.a(25);
    public final String f4698a;
    public final String f4699b;
    public final n7.s0 f4700c;
    public final j d;
    public final i f4701e;
    public final k f4702f;
    public final g h;
    public final String f4703n;

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
        this.f4698a = str;
        this.f4699b = str2;
        this.f4700c = t10;
        this.d = jVar;
        this.f4701e = iVar;
        this.f4702f = kVar;
        this.h = gVar;
        this.f4703n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (n6.l.l(this.f4698a, uVar.f4698a) && n6.l.l(this.f4699b, uVar.f4699b) && n6.l.l(this.f4700c, uVar.f4700c) && n6.l.l(this.d, uVar.d) && n6.l.l(this.f4701e, uVar.f4701e) && n6.l.l(this.f4702f, uVar.f4702f) && n6.l.l(this.h, uVar.h) && n6.l.l(this.f4703n, uVar.f4703n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4698a, this.f4699b, this.f4700c, this.f4701e, this.d, this.f4702f, this.h, this.f4703n});
    }

    public final String toString() {
        byte[] u10;
        n7.s0 s0Var = this.f4700c;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        String c10 = u6.b.c(u10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.f4701e);
        String valueOf3 = String.valueOf(this.f4702f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder w10 = a4.a.w("PublicKeyCredential{\n id='", this.f4698a, "', \n type='", this.f4699b, "', \n rawId=");
        a4.a.z(w10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        a4.a.z(w10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        w10.append(valueOf4);
        w10.append(", \n authenticatorAttachment='");
        w10.append(this.f4703n);
        w10.append("'}");
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        k1 k1Var = (k1) j1.f16679b.f16680a.f16654a;
        l1.f16685a.a();
        throw null;
    }
}
