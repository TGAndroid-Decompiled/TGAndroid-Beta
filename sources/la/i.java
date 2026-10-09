package la;

import v7.j;
import x7.e0;
import z7.y;
public final class i implements ia.g {
    public final int f15464a;
    public boolean f15465b = false;
    public boolean f15466c = false;
    public ia.c d;
    public final ia.e f15467e;

    public i(ia.e eVar, int i10) {
        this.f15464a = i10;
        this.f15467e = eVar;
    }

    @Override
    public final ia.g b(String str) {
        switch (this.f15464a) {
            case 0:
                if (!this.f15465b) {
                    this.f15465b = true;
                    ((f) this.f15467e).h(this.d, str, this.f15466c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f15465b) {
                    this.f15465b = true;
                    ((j) this.f15467e).d(this.d, str, this.f15466c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f15465b) {
                    this.f15465b = true;
                    ((w7.f) this.f15467e).d(this.d, str, this.f15466c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f15465b) {
                    this.f15465b = true;
                    ((e0) this.f15467e).d(this.d, str, this.f15466c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f15465b) {
                    this.f15465b = true;
                    ((y) this.f15467e).d(this.d, str, this.f15466c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final ia.g d(boolean z10) {
        switch (this.f15464a) {
            case 0:
                if (!this.f15465b) {
                    this.f15465b = true;
                    ((f) this.f15467e).d(this.d, z10 ? 1 : 0, this.f15466c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f15465b) {
                    this.f15465b = true;
                    ((j) this.f15467e).h(this.d, z10 ? 1 : 0, this.f15466c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f15465b) {
                    this.f15465b = true;
                    ((w7.f) this.f15467e).h(this.d, z10 ? 1 : 0, this.f15466c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f15465b) {
                    this.f15465b = true;
                    ((e0) this.f15467e).h(this.d, z10 ? 1 : 0, this.f15466c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f15465b) {
                    this.f15465b = true;
                    ((y) this.f15467e).h(this.d, z10 ? 1 : 0, this.f15466c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
