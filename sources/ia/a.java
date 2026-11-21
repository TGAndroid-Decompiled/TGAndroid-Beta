package ia;

import n2.f;
public final class a {
    public boolean f16205a;
    public boolean f16206b;
    public boolean f16207c;

    public a() {
        this.f16205a = false;
        this.f16206b = false;
        this.f16207c = false;
    }

    public f a() {
        if (!this.f16205a && (this.f16206b || this.f16207c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new f(this);
    }

    public a(boolean z10, boolean z11, boolean z12) {
        this.f16205a = z10;
        this.f16206b = z11;
        this.f16207c = z12;
    }
}
