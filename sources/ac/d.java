package ac;
public final class d {
    public boolean f382a;
    public boolean f383b;
    public boolean f384c;

    public d() {
        this.f382a = false;
        this.f383b = false;
        this.f384c = false;
    }

    public k2.e a() {
        if (!this.f382a && (this.f383b || this.f384c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new k2.e(this);
    }

    public d(boolean z10, boolean z11, boolean z12) {
        this.f382a = z10;
        this.f383b = z11;
        this.f384c = z12;
    }
}
