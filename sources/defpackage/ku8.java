package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class ku8 extends b4 {
    public static final Parcelable.Creator<ku8> CREATOR = new t4d((byte) 24);
    public final String a;
    public final String b;
    public final qae c;
    public final a50 d;
    public final z40 e;
    public final b50 f;
    public final x40 h;
    public final String n;

    public ku8(String str, String str2, byte[] bArr, a50 a50Var, z40 z40Var, b50 b50Var, x40 x40Var, String str3) {
        qae o;
        boolean z;
        if (bArr == null) {
            o = null;
        } else {
            o = qae.o(bArr.length, bArr);
        }
        boolean z2 = false;
        if ((a50Var != null && z40Var == null && b50Var == null) || ((a50Var == null && z40Var != null && b50Var == null) || (a50Var == null && z40Var == null && b50Var != null))) {
            z = true;
        } else {
            z = false;
        }
        fre.a("Must provide a response object.", z);
        if (b50Var != null || (str != null && o != null)) {
            z2 = true;
        }
        fre.a("Must provide id and rawId if not an error response.", z2);
        this.a = str;
        this.b = str2;
        this.c = o;
        this.d = a50Var;
        this.e = z40Var;
        this.f = b50Var;
        this.h = x40Var;
        this.n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ku8) {
            ku8 ku8Var = (ku8) obj;
            if (cqe.a(this.a, ku8Var.a) && cqe.a(this.b, ku8Var.b) && cqe.a(this.c, ku8Var.c) && cqe.a(this.d, ku8Var.d) && cqe.a(this.e, ku8Var.e) && cqe.a(this.f, ku8Var.f) && cqe.a(this.h, ku8Var.h) && cqe.a(this.n, ku8Var.n)) {
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
        qae qaeVar = this.c;
        if (qaeVar == null) {
            p = null;
        } else {
            p = qaeVar.p();
        }
        String b = und.b(p);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder l = yjb.l("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        ls6.u(l, b, ", \n registerResponse=", valueOf, ", \n signResponse=");
        ls6.u(l, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        l.append(valueOf4);
        l.append(", \n authenticatorAttachment='");
        l.append(this.n);
        l.append("'}");
        return l.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        nie nieVar = (nie) yhe.b.a.a;
        nie.a.b();
        throw null;
    }
}
