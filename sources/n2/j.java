package n2;
public final class j {
    public int f20220a = 0;
    public boolean f20221b;
    public boolean f20222c;
    public boolean d;

    public k a() {
        if (!this.f20221b && (this.f20222c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new k(this);
    }
}
