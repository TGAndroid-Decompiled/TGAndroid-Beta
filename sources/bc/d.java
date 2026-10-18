package bc;

import k2.g;
public final class d {
    public boolean f4250a;
    public boolean f4251b;
    public boolean f4252c;

    public d() {
        this.f4250a = false;
        this.f4251b = false;
        this.f4252c = false;
    }

    public g a() {
        if (!this.f4250a && (this.f4251b || this.f4252c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new g(this);
    }

    public d(boolean z10, boolean z11, boolean z12) {
        this.f4250a = z10;
        this.f4251b = z11;
        this.f4252c = z12;
    }
}
