package ia;

import n2.f;
public final class a {
    public boolean f16180a;
    public boolean f16181b;
    public boolean f16182c;

    public a() {
        this.f16180a = false;
        this.f16181b = false;
        this.f16182c = false;
    }

    public f a() {
        if (!this.f16180a && (this.f16181b || this.f16182c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new f(this);
    }

    public a(boolean z10, boolean z11, boolean z12) {
        this.f16180a = z10;
        this.f16181b = z11;
        this.f16182c = z12;
    }
}
