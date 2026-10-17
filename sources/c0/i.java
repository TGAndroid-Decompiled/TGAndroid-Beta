package c0;
public final class i {
    public Object f4472a;
    public l f4473b;
    public m f4474c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.f4473b;
        if (lVar != null && lVar.f4477b.k(bool)) {
            this.f4472a = null;
            this.f4473b = null;
            this.f4474c = null;
        }
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f4473b;
        if (lVar != null) {
            k kVar = lVar.f4477b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f4472a, 1));
            }
        }
        if (!this.d && (mVar = this.f4474c) != null) {
            mVar.k(null);
        }
    }
}
