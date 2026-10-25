package k2;
public final class l {
    public int f16201a = 0;
    public boolean f16202b;
    public boolean f16203c;
    public boolean d;

    public m a() {
        if (!this.f16202b && (this.f16203c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new m(this);
    }
}
