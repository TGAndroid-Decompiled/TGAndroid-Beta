package n2;
public final class j {
    public int f20228a = 0;
    public boolean f20229b;
    public boolean f20230c;
    public boolean d;

    public k a() {
        if (!this.f20229b && (this.f20230c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new k(this);
    }
}
