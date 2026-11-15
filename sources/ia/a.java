package ia;
public final class a {
    public boolean f15865a;
    public boolean f15866b;
    public boolean f15867c;

    public a() {
        this.f15865a = false;
        this.f15866b = false;
        this.f15867c = false;
    }

    public n2.f a() {
        if (!this.f15865a && (this.f15866b || this.f15867c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new n2.f(this);
    }

    public a(boolean z10, boolean z11, boolean z12) {
        this.f15865a = z10;
        this.f15866b = z11;
        this.f15867c = z12;
    }
}
