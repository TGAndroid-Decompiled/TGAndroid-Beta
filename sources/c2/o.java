package c2;

import android.os.Bundle;
public final class o {
    public final Bundle f2142a;
    public v f2143b;

    public o(v vVar, boolean z4) {
        if (vVar != null) {
            Bundle bundle = new Bundle();
            this.f2142a = bundle;
            this.f2143b = vVar;
            bundle.putBundle("selector", vVar.f2184a);
            bundle.putBoolean("activeScan", z4);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f2143b == null) {
            v b10 = v.b(this.f2142a.getBundle("selector"));
            this.f2143b = b10;
            if (b10 == null) {
                this.f2143b = v.f2183c;
            }
        }
    }

    public final boolean b() {
        return this.f2142a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            a();
            v vVar = this.f2143b;
            oVar.a();
            if (vVar.equals(oVar.f2143b) && b() == oVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f2143b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.f2143b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        v vVar = this.f2143b;
        vVar.a();
        sb.append(!vVar.f2185b.contains(null));
        sb.append(" }");
        return sb.toString();
    }
}
