package n2;
public final class j {
    public int f21224a = 0;
    public boolean f21225b;
    public boolean f21226c;
    public boolean d;

    public k a() {
        if (!this.f21225b && (this.f21226c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new k(this);
    }
}
