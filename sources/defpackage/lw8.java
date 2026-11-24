package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class lw8 extends b4 {
    public static final Parcelable.Creator<lw8> CREATOR = new v6d((byte) 24);
    public final String a;
    public final String b;
    public final rce c;
    public final a60 d;
    public final z50 e;
    public final b60 f;
    public final x50 h;
    public final String n;

    public lw8(String str, String str2, byte[] bArr, a60 a60Var, z50 z50Var, b60 b60Var, x50 x50Var, String str3) {
        rce o;
        boolean z;
        if (bArr == null) {
            o = null;
        } else {
            o = rce.o(bArr.length, bArr);
        }
        boolean z2 = false;
        if ((a60Var != null && z50Var == null && b60Var == null) || ((a60Var == null && z50Var != null && b60Var == null) || (a60Var == null && z50Var == null && b60Var != null))) {
            z = true;
        } else {
            z = false;
        }
        ite.a("Must provide a response object.", z);
        if (b60Var != null || (str != null && o != null)) {
            z2 = true;
        }
        ite.a("Must provide id and rawId if not an error response.", z2);
        this.a = str;
        this.b = str2;
        this.c = o;
        this.d = a60Var;
        this.e = z50Var;
        this.f = b60Var;
        this.h = x50Var;
        this.n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lw8) {
            lw8 lw8Var = (lw8) obj;
            if (fse.a(this.a, lw8Var.a) && fse.a(this.b, lw8Var.b) && fse.a(this.c, lw8Var.c) && fse.a(this.d, lw8Var.d) && fse.a(this.e, lw8Var.e) && fse.a(this.f, lw8Var.f) && fse.a(this.h, lw8Var.h) && fse.a(this.n, lw8Var.n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.h, this.n});
    }

    public final String toString() {
        byte[] p;
        rce rceVar = this.c;
        if (rceVar == null) {
            p = null;
        } else {
            p = rceVar.p();
        }
        String b = xpd.b(p);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder m = mlb.m("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        kt6.v(m, b, ", \n registerResponse=", valueOf, ", \n signResponse=");
        kt6.v(m, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        m.append(valueOf4);
        m.append(", \n authenticatorAttachment='");
        m.append(this.n);
        m.append("'}");
        return m.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        oke okeVar = (oke) zje.b.a.a;
        oke.a.a();
        throw null;
    }
}
