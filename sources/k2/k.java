package k2;
public final class k {
    public int f13922a = 0;
    public boolean f13923b;
    public boolean f13924c;
    public boolean d;

    public l a() {
        if (!this.f13923b && (this.f13924c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new l(this);
    }
}
