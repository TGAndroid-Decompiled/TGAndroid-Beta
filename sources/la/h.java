package la;

import v7.j;
import x7.e0;
import z7.y;
public final class h implements ia.g {
    public final int f15360a;
    public boolean f15361b = false;
    public boolean f15362c = false;
    public ia.c d;
    public final ia.e f15363e;

    public h(ia.e eVar, int i10) {
        this.f15360a = i10;
        this.f15363e = eVar;
    }

    @Override
    public final ia.g b(String str) {
        switch (this.f15360a) {
            case 0:
                if (!this.f15361b) {
                    this.f15361b = true;
                    ((f) this.f15363e).h(this.d, str, this.f15362c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f15361b) {
                    this.f15361b = true;
                    ((j) this.f15363e).d(this.d, str, this.f15362c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f15361b) {
                    this.f15361b = true;
                    ((w7.f) this.f15363e).d(this.d, str, this.f15362c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f15361b) {
                    this.f15361b = true;
                    ((e0) this.f15363e).d(this.d, str, this.f15362c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f15361b) {
                    this.f15361b = true;
                    ((y) this.f15363e).d(this.d, str, this.f15362c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final ia.g d(boolean z10) {
        switch (this.f15360a) {
            case 0:
                if (!this.f15361b) {
                    this.f15361b = true;
                    ((f) this.f15363e).d(this.d, z10 ? 1 : 0, this.f15362c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f15361b) {
                    this.f15361b = true;
                    ((j) this.f15363e).h(this.d, z10 ? 1 : 0, this.f15362c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f15361b) {
                    this.f15361b = true;
                    ((w7.f) this.f15363e).h(this.d, z10 ? 1 : 0, this.f15362c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f15361b) {
                    this.f15361b = true;
                    ((e0) this.f15363e).h(this.d, z10 ? 1 : 0, this.f15362c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f15361b) {
                    this.f15361b = true;
                    ((y) this.f15363e).h(this.d, z10 ? 1 : 0, this.f15362c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
