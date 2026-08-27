package c2;

import android.os.Bundle;

public final class o {

    public final Bundle f2315a;

    public u f2316b;

    public o(u uVar, boolean z10) {
        if (uVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.f2315a = bundle;
        this.f2316b = uVar;
        bundle.putBundle("selector", uVar.f2349a);
        bundle.putBoolean("activeScan", z10);
    }

    public final void a() {
        if (this.f2316b == null) {
            u uVarB = u.b(this.f2315a.getBundle("selector"));
            this.f2316b = uVarB;
            if (uVarB == null) {
                this.f2316b = u.f2348c;
            }
        }
    }

    public final boolean b() {
        return this.f2315a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            a();
            u uVar = this.f2316b;
            oVar.a();
            if (uVar.equals(oVar.f2316b) && b() == oVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return (this.f2316b.hashCode() ^ (b() ? 1 : 0)) == true ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f2316b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        u uVar = this.f2316b;
        uVar.a();
        sb2.append(!uVar.f2350b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
