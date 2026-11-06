package ia;

import n2.f;
public final class a {
    public boolean f15407a;
    public boolean f15408b;
    public boolean f15409c;

    public a() {
        this.f15407a = false;
        this.f15408b = false;
        this.f15409c = false;
    }

    public f a() {
        if (!this.f15407a && (this.f15408b || this.f15409c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new f(this);
    }

    public a(boolean z9, boolean z10, boolean z11) {
        this.f15407a = z9;
        this.f15408b = z10;
        this.f15409c = z11;
    }
}
