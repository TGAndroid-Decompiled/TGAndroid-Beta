package f7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
import q7.i1;
import q7.j1;
import q7.k1;
public final class u extends r6.a {
    public static final Parcelable.Creator<u> CREATOR = new db.k(14);
    public final String f11246a;
    public final String f11247b;
    public final q7.s0 f11248c;
    public final j d;
    public final i f11249e;
    public final k f11250f;
    public final g h;
    public final String f11251n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        q7.s0 o4;
        boolean z10;
        if (bArr == null) {
            o4 = null;
        } else {
            o4 = q7.s0.o(bArr.length, bArr);
        }
        boolean z11 = false;
        if ((jVar != null && iVar == null && kVar == null) || ((jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null))) {
            z10 = true;
        } else {
            z10 = false;
        }
        q6.m.a("Must provide a response object.", z10);
        if (kVar != null || (str != null && o4 != null)) {
            z11 = true;
        }
        q6.m.a("Must provide id and rawId if not an error response.", z11);
        this.f11246a = str;
        this.f11247b = str2;
        this.f11248c = o4;
        this.d = jVar;
        this.f11249e = iVar;
        this.f11250f = kVar;
        this.h = gVar;
        this.f11251n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (q6.m.k(this.f11246a, uVar.f11246a) && q6.m.k(this.f11247b, uVar.f11247b) && q6.m.k(this.f11248c, uVar.f11248c) && q6.m.k(this.d, uVar.d) && q6.m.k(this.f11249e, uVar.f11249e) && q6.m.k(this.f11250f, uVar.f11250f) && q6.m.k(this.h, uVar.h) && q6.m.k(this.f11251n, uVar.f11251n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11246a, this.f11247b, this.f11248c, this.f11249e, this.d, this.f11250f, this.h, this.f11251n});
    }

    public final String toString() {
        byte[] p10;
        q7.s0 s0Var = this.f11248c;
        if (s0Var == null) {
            p10 = null;
        } else {
            p10 = s0Var.p();
        }
        String c10 = x6.b.c(p10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.f11249e);
        String valueOf3 = String.valueOf(this.f11250f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder n10 = e2.n("PublicKeyCredential{\n id='", this.f11246a, "', \n type='", this.f11247b, "', \n rawId=");
        e2.r(n10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        e2.r(n10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        n10.append(valueOf4);
        n10.append(", \n authenticatorAttachment='");
        n10.append(this.f11251n);
        n10.append("'}");
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        j1 j1Var = (j1) i1.f55435b.f55436a.f55420a;
        k1.f55446a.q1();
        throw null;
    }
}
