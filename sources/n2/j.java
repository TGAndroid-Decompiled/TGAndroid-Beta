package n2;
public final class j {
    public int f21167a = 0;
    public boolean f21168b;
    public boolean f21169c;
    public boolean d;

    public k a() {
        if (!this.f21168b && (this.f21169c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new k(this);
    }
}
