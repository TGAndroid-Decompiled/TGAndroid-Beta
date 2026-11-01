package k2;
public final class k {
    public int f10691a = 0;
    public boolean f10692b;
    public boolean f10693c;
    public boolean d;

    public l a() {
        if (!this.f10692b && (this.f10693c || this.d)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        }
        return new l(this);
    }
}
