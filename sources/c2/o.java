package c2;

import android.os.Bundle;
public final class o {
    public final Bundle f1974a;
    public v f1975b;

    public o(v vVar, boolean z4) {
        if (vVar != null) {
            Bundle bundle = new Bundle();
            this.f1974a = bundle;
            this.f1975b = vVar;
            bundle.putBundle("selector", vVar.f2011a);
            bundle.putBoolean("activeScan", z4);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f1975b == null) {
            v b10 = v.b(this.f1974a.getBundle("selector"));
            this.f1975b = b10;
            if (b10 == null) {
                this.f1975b = v.f2010c;
            }
        }
    }

    public final boolean b() {
        return this.f1974a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            a();
            v vVar = this.f1975b;
            oVar.a();
            if (vVar.equals(oVar.f1975b) && b() == oVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f1975b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.f1975b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        v vVar = this.f1975b;
        vVar.a();
        sb.append(!vVar.f2012b.contains(null));
        sb.append(" }");
        return sb.toString();
    }
}
