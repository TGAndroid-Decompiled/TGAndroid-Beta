package f7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import q7.i1;
import q7.j1;
import q7.k1;
public final class u extends r6.a {
    public static final Parcelable.Creator<u> CREATOR = new db.k(14);
    public final String f11437a;
    public final String f11438b;
    public final q7.s0 f11439c;
    public final j d;
    public final i f11440e;
    public final k f11441f;
    public final g h;
    public final String f11442n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        q7.s0 o4;
        boolean z9;
        if (bArr == null) {
            o4 = null;
        } else {
            o4 = q7.s0.o(bArr.length, bArr);
        }
        boolean z10 = false;
        if ((jVar != null && iVar == null && kVar == null) || ((jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null))) {
            z9 = true;
        } else {
            z9 = false;
        }
        q6.m.a("Must provide a response object.", z9);
        if (kVar != null || (str != null && o4 != null)) {
            z10 = true;
        }
        q6.m.a("Must provide id and rawId if not an error response.", z10);
        this.f11437a = str;
        this.f11438b = str2;
        this.f11439c = o4;
        this.d = jVar;
        this.f11440e = iVar;
        this.f11441f = kVar;
        this.h = gVar;
        this.f11442n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (q6.m.k(this.f11437a, uVar.f11437a) && q6.m.k(this.f11438b, uVar.f11438b) && q6.m.k(this.f11439c, uVar.f11439c) && q6.m.k(this.d, uVar.d) && q6.m.k(this.f11440e, uVar.f11440e) && q6.m.k(this.f11441f, uVar.f11441f) && q6.m.k(this.h, uVar.h) && q6.m.k(this.f11442n, uVar.f11442n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11437a, this.f11438b, this.f11439c, this.f11440e, this.d, this.f11441f, this.h, this.f11442n});
    }

    public final String toString() {
        byte[] p10;
        q7.s0 s0Var = this.f11439c;
        if (s0Var == null) {
            p10 = null;
        } else {
            p10 = s0Var.p();
        }
        String c10 = x6.b.c(p10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.f11440e);
        String valueOf3 = String.valueOf(this.f11441f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("PublicKeyCredential{\n id='", this.f11437a, "', \n type='", this.f11438b, "', \n rawId=");
        com.google.android.recaptcha.internal.a.s(n10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        com.google.android.recaptcha.internal.a.s(n10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        n10.append(valueOf4);
        n10.append(", \n authenticatorAttachment='");
        n10.append(this.f11442n);
        n10.append("'}");
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        j1 j1Var = (j1) i1.f53998b.f53999a.f53983a;
        k1.f54009a.T();
        throw null;
    }
}
