package c0;
public final class i {
    public Object f4335a;
    public l f4336b;
    public m f4337c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.f4336b;
        if (lVar != null && lVar.f4340b.k(bool)) {
            this.f4335a = null;
            this.f4336b = null;
            this.f4337c = null;
        }
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f4336b;
        if (lVar != null) {
            k kVar = lVar.f4340b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f4335a, 1));
            }
        }
        if (!this.d && (mVar = this.f4337c) != null) {
            mVar.k(null);
        }
    }
}
