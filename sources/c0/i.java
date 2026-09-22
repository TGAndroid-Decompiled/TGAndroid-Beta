package c0;

import java.io.Serializable;
public final class i {
    public Serializable f3638a;
    public k f3639b;
    public l f3640c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.f3639b;
        if (kVar != null && kVar.f3643b.k(null)) {
            this.f3638a = null;
            this.f3639b = null;
            this.f3640c = null;
        }
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f3639b;
        if (kVar != null) {
            j jVar = kVar.f3643b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f3638a, 1));
            }
        }
        if (!this.d && (lVar = this.f3640c) != null) {
            lVar.k(null);
        }
    }
}
