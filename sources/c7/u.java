package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n7.k1;
import n7.l1;
import n7.m1;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new w.a(25);
    public final String f4562a;
    public final String f4563b;
    public final n7.t0 f4564c;
    public final j d;
    public final i e;
    public final k f4565f;
    public final g h;
    public final String f4566n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        n7.t0 t10;
        boolean z10;
        if (bArr == null) {
            t10 = null;
        } else {
            t10 = n7.t0.t(bArr.length, bArr);
        }
        boolean z11 = false;
        if ((jVar != null && iVar == null && kVar == null) || ((jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null))) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.a("Must provide a response object.", z10);
        if (kVar != null || (str != null && t10 != null)) {
            z11 = true;
        }
        n6.l.a("Must provide id and rawId if not an error response.", z11);
        this.f4562a = str;
        this.f4563b = str2;
        this.f4564c = t10;
        this.d = jVar;
        this.e = iVar;
        this.f4565f = kVar;
        this.h = gVar;
        this.f4566n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (n6.l.l(this.f4562a, uVar.f4562a) && n6.l.l(this.f4563b, uVar.f4563b) && n6.l.l(this.f4564c, uVar.f4564c) && n6.l.l(this.d, uVar.d) && n6.l.l(this.e, uVar.e) && n6.l.l(this.f4565f, uVar.f4565f) && n6.l.l(this.h, uVar.h) && n6.l.l(this.f4566n, uVar.f4566n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4562a, this.f4563b, this.f4564c, this.e, this.d, this.f4565f, this.h, this.f4566n});
    }

    public final String toString() {
        byte[] u10;
        n7.t0 t0Var = this.f4564c;
        if (t0Var == null) {
            u10 = null;
        } else {
            u10 = t0Var.u();
        }
        String c10 = u6.b.c(u10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f4565f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder w10 = a4.a.w("PublicKeyCredential{\n id='", this.f4562a, "', \n type='", this.f4563b, "', \n rawId=");
        a4.a.z(w10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        a4.a.z(w10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        w10.append(valueOf4);
        w10.append(", \n authenticatorAttachment='");
        w10.append(this.f4566n);
        w10.append("'}");
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        l1 l1Var = (l1) k1.f13973b.f13974a.f13950a;
        m1.f13977a.a();
        throw null;
    }
}
