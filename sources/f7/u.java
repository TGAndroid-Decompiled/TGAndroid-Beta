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
    public final String f11566a;
    public final String f11567b;
    public final q7.s0 f11568c;
    public final j d;
    public final i f11569e;
    public final k f11570f;
    public final g h;
    public final String f11571n;

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
        this.f11566a = str;
        this.f11567b = str2;
        this.f11568c = o4;
        this.d = jVar;
        this.f11569e = iVar;
        this.f11570f = kVar;
        this.h = gVar;
        this.f11571n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (q6.m.l(this.f11566a, uVar.f11566a) && q6.m.l(this.f11567b, uVar.f11567b) && q6.m.l(this.f11568c, uVar.f11568c) && q6.m.l(this.d, uVar.d) && q6.m.l(this.f11569e, uVar.f11569e) && q6.m.l(this.f11570f, uVar.f11570f) && q6.m.l(this.h, uVar.h) && q6.m.l(this.f11571n, uVar.f11571n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11566a, this.f11567b, this.f11568c, this.f11569e, this.d, this.f11570f, this.h, this.f11571n});
    }

    public final String toString() {
        byte[] p10;
        q7.s0 s0Var = this.f11568c;
        if (s0Var == null) {
            p10 = null;
        } else {
            p10 = s0Var.p();
        }
        String c10 = x6.b.c(p10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.f11569e);
        String valueOf3 = String.valueOf(this.f11570f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder n10 = e2.n("PublicKeyCredential{\n id='", this.f11566a, "', \n type='", this.f11567b, "', \n rawId=");
        e2.r(n10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        e2.r(n10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        n10.append(valueOf4);
        n10.append(", \n authenticatorAttachment='");
        n10.append(this.f11571n);
        n10.append("'}");
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        j1 j1Var = (j1) i1.f56009b.f56010a.f55994a;
        k1.f56020a.c();
        throw null;
    }
}
