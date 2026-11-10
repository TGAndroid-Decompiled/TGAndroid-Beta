package ia;

import n2.f;
public final class a {
    public boolean f15412a;
    public boolean f15413b;
    public boolean f15414c;

    public a() {
        this.f15412a = false;
        this.f15413b = false;
        this.f15414c = false;
    }

    public f a() {
        if (!this.f15412a && (this.f15413b || this.f15414c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new f(this);
    }

    public a(boolean z9, boolean z10, boolean z11) {
        this.f15412a = z9;
        this.f15413b = z10;
        this.f15414c = z11;
    }
}
