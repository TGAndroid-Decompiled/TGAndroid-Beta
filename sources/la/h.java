package la;

import v7.j;
import x7.e0;
import z7.y;
public final class h implements ia.g {
    public final int f13942a;
    public boolean f13943b = false;
    public boolean f13944c = false;
    public ia.c d;
    public final ia.e e;

    public h(ia.e eVar, int i10) {
        this.f13942a = i10;
        this.e = eVar;
    }

    @Override
    public final ia.g b(String str) {
        switch (this.f13942a) {
            case 0:
                if (!this.f13943b) {
                    this.f13943b = true;
                    ((f) this.e).h(this.d, str, this.f13944c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f13943b) {
                    this.f13943b = true;
                    ((j) this.e).d(this.d, str, this.f13944c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f13943b) {
                    this.f13943b = true;
                    ((w7.f) this.e).d(this.d, str, this.f13944c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f13943b) {
                    this.f13943b = true;
                    ((e0) this.e).d(this.d, str, this.f13944c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f13943b) {
                    this.f13943b = true;
                    ((y) this.e).d(this.d, str, this.f13944c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final ia.g d(boolean z10) {
        switch (this.f13942a) {
            case 0:
                if (!this.f13943b) {
                    this.f13943b = true;
                    ((f) this.e).d(this.d, z10 ? 1 : 0, this.f13944c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f13943b) {
                    this.f13943b = true;
                    ((j) this.e).h(this.d, z10 ? 1 : 0, this.f13944c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f13943b) {
                    this.f13943b = true;
                    ((w7.f) this.e).h(this.d, z10 ? 1 : 0, this.f13944c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f13943b) {
                    this.f13943b = true;
                    ((e0) this.e).h(this.d, z10 ? 1 : 0, this.f13944c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f13943b) {
                    this.f13943b = true;
                    ((y) this.e).h(this.d, z10 ? 1 : 0, this.f13944c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
