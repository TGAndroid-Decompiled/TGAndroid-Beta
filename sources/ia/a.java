package ia;

import n2.f;
public final class a {
    public boolean f16271a;
    public boolean f16272b;
    public boolean f16273c;

    public a() {
        this.f16271a = false;
        this.f16272b = false;
        this.f16273c = false;
    }

    public f a() {
        if (!this.f16271a && (this.f16272b || this.f16273c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new f(this);
    }

    public a(boolean z10, boolean z11, boolean z12) {
        this.f16271a = z10;
        this.f16272b = z11;
        this.f16273c = z12;
    }
}
