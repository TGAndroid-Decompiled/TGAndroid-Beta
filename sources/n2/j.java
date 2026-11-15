package n2;
public final class j {
    public int f20775a = 0;
    public boolean f20776b;
    public boolean f20777c;
    public boolean d;

    public k a() {
        if (!this.f20776b && (this.f20777c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new k(this);
    }
}
