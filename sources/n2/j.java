package n2;
public final class j {
    public int f21164a = 0;
    public boolean f21165b;
    public boolean f21166c;
    public boolean d;

    public k a() {
        if (!this.f21165b && (this.f21166c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new k(this);
    }
}
