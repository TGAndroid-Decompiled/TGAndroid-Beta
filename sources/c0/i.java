package c0;

import java.io.Serializable;
public final class i {
    public Serializable f1856a;
    public k f1857b;
    public l f1858c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.f1857b;
        if (kVar != null && kVar.f1861b.k(null)) {
            this.f1856a = null;
            this.f1857b = null;
            this.f1858c = null;
        }
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f1857b;
        if (kVar != null) {
            j jVar = kVar.f1861b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f1856a, 1));
            }
        }
        if (!this.d && (lVar = this.f1858c) != null) {
            lVar.k(null);
        }
    }
}
