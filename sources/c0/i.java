package c0;

import java.io.Serializable;
public final class i {
    public Serializable f1878a;
    public k f1879b;
    public l f1880c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.f1879b;
        if (kVar != null && kVar.f1883b.k(null)) {
            this.f1878a = null;
            this.f1879b = null;
            this.f1880c = null;
        }
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f1879b;
        if (kVar != null) {
            j jVar = kVar.f1883b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f1878a, 1));
            }
        }
        if (!this.d && (lVar = this.f1880c) != null) {
            lVar.k(null);
        }
    }
}
