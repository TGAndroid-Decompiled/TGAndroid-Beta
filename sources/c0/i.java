package c0;

import java.io.Serializable;
public final class i {
    public Serializable f2017a;
    public k f2018b;
    public l f2019c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.f2018b;
        if (kVar != null && kVar.f2022b.k(null)) {
            this.f2017a = null;
            this.f2018b = null;
            this.f2019c = null;
        }
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f2018b;
        if (kVar != null) {
            j jVar = kVar.f2022b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f2017a, 1));
            }
        }
        if (!this.d && (lVar = this.f2019c) != null) {
            lVar.k(null);
        }
    }
}
