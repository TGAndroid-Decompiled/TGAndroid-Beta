package c0;
public final class i {
    public Object f4098a;
    public l f4099b;
    public m f4100c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.f4099b;
        if (lVar != null && lVar.f4103b.k(bool)) {
            this.f4098a = null;
            this.f4099b = null;
            this.f4100c = null;
        }
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f4099b;
        if (lVar != null) {
            k kVar = lVar.f4103b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f4098a, 1));
            }
        }
        if (!this.d && (mVar = this.f4100c) != null) {
            mVar.k(null);
        }
    }
}
