package c0;
public final class i {
    public Object f5240a;
    public l f5241b;
    public m f5242c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.f5241b;
        if (lVar != null && lVar.f5245b.k(bool)) {
            this.f5240a = null;
            this.f5241b = null;
            this.f5242c = null;
        }
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f5241b;
        if (lVar != null) {
            k kVar = lVar.f5245b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f5240a, 1));
            }
        }
        if (!this.d && (mVar = this.f5242c) != null) {
            mVar.k(null);
        }
    }
}
