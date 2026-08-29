package c0;

import java.io.Serializable;
public final class i {
    public Serializable f2741a;
    public k f2742b;
    public l f2743c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.f2742b;
        if (kVar != null && kVar.f2746b.k(null)) {
            this.f2741a = null;
            this.f2742b = null;
            this.f2743c = null;
        }
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f2742b;
        if (kVar != null) {
            j jVar = kVar.f2746b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f2741a, 1));
            }
        }
        if (!this.d && (lVar = this.f2743c) != null) {
            lVar.k(null);
        }
    }
}
