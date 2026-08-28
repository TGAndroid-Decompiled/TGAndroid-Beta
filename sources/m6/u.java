package m6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import x6.i1;
import x6.j1;
import x6.k1;
public final class u extends y5.a {
    public static final Parcelable.Creator<u> CREATOR = new h5.h(25);
    public final String f17574a;
    public final String f17575b;
    public final x6.s0 f17576c;
    public final j d;
    public final i f17577e;
    public final k f17578f;
    public final g h;
    public final String f17579n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        x6.s0 t10;
        boolean z10;
        if (bArr == null) {
            t10 = null;
        } else {
            t10 = x6.s0.t(bArr.length, bArr);
        }
        boolean z11 = false;
        if ((jVar != null && iVar == null && kVar == null) || ((jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null))) {
            z10 = true;
        } else {
            z10 = false;
        }
        x5.l.a("Must provide a response object.", z10);
        if (kVar != null || (str != null && t10 != null)) {
            z11 = true;
        }
        x5.l.a("Must provide id and rawId if not an error response.", z11);
        this.f17574a = str;
        this.f17575b = str2;
        this.f17576c = t10;
        this.d = jVar;
        this.f17577e = iVar;
        this.f17578f = kVar;
        this.h = gVar;
        this.f17579n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (x5.l.l(this.f17574a, uVar.f17574a) && x5.l.l(this.f17575b, uVar.f17575b) && x5.l.l(this.f17576c, uVar.f17576c) && x5.l.l(this.d, uVar.d) && x5.l.l(this.f17577e, uVar.f17577e) && x5.l.l(this.f17578f, uVar.f17578f) && x5.l.l(this.h, uVar.h) && x5.l.l(this.f17579n, uVar.f17579n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17574a, this.f17575b, this.f17576c, this.f17577e, this.d, this.f17578f, this.h, this.f17579n});
    }

    public final String toString() {
        byte[] u10;
        x6.s0 s0Var = this.f17576c;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        String c10 = e6.b.c(u10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.f17577e);
        String valueOf3 = String.valueOf(this.f17578f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder q10 = j3.r0.q("PublicKeyCredential{\n id='", this.f17574a, "', \n type='", this.f17575b, "', \n rawId=");
        j3.r0.A(q10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        j3.r0.A(q10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        q10.append(valueOf4);
        q10.append(", \n authenticatorAttachment='");
        q10.append(this.f17579n);
        q10.append("'}");
        return q10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        j1 j1Var = (j1) i1.f49022b.f49023a.f49007a;
        k1.f49033a.R();
        throw null;
    }
}
