package c0;
public final class i {
    public Object f5243a;
    public l f5244b;
    public m f5245c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.f5244b;
        if (lVar != null && lVar.f5248b.k(bool)) {
            this.f5243a = null;
            this.f5244b = null;
            this.f5245c = null;
        }
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f5244b;
        if (lVar != null) {
            k kVar = lVar.f5248b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f5243a, 1));
            }
        }
        if (!this.d && (mVar = this.f5245c) != null) {
            mVar.k(null);
        }
    }
}
