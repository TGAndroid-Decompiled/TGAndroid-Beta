package c0;

import java.io.Serializable;
public final class i {
    public Serializable f3633a;
    public k f3634b;
    public l f3635c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.f3634b;
        if (kVar != null && kVar.f3638b.k(null)) {
            this.f3633a = null;
            this.f3634b = null;
            this.f3635c = null;
        }
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f3634b;
        if (kVar != null) {
            j jVar = kVar.f3638b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f3633a, 1));
            }
        }
        if (!this.d && (lVar = this.f3635c) != null) {
            lVar.k(null);
        }
    }
}
