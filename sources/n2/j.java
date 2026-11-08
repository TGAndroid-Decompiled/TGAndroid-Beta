package n2;
public final class j {
    public int f20223a = 0;
    public boolean f20224b;
    public boolean f20225c;
    public boolean d;

    public k a() {
        if (!this.f20224b && (this.f20225c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new k(this);
    }
}
