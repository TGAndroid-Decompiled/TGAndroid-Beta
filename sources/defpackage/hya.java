package defpackage;

import android.net.Uri;
import j$.util.Objects;
public final class hya {
    public final int a;
    public final long b;
    public final Uri c;
    public final mm5 d;
    public final mm5 e;

    public hya(int i, long j, Uri uri, w59 w59Var, w59 w59Var2) {
        this.a = i;
        this.b = j;
        this.c = uri;
        this.d = mm5.q(w59Var);
        this.e = mm5.q(w59Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hya)) {
            return false;
        }
        hya hyaVar = (hya) obj;
        if (this.a == hyaVar.a && this.b == hyaVar.b && Objects.equals(this.c, hyaVar.c) && Objects.equals(this.d, hyaVar.d) && Objects.equals(this.e, hyaVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, this.e);
    }
}
