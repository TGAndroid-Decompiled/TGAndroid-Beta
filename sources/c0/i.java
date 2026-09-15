package c0;

import java.io.Serializable;
public final class i {
    public Serializable f3634a;
    public k f3635b;
    public l f3636c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.f3635b;
        if (kVar != null && kVar.f3639b.k(null)) {
            this.f3634a = null;
            this.f3635b = null;
            this.f3636c = null;
        }
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f3635b;
        if (kVar != null) {
            j jVar = kVar.f3639b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f3634a, 1));
            }
        }
        if (!this.d && (lVar = this.f3636c) != null) {
            lVar.k(null);
        }
    }
}
