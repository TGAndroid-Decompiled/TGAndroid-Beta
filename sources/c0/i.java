package c0;
public final class i {
    public Object f4469a;
    public l f4470b;
    public m f4471c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.f4470b;
        if (lVar != null && lVar.f4474b.k(bool)) {
            this.f4469a = null;
            this.f4470b = null;
            this.f4471c = null;
        }
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f4470b;
        if (lVar != null) {
            k kVar = lVar.f4474b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f4469a, 1));
            }
        }
        if (!this.d && (mVar = this.f4471c) != null) {
            mVar.k(null);
        }
    }
}
