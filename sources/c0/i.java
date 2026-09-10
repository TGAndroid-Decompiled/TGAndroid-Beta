package c0;

import java.io.Serializable;
public final class i {
    public Serializable f4053a;
    public k f4054b;
    public l f4055c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.f4054b;
        if (kVar != null && kVar.f4058b.k(null)) {
            this.f4053a = null;
            this.f4054b = null;
            this.f4055c = null;
        }
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f4054b;
        if (kVar != null) {
            j jVar = kVar.f4058b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f4053a, 1));
            }
        }
        if (!this.d && (lVar = this.f4055c) != null) {
            lVar.k(null);
        }
    }
}
