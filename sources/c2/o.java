package c2;

import android.os.Bundle;
public final class o {
    public final Bundle f2871a;
    public w f2872b;

    public o(w wVar, boolean z10) {
        if (wVar != null) {
            Bundle bundle = new Bundle();
            this.f2871a = bundle;
            this.f2872b = wVar;
            bundle.putBundle("selector", wVar.f2915a);
            bundle.putBoolean("activeScan", z10);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f2872b == null) {
            w b10 = w.b(this.f2871a.getBundle("selector"));
            this.f2872b = b10;
            if (b10 == null) {
                this.f2872b = w.f2914c;
            }
        }
    }

    public final boolean b() {
        return this.f2871a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            a();
            w wVar = this.f2872b;
            oVar.a();
            if (wVar.equals(oVar.f2872b) && b() == oVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f2872b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f2872b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        w wVar = this.f2872b;
        wVar.a();
        sb2.append(!wVar.f2916b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
