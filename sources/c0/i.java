package c0;

import java.io.Serializable;

public final class i {

    public Serializable f2211a;

    public k f2212b;

    public l f2213c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.f2212b;
        if (kVar == null || !kVar.f2216b.k(null)) {
            return;
        }
        this.f2211a = null;
        this.f2212b = null;
        this.f2213c = null;
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f2212b;
        if (kVar != null) {
            j jVar = kVar.f2216b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f2211a, 1));
            }
        }
        if (this.d || (lVar = this.f2213c) == null) {
            return;
        }
        lVar.k(null);
    }
}
