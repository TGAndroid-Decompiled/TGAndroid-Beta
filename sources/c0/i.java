package c0;

import java.io.Serializable;
public final class i {
    public Serializable f3925a;
    public k f3926b;
    public l f3927c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.f3926b;
        if (kVar != null && kVar.f3930b.k(null)) {
            this.f3925a = null;
            this.f3926b = null;
            this.f3927c = null;
        }
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f3926b;
        if (kVar != null) {
            j jVar = kVar.f3930b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f3925a, 1));
            }
        }
        if (!this.d && (lVar = this.f3927c) != null) {
            lVar.k(null);
        }
    }
}
