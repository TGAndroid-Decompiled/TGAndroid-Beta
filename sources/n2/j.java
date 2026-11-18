package n2;
public final class j {
    public int f21139a = 0;
    public boolean f21140b;
    public boolean f21141c;
    public boolean d;

    public k a() {
        if (!this.f21140b && (this.f21141c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new k(this);
    }
}
