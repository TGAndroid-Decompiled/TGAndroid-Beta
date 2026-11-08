package ia;

import n2.f;
public final class a {
    public boolean f15410a;
    public boolean f15411b;
    public boolean f15412c;

    public a() {
        this.f15410a = false;
        this.f15411b = false;
        this.f15412c = false;
    }

    public f a() {
        if (!this.f15410a && (this.f15411b || this.f15412c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new f(this);
    }

    public a(boolean z9, boolean z10, boolean z11) {
        this.f15410a = z9;
        this.f15411b = z10;
        this.f15412c = z11;
    }
}
