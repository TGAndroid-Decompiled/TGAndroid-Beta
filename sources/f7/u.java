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
    public final String f11592a;
    public final String f11593b;
    public final q7.s0 f11594c;
    public final j d;
    public final i f11595e;
    public final k f11596f;
    public final g h;
    public final String f11597n;

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
        this.f11592a = str;
        this.f11593b = str2;
        this.f11594c = o4;
        this.d = jVar;
        this.f11595e = iVar;
        this.f11596f = kVar;
        this.h = gVar;
        this.f11597n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (q6.m.l(this.f11592a, uVar.f11592a) && q6.m.l(this.f11593b, uVar.f11593b) && q6.m.l(this.f11594c, uVar.f11594c) && q6.m.l(this.d, uVar.d) && q6.m.l(this.f11595e, uVar.f11595e) && q6.m.l(this.f11596f, uVar.f11596f) && q6.m.l(this.h, uVar.h) && q6.m.l(this.f11597n, uVar.f11597n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11592a, this.f11593b, this.f11594c, this.f11595e, this.d, this.f11596f, this.h, this.f11597n});
    }

    public final String toString() {
        byte[] p10;
        q7.s0 s0Var = this.f11594c;
        if (s0Var == null) {
            p10 = null;
        } else {
            p10 = s0Var.p();
        }
        String c10 = x6.b.c(p10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.f11595e);
        String valueOf3 = String.valueOf(this.f11596f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder n10 = e2.n("PublicKeyCredential{\n id='", this.f11592a, "', \n type='", this.f11593b, "', \n rawId=");
        e2.r(n10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        e2.r(n10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        n10.append(valueOf4);
        n10.append(", \n authenticatorAttachment='");
        n10.append(this.f11597n);
        n10.append("'}");
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        j1 j1Var = (j1) i1.f56050b.f56051a.f56035a;
        k1.f56061a.c();
        throw null;
    }
}
