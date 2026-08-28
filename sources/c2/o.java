package c2;

import android.os.Bundle;
public final class o {
    public final Bundle f2200a;
    public v f2201b;

    public o(v vVar, boolean z10) {
        if (vVar != null) {
            Bundle bundle = new Bundle();
            this.f2200a = bundle;
            this.f2201b = vVar;
            bundle.putBundle("selector", vVar.f2237a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f2201b == null) {
            v b10 = v.b(this.f2200a.getBundle("selector"));
            this.f2201b = b10;
            if (b10 == null) {
                this.f2201b = v.f2236c;
            }
        }
    }

    public final boolean b() {
        return this.f2200a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            a();
            v vVar = this.f2201b;
            oVar.a();
            if (vVar.equals(oVar.f2201b) && b() == oVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f2201b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f2201b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        v vVar = this.f2201b;
        vVar.a();
        sb2.append(!vVar.f2238b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
