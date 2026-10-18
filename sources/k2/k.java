package k2;
public final class k {
    public int f14720a = 0;
    public boolean f14721b;
    public boolean f14722c;
    public boolean d;

    public l a() {
        if (!this.f14721b && (this.f14722c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new l(this);
    }
}
