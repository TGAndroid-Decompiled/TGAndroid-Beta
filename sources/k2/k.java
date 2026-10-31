package k2;
public final class k {
    public int f10690a = 0;
    public boolean f10691b;
    public boolean f10692c;
    public boolean d;

    public l a() {
        if (!this.f10691b && (this.f10692c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new l(this);
    }
}
