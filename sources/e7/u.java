package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p7.j1;
import p7.k1;
import p7.l1;
public final class u extends q6.a {
    public static final Parcelable.Creator<u> CREATOR = new w.a(29);
    public final String f9875a;
    public final String f9876b;
    public final p7.t0 f9877c;
    public final j d;
    public final i f9878e;
    public final k f9879f;
    public final g h;
    public final String f9880n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        p7.t0 o10;
        boolean z10;
        if (bArr == null) {
            o10 = null;
        } else {
            o10 = p7.t0.o(bArr.length, bArr);
        }
        boolean z11 = false;
        if ((jVar != null && iVar == null && kVar == null) || ((jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null))) {
            z10 = true;
        } else {
            z10 = false;
        }
        p6.m.a("Must provide a response object.", z10);
        if (kVar != null || (str != null && o10 != null)) {
            z11 = true;
        }
        p6.m.a("Must provide id and rawId if not an error response.", z11);
        this.f9875a = str;
        this.f9876b = str2;
        this.f9877c = o10;
        this.d = jVar;
        this.f9878e = iVar;
        this.f9879f = kVar;
        this.h = gVar;
        this.f9880n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (p6.m.k(this.f9875a, uVar.f9875a) && p6.m.k(this.f9876b, uVar.f9876b) && p6.m.k(this.f9877c, uVar.f9877c) && p6.m.k(this.d, uVar.d) && p6.m.k(this.f9878e, uVar.f9878e) && p6.m.k(this.f9879f, uVar.f9879f) && p6.m.k(this.h, uVar.h) && p6.m.k(this.f9880n, uVar.f9880n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9875a, this.f9876b, this.f9877c, this.f9878e, this.d, this.f9879f, this.h, this.f9880n});
    }

    public final String toString() {
        byte[] p10;
        p7.t0 t0Var = this.f9877c;
        if (t0Var == null) {
            p10 = null;
        } else {
            p10 = t0Var.p();
        }
        String c2 = w6.b.c(p10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.f9878e);
        String valueOf3 = String.valueOf(this.f9879f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("PublicKeyCredential{\n id='", this.f9875a, "', \n type='", this.f9876b, "', \n rawId=");
        com.google.android.recaptcha.internal.a.s(n4, c2, ", \n registerResponse=", valueOf, ", \n signResponse=");
        com.google.android.recaptcha.internal.a.s(n4, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        n4.append(valueOf4);
        n4.append(", \n authenticatorAttachment='");
        n4.append(this.f9880n);
        n4.append("'}");
        return n4.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        k1 k1Var = (k1) j1.f53369b.f53370a.f53354a;
        l1.f53380a.b();
        throw null;
    }
}
