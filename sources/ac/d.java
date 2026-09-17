package ac;
public final class d {
    public boolean f408a;
    public boolean f409b;
    public boolean f410c;

    public d() {
        this.f408a = false;
        this.f409b = false;
        this.f410c = false;
    }

    public k2.e a() {
        if (!this.f408a && (this.f409b || this.f410c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new k2.e(this);
    }

    public d(boolean z10, boolean z11, boolean z12) {
        this.f408a = z10;
        this.f409b = z11;
        this.f410c = z12;
    }
}
