package ia;

import n2.f;
public final class a {
    public boolean f16183a;
    public boolean f16184b;
    public boolean f16185c;

    public a() {
        this.f16183a = false;
        this.f16184b = false;
        this.f16185c = false;
    }

    public f a() {
        if (!this.f16183a && (this.f16184b || this.f16185c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new f(this);
    }

    public a(boolean z10, boolean z11, boolean z12) {
        this.f16183a = z10;
        this.f16184b = z11;
        this.f16185c = z12;
    }
}
