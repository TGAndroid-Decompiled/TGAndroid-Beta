package la;

import v7.j;
import x7.e0;
import z7.y;
public final class h implements ia.g {
    public final int f15333a;
    public boolean f15334b = false;
    public boolean f15335c = false;
    public ia.c d;
    public final ia.e f15336e;

    public h(ia.e eVar, int i10) {
        this.f15333a = i10;
        this.f15336e = eVar;
    }

    @Override
    public final ia.g b(String str) {
        switch (this.f15333a) {
            case 0:
                if (!this.f15334b) {
                    this.f15334b = true;
                    ((f) this.f15336e).h(this.d, str, this.f15335c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f15334b) {
                    this.f15334b = true;
                    ((j) this.f15336e).d(this.d, str, this.f15335c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f15334b) {
                    this.f15334b = true;
                    ((w7.f) this.f15336e).d(this.d, str, this.f15335c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f15334b) {
                    this.f15334b = true;
                    ((e0) this.f15336e).d(this.d, str, this.f15335c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f15334b) {
                    this.f15334b = true;
                    ((y) this.f15336e).d(this.d, str, this.f15335c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final ia.g d(boolean z10) {
        switch (this.f15333a) {
            case 0:
                if (!this.f15334b) {
                    this.f15334b = true;
                    ((f) this.f15336e).d(this.d, z10 ? 1 : 0, this.f15335c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f15334b) {
                    this.f15334b = true;
                    ((j) this.f15336e).h(this.d, z10 ? 1 : 0, this.f15335c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f15334b) {
                    this.f15334b = true;
                    ((w7.f) this.f15336e).h(this.d, z10 ? 1 : 0, this.f15335c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f15334b) {
                    this.f15334b = true;
                    ((e0) this.f15336e).h(this.d, z10 ? 1 : 0, this.f15335c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f15334b) {
                    this.f15334b = true;
                    ((y) this.f15336e).h(this.d, z10 ? 1 : 0, this.f15335c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
