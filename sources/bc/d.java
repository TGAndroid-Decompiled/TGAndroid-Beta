package bc;

import k2.g;
public final class d {
    public boolean f4249a;
    public boolean f4250b;
    public boolean f4251c;

    public d() {
        this.f4249a = false;
        this.f4250b = false;
        this.f4251c = false;
    }

    public g a() {
        if (!this.f4249a && (this.f4250b || this.f4251c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new g(this);
    }

    public d(boolean z10, boolean z11, boolean z12) {
        this.f4249a = z10;
        this.f4250b = z11;
        this.f4251c = z12;
    }
}
