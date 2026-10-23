package c0;
public final class i {
    public Object f4473a;
    public l f4474b;
    public m f4475c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.f4474b;
        if (lVar != null && lVar.f4478b.k(bool)) {
            this.f4473a = null;
            this.f4474b = null;
            this.f4475c = null;
        }
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f4474b;
        if (lVar != null) {
            k kVar = lVar.f4478b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f4473a, 1));
            }
        }
        if (!this.d && (mVar = this.f4475c) != null) {
            mVar.k(null);
        }
    }
}
