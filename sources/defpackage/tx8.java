package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class tx8 extends c4 {
    public static final Parcelable.Creator<tx8> CREATOR = new m9d((byte) 24);
    public final String a;
    public final String b;
    public final gfe c;
    public final c50 d;
    public final b50 e;
    public final d50 f;
    public final z40 h;
    public final String n;

    public tx8(String str, String str2, byte[] bArr, c50 c50Var, b50 b50Var, d50 d50Var, z40 z40Var, String str3) {
        gfe o;
        boolean z;
        if (bArr == null) {
            o = null;
        } else {
            o = gfe.o(bArr.length, bArr);
        }
        boolean z2 = false;
        if ((c50Var != null && b50Var == null && d50Var == null) || ((c50Var == null && b50Var != null && d50Var == null) || (c50Var == null && b50Var == null && d50Var != null))) {
            z = true;
        } else {
            z = false;
        }
        xve.a("Must provide a response object.", z);
        if (d50Var != null || (str != null && o != null)) {
            z2 = true;
        }
        xve.a("Must provide id and rawId if not an error response.", z2);
        this.a = str;
        this.b = str2;
        this.c = o;
        this.d = c50Var;
        this.e = b50Var;
        this.f = d50Var;
        this.h = z40Var;
        this.n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tx8) {
            tx8 tx8Var = (tx8) obj;
            if (vue.a(this.a, tx8Var.a) && vue.a(this.b, tx8Var.b) && vue.a(this.c, tx8Var.c) && vue.a(this.d, tx8Var.d) && vue.a(this.e, tx8Var.e) && vue.a(this.f, tx8Var.f) && vue.a(this.h, tx8Var.h) && vue.a(this.n, tx8Var.n)) {
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
        gfe gfeVar = this.c;
        if (gfeVar == null) {
            p = null;
        } else {
            p = gfeVar.p();
        }
        String b = lsd.b(p);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder l = xnb.l("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        qu6.u(l, b, ", \n registerResponse=", valueOf, ", \n signResponse=");
        qu6.u(l, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        l.append(valueOf4);
        l.append(", \n authenticatorAttachment='");
        l.append(this.n);
        l.append("'}");
        return l.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        ene eneVar = (ene) pme.b.a.a;
        ene.a.a();
        throw null;
    }
}
