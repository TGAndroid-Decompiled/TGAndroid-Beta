package k2;
public final class k {
    public int f14713a = 0;
    public boolean f14714b;
    public boolean f14715c;
    public boolean d;

    public l a() {
        if (!this.f14714b && (this.f14715c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new l(this);
    }
}
