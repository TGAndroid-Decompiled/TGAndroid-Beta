package c0;
public final class i {
    public Object f5909a;
    public l f5910b;
    public m f5911c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.f5910b;
        if (lVar != null && lVar.f5914b.k(bool)) {
            this.f5909a = null;
            this.f5910b = null;
            this.f5911c = null;
        }
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f5910b;
        if (lVar != null) {
            k kVar = lVar.f5914b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f5909a, 1));
            }
        }
        if (!this.d && (mVar = this.f5911c) != null) {
            mVar.k(null);
        }
    }
}
