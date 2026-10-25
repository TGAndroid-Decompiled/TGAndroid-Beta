package d7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o7.i1;
import o7.j1;
import o7.k1;
public final class u extends p6.a {
    public static final Parcelable.Creator<u> CREATOR = new w.a(26);
    public final String f8232a;
    public final String f8233b;
    public final o7.s0 f8234c;
    public final j d;
    public final i e;
    public final k f8235f;
    public final g h;
    public final String f8236n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        o7.s0 s10;
        boolean z10;
        if (bArr == null) {
            s10 = null;
        } else {
            s10 = o7.s0.s(bArr.length, bArr);
        }
        boolean z11 = false;
        if ((jVar != null && iVar == null && kVar == null) || ((jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null))) {
            z10 = true;
        } else {
            z10 = false;
        }
        o6.l.a("Must provide a response object.", z10);
        if (kVar != null || (str != null && s10 != null)) {
            z11 = true;
        }
        o6.l.a("Must provide id and rawId if not an error response.", z11);
        this.f8232a = str;
        this.f8233b = str2;
        this.f8234c = s10;
        this.d = jVar;
        this.e = iVar;
        this.f8235f = kVar;
        this.h = gVar;
        this.f8236n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (o6.l.l(this.f8232a, uVar.f8232a) && o6.l.l(this.f8233b, uVar.f8233b) && o6.l.l(this.f8234c, uVar.f8234c) && o6.l.l(this.d, uVar.d) && o6.l.l(this.e, uVar.e) && o6.l.l(this.f8235f, uVar.f8235f) && o6.l.l(this.h, uVar.h) && o6.l.l(this.f8236n, uVar.f8236n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8232a, this.f8233b, this.f8234c, this.e, this.d, this.f8235f, this.h, this.f8236n});
    }

    public final String toString() {
        byte[] t10;
        o7.s0 s0Var = this.f8234c;
        if (s0Var == null) {
            t10 = null;
        } else {
            t10 = s0Var.t();
        }
        String c10 = v6.b.c(t10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f8235f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder w10 = a1.g.w("PublicKeyCredential{\n id='", this.f8232a, "', \n type='", this.f8233b, "', \n rawId=");
        c3.h0.r(w10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        c3.h0.r(w10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        w10.append(valueOf4);
        w10.append(", \n authenticatorAttachment='");
        w10.append(this.f8236n);
        w10.append("'}");
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        j1 j1Var = (j1) i1.f19223b.f19224a.f19209a;
        k1.f19232a.a();
        throw null;
    }
}
