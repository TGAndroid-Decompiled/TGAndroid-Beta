package n2;
public final class j {
    public int f21136a = 0;
    public boolean f21137b;
    public boolean f21138c;
    public boolean d;

    public k a() {
        if (!this.f21137b && (this.f21138c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new k(this);
    }
}
