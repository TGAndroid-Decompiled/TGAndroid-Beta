package ia;

import n2.f;
public final class a {
    public boolean f16174a;
    public boolean f16175b;
    public boolean f16176c;

    public a() {
        this.f16174a = false;
        this.f16175b = false;
        this.f16176c = false;
    }

    public f a() {
        if (!this.f16174a && (this.f16175b || this.f16176c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new f(this);
    }

    public a(boolean z10, boolean z11, boolean z12) {
        this.f16174a = z10;
        this.f16175b = z11;
        this.f16176c = z12;
    }
}
