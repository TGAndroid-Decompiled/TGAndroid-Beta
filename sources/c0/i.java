package c0;

import java.io.Serializable;
public final class i {
    public Serializable f3974a;
    public k f3975b;
    public l f3976c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.f3975b;
        if (kVar != null && kVar.f3979b.k(null)) {
            this.f3974a = null;
            this.f3975b = null;
            this.f3976c = null;
        }
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f3975b;
        if (kVar != null) {
            j jVar = kVar.f3979b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f3974a, 1));
            }
        }
        if (!this.d && (lVar = this.f3976c) != null) {
            lVar.k(null);
        }
    }
}
