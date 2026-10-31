package ea;

import k2.g;
public final class b {
    public boolean f6459a;
    public boolean f6460b;
    public boolean f6461c;

    public b() {
        this.f6459a = false;
        this.f6460b = false;
        this.f6461c = false;
    }

    public g a() {
        if (!this.f6459a && (this.f6460b || this.f6461c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new g(this);
    }

    public b(boolean z10, boolean z11, boolean z12) {
        this.f6459a = z10;
        this.f6460b = z11;
        this.f6461c = z12;
    }
}
