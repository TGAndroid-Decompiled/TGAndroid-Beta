package ha;

import m2.f;
public final class a {
    public boolean f14364a;
    public boolean f14365b;
    public boolean f14366c;

    public a() {
        this.f14364a = false;
        this.f14365b = false;
        this.f14366c = false;
    }

    public f a() {
        if (!this.f14364a && (this.f14365b || this.f14366c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new f(this);
    }

    public a(boolean z10, boolean z11, boolean z12) {
        this.f14364a = z10;
        this.f14365b = z11;
        this.f14366c = z12;
    }
}
