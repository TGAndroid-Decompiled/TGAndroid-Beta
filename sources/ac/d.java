package ac;
public final class d {
    public boolean f378a;
    public boolean f379b;
    public boolean f380c;

    public d() {
        this.f378a = false;
        this.f379b = false;
        this.f380c = false;
    }

    public k2.e a() {
        if (!this.f378a && (this.f379b || this.f380c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new k2.e(this);
    }

    public d(boolean z10, boolean z11, boolean z12) {
        this.f378a = z10;
        this.f379b = z11;
        this.f380c = z12;
    }
}
