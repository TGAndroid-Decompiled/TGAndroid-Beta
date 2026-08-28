package c0;

import java.io.Serializable;
public final class i {
    public Serializable f2072a;
    public k f2073b;
    public l f2074c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.f2073b;
        if (kVar != null && kVar.f2077b.k(null)) {
            this.f2072a = null;
            this.f2073b = null;
            this.f2074c = null;
        }
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f2073b;
        if (kVar != null) {
            j jVar = kVar.f2077b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f2072a, 1));
            }
        }
        if (!this.d && (lVar = this.f2074c) != null) {
            lVar.k(null);
        }
    }
}
