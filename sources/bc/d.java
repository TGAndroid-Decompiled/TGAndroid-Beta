package bc;

import k2.g;
public final class d {
    public boolean f4246a;
    public boolean f4247b;
    public boolean f4248c;

    public d() {
        this.f4246a = false;
        this.f4247b = false;
        this.f4248c = false;
    }

    public g a() {
        if (!this.f4246a && (this.f4247b || this.f4248c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new g(this);
    }

    public d(boolean z10, boolean z11, boolean z12) {
        this.f4246a = z10;
        this.f4247b = z11;
        this.f4248c = z12;
    }
}
