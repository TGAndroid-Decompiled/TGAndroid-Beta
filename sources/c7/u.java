package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n7.i1;
import n7.j1;
import n7.k1;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new w.a(25);
    public final String f4037a;
    public final String f4038b;
    public final n7.s0 f4039c;
    public final j d;
    public final i e;
    public final k f4040f;
    public final g h;
    public final String f4041n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        n7.s0 s10;
        boolean z10;
        if (bArr == null) {
            s10 = null;
        } else {
            s10 = n7.s0.s(bArr.length, bArr);
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
        this.f4037a = str;
        this.f4038b = str2;
        this.f4039c = s10;
        this.d = jVar;
        this.e = iVar;
        this.f4040f = kVar;
        this.h = gVar;
        this.f4041n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (n6.l.k(this.f4037a, uVar.f4037a) && n6.l.k(this.f4038b, uVar.f4038b) && n6.l.k(this.f4039c, uVar.f4039c) && n6.l.k(this.d, uVar.d) && n6.l.k(this.e, uVar.e) && n6.l.k(this.f4040f, uVar.f4040f) && n6.l.k(this.h, uVar.h) && n6.l.k(this.f4041n, uVar.f4041n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4037a, this.f4038b, this.f4039c, this.e, this.d, this.f4040f, this.h, this.f4041n});
    }

    public final String toString() {
        byte[] t10;
        n7.s0 s0Var = this.f4039c;
        if (s0Var == null) {
            t10 = null;
        } else {
            t10 = s0Var.t();
        }
        String c10 = u6.b.c(t10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f4040f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder v = a1.g.v("PublicKeyCredential{\n id='", this.f4037a, "', \n type='", this.f4038b, "', \n rawId=");
        c3.i0.r(v, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        c3.i0.r(v, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        v.append(valueOf4);
        v.append(", \n authenticatorAttachment='");
        v.append(this.f4041n);
        v.append("'}");
        return v.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        j1 j1Var = (j1) i1.f13682b.f13683a.f13668a;
        k1.f13691a.O();
        throw null;
    }
}
