package la;

import v7.j;
import x7.e0;
import z7.y;
public final class i implements ia.g {
    public final int f15467a;
    public boolean f15468b = false;
    public boolean f15469c = false;
    public ia.c d;
    public final ia.e f15470e;

    public i(ia.e eVar, int i10) {
        this.f15467a = i10;
        this.f15470e = eVar;
    }

    @Override
    public final ia.g b(String str) {
        switch (this.f15467a) {
            case 0:
                if (!this.f15468b) {
                    this.f15468b = true;
                    ((f) this.f15470e).h(this.d, str, this.f15469c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f15468b) {
                    this.f15468b = true;
                    ((j) this.f15470e).d(this.d, str, this.f15469c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f15468b) {
                    this.f15468b = true;
                    ((w7.f) this.f15470e).d(this.d, str, this.f15469c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f15468b) {
                    this.f15468b = true;
                    ((e0) this.f15470e).d(this.d, str, this.f15469c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f15468b) {
                    this.f15468b = true;
                    ((y) this.f15470e).d(this.d, str, this.f15469c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final ia.g d(boolean z10) {
        switch (this.f15467a) {
            case 0:
                if (!this.f15468b) {
                    this.f15468b = true;
                    ((f) this.f15470e).d(this.d, z10 ? 1 : 0, this.f15469c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f15468b) {
                    this.f15468b = true;
                    ((j) this.f15470e).h(this.d, z10 ? 1 : 0, this.f15469c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f15468b) {
                    this.f15468b = true;
                    ((w7.f) this.f15470e).h(this.d, z10 ? 1 : 0, this.f15469c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f15468b) {
                    this.f15468b = true;
                    ((e0) this.f15470e).h(this.d, z10 ? 1 : 0, this.f15469c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f15468b) {
                    this.f15468b = true;
                    ((y) this.f15470e).h(this.d, z10 ? 1 : 0, this.f15469c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
