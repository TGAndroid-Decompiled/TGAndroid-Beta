package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n7.j1;
import n7.k1;
import n7.l1;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new w.a(25);
    public final String f5007a;
    public final String f5008b;
    public final n7.t0 f5009c;
    public final j d;
    public final i e;
    public final k f5010f;
    public final g h;
    public final String f5011n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        n7.t0 s10;
        boolean z10;
        if (bArr == null) {
            s10 = null;
        } else {
            s10 = n7.t0.s(bArr.length, bArr);
        }
        boolean z11 = false;
        if ((jVar != null && iVar == null && kVar == null) || ((jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null))) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.a("Must provide a response object.", z10);
        if (kVar != null || (str != null && s10 != null)) {
            z11 = true;
        }
        n6.l.a("Must provide id and rawId if not an error response.", z11);
        this.f5007a = str;
        this.f5008b = str2;
        this.f5009c = s10;
        this.d = jVar;
        this.e = iVar;
        this.f5010f = kVar;
        this.h = gVar;
        this.f5011n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (n6.l.l(this.f5007a, uVar.f5007a) && n6.l.l(this.f5008b, uVar.f5008b) && n6.l.l(this.f5009c, uVar.f5009c) && n6.l.l(this.d, uVar.d) && n6.l.l(this.e, uVar.e) && n6.l.l(this.f5010f, uVar.f5010f) && n6.l.l(this.h, uVar.h) && n6.l.l(this.f5011n, uVar.f5011n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5007a, this.f5008b, this.f5009c, this.e, this.d, this.f5010f, this.h, this.f5011n});
    }

    public final String toString() {
        byte[] t10;
        n7.t0 t0Var = this.f5009c;
        if (t0Var == null) {
            t10 = null;
        } else {
            t10 = t0Var.t();
        }
        String c10 = u6.b.c(t10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f5010f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder w9 = a1.g.w("PublicKeyCredential{\n id='", this.f5007a, "', \n type='", this.f5008b, "', \n rawId=");
        a1.g.A(w9, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        a1.g.A(w9, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        w9.append(valueOf4);
        w9.append(", \n authenticatorAttachment='");
        w9.append(this.f5011n);
        w9.append("'}");
        return w9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        k1 k1Var = (k1) j1.f17282b.f17283a.f17268a;
        l1.f17291a.a();
        throw null;
    }
}
