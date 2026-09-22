package c0;

import java.io.Serializable;
public final class i {
    public Serializable f3636a;
    public k f3637b;
    public l f3638c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.f3637b;
        if (kVar != null && kVar.f3641b.k(null)) {
            this.f3636a = null;
            this.f3637b = null;
            this.f3638c = null;
        }
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f3637b;
        if (kVar != null) {
            j jVar = kVar.f3641b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f3636a, 1));
            }
        }
        if (!this.d && (lVar = this.f3638c) != null) {
            lVar.k(null);
        }
    }
}
