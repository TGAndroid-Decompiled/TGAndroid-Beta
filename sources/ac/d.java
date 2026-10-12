package ac;
public final class d {
    public boolean f411a;
    public boolean f412b;
    public boolean f413c;

    public d() {
        this.f411a = false;
        this.f412b = false;
        this.f413c = false;
    }

    public k2.e a() {
        if (!this.f411a && (this.f412b || this.f413c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new k2.e(this);
    }

    public d(boolean z10, boolean z11, boolean z12) {
        this.f411a = z10;
        this.f412b = z11;
        this.f413c = z12;
    }
}
