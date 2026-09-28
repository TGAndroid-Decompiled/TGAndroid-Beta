package c0;

import java.io.Serializable;
public final class i {
    public Serializable f3631a;
    public k f3632b;
    public l f3633c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.f3632b;
        if (kVar != null && kVar.f3636b.k(null)) {
            this.f3631a = null;
            this.f3632b = null;
            this.f3633c = null;
        }
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f3632b;
        if (kVar != null) {
            j jVar = kVar.f3636b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f3631a, 1));
            }
        }
        if (!this.d && (lVar = this.f3633c) != null) {
            lVar.k(null);
        }
    }
}
