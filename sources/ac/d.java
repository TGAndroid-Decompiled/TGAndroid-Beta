package ac;

import k2.f;
public final class d {
    public boolean f379a;
    public boolean f380b;
    public boolean f381c;

    public d() {
        this.f379a = false;
        this.f380b = false;
        this.f381c = false;
    }

    public f a() {
        if (!this.f379a && (this.f380b || this.f381c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new f(this);
    }

    public d(boolean z10, boolean z11, boolean z12) {
        this.f379a = z10;
        this.f380b = z11;
        this.f381c = z12;
    }
}
