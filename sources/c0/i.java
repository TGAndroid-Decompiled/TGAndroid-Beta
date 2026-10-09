package c0;

import java.io.Serializable;
public final class i {
    public Serializable f3975a;
    public k f3976b;
    public l f3977c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.f3976b;
        if (kVar != null && kVar.f3980b.k(null)) {
            this.f3975a = null;
            this.f3976b = null;
            this.f3977c = null;
        }
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f3976b;
        if (kVar != null) {
            j jVar = kVar.f3980b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f3975a, 1));
            }
        }
        if (!this.d && (lVar = this.f3977c) != null) {
            lVar.k(null);
        }
    }
}
