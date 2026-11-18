package c0;
public final class i {
    public Object f4343a;
    public l f4344b;
    public m f4345c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.f4344b;
        if (lVar != null && lVar.f4348b.k(bool)) {
            this.f4343a = null;
            this.f4344b = null;
            this.f4345c = null;
        }
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f4344b;
        if (lVar != null) {
            k kVar = lVar.f4348b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f4343a, 1));
            }
        }
        if (!this.d && (mVar = this.f4345c) != null) {
            mVar.k(null);
        }
    }
}
