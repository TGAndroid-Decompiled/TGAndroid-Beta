package m2;
public final class j {
    public int f18893a = 0;
    public boolean f18894b;
    public boolean f18895c;
    public boolean d;

    public k a() {
        if (!this.f18894b && (this.f18895c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new k(this);
    }
}
