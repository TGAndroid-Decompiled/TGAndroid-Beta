package bc;

import k2.g;
public final class d {
    public boolean f4248a;
    public boolean f4249b;
    public boolean f4250c;

    public d() {
        this.f4248a = false;
        this.f4249b = false;
        this.f4250c = false;
    }

    public g a() {
        if (!this.f4248a && (this.f4249b || this.f4250c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new g(this);
    }

    public d(boolean z10, boolean z11, boolean z12) {
        this.f4248a = z10;
        this.f4249b = z11;
        this.f4250c = z12;
    }
}
