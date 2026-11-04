package c0;
public final class i {
    public Object f3952a;
    public l f3953b;
    public m f3954c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.f3953b;
        if (lVar != null && lVar.f3957b.k(bool)) {
            this.f3952a = null;
            this.f3953b = null;
            this.f3954c = null;
        }
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f3953b;
        if (lVar != null) {
            k kVar = lVar.f3957b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f3952a, 1));
            }
        }
        if (!this.d && (mVar = this.f3954c) != null) {
            mVar.k(null);
        }
    }
}
