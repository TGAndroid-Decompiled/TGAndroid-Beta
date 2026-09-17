package c0;

import java.io.Serializable;
public final class i {
    public Serializable f3639a;
    public k f3640b;
    public l f3641c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.f3640b;
        if (kVar != null && kVar.f3644b.k(null)) {
            this.f3639a = null;
            this.f3640b = null;
            this.f3641c = null;
        }
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f3640b;
        if (kVar != null) {
            j jVar = kVar.f3644b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f3639a, 1));
            }
        }
        if (!this.d && (lVar = this.f3641c) != null) {
            lVar.k(null);
        }
    }
}
