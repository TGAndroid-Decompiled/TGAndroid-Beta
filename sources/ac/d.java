package ac;
public final class d {
    public boolean f380a;
    public boolean f381b;
    public boolean f382c;

    public d() {
        this.f380a = false;
        this.f381b = false;
        this.f382c = false;
    }

    public k2.e a() {
        if (!this.f380a && (this.f381b || this.f382c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new k2.e(this);
    }

    public d(boolean z10, boolean z11, boolean z12) {
        this.f380a = z10;
        this.f381b = z11;
        this.f382c = z12;
    }
}
