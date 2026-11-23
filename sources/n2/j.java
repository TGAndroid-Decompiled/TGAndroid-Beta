package n2;
public final class j {
    public int f21133a = 0;
    public boolean f21134b;
    public boolean f21135c;
    public boolean d;

    public k a() {
        if (!this.f21134b && (this.f21135c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new k(this);
    }
}
