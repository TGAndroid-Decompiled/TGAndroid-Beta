package ac;
public final class d {
    public boolean f409a;
    public boolean f410b;
    public boolean f411c;

    public d() {
        this.f409a = false;
        this.f410b = false;
        this.f411c = false;
    }

    public k2.e a() {
        if (!this.f409a && (this.f410b || this.f411c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new k2.e(this);
    }

    public d(boolean z10, boolean z11, boolean z12) {
        this.f409a = z10;
        this.f410b = z11;
        this.f411c = z12;
    }
}
