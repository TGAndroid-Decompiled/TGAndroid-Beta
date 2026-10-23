package k2;
public final class l {
    public int f14772a = 0;
    public boolean f14773b;
    public boolean f14774c;
    public boolean d;

    public m a() {
        if (!this.f14773b && (this.f14774c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new m(this);
    }
}
