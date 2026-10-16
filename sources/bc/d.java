package bc;

import k2.g;
public final class d {
    public boolean f2637a;
    public boolean f2638b;
    public boolean f2639c;

    public d() {
        this.f2637a = false;
        this.f2638b = false;
        this.f2639c = false;
    }

    public g a() {
        if (!this.f2637a && (this.f2638b || this.f2639c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new g(this);
    }

    public d(boolean z10, boolean z11, boolean z12) {
        this.f2637a = z10;
        this.f2638b = z11;
        this.f2639c = z12;
    }
}
