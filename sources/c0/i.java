package c0;
public final class i {
    public Object f3508a;
    public l f3509b;
    public m f3510c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.f3509b;
        if (lVar != null && lVar.f3513b.k(bool)) {
            this.f3508a = null;
            this.f3509b = null;
            this.f3510c = null;
        }
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f3509b;
        if (lVar != null) {
            k kVar = lVar.f3513b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f3508a, 1));
            }
        }
        if (!this.d && (mVar = this.f3510c) != null) {
            mVar.k(null);
        }
    }
}
