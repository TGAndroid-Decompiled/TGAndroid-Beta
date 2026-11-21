package c0;
public final class i {
    public Object f4369a;
    public l f4370b;
    public m f4371c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.f4370b;
        if (lVar != null && lVar.f4374b.k(bool)) {
            this.f4369a = null;
            this.f4370b = null;
            this.f4371c = null;
        }
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f4370b;
        if (lVar != null) {
            k kVar = lVar.f4374b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f4369a, 1));
            }
        }
        if (!this.d && (mVar = this.f4371c) != null) {
            mVar.k(null);
        }
    }
}
