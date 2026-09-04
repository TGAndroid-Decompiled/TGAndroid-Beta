package ac;
public final class d {
    public boolean f396a;
    public boolean f397b;
    public boolean f398c;

    public d() {
        this.f396a = false;
        this.f397b = false;
        this.f398c = false;
    }

    public k2.e a() {
        if (!this.f396a && (this.f397b || this.f398c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new k2.e(this);
    }

    public d(boolean z10, boolean z11, boolean z12) {
        this.f396a = z10;
        this.f397b = z11;
        this.f398c = z12;
    }
}
