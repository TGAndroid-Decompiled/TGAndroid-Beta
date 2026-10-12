package bc;

import k2.g;
public final class d {
    public boolean f2633a;
    public boolean f2634b;
    public boolean f2635c;

    public d() {
        this.f2633a = false;
        this.f2634b = false;
        this.f2635c = false;
    }

    public g a() {
        if (!this.f2633a && (this.f2634b || this.f2635c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new g(this);
    }

    public d(boolean z10, boolean z11, boolean z12) {
        this.f2633a = z10;
        this.f2634b = z11;
        this.f2635c = z12;
    }
}
