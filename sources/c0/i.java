package c0;
public final class i {
    public Object f5238a;
    public l f5239b;
    public m f5240c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.f5239b;
        if (lVar != null && lVar.f5243b.k(bool)) {
            this.f5238a = null;
            this.f5239b = null;
            this.f5240c = null;
        }
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f5239b;
        if (lVar != null) {
            k kVar = lVar.f5243b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f5238a, 1));
            }
        }
        if (!this.d && (mVar = this.f5240c) != null) {
            mVar.k(null);
        }
    }
}
