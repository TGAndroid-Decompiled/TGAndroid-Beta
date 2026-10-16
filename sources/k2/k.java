package k2;
public final class k {
    public int f13925a = 0;
    public boolean f13926b;
    public boolean f13927c;
    public boolean d;

    public l a() {
        if (!this.f13926b && (this.f13927c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new l(this);
    }
}
