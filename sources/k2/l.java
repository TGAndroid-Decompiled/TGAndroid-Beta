package k2;
public final class l {
    public int f16200a = 0;
    public boolean f16201b;
    public boolean f16202c;
    public boolean d;

    public m a() {
        if (!this.f16201b && (this.f16202c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new m(this);
    }
}
