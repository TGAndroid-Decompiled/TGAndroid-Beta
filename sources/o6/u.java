package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.th;
import z6.i1;
import z6.j1;
import z6.k1;
public final class u extends a6.a {
    public static final Parcelable.Creator<u> CREATOR = new n0(7);
    public final String f19434a;
    public final String f19435b;
    public final z6.s0 f19436c;
    public final j d;
    public final i f19437e;
    public final k f19438f;
    public final g h;
    public final String f19439n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        z6.s0 t10;
        boolean z10;
        if (bArr == null) {
            t10 = null;
        } else {
            t10 = z6.s0.t(bArr.length, bArr);
        }
        boolean z11 = false;
        if ((jVar != null && iVar == null && kVar == null) || ((jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null))) {
            z10 = true;
        } else {
            z10 = false;
        }
        z5.l.a("Must provide a response object.", z10);
        if (kVar != null || (str != null && t10 != null)) {
            z11 = true;
        }
        z5.l.a("Must provide id and rawId if not an error response.", z11);
        this.f19434a = str;
        this.f19435b = str2;
        this.f19436c = t10;
        this.d = jVar;
        this.f19437e = iVar;
        this.f19438f = kVar;
        this.h = gVar;
        this.f19439n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (z5.l.l(this.f19434a, uVar.f19434a) && z5.l.l(this.f19435b, uVar.f19435b) && z5.l.l(this.f19436c, uVar.f19436c) && z5.l.l(this.d, uVar.d) && z5.l.l(this.f19437e, uVar.f19437e) && z5.l.l(this.f19438f, uVar.f19438f) && z5.l.l(this.h, uVar.h) && z5.l.l(this.f19439n, uVar.f19439n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19434a, this.f19435b, this.f19436c, this.f19437e, this.d, this.f19438f, this.h, this.f19439n});
    }

    public final String toString() {
        byte[] u10;
        z6.s0 s0Var = this.f19436c;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        String c3 = g6.b.c(u10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.f19437e);
        String valueOf3 = String.valueOf(this.f19438f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder k9 = th.k("PublicKeyCredential{\n id='", this.f19434a, "', \n type='", this.f19435b, "', \n rawId=");
        th.w(k9, c3, ", \n registerResponse=", valueOf, ", \n signResponse=");
        th.w(k9, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        k9.append(valueOf4);
        k9.append(", \n authenticatorAttachment='");
        k9.append(this.f19439n);
        k9.append("'}");
        return k9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        j1 j1Var = (j1) i1.f50722b.f50723a.f50707a;
        k1.f50733a.a();
        throw null;
    }
}
