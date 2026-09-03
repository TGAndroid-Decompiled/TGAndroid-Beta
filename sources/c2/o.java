package c2;

import android.os.Bundle;
public final class o {
    public final Bundle f2001a;
    public w f2002b;

    public o(w wVar, boolean z4) {
        if (wVar != null) {
            Bundle bundle = new Bundle();
            this.f2001a = bundle;
            this.f2002b = wVar;
            bundle.putBundle("selector", wVar.f2042a);
            bundle.putBoolean("activeScan", z4);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f2002b == null) {
            w b10 = w.b(this.f2001a.getBundle("selector"));
            this.f2002b = b10;
            if (b10 == null) {
                this.f2002b = w.f2041c;
            }
        }
    }

    public final boolean b() {
        return this.f2001a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            a();
            w wVar = this.f2002b;
            oVar.a();
            if (wVar.equals(oVar.f2002b) && b() == oVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f2002b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.f2002b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        w wVar = this.f2002b;
        wVar.a();
        sb.append(!wVar.f2043b.contains(null));
        sb.append(" }");
        return sb.toString();
    }
}
