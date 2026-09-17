package c0;

import java.io.Serializable;
public final class i {
    public Serializable f4147a;
    public k f4148b;
    public l f4149c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.f4148b;
        if (kVar != null && kVar.f4152b.k(null)) {
            this.f4147a = null;
            this.f4148b = null;
            this.f4149c = null;
        }
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f4148b;
        if (kVar != null) {
            j jVar = kVar.f4152b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f4147a, 1));
            }
        }
        if (!this.d && (lVar = this.f4149c) != null) {
            lVar.k(null);
        }
    }
}
