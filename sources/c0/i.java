package c0;

import java.io.Serializable;
public final class i {
    public Serializable f3926a;
    public k f3927b;
    public l f3928c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.f3927b;
        if (kVar != null && kVar.f3931b.k(null)) {
            this.f3926a = null;
            this.f3927b = null;
            this.f3928c = null;
        }
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f3927b;
        if (kVar != null) {
            j jVar = kVar.f3931b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f3926a, 1));
            }
        }
        if (!this.d && (lVar = this.f3928c) != null) {
            lVar.k(null);
        }
    }
}
