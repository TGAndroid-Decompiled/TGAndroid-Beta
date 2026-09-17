package c0;

import java.io.Serializable;
public final class i {
    public Serializable f4120a;
    public k f4121b;
    public l f4122c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.f4121b;
        if (kVar != null && kVar.f4125b.k(null)) {
            this.f4120a = null;
            this.f4121b = null;
            this.f4122c = null;
        }
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f4121b;
        if (kVar != null) {
            j jVar = kVar.f4125b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f4120a, 1));
            }
        }
        if (!this.d && (lVar = this.f4122c) != null) {
            lVar.k(null);
        }
    }
}
