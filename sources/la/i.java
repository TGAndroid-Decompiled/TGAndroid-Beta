package la;

import v7.j;
import x7.e0;
import z7.y;
public final class i implements ia.g {
    public final int f15468a;
    public boolean f15469b = false;
    public boolean f15470c = false;
    public ia.c d;
    public final ia.e f15471e;

    public i(ia.e eVar, int i10) {
        this.f15468a = i10;
        this.f15471e = eVar;
    }

    @Override
    public final ia.g b(String str) {
        switch (this.f15468a) {
            case 0:
                if (!this.f15469b) {
                    this.f15469b = true;
                    ((f) this.f15471e).h(this.d, str, this.f15470c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f15469b) {
                    this.f15469b = true;
                    ((j) this.f15471e).d(this.d, str, this.f15470c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f15469b) {
                    this.f15469b = true;
                    ((w7.f) this.f15471e).d(this.d, str, this.f15470c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f15469b) {
                    this.f15469b = true;
                    ((e0) this.f15471e).d(this.d, str, this.f15470c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f15469b) {
                    this.f15469b = true;
                    ((y) this.f15471e).d(this.d, str, this.f15470c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final ia.g d(boolean z10) {
        switch (this.f15468a) {
            case 0:
                if (!this.f15469b) {
                    this.f15469b = true;
                    ((f) this.f15471e).d(this.d, z10 ? 1 : 0, this.f15470c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f15469b) {
                    this.f15469b = true;
                    ((j) this.f15471e).h(this.d, z10 ? 1 : 0, this.f15470c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f15469b) {
                    this.f15469b = true;
                    ((w7.f) this.f15471e).h(this.d, z10 ? 1 : 0, this.f15470c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f15469b) {
                    this.f15469b = true;
                    ((e0) this.f15471e).h(this.d, z10 ? 1 : 0, this.f15470c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f15469b) {
                    this.f15469b = true;
                    ((y) this.f15471e).h(this.d, z10 ? 1 : 0, this.f15470c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
