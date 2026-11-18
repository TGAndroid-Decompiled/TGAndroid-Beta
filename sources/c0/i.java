package c0;
public final class i {
    public Object f4340a;
    public l f4341b;
    public m f4342c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.f4341b;
        if (lVar != null && lVar.f4345b.k(bool)) {
            this.f4340a = null;
            this.f4341b = null;
            this.f4342c = null;
        }
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f4341b;
        if (lVar != null) {
            k kVar = lVar.f4345b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f4340a, 1));
            }
        }
        if (!this.d && (mVar = this.f4342c) != null) {
            mVar.k(null);
        }
    }
}
