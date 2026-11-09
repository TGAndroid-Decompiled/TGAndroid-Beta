package f7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import q7.i1;
import q7.j1;
import q7.k1;
public final class u extends r6.a {
    public static final Parcelable.Creator<u> CREATOR = new db.k(14);
    public final String f11432a;
    public final String f11433b;
    public final q7.s0 f11434c;
    public final j d;
    public final i f11435e;
    public final k f11436f;
    public final g h;
    public final String f11437n;

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
        this.f11432a = str;
        this.f11433b = str2;
        this.f11434c = o4;
        this.d = jVar;
        this.f11435e = iVar;
        this.f11436f = kVar;
        this.h = gVar;
        this.f11437n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (q6.m.k(this.f11432a, uVar.f11432a) && q6.m.k(this.f11433b, uVar.f11433b) && q6.m.k(this.f11434c, uVar.f11434c) && q6.m.k(this.d, uVar.d) && q6.m.k(this.f11435e, uVar.f11435e) && q6.m.k(this.f11436f, uVar.f11436f) && q6.m.k(this.h, uVar.h) && q6.m.k(this.f11437n, uVar.f11437n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11432a, this.f11433b, this.f11434c, this.f11435e, this.d, this.f11436f, this.h, this.f11437n});
    }

    public final String toString() {
        byte[] p10;
        q7.s0 s0Var = this.f11434c;
        if (s0Var == null) {
            p10 = null;
        } else {
            p10 = s0Var.p();
        }
        String c10 = x6.b.c(p10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.f11435e);
        String valueOf3 = String.valueOf(this.f11436f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("PublicKeyCredential{\n id='", this.f11432a, "', \n type='", this.f11433b, "', \n rawId=");
        com.google.android.recaptcha.internal.a.s(n10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        com.google.android.recaptcha.internal.a.s(n10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        n10.append(valueOf4);
        n10.append(", \n authenticatorAttachment='");
        n10.append(this.f11437n);
        n10.append("'}");
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        j1 j1Var = (j1) i1.f53999b.f54000a.f53984a;
        k1.f54010a.T();
        throw null;
    }
}
