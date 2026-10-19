package c0;
public final class i {
    public Object f4471a;
    public l f4472b;
    public m f4473c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.f4472b;
        if (lVar != null && lVar.f4476b.k(bool)) {
            this.f4471a = null;
            this.f4472b = null;
            this.f4473c = null;
        }
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f4472b;
        if (lVar != null) {
            k kVar = lVar.f4476b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f4471a, 1));
            }
        }
        if (!this.d && (mVar = this.f4473c) != null) {
            mVar.k(null);
        }
    }
}
