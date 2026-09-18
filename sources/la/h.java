package la;

import v7.j;
import x7.e0;
import z7.y;
public final class h implements ia.g {
    public final int f13954a;
    public boolean f13955b = false;
    public boolean f13956c = false;
    public ia.c d;
    public final ia.e e;

    public h(ia.e eVar, int i10) {
        this.f13954a = i10;
        this.e = eVar;
    }

    @Override
    public final ia.g b(String str) {
        switch (this.f13954a) {
            case 0:
                if (!this.f13955b) {
                    this.f13955b = true;
                    ((f) this.e).h(this.d, str, this.f13956c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f13955b) {
                    this.f13955b = true;
                    ((j) this.e).d(this.d, str, this.f13956c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f13955b) {
                    this.f13955b = true;
                    ((w7.f) this.e).d(this.d, str, this.f13956c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f13955b) {
                    this.f13955b = true;
                    ((e0) this.e).d(this.d, str, this.f13956c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f13955b) {
                    this.f13955b = true;
                    ((y) this.e).d(this.d, str, this.f13956c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final ia.g d(boolean z10) {
        switch (this.f13954a) {
            case 0:
                if (!this.f13955b) {
                    this.f13955b = true;
                    ((f) this.e).d(this.d, z10 ? 1 : 0, this.f13956c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f13955b) {
                    this.f13955b = true;
                    ((j) this.e).h(this.d, z10 ? 1 : 0, this.f13956c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f13955b) {
                    this.f13955b = true;
                    ((w7.f) this.e).h(this.d, z10 ? 1 : 0, this.f13956c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f13955b) {
                    this.f13955b = true;
                    ((e0) this.e).h(this.d, z10 ? 1 : 0, this.f13956c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f13955b) {
                    this.f13955b = true;
                    ((y) this.e).h(this.d, z10 ? 1 : 0, this.f13956c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
