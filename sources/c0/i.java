package c0;
public final class i {
    public Object f4102a;
    public l f4103b;
    public m f4104c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.f4103b;
        if (lVar != null && lVar.f4107b.k(bool)) {
            this.f4102a = null;
            this.f4103b = null;
            this.f4104c = null;
        }
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f4103b;
        if (lVar != null) {
            k kVar = lVar.f4107b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f4102a, 1));
            }
        }
        if (!this.d && (mVar = this.f4104c) != null) {
            mVar.k(null);
        }
    }
}
