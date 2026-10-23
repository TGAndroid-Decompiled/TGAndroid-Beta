package bc;

import k2.h;
public final class d {
    public boolean f4253a;
    public boolean f4254b;
    public boolean f4255c;

    public d() {
        this.f4253a = false;
        this.f4254b = false;
        this.f4255c = false;
    }

    public h a() {
        if (!this.f4253a && (this.f4254b || this.f4255c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new h(this);
    }

    public d(boolean z10, boolean z11, boolean z12) {
        this.f4253a = z10;
        this.f4254b = z11;
        this.f4255c = z12;
    }
}
