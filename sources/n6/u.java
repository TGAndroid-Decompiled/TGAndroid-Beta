package n6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import y6.k1;

public final class u extends z5.a {
    public static final Parcelable.Creator<u> CREATOR = new o0(6);

    public final String f18410a;

    public final String f18411b;

    public final y6.s0 f18412c;
    public final j d;

    public final i f18413e;

    public final k f18414f;
    public final g h;

    public final String f18415n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        y6.s0 s0VarT = bArr == null ? null : y6.s0.t(bArr.length, bArr);
        boolean z10 = false;
        y5.l.a("Must provide a response object.", (jVar != null && iVar == null && kVar == null) || (jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null));
        if (kVar != null || (str != null && s0VarT != null)) {
            z10 = true;
        }
        y5.l.a("Must provide id and rawId if not an error response.", z10);
        this.f18410a = str;
        this.f18411b = str2;
        this.f18412c = s0VarT;
        this.d = jVar;
        this.f18413e = iVar;
        this.f18414f = kVar;
        this.h = gVar;
        this.f18415n = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return y5.l.l(this.f18410a, uVar.f18410a) && y5.l.l(this.f18411b, uVar.f18411b) && y5.l.l(this.f18412c, uVar.f18412c) && y5.l.l(this.d, uVar.d) && y5.l.l(this.f18413e, uVar.f18413e) && y5.l.l(this.f18414f, uVar.f18414f) && y5.l.l(this.h, uVar.h) && y5.l.l(this.f18415n, uVar.f18415n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18410a, this.f18411b, this.f18412c, this.f18413e, this.d, this.f18414f, this.h, this.f18415n});
    }

    public final String toString() {
        y6.s0 s0Var = this.f18412c;
        String strC = f6.b.c(s0Var == null ? null : s0Var.u());
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.f18413e);
        String strValueOf3 = String.valueOf(this.f18414f);
        String strValueOf4 = String.valueOf(this.h);
        StringBuilder sbP = i0.a.p("PublicKeyCredential{\n id='", this.f18410a, "', \n type='", this.f18411b, "', \n rawId=");
        i0.a.z(sbP, strC, ", \n registerResponse=", strValueOf, ", \n signResponse=");
        i0.a.z(sbP, strValueOf2, ", \n errorResponse=", strValueOf3, ", \n extensionsClientOutputs=");
        sbP.append(strValueOf4);
        sbP.append(", \n authenticatorAttachment='");
        sbP.append(this.f18415n);
        sbP.append("'}");
        return sbP.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        k1.f49750a.p();
        throw null;
    }
}
