package c0;
public final class i {
    public Object f4059a;
    public l f4060b;
    public m f4061c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.f4060b;
        if (lVar != null && lVar.f4064b.k(bool)) {
            this.f4059a = null;
            this.f4060b = null;
            this.f4061c = null;
        }
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f4060b;
        if (lVar != null) {
            k kVar = lVar.f4064b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f4059a, 1));
            }
        }
        if (!this.d && (mVar = this.f4061c) != null) {
            mVar.k(null);
        }
    }
}
