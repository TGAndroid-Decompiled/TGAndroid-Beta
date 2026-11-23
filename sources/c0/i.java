package c0;
public final class i {
    public Object f4372a;
    public l f4373b;
    public m f4374c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.f4373b;
        if (lVar != null && lVar.f4377b.k(bool)) {
            this.f4372a = null;
            this.f4373b = null;
            this.f4374c = null;
        }
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f4373b;
        if (lVar != null) {
            k kVar = lVar.f4377b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f4372a, 1));
            }
        }
        if (!this.d && (mVar = this.f4374c) != null) {
            mVar.k(null);
        }
    }
}
