package c0;
public final class i {
    public Object f4062a;
    public l f4063b;
    public m f4064c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.f4063b;
        if (lVar != null && lVar.f4067b.k(bool)) {
            this.f4062a = null;
            this.f4063b = null;
            this.f4064c = null;
        }
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f4063b;
        if (lVar != null) {
            k kVar = lVar.f4067b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f4062a, 1));
            }
        }
        if (!this.d && (mVar = this.f4064c) != null) {
            mVar.k(null);
        }
    }
}
