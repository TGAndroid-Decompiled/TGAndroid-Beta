package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n7.j1;
import n7.k1;
import n7.l1;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new w.a(25);
    public final String f4636a;
    public final String f4637b;
    public final n7.t0 f4638c;
    public final j d;
    public final i e;
    public final k f4639f;
    public final g h;
    public final String f4640n;

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
        this.f4636a = str;
        this.f4637b = str2;
        this.f4638c = s10;
        this.d = jVar;
        this.e = iVar;
        this.f4639f = kVar;
        this.h = gVar;
        this.f4640n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (n6.l.l(this.f4636a, uVar.f4636a) && n6.l.l(this.f4637b, uVar.f4637b) && n6.l.l(this.f4638c, uVar.f4638c) && n6.l.l(this.d, uVar.d) && n6.l.l(this.e, uVar.e) && n6.l.l(this.f4639f, uVar.f4639f) && n6.l.l(this.h, uVar.h) && n6.l.l(this.f4640n, uVar.f4640n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4636a, this.f4637b, this.f4638c, this.e, this.d, this.f4639f, this.h, this.f4640n});
    }

    public final String toString() {
        byte[] t10;
        n7.t0 t0Var = this.f4638c;
        if (t0Var == null) {
            t10 = null;
        } else {
            t10 = t0Var.t();
        }
        String c10 = u6.b.c(t10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f4639f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder w9 = a1.g.w("PublicKeyCredential{\n id='", this.f4636a, "', \n type='", this.f4637b, "', \n rawId=");
        a1.g.A(w9, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        a1.g.A(w9, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        w9.append(valueOf4);
        w9.append(", \n authenticatorAttachment='");
        w9.append(this.f4640n);
        w9.append("'}");
        return w9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        k1 k1Var = (k1) j1.f15903b.f15904a.f15889a;
        l1.f15912a.a();
        throw null;
    }
}
