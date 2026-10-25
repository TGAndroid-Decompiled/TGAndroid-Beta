package cc;

import k2.h;
public final class d {
    public boolean f6189a;
    public boolean f6190b;
    public boolean f6191c;

    public d() {
        this.f6189a = false;
        this.f6190b = false;
        this.f6191c = false;
    }

    public h a() {
        if (!this.f6189a && (this.f6190b || this.f6191c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new h(this);
    }

    public d(boolean z10, boolean z11, boolean z12) {
        this.f6189a = z10;
        this.f6190b = z11;
        this.f6191c = z12;
    }
}
