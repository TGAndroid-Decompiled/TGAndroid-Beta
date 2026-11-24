package defpackage;

import android.os.Bundle;
public final class bv6 {
    public final Bundle a;
    public yv6 b;

    public bv6(yv6 yv6Var, boolean z) {
        if (yv6Var != null) {
            Bundle bundle = new Bundle();
            this.a = bundle;
            this.b = yv6Var;
            bundle.putBundle("selector", yv6Var.a);
            bundle.putBoolean("activeScan", z);
            return;
        }
        u36.j("selector must not be null");
        throw null;
    }

    public final void a() {
        if (this.b == null) {
            yv6 b = yv6.b(this.a.getBundle("selector"));
            this.b = b;
            if (b == null) {
                this.b = yv6.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bv6) {
            bv6 bv6Var = (bv6) obj;
            a();
            yv6 yv6Var = this.b;
            bv6Var.a();
            if (yv6Var.equals(bv6Var.b) && b() == bv6Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        yv6 yv6Var = this.b;
        yv6Var.a();
        sb.append(!yv6Var.b.contains(null));
        sb.append(" }");
        return sb.toString();
    }
}
