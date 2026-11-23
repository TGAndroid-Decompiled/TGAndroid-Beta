package ia;

import n2.f;
public final class a {
    public boolean f16208a;
    public boolean f16209b;
    public boolean f16210c;

    public a() {
        this.f16208a = false;
        this.f16209b = false;
        this.f16210c = false;
    }

    public f a() {
        if (!this.f16208a && (this.f16209b || this.f16210c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new f(this);
    }

    public a(boolean z10, boolean z11, boolean z12) {
        this.f16208a = z10;
        this.f16209b = z11;
        this.f16210c = z12;
    }
}
